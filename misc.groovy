/*
//def log = new File('C:/jenkins/.jenkins/jobs/pobol/builds/135/changelog.xml')
//print changelog.text

def log = new XmlParser().parse("C:/jenkins/.jenkins/jobs/pobol/builds/135/changelog.xml")
//println log
//println log.logentry.paths.path[1].text()
def apps = [] as SortedSet
log.logentry.paths.path.each{
    //def x = it.attribute("localPath")
   // println ${x}.tokenize('\')
    //println x[0]
    ///println it.attribute("localPath")
    // println it.text()
  // println it.text().split('/')[4]
   apps.add(it.text().split('/')[3])
 }
 
 println apps
//println "action = ${path.attribute('action')}"
*/
/*
def ear = new File('C:/jenkins/.jenkins/jobs/WebBATS_WS_OMAS/workspace/WebBATS_WS_APC_Client/build/application.xml').text.find(/WebBATS.*\.war/).replaceAll('war', 'EAR')
println ear


def app = new File('C:/jenkins/.jenkins/jobs/WebBATS_WS_OMAS/workspace/WebBATS_WS_APC_Client/build/application.xml').text.find(/WebBATS.*_EAR/)
println app

def dis = new File('C:/jenkins/.jenkins/jobs/WebBATS_WS_OMAS/workspace/WebBATS_WS_APC_Client/build/application.xml').text.replaceAll("(\n)|(\t)", "")
println dis
def matcher = dis =~ "<display-name>(.*)</display-name>"
println matcher.getCount()
println matcher[0][1]
println matcher[0][1].replaceAll("\\s", "") //also removes the space in between
print matcher[0][1].trim() //this one keeps the space in between
println matcher[0][1].replaceAll("^\\s+", "") //left trim
println matcher[0][1].replaceAll("\\s+\$", "") //right trim
println matcher[0][1].replaceAll("(^ )|( \$)", "") //left trim

println 'abc' - 'b'

println 'grailssdfvnsdjkkaihnfoifgjhgjai'.findAll{ it < 'a' }

5.times {
print "me"
}

println "x" * 10
*/

def xy = "null:x:y"
(xy - null).split(":").each{
    if (it != null) println it
}

String inFile = new File("C:/jenkins/.jenkins/jobs/WebBATS_WS_OMAS/builds/118/log").text
def URLS = "https://eagnmncom0cba.usps.com:9043/ibm/console/logon.jsp,https://eagnmncom0cbb.usps.com:9043/ibm/console/logon.jsp,https://eagnmncom0cb7.usps.com:9043/ibm/console/logon.jsp,https://eagnmncom0cb8.usps.com:9043/ibm/console/logon.jsp"

def url = URLS.split(',')

println inFile.contains('https')
url.each{

x = it.split('/')[2]
println x.split('.')[1]
println  it + "=" + inFile.count(it)
//if (!inFile.contains(it))
//{
//println it
//}
}

println inFile.count("https://eagnmncom0cba.usps.com:9043/ibm/console/logon.jsp")
projenv = 'DEV&SIT'
println projenv.split('&').size() * 2
