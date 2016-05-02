## Akka in Java

```system.actorOf(Props.create(MyActor.class), "myactor")``` 用来定义 Actor 的路径，
```getContext().actorSelection("/user/myactor").tell()``` 用来向指定 Actor 发送消息

### 引用链接
[http://sunxiang0918.cn/2016/01/10/Akka-in-JAVA-1/](http://sunxiang0918.cn/2016/01/10/Akka-in-JAVA-1/)
