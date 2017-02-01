def env = System.getenv()
def jnk = env['JENKINS_HOME']
println jnk
def inFile = new File(jnk + "\\myprop.propertie")
println inFile
def app = [:]
def apps = []
def i = 0
inFile.withReader {reader ->
    while (line = reader.readLine()){
        if(line =~ /=/)
        {
           def x = line.split("=")
            app[x[0]] = x[1]
            apps[i] = x[0]
            
           
            
        }
      i++
    }
}
print apps