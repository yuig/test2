package p1;

import i2.v2;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f98599i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f98600j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f98601k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i13, Object obj, Object obj2) {
        super(2);
        this.f98599i = i13;
        this.f98600j = obj;
        this.f98601k = obj2;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f98599i;
        Object obj = this.f98601k;
        Object obj2 = this.f98600j;
        switch (i14) {
            case 0:
                if ((i13 & 3) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        return;
                    }
                }
                ((kl2.l) obj2).invoke((androidx.compose.foundation.layout.d) obj, oVar, 0);
                return;
            default:
                if ((i13 & 3) == 2) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        return;
                    }
                }
                Boolean bool = (Boolean) ((q3.c0) obj2).f102177f.getValue();
                boolean booleanValue = bool.booleanValue();
                Function2 function2 = (Function2) obj;
                i2.s sVar3 = (i2.s) oVar;
                sVar3.Z(bool);
                boolean i15 = sVar3.i(booleanValue);
                sVar3.W(-869707859);
                if (booleanValue) {
                    function2.invoke(sVar3, 0);
                } else {
                    if (!(sVar3.f71275k == 0)) {
                        i2.u.i("No nodes can be emitted before calling dactivateToEndGroup");
                        throw null;
                    }
                    if (!sVar3.O) {
                        if (i15) {
                            v2 v2Var = sVar3.F;
                            int i16 = v2Var.f71324g;
                            int i17 = v2Var.f71325h;
                            j2.b bVar = sVar3.L;
                            bVar.getClass();
                            bVar.i(false);
                            j2.a aVar = bVar.f74425b;
                            aVar.getClass();
                            aVar.f74422a.F1(j2.i.f74450c);
                            i2.u.g(i16, i17, sVar3.f71282r);
                            sVar3.F.m();
                        } else {
                            sVar3.P();
                        }
                    }
                }
                sVar3.r(false);
                if (sVar3.f71288x && sVar3.F.f71326i == sVar3.f71289y) {
                    sVar3.f71289y = -1;
                    sVar3.f71288x = false;
                }
                sVar3.r(false);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f98599i;
        Object obj3 = this.f98601k;
        Object obj4 = this.f98600j;
        switch (i13) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 1:
                q3.o1 o1Var = (q3.o1) obj;
                long j13 = ((n4.a) obj2).f89168a;
                androidx.compose.foundation.layout.d dVar = new androidx.compose.foundation.layout.d(o1Var, j13);
                Unit unit = Unit.f80348a;
                v vVar = new v(0, (kl2.l) obj4, dVar);
                Object obj5 = q2.i.f102113a;
                return ((q3.p0) obj3).a(o1Var, o1Var.m(unit, new q2.h(vVar, true, -1945019079)), j13);
            case 2:
                b((i2.o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 3:
                vd0.c cVar = (vd0.c) obj;
                if (cVar != null) {
                    vd0.c response = new vd0.c();
                    response.f125623a.r("data", cVar.c("data").f125618a);
                    qz.a aVar = ((u20.d) obj4).f120068c;
                    qz.f0 params = (qz.f0) obj3;
                    aVar.getClass();
                    Intrinsics.checkNotNullParameter("users/contacts/suggestions/share/", "url");
                    Intrinsics.checkNotNullParameter(params, "params");
                    Intrinsics.checkNotNullParameter("SEND_SHARE_SERVICE_CACHE", "tag");
                    Intrinsics.checkNotNullParameter(response, "response");
                    int i14 = qz.a.f105363b;
                    aVar.f105364a.j(Arrays.hashCode(new Object[]{"users/contacts/suggestions/share/", params.f105397a, "SEND_SHARE_SERVICE_CACHE"}), response);
                }
                return Unit.f80348a;
            default:
                u50.o displayState = (u50.o) obj;
                l82.i0 vmState = (l82.i0) obj2;
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                return new Pair(((Function1) obj4).invoke(displayState), ((Function1) obj3).invoke(vmState));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(q3.p0 p0Var, kl2.l lVar) {
        super(2);
        this.f98599i = 1;
        this.f98601k = p0Var;
        this.f98600j = lVar;
    }
}
