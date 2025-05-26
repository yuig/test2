package com.pinterest.feature.boardpreview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import ao2.k2;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import defpackage.a;
import j1.v0;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import q4.h;
import rg0.m0;
import z52.b;
import z52.c;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/boardpreview/view/ShareBoardUpsellView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "shareBoardVideoLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ShareBoardUpsellView extends CardView {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f45345m = 0;

    /* renamed from: h, reason: collision with root package name */
    public final ShareBoardThumbnailsView f45346h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f45347i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltText f45348j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltButton f45349k;

    /* renamed from: l, reason: collision with root package name */
    public final GestaltButton f45350l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShareBoardUpsellView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void D(h listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f45350l.e(new a(13, listener));
    }

    public final void L(v0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f45349k.e(new a(12, listener));
    }

    public final void x(m0 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        String str = data.f15163a;
        if (str == null) {
            str = "";
        }
        a0.p(this.f45347i, str);
        a0.p(this.f45348j, String.valueOf(data.f15164b));
        this.f45349k.d(new jn0.h(data, 0));
        this.f45350l.d(new jn0.h(data, 1));
        ShareBoardThumbnailsView shareBoardThumbnailsView = this.f45346h;
        shareBoardThumbnailsView.getClass();
        List<String> images = data.f108057e;
        Intrinsics.checkNotNullParameter(images, "images");
        k2 k2Var = shareBoardThumbnailsView.f45344f;
        if (k2Var != null) {
            k2Var.cancel((CancellationException) null);
        }
        shareBoardThumbnailsView.f45344f = null;
        shareBoardThumbnailsView.removeAllViews();
        for (String str2 : images) {
            WebImageView webImageView = new WebImageView(shareBoardThumbnailsView.getContext());
            webImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            webImageView.loadUrl(str2);
            shareBoardThumbnailsView.addView(webImageView);
        }
        if (shareBoardThumbnailsView.isAttachedToWindow()) {
            shareBoardThumbnailsView.i();
        }
    }

    public /* synthetic */ ShareBoardUpsellView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareBoardUpsellView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, c.share_board_upsell_view, this);
        View findViewById = findViewById(b.share_board_upsell_title_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45347i = (GestaltText) findViewById;
        View findViewById2 = findViewById(b.share_board_upsell_description_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45348j = (GestaltText) findViewById2;
        View findViewById3 = findViewById(b.share_board_upsell_dismiss_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45349k = (GestaltButton) findViewById3;
        View findViewById4 = findViewById(b.share_board_upsell_complete_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45350l = (GestaltButton) findViewById4;
        View findViewById5 = findViewById(b.share_board_upsell_thumbnails_view);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f45346h = (ShareBoardThumbnailsView) findViewById5;
        t(bs1.c.W(this, eo1.c.rounding_600));
        l(bs1.c.W(this, eo1.c.space_100));
    }
}
