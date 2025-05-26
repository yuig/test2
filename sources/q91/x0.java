package q91;

import android.content.Context;
import android.view.View;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.h4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class x0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103180a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f103181b;

    public /* synthetic */ x0(a1 a1Var, int i13) {
        this.f103180a = i13;
        this.f103181b = a1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f103180a;
        a1 this$0 = this.f103181b;
        switch (i13) {
            case 0:
                int i14 = a1.f103055j0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.D5();
                return;
            case 1:
                int i15 = a1.f103055j0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.s7().h(h32.g0.LANGUAGE_MAIN_MENU, h32.u0.DEFAULT_LANGUAGE_BUTTON, null);
                NavigationImpl L = Navigation.L(h4.b(), "", ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue());
                GestaltText gestaltText = this$0.f103058e0;
                if (gestaltText == null) {
                    Intrinsics.r("languageSelected");
                    throw null;
                }
                u50.i0 i0Var = gestaltText.l().f108849g;
                Context requireContext = this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                L.y0(i0Var.a(requireContext), "com.pinterest.EXTRA_SETTINGS_LANGUAGE");
                this$0.f7().d(L);
                return;
            default:
                int i16 = a1.f103055j0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.s7().h(h32.g0.LANGUAGE_MAIN_MENU, h32.u0.ADDITIONAL_LANGUAGE_BUTTON, null);
                NavigationImpl L2 = Navigation.L(h4.b(), "", ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue());
                GestaltText gestaltText2 = this$0.f103058e0;
                if (gestaltText2 == null) {
                    Intrinsics.r("languageSelected");
                    throw null;
                }
                u50.i0 i0Var2 = gestaltText2.l().f108849g;
                Context requireContext2 = this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                L2.y0(i0Var2.a(requireContext2), "com.pinterest.EXTRA_SETTINGS_LANGUAGE");
                L2.y0(Boolean.TRUE, "com.pinterest.EXTRA_SETTINGS_ADDITIONAL_LANGUAGE");
                this$0.f7().d(L2);
                return;
        }
    }
}
