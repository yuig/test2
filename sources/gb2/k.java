package gb2;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import wa2.a0;

/* loaded from: classes4.dex */
public final class k extends l {

    /* renamed from: a, reason: collision with root package name */
    public final String f64758a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f64759b;

    /* renamed from: c, reason: collision with root package name */
    public final String f64760c;

    /* renamed from: d, reason: collision with root package name */
    public final d f64761d;

    public k(String uid, a0 overlayState, String pinnedToLocationName, d savedLocationUid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(overlayState, "overlayState");
        Intrinsics.checkNotNullParameter(pinnedToLocationName, "pinnedToLocationName");
        Intrinsics.checkNotNullParameter(savedLocationUid, "savedLocationUid");
        this.f64758a = uid;
        this.f64759b = overlayState;
        this.f64760c = pinnedToLocationName;
        this.f64761d = savedLocationUid;
    }

    @Override // gb2.l
    public final String a() {
        return this.f64758a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f64758a, kVar.f64758a) && this.f64759b == kVar.f64759b && Intrinsics.d(this.f64760c, kVar.f64760c) && Intrinsics.d(this.f64761d, kVar.f64761d);
    }

    public final int hashCode() {
        return this.f64761d.hashCode() + cb.d(this.f64760c, (this.f64759b.hashCode() + (this.f64758a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "PinOverlayUpdate(uid=" + this.f64758a + ", overlayState=" + this.f64759b + ", pinnedToLocationName=" + this.f64760c + ", savedLocationUid=" + this.f64761d + ")";
    }
}
