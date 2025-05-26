package dv0;

import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.qj0;
import com.pinterest.api.model.rj0;
import com.pinterest.api.model.wy0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final a f56295i = new a(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        rj0 rj0Var;
        f30 pin = (f30) obj;
        wy0 sponsor = (wy0) obj2;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(sponsor, "sponsor");
        e30 R6 = pin.R6();
        rj0 u63 = pin.u6();
        if (u63 != null) {
            qj0 qj0Var = new qj0(u63, 0);
            qj0Var.c(sponsor);
            rj0Var = qj0Var.a();
        } else {
            rj0Var = null;
        }
        R6.l2(rj0Var);
        return R6.a();
    }
}
