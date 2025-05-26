package k1;

import android.content.Context;
import android.widget.EdgeEffect;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f77962a;

    /* renamed from: b, reason: collision with root package name */
    public final int f77963b;

    /* renamed from: c, reason: collision with root package name */
    public long f77964c = 0;

    /* renamed from: d, reason: collision with root package name */
    public EdgeEffect f77965d;

    /* renamed from: e, reason: collision with root package name */
    public EdgeEffect f77966e;

    /* renamed from: f, reason: collision with root package name */
    public EdgeEffect f77967f;

    /* renamed from: g, reason: collision with root package name */
    public EdgeEffect f77968g;

    /* renamed from: h, reason: collision with root package name */
    public EdgeEffect f77969h;

    /* renamed from: i, reason: collision with root package name */
    public EdgeEffect f77970i;

    /* renamed from: j, reason: collision with root package name */
    public EdgeEffect f77971j;

    /* renamed from: k, reason: collision with root package name */
    public EdgeEffect f77972k;

    public p0(Context context, int i13) {
        this.f77962a = context;
        this.f77963b = i13;
    }

    public static boolean j(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean n(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(lp2.b.h(edgeEffect) == 0.0f);
    }

    public final EdgeEffect a() {
        EdgeEffect c13 = lp2.b.c(this.f77962a);
        c13.setColor(this.f77963b);
        if (!n4.j.a(this.f77964c, 0L)) {
            long j13 = this.f77964c;
            c13.setSize((int) (j13 >> 32), (int) (j13 & 4294967295L));
        }
        return c13;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f77966e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a13 = a();
        this.f77966e = a13;
        return a13;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f77970i;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a13 = a();
        this.f77970i = a13;
        return a13;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.f77967f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a13 = a();
        this.f77967f = a13;
        return a13;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f77971j;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a13 = a();
        this.f77971j = a13;
        return a13;
    }

    public final EdgeEffect f() {
        EdgeEffect edgeEffect = this.f77968g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a13 = a();
        this.f77968g = a13;
        return a13;
    }

    public final EdgeEffect g() {
        EdgeEffect edgeEffect = this.f77972k;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a13 = a();
        this.f77972k = a13;
        return a13;
    }

    public final EdgeEffect h() {
        EdgeEffect edgeEffect = this.f77965d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a13 = a();
        this.f77965d = a13;
        return a13;
    }

    public final EdgeEffect i() {
        EdgeEffect edgeEffect = this.f77969h;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a13 = a();
        this.f77969h = a13;
        return a13;
    }

    public final boolean k() {
        return n(this.f77966e);
    }

    public final boolean l() {
        return n(this.f77967f);
    }

    public final boolean m() {
        return n(this.f77968g);
    }

    public final boolean o() {
        return n(this.f77965d);
    }
}
