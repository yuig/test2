package com.pinterest.feature.newshub.view.content;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import av1.a;
import av1.b;
import bs1.c;
import com.pinterest.feature.newshub.view.NewsHubViewGroup;
import com.pinterest.ui.imageview.GrayWebImageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yn2.c0;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/newshub/view/content/NewsHubBoardImageView;", "Lcom/pinterest/feature/newshub/view/NewsHubViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "newsHub_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class NewsHubBoardImageView extends NewsHubViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public final int f46818b;

    /* renamed from: c, reason: collision with root package name */
    public final float f46819c;

    /* renamed from: d, reason: collision with root package name */
    public final int f46820d;

    /* renamed from: e, reason: collision with root package name */
    public final GrayWebImageView f46821e;

    /* renamed from: f, reason: collision with root package name */
    public final List f46822f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewsHubBoardImageView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int paddingTop = getPaddingTop();
        int paddingStart = getPaddingStart();
        NewsHubViewGroup.g(this.f46821e, paddingTop, paddingStart);
        int i17 = 0;
        int measuredWidth = getChildAt(0).getMeasuredWidth();
        int i18 = this.f46820d;
        int i19 = measuredWidth + i18 + paddingStart;
        List list = this.f46822f;
        for (Object obj : list) {
            int i23 = i17 + 1;
            if (i17 < 0) {
                f0.p();
                throw null;
            }
            GrayWebImageView grayWebImageView = (GrayWebImageView) obj;
            int i24 = this.f46818b;
            int i25 = i17 % i24;
            int measuredHeight = i25 > 0 ? ((GrayWebImageView) list.get(i17 - 1)).getMeasuredHeight() + paddingTop + i18 : paddingTop;
            int measuredWidth2 = grayWebImageView.getMeasuredWidth() + i19;
            NewsHubViewGroup.g(grayWebImageView, i19, measuredHeight);
            if (i25 + 1 == i24) {
                i19 = measuredWidth2 + i18;
            }
            i17 = i23;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        int size = View.MeasureSpec.getSize(i13);
        int size2 = View.MeasureSpec.getSize(i14);
        int paddingEnd = size - (getPaddingEnd() + (getPaddingStart() + (this.f46820d * 2)));
        NewsHubViewGroup.i(this.f46821e, size2, size2);
        int i15 = (paddingEnd - size2) / 2;
        int paddingBottom = (int) ((size2 - (getPaddingBottom() + (getPaddingTop() + r0))) * 0.5f);
        List list = this.f46822f;
        int i16 = 0;
        for (Object obj : list) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                f0.p();
                throw null;
            }
            NewsHubViewGroup.i((View) list.get(i16), i15, paddingBottom);
            i16 = i17;
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsHubBoardImageView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46818b = 2;
        c.f0(this, b.news_hub_rounded_square, null, null, 6);
        Bitmap.Config config = Bitmap.Config.RGB_565;
        GrayWebImageView grayWebImageView = new GrayWebImageView(context, null);
        this.f46821e = grayWebImageView;
        Resources resources = context.getResources();
        this.f46819c = resources.getDimension(a.news_hub_corner_radius_lego);
        this.f46820d = resources.getDimensionPixelSize(a.news_hub_image_divider_margin_lego);
        grayWebImageView.g2(grayWebImageView.f2(), 0.0f, grayWebImageView.f2(), 0.0f);
        grayWebImageView.f52564p = new vx0.a(grayWebImageView, this, 0);
        addView(grayWebImageView);
        for (int i14 = 1; i14 < 5; i14++) {
            GrayWebImageView grayWebImageView2 = new GrayWebImageView(context, null);
            if (i14 == 3) {
                grayWebImageView2.g2(0.0f, this.f46819c, 0.0f, 0.0f);
            } else if (i14 != 4) {
                grayWebImageView2.g2(0.0f, 0.0f, 0.0f, 0.0f);
            } else {
                grayWebImageView2.g2(0.0f, 0.0f, 0.0f, this.f46819c);
            }
            addView(grayWebImageView2);
            grayWebImageView2.f52564p = new vx0.a(grayWebImageView2, this, 1);
        }
        this.f46822f = c0.t(c0.p(c0.i(d7.b.O(this), 1), vx0.b.f126818j));
    }
}
