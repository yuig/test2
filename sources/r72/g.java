package r72;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public abstract class g extends j0 {
    @Override // r72.j0
    public String toString() {
        if (this instanceof e) {
            return "None";
        }
        if (this instanceof f) {
            return "Shadows";
        }
        if (this instanceof d) {
            return "Highlights";
        }
        if (this instanceof b) {
            return "Alpha";
        }
        if (this instanceof c) {
            return "FadeGradient";
        }
        throw new NoWhenBranchMatchedException();
    }
}
