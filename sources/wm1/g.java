package wm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends n {

    /* renamed from: c, reason: collision with root package name */
    public final em1.b f130294c;

    /* renamed from: d, reason: collision with root package name */
    public final em1.e f130295d;

    /* renamed from: e, reason: collision with root package name */
    public final fm1.c f130296e;

    public /* synthetic */ g(em1.b bVar, em1.e eVar, int i13) {
        this((i13 & 1) != 0 ? em1.b.UNCHECKED : bVar, (i13 & 2) != 0 ? em1.e.ENABLED : eVar, fm1.c.VISIBLE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f130294c == gVar.f130294c && this.f130295d == gVar.f130295d && this.f130296e == gVar.f130296e;
    }

    public final int hashCode() {
        return this.f130296e.hashCode() + ((this.f130295d.hashCode() + (this.f130294c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CheckBoxDisplayState(checkedState=" + this.f130294c + ", enabledState=" + this.f130295d + ", visibility=" + this.f130296e + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(em1.b checkedState, em1.e enabledState, fm1.c visibility) {
        super(o.CHECKBOX, enabledState == em1.e.ENABLED);
        Intrinsics.checkNotNullParameter(checkedState, "checkedState");
        Intrinsics.checkNotNullParameter(enabledState, "enabledState");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.f130294c = checkedState;
        this.f130295d = enabledState;
        this.f130296e = visibility;
    }
}
