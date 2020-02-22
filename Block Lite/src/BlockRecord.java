/**
 *
 * @author atharva
 */
public class BlockRecord {
    private String prevHash;
    private String currentData;
    private String currentHash;
    
    public BlockRecord(String prevHash, String currentData, String currentHash){
        this.prevHash = prevHash;
        this.currentData = currentData;
        this.currentHash = currentHash;
    }
    
    public String getRecord(){
        return prevHash+":"+currentData+":"+currentHash;
    }
}
