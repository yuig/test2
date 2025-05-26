package yl1;

import kotlin.jvm.internal.Intrinsics;
import rm1.q;
import u50.f0;
import u50.i0;
import u50.k0;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public i0 f139348a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f139349b;

    /* renamed from: c, reason: collision with root package name */
    public fm1.c f139350c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f139351d;

    /* renamed from: e, reason: collision with root package name */
    public g f139352e;

    /* renamed from: f, reason: collision with root package name */
    public c f139353f;

    /* renamed from: g, reason: collision with root package name */
    public q f139354g;

    /* renamed from: h, reason: collision with root package name */
    public q f139355h;

    /* renamed from: i, reason: collision with root package name */
    public int f139356i;

    /* renamed from: j, reason: collision with root package name */
    public e f139357j;

    public l(b displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f139348a = displayState.f139300a;
        this.f139349b = displayState.f139301b;
        this.f139350c = displayState.f139302c;
        this.f139351d = displayState.f139303d;
        this.f139352e = displayState.f139304e;
        this.f139353f = displayState.f139305f;
        this.f139354g = displayState.f139306g;
        this.f139355h = displayState.f139307h;
        this.f139356i = displayState.f139308i;
        this.f139357j = displayState.f139309j;
    }

    public final void a(g colorPalette) {
        Intrinsics.checkNotNullParameter(colorPalette, "colorPalette");
        this.f139352e = colorPalette;
    }

    public final void b(c size) {
        Intrinsics.checkNotNullParameter(size, "size");
        this.f139353f = size;
    }

    public final void c(int i13) {
        this.f139348a = new k0(i13);
    }

    public final void d(CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f139348a = new f0(text);
    }

    public final void e(fm1.c visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.f139350c = visibility;
    }

    public final void f(e width) {
        Intrinsics.checkNotNullParameter(width, "width");
        this.f139357j = width;
    }
}
