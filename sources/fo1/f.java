package fo1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.pinterest.design.brio.widget.IconView;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import kh2.n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import rm1.q;
import we1.a2;
import xm1.k;

/* loaded from: classes5.dex */
public final class f extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62745i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f62746j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ GestaltToolbarImpl f62747k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Context context, GestaltToolbarImpl gestaltToolbarImpl, int i13) {
        super(0);
        this.f62745i = i13;
        this.f62746j = context;
        this.f62747k = gestaltToolbarImpl;
    }

    public final GestaltText b() {
        Context context = this.f62746j;
        int i13 = this.f62745i;
        GestaltToolbarImpl gestaltToolbarImpl = this.f62747k;
        switch (i13) {
            case 1:
                GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
                gestaltText.i(new an1.i(gestaltToolbarImpl, 23));
                gestaltText.setSingleLine(false);
                gestaltText.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                dl2.b.y2(gestaltText);
                dl2.b.C2(gestaltText);
                gestaltToolbarImpl.z().addView(gestaltText);
                return gestaltText;
            default:
                GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
                gestaltText2.i(new k(17, gestaltToolbarImpl, context));
                gestaltText2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                dl2.b.y2(gestaltText2);
                gestaltToolbarImpl.z().addView(gestaltText2);
                return gestaltText2;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f62745i;
        GestaltToolbarImpl gestaltToolbarImpl = this.f62747k;
        Context context = this.f62746j;
        switch (i13) {
            case 0:
                Drawable f03 = bs1.c.f0(gestaltToolbarImpl, q.ARROW_BACK.drawableRes(context), Integer.valueOf(eo1.b.color_themed_icon_default), null, 4);
                n.b0(f03);
                IconView F = gestaltToolbarImpl.F(f03);
                F.setId(le0.d.bar_home);
                F.setOnClickListener(new a2(gestaltToolbarImpl, 26));
                F.setContentDescription(F.getResources().getString(le0.h.content_description_back_arrow));
                return F;
            case 1:
                return b();
            case 2:
                return b();
            default:
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setClipToPadding(false);
                linearLayout.setId(le0.d.bar_titles);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(15, -1);
                layoutParams.addRule(17, le0.d.bar_home);
                layoutParams.addRule(16, le0.d.bar_icons);
                linearLayout.setLayoutParams(layoutParams);
                gestaltToolbarImpl.addView(linearLayout);
                return linearLayout;
        }
    }
}
