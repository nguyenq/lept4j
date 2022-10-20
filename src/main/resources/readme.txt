Lept4J

DESCRIPTION

A Java JNA wrapper for Leptonica Image Processing Library. Lept4J is released and distributed under the Apache License, v2.0.

The library provides support for Leptonica native types and data structures — such as Pix, Boxa, Pixa, etc. —  used in Tesseract OCR API.

LIMITATIONS

Leptonica class, which implements JNA Interface Mapping, supports only a subset of Leptonica C functions to avoid ExceptionInInitializerError; whereas Leptonica1 class, which employs JNA Direct Mapping, supports the complete set.

Attempts to implement the complete set, which totals nearly 2,400 functions, in JNA Interface Mapping have resulted in exceptions due to limitations imposed by the JVM. 

   [junit] Error occurred during initialization of VM
   [junit] Could not reserve enough space for 2097152KB object heap

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

java.lang.IllegalArgumentException: code size limit exceeded
sun.misc.ProxyGenerator.generateStaticInitializer(ProxyGenerator.java:1261)

The above exception is due to the limit set in JDK's ProxyGenerator.java:

if (minfo.code.size() > 65535) {
   throw new IllegalArgumentException("code size limit exceeded");
}

https://github.com/openjdk/jdk/blob/master/src/java.base/share/classes/java/lang/reflect/ProxyGenerator.java

Java 19 further limits the code size as it would throw:

jdk.internal.org.objectweb.asm.MethodTooLargeException: Method too large: jdk/proxy2/$Proxy12.<clinit> ()V
	at java.base/jdk.internal.org.objectweb.asm.MethodWriter.computeMethodInfoSize(MethodWriter.java:2120)
	at java.base/jdk.internal.org.objectweb.asm.ClassWriter.toByteArray(ClassWriter.java:543)
	at java.base/java.lang.reflect.ProxyGenerator.generateClassFile(ProxyGenerator.java:507)
	at java.base/java.lang.reflect.ProxyGenerator.generateProxyClass(ProxyGenerator.java:179)
	at java.base/java.lang.reflect.Proxy$ProxyBuilder.defineProxyClass(Proxy.java:558)
	at java.base/java.lang.reflect.Proxy$ProxyBuilder.build(Proxy.java:670)
	at java.base/java.lang.reflect.Proxy.lambda$getProxyConstructor$0(Proxy.java:429)
	at java.base/jdk.internal.loader.AbstractClassLoaderValue$Memoizer.get(AbstractClassLoaderValue.java:329)
	at java.base/jdk.internal.loader.AbstractClassLoaderValue.computeIfAbsent(AbstractClassLoaderValue.java:205)
	at java.base/java.lang.reflect.Proxy.getProxyConstructor(Proxy.java:427)
	at java.base/java.lang.reflect.Proxy.newProxyInstance(Proxy.java:1037)
	at com.sun.jna.Native.load(Native.java:624)
	at com.sun.jna.Native.load(Native.java:596)
	at net.sourceforge.lept4j.util.LoadLibs.getLeptonicaInstance(LoadLibs.java:79)

The above exception is due to the limit set in JDK's MethodWriter.java:

if (code.length > 65535) {
    throw new MethodTooLargeException(
            symbolTable.getClassName(), name, descriptor, code.length);
}

https://github.com/openjdk/jdk/blob/master/src/java.base/share/classes/jdk/internal/org/objectweb/asm/MethodWriter.java

DOCUMENTATION

http://tess4j.sourceforge.net/docs/
https://github.com/nguyenq/lept4j
http://tpgit.github.io/Leptonica/
http://tpgit.github.io/UnOfficialLeptDocs/leptonica/