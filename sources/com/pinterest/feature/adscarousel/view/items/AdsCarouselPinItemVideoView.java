package com.pinterest.feature.adscarousel.view.items;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import ao2.j0;
import bs1.c;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.d40;
import com.pinterest.api.model.f30;
import com.pinterest.ui.grid.videopin.PinVideoGridCell;
import hf0.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import qi0.g;
import wa2.m;
import yk1.i;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0001\"B1\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000e8\u0014X\u0094D¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u000e8\u0014X\u0094D¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012¨\u0006#"}, d2 = {"Lcom/pinterest/feature/adscarousel/view/items/AdsCarouselPinItemVideoView;", "Lcom/pinterest/ui/grid/videopin/PinVideoGridCell;", "", "gridCount", "()F", "Lcom/pinterest/api/model/f30;", "pin", "", "pinGridPosition", "", "setPin", "(Lcom/pinterest/api/model/f30;I)V", "carouselPositionInGrid", "I", "", "showAudioIndicatorOnGrid", "Z", "getShowAudioIndicatorOnGrid", "()Z", "forceMuteVideo", "getForceMuteVideo", "shouldForceLetterbox", "getShouldForceLetterbox", "Landroid/content/Context;", "context", "Lnx/d0;", "pinalytics", "Lwa2/m;", "pinFeatureConfig", "Lao2/j0;", "scope", "<init>", "(Landroid/content/Context;Lnx/d0;Lwa2/m;Lao2/j0;I)V", "Companion", "qi0/g", "adsCarouselLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class AdsCarouselPinItemVideoView extends PinVideoGridCell {

    @NotNull
    public static final g Companion = new g();
    public static final float NUM_COL_ITEMS_PHONE = 2.6f;
    private final int carouselPositionInGrid;
    private final boolean forceMuteVideo;
    private final boolean shouldForceLetterbox;
    private final boolean showAudioIndicatorOnGrid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsCarouselPinItemVideoView(@NotNull Context context, @NotNull d0 pinalytics, @NotNull m pinFeatureConfig, @NotNull j0 scope, int i13) {
        super(context, pinalytics, pinFeatureConfig, scope, null, null, true, true, 48, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.carouselPositionInGrid = i13;
        this.forceMuteVideo = true;
        setLayoutParams(new ConstraintLayout.LayoutParams((int) (b.c().widthPixels / 2.6f), -2));
    }

    @Override // com.pinterest.ui.grid.videopin.PinVideoGridCell, y92.g
    public /* bridge */ /* synthetic */ int getAllowedHeightChange(int i13) {
        return super.getAllowedHeightChange(i13);
    }

    @Override // com.pinterest.ui.grid.videopin.PinVideoGridCell, nx.v
    public /* bridge */ /* synthetic */ List getChildImpressionViews() {
        return null;
    }

    @Override // com.pinterest.ui.grid.videopin.PinVideoGridCell
    public boolean getForceMuteVideo() {
        return this.forceMuteVideo;
    }

    @Override // com.pinterest.ui.grid.videopin.PinVideoGridCell
    public boolean getShouldForceLetterbox() {
        return this.shouldForceLetterbox;
    }

    @Override // com.pinterest.ui.grid.videopin.PinVideoGridCell
    public boolean getShowAudioIndicatorOnGrid() {
        return this.showAudioIndicatorOnGrid;
    }

    @Override // com.pinterest.ui.grid.videopin.PinVideoGridCell
    public float gridCount() {
        return 2.6f;
    }

    @Override // com.pinterest.ui.grid.videopin.PinVideoGridCell, qa2.f0, y92.i
    public /* bridge */ /* synthetic */ void onViewDetached() {
        super.onViewDetached();
    }

    @Override // com.pinterest.ui.grid.videopin.PinVideoGridCell, yk1.n
    public /* bridge */ /* synthetic */ void setLoadState(i iVar) {
    }

    @Override // com.pinterest.ui.grid.videopin.PinVideoGridCell, qa2.e0
    public void setPin(@NotNull f30 pin, int pinGridPosition) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        setPin(pin, this.carouselPositionInGrid, new r1.j0(pinGridPosition, 16));
        if (b40.x(pin) == d40.COMPLETE_HIDDEN) {
            c.X0(this);
        } else {
            c.U1(this);
        }
    }

    public /* synthetic */ AdsCarouselPinItemVideoView(Context context, d0 d0Var, m mVar, j0 j0Var, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, d0Var, mVar, j0Var, (i14 & 16) != 0 ? 0 : i13);
    }
}
