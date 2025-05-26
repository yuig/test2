package gs0;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import lq0.g1;
import m60.r0;
import m60.w;
import pk.a0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f66027a;

    /* renamed from: b, reason: collision with root package name */
    public final w f66028b;

    public c(Context context, w eventManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f66027a = context;
        this.f66028b = eventManager;
    }

    public static /* synthetic */ RelativeLayout b(c cVar, String str, String str2, rm1.q qVar, int i13) {
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            qVar = null;
        }
        return cVar.a(str, str2, qVar);
    }

    public final RelativeLayout a(CharSequence titleText, String str, rm1.q qVar) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        boolean z13 = str != null;
        Context context = this.f66027a;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(r0.margin);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(r0.margin_triple);
        GestaltText gestaltText = null;
        rm1.d dVar = qVar != null ? new rm1.d(new rm1.f(qVar), rm1.c.DEFAULT, fm1.c.VISIBLE, 0, null, 24) : null;
        GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
        gestaltText2.setTextDirection(2);
        gestaltText2.i(new g1(11, titleText, dVar));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        Resources resources = gestaltText2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        int L = a0.L(resources, 8.0f);
        layoutParams.topMargin = L;
        if (!z13) {
            layoutParams.bottomMargin = L;
        }
        layoutParams.setMarginStart(dimensionPixelSize);
        Resources resources2 = gestaltText2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        layoutParams.setMarginEnd(a0.L(resources2, 16.0f));
        gestaltText2.setLayoutParams(layoutParams);
        dl2.b.y2(gestaltText2);
        if (z13) {
            GestaltText gestaltText3 = new GestaltText(6, context, (AttributeSet) null);
            gestaltText3.i(new kl0.c(str, 22));
            gestaltText3.setTextAlignment(5);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            if (qVar != null) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            layoutParams2.setMarginStart(dimensionPixelSize);
            Resources resources3 = gestaltText3.getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
            layoutParams2.setMarginEnd(a0.L(resources3, 16.0f));
            Resources resources4 = gestaltText3.getResources();
            Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
            layoutParams2.bottomMargin = a0.L(resources4, 8.0f);
            layoutParams2.addRule(3, gestaltText2.getId());
            gestaltText3.setLayoutParams(layoutParams2);
            dl2.b.y2(gestaltText3);
            gestaltText = gestaltText3;
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.addView(gestaltText2);
        if (gestaltText != null) {
            relativeLayout.addView(gestaltText);
        }
        return relativeLayout;
    }

    public final FrameLayout c(int i13, int i14) {
        FrameLayout frameLayout = new FrameLayout(this.f66027a);
        Context context = frameLayout.getContext();
        int i15 = eo1.b.color_gray_100;
        Object obj = d5.a.f53679a;
        frameLayout.setBackgroundColor(context.getColor(i15));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 1);
        layoutParams.topMargin = i13;
        layoutParams.bottomMargin = i14;
        frameLayout.setLayoutParams(layoutParams);
        return frameLayout;
    }
}
