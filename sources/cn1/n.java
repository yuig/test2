package cn1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u50.k0;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public u50.i0 f28209a;

    /* renamed from: b, reason: collision with root package name */
    public u50.i0 f28210b;

    /* renamed from: c, reason: collision with root package name */
    public u50.i0 f28211c;

    /* renamed from: d, reason: collision with root package name */
    public u50.i0 f28212d;

    /* renamed from: e, reason: collision with root package name */
    public final rm1.q f28213e;

    /* renamed from: f, reason: collision with root package name */
    public f f28214f;

    /* renamed from: g, reason: collision with root package name */
    public f f28215g;

    /* renamed from: h, reason: collision with root package name */
    public e f28216h;

    /* renamed from: i, reason: collision with root package name */
    public c f28217i;

    /* renamed from: j, reason: collision with root package name */
    public g f28218j;

    /* renamed from: k, reason: collision with root package name */
    public dn1.e f28219k;

    /* renamed from: l, reason: collision with root package name */
    public final List f28220l;

    /* renamed from: m, reason: collision with root package name */
    public final List f28221m;

    /* renamed from: n, reason: collision with root package name */
    public final List f28222n;

    /* renamed from: o, reason: collision with root package name */
    public fm1.c f28223o;

    /* renamed from: p, reason: collision with root package name */
    public final c f28224p;

    /* renamed from: q, reason: collision with root package name */
    public final c f28225q;

    /* renamed from: r, reason: collision with root package name */
    public final int f28226r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f28227s;

    public n(d displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f28209a = displayState.f28152a;
        this.f28210b = displayState.f28153b;
        this.f28211c = displayState.f28154c;
        this.f28212d = displayState.f28155d;
        this.f28213e = displayState.f28156e;
        this.f28214f = displayState.f28157f;
        this.f28215g = displayState.f28158g;
        this.f28216h = displayState.f28159h;
        this.f28217i = displayState.f28160i;
        this.f28218j = displayState.f28161j;
        this.f28219k = displayState.f28162k;
        this.f28220l = displayState.f28163l;
        this.f28221m = displayState.f28164m;
        this.f28222n = displayState.f28165n;
        this.f28223o = displayState.f28166o;
        this.f28224p = displayState.f28167p;
        this.f28225q = displayState.f28168q;
        this.f28226r = displayState.f28169r;
        this.f28227s = displayState.f28170s;
    }

    public final d a() {
        return new d(this.f28209a, this.f28210b, this.f28211c, this.f28212d, this.f28213e, this.f28214f, this.f28215g, this.f28216h, this.f28217i, this.f28218j, this.f28219k, this.f28220l, this.f28221m, this.f28222n, this.f28223o, this.f28224p, this.f28225q, this.f28226r, this.f28227s);
    }

    public final void b(int i13) {
        this.f28211c = new k0(i13);
    }

    public final void c() {
        this.f28212d = new u50.f0("Search your pins");
    }

    public final void d(int i13) {
        this.f28210b = new k0(i13);
    }

    public final void e(dn1.e variant) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.f28219k = variant;
    }
}
