package oc0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.pinterest.componentBrowser.ComponentBrowserActivity;
import do2.z1;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import r2.t;
import tc0.i0;
import tc0.j0;
import tc0.k0;
import tc0.l0;
import z9.e0;
import z9.r0;

/* loaded from: classes5.dex */
public final class f extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f94040i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ComponentBrowserActivity f94041j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(ComponentBrowserActivity componentBrowserActivity, int i13) {
        super(2);
        this.f94040i = i13;
        this.f94041j = componentBrowserActivity;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f94040i;
        int i15 = 0;
        ComponentBrowserActivity componentBrowserActivity = this.f94041j;
        switch (i14) {
            case 0:
                if ((i13 & 11) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        return;
                    }
                }
                i2.s sVar2 = (i2.s) oVar;
                sVar2.X(-312215566);
                Context context = (Context) sVar2.m(AndroidCompositionLocals_androidKt.f17455b);
                Object[] copyOf = Arrays.copyOf(new r0[0], 0);
                ba.p pVar = ba.p.f22288i;
                q0.d dVar = new q0.d(context, 1);
                r2.s sVar3 = t.f106065a;
                e0 e0Var = (e0) so.a.i(copyOf, new r2.s(pVar, dVar), new ba.q(context, i15), sVar2, 72, 4);
                sVar2.r(false);
                componentBrowserActivity.getClass();
                Intrinsics.checkNotNullParameter(e0Var, "<set-?>");
                componentBrowserActivity.f44774h = e0Var;
                i iVar = componentBrowserActivity.f44772f;
                if (iVar == null) {
                    Intrinsics.r("componentBrowserEventManager");
                    throw null;
                }
                ComponentBrowserActivity.q(componentBrowserActivity, componentBrowserActivity.t(), new r((a) bs1.c.y(new z1(((j) iVar).f94043b), new a(), null, oVar, 8, 2).getValue(), f0.j(j0.f117277d, i0.f117274d, k0.f117281d, l0.f117284d)), oVar, 584);
                return;
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar4 = (i2.s) oVar;
                    if (sVar4.z()) {
                        sVar4.Q();
                        return;
                    }
                }
                fc0.n.a(false, null, false, false, q2.i.c(-1373822858, new f(componentBrowserActivity, i15), oVar), oVar, 24576, 15);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f94040i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
