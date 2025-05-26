package l11;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.divider.GestaltDivider;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import pk.a0;

/* loaded from: classes5.dex */
public final class g extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81415i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f81416j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(j jVar, int i13) {
        super(0);
        this.f81415i = i13;
        this.f81416j = jVar;
    }

    public final o b() {
        int i13 = this.f81415i;
        j jVar = this.f81416j;
        switch (i13) {
            case 3:
                Context requireContext = jVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new o(requireContext);
            default:
                Context requireContext2 = jVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new o(requireContext2);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f81415i;
        j jVar = this.f81416j;
        switch (i13) {
            case 1:
                Context requireContext = jVar.requireContext();
                ((b60.d) jVar.getActiveUserManager()).f();
                break;
            case 2:
                Context context = jVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                e eVar = new e(context);
                View.inflate(context, e02.c.list_cell_board_name_suggestion_with_board_rep, eVar);
                View findViewById = eVar.findViewById(e02.b.divider);
                Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                eVar.f81407a = (GestaltDivider) findViewById;
                View findViewById2 = eVar.findViewById(e02.b.header);
                Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
                eVar.f81408b = (GestaltText) findViewById2;
                View findViewById3 = eVar.findViewById(e02.b.board_name);
                Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
                eVar.f81409c = (GestaltText) findViewById3;
                View findViewById4 = eVar.findViewById(e02.b.board_info_wrapper);
                Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
                LinearLayout linearLayout = (LinearLayout) findViewById4;
                eVar.setOrientation(1);
                eVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                eVar.setOnClickListener(new com.pinterest.feature.home.view.c(eVar, 16));
                linearLayout.setPaddingRelative(0, 0, 0, 0);
                String text = eVar.getResources().getString(e02.e.tap_to_create_a_new_board);
                Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                Intrinsics.checkNotNullParameter(text, "text");
                a0.p(eVar.f81408b, text);
                if (bs1.c.l1(linearLayout)) {
                    int dimensionPixelOffset = eVar.getResources().getDimensionPixelOffset(eo1.c.sema_rounding_300);
                    View findViewById5 = eVar.findViewById(e02.b.pin_iv_suggested_1);
                    Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
                    View findViewById6 = eVar.findViewById(e02.b.pin_iv_suggested_2);
                    Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
                    View findViewById7 = eVar.findViewById(e02.b.pin_iv_suggested_3);
                    Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
                    float f13 = dimensionPixelOffset;
                    ((WebImageView) findViewById5).g2(0.0f, f13, 0.0f, f13);
                    ((WebImageView) findViewById6).g2(f13, 0.0f, 0.0f, 0.0f);
                    ((WebImageView) findViewById7).g2(0.0f, 0.0f, f13, 0.0f);
                    break;
                }
                break;
        }
        return b();
    }
}
