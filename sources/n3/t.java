package n3;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final long f89125a;

    /* renamed from: b, reason: collision with root package name */
    public final long f89126b;

    /* renamed from: c, reason: collision with root package name */
    public final long f89127c;

    /* renamed from: d, reason: collision with root package name */
    public final long f89128d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f89129e;

    /* renamed from: f, reason: collision with root package name */
    public final float f89130f;

    /* renamed from: g, reason: collision with root package name */
    public final int f89131g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f89132h;

    /* renamed from: i, reason: collision with root package name */
    public final List f89133i;

    /* renamed from: j, reason: collision with root package name */
    public final long f89134j;

    /* renamed from: k, reason: collision with root package name */
    public final long f89135k;

    public t(long j13, long j14, long j15, long j16, boolean z13, float f13, int i13, boolean z14, ArrayList arrayList, long j17, long j18) {
        this.f89125a = j13;
        this.f89126b = j14;
        this.f89127c = j15;
        this.f89128d = j16;
        this.f89129e = z13;
        this.f89130f = f13;
        this.f89131g = i13;
        this.f89132h = z14;
        this.f89133i = arrayList;
        this.f89134j = j17;
        this.f89135k = j18;
    }

    public final boolean a() {
        return this.f89129e;
    }

    public final long b() {
        return this.f89128d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p.a(this.f89125a, tVar.f89125a) && this.f89126b == tVar.f89126b && a3.c.b(this.f89127c, tVar.f89127c) && a3.c.b(this.f89128d, tVar.f89128d) && this.f89129e == tVar.f89129e && Float.compare(this.f89130f, tVar.f89130f) == 0 && g0.a(this.f89131g, tVar.f89131g) && this.f89132h == tVar.f89132h && Intrinsics.d(this.f89133i, tVar.f89133i) && a3.c.b(this.f89134j, tVar.f89134j) && a3.c.b(this.f89135k, tVar.f89135k);
    }

    public final int hashCode() {
        return Long.hashCode(this.f89135k) + a.a.c(this.f89134j, ep.b.c(this.f89133i, ep.b.e(this.f89132h, ep.b.b(this.f89131g, a.a.a(this.f89130f, ep.b.e(this.f89129e, a.a.c(this.f89128d, a.a.c(this.f89127c, a.a.c(this.f89126b, Long.hashCode(this.f89125a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PointerInputEventData(id=");
        sb3.append((Object) p.b(this.f89125a));
        sb3.append(", uptime=");
        sb3.append(this.f89126b);
        sb3.append(", positionOnScreen=");
        sb3.append((Object) a3.c.j(this.f89127c));
        sb3.append(", position=");
        sb3.append((Object) a3.c.j(this.f89128d));
        sb3.append(", down=");
        sb3.append(this.f89129e);
        sb3.append(", pressure=");
        sb3.append(this.f89130f);
        sb3.append(", type=");
        int i13 = this.f89131g;
        sb3.append((Object) (i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb3.append(", activeHover=");
        sb3.append(this.f89132h);
        sb3.append(", historical=");
        sb3.append(this.f89133i);
        sb3.append(", scrollDelta=");
        sb3.append((Object) a3.c.j(this.f89134j));
        sb3.append(", originalEventPosition=");
        sb3.append((Object) a3.c.j(this.f89135k));
        sb3.append(')');
        return sb3.toString();
    }
}
