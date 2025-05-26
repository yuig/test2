package ab2;

import a7.v0;
import androidx.media3.exoplayer.ExoPlayer;
import com.pinterest.api.model.f30;
import com.pinterest.ui.grid.videopin.PinVideoGridCell;
import com.pinterest.video.core.view.PinterestVideoView;
import k8.y;
import kh2.s0;
import kotlin.jvm.internal.Intrinsics;
import m7.l0;
import ni1.a1;
import ni1.e1;
import ni1.x1;
import ow.p0;
import u50.r;

/* loaded from: classes2.dex */
public final class c extends ic2.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PinVideoGridCell f1740c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PinterestVideoView f1741d;

    public c(PinVideoGridCell pinVideoGridCell, PinterestVideoView pinterestVideoView) {
        this.f1740c = pinVideoGridCell;
        this.f1741d = pinterestVideoView;
    }

    @Override // ic2.d
    public final void X(long j13) {
        f30 f30Var;
        f30 f30Var2;
        PinVideoGridCell pinVideoGridCell = this.f1740c;
        es.a aVar = ((ur.b) pinVideoGridCell.getAdsCoreDependencies()).f123058a;
        f30Var = pinVideoGridCell.pin;
        if (f30Var == null) {
            Intrinsics.r("pin");
            throw null;
        }
        if (((es.c) aVar).t(f30Var) && ((p0) pinVideoGridCell.getAdsOpenMeasurementManager()).n()) {
            ow.a adsOpenMeasurementManager = pinVideoGridCell.getAdsOpenMeasurementManager();
            f30Var2 = pinVideoGridCell.pin;
            if (f30Var2 != null) {
                ((p0) adsOpenMeasurementManager).o(f30Var2, j13);
            } else {
                Intrinsics.r("pin");
                throw null;
            }
        }
    }

    @Override // ic2.d
    public final void j(n7.b eventTime, boolean z13, int i13) {
        f30 f30Var;
        boolean handlePlaybackState;
        f30 f30Var2;
        f30 pin;
        f30 f30Var3;
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        PinVideoGridCell pinVideoGridCell = this.f1740c;
        f30Var = pinVideoGridCell.pin;
        if (f30Var != null) {
            f30Var3 = pinVideoGridCell.pin;
            if (f30Var3 == null) {
                Intrinsics.r("pin");
                throw null;
            }
            if (!f30Var3.d5().booleanValue()) {
                s0.b1(pinVideoGridCell.pinRepViewModel.c(), z13 && (i13 == 3 || i13 == 2));
            }
        }
        r c13 = pinVideoGridCell.pinRepViewModel.c();
        handlePlaybackState = pinVideoGridCell.handlePlaybackState(z13, i13);
        c13.a(new e1(handlePlaybackState, false));
        es.a aVar = ((ur.b) pinVideoGridCell.getAdsCoreDependencies()).f123058a;
        f30Var2 = pinVideoGridCell.pin;
        if (f30Var2 == null) {
            Intrinsics.r("pin");
            throw null;
        }
        if (((es.c) aVar).t(f30Var2) && ((p0) pinVideoGridCell.getAdsOpenMeasurementManager()).n()) {
            ow.a adsOpenMeasurementManager = pinVideoGridCell.getAdsOpenMeasurementManager();
            pin = pinVideoGridCell.pin;
            if (pin == null) {
                Intrinsics.r("pin");
                throw null;
            }
            v0 v0Var = this.f1741d.f18946k;
            float E = v0Var != null ? v0Var.E() : 0.0f;
            p0 p0Var = (p0) adsOpenMeasurementManager;
            p0Var.getClass();
            Intrinsics.checkNotNullParameter(pin, "pin");
            kotlin.jvm.internal.j.z(p0Var.f97865g, null, null, new ow.q(pin, p0Var, i13, z13, E, null), 3);
        }
    }

    @Override // ic2.d
    public final void o(boolean z13, long j13) {
        f30 f30Var;
        f30 f30Var2;
        y yVar;
        ExoPlayer exoPlayer;
        PinVideoGridCell pinVideoGridCell = this.f1740c;
        r c13 = pinVideoGridCell.pinRepViewModel.c();
        PinterestVideoView pinterestVideoView = this.f1741d;
        c13.a(new x1(new gk1.o(pinterestVideoView.getB())));
        if (z13 && !pinVideoGridCell.getVideoView().V()) {
            pinVideoGridCell.getVideoView().R = true;
            hc2.m mVar = pinterestVideoView.Q;
            if (mVar == null || (exoPlayer = ((dc2.g) mVar).f54407a) == null) {
                yVar = null;
            } else {
                l0 l0Var = (l0) exoPlayer;
                l0Var.L0();
                yVar = l0Var.f86269j;
            }
            k8.q qVar = yVar instanceof k8.q ? (k8.q) yVar : null;
            if (qVar != null) {
                dl2.b.W2(qVar, true);
            }
        }
        es.a aVar = ((ur.b) pinVideoGridCell.getAdsCoreDependencies()).f123058a;
        f30Var = pinVideoGridCell.pin;
        if (f30Var == null) {
            Intrinsics.r("pin");
            throw null;
        }
        if (((es.c) aVar).t(f30Var) && ((p0) pinVideoGridCell.getAdsOpenMeasurementManager()).n()) {
            ow.a adsOpenMeasurementManager = pinVideoGridCell.getAdsOpenMeasurementManager();
            f30Var2 = pinVideoGridCell.pin;
            if (f30Var2 == null) {
                Intrinsics.r("pin");
                throw null;
            }
            v0 v0Var = pinterestVideoView.f18946k;
            ow.a.a(adsOpenMeasurementManager, f30Var2, v0Var != null ? v0Var.E() : 0.0f);
        }
    }

    @Override // n7.c
    public final void v(n7.b eventTime, Object output) {
        f30 f30Var;
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(output, "output");
        PinVideoGridCell pinVideoGridCell = this.f1740c;
        pinVideoGridCell.updateInnerViewsForYOffset(com.bumptech.glide.d.T(pinVideoGridCell.getInternalCell()) != null ? r3.f128840c : 0);
        if (pinVideoGridCell.isFixedHeightPin()) {
            pinVideoGridCell.resizeVideoView();
        }
        f30Var = pinVideoGridCell.pin;
        if (f30Var == null) {
            Intrinsics.r("pin");
            throw null;
        }
        if (f30Var.d5().booleanValue() && pinVideoGridCell.isFixedHeightPin() && !pinVideoGridCell.getShouldForceLetterbox()) {
            return;
        }
        pinVideoGridCell.pinRepViewModel.c().a(a1.f90594a);
    }
}
