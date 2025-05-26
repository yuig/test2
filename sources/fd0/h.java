package fd0;

import a.cb;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f61851a;

    /* renamed from: b, reason: collision with root package name */
    public final int f61852b;

    /* renamed from: c, reason: collision with root package name */
    public final e f61853c;

    /* renamed from: d, reason: collision with root package name */
    public final String f61854d;

    /* renamed from: e, reason: collision with root package name */
    public final int f61855e;

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f61856f;

    public h(int i13, int i14, e eVar, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f61851a = i13;
        this.f61852b = i14;
        this.f61853c = eVar;
        this.f61854d = value;
        this.f61855e = 0;
        this.f61856f = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f61851a == hVar.f61851a && this.f61852b == hVar.f61852b && Intrinsics.d(this.f61853c, hVar.f61853c) && Intrinsics.d(this.f61854d, hVar.f61854d) && this.f61855e == hVar.f61855e && Intrinsics.d(this.f61856f, hVar.f61856f);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f61852b, Integer.hashCode(this.f61851a) * 31, 31);
        e eVar = this.f61853c;
        int b14 = ep.b.b(this.f61855e, cb.d(this.f61854d, (b13 + (eVar == null ? 0 : eVar.hashCode())) * 31, 31), 31);
        Function0 function0 = this.f61856f;
        return b14 + (function0 != null ? function0.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StatRowState(name=");
        sb3.append(this.f61851a);
        sb3.append(", range=");
        sb3.append(this.f61852b);
        sb3.append(", delta=");
        sb3.append(this.f61853c);
        sb3.append(", value=");
        sb3.append(this.f61854d);
        sb3.append(", badge=");
        sb3.append(this.f61855e);
        sb3.append(", seeMoreAction=");
        return pk2.f.i(sb3, this.f61856f, ")");
    }
}
