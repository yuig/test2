package w1;

import android.content.Context;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.pin.RepinAnimationData;
import h32.a4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import t3.s3;

/* loaded from: classes2.dex */
public final class l0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127351i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f127352j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f127353k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f127354l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(gb1.o oVar, boolean z13, gb1.m mVar) {
        super(0);
        this.f127351i = 5;
        this.f127353k = oVar;
        this.f127352j = z13;
        this.f127354l = mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        s3 s3Var;
        boolean z13 = this.f127352j;
        int i13 = this.f127351i;
        Object obj = this.f127354l;
        Object obj2 = this.f127353k;
        switch (i13) {
            case 0:
                l1 l1Var = (l1) obj2;
                z2.s sVar = (z2.s) obj;
                boolean z14 = !z13;
                if (!l1Var.b()) {
                    sVar.a(z2.m.f140632l);
                } else if (z14 && (s3Var = l1Var.f127357c) != null) {
                    ((t3.h2) s3Var).b();
                }
                break;
            case 1:
                m278invoke();
                break;
            case 2:
                m278invoke();
                break;
            case 3:
                m278invoke();
                break;
            case 4:
                Context context = (Context) obj2;
                gb1.c cVar = (gb1.c) obj;
                wy0 f13 = ((b60.d) cVar.getActiveUserManager()).f();
                if (f13 == null || (r4 = f13.G3()) == null) {
                    Boolean bool = Boolean.FALSE;
                }
                break;
            case 5:
                m278invoke();
                break;
            case 6:
                m278invoke();
                break;
            case 7:
                m278invoke();
                break;
            default:
                m278invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Object obj, Object obj2, boolean z13, int i13) {
        super(0);
        this.f127351i = i13;
        this.f127353k = obj;
        this.f127354l = obj2;
        this.f127352j = z13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(boolean z13, c2.i2 i2Var, ao2.j0 j0Var) {
        super(0);
        this.f127351i = 1;
        this.f127352j = z13;
        this.f127353k = i2Var;
        this.f127354l = j0Var;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m278invoke() {
        int i13;
        a4 f68726p0;
        a4 f68726p02;
        int i14 = this.f127351i;
        boolean z13 = this.f127352j;
        String str = null;
        Object obj = this.f127354l;
        Object obj2 = this.f127353k;
        switch (i14) {
            case 1:
                if (z13) {
                    c2.i2 i2Var = (c2.i2) obj2;
                    if (((Boolean) i2Var.f24842a.f25328d.invoke(c2.j2.Closed)).booleanValue()) {
                        kotlin.jvm.internal.j.z((ao2.j0) obj, null, null, new c2.u1(i2Var, null), 3);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((z9.l) obj2).e((z9.k) obj);
                return;
            case 3:
                fs0.w wVar = (fs0.w) obj2;
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullExpressionValue(pin, "$pin");
                uj2.l t33 = fs0.w.t3(wVar, pin, !z13);
                fs0.q qVar = new fs0.q(11, fs0.h.f62844m);
                fs0.q qVar2 = new fs0.q(12, new fs0.s(wVar, 1));
                ck2.c cVar = ck2.i.f27923c;
                t33.getClass();
                t33.f(new hk2.b(qVar, qVar2, cVar));
                return;
            case 4:
            default:
                cb2.x xVar = (cb2.x) obj2;
                e02.a aVar = xVar.f27389l;
                f30 f30Var = ((ls1.r) obj).f84722a;
                boolean k13 = xVar.k();
                String str2 = xVar.C;
                String str3 = xVar.N;
                nl1.d a13 = xVar.a();
                if (a13 != null && (f68726p02 = a13.getF68726p0()) != null) {
                    str = f68726p02.name();
                }
                String str4 = str;
                jo1.a b13 = xVar.b();
                xVar.f27403z.getClass();
                e02.a.b(aVar, f30Var, k13, xVar.f27386i, null, null, null, str2, null, null, null, null, str4, null, null, str3, false, this.f127352j, null, "DRAG", "contextual_menu", androidx.camera.core.impl.j.i(b13), xVar.k() ? d32.c.PIN_CLOSEUP_LONG_PRESS_MENU : d32.c.FEED_PIN_LONG_PRESS_MENU, 47032);
                return;
            case 5:
                gb1.o oVar = (gb1.o) obj2;
                gb1.m mVar = (gb1.m) obj;
                int i15 = gb1.o.f64714r;
                oVar.getClass();
                m60.w wVar2 = m60.u.f85943a;
                boolean z14 = oVar.f64717e;
                if (z13) {
                    if (z14) {
                        i13 = c52.e.you_wont_get_any_more_push_notifications_from_pinterest_business;
                    } else {
                        i13 = c52.e.you_wont_get_any_more_emails_from_pinterest_business;
                    }
                } else if (z14) {
                    i13 = c52.e.you_wont_get_any_more_push_notifications_from_pinterest_personal;
                } else {
                    i13 = c52.e.you_wont_get_any_more_emails_from_pinterest_personal;
                }
                wVar2.d(new jc0.v(new gb1.x(i13, mVar), false, 0L, 30));
                return;
            case 6:
                oc1.c.t3((oc1.c) obj2, (nc1.b) obj, z13, null, true, 4);
                return;
            case 7:
                cb2.x xVar2 = (cb2.x) obj2;
                e02.a aVar2 = xVar2.f27389l;
                f30 f30Var2 = xVar2.I;
                if (f30Var2 != null) {
                    boolean k14 = xVar2.k();
                    String str5 = xVar2.C;
                    String str6 = xVar2.N;
                    RepinAnimationData e13 = xVar2.e((m10.d) obj);
                    nl1.d a14 = xVar2.a();
                    if (a14 != null && (f68726p0 = a14.getF68726p0()) != null) {
                        str = f68726p0.name();
                    }
                    String str7 = str;
                    jo1.a b14 = xVar2.b();
                    xVar2.f27403z.getClass();
                    e02.a.b(aVar2, f30Var2, k14, xVar2.f27386i, null, null, null, str5, null, null, null, null, str7, null, null, str6, false, this.f127352j, e13, "DRAG", "contextual_menu", androidx.camera.core.impl.j.i(b14), xVar2.k() ? d32.c.PIN_CLOSEUP_LONG_PRESS_MENU : d32.c.FEED_PIN_LONG_PRESS_MENU, 47032);
                    return;
                }
                Intrinsics.r("pin");
                throw null;
        }
    }
}
