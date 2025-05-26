package ek1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final List f59328a;

    /* renamed from: b, reason: collision with root package name */
    public final az.b f59329b;

    /* renamed from: c, reason: collision with root package name */
    public final q f59330c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f59331d;

    /* renamed from: e, reason: collision with root package name */
    public final qa2.m f59332e;

    public r(List pieceDisplayStates, az.b impressionDisplayState, q action, boolean z13, qa2.m pinSpec) {
        Intrinsics.checkNotNullParameter(pieceDisplayStates, "pieceDisplayStates");
        Intrinsics.checkNotNullParameter(impressionDisplayState, "impressionDisplayState");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(pinSpec, "pinSpec");
        this.f59328a = pieceDisplayStates;
        this.f59329b = impressionDisplayState;
        this.f59330c = action;
        this.f59331d = z13;
        this.f59332e = pinSpec;
    }

    public static r e(r rVar, List list, az.b bVar, q qVar, boolean z13, qa2.m mVar, int i13) {
        if ((i13 & 1) != 0) {
            list = rVar.f59328a;
        }
        List pieceDisplayStates = list;
        if ((i13 & 2) != 0) {
            bVar = rVar.f59329b;
        }
        az.b impressionDisplayState = bVar;
        if ((i13 & 4) != 0) {
            qVar = rVar.f59330c;
        }
        q action = qVar;
        if ((i13 & 8) != 0) {
            z13 = rVar.f59331d;
        }
        boolean z14 = z13;
        if ((i13 & 16) != 0) {
            mVar = rVar.f59332e;
        }
        qa2.m pinSpec = mVar;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(pieceDisplayStates, "pieceDisplayStates");
        Intrinsics.checkNotNullParameter(impressionDisplayState, "impressionDisplayState");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(pinSpec, "pinSpec");
        return new r(pieceDisplayStates, impressionDisplayState, action, z14, pinSpec);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f59328a, rVar.f59328a) && Intrinsics.d(this.f59329b, rVar.f59329b) && Intrinsics.d(this.f59330c, rVar.f59330c) && this.f59331d == rVar.f59331d && Intrinsics.d(this.f59332e, rVar.f59332e);
    }

    public final int hashCode() {
        return this.f59332e.hashCode() + ep.b.e(this.f59331d, (this.f59330c.hashCode() + ((this.f59329b.hashCode() + (this.f59328a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "MediaZoneDisplayState(pieceDisplayStates=" + this.f59328a + ", impressionDisplayState=" + this.f59329b + ", action=" + this.f59330c + ", mediaLoaded=" + this.f59331d + ", pinSpec=" + this.f59332e + ")";
    }

    public r() {
        this(kotlin.collections.q0.f80391a, new az.b(), n.f59285a, false, new qa2.m(0, 0, 0, 0, (qa2.c1) null, 63));
    }
}
