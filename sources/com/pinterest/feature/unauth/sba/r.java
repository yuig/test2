package com.pinterest.feature.unauth.sba;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout;
import com.pinterest.ui.grid.PinterestRecyclerView;

/* loaded from: classes5.dex */
public final class r implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AuthenticateHeader f48861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PinterestRecyclerView f48862b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PinterestSwipeRefreshLayout f48863c;

    public r(AuthenticateHeader authenticateHeader, PinterestRecyclerView pinterestRecyclerView, PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout) {
        this.f48861a = authenticateHeader;
        this.f48862b = pinterestRecyclerView;
        this.f48863c = pinterestSwipeRefreshLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        AuthenticateHeader authenticateHeader = this.f48861a;
        authenticateHeader.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int height = authenticateHeader.getHeight();
        PinterestRecyclerView pinterestRecyclerView = this.f48862b;
        ViewGroup.LayoutParams layoutParams = pinterestRecyclerView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = height;
            pinterestRecyclerView.setLayoutParams(layoutParams);
        } else if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
            marginLayoutParams.topMargin = height;
            pinterestRecyclerView.setLayoutParams(marginLayoutParams);
        }
        PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout = this.f48863c;
        ViewGroup.LayoutParams layoutParams2 = pinterestSwipeRefreshLayout.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = height;
            pinterestSwipeRefreshLayout.setLayoutParams(layoutParams2);
        } else if (layoutParams2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(layoutParams2);
            marginLayoutParams2.topMargin = height;
            pinterestSwipeRefreshLayout.setLayoutParams(marginLayoutParams2);
        }
    }
}
