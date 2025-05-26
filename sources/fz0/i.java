package fz0;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.ia0;
import com.pinterest.api.model.ya0;
import com.pinterest.feature.pear.quiz.view.QuizNuxView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import h32.f1;
import h32.u0;
import java.util.List;
import kh2.s0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import pk.a0;
import rq.t4;

/* loaded from: classes5.dex */
public final class i extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f63124r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f63125s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ View f63126t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, View view, bl2.c cVar) {
        super(2, cVar);
        this.f63125s = lVar;
        this.f63126t = view;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        i iVar = new i(this.f63125s, this.f63126t, cVar);
        iVar.f63124r = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((b) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String h10;
        List i13;
        List i14;
        List j13;
        String str2;
        List j14;
        List g13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        b bVar = (b) this.f63124r;
        ia0 ia0Var = bVar.f63115a;
        l lVar = this.f63125s;
        if (ia0Var == null) {
            GestaltSpinner gestaltSpinner = lVar.f63140i0;
            if (gestaltSpinner != null) {
                s0.w(gestaltSpinner, h.f63123i);
                return Unit.f80348a;
            }
            Intrinsics.r("loadingIndicator");
            throw null;
        }
        GestaltSpinner gestaltSpinner2 = lVar.f63140i0;
        if (gestaltSpinner2 == null) {
            Intrinsics.r("loadingIndicator");
            throw null;
        }
        bs1.c.X0(gestaltSpinner2);
        boolean z13 = bVar.f63118d;
        int i15 = 0;
        ia0 ia0Var2 = bVar.f63115a;
        boolean z14 = z13 && ia0Var2.n() != null;
        String s13 = ia0Var2.s();
        if (s13 != null) {
            GestaltText gestaltText = lVar.f63136e0;
            if (gestaltText == null) {
                Intrinsics.r("titleView");
                throw null;
            }
            gestaltText.i(new t4(s13, z14, 18));
        }
        GestaltIconButton gestaltIconButton = (GestaltIconButton) this.f63126t.findViewById(iy1.d.back_button);
        int i16 = 12;
        gestaltIconButton.u(new lq0.o(i16, bVar, lVar));
        gestaltIconButton.t(new dv0.n(z14, 13));
        if (!z14) {
            QuizNuxView quizNuxView = lVar.f63138g0;
            if (quizNuxView == null) {
                Intrinsics.r("quizNuxView");
                throw null;
            }
            bs1.c.X0(quizNuxView);
            FrameLayout frameLayout = lVar.f63137f0;
            if (frameLayout == null) {
                Intrinsics.r("contentContainer");
                throw null;
            }
            frameLayout.removeAllViews();
            FrameLayout frameLayout2 = lVar.f63137f0;
            if (frameLayout2 == null) {
                Intrinsics.r("contentContainer");
                throw null;
            }
            frameLayout2.setAlpha(0.0f);
            FrameLayout frameLayout3 = lVar.f63137f0;
            if (frameLayout3 == null) {
                Intrinsics.r("contentContainer");
                throw null;
            }
            Context requireContext = lVar.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            hz0.d dVar = new hz0.d(requireContext);
            dVar.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -1));
            dVar.L(bVar, lVar.Y7());
            frameLayout3.addView(dVar, -1, -1);
            FrameLayout frameLayout4 = lVar.f63137f0;
            if (frameLayout4 == null) {
                Intrinsics.r("contentContainer");
                throw null;
            }
            frameLayout4.animate().alpha(1.0f).start();
            float size = (bVar.f63116b + 1) / (ia0Var2.q() != null ? r2.size() : 12.0f);
            View view = lVar.f63139h0;
            if (view == null) {
                Intrinsics.r("progressBar");
                throw null;
            }
            bs1.c.U1(view);
            view.getLayoutParams().width = (int) (hf0.b.f69002b * size);
            return Unit.f80348a;
        }
        QuizNuxView quizNuxView2 = lVar.f63138g0;
        if (quizNuxView2 == null) {
            Intrinsics.r("quizNuxView");
            throw null;
        }
        bs1.c.U1(quizNuxView2);
        QuizNuxView quizNuxView3 = lVar.f63138g0;
        if (quizNuxView3 == null) {
            Intrinsics.r("quizNuxView");
            throw null;
        }
        ya0 n13 = ia0Var2.n();
        d0 pinalytics = lVar.s7();
        au0.a listener = new au0.a(lVar, 19);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(listener, "listener");
        ((WebImageView) quizNuxView3.findViewById(iy1.d.quiz_nux_image)).loadUrl((n13 == null || (g13 = n13.g()) == null) ? null : (String) CollectionsKt.firstOrNull(g13));
        View findViewById = quizNuxView3.findViewById(iy1.d.quiz_nux_title_1);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltText gestaltText2 = (GestaltText) findViewById;
        String str3 = "";
        if (n13 == null || (j14 = n13.j()) == null || (str = (String) CollectionsKt.U(0, j14)) == null) {
            str = "";
        }
        a0.p(gestaltText2, str);
        View findViewById2 = quizNuxView3.findViewById(iy1.d.quiz_nux_title_2);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltText gestaltText3 = (GestaltText) findViewById2;
        if (n13 != null && (j13 = n13.j()) != null && (str2 = (String) CollectionsKt.U(1, j13)) != null) {
            str3 = str2;
        }
        a0.p(gestaltText3, str3);
        View findViewById3 = quizNuxView3.findViewById(iy1.d.quiz_nux_icon_1);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        QuizNuxView.a((GestaltIcon) findViewById3, (n13 == null || (i14 = n13.i()) == null) ? null : (Integer) CollectionsKt.U(0, i14));
        View findViewById4 = quizNuxView3.findViewById(iy1.d.quiz_nux_icon_2);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        QuizNuxView.a((GestaltIcon) findViewById4, (n13 == null || (i13 = n13.i()) == null) ? null : (Integer) CollectionsKt.U(1, i13));
        GestaltButton gestaltButton = (GestaltButton) quizNuxView3.findViewById(iy1.d.quiz_nux_start_button);
        if (n13 != null && (h10 = n13.h()) != null) {
            gestaltButton.d(new zu0.c(h10, i16));
        }
        gestaltButton.e(new hz0.b(pinalytics, listener, i15));
        c0.d.u2(pinalytics, f1.VIEW, null, u0.PEAR_ENTER_QUIZ_BUTTON, null, 10);
        View view2 = lVar.f63139h0;
        if (view2 != null) {
            bs1.c.X0(view2);
            return Unit.f80348a;
        }
        Intrinsics.r("progressBar");
        throw null;
    }
}
