//console.log("hello world")
let display = document.getElementById('display');//connects to the display 

let buttons = Array.from(document.getElementsByClassName('button'));//array cause there are multiple buttons

//shows what has been clicked in the console
// buttons.map(button =>{
//     button.addEventListener("click" , (event) =>{
//         console.log('clicked');
//         console.log(event);
//         console.log(event.target)
//         console.log(event.target.innerText)
//     })
// })

//maps the buttons so that you can iterate through all of them
buttons.map(button =>{
     button.addEventListener("click" , (event) =>{
        
        switch(event.target.innerText){

            case "C"://clears the display of everything
                display.innerText = '';
                break;

            case "Del"://deletes everything
//if statement is used to ensure that something is deleted only when there is something within display
                if(display.innerText){
                display.innerText = display.innerText.slice(0,-1);//removes the last typed digit                    
                }
                break;
            
            case "=":
                try{
                    display.innerText  = eval(display.innerText)                    
                }catch{
                    display.innerText = "Invalid!"//displays when the java cant calculate the input
                }

                break;

            default:
                display.innerText += event.target.innerText; //displays the clicked buttons to the display
        }
    });
});