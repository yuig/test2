package com.pinterest.feature.pincarouselads.view;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.m1;
import androidx.recyclerview.widget.n1;
import androidx.recyclerview.widget.w2;
import ao2.e2;
import ao2.v0;
import com.pinterest.ui.view.BaseRecyclerContainerView;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yq0.a0;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 =*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004:\u0002>?B\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b9\u0010:B#\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u00108\u001a\u0004\u0018\u000107\u0012\u0006\u0010;\u001a\u00020\n¢\u0006\u0004\b9\u0010<J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u0013J#\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001d2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0007¢\u0006\u0004\b \u0010\u0013J\u000f\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b%\u0010&R\"\u0010(\u001a\u00020'8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u0006@"}, d2 = {"Lcom/pinterest/feature/pincarouselads/view/BaseRecyclerCellView;", "Lyq0/a0;", "D", "Lcom/pinterest/ui/view/BaseRecyclerContainerView;", "Ll21/c;", "Landroid/content/Context;", "context", "", "init", "(Landroid/content/Context;)V", "", "selectedIndex", "smoothScrollToCarouselItem", "(I)V", "jumpToCarouselItem", "setCarouselItemSelected", "count", "setCarouselItemCount", "setRecyclerViewToIndexCarousel", "()V", "startCarouselAnimation", "Ll21/b;", "listener", "startAutoScroll", "(Ll21/b;)V", "stopAutoScroll", "orientation", "", "reverseLayout", "Landroidx/recyclerview/widget/b1;", "createLayoutManagerContract", "(IZ)Landroidx/recyclerview/widget/b1;", "restartJob", "", "getAutoScrollDelay", "()J", "", "getSmoothScrollSpeedPerPixel", "()F", "Lcom/pinterest/feature/pincarouselads/view/CarouselIndexView;", "indexTrackerView", "Lcom/pinterest/feature/pincarouselads/view/CarouselIndexView;", "getIndexTrackerView", "()Lcom/pinterest/feature/pincarouselads/view/CarouselIndexView;", "setIndexTrackerView", "(Lcom/pinterest/feature/pincarouselads/view/CarouselIndexView;)V", "Landroid/os/Handler;", "autoScrollHandler", "Landroid/os/Handler;", "Lao2/e2;", "defaultDispatcher", "Lao2/e2;", "Lao2/x;", "job", "Lao2/x;", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "com/pinterest/feature/pincarouselads/view/b", "com/pinterest/feature/pincarouselads/view/c", "pinCarouselAdsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class BaseRecyclerCellView<D extends yq0.a0> extends BaseRecyclerContainerView<D> implements l21.c {

    @Deprecated
    public static final long AUTOSCROLL_DELAY = 1500;

    @Deprecated
    public static final long CAROUSEL_ANIMATION_DELAY = 1800;

    @NotNull
    private static final c Companion = new c();

    @Deprecated
    public static final float MS_PER_PIXEL = 150.0f;

    @NotNull
    private Handler autoScrollHandler;

    @NotNull
    private final e2 defaultDispatcher;
    protected CarouselIndexView indexTrackerView;

    @NotNull
    private ao2.x job;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseRecyclerCellView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final boolean access$getHasScrolled(BaseRecyclerCellView baseRecyclerCellView) {
        return baseRecyclerCellView.getIndexTrackerView().f47324c != 0;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    @NotNull
    public b1 createLayoutManagerContract(int orientation, boolean reverseLayout) {
        final a aVar = new a(this, 0);
        getContext();
        PinterestLinearLayoutManager layoutManager = new PinterestLinearLayoutManager(aVar) { // from class: com.pinterest.feature.pincarouselads.view.BaseRecyclerCellView$createLayoutManagerContract$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.l2
            public final void W0(RecyclerView recyclerView, w2 w2Var, int i13) {
                m1 m1Var = new m1(8, recyclerView != null ? recyclerView.getContext() : null, BaseRecyclerCellView.this);
                m1Var.h(i13);
                X0(m1Var);
            }
        };
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        return new b1(layoutManager);
    }

    public long getAutoScrollDelay() {
        return AUTOSCROLL_DELAY;
    }

    @NotNull
    public final CarouselIndexView getIndexTrackerView() {
        CarouselIndexView carouselIndexView = this.indexTrackerView;
        if (carouselIndexView != null) {
            return carouselIndexView;
        }
        Intrinsics.r("indexTrackerView");
        throw null;
    }

    public abstract int getIndexTrackerViewId();

    public float getSmoothScrollSpeedPerPixel() {
        return 150.0f;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.init(context);
        View findViewById = findViewById(getIndexTrackerViewId());
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        setIndexTrackerView((CarouselIndexView) findViewById);
        new n1().b(getPinterestRecyclerView().f52531a);
    }

    @Override // l21.c
    public void jumpToCarouselItem(int selectedIndex) {
        getIndexTrackerView().e(selectedIndex);
        getPinterestRecyclerView().f52535e.M0(selectedIndex);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        restartJob();
        stopAutoScroll();
        super.onDetachedFromWindow();
    }

    public final void restartJob() {
        this.job.cancel((CancellationException) null);
        this.job = ue.c.b();
    }

    @Override // l21.c
    public void setCarouselItemCount(int count) {
        getIndexTrackerView().d(count);
    }

    @Override // l21.c
    public void setCarouselItemSelected(int selectedIndex) {
        getIndexTrackerView().e(selectedIndex);
    }

    public final void setIndexTrackerView(@NotNull CarouselIndexView carouselIndexView) {
        Intrinsics.checkNotNullParameter(carouselIndexView, "<set-?>");
        this.indexTrackerView = carouselIndexView;
    }

    @Override // l21.c
    public void setRecyclerViewToIndexCarousel() {
        restartJob();
        getIndexTrackerView().a(getPinterestRecyclerView());
    }

    public void smoothScrollToCarouselItem(int selectedIndex) {
        getIndexTrackerView().e(selectedIndex);
        getPinterestRecyclerView().h(selectedIndex, true);
    }

    public void startAutoScroll(@NotNull l21.b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Handler handler = this.autoScrollHandler;
        handler.postDelayed(new b(listener, handler, getPinterestRecyclerView(), getAutoScrollDelay()), getAutoScrollDelay());
    }

    @Override // l21.c
    public void startCarouselAnimation() {
        kotlin.jvm.internal.j.z(dl2.b.b(this.job.plus(this.defaultDispatcher)), null, null, new d(this, null), 3);
    }

    public void stopAutoScroll() {
        this.autoScrollHandler.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseRecyclerCellView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.autoScrollHandler = new Handler();
        ko2.f fVar = v0.f20219a;
        this.defaultDispatcher = ho2.q.f69782a;
        this.job = ue.c.b();
    }
}
