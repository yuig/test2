package r72;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public abstract class n extends j0 {
    @Override // r72.j0
    public String toString() {
        if (this instanceof l) {
            return "Shadow";
        }
        if (this instanceof j) {
            return "Outline";
        }
        if (this instanceof m) {
            return "Stamp";
        }
        if (this instanceof k) {
            return "Ripped";
        }
        if (this instanceof h) {
            return "ComingSoon";
        }
        if (this instanceof i) {
            return "None";
        }
        throw new NoWhenBranchMatchedException();
    }
}
