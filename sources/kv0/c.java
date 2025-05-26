package kv0;

import android.content.Context;
import jk2.j1;
import jk2.u0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import t3.s1;
import uj2.b0;
import x02.i2;

/* loaded from: classes5.dex */
public final class c implements jv0.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80940a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Context f80941b;

    /* renamed from: c, reason: collision with root package name */
    public final i2 f80942c;

    /* renamed from: d, reason: collision with root package name */
    public final uk2.d f80943d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f80944e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f80945f;

    public c(aq.j editablePin, Context context, i2 pinRepository) {
        Intrinsics.checkNotNullParameter(editablePin, "editablePin");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        this.f80944e = editablePin;
        this.f80941b = context;
        this.f80942c = pinRepository;
        this.f80943d = s1.h("create(...)");
        this.f80945f = s1.h("create(...)");
    }

    @Override // jv0.i
    public final void a(String pinId, boolean z13) {
        int i13 = this.f80940a;
        uk2.d dVar = this.f80943d;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(pinId, "pinId");
                dVar.c(new Pair(pinId, Boolean.valueOf(z13)));
                break;
            default:
                Intrinsics.checkNotNullParameter(pinId, "pinId");
                dVar.c(new Pair(pinId, Boolean.valueOf(z13)));
                break;
        }
    }

    @Override // jv0.i
    public final uj2.q b() {
        int i13 = this.f80940a;
        Object obj = this.f80945f;
        switch (i13) {
            case 0:
                int i14 = 2;
                j1 j1Var = new j1(new jk2.x(((i22.d) obj).D(), new bv0.k(19, new b(this, i14)), i14), new bv0.k(1, a.f80925l), 0);
                Intrinsics.checkNotNullExpressionValue(j1Var, "map(...)");
                return f(j1Var);
            default:
                return (uk2.d) obj;
        }
    }

    @Override // jv0.i
    public final void c(u model) {
        switch (this.f80940a) {
            case 0:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            default:
                Intrinsics.checkNotNullParameter(model, "model");
                ((uk2.d) this.f80945f).c(model);
                break;
        }
    }

    @Override // jv0.i
    public final uk2.d d() {
        return this.f80943d;
    }

    @Override // jv0.i
    public final uj2.q e() {
        int i13 = this.f80940a;
        Object obj = this.f80944e;
        switch (i13) {
            case 0:
                uj2.q j13 = ((i22.d) this.f80945f).M((String) obj).j();
                Intrinsics.checkNotNullExpressionValue(j13, "toObservable(...)");
                uj2.q u13 = f(j13).O().u();
                Intrinsics.checkNotNullExpressionValue(u13, "toObservable(...)");
                return u13;
            default:
                uj2.q u14 = new ik2.b(4, b0.j((aq.j) obj).k(new bv0.k(21, a.f80934u)), new bv0.k(22, a.f80935v)).t(new bv0.k(23, new au0.f(this, 19))).O().u();
                Intrinsics.checkNotNullExpressionValue(u14, "toObservable(...)");
                return u14;
        }
    }

    public final j1 f(uj2.q qVar) {
        bv0.k kVar = new bv0.k(2, a.f80923j);
        qVar.getClass();
        int i13 = 0;
        j1 j1Var = new j1(new u0(new j1(qVar, kVar, i13), new bv0.k(3, a.f80924k), i13).t(new bv0.k(4, new b(this, i13))), new bv0.k(5, new b(this, 1)), i13);
        Intrinsics.checkNotNullExpressionValue(j1Var, "map(...)");
        return j1Var;
    }

    public c(String draftId, Context context, i2 pinRepository, i22.d draftRepository) {
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(draftRepository, "draftRepository");
        this.f80944e = draftId;
        this.f80941b = context;
        this.f80942c = pinRepository;
        this.f80945f = draftRepository;
        this.f80943d = s1.h("create(...)");
    }
}
