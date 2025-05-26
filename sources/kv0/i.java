package kv0;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import jk2.h0;
import jk2.j1;
import jk2.u0;
import kotlin.Pair;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import lh0.s1;
import uj2.b0;
import x02.i2;

/* loaded from: classes5.dex */
public final class i implements jv0.i {

    /* renamed from: a, reason: collision with root package name */
    public final aq.j f80968a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f80969b;

    /* renamed from: c, reason: collision with root package name */
    public final i2 f80970c;

    /* renamed from: d, reason: collision with root package name */
    public final h22.c f80971d;

    /* renamed from: e, reason: collision with root package name */
    public final s1 f80972e;

    /* renamed from: f, reason: collision with root package name */
    public final uk2.d f80973f;

    /* renamed from: g, reason: collision with root package name */
    public final uk2.d f80974g;

    public i(aq.j editablePin, Context context, i2 pinRepository, h22.c storyPinPageRepository, s1 experiments) {
        Intrinsics.checkNotNullParameter(editablePin, "editablePin");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(storyPinPageRepository, "storyPinPageRepository");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f80968a = editablePin;
        this.f80969b = context;
        this.f80970c = pinRepository;
        this.f80971d = storyPinPageRepository;
        this.f80972e = experiments;
        this.f80973f = t3.s1.h("create(...)");
        this.f80974g = t3.s1.h("create(...)");
    }

    @Override // jv0.i
    public final void a(String pinId, boolean z13) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f80973f.c(new Pair(pinId, Boolean.valueOf(z13)));
    }

    @Override // jv0.i
    public final uj2.q b() {
        return this.f80974g;
    }

    @Override // jv0.i
    public final void c(u model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f80974g.c(model);
    }

    @Override // jv0.i
    public final uk2.d d() {
        return this.f80973f;
    }

    @Override // jv0.i
    public final uj2.q e() {
        boolean e13 = this.f80972e.e();
        int i13 = 4;
        int i14 = 2;
        int i15 = 0;
        aq.j jVar = this.f80968a;
        if (e13) {
            List s13 = jVar.s();
            if (s13 == null) {
                s13 = new ArrayList();
            }
            return new j1(new jk2.x(new ik2.b(4, b0.j(s13), new bv0.k(7, a.f80928o)), new bv0.k(20, a.f80929p), i14).t(new bv0.k(10, new g(this, i14))), new bv0.k(11, new g(this, 3)), i15).O().u();
        }
        if (jVar.y() != aq.e.STANDARD_PIN) {
            return new u0(new j1(this.f80971d.b(jVar.B(), q0.f80391a, false), new bv0.k(16, new g(this, i15)), i15), new bv0.k(8, a.f80927n), i15).t(new bv0.k(9, new g(this, 1))).O().u();
        }
        return new j1(new jk2.x(new u0(new j1(this.f80970c.P(jVar.B()).C(h0.f76488a), new bv0.k(12, a.f80930q), i15), new bv0.k(13, a.f80931r), i15), new bv0.k(21, a.f80932s), i14).t(new bv0.k(14, new g(this, i13))), new bv0.k(15, new g(this, 5)), i15).O().u();
    }
}
