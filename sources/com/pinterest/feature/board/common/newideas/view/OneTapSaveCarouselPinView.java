package com.pinterest.feature.board.common.newideas.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import ao2.j0;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import df.j1;
import eo1.c;
import java.util.List;
import kh2.g3;
import kh2.k3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.t;
import nx.d0;
import om1.e;
import om1.f;
import org.jetbrains.annotations.NotNull;
import rm1.m;
import rm1.n;
import rq.o2;
import s1.w;
import tj0.e0;
import tj0.f0;
import tj0.v;
import tj0.x;
import uj2.q;
import yk1.i;
import z32.f2;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00106\u001a\u000205\u0012\f\u00108\u001a\b\u0012\u0004\u0012\u00020\r07¢\u0006\u0004\b9\u0010:J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010)R\u0014\u0010*\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u0006;"}, d2 = {"Lcom/pinterest/feature/board/common/newideas/view/OneTapSaveCarouselPinView;", "Lcom/pinterest/feature/pincarouselads/view/SingleColumnCarouselPinView;", "", "", "getPinImageBottomEdgeYPos", "()I", "getPinImageRightEdgeXPos", "getPinImageLeftEdgeXPos", "Lcom/pinterest/gestalt/iconbutton/GestaltIconButton;", "button", "", "updateButtonPosition", "(Lcom/pinterest/gestalt/iconbutton/GestaltIconButton;)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "isPinSaved", "setIsPinSaved", "(Z)V", "visible", "updateOneTapButtonVisibility", "Ltj0/e0;", "listener", "setOneTapButtonClickLister", "(Ltj0/e0;)V", "Lz32/f2;", "iconType", "updateQuickSaveIcon", "(Lz32/f2;)V", "Llh0/t;", "experiment", "Llh0/t;", "getExperiment", "()Llh0/t;", "setExperiment", "(Llh0/t;)V", "Lz32/f2;", "oneTapSaveIconButton", "Lcom/pinterest/gestalt/iconbutton/GestaltIconButton;", "Lrm1/m;", "oneTapSaveIcon", "Lrm1/m;", "margin", "I", "Landroid/content/Context;", "context", "Lao2/j0;", "scope", "Lnx/d0;", "pinalytics", "Luj2/q;", "networkStateStream", "<init>", "(Landroid/content/Context;Lao2/j0;Lnx/d0;Luj2/q;)V", "boardMoreIdeasLibrary_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class OneTapSaveCarouselPinView extends Hilt_OneTapSaveCarouselPinView implements f0 {
    public t experiment;

    @NotNull
    private f2 iconType;
    private final int margin;

    @NotNull
    private m oneTapSaveIcon;

    @NotNull
    private final GestaltIconButton oneTapSaveIconButton;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTapSaveCarouselPinView(@NotNull Context context, @NotNull j0 scope, @NotNull d0 pinalytics, @NotNull q<Boolean> networkStateStream) {
        super(context, scope, pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.iconType = f2.PLUS_BUTTON_ICON;
        m mVar = rm1.q.ANGLED_PIN;
        this.oneTapSaveIcon = mVar;
        this.margin = getResources().getDimensionPixelOffset(c.margin_half);
        boolean a13 = getExperiment().a();
        this.oneTapSaveIcon = a13 ? n.ANGLED_PIN : mVar;
        GestaltIconButton t13 = new GestaltIconButton(6, context, (AttributeSet) null).t(new gd0.c(22, this, a13 ? e.SM : e.MD));
        this.oneTapSaveIconButton = t13;
        addView(t13);
        t13.getLayoutParams().width = -2;
    }

    private final int getPinImageBottomEdgeYPos() {
        return getCarouselRecyclerView().getHeight() + ((int) getCarouselRecyclerView().getY());
    }

    private final int getPinImageLeftEdgeXPos() {
        return (int) getCarouselRecyclerView().getX();
    }

    private final int getPinImageRightEdgeXPos() {
        return getCarouselRecyclerView().getWidth() + ((int) getCarouselRecyclerView().getX());
    }

    public static final void setOneTapButtonClickLister$lambda$0(e0 listener, View view) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        ((v) listener).a();
    }

    private final void updateButtonPosition(GestaltIconButton button) {
        int pinImageBottomEdgeYPos = getPinImageBottomEdgeYPos();
        int pinImageRightEdgeXPos = getPinImageRightEdgeXPos();
        int pinImageLeftEdgeXPos = getPinImageLeftEdgeXPos();
        if (pinImageBottomEdgeYPos <= 0 || pinImageRightEdgeXPos <= 0) {
            return;
        }
        button.setY((pinImageBottomEdgeYPos - button.getMeasuredHeight()) - this.margin);
        Context context = button.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (j1.Y0(context)) {
            button.setX(pinImageLeftEdgeXPos);
        } else {
            button.setX((pinImageRightEdgeXPos - button.getMeasuredWidth()) - this.margin);
        }
    }

    @Override // com.pinterest.feature.board.common.newideas.view.Hilt_OneTapSaveCarouselPinView, com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView, y92.g
    public /* bridge */ /* synthetic */ int getAllowedHeightChange(int i13) {
        return super.getAllowedHeightChange(i13);
    }

    @Override // com.pinterest.feature.board.common.newideas.view.Hilt_OneTapSaveCarouselPinView, com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView, nx.v
    public /* bridge */ /* synthetic */ List getChildImpressionViews() {
        return null;
    }

    @NotNull
    public final t getExperiment() {
        t tVar = this.experiment;
        if (tVar != null) {
            return tVar;
        }
        Intrinsics.r("experiment");
        throw null;
    }

    @Override // com.pinterest.feature.board.common.newideas.view.Hilt_OneTapSaveCarouselPinView, com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView, sq0.b0
    /* renamed from: getNumColumns */
    public /* bridge */ /* synthetic */ int getZ0() {
        return 1;
    }

    @Override // com.pinterest.feature.board.common.newideas.view.Hilt_OneTapSaveCarouselPinView, com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView, sq0.b0
    public /* bridge */ /* synthetic */ void mvpMaybeToggleOfflineEmptyStateVisibility() {
    }

    @Override // com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        updateButtonPosition(this.oneTapSaveIconButton);
    }

    @Override // com.pinterest.feature.board.common.newideas.view.Hilt_OneTapSaveCarouselPinView, com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView, qa2.f0, y92.i
    public /* bridge */ /* synthetic */ void onViewDetached() {
        super.onViewDetached();
    }

    public final void setExperiment(@NotNull t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<set-?>");
        this.experiment = tVar;
    }

    @Override // tj0.f0
    public void setIsPinSaved(boolean isPinSaved) {
        g3.y(this.oneTapSaveIconButton, new w(isPinSaved, this, isPinSaved ? f.DEFAULT_DARK_GRAY : getExperiment().c() ? f.WASH_50_OPACITY_LIGHT : f.DEFAULT_WHITE, 6));
    }

    @Override // com.pinterest.feature.board.common.newideas.view.Hilt_OneTapSaveCarouselPinView, com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView, yk1.n
    public /* bridge */ /* synthetic */ void setLoadState(i iVar) {
    }

    @Override // tj0.f0
    public void setOneTapButtonClickLister(@NotNull e0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.oneTapSaveIconButton.v(new x(listener, 0));
    }

    @Override // com.pinterest.feature.board.common.newideas.view.Hilt_OneTapSaveCarouselPinView, com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView
    public /* bridge */ /* synthetic */ void triggerEmptyStateCheck() {
    }

    @Override // com.pinterest.feature.board.common.newideas.view.Hilt_OneTapSaveCarouselPinView, com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView, sq0.b0
    public /* bridge */ /* synthetic */ void triggerLoadMoreCheck() {
    }

    @Override // tj0.f0
    public void updateOneTapButtonVisibility(boolean visible) {
        k3.R1(this.oneTapSaveIconButton, visible);
    }

    @Override // tj0.f0
    public void updateQuickSaveIcon(@NotNull f2 iconType) {
        Intrinsics.checkNotNullParameter(iconType, "iconType");
        rm1.q x13 = dn.c.x(iconType);
        this.iconType = iconType;
        if (x13 != null) {
            this.oneTapSaveIcon = x13;
            g3.y(this.oneTapSaveIconButton, new o2(x13, 2));
        }
    }
}
