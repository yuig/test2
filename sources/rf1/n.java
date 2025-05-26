package rf1;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.mp0;
import com.pinterest.api.model.wo0;
import com.pinterest.api.model.zk0;
import com.pinterest.error.ServerError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import v.f1;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107790i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f107791j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ zk0 f107792k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ mp0 f107793l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, zk0 zk0Var, mp0 mp0Var, int i13) {
        super(1);
        this.f107790i = i13;
        this.f107791j = oVar;
        this.f107792k = zk0Var;
        this.f107793l = mp0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f1 f1Var;
        wo0 wo0Var;
        f30 f30Var;
        int i13 = this.f107790i;
        mp0 mp0Var = this.f107793l;
        o oVar = this.f107791j;
        switch (i13) {
            case 0:
                oVar.l((f30) obj, this.f107792k, mp0Var);
                break;
            default:
                Throwable th3 = (Throwable) obj;
                if ((th3 instanceof ServerError) && (f1Var = ((ServerError) th3).f45043a) != null && f1Var.f123449b == 404) {
                    p pVar = oVar.f107795b;
                    if (pVar.isBound() && ((f30Var = (wo0Var = pVar.f107820r).f43312c) == null || !Intrinsics.d(f30Var.k5(), Boolean.TRUE))) {
                        sf1.t tVar = (sf1.t) pVar.getView();
                        Double m13 = mp0Var.m();
                        Intrinsics.checkNotNullExpressionValue(m13, "getStartTime(...)");
                        double doubleValue = m13.doubleValue();
                        Double j13 = mp0Var.j();
                        Intrinsics.checkNotNullExpressionValue(j13, "getEndTime(...)");
                        double doubleValue2 = j13.doubleValue();
                        f30 f30Var2 = wo0Var.f43312c;
                        String uid = f30Var2 != null ? f30Var2.getUid() : null;
                        if (uid == null) {
                            uid = "";
                        }
                        String str = uid;
                        f30 f30Var3 = wo0Var.f43312c;
                        ((sf1.s) tVar).k(this.f107792k, null, null, null, null, true, oVar.f107797d, doubleValue, doubleValue2, null, null, str, f30Var3 != null ? f30Var3.B4() : null);
                    }
                }
                break;
        }
        return Unit.f80348a;
    }
}
