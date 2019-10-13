# timeline

## 使用说明

### 1. 数据库

由于使用了远程数据库，我们能看到同一个数据库的内容，不需要在本地建数据库.

/src/main/rescoure目录下的timeline.sql为建表脚本和部分数据，本来是为本地数据库的建立准备的，现在不需要了。

### 2. 接口说明

#### 1）/timeline/getmore

* 描述：获取更多动态。
* 具体说明：每调用该接口，在原有的基础上获取3个新的动态（获取数量可以调整，按照时间倒序排序），当全部动态获取完后，调用该接口没有作用。初始状态下没有动态。
* 前置条件：成功启动SpringBootApplication
* 成功保证：返回json格式的数据，返回的数据内容示例：

  ```json
  {
  "lineLimit": 50, #手机页面显示行数限制，当内容超过显示限制则提供滚动条，这一项主要用于前端检查，是否有滚动条根据pageOverFlow决定
  "wordsPerLine": 15, #手机页面每行显示最大字符数，用于前端检查
  "momentCount": 3, #动态数量
  "moments": [ #动态列表，每一项为一个动态项
    {
      "author": "AIsirQgq", #动态作者
      "timeStamp": "2019-10-12T14:54:42.000+0000", #动态发布时间
      "content": "AIsirQgquGhIX8jLgm5iOBoH78oYusVtYfhP8Th6LLDA1y23foJBDfgHn2BoLjLHU6vbMn375Zz2ESBZKP2tZZZoff4G6kL8eNB8ayqxrUoF1CZBOEfb3tw7EkHw7RXJ5D5JwNd1Rb6C8ciaFBsNDaLPNkXPjCMcgLV1AXN6KRjJpYmhziDzZESCc",
      #动态内容
      "imageUrl": "AIsirQgquGhIX8jL.pnc", #动态图片url
      "lineCount": 13 #动态行数，用于前端检查
    },
    {
      "author": "FzGmVIsg",
      "timeStamp": "2019-10-12T14:53:22.000+0000",
      "content": "FzGmVIsglFmi3v3x2Gkk2bCLKqB0mJ9WrpaJzCRS1Iz43kJ7NfL8zUiabwB5ynkYs8ZI1rZddTQ0AuKFj2OrhPjuoAsA7oDHSjyfC7z5eZreQj6ZICMA5D7QBlPUf0dAcIsNW9x8dgiKmPc4iTJfXu0prjE3mAbH8FIrVZ4FGckI19HKw41xtGLTAnxCD8kpqiMdyHm08H8pG9LJ9qLT",
      "imageUrl": "FzGmVIsglFmi3v3x.pnc",
      "lineCount": 15
    },
    {
      "author": "eJb20EQG",
      "timeStamp": "2019-10-12T14:51:53.000+0000",
      "content": "eJb20EQGV5CitS8Ab2TLU",
      "imageUrl": "eJb20EQGV5CitS8A.pnc",
      "lineCount": 2
    }
  ],
  "pageOverFlow": false #指示是否提供滚动条
  }
  ```
  
  #### 2）/timeline/addmoment
  
  * 描述：随机添加一个动态。
  * 具体说明：调用该接口，添加一条内容作者图片url随机（没有对应的图片），时间为调用时间的动态。没有返回值。
  * 前置条件：同上
  * 后置条件：什么都不返回，一般都会成功添加的，可以通过刷新动态或者上数据库进行检验。
  
  #### 3）/timeline/refresh
  
  * 描述：刷新获取最新的动态。
  * 具体说明：调用该接口，刷新动态显示，获取最新的动态。页面显示的动态会回到最初的3条。为了每次调用都有明显效果，该接口会调用接口添加的函数向数据库里添加一条最新的动态。
  * 前置条件：同上
  * 后置条件：返回一个pageView（与getmore接口相同的内容）。里面有一天最新的动态，并且动态数量为初始的3条（调用一次getmore的效果）
  
