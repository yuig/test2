package ab2;

import ac2.p1;
import android.view.View;
import com.pinterest.api.model.f30;
import com.pinterest.ui.grid.videopin.PinVideoGridCell;
import com.pinterest.video.core.view.PinterestVideoView;
import df.j1;
import kh2.s0;

/* loaded from: classes2.dex */
public final class l implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f1755a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PinVideoGridCell f1756b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f30 f1757c;

    public l(PinterestVideoView pinterestVideoView, PinVideoGridCell pinVideoGridCell, f30 f30Var) {
        this.f1755a = pinterestVideoView;
        this.f1756b = pinVideoGridCell;
        this.f1757c = f30Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f1755a.removeOnAttachStateChangeListener(this);
        PinVideoGridCell pinVideoGridCell = this.f1756b;
        if (pinVideoGridCell.playabilityTracker.a(pinVideoGridCell.getVideoView())) {
            return;
        }
        lh0.j adsLibraryExperiments = pinVideoGridCell.getAdsLibraryExperiments();
        p1 videoManagerUtil = pinVideoGridCell.getVideoManagerUtil();
        if (j1.Q1(pinVideoGridCell.getAdsCommonDisplay(), pinVideoGridCell.getAdsAudioOverlayPowerscoreExperimentManager(), pinVideoGridCell.getOrganicAudioOverlayPowerscoreExperimentManager(), this.f1757c, adsLibraryExperiments, videoManagerUtil, ((es.c) pinVideoGridCell.getAdFormats()).G(this.f1757c))) {
            s0.b1(pinVideoGridCell.pinRepViewModel.c(), false);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
