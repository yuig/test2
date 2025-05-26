package com.pinterest.activity.newshub.view.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import av1.c;
import com.pinterest.feature.newshub.view.NewsHubViewGroup;
import com.pinterest.gestalt.text.GestaltText;
import m60.r0;
import pk.a0;

/* loaded from: classes3.dex */
public class NewsHubHeaderView extends NewsHubViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public GestaltText f34968b;

    /* renamed from: c, reason: collision with root package name */
    public NewsHubMultiUserAvatar f34969c;

    /* renamed from: d, reason: collision with root package name */
    public GestaltText f34970d;

    public NewsHubHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f34968b = (GestaltText) findViewById(c.news_hub_time_header);
        this.f34969c = (NewsHubMultiUserAvatar) findViewById(c.news_hub_header_multi_user);
        this.f34970d = (GestaltText) findViewById(c.news_hub_header_text);
        int K = a0.K(40, getResources());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(K, K);
        marginLayoutParams.setMarginStart(getResources().getDimensionPixelSize(r0.margin_quarter));
        this.f34969c.setLayoutParams(marginLayoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        NewsHubViewGroup.g(this.f34968b, paddingStart, 0);
        int a13 = NewsHubViewGroup.a(this.f34968b) + paddingTop;
        NewsHubViewGroup.g(this.f34970d, paddingStart, a13);
        NewsHubMultiUserAvatar newsHubMultiUserAvatar = this.f34969c;
        NewsHubViewGroup.g(newsHubMultiUserAvatar, i15 - NewsHubViewGroup.e(newsHubMultiUserAvatar), a13);
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        int size = View.MeasureSpec.getSize(i13);
        j(this.f34968b, i13, 0, i14, 0);
        j(this.f34969c, i13, 0, i14, NewsHubViewGroup.a(this.f34968b));
        int a13 = NewsHubViewGroup.a(this.f34969c);
        j(this.f34970d, i13, NewsHubViewGroup.e(this.f34969c), i14, 0);
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + Math.max(NewsHubViewGroup.a(this.f34970d), a13));
    }

    public NewsHubHeaderView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
    }
}
