package a02;

import com.pinterest.api.model.wy0;
import h32.f1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import nx.d0;

/* loaded from: classes4.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f215i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f216j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, int i13) {
        super(1);
        this.f215i = i13;
        this.f216j = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f215i;
        d dVar = this.f216j;
        switch (i13) {
            case 0:
                wy0 wy0Var = (wy0) obj;
                Intrinsics.f(wy0Var);
                dVar.f223g0 = wy0Var;
                String N2 = wy0Var.N2();
                if (N2 == null) {
                    N2 = "";
                }
                dVar.a8(N2);
                break;
            default:
                d0.v(dVar.s7(), f1.DATA_REQUEST_FAILURE, "recovery_v2_fb_email_update_failed", false, 12);
                dVar.getAnalyticsApi().a("recovery_v2_fb_error_getting_current_email");
                dVar.D5();
                break;
        }
        return Unit.f80348a;
    }
}
