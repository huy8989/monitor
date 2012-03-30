/**
 * NetInfo.java
 * com.ihuy.monitor
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2012-3-8 		huy
 *
 * Copyright (c) 2012, TNT All Rights Reserved.
*/

package com.ihuy.monitor.model;
/**
 * ClassName:NetInfo
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   huy
 * @version  
 * @since    Ver 1.1
 * @Date	 2012-3-8		下午1:14:58
 *
 * @see 	 
 */
public class NetInfo {
	
	/**网络接口*/
	private String face;
	
	/**收到的字节*/
	private long reBytes;
	
	/**收到的包数*/
	private long rePackets;
	
	/**收到的错误数*/
	private long reErrs;
	
	/**收到的丢弃数*/
	private long reDrop;
	
	/**收到的FIFO数*/
	private long reFifo;
	
	/**收到的帧数*/
	private long reFrame;
	
	/**收到的压缩包数*/
	private long reCompressed;
	
	/**收到的多播包数*/
	private long reMulticast;
	
	/**已传输字节*/
	private long trBytes;
	
	/**已传输包数*/
	private long trPackets;
	
	/**已传输误码数*/
	private long trErrs;
	
	/**传输丢弃数*/
	private long trDrop;
	
	/**传输FIFO数*/
	private long trFifo;
	
	/**传输冲突数*/
	private long trColls;
	
	/**传输载波数*/
	private long trCarrier;
	
	/**传输压缩包*/
	private long trCompressed;

	public String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}

	public long getReBytes() {
		return reBytes;
	}

	public void setReBytes(long reBytes) {
		this.reBytes = reBytes;
	}

	public long getRePackets() {
		return rePackets;
	}

	public void setRePackets(long rePackets) {
		this.rePackets = rePackets;
	}

	public long getReErrs() {
		return reErrs;
	}

	public void setReErrs(long reErrs) {
		this.reErrs = reErrs;
	}

	public long getReDrop() {
		return reDrop;
	}

	public void setReDrop(long reDrop) {
		this.reDrop = reDrop;
	}

	public long getReFifo() {
		return reFifo;
	}

	public void setReFifo(long reFifo) {
		this.reFifo = reFifo;
	}

	public long getReFrame() {
		return reFrame;
	}

	public void setReFrame(long reFrame) {
		this.reFrame = reFrame;
	}

	public long getReCompressed() {
		return reCompressed;
	}

	public void setReCompressed(long reCompressed) {
		this.reCompressed = reCompressed;
	}

	public long getReMulticast() {
		return reMulticast;
	}

	public void setReMulticast(long reMulticast) {
		this.reMulticast = reMulticast;
	}

	public long getTrBytes() {
		return trBytes;
	}

	public void setTrBytes(long trBytes) {
		this.trBytes = trBytes;
	}

	public long getTrPackets() {
		return trPackets;
	}

	public void setTrPackets(long trPackets) {
		this.trPackets = trPackets;
	}

	public long getTrErrs() {
		return trErrs;
	}

	public void setTrErrs(long trErrs) {
		this.trErrs = trErrs;
	}

	public long getTrDrop() {
		return trDrop;
	}

	public void setTrDrop(long trDrop) {
		this.trDrop = trDrop;
	}

	public long getTrFifo() {
		return trFifo;
	}

	public void setTrFifo(long trFifo) {
		this.trFifo = trFifo;
	}

	public long getTrColls() {
		return trColls;
	}

	public void setTrColls(long trColls) {
		this.trColls = trColls;
	}

	public long getTrCarrier() {
		return trCarrier;
	}

	public void setTrCarrier(long trCarrier) {
		this.trCarrier = trCarrier;
	}

	public long getTrCompressed() {
		return trCompressed;
	}

	public void setTrCompressed(long trCompressed) {
		this.trCompressed = trCompressed;
	}
	
	

}

