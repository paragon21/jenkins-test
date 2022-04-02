// import groovy.json.JsonSlurper

// def jsonSlurper = new JsonSlurper()
// def releaseScript = readFileFromWorkspace('src.json')

// def config = jsonSlurper.parse(releaseScript)

def props = readJSON file: 'src.json'

println(props)

