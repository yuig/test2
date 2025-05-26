package a12;

import dl1.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import uj2.f0;
import uj2.l;
import x02.e;
import x02.f;
import x02.g;
import x02.h;
import x02.j;
import x02.k;
import x02.m;
import x02.n;
import x02.o;
import x02.p;
import x02.q;

/* loaded from: classes4.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f371i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f372j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u f373k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, u uVar) {
        super(1);
        this.f371i = 1;
        this.f372j = cVar;
        this.f373k = uVar;
    }

    public final f0 b(String fields) {
        String str;
        int i13 = this.f371i;
        u uVar = this.f373k;
        c cVar = this.f372j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(fields, "fields");
                h hVar = (h) uVar;
                if (hVar instanceof f) {
                    f fVar = (f) uVar;
                    cVar.getClass();
                    return cVar.f374a.q(fVar.f131349g, fields, fVar.f131350h, cVar.f(fVar.f131351i), fVar.f131400e, fVar.f131352j);
                }
                if (!(hVar instanceof g)) {
                    if (!(hVar instanceof e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    e eVar = (e) uVar;
                    cVar.getClass();
                    return cVar.f374a.f(eVar.f131341g, fields, eVar.f131342h, cVar.f(eVar.f131343i), eVar.f131400e, eVar.f131344j, eVar.f131345k);
                }
                g gVar = (g) uVar;
                cVar.getClass();
                String str2 = gVar.f131378g;
                String f13 = cVar.f(gVar.f131380i);
                x02.d dVar = gVar.f131382k;
                if (dVar == null || (str = cVar.f375b.k(dVar)) == null) {
                    str = null;
                }
                return cVar.f374a.p(str2, fields, gVar.f131400e, gVar.f131379h, f13, str, gVar.f131381j, gVar.f131401f);
            default:
                Intrinsics.checkNotNullParameter(fields, "fields");
                return cVar.f374a.h(uVar.a(), fields);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f371i) {
            case 0:
                return b((String) obj);
            case 1:
                return b((String) obj);
            default:
                String fields = (String) obj;
                Intrinsics.checkNotNullParameter(fields, "fields");
                u uVar = this.f373k;
                q qVar = (q) uVar;
                boolean z13 = qVar instanceof k;
                c cVar = this.f372j;
                if (z13) {
                    k kVar = (k) uVar;
                    cVar.getClass();
                    l o13 = cVar.f374a.k(kVar.f131424e, fields, kVar.f131425f, cVar.f(kVar.f131426g), kVar.f131466d, kVar.f131427h).o();
                    Intrinsics.checkNotNullExpressionValue(o13, "toMaybe(...)");
                    return o13;
                }
                if (qVar instanceof m) {
                    m mVar = (m) uVar;
                    cVar.getClass();
                    l o14 = cVar.f374a.t(mVar.f131445e, 1, mVar.f131466d).o();
                    Intrinsics.checkNotNullExpressionValue(o14, "toMaybe(...)");
                    return o14;
                }
                if (qVar instanceof o) {
                    o oVar = (o) uVar;
                    cVar.getClass();
                    l o15 = cVar.f374a.d(oVar.f131454e, oVar.f131466d).o();
                    Intrinsics.checkNotNullExpressionValue(o15, "toMaybe(...)");
                    return o15;
                }
                if (qVar instanceof n) {
                    n nVar = (n) uVar;
                    cVar.getClass();
                    l o16 = cVar.f374a.g(o32.c.AGGREGATED_COMMENT.getValue(), nVar.f131450e, nVar.f131466d).o();
                    Intrinsics.checkNotNullExpressionValue(o16, "toMaybe(...)");
                    return o16;
                }
                if (qVar instanceof p) {
                    p pVar = (p) uVar;
                    cVar.getClass();
                    l o17 = cVar.f374a.l(o32.c.AGGREGATED_COMMENT.getValue(), pVar.f131462e, pVar.f131466d).o();
                    Intrinsics.checkNotNullExpressionValue(o17, "toMaybe(...)");
                    return o17;
                }
                if (qVar instanceof x02.l) {
                    x02.l lVar = (x02.l) uVar;
                    cVar.getClass();
                    l o18 = cVar.f374a.s(lVar.f131437e, lVar.f131466d, lVar.f131438f).o();
                    Intrinsics.checkNotNullExpressionValue(o18, "toMaybe(...)");
                    return o18;
                }
                if (!(qVar instanceof j)) {
                    throw new NoWhenBranchMatchedException();
                }
                j jVar = (j) uVar;
                cVar.getClass();
                l o19 = cVar.f374a.r(jVar.f131420e, jVar.f131466d).o();
                Intrinsics.checkNotNullExpressionValue(o19, "toMaybe(...)");
                return o19;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(u uVar, c cVar, int i13) {
        super(1);
        this.f371i = i13;
        this.f373k = uVar;
        this.f372j = cVar;
    }
}
