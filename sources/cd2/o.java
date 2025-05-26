package cd2;

import l82.i0;

/* loaded from: classes4.dex */
public final class o implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f27569a;

    public o(int i13) {
        this.f27569a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.f27569a == ((o) obj).f27569a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27569a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("WidgetContentSelectionVMState(widgetId="), this.f27569a, ")");
    }
}
