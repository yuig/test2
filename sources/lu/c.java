package lu;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule;
import java.util.concurrent.TimeUnit;
import kh2.m2;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84863i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f84864j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(f fVar, int i13) {
        super(1);
        this.f84863i = i13;
        this.f84864j = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f84863i;
        f fVar = this.f84864j;
        switch (i13) {
            case 0:
                boolean z13 = fVar.f84884J;
                LinearLayout linearLayout = fVar.f53208j;
                if (z13) {
                    f.t0(fVar, linearLayout.getMeasuredHeight());
                } else {
                    int measuredHeight = linearLayout.getMeasuredHeight();
                    Context context = fVar.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    if (m2.u1(context)) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fVar, "y", (fVar.F - measuredHeight) - 40);
                        ofFloat.setDuration(1000L);
                        ofFloat.start();
                    } else {
                        ek2.f i14 = fk2.m.f62459a.d(100L, TimeUnit.MILLISECONDS).h(wj2.c.a()).i(new ap.i(fVar, measuredHeight, 1), new zt.b(11, a.f84847n));
                        Intrinsics.checkNotNullExpressionValue(i14, "subscribe(...)");
                        fVar.L.a(i14);
                    }
                }
                fVar.f84884J = true;
                fVar.L(null, -2);
                break;
            default:
                fVar.G = fVar.f53208j.getMeasuredHeight() - ((Number) ((Pair) obj).f80347b).intValue();
                cu.a aVar = fVar.f53211m;
                if (aVar != null) {
                    BaseAdsScrollingModule baseAdsScrollingModule = (BaseAdsScrollingModule) aVar;
                    baseAdsScrollingModule.V1();
                    baseAdsScrollingModule.U1();
                    FrameLayout frameLayout = baseAdsScrollingModule.f35324k0;
                    if (frameLayout != null) {
                        pk.a0.k1(frameLayout, (int) baseAdsScrollingModule.n1().f35422i);
                    }
                    if (baseAdsScrollingModule.f35322i0 < baseAdsScrollingModule.n1().f35422i) {
                        if (frameLayout != null) {
                            pk.a0.k1(frameLayout, (int) baseAdsScrollingModule.n1().f35422i);
                        }
                    } else if (frameLayout != null) {
                        pk.a0.k1(frameLayout, baseAdsScrollingModule.f35322i0 - baseAdsScrollingModule.P0());
                    }
                }
                break;
        }
        return Unit.f80348a;
    }
}
