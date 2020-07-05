package com.codedifferently;

public class DisplayMode {
    private String switchMode;

    public DisplayMode(){
        switchMode = "Decimal";  //default display mode
    }

    public String switchDisplayMode(){

        switch(switchMode)
        {
            case"Decimal":
                switchMode = "Octal";
                break;
            case "Octal":
                switchMode = "Binary";
                break;
            case "Binary":
                switchMode = "Hexadecimal";
                break;
            case "Hexadecimal":
                switchMode = "Decimal";
                break;
        }

        return switchMode;
    }

    public void switchDisplayMode(String dMode){
        switchMode = dMode;
    }

    public String getMode(){
        return switchMode;
    }
}