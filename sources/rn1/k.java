package rn1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u50.f0;
import u50.i0;
import u50.k0;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public i0 f108886a;

    /* renamed from: b, reason: collision with root package name */
    public vn1.c f108887b;

    /* renamed from: c, reason: collision with root package name */
    public List f108888c;

    /* renamed from: d, reason: collision with root package name */
    public List f108889d;

    /* renamed from: e, reason: collision with root package name */
    public vn1.g f108890e;

    /* renamed from: f, reason: collision with root package name */
    public int f108891f;

    /* renamed from: g, reason: collision with root package name */
    public fm1.c f108892g;

    /* renamed from: h, reason: collision with root package name */
    public b f108893h;

    /* renamed from: i, reason: collision with root package name */
    public rm1.d f108894i;

    /* renamed from: j, reason: collision with root package name */
    public rm1.d f108895j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f108896k;

    /* renamed from: l, reason: collision with root package name */
    public int f108897l;

    /* renamed from: m, reason: collision with root package name */
    public i0 f108898m;

    /* renamed from: n, reason: collision with root package name */
    public vn1.g f108899n;

    /* renamed from: o, reason: collision with root package name */
    public vn1.g f108900o;

    /* renamed from: p, reason: collision with root package name */
    public u50.n f108901p;

    /* renamed from: q, reason: collision with root package name */
    public Integer f108902q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f108903r;

    /* renamed from: s, reason: collision with root package name */
    public final vn1.d f108904s;

    /* renamed from: t, reason: collision with root package name */
    public fm1.a f108905t;

    /* renamed from: u, reason: collision with root package name */
    public final fm1.b f108906u;

    public k(a displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f108886a = displayState.f108849g;
        this.f108887b = displayState.f108850h;
        this.f108888c = displayState.f108851i;
        this.f108889d = displayState.f108852j;
        this.f108890e = displayState.f108853k;
        this.f108891f = displayState.f108854l;
        this.f108892g = displayState.f108855m;
        this.f108893h = displayState.f108856n;
        this.f108894i = displayState.f108857o;
        this.f108895j = displayState.f108858p;
        this.f108896k = displayState.f108859q;
        this.f108897l = displayState.f108860r;
        this.f108898m = displayState.f108861s;
        this.f108899n = displayState.f108862t;
        this.f108900o = displayState.f108863u;
        this.f108901p = displayState.f108864v;
        this.f108902q = displayState.f108865w;
        this.f108903r = displayState.f108866x;
        this.f108904s = displayState.f108867y;
        this.f108905t = displayState.f108868z;
        this.f108906u = displayState.A;
    }

    public final void a(List alignment) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.f108888c = alignment;
    }

    public final void b(vn1.c color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.f108887b = color;
    }

    public final void c(b ellipsize) {
        Intrinsics.checkNotNullParameter(ellipsize, "ellipsize");
        this.f108893h = ellipsize;
    }

    public final void d(List style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f108889d = style;
    }

    public final void e(int i13) {
        this.f108886a = new k0(i13);
    }

    public final void f(CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f108886a = new f0(text);
    }

    public final void g(i0 text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f108886a = text;
    }

    public final void h(vn1.g variant) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.f108890e = variant;
    }

    public final void i(fm1.c visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.f108892g = visibility;
    }
}
