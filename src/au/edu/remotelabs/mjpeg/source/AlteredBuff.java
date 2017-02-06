package au.edu.remotelabs.mjpeg.source;

import java.io.BufferedInputStream;

public class AlteredBuff {
	
	byte[] buf;
	BufferedInputStream in;
	
	int off, len;
	
	public AlteredBuff(BufferedInputStream in) {
		this.in = in;
	}
	
	public int read() {
		return buf[off++];
	}
	
	public int read(byte[] b, int off, int len) {
		return 0;
	}
	
	// whatever "i" has counted up to
	public void push(byte[] b, int o, int l) {
		// if buf already contains data
		// 
		if (buf == null || buf.length == 0)
		{
			buf = b;
			off = off;
			len = len;
		}
		else if (buf.length - (off + len + o + l) > 0)
		{
			// array copy
		}
		else
		{
			// Allocate new buef
			//copy
		}
	}
	

}
