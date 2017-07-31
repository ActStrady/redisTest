import org.junit.Test;
import redis.clients.jedis.BinaryClient;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.ScanResult;
import redis.clients.jedis.Tuple;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RedisTest {
    Jedis jedis = new Jedis("localhost");
    @Test
    public void keyTest(){
        //jedis.set("1key", "q");
        //jedis.set("2key", "w");
        //jedis.set("3key", "e");
        //jedis.set("4key", "r");
        //jedis.set("5key", "t");
        //jedis.set("6key", "t");
        //jedis.set("key1", "a");
        //jedis.set("key2", "s");
        //jedis.set("key3", "d");
        //jedis.set("key4", "f");
        //jedis.set("key5", "g");
        //jedis.set("key6","h");
        //System.out.println(jedis.get("key1"));
        //System.out.println(jedis.del("6key"));
        // 序列化 key
        //System.out.println(jedis.dump("key2"));
        //System.out.println(jedis.get("key2"));
        // 反序列化
        //System.out.println(jedis.restore("key6", 0, "B@1cc3b4c1".getBytes()));
        // 是否存在
        //System.out.println(jedis.exists("key2"));
        // 设置生存时间
        //jedis.expire("key3", 200);
        //jedis.persist("key3");
        //System.out.println(jedis.ttl("key3"));
        //System.out.println(jedis.get("key3"));
        //System.out.println(jedis.ttl("key4"));
        // 返回给定 key 锁储存的值所使用的内部表示
        //System.out.println(jedis.objectEncoding("key5"));
        // 返回给定 key 引用所储存的值的次数
        //System.out.println(jedis.objectIdletime("key5"));
        // 返回给定 key 引用所储存的值的次数
        //System.out.println(jedis.objectRefcount("key5"));
        // 随机返回一个key
        //System.out.println(jedis.randomKey());
        // 重命名 已经有会覆盖
        //jedis.rename("6key", "key6");
        //System.out.println(jedis.get("key6"));
        // 重命名 已经有会不改
        //jedis.renamenx("6key", "key6");
        // 迭代键
        //ScanResult<String> scan = jedis.scan("0");
        //List<String> result = scan.getResult();
        //for (String s : result) {
            //System.out.println(s);
            //System.out.println(jedis.get(s));
        //}
        //System.out.println(scan.getResult());

        // keys使用
        //Set<String> keys = jedis.keys("*");
        //System.out.println(keys);
        //System.out.println(jedis.type("key1"));
    }
    @Test
    public void hashTest(){
        // 存
        //jedis.hset("hashKey", "hkey1", "value1");
        // 多存
        //Map<String, String> map = new HashMap<String, String>();
        //map.put("hkey2","value2");
        //map.put("hkey3","value3");
        //map.put("hkey4","value4");
        //map.put("hkey5","value5");
        //map.put("hkey6","value6");
        //jedis.hmset("hashKey", map);
        // 域的数量
        // System.out.println(jedis.hlen("hashKey"));
        // 是否存在
        //System.out.println(jedis.hexists("hashKey", "hkey1"));
        // 取
        //System.out.println(jedis.hget("hashKey", "hkey1"));
        // 多取
        //System.out.println(jedis.hmget("hashKey", "hkey2","hkey3","hkey4"));
        // 全取
        //System.out.println(jedis.hgetAll("hashKey"));
        // 域全取
        //System.out.println(jedis.hkeys("hashKey"));
        // 值全取
        //System.out.println(jedis.hvals("hashKey"));
        // 迭代
        /*ScanResult<Map.Entry<String, String>> hashKey = jedis.hscan("hashKey", "0");
        List<Map.Entry<String, String>> result = hashKey.getResult();
        for (Map.Entry<String, String> stringStringEntry : result) {
            System.out.println(stringStringEntry.getKey());
            System.out.println(stringStringEntry.getValue());
        }*/

        //jedis.hsetnx("hashKey","hkey7", "value7");
        //System.out.println(jedis.hget("hashKey","hkey7"));
        // 加一个值给已经有的值
        //jedis.hset("hashKey", "hkey9", "20");
        //jedis.hincrBy("hashKey", "hkey9", 20);
        //System.out.println(jedis.hget("hashKey", "hkey9"));
    }
    @Test
    public void scoredSetTest(){
        // 添加
        //jedis.zadd("scoredSetKey", 200.0, "zhangsan");
        // 多添加
       // Map<String, Double> map = new HashMap<String, Double>();
        //map.put("lisi", 500.0);
        //map.put("wangwu", 5000.0);
        //map.put("zhaoliu", 555.0);
        //map.put("lijiu", 5080.0);
        //map.put("liuba", 6365.0);
        //map.put("songwu", 50.0);
        //jedis.zadd("scoredSetKey",map);
        // 元素个数
        //System.out.println(jedis.zcard("scoredSetKey"));
        // 指定区间内的元素,小到大排列
        /*Set<String> scoredSetKey = jedis.zrange("scoredSetKey", 0, -1);
        for (String s : scoredSetKey) {
            System.out.println(s);
        }*/
        // 指定区间内的元素,大到小排列
        /*Set<String> scoredSetKey = jedis.zrevrange("scoredSetKey", 0, -1);
        for (String s : scoredSetKey) {
            System.out.println(s);
        }*/
        // 在最小值与最大值之间的成员数
        //System.out.println(jedis.zcount("scoredSetKey", 0, 5000));
        // 成员的排名值 小到大排列
        //System.out.println(jedis.zrank("scoredSetKey", "liuba"));
        // 成员的排名值 大到小排列 注意排名从0开始
        // System.out.println(jedis.zrevrank("scoredSetKey", "liuba"));
        // 成员介于min与max之间,并且按照小到大排序
        /* Set<String> set = jedis.zrangeByScore("scoredSetKey", 0, 5000);
        for (String s : set) {
            System.out.println(jedis.zrank("scoredSetKey", s));
            System.out.println(jedis.zscore("scoredSetKey", s));
            System.out.println(s);
        }*/
        // 成员介于min与max之间,并且按照小到大排序
        /*Set<String> set = jedis.zrevrangeByScore("scoredSetKey", 5000, 0);
        for (String s : set) {
            System.out.println(jedis.zrank("scoredSetKey", s));
            System.out.println(jedis.zscore("scoredSetKey", s));
            System.out.println(s);
        }*/
        //给score增加值
        //jedis.zincrby("scoredSetKey",10000.0, "songwu");
        //System.out.println(jedis.zscore("scoredSetKey","songwu"));
        // 删除
        //jedis.zrem("scoredSetKey", "songwu", "liuba");
        // 删除指定排名
        //jedis.zremrangeByRank("scoredSetKey",0,2);
        // 删除最小最大之间
        //jedis.zremrangeByScore("scoredSetKey",200, 5000);
        // 按字典顺序取出和删除
        //jedis.zrangeByLex("scoredSetKey","[a", "[c");
        //jedis.zremrangeByLex("scoredSetKey","[a", "[c");
        //给定字典区域内的值的个数
        //System.out.println(jedis.zlexcount("scoredSetKey", "[a", "[w"));
        // 迭代
        /*ScanResult<Tuple> scoredSetKey = jedis.zscan("scoredSetKey", "0");
        List<Tuple> result = scoredSetKey.getResult();
        for (Tuple tuple : result) {
            System.out.println(tuple.getScore());
            System.out.println(tuple.getElement());
            System.out.println(tuple.getBinaryElement());
        }*/
        //jedis.zadd("sSetkey2", 5000.22, "laili");
        //jedis.zadd("sSetkey2", 500.22, "lui");
        //jedis.zadd("sSetkey2", 50.22, "lui");
        //jedis.zadd("sSetkey2", 5000, "lijiu");

        // 取并集
        /*jedis.zunionstore("newsSetKey","scoredSetKey","sSetkey2");
        Set<Tuple> newsSetKey = jedis.zrangeWithScores("newsSetKey", 0, -1);
        for (Tuple tuple : newsSetKey) {
            System.out.println(tuple.getScore());
            System.out.println(tuple.getElement());
        }*/
        // 取交集
        /*jedis.zinterstore("newsSetKey","scoredSetKey","sSetkey2");
        Set<Tuple> newsSetKey = jedis.zrangeWithScores("newsSetKey", 0, -1);
        for (Tuple tuple : newsSetKey) {
            System.out.println(tuple.getScore());
            System.out.println(tuple.getElement());
        }*/
    }
    @Test
    public void setTest(){
        // 添加
        //jedis.sadd("setKey","si","de","dde","ddees");
        // 元素个数
        //System.out.println(jedis.scard("setKey"));
        // 取所有的元素
        //System.out.println(jedis.smembers("setKey"));
        // 是否存在
        //System.out.println(jedis.sismember("setKey", "si"));
        // 随机取元素
        //System.out.println(jedis.srandmember("setKey"));
        //System.out.println(jedis.srandmember("setKey",5));
        // 取两集合不同值 放在新的集合
        //jedis.sadd("setKey2","ss", "de", "dde", "sese", "ddees");
        //jedis.sdiffstore("diffSet","setKey","setKey2");
        // 取两集合不同值 不放在新的集合
        //System.out.println(jedis.smembers("diffSet"));
        //System.out.println(jedis.sdiff("setKey", "setKey2"));
        //取两个集合的交集
        //jedis.sinter("setKey", "setKey2");
        // 放在一个新集合
        //jedis.sinterstore("interKey","setKey", "setKey2");
        // 取并集
        //jedis.sunion("setKey", "setKey2");
        //jedis.sunionstore("unionKey", "setKey", "setKey2");
        // 从一个set移动到另一个
        //jedis.smove("setKey2","setKey","ss");
        //System.out.println(jedis.smembers("setKey"));
        //System.out.println(jedis.smembers("setKey2"));
        // 随机移除一个并返回
        //System.out.println(jedis.spop("setKey"));
        // 删除
        //jedis.srem("setKey","si");
        // 迭代
        /*ScanResult<String> setKey = jedis.sscan("setKey", "0");
        List<String> result = setKey.getResult();
        for (String s : result) {
            System.out.println(s);
        }*/
    }
    @Test
    public void listTest(){
        // 添加
        //jedis.lpush("listKey", "listvalue1", "listvalue2", "listvalue3");
        // 成功
        //jedis.lpush("listKey", "listvalue4", "listvalue5", "listvalue3");
        // 原子性 失败
        //jedis.lpushx("listKey", "listvalue4", "listvalue5", "listvalue3");
        // list 长度
        //System.out.println(jedis.llen("listKey"));
        // 插入值在指定地方
        //jedis.linsert("listKey", BinaryClient.LIST_POSITION.BEFORE, "listvalue1","listvalue11");
        //jedis.rpush("listKey","listvalue7");
        // 取值 在指定范围
        //System.out.println(jedis.lrange("listKey", 0, -1));
        // 移除头部
        //System.out.println(jedis.lpop("listKey"));
        // 移除尾部
        //System.out.println(jedis.rpop("listKey"));
        // 根据index取元素
        //System.out.println(jedis.lindex("listKey", 0));
        // 删除n个元素
        //jedis.lrem("list", 2, "listvalue3");
        // 改值
        //jedis.lset("listKey", 0, "listvalue34");
        // 除在范围的全部删除
        //jedis.ltrim("listKey", 0,3);
    }
    @Test
    public void stringTest(){
        // 设置值
        //jedis.mset("skey1","svalue1","skey2","svalue2");
        // 取值
        //System.out.println(jedis.mget("skey1", "skey2"));
        // 从标识处(offset)开始覆盖值
        //jedis.setrange("skey3", 4, "hhhh");
        // 追加值
        //jedis.append("skey1","j2j2");
        // 截取字符串
        //System.out.println(jedis.getrange("skey1", 0, 4));
        // 改旧值, 返回旧值
        //System.out.println(jedis.getSet("skey2", "value222"));
        // 查看字符串的长度
        //System.out.println(jedis.strlen("skey3"));
        //jedis.set("skeynum","55");
        // 值减去一
        //jedis.decr("skeynum");
        // 值减去一个数字
        //jedis.decrBy("skeynum", 10);
        // 值加一
        //jedis.incr("skeynum");
        // 值加个数字
        //jedis.incrBy("skeynum",10);
        //System.out.println(jedis.get("skeynum"));
        //System.out.println(jedis.mget("skey1", "skey2", "skey3"));
    }
}
