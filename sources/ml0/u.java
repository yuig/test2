package ml0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87505i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f87506j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(w wVar, int i13) {
        super(0);
        this.f87505i = i13;
        this.f87506j = wVar;
    }

    public final GestaltText b() {
        int i13 = this.f87505i;
        w wVar = this.f87506j;
        switch (i13) {
            case 0:
                Context requireContext = wVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                GestaltText gestaltText = new GestaltText(6, requireContext, (AttributeSet) null);
                int i14 = d70.g.header_image_creation_education_tip;
                gestaltText.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                int W = bs1.c.W(gestaltText, eo1.c.space_1300);
                gestaltText.setPaddingRelative(W, gestaltText.getPaddingTop(), W, bs1.c.W(gestaltText, eo1.c.space_400));
                gestaltText.i(new r1.j0(i14, 18));
                return gestaltText;
            default:
                Context requireContext2 = wVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                GestaltText gestaltText2 = new GestaltText(6, requireContext2, (AttributeSet) null);
                int i15 = d70.g.header_image_creation_recycler_section_title;
                gestaltText2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                int W2 = bs1.c.W(gestaltText2, eo1.c.space_400);
                gestaltText2.setPaddingRelative(W2, W2, W2, W2);
                gestaltText2.i(new r1.j0(i15, 19));
                return gestaltText2;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f87505i;
        w wVar = this.f87506j;
        switch (i13) {
            case 0:
                return b();
            case 1:
                Context requireContext = wVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new ho0.f(requireContext, 0);
            case 2:
                return b();
            default:
                Context context = wVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                ic0.b bVar = new ic0.b(context);
                View.inflate(context, a70.b.view_board_header_image_selector_empty_state, bVar);
                bVar.setOrientation(1);
                return bVar;
        }
    }
}
