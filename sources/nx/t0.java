package nx;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface t0 {
    static void a(t0 t0Var, h32.i0 context, String str, HashMap hashMap) {
        h32.f1 eventType = h32.f1.TAP;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        h32.f1 f1Var = b((l0) t0Var, context, eventType, str, null, hashMap, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN).f67324b;
        dl2.b.Z2(context.f67084d, context.f67086f, f1Var);
    }

    static /* synthetic */ h32.w0 b(t0 t0Var, h32.i0 i0Var, h32.f1 f1Var, String str, h32.c1 c1Var, HashMap hashMap, h32.v0 v0Var, boolean z13, int i13) {
        return ((l0) t0Var).c(i0Var, f1Var, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : c1Var, (i13 & 16) != 0 ? null : hashMap, (i13 & 32) != 0 ? null : v0Var, (i13 & 64) != 0 ? false : z13, true);
    }
}
