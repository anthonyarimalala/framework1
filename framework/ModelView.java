package etu2033.process;

import java.util.HashMap;

public class ModelView {
    
    String view;
    HashMap<String,Object> data = new HashMap<>();

///CONSTRUCTS///
    public ModelView(String view) {
        this.view = view;
    }

    public ModelView() {
    }

///FUNCTIONS///
    public void addItem(String key,Object value){
        this.getData().put(key, value);
    }


///GET/SET///
    public HashMap<String, Object> getData() {
        return data;
    }

    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    
}
