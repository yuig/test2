package y90;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f138270i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d0 f138271j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(d0 d0Var, int i13) {
        super(1);
        this.f138270i = i13;
        this.f138271j = d0Var;
    }

    public final void b(m62.b1 it) {
        int i13 = this.f138270i;
        d0 d0Var = this.f138271j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                p pVar = new p(it);
                int i14 = d0.f138146w0;
                d0Var.a8(pVar);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                p pVar2 = new p(it);
                int i15 = d0.f138146w0;
                d0Var.a8(pVar2);
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                p pVar3 = new p(it);
                int i16 = d0.f138146w0;
                d0Var.a8(pVar3);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f138270i) {
            case 0:
                x72.j it = (x72.j) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                d0 d0Var = this.f138271j;
                androidx.lifecycle.z viewLifecycleOwner = d0Var.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                com.pinterest.shuffles.scene.composer.x0 x0Var = new com.pinterest.shuffles.scene.composer.x0(it, bf.b.S(viewLifecycleOwner));
                Context requireContext = d0Var.requireContext();
                com.pinterest.shuffles.scene.composer.a1 a1Var = new com.pinterest.shuffles.scene.composer.a1((14 & 1) != 0, (14 & 2) != 0, false, false);
                n72.m mVar = d0Var.f138148d0;
                if (mVar == null) {
                    Intrinsics.r("logger");
                    throw null;
                }
                n72.b bVar = d0Var.f138147c0;
                if (bVar == null) {
                    Intrinsics.r("fontManager");
                    throw null;
                }
                Intrinsics.f(requireContext);
                com.pinterest.shuffles.scene.composer.q qVar = new com.pinterest.shuffles.scene.composer.q(requireContext, a1Var, bVar, mVar);
                Intrinsics.checkNotNullParameter(qVar, "<set-?>");
                x0Var.f52036a = qVar;
                return x0Var;
            case 1:
                b((m62.b1) obj);
                return Unit.f80348a;
            case 2:
                b((m62.b1) obj);
                return Unit.f80348a;
            default:
                b((m62.b1) obj);
                return Unit.f80348a;
        }
    }
}
