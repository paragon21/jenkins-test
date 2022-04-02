// import groovy.json.JsonSlurper

// def jsonSlurper = new JsonSlurper()
def jsonText = readFileFromWorkspace('src.json')

// def config = jsonSlurper.parse(releaseScript)

def props = readJSON text: jsonText

println(props)

