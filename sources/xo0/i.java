package xo0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.feature.bubbles.view.BubbleContentSeparatorCellView;
import com.pinterest.feature.ideaPinCreation.drafts.view.IdeaPinDraftPreview;
import com.pinterest.feature.ideaPinCreation.metadata.view.MetadataLegalDisclaimerView;
import com.pinterest.feature.ideaPinCreation.metadata.view.settings.SettingsPartnerBrandItemView;
import com.pinterest.feature.mediagallery.view.MediaButtonView;
import com.pinterest.feature.mediagallery.view.MediaDirectoryView;
import com.pinterest.feature.mediagallery.view.MediaThumbnailView;
import com.pinterest.feature.pin.edit.view.AttributeActionView;
import com.pinterest.feature.pin.edit.view.AttributeBasicsListView;
import com.pinterest.feature.pin.edit.view.AttributeCoverImagePreviewView;
import com.pinterest.feature.pin.edit.view.AttributeDividerView;
import com.pinterest.feature.pin.edit.view.AttributeInputTextView;
import com.pinterest.feature.pin.edit.view.AttributeInputTextViewLegacy;
import com.pinterest.feature.pin.edit.view.AttributeSectionHeaderView;
import com.pinterest.gestalt.text.previewText.GestaltPreviewTextView;
import com.pinterest.ui.components.users.LegoUserRep;
import df.j1;
import kh2.m0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135592i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f135593j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Context context, int i13) {
        super(0);
        this.f135592i = i13;
        this.f135593j = context;
    }

    public final MediaThumbnailView b() {
        int i13 = 6;
        AttributeSet attributeSet = null;
        Context it = this.f135593j;
        switch (this.f135592i) {
            case 26:
                Intrinsics.checkNotNullExpressionValue(it, "$it");
                break;
            default:
                Intrinsics.checkNotNullExpressionValue(it, "$it");
                break;
        }
        return new MediaThumbnailView(i13, it, attributeSet);
    }

    public final AttributeActionView e() {
        int i13 = this.f135592i;
        Context context = this.f135593j;
        switch (i13) {
            case 12:
                break;
            case 16:
                break;
        }
        return new AttributeActionView(context);
    }

    public final LegoUserRep f() {
        int i13 = this.f135592i;
        Context context = this.f135593j;
        switch (i13) {
            case 2:
                LegoUserRep legoUserRep = new LegoUserRep(context);
                legoUserRep.y1(ze0.a.Default);
                return legoUserRep;
            default:
                LegoUserRep legoUserRep2 = new LegoUserRep(context);
                legoUserRep2.y1(ze0.a.List);
                legoUserRep2.H0(rl1.n.f(context));
                vn1.g gVar = vn1.h.f126278d;
                legoUserRep2.M1(gVar);
                vn1.e style = vn1.h.f126279e;
                Intrinsics.checkNotNullParameter(style, "style");
                legoUserRep2.f52346f.i(new sq.b(style, 4));
                legoUserRep2.T0(gVar);
                vn1.e style2 = vn1.e.BOLD;
                Intrinsics.checkNotNullParameter(style2, "style");
                legoUserRep2.f52347g.i(new sq.b(style2, 3));
                legoUserRep2.setPaddingRelative(legoUserRep2.getPaddingStart(), legoUserRep2.getPaddingTop(), legoUserRep2.getPaddingEnd(), legoUserRep2.getResources().getDimensionPixelSize(r0.margin_half));
                return legoUserRep2;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AttributeSet attributeSet = null;
        int i13 = 6;
        int i14 = this.f135592i;
        Context context = this.f135593j;
        switch (i14) {
            case 0:
                return new n(context);
            case 1:
                Intrinsics.checkNotNullParameter(context, "context");
                BubbleContentSeparatorCellView bubbleContentSeparatorCellView = new BubbleContentSeparatorCellView(context);
                bubbleContentSeparatorCellView.b();
                bubbleContentSeparatorCellView.a();
                return bubbleContentSeparatorCellView;
            case 2:
                return f();
            case 3:
                return new je1.a(context);
            case 4:
                return new xi0.i(context);
            case 5:
                return f();
            case 6:
                GestaltPreviewTextView gestaltPreviewTextView = new GestaltPreviewTextView(i13, context, attributeSet);
                m0.g(gestaltPreviewTextView, c.f135576k);
                int dimensionPixelSize = gestaltPreviewTextView.getResources().getDimensionPixelSize(eo1.c.space_600);
                gestaltPreviewTextView.setPaddingRelative(dimensionPixelSize, gestaltPreviewTextView.getResources().getDimensionPixelSize(eo1.c.space_200), dimensionPixelSize, gestaltPreviewTextView.getResources().getDimensionPixelSize(eo1.c.space_400));
                return gestaltPreviewTextView;
            case 7:
                return new IdeaPinDraftPreview(context);
            case 8:
                switch (i14) {
                    case 8:
                        return Integer.valueOf((int) c0.d.v(32.0f, context));
                    default:
                        return Integer.valueOf((int) c0.d.v(4.0f, context));
                }
            case 9:
                switch (i14) {
                    case 8:
                        return Integer.valueOf((int) c0.d.v(32.0f, context));
                    default:
                        return Integer.valueOf((int) c0.d.v(4.0f, context));
                }
            case 10:
                return new AttributeCoverImagePreviewView(context);
            case 11:
                return new AttributeInputTextViewLegacy(context);
            case 12:
                return e();
            case 13:
                return new AttributeDividerView(context);
            case 14:
                return new AttributeBasicsListView(context);
            case 15:
                return new MetadataLegalDisclaimerView(context);
            case 16:
                return e();
            case 17:
                return e();
            case 18:
                return new AttributeSectionHeaderView(context);
            case 19:
                return new SettingsPartnerBrandItemView(context);
            case 20:
                return new AttributeInputTextView(context);
            case 21:
                return new wa2.t(context, 0);
            case 22:
                return new zv0.d(context);
            case 23:
                Intrinsics.checkNotNullParameter(context, "context");
                zv0.b bVar = new zv0.b(context);
                bVar.setLayoutParams(new FrameLayout.LayoutParams(bs1.c.W(bVar, aq1.b.idea_pin_video_clip_cell_size), bs1.c.W(bVar, aq1.b.idea_pin_video_clip_cell_size)));
                ImageView imageView = new ImageView(context);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                imageView.setLayoutParams(layoutParams);
                imageView.setContentDescription(bs1.c.f2(imageView, aq1.h.accessibility_idea_pin_add_clips));
                int i15 = aq1.c.ic_add_circle_gray_nonpds;
                Object obj = d5.a.f53679a;
                imageView.setImageDrawable(context.getDrawable(i15));
                bVar.addView(imageView);
                return bVar;
            case 24:
                ImageView imageView2 = new ImageView(context);
                imageView2.setColorFilter(j1.K(context));
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(imageView2.getResources().getDimensionPixelSize(ct1.a.grid_create_gallery_icon_size), imageView2.getResources().getDimensionPixelSize(ct1.a.grid_create_gallery_icon_size));
                layoutParams2.gravity = 17;
                imageView2.setLayoutParams(layoutParams2);
                return imageView2;
            case 25:
                Intrinsics.checkNotNullExpressionValue(context, "$it");
                return new MediaDirectoryView(i13, context, attributeSet);
            case 26:
                return b();
            case 27:
                return b();
            case 28:
                Intrinsics.checkNotNullExpressionValue(context, "$it");
                return new MediaButtonView(i13, context, attributeSet);
            default:
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                linearLayout.setBackgroundColor(dl2.b.y0(linearLayout, eo1.a.sema_color_background_wash_dark));
                linearLayout.setVisibility(8);
                return linearLayout;
        }
    }
}
