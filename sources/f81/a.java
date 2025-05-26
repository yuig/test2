package f81;

import a.cb;
import d7.g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f61418a;

    /* renamed from: b, reason: collision with root package name */
    public final int f61419b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f61420c;

    /* renamed from: d, reason: collision with root package name */
    public final String f61421d;

    /* renamed from: e, reason: collision with root package name */
    public final float f61422e;

    /* renamed from: f, reason: collision with root package name */
    public final float f61423f;

    public a(String pinId, int i13, boolean z13, float f13, float f14, int i14) {
        z13 = (i14 & 4) != 0 ? false : z13;
        f13 = (i14 & 16) != 0 ? -1.0f : f13;
        f14 = (i14 & 32) != 0 ? -1.0f : f14;
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter("", "requestParams");
        this.f61418a = pinId;
        this.f61419b = i13;
        this.f61420c = z13;
        this.f61421d = "";
        this.f61422e = f13;
        this.f61423f = f14;
    }

    public final String a() {
        return this.f61418a;
    }

    public final String b() {
        return this.f61421d;
    }

    public final int c() {
        return this.f61419b;
    }

    public final float d() {
        return this.f61422e;
    }

    public final float e() {
        return this.f61423f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f61418a, aVar.f61418a) && this.f61419b == aVar.f61419b && this.f61420c == aVar.f61420c && Intrinsics.d(this.f61421d, aVar.f61421d) && Float.compare(this.f61422e, aVar.f61422e) == 0 && Float.compare(this.f61423f, aVar.f61423f) == 0;
    }

    public final boolean f() {
        return this.f61420c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f61423f) + a.a.a(this.f61422e, cb.d(this.f61421d, ep.b.e(this.f61420c, ep.b.b(this.f61419b, this.f61418a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CloseupDotTapEvent(pinId=");
        sb3.append(this.f61418a);
        sb3.append(", selectedDotIndex=");
        sb3.append(this.f61419b);
        sb3.append(", showProductPinsOnly=");
        sb3.append(this.f61420c);
        sb3.append(", requestParams=");
        sb3.append(this.f61421d);
        sb3.append(", selectedX=");
        sb3.append(this.f61422e);
        sb3.append(", selectedY=");
        return g.i(sb3, this.f61423f, ")");
    }
}
