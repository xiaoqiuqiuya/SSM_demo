package test;

import com.mybatis.po.Customer;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.junit.Test;
import utils.MyBatisUtil;

import java.io.InputStream;


public class MybatisTest {
    @Test
    public void findCustomerByIdTest() throws Exception {
        //1.读取配置文件
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
        //2.根据配置文件构建sqlSessionFactory
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //3.构建一个会话 创建SqlSession
//        SqlSession sqlSession = sqlSessionFactory.openSession();

        SqlSession sqlSession = MyBatisUtil.getSqlSession();

        //执行映射文件中定义的sql语句，并返回映射的结果集
        Customer customer = sqlSession.selectOne("com.mybatis.mapper.CustomerMapper.findCustomerByid",1);

        System.out.print(customer);
        sqlSession.close();
    }
}
