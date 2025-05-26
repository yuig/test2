package ny0;

import android.content.Context;
import android.content.res.Resources;
import android.widget.FrameLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f92632i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v f92633j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(v vVar, int i13) {
        super(0);
        this.f92632i = i13;
        this.f92633j = vVar;
    }

    public final GestaltText b() {
        u50.h0 h0Var = u50.h0.f120562a;
        int i13 = this.f92632i;
        v vVar = this.f92633j;
        switch (i13) {
            case 0:
                Context requireContext = vVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                GestaltText gestaltText = new GestaltText(requireContext, new rn1.a(h0Var, null, kotlin.collections.e0.b(vn1.b.CENTER), null, vn1.g.UI_400, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097130));
                Resources resources = gestaltText.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                int U = bs1.c.U(eo1.c.space_500, resources);
                Resources resources2 = gestaltText.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                int U2 = bs1.c.U(eo1.c.space_500, resources2);
                Resources resources3 = gestaltText.getResources();
                Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                gestaltText.setPaddingRelative(U, 0, U2, bs1.c.U(eo1.c.space_600, resources3));
                return gestaltText;
            default:
                Context requireContext2 = vVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                GestaltText gestaltText2 = new GestaltText(requireContext2, new rn1.a(h0Var, null, null, null, vn1.g.UI_400, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097134));
                Resources resources4 = gestaltText2.getResources();
                Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
                int U3 = bs1.c.U(eo1.c.space_400, resources4);
                int paddingTop = gestaltText2.getPaddingTop();
                Resources resources5 = gestaltText2.getResources();
                Intrinsics.checkNotNullExpressionValue(resources5, "getResources(...)");
                int U4 = bs1.c.U(eo1.c.space_400, resources5);
                Resources resources6 = gestaltText2.getResources();
                Intrinsics.checkNotNullExpressionValue(resources6, "getResources(...)");
                gestaltText2.setPaddingRelative(U3, paddingTop, U4, bs1.c.U(eo1.c.space_200, resources6));
                return gestaltText2;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f92632i;
        v vVar = this.f92633j;
        switch (i13) {
            case 0:
                return b();
            case 1:
                Context requireContext = vVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                nx.d0 s73 = vVar.s7();
                androidx.lifecycle.z viewLifecycleOwner = vVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                androidx.lifecycle.u S = bf.b.S(viewLifecycleOwner);
                qa2.e k93 = v.k9(vVar);
                rm1.q qVar = rm1.q.CHECK;
                om1.e eVar = om1.e.MD;
                return new v42.k(requireContext, s73, S, k93.f103256a, null, false, true, true, true, true, new v42.h(new om1.c(qVar, eVar, om1.f.DEFAULT_DARK_GRAY, null, null, false, 0, 1016), new om1.c(rm1.q.ANGLED_PIN, eVar, om1.f.DEFAULT_WHITE, null, null, false, 0, 1016)), 1072);
            case 2:
                Context requireContext2 = vVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                int i14 = jv1.h.use_case_feed_show_more;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                GestaltButton gestaltButton = new GestaltButton(requireContext2, new yl1.b(new u50.k0(i14, new ArrayList(0)), false, null, null, yl1.d.SECONDARY.getColorPalette(), yl1.c.SMALL, null, rm1.q.ARROW_DOWN, 0, null, 846));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                Resources resources = vVar.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                int U = bs1.c.U(eo1.c.sema_space_50, resources);
                Resources resources2 = vVar.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                com.bumptech.glide.c.b1(layoutParams, 0, U, 0, bs1.c.U(eo1.c.space_100, resources2), 5);
                FrameLayout frameLayout = new FrameLayout(vVar.requireContext());
                frameLayout.addView(gestaltButton, layoutParams);
                return frameLayout;
            default:
                return b();
        }
    }
}
