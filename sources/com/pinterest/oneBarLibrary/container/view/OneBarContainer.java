package com.pinterest.oneBarLibrary.container.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.recyclerview.widget.b1;
import com.pinterest.feature.newshub.b;
import eb2.k;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nv1.e;
import nx.d0;
import nx.o0;
import org.jetbrains.annotations.NotNull;
import ov1.c;
import pk.a0;
import pr0.g;
import qv1.d;
import tq.a;
import xk2.v;
import yq0.z;
import zy.m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\fB'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/oneBarLibrary/container/view/OneBarContainer;", "Lcom/pinterest/ui/view/BaseRecyclerContainerView;", "Lyq0/a0;", "Lov1/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "g4/u", "oneBarLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class OneBarContainer extends a implements c {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f49979k = 0;

    /* renamed from: d, reason: collision with root package name */
    public final v f49980d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f49981e;

    /* renamed from: f, reason: collision with root package name */
    public g f49982f;

    /* renamed from: g, reason: collision with root package name */
    public final v f49983g;

    /* renamed from: h, reason: collision with root package name */
    public final d f49984h;

    /* renamed from: i, reason: collision with root package name */
    public Function0 f49985i;

    /* renamed from: j, reason: collision with root package name */
    public final qv1.c f49986j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneBarContainer(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void b(g feedPWTLoggingEventListener) {
        Intrinsics.checkNotNullParameter(feedPWTLoggingEventListener, "feedPWTLoggingEventListener");
        this.f49982f = feedPWTLoggingEventListener;
        addRecyclerViewEventListener(feedPWTLoggingEventListener);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final m[] createImpressionLoggers(pb0.a aVar, d0 d0Var, o0 pinalyticsManager) {
        pb0.g clock = pb0.g.f99432a;
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        return d0Var != null ? new m[]{new z61.a(d0Var, 0), new b(d0Var, this.f49986j)} : super.createImpressionLoggers(clock, d0Var, pinalyticsManager);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final b1 createLayoutManagerContract(int i13, boolean z13) {
        g41.a aVar = new g41.a(this, 12);
        getContext();
        OneBarContainer$createLayoutManagerContract$1 layoutManager = new OneBarContainer$createLayoutManagerContract$1(aVar, 0, false);
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        return new b1(layoutManager);
    }

    public final void e(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f49985i = function0;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final String getDebugTag() {
        return (String) this.f49980d.getValue();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getLayoutResourceId() {
        return e.view_search_header;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getPinterestRecyclerViewId() {
        return nv1.d.search_header_p_recycler_view;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.init(context);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        getPinterestRecyclerView().a(new k(false, 0, 0, a0.K(4, resources), 0));
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.space_200);
        getPinterestRecyclerView().f52531a.setPaddingRelative(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        getPinterestRecyclerView().getLayoutParams().height = getResources().getDimensionPixelSize(eo1.c.space_400) + dl2.b.G0(this, eo1.a.comp_searchguide_height);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getPinterestRecyclerView().b(this.f49984h);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getPinterestRecyclerView().e(this.f49984h);
        super.onDetachedFromWindow();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final void registerViewHolderCreators(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.H(new int[]{0, 1, 2, 3}, new qv1.c(this, 1));
        adapter.H(new int[]{4}, new qv1.c(this, 2));
    }

    public /* synthetic */ OneBarContainer(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneBarContainer(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 8);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49980d = xk2.m.b(qv1.b.f105243j);
        this.f49983g = a.c.n(context, 10);
        this.f49984h = new d(this);
        this.f49985i = qv1.b.f105244k;
        this.f49986j = new qv1.c(this, 0);
    }
}
