package i01;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface l0 extends yk1.n {
    static void w0(oq.x0 x0Var, List list, int i13, boolean z13, String requestParams, boolean z14, float f13, float f14, int i14) {
        boolean z15 = (i14 & 16) != 0 ? false : z14;
        float f15 = (i14 & 32) != 0 ? -1.0f : f13;
        float f16 = (i14 & 64) != 0 ? -1.0f : f14;
        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
        oq.c0 z03 = x0Var.z0();
        f30 f30Var = x0Var.F;
        if (z03 == null && f30Var != null && x0Var.F0() != 0) {
            s71.o.h(f30Var, x0Var.F0(), list, i13, z15, requestParams, z15);
        } else if (z03 != null) {
            oq.c0.s(z03, list, i13, z13, z15, requestParams, f15, f16, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        }
    }
}
