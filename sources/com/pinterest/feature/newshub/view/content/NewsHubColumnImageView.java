package com.pinterest.feature.newshub.view.content;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import av1.a;
import av1.f;
import bs1.c;
import com.pinterest.feature.newshub.view.NewsHubViewGroup;
import com.pinterest.ui.imageview.GrayWebImageView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import oq.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/feature/newshub/view/content/NewsHubColumnImageView;", "Lcom/pinterest/feature/newshub/view/NewsHubViewGroup;", "newsHub_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class NewsHubColumnImageView extends NewsHubViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public final float f46823b;

    /* renamed from: c, reason: collision with root package name */
    public final int f46824c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f46825d;

    /* renamed from: e, reason: collision with root package name */
    public final int f46826e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewsHubColumnImageView(@NotNull Context context, AttributeSet attributeSet) {
        this(0, 12, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void k() {
        int i13 = 0;
        while (true) {
            int i14 = this.f46826e;
            if (i13 >= i14) {
                return;
            }
            ArrayList arrayList = this.f46825d;
            float f13 = this.f46823b;
            if (i13 == 0) {
                ((GrayWebImageView) arrayList.get(i13)).g2(f13, 0.0f, f13, 0.0f);
            } else if (i13 == i14 - 1) {
                ((GrayWebImageView) arrayList.get(i13)).g2(0.0f, f13, 0.0f, f13);
            } else {
                ((GrayWebImageView) arrayList.get(i13)).g2(0.0f, 0.0f, 0.0f, 0.0f);
            }
            c.R1((View) arrayList.get(i13), true);
            i13++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int paddingTop = getPaddingTop();
        int paddingStart = getPaddingStart();
        Iterator it = this.f46825d.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                f0.p();
                throw null;
            }
            GrayWebImageView grayWebImageView = (GrayWebImageView) next;
            if (i17 != 0) {
                paddingStart += this.f46824c;
            }
            grayWebImageView.layout(paddingStart, paddingTop, grayWebImageView.getMeasuredWidth() + paddingStart, grayWebImageView.getMeasuredHeight() + paddingTop);
            paddingStart += grayWebImageView.getMeasuredWidth();
            i17 = i18;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        int size = View.MeasureSpec.getSize(i13);
        int size2 = View.MeasureSpec.getSize(i14);
        ArrayList arrayList = this.f46825d;
        int size3 = (size - ((arrayList.size() - 1) * this.f46824c)) / arrayList.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            NewsHubViewGroup.i((GrayWebImageView) it.next(), size3, size2);
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewsHubColumnImageView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        this(i13, 8, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ NewsHubColumnImageView(int i13, int i14, Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (i14 & 4) != 0 ? 0 : i13, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsHubColumnImageView(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46823b = getResources().getDimension(a.news_hub_corner_radius_lego);
        this.f46824c = getResources().getDimensionPixelSize(a.news_hub_image_divider_margin_lego);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.NewsHubColumnImageView, i13, i14);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            int i15 = obtainStyledAttributes.getInt(f.NewsHubColumnImageView_columns, 3);
            this.f46826e = i15;
            obtainStyledAttributes.recycle();
            ArrayList<GrayWebImageView> arrayList = new ArrayList(i15);
            for (int i16 = 0; i16 < i15; i16++) {
                arrayList.add(new GrayWebImageView(context, null));
            }
            this.f46825d = arrayList;
            k();
            for (GrayWebImageView grayWebImageView : arrayList) {
                addView(grayWebImageView);
                grayWebImageView.f52564p = new h(3, grayWebImageView, this);
            }
        } catch (Throwable th3) {
            obtainStyledAttributes.recycle();
            throw th3;
        }
    }
}
