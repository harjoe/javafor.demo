package com.javafor.ehcache.demo;

import java.io.InputStream;
import java.util.List;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;
import net.sf.ehcache.config.CacheConfiguration;
import net.sf.ehcache.search.Attribute;
import net.sf.ehcache.search.Query;
import net.sf.ehcache.search.Result;
import net.sf.ehcache.search.Results;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 *
 * @author Harjoe; if you have any questions, please contact me with my blog or
 *         email, thanks.<br>
 *         blog: <a href="http://www.javafor.com">www.javafor.com</a><br>
 *         github: <a href="https://github.com/harjoe">www.github.com/harjoe</a><br>
 *         email: <a href="harjoe@hotmail.com">harjoe@hotmail.com</a><br>
 **/
public class EhcacheTest {

	/**
	 * add element into cache
	 */
	@Test
	public void testAddElementToCache() {
		// load cache from xml; "data-cache" is defined in xml.
		InputStream in = EhcacheTest.class.getClassLoader().getResourceAsStream("ehcache.xml");
		CacheManager cm = CacheManager.create(in);
		Cache cache = cm.getCache("data-cache");
		// create two persons.
		Person p1 = new Person(1, "Jack", 21);
		Person p2 = new Person(2, "Mike", 73);
		// put
		cache.put(new Element(p1.getId(), p1, 1));
		cache.put(new Element(p2.getId(), p2, 1));
		// cache.put(new Element(p2, p2, 1));
		// get.
		Element e = cache.get(p2.getId());
		Person person = (Person) e.getObjectValue();
		System.out.println(person.getName());
		cache.flush();
	}

	/**
	 * read from cache
	 */
	public void readElementFromCache() {
		// load cache from xml; "data-cache" is defined in xml.
		InputStream in = EhcacheTest.class.getClassLoader().getResourceAsStream("ehcache.xml");
		CacheManager cm = CacheManager.create(in);
		Cache cache = cm.getCache("data-cache");
		//
		Element e = cache.get(2);
		if (e != null) {
			Person person = (Person) e.getObjectValue();
			System.out.println(person.getName());
		}
		Assert.assertNotNull(e);
	}

	/**
	 * load cache config information.
	 */
	public void testCacheManager() {
		InputStream in = EhcacheTest.class.getClassLoader().getResourceAsStream("ehcache.xml");
		CacheManager cm = CacheManager.create(in);

		String[] names = cm.getCacheNames();
		System.out.println(names.length);
		System.out.println(names[0]);
		Cache cache = cm.getCache("data-cache");
		Assert.assertNotNull(cache);

		CacheConfiguration configuration = cache.getCacheConfiguration();
		configuration.setTimeToIdleSeconds(4600);
		System.out.println(cm.getActiveConfigurationText());

		// cm.clearAll();
		// cm.removeCache("data-cache");
	}

	/**
	 * remove element from chache
	 */
	public void testRemoveElementFromCache() {
		InputStream in = EhcacheTest.class.getClassLoader().getResourceAsStream("ehcache.xml");
		CacheManager cm = CacheManager.create(in);

		Cache cache = cm.getCache("data-cache");

		Person p1 = new Person(1, "Jack", 21);
		Person p2 = new Person(2, "Mike", 73);

		Element e1 = new Element(p1, p1, 1);
		cache.putIfAbsent(e1);
		Element e2 = new Element(p2, p2, 1);
		cache.put(e2);

		cache.remove(p1);
		boolean isSucc = cache.removeElement(e1);
		Assert.assertFalse(isSucc);

		cache.put(e1);

		cache.removeAll();

		Assert.assertEquals(0, cache.getSize());
	}

	public void testUpdateElementInCache() {
		InputStream in = EhcacheTest.class.getClassLoader().getResourceAsStream("ehcache.xml");
		CacheManager cm = CacheManager.create(in);

		Cache cache = cm.getCache("data-cache");

		Person p1 = new Person(1, "Jack", 21);
		Person p2 = new Person(2, "Mike", 73);

		Element e1 = new Element(p1, p1, 1);
		cache.put(e1);
		Element e2 = new Element(p2, p2, 1);
		cache.put(e2);

		e2 = new Element(p2, p1, 1);
		cache.replace(e2);

		Assert.assertEquals(p1, e2.getObjectValue());

	}

	public void testQueryElementsFromCache() {
		InputStream in = Ehcache.class.getClassLoader().getResourceAsStream("ehcache.xml");
		CacheManager cm = CacheManager.create(in);
		Cache cache = cm.getCache("data-cache");

		Element e = new Element(1000, 10000, 1);
		cache.put(e);

		e = new Element(2000, 20000, 1);
		cache.put(e);

		Assert.assertEquals(2, cache.getSize());

		e = cache.get(1000);
		Assert.assertEquals(10000, e.getObjectValue());

		Query q = cache.createQuery();

		// Set<Attribute> set = cache.getSearchAttributes();

		Attribute<Integer> keyAttribute = cache.getSearchAttribute("key");

		q = q.addCriteria(keyAttribute.eq(2000));

		q.includeKeys();
		q.includeValues();

		Results results = q.execute();
		Assert.assertNotNull(results);
		Assert.assertEquals(results.size(), 1);

		List<Result> resultList = results.all();
		Result result = resultList.get(0);
		Assert.assertEquals(2000, result.getKey());

		Assert.assertEquals(20000, result.getValue());
	}

}
