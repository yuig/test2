package xy0;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lh0.a4;
import lh0.g1;
import lh0.j2;
import lh0.z3;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f136197i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f136198j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(e eVar, int i13) {
        super(0);
        this.f136197i = i13;
        this.f136198j = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f136197i;
        e eVar = this.f136198j;
        switch (i13) {
            case 0:
                j2 j2Var = eVar.A0;
                if (j2Var == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) j2Var.f83397a;
                return Boolean.valueOf(g1Var.o("android_gestalt_spinner_mod_nux_picker_fragment", "enabled", z3Var) || g1Var.l("android_gestalt_spinner_mod_nux_picker_fragment"));
            default:
                Context requireContext = eVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new vy0.a(requireContext);
        }
    }
}
