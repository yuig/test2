package com.pinterest.activity.newshub.view.content;

import a.l2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.newshub.view.NewsHubViewGroup;
import com.pinterest.feature.newshub.view.content.NewsHubLibrofileImageView;
import com.pinterest.gestalt.text.GestaltText;
import dl2.b;
import fq.a;
import kh2.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yk1.n;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/activity/newshub/view/content/NewsHubLibrofileView;", "Lcom/pinterest/feature/newshub/view/NewsHubViewGroup;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "newsHub_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class NewsHubLibrofileView extends NewsHubViewGroup implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f34956f = 0;

    /* renamed from: b, reason: collision with root package name */
    public final NewsHubLibrofileImageView f34957b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f34958c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f34959d;

    /* renamed from: e, reason: collision with root package name */
    public wy0 f34960e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewsHubLibrofileView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int i17 = (i15 - i13) - paddingStart;
        GestaltText gestaltText = this.f34958c;
        int measuredWidth = ((i17 - gestaltText.getMeasuredWidth()) / 2) + paddingStart;
        GestaltText gestaltText2 = this.f34959d;
        int measuredWidth2 = ((i17 - gestaltText2.getMeasuredWidth()) / 2) + paddingStart;
        NewsHubLibrofileImageView newsHubLibrofileImageView = this.f34957b;
        NewsHubViewGroup.g(newsHubLibrofileImageView, paddingStart, paddingTop);
        int a13 = NewsHubViewGroup.a(newsHubLibrofileImageView) + paddingTop;
        NewsHubViewGroup.g(gestaltText, measuredWidth, a13);
        NewsHubViewGroup.g(gestaltText2, measuredWidth2, NewsHubViewGroup.a(gestaltText) + a13);
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        int size = View.MeasureSpec.getSize(i13);
        int size2 = View.MeasureSpec.getSize(i14);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, 0);
        j(this.f34958c, makeMeasureSpec, 0, makeMeasureSpec2, 0);
        int a13 = NewsHubViewGroup.a(this.f34958c);
        j(this.f34959d, makeMeasureSpec, 0, makeMeasureSpec2, a13);
        measureChildWithMargins(this.f34957b, i13, 0, i14, NewsHubViewGroup.a(this.f34959d) + a13);
        setMeasuredDimension(size, size2);
    }

    public /* synthetic */ NewsHubLibrofileView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsHubLibrofileView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        NewsHubLibrofileImageView newsHubLibrofileImageView = new NewsHubLibrofileImageView(context, attributeSet, i13);
        this.f34957b = newsHubLibrofileImageView;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.bottomMargin = d.p(4);
        addView(newsHubLibrofileImageView, marginLayoutParams);
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(a.f62790j);
        b.y2(gestaltText);
        this.f34958c = gestaltText;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams2.bottomMargin = d.p(4);
        addView(gestaltText, marginLayoutParams2);
        GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
        gestaltText2.i(a.f62791k);
        b.y2(gestaltText2);
        this.f34959d = gestaltText2;
        addView(gestaltText2, new ViewGroup.MarginLayoutParams(-2, -2));
        setOnClickListener(new l2(this, 18));
    }
}
