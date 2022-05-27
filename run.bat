set projectLocation=C:\Users\HI\eclipse-workspace\frameWorks
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG%projectLocation%\testng.xml