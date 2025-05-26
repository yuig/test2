package sw0;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.pinterest.activity.pin.view.modules.PinCloseupFavoriteModule;
import com.pinterest.feature.following.carousel.view.ImpressionableUserRep;
import com.pinterest.feature.pin.edit.view.AttributeActionView;
import com.pinterest.feature.pin.edit.view.AttributeBasicsListView;
import com.pinterest.feature.pin.edit.view.AttributeCompoundView;
import com.pinterest.feature.pin.edit.view.AttributeDividerView;
import com.pinterest.feature.pin.edit.view.AttributeInputTextViewLegacy;
import com.pinterest.feature.search.results.view.SearchMoreIdeasView;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rq.j2;
import rq.s2;
import rq.t3;
import rq.w1;
import rq.z4;

/* loaded from: classes5.dex */
public final class q0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f115550i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f115551j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(Context context, int i13) {
        super(0);
        this.f115550i = i13;
        this.f115551j = context;
    }

    public final ImpressionableUserRep b() {
        int i13 = this.f115550i;
        Context context = this.f115551j;
        switch (i13) {
            case 21:
                ImpressionableUserRep impressionableUserRep = new ImpressionableUserRep(context);
                impressionableUserRep.y1(ze0.a.Default);
                impressionableUserRep.setPaddingRelative(0, 0, 0, impressionableUserRep.getResources().getDimensionPixelSize(eo1.c.space_400));
                return impressionableUserRep;
            case 22:
                ImpressionableUserRep impressionableUserRep2 = new ImpressionableUserRep(context);
                impressionableUserRep2.y1(ze0.a.List);
                return impressionableUserRep2;
            case 27:
                ImpressionableUserRep impressionableUserRep3 = new ImpressionableUserRep(context);
                impressionableUserRep3.y1(ze0.a.Default);
                impressionableUserRep3.setPaddingRelative(0, 0, 0, impressionableUserRep3.getResources().getDimensionPixelSize(eo1.c.space_400));
                return impressionableUserRep3;
            default:
                ImpressionableUserRep impressionableUserRep4 = new ImpressionableUserRep(context);
                impressionableUserRep4.y1(ze0.a.List);
                return impressionableUserRep4;
        }
    }

    public final View e() {
        int i13 = this.f115550i;
        Context context = this.f115551j;
        switch (i13) {
            case 23:
                ImpressionableUserRep impressionableUserRep = new ImpressionableUserRep(context);
                impressionableUserRep.y1(ze0.a.ContentList);
                impressionableUserRep.setPaddingRelative(0, 0, 0, impressionableUserRep.getResources().getDimensionPixelSize(eo1.c.space_800));
                return impressionableUserRep;
            default:
                ImpressionableUserRep impressionableUserRep2 = new ImpressionableUserRep(context);
                impressionableUserRep2.y1(ze0.a.ContentList);
                impressionableUserRep2.setPaddingRelative(0, 0, 0, impressionableUserRep2.getResources().getDimensionPixelSize(eo1.c.space_800));
                return impressionableUserRep2;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AttributeSet attributeSet = null;
        int i13 = 6;
        int i14 = this.f115550i;
        Context context = this.f115551j;
        switch (i14) {
            case 0:
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                linearLayout.setBackgroundColor(dl2.b.y0(linearLayout, eo1.a.color_background_dark_opacity_300));
                linearLayout.setVisibility(8);
                return linearLayout;
            case 1:
                GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
                gestaltText.i(b.f115415u);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                int dimensionPixelSize = gestaltText.getResources().getDimensionPixelSize(m60.r0.margin_half);
                layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                gestaltText.setLayoutParams(layoutParams);
                int dimensionPixelSize2 = gestaltText.getResources().getDimensionPixelSize(m60.r0.margin_quarter);
                gestaltText.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
                return gestaltText;
            case 2:
                return new j2(context);
            case 3:
                return new t3(context);
            case 4:
                return new PinCloseupFavoriteModule(i13, context, attributeSet);
            case 5:
                return new w1(context);
            case 6:
                Intrinsics.checkNotNullParameter(context, "context");
                return new s2(context);
            case 7:
                return new q01.w(context);
            case 8:
                return new q01.i(context);
            case 9:
                return new rq.f0(context);
            case 10:
                return new z4(context);
            case 11:
                return new bf1.a(context);
            case 12:
                return new md1.b(context);
            case 13:
                GestaltSpinner gestaltSpinner = new GestaltSpinner(6, context, (AttributeSet) null);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 17;
                gestaltSpinner.setLayoutParams(layoutParams2);
                return gestaltSpinner;
            case 14:
                int i15 = m60.q0.video_thumnail_preview_overlay;
                Object obj = d5.a.f53679a;
                return new ColorDrawable(context.getColor(i15));
            case 15:
                return new AttributeCompoundView(context);
            case 16:
                return new AttributeInputTextViewLegacy(context);
            case 17:
                return new AttributeActionView(context);
            case 18:
                return new AttributeDividerView(context);
            case 19:
                return new AttributeBasicsListView(context);
            case 20:
                switch (i14) {
                    case 20:
                        return new com.pinterest.feature.search.results.view.i(context);
                    default:
                        return new com.pinterest.feature.search.results.view.i(context);
                }
            case 21:
                return b();
            case 22:
                return b();
            case 23:
                return e();
            case 24:
                switch (i14) {
                    case 20:
                        return new com.pinterest.feature.search.results.view.i(context);
                    default:
                        return new com.pinterest.feature.search.results.view.i(context);
                }
            case 25:
                return new SearchMoreIdeasView(context);
            case 26:
                return new je1.a(context);
            case 27:
                return b();
            case 28:
                return b();
            default:
                return e();
        }
    }
}
