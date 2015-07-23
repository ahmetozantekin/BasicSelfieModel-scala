class Selfie (gender: String , areYoufamous: Boolean, showBoobs: Boolean) { 

    private var barzoCount = 50
    private var like       = 0 
        
    def this(gender: String) = this(gender, "")
    def this(areYoufamous: Boolean) = this(areYoufamous, "")
    def this(showBoobs: Boolean) = this(showBoobs, "")
    def this(like: Integer) = this(like, "")
   
        /**
         *
         *   private var barzoCount: Integer = 50
         *   private var like      : Integer = 0
         *
         *   var _gender      : String  = gender
         *   var _areYoufamous: Boolean = areYoufamous
         *   var _showBoobs   : Boolean = showBoobs
         *   
         */
    
        
    def takePhoto() = {
        
        println("Click")
       
        if((gender == "male") or (gender =="man") and (areYoufamous = false)){
        
            like = 7
        // best friends... gifme five.
                
        } else if((gender == "male") or (gender == "man") and (areYoufamous = true)){
        
            like = 300 - barzoCount
        // easy handsome. eeeeeasy.
                
        } else if((gender == "female") or (gender == "woman")){
        
            if(areYoufamous == false){
                
                like = 20
                    
            } else if (areYoufamous == true){
                
                like = 700
                    
            }
        
            while (showBoobs and barzoCount < 200){
                
                like = like + barzoCount
                barzoCount += 1
                // newborn barzo
                    
            }
        } else {
            
            println("ya susarmsn artk. kiz agliyo grmyomusn?\n")
                
        }
    }
    
    def sayHello()= {
        
        var comment = Array("cok tatli cikmissin",
                            "kardesle delirmeceler",
                            "kardes candir",
                            ":)))",
                            "bi gun beni de gotursene oraya :)",
                            "beyler arkada calan sarkinin adi ne?")
                            /* stay barzo, stay hungry */
            
        
        val rand         = scala.util.Random
        var _randcomment = rand.nextInt(comment.length)
            
        println(comment(_randcomment))
        
    
    }
        
}

object Test {

    def main (args: Array[String]) = {
        
        val selfie = new Selfie (/*gender*/,/*isFamous?*/,/*BOOOOB?*/)
        
        selfie.sayHello()
        selfie.takePhoto()
        

    }
}
    


