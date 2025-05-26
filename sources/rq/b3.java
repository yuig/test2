package rq;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.pinterest.activity.pin.view.PinCloseupChevronIconView;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b3 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109116i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e3 f109117j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b3(e3 e3Var, int i13) {
        super(0);
        this.f109116i = i13;
        this.f109117j = e3Var;
    }

    public final ViewGroup b() {
        int i13 = this.f109116i;
        e3 e3Var = this.f109117j;
        switch (i13) {
            case 1:
                e3Var.getClass();
                FrameLayout frameLayout = new FrameLayout(e3Var.getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(13);
                layoutParams.addRule(21);
                ViewGroup.LayoutParams layoutParams2 = ((PinCloseupChevronIconView) e3Var.f109167p.getValue()).getLayoutParams();
                com.bumptech.glide.c.a1(layoutParams, 0, 0, frameLayout.getResources().getDimensionPixelSize(eo1.c.margin_double) + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0), 0);
                frameLayout.setLayoutParams(layoutParams);
                return frameLayout;
            default:
                e3Var.getClass();
                RelativeLayout relativeLayout = new RelativeLayout(e3Var.getContext());
                relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                int W = e3Var.f109172u ? bs1.c.W(relativeLayout, eo1.c.space_300) : bs1.c.W(relativeLayout, eo1.c.space_500);
                relativeLayout.setPaddingRelative(bs1.c.W(relativeLayout, eo1.c.space_300), W, 0, W);
                relativeLayout.addView((GestaltText) e3Var.f109169r.getValue());
                if (e3Var.j()) {
                    relativeLayout.addView((ViewGroup) e3Var.f109168q.getValue());
                }
                if (e3Var.f109165n) {
                    e3Var.g(relativeLayout);
                }
                boolean a13 = e3Var.i().a();
                xk2.v vVar = e3Var.f109167p;
                if (a13) {
                    PinCloseupChevronIconView pinCloseupChevronIconView = (PinCloseupChevronIconView) vVar.getValue();
                    int i14 = PinCloseupChevronIconView.f34986b;
                    pinCloseupChevronIconView.T(0L, false);
                } else {
                    PinCloseupChevronIconView pinCloseupChevronIconView2 = (PinCloseupChevronIconView) vVar.getValue();
                    int i15 = PinCloseupChevronIconView.f34986b;
                    pinCloseupChevronIconView2.X(0L, false);
                }
                return relativeLayout;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        z32.c cVar;
        int i13 = this.f109116i;
        e3 e3Var = this.f109117j;
        switch (i13) {
            case 0:
                Context context = e3Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                PinCloseupChevronIconView pinCloseupChevronIconView = new PinCloseupChevronIconView(context);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(13);
                layoutParams.addRule(21);
                com.bumptech.glide.c.a1(layoutParams, 0, 0, bs1.c.W(pinCloseupChevronIconView, eo1.c.space_600), 0);
                pinCloseupChevronIconView.setLayoutParams(layoutParams);
                if (e3Var.f109165n) {
                    int W = bs1.c.W(pinCloseupChevronIconView, eo1.c.space_300);
                    pinCloseupChevronIconView.setPaddingRelative(W, 0, W, 0);
                }
                return pinCloseupChevronIconView;
            case 1:
                return b();
            case 2:
                int i14 = (!e3Var.j() || (cVar = e3Var.B) == z32.c.EXPANDED || cVar == z32.c.PREVIEW_EXPANDED) ? 3 : 0;
                Context context2 = e3Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                b11.d dVar = new b11.d(i14, context2);
                dVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                if (e3Var.f109165n) {
                    e3Var.g(dVar);
                }
                return dVar;
            case 3:
                return b();
            default:
                e3Var.getClass();
                Context context3 = e3Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                GestaltText gestaltText = new GestaltText(6, context3, (AttributeSet) null);
                gestaltText.i(f2.f109192t);
                gestaltText.setTextDirection(5);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.setMargins(0, 0, 0, gestaltText.getResources().getDimensionPixelOffset(eo1.c.lego_brick_quarter));
                gestaltText.setLayoutParams(layoutParams2);
                if (!e3Var.f109165n) {
                    dl2.b.y2(gestaltText);
                }
                return gestaltText;
        }
    }
}
