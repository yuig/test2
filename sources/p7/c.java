package p7;

import pk.c1;
import pk.v2;
import pk.y0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f98934a;

    /* renamed from: b, reason: collision with root package name */
    public final int f98935b;

    /* renamed from: c, reason: collision with root package name */
    public final int f98936c;

    /* renamed from: d, reason: collision with root package name */
    public final int f98937d;

    /* renamed from: e, reason: collision with root package name */
    public final int f98938e;

    /* renamed from: f, reason: collision with root package name */
    public final int f98939f;

    /* renamed from: g, reason: collision with root package name */
    public final int f98940g;

    /* renamed from: h, reason: collision with root package name */
    public final c1 f98941h;

    public c(int i13, int i14, int[] iArr, int i15, int i16, int i17, int i18, v2 v2Var) {
        this.f98935b = i13;
        this.f98934a = iArr;
        this.f98936c = i14;
        this.f98938e = i15;
        this.f98939f = i16;
        this.f98940g = i17;
        this.f98937d = i18;
        this.f98941h = v2Var;
    }

    public static c a(int[] iArr, int i13, v2 v2Var) {
        return new c(3, 1, iArr, i13, -1, -1, -1, v2Var);
    }

    public static c b(int[] iArr, int i13) {
        y0 y0Var = c1.f100372b;
        return new c(5, 1, iArr, i13, -1, -1, -1, v2.f100502e);
    }

    public static c c(int i13) {
        y0 y0Var = c1.f100372b;
        return new c(5, 2, new int[0], -1, -1, -1, i13, v2.f100502e);
    }
}
