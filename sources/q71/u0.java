package q71;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f102767i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v0 f102768j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(v0 v0Var, int i13) {
        super(0);
        this.f102767i = i13;
        this.f102768j = v0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        final v0 v0Var = this.f102768j;
        GestaltText gestaltText = null;
        final int i13 = 1;
        switch (this.f102767i) {
            case 0:
                int i14 = n42.e.search_typeahead_pins_footer_lego;
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: q71.t0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i15 = i13;
                        v0 this$0 = v0Var;
                        switch (i15) {
                            case 0:
                                int i16 = v0.f102774e1;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                o71.x xVar = this$0.C0;
                                if (xVar != null) {
                                    xVar.x3();
                                    break;
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                o71.x xVar2 = this$0.C0;
                                if (xVar2 != null) {
                                    xVar2.w3(false);
                                    break;
                                }
                                break;
                        }
                    }
                };
                int i15 = x.O0;
                return v0Var.V8(i14, onClickListener, null);
            default:
                int i16 = v0.f102774e1;
                ho0.f fVar = new ho0.f(v0Var.getContext(), 2);
                fVar.setOrientation(1);
                fVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                fVar.setGravity(1);
                fVar.setPaddingRelative(fVar.getPaddingStart(), fVar.getPaddingTop(), fVar.getPaddingEnd(), fVar.getResources().getDimensionPixelSize(eo1.c.space_600));
                View view = new View(v0Var.getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, bs1.c.W(view, eo1.c.lego_brick_quarter));
                layoutParams.topMargin = view.getResources().getDimensionPixelSize(eo1.c.space_200);
                layoutParams.bottomMargin = view.getResources().getDimensionPixelSize(eo1.c.space_600);
                layoutParams.setMarginStart(view.getResources().getDimensionPixelSize(eo1.c.space_200));
                layoutParams.setMarginEnd(view.getResources().getDimensionPixelSize(eo1.c.space_200));
                view.setLayoutParams(layoutParams);
                Context context = view.getContext();
                int i17 = eo1.b.color_themed_light_gray;
                Object obj = d5.a.f53679a;
                view.setBackgroundColor(context.getColor(i17));
                fVar.addView(view);
                Context context2 = v0Var.getContext();
                if (context2 != null) {
                    GestaltText gestaltText2 = new GestaltText(6, context2, (AttributeSet) null);
                    gestaltText2.i(q.f102752x);
                    gestaltText = gestaltText2;
                }
                fVar.addView(gestaltText);
                final int i18 = 0;
                fVar.addView(v0Var.V8(n42.e.search_typeahead_your_pins_footer_lego, new View.OnClickListener() { // from class: q71.t0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i152 = i18;
                        v0 this$0 = v0Var;
                        switch (i152) {
                            case 0:
                                int i162 = v0.f102774e1;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                o71.x xVar = this$0.C0;
                                if (xVar != null) {
                                    xVar.x3();
                                    break;
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                o71.x xVar2 = this$0.C0;
                                if (xVar2 != null) {
                                    xVar2.w3(false);
                                    break;
                                }
                                break;
                        }
                    }
                }, Integer.valueOf(k42.d.autocomplete_pin_footer)));
                return fVar;
        }
    }
}
