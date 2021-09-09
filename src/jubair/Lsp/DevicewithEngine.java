package jubair.Lsp;

import com.sun.xml.internal.ws.api.pipe.Engine;

public class DevicewithEngine extends TrasportationDevice{
    Engine engine;
    Engine getEngine() {
       return this.engine=engine;

    }
    void setEngine(Engine e) { }
    void startEngine() {  }
}
