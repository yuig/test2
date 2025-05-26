package zc2;

import l82.i0;

/* loaded from: classes4.dex */
public final class r implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f141642a;

    public r(int i13) {
        this.f141642a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.f141642a == ((r) obj).f141642a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f141642a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("WidgetBoardConfigurationVMState(widgetId="), this.f141642a, ")");
    }
}
