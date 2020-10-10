
def get_recipe(d):
   return "zulu-ezdk-armv6hf-headless"

recipe = "${@get_recipe(d)}" 
require ${recipe}.bb

