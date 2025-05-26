package q71;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadYourBoardCell;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f102795i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a1 f102796j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(a1 a1Var, int i13) {
        super(0);
        this.f102795i = i13;
        this.f102796j = a1Var;
    }

    public final LinearLayout b() {
        int i13 = this.f102795i;
        final a1 a1Var = this.f102796j;
        switch (i13) {
            case 0:
                int i14 = n42.e.search_typeahead_your_pins_footer_lego;
                final int i15 = 0;
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: q71.y0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i16 = i15;
                        a1 this$0 = a1Var;
                        switch (i16) {
                            case 0:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                o71.x xVar = this$0.C0;
                                if (xVar != null) {
                                    xVar.w3(true);
                                    break;
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                o71.x xVar2 = this$0.C0;
                                if (xVar2 != null) {
                                    xVar2.w3(true);
                                    break;
                                }
                                break;
                        }
                    }
                };
                int i16 = x.O0;
                return a1Var.V8(i14, onClickListener, null);
            default:
                final int i17 = 1;
                return a1Var.V8(n42.e.search_typeahead_your_pins_footer_lego, new View.OnClickListener() { // from class: q71.y0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i162 = i17;
                        a1 this$0 = a1Var;
                        switch (i162) {
                            case 0:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                o71.x xVar = this$0.C0;
                                if (xVar != null) {
                                    xVar.w3(true);
                                    break;
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                o71.x xVar2 = this$0.C0;
                                if (xVar2 != null) {
                                    xVar2.w3(true);
                                    break;
                                }
                                break;
                        }
                    }
                }, Integer.valueOf(k42.d.autocomplete_pin_footer));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f102795i) {
            case 0:
                return b();
            case 1:
                Context requireContext = this.f102796j.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new SearchTypeaheadYourBoardCell(6, requireContext, (AttributeSet) null);
            default:
                return b();
        }
    }
}
