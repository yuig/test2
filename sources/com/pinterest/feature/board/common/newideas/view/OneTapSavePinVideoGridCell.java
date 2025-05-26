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
import kh2.k3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.t;
import om1.e;
import org.jetbrains.annotations.NotNull;
import r1.f;
import rm1.m;
import rm1.n;
import rm1.q;
import rq.o2;
import tj0.d0;
import tj0.e0;
import tj0.v;
import tj0.x;
import yk1.i;
import z32.f2;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0000\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b7\u00108J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010.R\u0014\u0010/\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00069"}, d2 = {"Lcom/pinterest/feature/board/common/newideas/view/OneTapSavePinVideoGridCell;", "Lcom/pinterest/ui/grid/videopin/PinVideoGridCell;", "Ltj0/d0;", "", "getPinImageBottomEdgeYPos", "()I", "getPinImageRightEdgeXPos", "getPinImageLeftEdgeXPos", "Lcom/pinterest/gestalt/iconbutton/GestaltIconButton;", "button", "", "updateButtonPosition", "(Lcom/pinterest/gestalt/iconbutton/GestaltIconButton;)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "isPinSaved", "setIsPinSaved", "(Z)V", "visible", "updateOneTapButtonVisibility", "Ltj0/e0;", "listener", "setOneTapButtonClickLister", "(Ltj0/e0;)V", "Lz32/f2;", "iconType", "updateQuickSaveIcon", "(Lz32/f2;)V", "Lwa2/m;", "pinFeatureConfig", "updateFeatureConfig", "(Lwa2/m;)V", "Llh0/t;", "experiments", "Llh0/t;", "oneTapSaveIconButton", "Lcom/pinterest/gestalt/iconbutton/GestaltIconButton;", "Lrm1/m;", "oneTapSaveIcon", "Lrm1/m;", "Lz32/f2;", "margin", "I", "Landroid/content/Context;", "context", "Lnx/d0;", "pinalytics", "Lao2/j0;", "scope", "<init>", "(Landroid/content/Context;Lnx/d0;Lao2/j0;Lwa2/m;Llh0/t;)V", "boardMoreIdeasLibrary_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class OneTapSavePinVideoGridCell extends Hilt_OneTapSavePinVideoGridCell implements d0 {

    @NotNull
    private final t experiments;

    @NotNull
    private f2 iconType;
    private final int margin;

    @NotNull
    private m oneTapSaveIcon;

    @NotNull
    private final GestaltIconButton oneTapSaveIconButton;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTapSavePinVideoGridCell(@NotNull Context context, @NotNull nx.d0 pinalytics, @NotNull j0 scope, @NotNull wa2.m pinFeatureConfig, @NotNull t experiments) {
        super(context, pinalytics, pinFeatureConfig, scope, null, null, false, false, 48, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.experiments = experiments;
        m mVar = q.ANGLED_PIN;
        this.oneTapSaveIcon = mVar;
        this.iconType = f2.PLUS_BUTTON_ICON;
        this.margin = getResources().getDimensionPixelOffset(c.space_200);
        boolean a13 = experiments.a();
        this.oneTapSaveIcon = a13 ? n.ANGLED_PIN : mVar;
        GestaltIconButton t13 = new GestaltIconButton(6, context, (AttributeSet) null).t(new gd0.c(24, this, a13 ? e.SM : e.MD));
        this.oneTapSaveIconButton = t13;
        addView(t13);
    }

    private final int getPinImageBottomEdgeYPos() {
        return getPinRep().getImageEdges().f139142d;
    }

    private final int getPinImageLeftEdgeXPos() {
        return getPinRep().getImageEdges().f139139a;
    }

    private final int getPinImageRightEdgeXPos() {
        return getPinRep().getImageEdges().f139141c;
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
        button.setY((pinImageBottomEdgeYPos - this.margin) - button.getMeasuredHeight());
        Context context = button.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (j1.Y0(context)) {
            button.setX(pinImageLeftEdgeXPos + this.margin);
        } else {
            button.setX((pinImageRightEdgeXPos - this.margin) - button.getMeasuredWidth());
        }
    }

    @Override // com.pinterest.feature.board.common.newideas.view.Hilt_OneTapSavePinVideoGridCell, com.pinterest.ui.grid.videopin.PinVideoGridCell, y92.g
    public /* bridge */ /* synthetic */ int getAllowedHeightChange(int i13) {
        return super.getAllowedHeightChange(i13);
    }

    @Override // com.pinterest.feature.board.common.newideas.view.Hilt_OneTapSavePinVideoGridCell, com.pinterest.ui.grid.videopin.PinVideoGridCell, nx.v
    public /* bridge */ /* synthetic */ List getChildImpressionViews() {
        return null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        updateButtonPosition(this.oneTapSaveIconButton);
    }

    @Override // com.pinterest.feature.board.common.newideas.view.Hilt_OneTapSavePinVideoGridCell, com.pinterest.ui.grid.videopin.PinVideoGridCell, qa2.f0, y92.i
    public /* bridge */ /* synthetic */ void onViewDetached() {
        super.onViewDetached();
    }

    @Override // tj0.f0
    public void setIsPinSaved(boolean isPinSaved) {
        this.oneTapSaveIconButton.t(new f(isPinSaved, this, 12));
    }

    @Override // com.pinterest.feature.board.common.newideas.view.Hilt_OneTapSavePinVideoGridCell, com.pinterest.ui.grid.videopin.PinVideoGridCell, yk1.n
    public /* bridge */ /* synthetic */ void setLoadState(i iVar) {
    }

    @Override // tj0.f0
    public void setOneTapButtonClickLister(@NotNull e0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.oneTapSaveIconButton.v(new x(listener, 1));
    }

    @Override // tj0.d0
    public void updateFeatureConfig(@NotNull wa2.m pinFeatureConfig) {
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
    }

    @Override // tj0.f0
    public void updateOneTapButtonVisibility(boolean visible) {
        k3.R1(this.oneTapSaveIconButton, visible);
    }

    @Override // tj0.f0
    public void updateQuickSaveIcon(@NotNull f2 iconType) {
        Intrinsics.checkNotNullParameter(iconType, "iconType");
        q x13 = dn.c.x(iconType);
        this.iconType = iconType;
        if (x13 != null) {
            this.oneTapSaveIcon = x13;
            this.oneTapSaveIconButton.t(new o2(x13, 4));
        }
    }
}
