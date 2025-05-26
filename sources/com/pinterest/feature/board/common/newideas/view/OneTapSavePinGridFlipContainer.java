package com.pinterest.feature.board.common.newideas.view;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import ao2.j0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qa2.p0;
import tj0.d0;
import tj0.e0;
import wa2.m;
import yk1.i;
import z32.f2;

@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b#\u0010$J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006%"}, d2 = {"Lcom/pinterest/feature/board/common/newideas/view/OneTapSavePinGridFlipContainer;", "Lqa2/p0;", "Ltj0/d0;", "", "isPinSaved", "", "setIsPinSaved", "(Z)V", "visible", "updateOneTapButtonVisibility", "Lwa2/m;", "pinFeatureConfig", "updateFeatureConfig", "(Lwa2/m;)V", "Ltj0/e0;", "listener", "setOneTapButtonClickLister", "(Ltj0/e0;)V", "Lz32/f2;", "iconType", "updateQuickSaveIcon", "(Lz32/f2;)V", "Lnx/d0;", "pinalytics", "Lnx/d0;", "getPinalytics", "()Lnx/d0;", "Lwa2/m;", "getPinFeatureConfig", "()Lwa2/m;", "Landroid/content/Context;", "context", "showGridActions", "Lao2/j0;", "scope", "<init>", "(Landroid/content/Context;ZLao2/j0;Lnx/d0;Lwa2/m;)V", "boardMoreIdeasLibrary_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes5.dex */
public final class OneTapSavePinGridFlipContainer extends p0 implements d0 {

    @NotNull
    private final m pinFeatureConfig;

    @NotNull
    private final nx.d0 pinalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTapSavePinGridFlipContainer(@NotNull Context context, boolean z13, @NotNull j0 scope, @NotNull nx.d0 pinalytics, @NotNull m pinFeatureConfig) {
        super(context, z13, null, scope, pinalytics, pinFeatureConfig);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        this.pinalytics = pinalytics;
        this.pinFeatureConfig = pinFeatureConfig;
    }

    @Override // y92.g
    public /* bridge */ /* synthetic */ int getAllowedHeightChange(int i13) {
        return super.getAllowedHeightChange(i13);
    }

    @NotNull
    public final m getPinFeatureConfig() {
        return this.pinFeatureConfig;
    }

    @NotNull
    public final nx.d0 getPinalytics() {
        return this.pinalytics;
    }

    @Override // qa2.f0, y92.i
    public /* bridge */ /* synthetic */ void onViewDetached() {
        super.onViewDetached();
    }

    @Override // qa2.f0, y92.i
    public /* bridge */ /* synthetic */ void onViewRecycled() {
        super.onViewRecycled();
    }

    @Override // tj0.f0
    public void setIsPinSaved(boolean isPinSaved) {
    }

    @Override // yk1.n
    public /* bridge */ /* synthetic */ void setLoadState(i iVar) {
    }

    @Override // tj0.f0
    public void setOneTapButtonClickLister(@NotNull e0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // tj0.d0
    public void updateFeatureConfig(@NotNull m pinFeatureConfig) {
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
    }

    @Override // tj0.f0
    public void updateOneTapButtonVisibility(boolean visible) {
    }

    @Override // tj0.f0
    public void updateQuickSaveIcon(@NotNull f2 iconType) {
        Intrinsics.checkNotNullParameter(iconType, "iconType");
    }
}
