package dy0;

import h32.a4;

/* loaded from: classes5.dex */
public final class s implements u {

    /* renamed from: a, reason: collision with root package name */
    public final a4 f56613a;

    public s(a4 a4Var) {
        this.f56613a = a4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.f56613a == ((s) obj).f56613a;
    }

    public final int hashCode() {
        a4 a4Var = this.f56613a;
        if (a4Var == null) {
            return 0;
        }
        return a4Var.hashCode();
    }

    public final String toString() {
        return "SavePinSelections(viewParameter=" + this.f56613a + ")";
    }
}
