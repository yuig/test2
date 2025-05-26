package yx1;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.bg;
import com.pinterest.api.model.f3;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.vh;
import df.j1;
import java.util.Calendar;
import java.util.Date;
import kh2.g3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import so.y0;

/* loaded from: classes4.dex */
public final class m extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140379i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f140380j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(p pVar, int i13) {
        super(1);
        this.f140379i = i13;
        this.f140380j = pVar;
    }

    public final void b(Throwable th3) {
        s sVar = s.f140408b;
        int i13 = this.f140379i;
        p pVar = this.f140380j;
        switch (i13) {
            case 0:
                ((j) ((e) pVar.getView())).f8(x.f140417b);
                break;
            case 1:
            case 2:
            case 5:
            default:
                ((j) ((e) pVar.getView())).o3(sVar);
                break;
            case 3:
                ((j) ((e) pVar.getView())).c8(q.f140405b);
                break;
            case 4:
                ((j) ((e) pVar.getView())).d8(b.f140351m);
                ((j) ((e) pVar.getView())).g8(z.f140420b);
                break;
            case 6:
                ((j) ((e) pVar.getView())).o3(sVar);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int intValue;
        gw1.g gVar;
        int i13 = this.f140379i;
        p pVar = this.f140380j;
        switch (i13) {
            case 0:
                b((Throwable) obj);
                return Unit.f80348a;
            case 1:
                f30 it = (f30) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                pVar.getClass();
                ol1.d dVar = new ol1.d(new uv0.a(15, pVar, it), 2);
                Intrinsics.checkNotNullExpressionValue(dVar, "create(...)");
                return dVar;
            case 2:
                cy1.e eVar = (cy1.e) obj;
                f30 f30Var = eVar.f53445a;
                pVar.getClass();
                Intrinsics.checkNotNullParameter(f30Var, "<set-?>");
                pVar.f140396k = f30Var;
                pVar.f140397l = eVar.f53446b;
                f30 f30Var2 = eVar.f53445a;
                Intrinsics.checkNotNullParameter(f30Var2, "<this>");
                String B0 = bs1.c.B0(f30Var2);
                String s03 = j1.s0(f30Var2);
                f3 z33 = f30Var2.z3();
                int i14 = 0;
                int intValue2 = (z33 != null ? z33.F() : 0).intValue();
                Integer C6 = f30Var2.C6();
                Intrinsics.checkNotNullExpressionValue(C6, "getTotalReactionCount(...)");
                ((j) ((e) pVar.getView())).c8(new r(new cy1.d(f30Var2, B0, s03, intValue2, C6.intValue())));
                int i15 = 4;
                if (ph.a.V(f30Var2) == cy1.c.OTHERS) {
                    intValue = 4;
                } else {
                    bg b03 = g3.b0(f30Var2);
                    intValue = (b03 != null ? b03.B() : 0).intValue();
                }
                String g13 = b40.g(f30Var2);
                px.c cVar = (px.c) pVar.f140390e;
                pVar.addDisposable(cVar.c(g13).o(new ru1.d(22, new rq.a0(pVar, f30Var2, intValue, 26)), new ru1.d(23, new m(pVar, i14))));
                if (pVar.f140386a) {
                    f30 pin = pVar.r3();
                    Intrinsics.checkNotNullParameter(pin, "pin");
                    Date time = Calendar.getInstance(kw1.e.f81041a).getTime();
                    String uid = pin.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    Object value = pVar.f140403r.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    Intrinsics.f(time);
                    pVar.addDisposable(cVar.d(uid, (Date) value, time).F(new ru1.d(20, new gw1.i(9, pVar, time)), new ru1.d(21, new m(pVar, i15)), ck2.i.f27923c, ck2.i.f27924d));
                } else {
                    pVar.f140398m = ((so.j1) pVar.f140388c).a(f30Var2, pVar.f140397l, pVar.getPinalytics());
                    e eVar2 = (e) pVar.getView();
                    jw1.b bVar = pVar.f140398m;
                    if (bVar == null) {
                        Intrinsics.r("metricAdapter");
                        throw null;
                    }
                    ((j) eVar2).d8(new c(bVar));
                }
                if (!b40.W0(pVar.r3())) {
                    f30 pin2 = pVar.r3();
                    Intrinsics.checkNotNullParameter(pin2, "pin");
                    vh vhVar = pVar.f140404s;
                    if (vhVar != null) {
                        pVar.q3(vhVar);
                    } else {
                        String uid2 = pin2.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                        xj2.c o13 = cVar.f(uid2).o(new ru1.d(24, new m(pVar, 7)), new ru1.d(25, new m(pVar, 8)));
                        pVar.addDisposable(o13);
                        Intrinsics.checkNotNullExpressionValue(o13, "also(...)");
                    }
                }
                return Unit.f80348a;
            case 3:
                b((Throwable) obj);
                return Unit.f80348a;
            case 4:
                b((Throwable) obj);
                return Unit.f80348a;
            case 5:
                px.i iVar = (px.i) obj;
                gw1.h hVar = pVar.f140389d;
                Object value2 = pVar.f140403r.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                Date date = (Date) value2;
                Intrinsics.f(iVar);
                switch (((y0) hVar).f114715a) {
                    case 0:
                        gVar = new gw1.g(date, iVar);
                        break;
                    default:
                        gVar = new gw1.g(date, iVar);
                        break;
                }
                ((j) ((e) pVar.getView())).o3(new u(gVar, ph.a.X(), pVar.f140400o));
                if (!pVar.f140402q) {
                    pVar.f140401p.addAll(ph.a.X());
                    pVar.f140402q = true;
                }
                return Unit.f80348a;
            case 6:
                b((Throwable) obj);
                return Unit.f80348a;
            case 7:
                vh dynamicStory = (vh) obj;
                Intrinsics.checkNotNullParameter(dynamicStory, "dynamicStory");
                if (dynamicStory.f42865w.isEmpty()) {
                    ((j) ((e) pVar.getView())).o3(t.f140409b);
                } else {
                    pVar.f140404s = dynamicStory;
                    pVar.q3(dynamicStory);
                }
                return Unit.f80348a;
            default:
                b((Throwable) obj);
                return Unit.f80348a;
        }
    }
}
