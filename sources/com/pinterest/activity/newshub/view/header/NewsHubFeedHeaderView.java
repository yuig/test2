package com.pinterest.activity.newshub.view.header;

import af2.c;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.feature.newshub.view.NewsHubViewGroup;
import com.pinterest.feature.newshub.view.content.NewsHubHeaderIconContainerView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import gq.a;
import gq.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rl1.j0;
import ye2.o;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/activity/newshub/view/header/NewsHubFeedHeaderView;", "Lcom/pinterest/feature/newshub/view/NewsHubViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "newsHub_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class NewsHubFeedHeaderView extends NewsHubViewGroup implements c {

    /* renamed from: b, reason: collision with root package name */
    public o f34961b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f34962c;

    /* renamed from: d, reason: collision with root package name */
    public final NewsHubHeaderIconContainerView f34963d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f34964e;

    /* renamed from: f, reason: collision with root package name */
    public final View f34965f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltIconButton f34966g;

    /* renamed from: h, reason: collision with root package name */
    public final Configuration f34967h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsHubFeedHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f34962c) {
            this.f34962c = true;
            ((b) generatedComponent()).getClass();
        }
        Configuration configuration = getContext().getResources().getConfiguration();
        this.f34967h = configuration;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        NewsHubHeaderIconContainerView newsHubHeaderIconContainerView = new NewsHubHeaderIconContainerView(6, context2, (AttributeSet) null);
        newsHubHeaderIconContainerView.setId(zu1.c.news_hub_header_icon_container);
        newsHubHeaderIconContainerView.setImportantForAccessibility(4);
        this.f34963d = newsHubHeaderIconContainerView;
        int W = bs1.c.W(this, j0.lego_avatar_size_default);
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.margin_half);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(W, W);
        if (configuration.getLayoutDirection() == 1) {
            marginLayoutParams.setMarginEnd(dimensionPixelSize);
        } else {
            marginLayoutParams.setMarginStart(dimensionPixelSize);
        }
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        GestaltText i13 = new GestaltText(6, context3, (AttributeSet) null).i(a.f65959j);
        this.f34964e = i13;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(eo1.c.margin_half);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
        if (configuration.getLayoutDirection() == 1) {
            marginLayoutParams2.setMarginEnd(dimensionPixelSize2);
        } else {
            marginLayoutParams2.setMarginStart(dimensionPixelSize2);
        }
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        GestaltIconButton gestaltIconButton = new GestaltIconButton(6, context4, (AttributeSet) null);
        gestaltIconButton.t(a.f65960k);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(bs1.c.W(gestaltIconButton, eo1.c.space_100));
        layoutParams.setMarginStart(bs1.c.W(gestaltIconButton, eo1.c.space_300));
        gestaltIconButton.setLayoutParams(layoutParams);
        this.f34966g = gestaltIconButton;
        View view = new View(getContext());
        view.setId(zu1.c.news_hub_unread_dot);
        view.setBackgroundResource(zu1.b.news_hub_unread_dot);
        this.f34965f = view;
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(eo1.c.margin_half);
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(eo1.c.margin_half);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(dimensionPixelSize3, dimensionPixelSize3);
        marginLayoutParams3.setMarginStart(dimensionPixelSize4);
        marginLayoutParams3.setMarginEnd(dimensionPixelSize4);
        addView(newsHubHeaderIconContainerView, marginLayoutParams);
        addView(i13, marginLayoutParams2);
        addView(view, marginLayoutParams3);
        addView(gestaltIconButton);
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f34961b == null) {
            this.f34961b = new o(this);
        }
        return this.f34961b;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f34961b == null) {
            this.f34961b = new o(this);
        }
        return this.f34961b.generatedComponent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int layoutDirection = this.f34967h.getLayoutDirection();
        int paddingTop = getPaddingTop();
        NewsHubHeaderIconContainerView newsHubHeaderIconContainerView = this.f34963d;
        int e13 = NewsHubViewGroup.e(newsHubHeaderIconContainerView);
        int i17 = layoutDirection == 1 ? i15 - e13 : i13;
        NewsHubViewGroup.g(newsHubHeaderIconContainerView, i17, paddingTop);
        GestaltText gestaltText = this.f34964e;
        NewsHubViewGroup.g(gestaltText, layoutDirection == 1 ? i17 - NewsHubViewGroup.e(gestaltText) : i17 + e13, paddingTop);
        GestaltIconButton gestaltIconButton = this.f34966g;
        int e14 = NewsHubViewGroup.e(gestaltIconButton);
        if (layoutDirection != 1) {
            i13 = i15 - e14;
        }
        int i18 = i16 - i14;
        NewsHubViewGroup.g(gestaltIconButton, i13, a.a.b(i18, NewsHubViewGroup.a(gestaltIconButton), 2, paddingTop));
        View view = this.f34965f;
        NewsHubViewGroup.g(view, layoutDirection == 1 ? i13 + e14 : i13 - NewsHubViewGroup.b(view), ((i18 - NewsHubViewGroup.a(view)) / 2) + paddingTop);
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        j(this.f34963d, i13, 0, i14, 0);
        NewsHubHeaderIconContainerView newsHubHeaderIconContainerView = this.f34963d;
        int e13 = NewsHubViewGroup.e(newsHubHeaderIconContainerView);
        View view = this.f34965f;
        measureChildWithMargins(view, i13, e13, i14, 0);
        int b13 = e13 + NewsHubViewGroup.b(view);
        measureChildWithMargins(this.f34966g, i13, b13, i14, 0);
        j(this.f34964e, i13, NewsHubViewGroup.b(this.f34966g) + b13, i14, 0);
        setMeasuredDimension(View.MeasureSpec.getSize(i13), Math.max(NewsHubViewGroup.a(this.f34964e), NewsHubViewGroup.a(newsHubHeaderIconContainerView)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsHubFeedHeaderView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f34962c) {
            this.f34962c = true;
            ((b) generatedComponent()).getClass();
        }
        Configuration configuration = getContext().getResources().getConfiguration();
        this.f34967h = configuration;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        NewsHubHeaderIconContainerView newsHubHeaderIconContainerView = new NewsHubHeaderIconContainerView(6, context2, (AttributeSet) null);
        newsHubHeaderIconContainerView.setId(zu1.c.news_hub_header_icon_container);
        newsHubHeaderIconContainerView.setImportantForAccessibility(4);
        this.f34963d = newsHubHeaderIconContainerView;
        int W = bs1.c.W(this, j0.lego_avatar_size_default);
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.margin_half);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(W, W);
        if (configuration.getLayoutDirection() == 1) {
            marginLayoutParams.setMarginEnd(dimensionPixelSize);
        } else {
            marginLayoutParams.setMarginStart(dimensionPixelSize);
        }
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        GestaltText i14 = new GestaltText(6, context3, (AttributeSet) null).i(a.f65959j);
        this.f34964e = i14;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(eo1.c.margin_half);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
        if (configuration.getLayoutDirection() == 1) {
            marginLayoutParams2.setMarginEnd(dimensionPixelSize2);
        } else {
            marginLayoutParams2.setMarginStart(dimensionPixelSize2);
        }
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        GestaltIconButton gestaltIconButton = new GestaltIconButton(6, context4, (AttributeSet) null);
        gestaltIconButton.t(a.f65960k);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(bs1.c.W(gestaltIconButton, eo1.c.space_100));
        layoutParams.setMarginStart(bs1.c.W(gestaltIconButton, eo1.c.space_300));
        gestaltIconButton.setLayoutParams(layoutParams);
        this.f34966g = gestaltIconButton;
        View view = new View(getContext());
        view.setId(zu1.c.news_hub_unread_dot);
        view.setBackgroundResource(zu1.b.news_hub_unread_dot);
        this.f34965f = view;
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(eo1.c.margin_half);
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(eo1.c.margin_half);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(dimensionPixelSize3, dimensionPixelSize3);
        marginLayoutParams3.setMarginStart(dimensionPixelSize4);
        marginLayoutParams3.setMarginEnd(dimensionPixelSize4);
        addView(newsHubHeaderIconContainerView, marginLayoutParams);
        addView(i14, marginLayoutParams2);
        addView(view, marginLayoutParams3);
        addView(gestaltIconButton);
    }
}
