import com.mzz.Dao.DeptDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.mzz.po.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class testmybatis {
  @org.junit.Test
    public void testSelectAll() throws IOException {
    //l.加载mybatis的配置文件
    InputStream is= Resources.getResourceAsStream("mybatis-config1.xml");
    ///2.创建SqlSessionFactory 工厂
    SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
    //
    SqlSession sqlSession=sqlSessionFactory.openSession();
    //4操{作数据库的各种增删改查操作
    //4.1查询全部燥作
    List<Object> list = sqlSession.selectList("deptMapper.selectAll");
    for (Object o:list) {
      System.out.println("o = " + o);
    }

  }
  @Test
  public  void test1() throws IOException {

    InputStream is= Resources.getResourceAsStream("mybatis-config1.xml");
    ///2.创建SqlSessionFactory 工厂
    SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
    SqlSession sqlSession=sqlSessionFactory.openSession();
   Object o = sqlSession.selectOne("deptMapper.selectOne1", "张三");
    System.out.println("o = " + o);


    Emp emp=new Emp();



  }
  @Test
  public void test2() throws IOException {
    InputStream is= Resources.getResourceAsStream("mybatis-config1.xml");
    ///2.创建SqlSessionFactory 工厂
    SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);

    SqlSession sqlSession=sqlSessionFactory.openSession(true);

    /*Dept Dept=new Dept();
    Dept.setDept_name("马壮壮");
    int insert = sqlSession.insert("deptMapper.insert", Dept);
    System.out.println("insert = " + insert);*/

    int delete = sqlSession.delete("deptMapper.delete", 8);

    System.out.println("delete = " + delete);


  }
  @Test
  public void test4() throws IOException {
    InputStream is=Resources.getResourceAsStream("mybatis-config1.xml");
    SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
    SqlSession sqlSession=sqlSessionFactory.openSession(true);
    Dept dept=new Dept();
    dept.setDept_id(5);
    dept.setDept_name("逗比部");
    int update = sqlSession.update("deptMapper.update", dept);
    System.out.println("update = " + update);
  }


  @Test
  public void test5() throws IOException {
    //加载配置文件
    InputStream is=Resources.getResourceAsStream("mybatis-config1.xml");
    //创建sqLSessionFactory工厂
    SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
    //生产sqLsession数据库会话对象
    SqlSession sqlSession=sqlSessionFactory.openSession(true);
    /*List<Object> list = sqlSession.selectList("com.mzz.Dao.DeptDao.selectAll");
    for(Object o :list){
      System.out.println("o = " + o);
    }*/
    DeptDao dd = sqlSession.getMapper(DeptDao.class);
    List<Dept> depts=dd.selectAll();
    for(Dept dept:depts){
      System.out.println("dept = " + dept);
    }
  }


















}
