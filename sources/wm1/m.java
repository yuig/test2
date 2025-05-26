package wm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m extends n {

    /* renamed from: c, reason: collision with root package name */
    public final u50.i0 f130319c;

    /* renamed from: d, reason: collision with root package name */
    public final d f130320d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f130321e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(u50.i0 text, d icon, boolean z13) {
        super(o.TEXTICON, true);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f130319c = text;
        this.f130320d = icon;
        this.f130321e = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f130319c, mVar.f130319c) && this.f130320d == mVar.f130320d && this.f130321e == mVar.f130321e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f130321e) + ((this.f130320d.hashCode() + (this.f130319c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TextIconDisplayState(text=");
        sb3.append(this.f130319c);
        sb3.append(", icon=");
        sb3.append(this.f130320d);
        sb3.append(", supportLinks=");
        return a.a.r(sb3, this.f130321e, ")");
    }
}
