package yq1;

import android.view.View;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f139799i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c2 f139800j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2(c2 c2Var, int i13) {
        super(1);
        this.f139799i = i13;
        this.f139800j = c2Var;
    }

    public final void b(em1.c it) {
        GestaltCheckBox gestaltCheckBox;
        int i13 = this.f139799i;
        c2 c2Var = this.f139800j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                int i14 = c2.F0;
                c2Var.k8(c2Var.n8(false));
                int i15 = vq1.b.chk_krconsent_all;
                boolean n83 = c2Var.n8(true);
                View view = c2Var.getView();
                if (view != null && (gestaltCheckBox = (GestaltCheckBox) view.findViewById(i15)) != null) {
                    gestaltCheckBox.L(new mm1.i(n83, 16));
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "event");
                c2Var.E0.h3(it);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f139799i) {
            case 0:
                b((em1.c) obj);
                break;
            default:
                b((em1.c) obj);
                break;
        }
        return Unit.f80348a;
    }
}
