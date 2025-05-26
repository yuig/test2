package com.pinterest.feature.onetap.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import ao2.j0;
import bz0.a;
import bz0.c;
import com.pinterest.api.model.f30;
import com.pinterest.ui.grid.videopin.PinVideoGridCell;
import i91.u;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import wa2.i;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0000\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006)"}, d2 = {"Lcom/pinterest/feature/onetap/view/OneTapPinVideoGridCell;", "Lcom/pinterest/ui/grid/videopin/PinVideoGridCell;", "Lbz0/c;", "", "getPinImageBottomEdgeYPos", "()I", "getPinImageRightEdgeXPos", "", "changed", "left", "top", "right", "bottom", "", "onLayout", "(ZIIII)V", "Lcom/pinterest/api/model/f30;", "pin", "pinGridPosition", "setPin", "(Lcom/pinterest/api/model/f30;I)V", "Lbz0/a;", "listener", "setOneTapButtonClickListener", "(Lbz0/a;)V", "Lbz0/a;", "Lez0/c;", "button", "Lez0/c;", "Landroid/content/Context;", "context", "Lnx/d0;", "pinalytics", "Lao2/j0;", "scope", "Lwa2/i;", "legacyPinFeatureConfig", "Li91/u;", "style", "<init>", "(Landroid/content/Context;Lnx/d0;Lao2/j0;Lwa2/i;Li91/u;)V", "oneTapLibrary_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class OneTapPinVideoGridCell extends PinVideoGridCell implements c {

    @NotNull
    private final ez0.c button;
    private a listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTapPinVideoGridCell(@NotNull Context context, @NotNull d0 pinalytics, @NotNull j0 scope, @NotNull i legacyPinFeatureConfig, @NotNull u style) {
        super(context, pinalytics, f0.i0(legacyPinFeatureConfig), scope, null, null, false, false, 48, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(legacyPinFeatureConfig, "legacyPinFeatureConfig");
        Intrinsics.checkNotNullParameter(style, "style");
        ez0.c cVar = new ez0.c(context, style);
        this.button = cVar;
        addView(cVar);
    }

    private final int getPinImageBottomEdgeYPos() {
        return getPinRep().getImageEdges().f139142d;
    }

    private final int getPinImageRightEdgeXPos() {
        return getPinRep().getImageEdges().f139141c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPin$lambda$0(OneTapPinVideoGridCell this$0, f30 pin, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(pin, "$pin");
        a aVar = this$0.listener;
        if (aVar != null) {
            ((cz0.a) aVar).p3(pin);
        }
    }

    @Override // com.pinterest.ui.grid.videopin.PinVideoGridCell, y92.g
    public /* bridge */ /* synthetic */ int getAllowedHeightChange(int i13) {
        return super.getAllowedHeightChange(i13);
    }

    @Override // com.pinterest.ui.grid.videopin.PinVideoGridCell, nx.v
    public /* bridge */ /* synthetic */ List getChildImpressionViews() {
        return null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.button.g(getPinImageBottomEdgeYPos(), getPinImageRightEdgeXPos());
    }

    @Override // com.pinterest.ui.grid.videopin.PinVideoGridCell, qa2.f0, y92.i
    public /* bridge */ /* synthetic */ void onViewDetached() {
        super.onViewDetached();
    }

    @Override // com.pinterest.ui.grid.videopin.PinVideoGridCell, yk1.n
    public /* bridge */ /* synthetic */ void setLoadState(yk1.i iVar) {
    }

    @Override // bz0.b
    public void setOneTapButtonClickListener(@NotNull a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    @Override // com.pinterest.ui.grid.videopin.PinVideoGridCell, qa2.e0
    public void setPin(@NotNull f30 pin, int pinGridPosition) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        super.setPin(pin, pinGridPosition);
        this.button.setOnClickListener(new qv0.d0(10, this, pin));
        this.button.j(pinGridPosition);
    }
}
