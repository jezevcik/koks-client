package koks.event;

import koks.api.event.Event;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class RenderEntityOutlineFramebufferEvent extends Event {
    int srcFactor, dstFactor, srcFactorAlpha, dstFactorAlpha;
}
