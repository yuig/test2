package kt0;

import android.content.Context;
import android.view.LayoutInflater;
import com.pinterest.activity.task.activity.MainActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.q1;
import lh0.z3;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80829i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f80830j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(q qVar, int i13) {
        super(0);
        this.f80829i = i13;
        this.f80830j = qVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f80829i;
        q qVar = this.f80830j;
        switch (i13) {
            case 1:
                Context requireContext = qVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return Boolean.valueOf(pk.a0.q0(requireContext));
            default:
                b20.c cVar = qVar.f80852w0;
                if (cVar == null) {
                    Intrinsics.r("homeFeedTunerEntrypointV2ExperimentHelper");
                    throw null;
                }
                z3 shouldActivate = z3.ACTIVATE_EXPERIMENT;
                Intrinsics.checkNotNullParameter(shouldActivate, "shouldActivate");
                q1 q1Var = (q1) cVar.f21278a;
                q1Var.getClass();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) q1Var.f83462a;
                return Boolean.valueOf(g1Var.o("hfp_tuner_entrypoint_pencil_navigation_android", "enabled", z3Var) || g1Var.l("hfp_tuner_entrypoint_pencil_navigation_android"));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f80829i) {
            case 0:
                LayoutInflater.Factory E4 = this.f80830j.E4();
                ir.d dVar = E4 instanceof ir.d ? (ir.d) E4 : null;
                if (dVar == null) {
                    return null;
                }
                ir.c cVar = ((MainActivity) dVar).f35209x;
                if (cVar != null) {
                    return cVar;
                }
                Intrinsics.r("appLaunchAnimationController");
                throw null;
            case 1:
                return invoke();
            default:
                return invoke();
        }
    }
}
