package cb2;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.g00;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import pg0.c0;
import x02.i2;

/* loaded from: classes4.dex */
public final class w extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27375i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x f27376j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(x xVar, int i13) {
        super(1);
        this.f27375i = i13;
        this.f27376j = xVar;
    }

    public final void b(f30 f30Var) {
        int i13 = this.f27375i;
        x xVar = this.f27376j;
        switch (i13) {
            case 0:
                m60.w wVar = xVar.f27379b;
                v32.c cVar = v32.c.LIKE;
                f30 f30Var2 = xVar.I;
                if (f30Var2 != null) {
                    wVar.d(new c0(cVar, true, f30Var2.getUid()));
                    return;
                } else {
                    Intrinsics.r("pin");
                    throw null;
                }
            default:
                i2 i2Var = xVar.f27378a;
                Intrinsics.f(f30Var);
                i2Var.W(f30Var);
                return;
        }
    }

    public final void e(Throwable th3) {
        int i13 = this.f27375i;
        x xVar = this.f27376j;
        switch (i13) {
            case 1:
                xVar.f27380c.i(th3.getLocalizedMessage());
                break;
            default:
                xVar.f27380c.i(((yk1.a) xVar.f27399v).f139224a.getString(x0.generic_error));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f27375i) {
            case 0:
                b((f30) obj);
                break;
            case 1:
                e((Throwable) obj);
                break;
            case 2:
                b((f30) obj);
                break;
            case 3:
                e((Throwable) obj);
                break;
            default:
                vd0.a k13 = ((vd0.c) obj).k("data");
                x xVar = this.f27376j;
                xVar.getClass();
                ArrayList arrayList = new ArrayList(g0.q(k13, 10));
                Iterator it = k13.iterator();
                while (it.hasNext()) {
                    Object e13 = vd0.c.f125622b.e(((vd0.c) it.next()).f125623a, g00.class);
                    Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.Onebarmodule");
                    arrayList.add((g00) e13);
                }
                ArrayList H0 = CollectionsKt.H0(arrayList);
                g00 g00Var = (g00) CollectionsKt.U(0, H0);
                if (g00Var != null) {
                    H0.set(0, pe.i.u1(g00Var, true));
                }
                xVar.O = H0;
                if (xVar.P) {
                    xVar.P = !xVar.i();
                }
                break;
        }
        return Unit.f80348a;
    }
}
