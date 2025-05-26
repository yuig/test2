package r72;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public abstract class i0 extends j0 {
    @Override // r72.j0
    public String toString() {
        if (this instanceof z) {
            return "None";
        }
        if (this instanceof u) {
            return "ComingSoon";
        }
        if (this instanceof h0) {
            return "Wobbly";
        }
        if (this instanceof g0) {
            return "Watery";
        }
        if (this instanceof x) {
            return "Floaty";
        }
        if (this instanceof c0) {
            return "Shaky";
        }
        if (this instanceof d0) {
            return "Slide";
        }
        if (this instanceof b0) {
            return "Scaly";
        }
        if (this instanceof f0) {
            return "Swivel";
        }
        if (this instanceof a0) {
            return "Rotate";
        }
        if (this instanceof e0) {
            return "Spinny";
        }
        if (this instanceof w) {
            return "Fade";
        }
        if (this instanceof t) {
            return "Carousel";
        }
        if (this instanceof y) {
            return "Glitch";
        }
        if (this instanceof v) {
            return "EchoNew";
        }
        throw new NoWhenBranchMatchedException();
    }
}
