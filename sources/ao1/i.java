package ao1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u50.f0;
import u50.i0;
import u50.k0;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public i0 f20084a;

    /* renamed from: b, reason: collision with root package name */
    public i0 f20085b;

    /* renamed from: c, reason: collision with root package name */
    public i0 f20086c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20087d;

    /* renamed from: e, reason: collision with root package name */
    public i0 f20088e;

    /* renamed from: f, reason: collision with root package name */
    public yn1.f f20089f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20090g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20091h;

    /* renamed from: i, reason: collision with root package name */
    public int f20092i;

    /* renamed from: j, reason: collision with root package name */
    public int f20093j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f20094k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f20095l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f20096m;

    /* renamed from: n, reason: collision with root package name */
    public fm1.c f20097n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f20098o;

    /* renamed from: p, reason: collision with root package name */
    public Integer f20099p;

    /* renamed from: q, reason: collision with root package name */
    public final List f20100q;

    /* renamed from: r, reason: collision with root package name */
    public final List f20101r;

    /* renamed from: s, reason: collision with root package name */
    public final List f20102s;

    /* renamed from: t, reason: collision with root package name */
    public final List f20103t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f20104u;

    /* renamed from: v, reason: collision with root package name */
    public final int f20105v;

    public i(b displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f20084a = displayState.f20030a;
        this.f20085b = displayState.f20031b;
        this.f20086c = displayState.f20032c;
        this.f20087d = displayState.f20033d;
        this.f20088e = displayState.f20034e;
        this.f20089f = displayState.f20035f;
        this.f20090g = displayState.f20036g;
        this.f20091h = displayState.f20037h;
        this.f20092i = displayState.f20038i;
        this.f20093j = displayState.f20039j;
        this.f20094k = displayState.f20040k;
        this.f20095l = displayState.f20041l;
        this.f20096m = displayState.f20042m;
        this.f20097n = displayState.f20043n;
        this.f20098o = displayState.f20044o;
        this.f20099p = displayState.f20045p;
        this.f20100q = displayState.f20046q;
        this.f20101r = displayState.f20047r;
        this.f20102s = displayState.f20048s;
        this.f20103t = displayState.f20049t;
        this.f20104u = displayState.f20050u;
        this.f20105v = displayState.f20051v;
    }

    public final void a(int i13) {
        this.f20086c = new k0(i13);
    }

    public final void b(int i13) {
        this.f20085b = new k0(i13);
    }

    public final void c(int i13) {
        this.f20084a = new k0(i13);
    }

    public final void d(CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f20084a = new f0(text);
    }

    public final void e(yn1.f variant) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.f20089f = variant;
    }
}
