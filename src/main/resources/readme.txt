Initial commit (18 April 2015)

The code works partially due to the heap size issue. Will work on it later when possible.

   [junit] Error occurred during initialization of VM
   [junit] Could not reserve enough space for 2097152KB object heap

java.lang.ExceptionInInitializerError
	at net.sourceforge.lept4j.Leptonica1Test.testPixRead(Leptonica1Test.java:32480)
	at com.sun.jna.Native.register(Native.java:1463)
	at com.sun.jna.Native.register(Native.java:1396)
	at com.sun.jna.Native.register(Native.java:1156)

java.lang.ExceptionInInitializerError
	at net.sourceforge.lept4j.LeptonicaTest$LeptonicaImpl.getInstance(LeptonicaTest.java:43867)
	at net.sourceforge.lept4j.LeptonicaTest.testPixRead(LeptonicaTest.java:34440)
	at sun.misc.ProxyGenerator.generateStaticInitializer(ProxyGenerator.java:1261)
	at sun.misc.ProxyGenerator.generateClassFile(ProxyGenerator.java:484)
	at sun.misc.ProxyGenerator.generateProxyClass(ProxyGenerator.java:339)
	at java.lang.reflect.Proxy$ProxyClassFactory.apply(Proxy.java:639)
	at java.lang.reflect.Proxy$ProxyClassFactory.apply(Proxy.java:557)
	at java.lang.reflect.WeakCache$Factory.get(WeakCache.java:230)
	at java.lang.reflect.WeakCache.get(WeakCache.java:127)
	at java.lang.reflect.Proxy.getProxyClass0(Proxy.java:419)
	at java.lang.reflect.Proxy.newProxyInstance(Proxy.java:719)
	at com.sun.jna.Native.loadLibrary(Native.java:415)
	at com.sun.jna.Native.loadLibrary(Native.java:391)
	at net.sourceforge.lept4j.util.LoadLibs.getLeptonicaInstance(LoadLibs.java:78)

