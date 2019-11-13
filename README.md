# mybatisGenerator实际生产中使用
1. 使用mybatis插件自动生成实体类，并且实体类中的每一个字段会自动带上sql文件中的comment；
2. 使用该工程生成的mapper中自带6种操作数据的方法
    int deleteByPrimaryKey(Long id);//按主键删除记录  
    int insert(Entity record);//普通插入记录方法  
    int insertSelective(Entity record);//选择性的插入方法（比如在数据库中的currentDate类型的数据会自己加上）  
    Entity selectByPrimaryKey(Long id);//按照主键查询实体类  
    int updateByPrimaryKeySelective(Entity record);//有选择的更新实体类（若果传入了主键，该方法会自己去找相应的那条数据）  
    int updateByPrimaryKey(Entity record);//普通更新方法  
 3. 使用该工程自动生成与mapper对应的sql文件
 4. 使用该工程
##使用方式

