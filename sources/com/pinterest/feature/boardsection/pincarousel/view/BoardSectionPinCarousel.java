package com.pinterest.feature.boardsection.pincarousel.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cr.d;
import io0.b;
import ko0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u001d\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/boardsection/pincarousel/view/BoardSectionPinCarousel;", "Landroid/widget/LinearLayout;", "Lio0/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gi2/b", "boardSectionLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BoardSectionPinCarousel extends LinearLayout implements b {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f45381c = 0;

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f45382a;

    /* renamed from: b, reason: collision with root package name */
    public a f45383b;

    public BoardSectionPinCarousel(Context context) {
        super(context);
        a();
    }

    public final void a() {
        View.inflate(getContext(), l70.b.board_section_pin_carousel_container, this);
        setOrientation(1);
        View findViewById = findViewById(l70.a.board_section_carousel);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45382a = (RecyclerView) findViewById;
        d dVar = new d(8);
        getContext();
        PinterestLinearLayoutManager pinterestLinearLayoutManager = new PinterestLinearLayoutManager(dVar, 0, false);
        RecyclerView recyclerView = this.f45382a;
        if (recyclerView == null) {
            Intrinsics.r("recyclerView");
            throw null;
        }
        recyclerView.R2(pinterestLinearLayoutManager);
        RecyclerView recyclerView2 = this.f45382a;
        if (recyclerView2 == null) {
            Intrinsics.r("recyclerView");
            throw null;
        }
        recyclerView2.f19254t = true;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        int K = a0.K(2, resources);
        RecyclerView recyclerView3 = this.f45382a;
        if (recyclerView3 != null) {
            recyclerView3.m(new ko0.b(K, 0));
        } else {
            Intrinsics.r("recyclerView");
            throw null;
        }
    }

    public final void b(int i13) {
        RecyclerView recyclerView = this.f45382a;
        if (recyclerView == null) {
            Intrinsics.r("recyclerView");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i13;
    }

    public final void e(int i13) {
        RecyclerView recyclerView = this.f45382a;
        if (recyclerView == null) {
            Intrinsics.r("recyclerView");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i13;
    }

    public BoardSectionPinCarousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public BoardSectionPinCarousel(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        a();
    }
}
