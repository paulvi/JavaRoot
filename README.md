

http://stackoverflow.com/questions/22644441/new-to-scripting-with-java-and-nashorn-any-tutorials

http://winterbe.com/posts/2014/04/05/java8-nashorn-tutorial/


D:\Workspaces\eclipse-standard-luna-R-win32-x86_64\JavaRoot>jjs -cp ./ runJava.jjs
runJava.jjs:2 TypeError: [JavaClass JavaClass] has no such function "hello"

D:\Workspaces\eclipse-standard-luna-R-win32-x86_64\JavaRoot>jjs -cp ./ runJava.jjs
runJava.jjs:2 TypeError: Can not invoke method [jdk.internal.dynalink.beans.SimpleDynamicMethod String JavaClass.hello(String)] with the passed arguments; they do not match any of its method signatures.

Now runs with `jjs -cp ./ runJava.jjs`