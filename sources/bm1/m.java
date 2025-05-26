package bm1;

import kotlin.jvm.internal.Intrinsics;
import u50.h0;
import u50.i0;
import u50.k0;

/* loaded from: classes5.dex */
public final class m implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final o f23507a;

    /* renamed from: b, reason: collision with root package name */
    public final n f23508b;

    /* renamed from: c, reason: collision with root package name */
    public final l f23509c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23510d;

    /* renamed from: e, reason: collision with root package name */
    public final fm1.c f23511e;

    /* renamed from: f, reason: collision with root package name */
    public final int f23512f;

    /* renamed from: g, reason: collision with root package name */
    public final i0 f23513g;

    public /* synthetic */ m(o oVar, n nVar, b bVar, boolean z13, fm1.c cVar, int i13, k0 k0Var, int i14) {
        this((i14 & 1) != 0 ? o.LARGE : oVar, (i14 & 2) != 0 ? n.UNSELECTED : nVar, (i14 & 4) != 0 ? new j() : bVar, (i14 & 8) != 0 ? true : z13, (i14 & 16) != 0 ? fm1.c.VISIBLE : cVar, (i14 & 32) != 0 ? Integer.MIN_VALUE : i13, (i14 & 64) != 0 ? h0.f120562a : k0Var);
    }

    public static m e(m mVar, o oVar, n nVar, l lVar, boolean z13, fm1.c cVar, int i13, k0 k0Var, int i14) {
        o size = (i14 & 1) != 0 ? mVar.f23507a : oVar;
        n selectedState = (i14 & 2) != 0 ? mVar.f23508b : nVar;
        l buttonType = (i14 & 4) != 0 ? mVar.f23509c : lVar;
        boolean z14 = (i14 & 8) != 0 ? mVar.f23510d : z13;
        fm1.c visibility = (i14 & 16) != 0 ? mVar.f23511e : cVar;
        int i15 = (i14 & 32) != 0 ? mVar.f23512f : i13;
        i0 contentDescription = (i14 & 64) != 0 ? mVar.f23513g : k0Var;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(selectedState, "selectedState");
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        return new m(size, selectedState, buttonType, z14, visibility, i15, contentDescription);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f23507a == mVar.f23507a && this.f23508b == mVar.f23508b && Intrinsics.d(this.f23509c, mVar.f23509c) && this.f23510d == mVar.f23510d && this.f23511e == mVar.f23511e && this.f23512f == mVar.f23512f && Intrinsics.d(this.f23513g, mVar.f23513g);
    }

    public final int hashCode() {
        return this.f23513g.hashCode() + ep.b.b(this.f23512f, d7.g.a(this.f23511e, ep.b.e(this.f23510d, (this.f23509c.hashCode() + ((this.f23508b.hashCode() + (this.f23507a.hashCode() * 31)) * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(size=");
        sb3.append(this.f23507a);
        sb3.append(", selectedState=");
        sb3.append(this.f23508b);
        sb3.append(", buttonType=");
        sb3.append(this.f23509c);
        sb3.append(", enabled=");
        sb3.append(this.f23510d);
        sb3.append(", visibility=");
        sb3.append(this.f23511e);
        sb3.append(", id=");
        sb3.append(this.f23512f);
        sb3.append(", contentDescription=");
        return jq.b.k(sb3, this.f23513g, ")");
    }

    public m(o size, n selectedState, l buttonType, boolean z13, fm1.c visibility, int i13, i0 contentDescription) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(selectedState, "selectedState");
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        this.f23507a = size;
        this.f23508b = selectedState;
        this.f23509c = buttonType;
        this.f23510d = z13;
        this.f23511e = visibility;
        this.f23512f = i13;
        this.f23513g = contentDescription;
    }
}
