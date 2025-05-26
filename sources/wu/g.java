package wu;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import com.pinterest.ads.onetap.view.CloseupCarouselView;
import com.pinterest.api.model.f30;
import h32.d4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lh0.a4;
import lh0.g1;
import lh0.z3;
import lr.v;
import pk.a0;

/* loaded from: classes3.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f131136i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f131137j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, int i13) {
        super(1);
        this.f131136i = i13;
        this.f131137j = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int y03;
        int i13 = this.f131136i;
        i iVar = this.f131137j;
        switch (i13) {
            case 0:
                xt.j jVar = (xt.j) obj;
                Intrinsics.f(jVar);
                iVar.getClass();
                if (jVar instanceof xt.i) {
                    xt.i iVar2 = (xt.i) jVar;
                    if (!iVar2.f135887i) {
                        CloseupCarouselView n13 = iVar.n1();
                        int i14 = CloseupCarouselView.O;
                        iv.c cVar = new iv.c(25.0f, n13.getContext());
                        int i15 = iVar2.f135881c;
                        cVar.f19651a = i15;
                        n13.getPinterestRecyclerView().f52531a.f19242n.X0(cVar);
                        n13.f35424k = i15;
                    }
                    xt.f fVar = iVar.F0;
                    if (fVar.f135864g != 0) {
                        iVar.g2();
                    }
                    lh0.g S0 = iVar.S0();
                    S0.getClass();
                    z3 z3Var = a4.f83297a;
                    g1 g1Var = (g1) S0.f83348a;
                    if ((g1Var.o("android_showcase_subcard_video", "enabled", z3Var) || g1Var.l("android_showcase_subcard_video")) && (iVar2.f135890l.isEmpty() || iVar2.f135888j)) {
                        f30 Y0 = iVar.Y0();
                        es.c cVar2 = (es.c) iVar.G0;
                        if (cVar2.S(Y0)) {
                            iVar.n1().f35433t = new iv.e(false, 7);
                        }
                        CloseupCarouselView.k(iVar.n1(), iVar2.f135890l, d4.ONE_TAP_V3_BROWSER, h32.a4.BROWSER, cVar2.q(iVar.Y0(), new v(iVar, 13)), false, 16);
                        fVar.f135866i = true;
                    }
                    Integer num = iVar2.f135884f;
                    if (num != null) {
                        y03 = num.intValue();
                    } else {
                        Context context = iVar.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        Intrinsics.checkNotNullExpressionValue(iVar.getResources(), "getResources(...)");
                        y03 = a0.q0(context) ? dl2.b.y0(iVar, eo1.a.color_background_dark_opacity_500) : -1;
                    }
                    Integer num2 = iVar2.f135885g;
                    if (num2 != null) {
                        iVar.f2(y03, num2.intValue());
                    } else {
                        Context context2 = iVar.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        Intrinsics.checkNotNullExpressionValue(iVar.getResources(), "getResources(...)");
                        int y04 = a0.q0(context2) ? dl2.b.y0(iVar, eo1.a.color_background_dark_opacity_500) : -1;
                        iVar.f2(y03, y04);
                        fVar.f135869l = Integer.valueOf(y04);
                    }
                }
                return Unit.f80348a;
            default:
                Boolean bool = (Boolean) obj;
                Intrinsics.f(bool);
                boolean booleanValue = bool.booleanValue();
                iVar.getClass();
                float f13 = booleanValue ? i.L0 : 0.0f;
                FrameLayout frameLayout = iVar.H0;
                if (frameLayout == null) {
                    Intrinsics.r("moduleContainer");
                    throw null;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(frameLayout, "y", iVar.G + f13);
                ofFloat.setDuration(100L);
                ofFloat.start();
                return Unit.f80348a;
        }
    }
}
