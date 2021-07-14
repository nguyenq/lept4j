package net.sourceforge.lept4j;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * General hash map<br>
 * <i>native declaration : hashmap.h:7</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class L_Hashmap extends Structure {
	/**
	 * < number of stored items<br>
	 * C type : l_int32
	 */
	public int nitems;
	/**
	 * < number of items to be stored<br>
	 * C type : l_int32
	 */
	public int ntogo;
	/**
	 * < max average occupancy allowed<br>
	 * C type : l_int32
	 */
	public int maxocc;
	/**
	 * < array of hash item ptrs<br>
	 * C type : L_Hashitem**
	 */
	public net.sourceforge.lept4j.L_Hashitem.ByReference[] hashtab;
	/**
	 * < size of array of hash item ptrs<br>
	 * C type : l_int32
	 */
	public int tabsize;
	public L_Hashmap() {
		super();
	}
        @Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("nitems", "ntogo", "maxocc", "hashtab", "tabsize");
	}
	/**
	 * @param nitems < number of stored items<br>
	 * C type : l_int32<br>
	 * @param ntogo < number of items to be stored<br>
	 * C type : l_int32<br>
	 * @param maxocc < max average occupancy allowed<br>
	 * C type : l_int32<br>
	 * @param hashtab < array of hash item ptrs<br>
	 * C type : L_Hashitem**<br>
	 * @param tabsize < size of array of hash item ptrs<br>
	 * C type : l_int32
	 */
	public L_Hashmap(int nitems, int ntogo, int maxocc, net.sourceforge.lept4j.L_Hashitem.ByReference hashtab[], int tabsize) {
		super();
		this.nitems = nitems;
		this.ntogo = ntogo;
		this.maxocc = maxocc;
		if ((hashtab.length != this.hashtab.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.hashtab = hashtab;
		this.tabsize = tabsize;
	}
	public L_Hashmap(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends L_Hashmap implements Structure.ByReference {
		
	};
	public static class ByValue extends L_Hashmap implements Structure.ByValue {
		
	};
}