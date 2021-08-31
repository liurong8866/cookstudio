package com.cook.redis;

import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.Transaction;

@SpringBootTest
class RedisApplicationTests {

    @Test
    void contextLoads() {

        Jedis jedis = new Jedis("192.168.0.120", 6379);

        jedis.flushDB();
        jedis.watch("money");
        Transaction multi = jedis.multi();
        try {
            multi.incrBy("money", 10);
            multi.decrBy("out", 10);
//            int i = 1/0;
            multi.exec();

        } catch (Exception e) {
            multi.discard();
            e.printStackTrace();
        } finally {
            System.out.println(jedis.get("money"));
            System.out.println(jedis.get("out"));
            multi.close();
//            jedis.close();
        }


    }

}
