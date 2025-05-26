package r1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m1.c1;
import p1.x0;

/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f105896i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f105897j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.q f105898k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p0 f105899l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x0 f105900m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f105901n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p1.j f105902o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p1.h f105903p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ c1 f105904q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f105905r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Function1 f105906s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f105907t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f105908u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(c cVar, u2.q qVar, p0 p0Var, x0 x0Var, boolean z13, p1.h hVar, p1.j jVar, c1 c1Var, boolean z14, Function1 function1, int i13, int i14) {
        super(2);
        this.f105897j = cVar;
        this.f105898k = qVar;
        this.f105899l = p0Var;
        this.f105900m = x0Var;
        this.f105901n = z13;
        this.f105903p = hVar;
        this.f105902o = jVar;
        this.f105904q = c1Var;
        this.f105905r = z14;
        this.f105906s = function1;
        this.f105907t = i13;
        this.f105908u = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f105896i;
        int i15 = this.f105907t;
        switch (i14) {
            case 0:
                bp1.h.b(i2.u.p(i15 | 1), this.f105908u, this.f105904q, this.f105903p, this.f105902o, this.f105900m, this.f105897j, this.f105899l, oVar, this.f105898k, this.f105906s, this.f105901n, this.f105905r);
                break;
            default:
                bp1.h.c(i2.u.p(i15 | 1), this.f105908u, this.f105904q, this.f105903p, this.f105902o, this.f105900m, this.f105897j, this.f105899l, oVar, this.f105898k, this.f105906s, this.f105901n, this.f105905r);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f105896i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(c cVar, u2.q qVar, p0 p0Var, x0 x0Var, boolean z13, p1.j jVar, p1.h hVar, c1 c1Var, boolean z14, Function1 function1, int i13, int i14) {
        super(2);
        this.f105897j = cVar;
        this.f105898k = qVar;
        this.f105899l = p0Var;
        this.f105900m = x0Var;
        this.f105901n = z13;
        this.f105902o = jVar;
        this.f105903p = hVar;
        this.f105904q = c1Var;
        this.f105905r = z14;
        this.f105906s = function1;
        this.f105907t = i13;
        this.f105908u = i14;
    }
}
