package com.product.MMSRouter;

public class MMSInfo {
	
	private final String deviceId;
	
	private final String url;
	
	private final String maxAttachmentSizeBytes;

	public MMSInfo(String deviceId, String url, String maxAttachmentSizeBytes) {
		this.deviceId = deviceId;
		this.url = url;
		this.maxAttachmentSizeBytes = maxAttachmentSizeBytes;
	}

	public MMSInfo(MMSInfo prototype) {
		this.deviceId = prototype.deviceId;
		this.url = prototype.getUrl();
		this.maxAttachmentSizeBytes = prototype.getMaxAttachmentSizeBytes();
	}

	public String getDeviceId() {
		return deviceId;
	}

	public String getUrl() {
		return url;
	}

	public String getMaxAttachmentSizeBytes() {
		return maxAttachmentSizeBytes;
	}
	
	
	
	

}
