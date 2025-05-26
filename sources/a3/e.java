package a3;

import a.cb;
import kh2.s0;
import lb.l0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f488a;

    /* renamed from: b, reason: collision with root package name */
    public final float f489b;

    /* renamed from: c, reason: collision with root package name */
    public final float f490c;

    /* renamed from: d, reason: collision with root package name */
    public final float f491d;

    /* renamed from: e, reason: collision with root package name */
    public final long f492e;

    /* renamed from: f, reason: collision with root package name */
    public final long f493f;

    /* renamed from: g, reason: collision with root package name */
    public final long f494g;

    /* renamed from: h, reason: collision with root package name */
    public final long f495h;

    static {
        long j13 = a.f476a;
        l0.c(a.b(j13), a.c(j13));
    }

    public e(float f13, float f14, float f15, float f16, long j13, long j14, long j15, long j16) {
        this.f488a = f13;
        this.f489b = f14;
        this.f490c = f15;
        this.f491d = f16;
        this.f492e = j13;
        this.f493f = j14;
        this.f494g = j15;
        this.f495h = j16;
    }

    public final float a() {
        return this.f491d - this.f489b;
    }

    public final float b() {
        return this.f490c - this.f488a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f488a, eVar.f488a) == 0 && Float.compare(this.f489b, eVar.f489b) == 0 && Float.compare(this.f490c, eVar.f490c) == 0 && Float.compare(this.f491d, eVar.f491d) == 0 && a.a(this.f492e, eVar.f492e) && a.a(this.f493f, eVar.f493f) && a.a(this.f494g, eVar.f494g) && a.a(this.f495h, eVar.f495h);
    }

    public final int hashCode() {
        int a13 = a.a.a(this.f491d, a.a.a(this.f490c, a.a.a(this.f489b, Float.hashCode(this.f488a) * 31, 31), 31), 31);
        int i13 = a.f477b;
        return Long.hashCode(this.f495h) + a.a.c(this.f494g, a.a.c(this.f493f, a.a.c(this.f492e, a13, 31), 31), 31);
    }

    public final String toString() {
        String str = s0.a1(this.f488a) + ", " + s0.a1(this.f489b) + ", " + s0.a1(this.f490c) + ", " + s0.a1(this.f491d);
        long j13 = this.f492e;
        long j14 = this.f493f;
        boolean a13 = a.a(j13, j14);
        long j15 = this.f494g;
        long j16 = this.f495h;
        if (!a13 || !a.a(j14, j15) || !a.a(j15, j16)) {
            StringBuilder o13 = cb.o("RoundRect(rect=", str, ", topLeft=");
            o13.append((Object) a.d(j13));
            o13.append(", topRight=");
            o13.append((Object) a.d(j14));
            o13.append(", bottomRight=");
            o13.append((Object) a.d(j15));
            o13.append(", bottomLeft=");
            o13.append((Object) a.d(j16));
            o13.append(')');
            return o13.toString();
        }
        if (a.b(j13) == a.c(j13)) {
            StringBuilder o14 = cb.o("RoundRect(rect=", str, ", radius=");
            o14.append(s0.a1(a.b(j13)));
            o14.append(')');
            return o14.toString();
        }
        StringBuilder o15 = cb.o("RoundRect(rect=", str, ", x=");
        o15.append(s0.a1(a.b(j13)));
        o15.append(", y=");
        o15.append(s0.a1(a.c(j13)));
        o15.append(')');
        return o15.toString();
    }
}
