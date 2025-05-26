package com.pinterest.feature.unauth.sba;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/unauth/sba/TitleHeader;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "identity_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class TitleHeader extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public final CardView f48752a;

    /* renamed from: b, reason: collision with root package name */
    public final WebImageView f48753b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitleHeader(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), vq1.c.title_header, this);
        View findViewById = findViewById(vq1.b.card);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48752a = (CardView) findViewById;
        View findViewById2 = findViewById(vq1.b.thumbnails);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48753b = (WebImageView) findViewById2;
    }

    public final void L(String imageUrl) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TR_BL, new int[]{-1, -7703, -3610648});
        gradientDrawable.setGradientType(0);
        this.f48752a.setBackground(gradientDrawable);
        this.f48753b.loadUrl(imageUrl);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitleHeader(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        View.inflate(getContext(), vq1.c.title_header, this);
        View findViewById = findViewById(vq1.b.card);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48752a = (CardView) findViewById;
        View findViewById2 = findViewById(vq1.b.thumbnails);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48753b = (WebImageView) findViewById2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitleHeader(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        View.inflate(getContext(), vq1.c.title_header, this);
        View findViewById = findViewById(vq1.b.card);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48752a = (CardView) findViewById;
        View findViewById2 = findViewById(vq1.b.thumbnails);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48753b = (WebImageView) findViewById2;
    }
}
