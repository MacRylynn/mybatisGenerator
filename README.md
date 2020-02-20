# MybatisGenerator实际生产中使用
1. 使用mybatis插件自动生成实体类，并且实体类中的每一个字段会自动带上sql文件中的comment；
2. 使用该工程生成的mapper中自带6种操作数据的方法  
    int deleteByPrimaryKey(Long id);//按主键删除记录  
    int insert(Entity record);//普通插入记录方法  
    int insertSelective(Entity record);//选择性的插入方法（比如在数据库中的currentDate类型的数据会自己加上）  
    Entity selectByPrimaryKey(Long id);//按照主键查询实体类  
    int updateByPrimaryKeySelective(Entity record);//有选择的更新实体类（若传入主键，该方法会去更新相应那条数据）  
    int updateByPrimaryKey(Entity record);//普通更新方法  
 3. 使用该工程自动生成与mapper对应的sql文件
 4. 建议在生产过程中新建立sql文件来写新加入的sql语句（注意命名空间）  
 -----------------------------------------------------------------------------------------------------------------------------
## 使用方式
1. 修改generator.properties文件中的数据库相关信息  
例如以下格式（driverLocation是jar包的位置，可以在网上自行下载）：  
jdbc.driverLocation=D:/Program Files/apache-maven-3.5.3/repository/mysql/mysql-connector-java/5.1.8/mysql-connector-java-5.1.8.jar  
jdbc.driverClass=com.mysql.jdbc.Driver  
jdbc.connectionURL=jdbc:mysql://127.0.0.1:3306/andriod?characterEncoding=utf-8&autoReconnect=true&zeroDateTimeBehavior=convertToNull  
jdbc.userId=root  
jdbc.password=123456  
2. 修改/增加generatorConfig.xml中的table标签（有几张表就写几个，注意闭合标签）  
例如以下格式：  
  table tableName="uri_user_info"  
               enableCountByExample="false"  
               enableUpdateByExample="false"  
               enableDeleteByExample="false"  
               enableSelectByExample="false"  
               selectByExampleQueryId="false"  
               domainObjectName="UriUserInfoEntity">  
  /table


