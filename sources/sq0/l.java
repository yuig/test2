package sq0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lh0.g1;
import lh0.w0;
import lh0.y0;
import lh0.z0;
import lh0.z3;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f115006i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f115007j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, int i13) {
        super(0);
        this.f115006i = i13;
        this.f115007j = mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f115006i;
        m mVar = this.f115007j;
        switch (i13) {
            case 0:
                w0 w0Var = mVar.f115009d;
                w0Var.getClass();
                Intrinsics.checkNotNullParameter("despite_scroll", "keyWord");
                z0.f83518a.getClass();
                String h10 = ((g1) w0Var.f83495a).h("android_video_unify_grid_prefetch", y0.f83512b);
                boolean z13 = false;
                if (h10 != null && ((kotlin.text.z.p(h10, "enabled", false) || kotlin.text.z.p(h10, "employee", false)) && StringsKt.E(h10, "despite_scroll", false))) {
                    z13 = true;
                }
                return Boolean.valueOf(z13);
            default:
                w0 w0Var2 = mVar.f115009d;
                z3 activate = z3.ACTIVATE_EXPERIMENT;
                w0Var2.getClass();
                Intrinsics.checkNotNullParameter("enabled", "group");
                Intrinsics.checkNotNullParameter(activate, "activate");
                return Boolean.valueOf(((g1) w0Var2.f83495a).o("android_video_unify_grid_prefetch", "enabled", activate));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f115006i) {
        }
        return invoke();
    }
}
