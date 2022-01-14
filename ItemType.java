package cCS210;

public enum ItemType  {
  
    Audio("AU"),
    Visual("VI"),
    AudioMobile("AM"),
    VisualMobile("VM");
  
    private String code;
    ItemType (String code ){
      this.code = code;
    }
    public String getCode(){
      return code ;
    }
  }