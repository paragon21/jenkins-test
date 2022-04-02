import groovy.json.JsonSlurper

def jsonSlurper = new JsonSlurper()
def jsonText = readFileFromWorkspace('src.json')

def config = jsonSlurper.parseText(jsonText)


println(config)

