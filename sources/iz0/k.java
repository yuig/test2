package iz0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.pinterest.api.model.cb0;
import com.pinterest.api.model.gc0;
import com.pinterest.feature.pear.ui.animatedpins.AnimatedPinVerticalCarouselView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.f1;
import h32.u0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ni1.t2;
import qa2.j0;
import so.jb;
import so.oa;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73922i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f73923j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(n nVar, int i13) {
        super(0);
        this.f73922i = i13;
        this.f73923j = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        gc0 x13;
        c cVar = c.f73899a;
        int i13 = this.f73922i;
        int i14 = 1;
        n nVar = this.f73923j;
        switch (i13) {
            case 0:
                j0 j0Var = nVar.S0;
                if (j0Var == null) {
                    Intrinsics.r("pinGridCellFactory");
                    throw null;
                }
                Context requireContext = nVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return (View) ((qa2.d) j0Var).a(requireContext, true);
            case 1:
                switch (i13) {
                    case 1:
                        int i15 = n.Y0;
                        nVar.P7();
                        break;
                    default:
                        int i16 = n.Y0;
                        nVar.k9().f73913f.e().a(cVar);
                        break;
                }
                return Unit.f80348a;
            case 2:
                Context context = nVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                kz0.f fVar = new kz0.f(context, 11);
                fVar.f81157f = q0.f80391a;
                View.inflate(context, iy1.e.view_quiz_result_header, fVar);
                fVar.setOrientation(1);
                fVar.setGravity(1);
                View findViewById = fVar.findViewById(iy1.d.cover_pin_carousel_one);
                ((AnimatedPinVerticalCarouselView) findViewById).f46876d = 8000.0f;
                Unit unit = Unit.f80348a;
                View findViewById2 = fVar.findViewById(iy1.d.cover_pin_carousel_two);
                ((AnimatedPinVerticalCarouselView) findViewById2).f46876d = 9143.0f;
                View findViewById3 = fVar.findViewById(iy1.d.cover_pin_carousel_three);
                ((AnimatedPinVerticalCarouselView) findViewById3).f46876d = 10667.0f;
                View findViewById4 = fVar.findViewById(iy1.d.cover_pin_carousel_four);
                ((AnimatedPinVerticalCarouselView) findViewById4).f46876d = 12800.0f;
                fVar.f81157f = kotlin.collections.f0.j(findViewById, findViewById2, findViewById3, findViewById4);
                return fVar;
            case 3:
                Context context2 = nVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                Intrinsics.checkNotNullParameter(context2, "context");
                kz0.m mVar = new kz0.m(context2);
                if (!mVar.f81173b) {
                    mVar.f81173b = true;
                    jb jbVar = (jb) ((kz0.n) mVar.generatedComponent());
                    oa oaVar = jbVar.f113483a;
                    mVar.f81174c = (m60.w) oaVar.f113885r0.get();
                    mVar.f81175d = (b60.b) oaVar.f113850p0.get();
                    mVar.f81176e = oaVar.j2();
                    mVar.f81177f = oaVar.v2();
                    mVar.f81178g = (t2) oaVar.f113950uc.get();
                    mVar.f81179h = (ni1.d0) oaVar.Gb.get();
                    mVar.f81180i = jbVar.f113485c.e5();
                }
                mVar.setOrientation(1);
                int W = bs1.c.W(mVar, eo1.c.space_400);
                mVar.setPadding(W, W, W, W);
                mVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                return mVar;
            case 4:
                Context requireContext2 = nVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                h01.e eVar = new h01.e(requireContext2, nVar.s7(), new h80.h(nVar, i14));
                cb0 cb0Var = nVar.Q0;
                if (cb0Var != null && (x13 = cb0Var.x()) != null) {
                    Integer g13 = x13.g();
                    Intrinsics.checkNotNullExpressionValue(g13, "getHappySurveyId(...)");
                    int intValue = g13.intValue();
                    Integer h10 = x13.h();
                    Intrinsics.checkNotNullExpressionValue(h10, "getNeutralSurveyId(...)");
                    int intValue2 = h10.intValue();
                    Integer i17 = x13.i();
                    Intrinsics.checkNotNullExpressionValue(i17, "getSadSurveyId(...)");
                    int intValue3 = i17.intValue();
                    String j13 = x13.j();
                    Pair[] pairArr = new Pair[2];
                    pairArr[0] = new Pair("quiz_id", nVar.R0);
                    cb0 cb0Var2 = nVar.Q0;
                    String y13 = cb0Var2 != null ? cb0Var2.y() : null;
                    if (y13 == null) {
                        y13 = "";
                    }
                    pairArr[1] = new Pair("result", y13);
                    eVar.L(new h01.c(intValue, intValue2, intValue3, j13, z0.g(pairArr), 1));
                }
                return eVar;
            case 5:
                switch (i13) {
                    case 1:
                        int i18 = n.Y0;
                        nVar.P7();
                        break;
                    default:
                        int i19 = n.Y0;
                        nVar.k9().f73913f.e().a(cVar);
                        break;
                }
                return Unit.f80348a;
            case 6:
                Context requireContext3 = nVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                kz0.b bVar = new kz0.b(requireContext3, nVar.s7());
                cb0 cb0Var3 = nVar.Q0;
                k onRetakeQuiz = new k(nVar, 5);
                Intrinsics.checkNotNullParameter(onRetakeQuiz, "onRetakeQuiz");
                Context context3 = bVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                GestaltText gestaltText = new GestaltText(6, context3, (AttributeSet) null);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.topMargin = bs1.c.W(gestaltText, eo1.c.space_600);
                gestaltText.setLayoutParams(layoutParams);
                gestaltText.i(new kz0.a(cb0Var3, 0));
                bVar.addView(gestaltText);
                Context context4 = bVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                GestaltButton gestaltButton = new GestaltButton(0, 14, context4, (AttributeSet) null);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                int W2 = bs1.c.W(gestaltButton, eo1.c.space_500);
                layoutParams2.setMargins(W2, W2, W2, W2);
                gestaltButton.setLayoutParams(layoutParams2);
                gestaltButton.d(new kz0.a(cb0Var3, 1));
                gestaltButton.e(new lq0.o(13, bVar, onRetakeQuiz));
                c0.d.u2(bVar.f81140a, f1.VIEW, null, u0.PEAR_RETAKE_QUIZ_BUTTON, null, 10);
                bVar.addView(gestaltButton);
                return bVar;
            default:
                c0.d.u2(nVar.s7(), f1.VIEW, h32.g0.PEAR_MORE_IDEAS_SECTION, null, null, 12);
                FrameLayout frameLayout = new FrameLayout(nVar.requireContext());
                Context requireContext4 = nVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                GestaltText gestaltText2 = new GestaltText(6, requireContext4, (AttributeSet) null);
                gestaltText2.i(l.f73924j);
                frameLayout.addView(gestaltText2);
                int W3 = bs1.c.W(frameLayout, eo1.c.space_600);
                frameLayout.setPadding(W3, W3, W3, W3);
                return frameLayout;
        }
    }
}
