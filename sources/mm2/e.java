package mm2;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes4.dex */
public final class e extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87660i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f87661j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i13) {
        super(0);
        this.f87660i = i13;
        this.f87661j = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f87660i;
        f fVar = this.f87661j;
        switch (i13) {
            case 0:
                ArrayList b13 = ((gm2.e) fVar.f87665b).b();
                ArrayList arrayList = new ArrayList();
                Iterator it = b13.iterator();
                while (it.hasNext()) {
                    pm2.b bVar = (pm2.b) it.next();
                    ym2.g gVar = ((gm2.f) bVar).f65767a;
                    if (gVar == null) {
                        gVar = im2.d0.f72702b;
                    }
                    dn2.g d2 = fVar.d(bVar);
                    Pair pair = d2 != null ? new Pair(gVar, d2) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return z0.m(arrayList);
            case 1:
                return gm2.d.a(l0.t0(l0.m0(((gm2.e) fVar.f87665b).f65765a))).b();
            default:
                ym2.c c13 = fVar.c();
                pm2.a aVar = fVar.f87665b;
                if (c13 == null) {
                    return rn2.m.d(rn2.l.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, aVar.toString());
                }
                rg.a aVar2 = fVar.f87664a;
                am2.g d13 = zl2.e.d(c13, aVar2.b().f());
                if (d13 == null) {
                    gm2.q javaClass = new gm2.q(l0.t0(l0.m0(((gm2.e) aVar).f65765a)));
                    lm2.g gVar2 = ((lm2.a) aVar2.f107929a).f83941k;
                    gVar2.getClass();
                    Intrinsics.checkNotNullParameter(javaClass, "javaClass");
                    tb.e eVar = gVar2.f83968a;
                    if (eVar == null) {
                        Intrinsics.r("resolver");
                        throw null;
                    }
                    d13 = eVar.k(javaClass);
                    if (d13 == null) {
                        am2.d0 b14 = aVar2.b();
                        ym2.b j13 = ym2.b.j(c13);
                        Intrinsics.checkNotNullExpressionValue(j13, "topLevel(...)");
                        d13 = l0.e0(b14, j13, ((lm2.a) aVar2.f107929a).f83934d.c().f84118k);
                    }
                }
                return d13.j();
        }
    }
}
