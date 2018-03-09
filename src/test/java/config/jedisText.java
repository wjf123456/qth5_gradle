package config;

import org.junit.Test;
import redis.clients.jedis.Jedis;


public class jedisText {
    @Test
   public void jedis() {


        Jedis jedis = new Jedis("localhost");
        jedis.set("foo", "bar");
        jedis.rpush("list", "tom");
        String value=jedis.get("foo");
        System.out.print(value);
    }
}
