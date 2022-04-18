func answered(a: String, b: String){
    loaded = false

    if(a == b){
        // sound
        SoundManager.instance.playCorrect()
        // sound end
        
        color = Color.gradColor_bluePink // change
        question = "CORRECT"
        string = ""
        try_again = 0
        
        if (cur_question == last){
            DispatchQueue.main.asyncAfter(deadline: .now() + 0.8, execute: {
                loaded = true
                accuracy = ((Double(need_review.count)/Double(maxNum)).round(nearest: 0.01))
                self.end = true
            })
        }

        cur_question += 1
    }
    else{

        if(try_again > 1){
            
            // sound
            SoundManager.instance.playTry()
            // sound end
            
            color = Color.gradColor_blue
            question = String(level) + " × " + String(cur_question) + " = "
            string = String(answer)
            text_color = Color("rose")
            
            if(cur_question < last){
                try_again = 0
                cur_question += 1
            }
            
            else{

                DispatchQueue.main.asyncAfter(deadline: .now() + 0.8, execute: {
                    
                    loaded = true
                    accuracy = ((Double(need_review.count)/Double(maxNum)).round(nearest: 0.01))
                    self.end = true
                    
                })
            }
            
        } // try again 

        else{
            // sound
            SoundManager.instance.playIncorrect()
            // sound end
            
            color = Color.gradColor_pink
            question = "Try"
            string = "Again"
            need_review.append(cur_question)
        }

    } // else

    DispatchQueue.main.asyncAfter(deadline: .now() + 0.8, execute: {
            
        color = Color.gradColor_blue
        question = String(level) + " × " + String(cur_question) + " = "
        string = "?"
        text_color = Color("blackBrown")
        loaded = true
    })
}