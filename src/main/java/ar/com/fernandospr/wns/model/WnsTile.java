package ar.com.fernandospr.wns.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import ar.com.fernandospr.wns.model.types.WnsNotificationType;

/**
 * From <a href="http://msdn.microsoft.com/en-us/library/windows/apps/br230841.aspx">http://msdn.microsoft.com/en-us/library/windows/apps/br230841.aspx</a>
 */
@XmlRootElement(name = "tile")
public class WnsTile extends WnsAbstractNotification {
	
	@XmlElement(name = "visual")
	public WnsVisual visual;
	
	@Override
	public String getType() {
		return WnsNotificationType.TILE;
	}
}
