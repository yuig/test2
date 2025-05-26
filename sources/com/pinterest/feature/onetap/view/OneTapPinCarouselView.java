package com.pinterest.feature.onetap.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import ao2.j0;
import bz0.a;
import bz0.b;
import com.pinterest.api.model.f30;
import ez0.c;
import i91.u;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import uj2.q;
import yk1.i;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030 \u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J7\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lcom/pinterest/feature/onetap/view/OneTapPinCarouselView;", "Lcom/pinterest/feature/pincarouselads/view/SingleColumnCarouselPinView;", "Lbz0/b;", "", "changed", "", "left", "top", "right", "bottom", "", "onLayout", "(ZIIII)V", "Lcom/pinterest/api/model/f30;", "latestPin", "modelGridPosition", "setPin", "(Lcom/pinterest/api/model/f30;I)V", "Lbz0/a;", "listener", "setOneTapButtonClickListener", "(Lbz0/a;)V", "Lbz0/a;", "Lez0/c;", "button", "Lez0/c;", "Landroid/content/Context;", "context", "Lao2/j0;", "scope", "Lnx/d0;", "pinalytics", "Luj2/q;", "networkStateStream", "Li91/u;", "style", "<init>", "(Landroid/content/Context;Lao2/j0;Lnx/d0;Luj2/q;Li91/u;)V", "oneTapLibrary_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class OneTapPinCarouselView extends Hilt_OneTapPinCarouselView implements b {

    @NotNull
    private final c button;
    private a listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTapPinCarouselView(@NotNull Context context, @NotNull j0 scope, @NotNull d0 pinalytics, @NotNull q<Boolean> networkStateStream, @NotNull u style) {
        super(context, scope, pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(style, "style");
        c cVar = new c(context, style);
        this.button = cVar;
        addView(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPin$lambda$0(OneTapPinCarouselView this$0, f30 latestPin, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(latestPin, "$latestPin");
        a aVar = this$0.listener;
        if (aVar != null) {
            ((cz0.a) aVar).p3(latestPin);
        }
    }

    @Override // com.pinterest.feature.onetap.view.Hilt_OneTapPinCarouselView, com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView, y92.g
    public /* bridge */ /* synthetic */ int getAllowedHeightChange(int i13) {
        return super.getAllowedHeightChange(i13);
    }

    @Override // com.pinterest.feature.onetap.view.Hilt_OneTapPinCarouselView, com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView, nx.v
    public /* bridge */ /* synthetic */ List getChildImpressionViews() {
        return null;
    }

    @Override // com.pinterest.feature.onetap.view.Hilt_OneTapPinCarouselView, com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView, sq0.b0
    /* renamed from: getNumColumns */
    public /* bridge */ /* synthetic */ int getT0() {
        return 1;
    }

    @Override // com.pinterest.feature.onetap.view.Hilt_OneTapPinCarouselView, com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView, sq0.b0
    public /* bridge */ /* synthetic */ void mvpMaybeToggleOfflineEmptyStateVisibility() {
    }

    @Override // com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.button.g(getCarouselRecyclerView().getHeight() + ((int) getCarouselRecyclerView().getY()), getCarouselRecyclerView().getWidth() + ((int) getCarouselRecyclerView().getX()));
    }

    @Override // com.pinterest.feature.onetap.view.Hilt_OneTapPinCarouselView, com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView, qa2.f0, y92.i
    public /* bridge */ /* synthetic */ void onViewDetached() {
        super.onViewDetached();
    }

    @Override // com.pinterest.feature.onetap.view.Hilt_OneTapPinCarouselView, com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView, yk1.n
    public /* bridge */ /* synthetic */ void setLoadState(i iVar) {
    }

    @Override // bz0.b
    public void setOneTapButtonClickListener(@NotNull a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    @Override // com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView, qa2.e0
    public void setPin(@NotNull f30 latestPin, int modelGridPosition) {
        Intrinsics.checkNotNullParameter(latestPin, "latestPin");
        super.setPin(latestPin, modelGridPosition);
        this.button.setOnClickListener(new qv0.d0(8, this, latestPin));
        this.button.j(modelGridPosition);
    }

    @Override // com.pinterest.feature.onetap.view.Hilt_OneTapPinCarouselView, com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView
    public /* bridge */ /* synthetic */ void triggerEmptyStateCheck() {
    }

    @Override // com.pinterest.feature.onetap.view.Hilt_OneTapPinCarouselView, com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView, sq0.b0
    public /* bridge */ /* synthetic */ void triggerLoadMoreCheck() {
    }
}
