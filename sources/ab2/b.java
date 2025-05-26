package ab2;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.ui.grid.videopin.PinVideoGridCell;
import lh0.m4;
import lh0.z0;
import m60.w;
import ni1.d0;
import ni1.t2;
import so.jb;
import so.oa;

/* loaded from: classes2.dex */
public abstract class b extends ConstraintLayout implements af2.c {
    private ye2.o componentManager;
    private boolean injected;

    public ye2.o createComponentManager() {
        return new ye2.o(this);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        PinVideoGridCell pinVideoGridCell = (PinVideoGridCell) this;
        jb jbVar = (jb) ((o) generatedComponent());
        oa oaVar = jbVar.f113483a;
        pinVideoGridCell.pgcViewFactory = oaVar.v2();
        pinVideoGridCell.pinRepViewModelFactory = (t2) oaVar.f113950uc.get();
        pinVideoGridCell.pinModelToVMStateConverterFactory = (d0) oaVar.Gb.get();
        pinVideoGridCell.baseExperimentsHelper = (lh0.o) oaVar.f113769k7.get();
        pinVideoGridCell.videoFeatureLibraryExperiments = new m4((z0) jbVar.f113483a.D0.get());
        pinVideoGridCell.adsLibraryExperiments = oa.g0(oaVar);
        pinVideoGridCell.eventManager = (w) oaVar.f113885r0.get();
        pinVideoGridCell.mp4TrackSelector = (bc2.e) oaVar.F7.get();
        com.pinterest.widget.configuration.k.x2(oaVar.f113638d);
        pinVideoGridCell.videoManagerUtil = ac2.f.f1945a;
        pinVideoGridCell.videoManager = (ac2.m) oaVar.C7.get();
        pinVideoGridCell.carouselUtil = (j80.b) oaVar.O6.get();
        pinVideoGridCell.adFormats = (es.a) oaVar.P6.get();
        pinVideoGridCell.adsCoreDependencies = (ur.a) oaVar.Kb.get();
        pinVideoGridCell.adsAudioOverlayPowerscoreExperimentManager = (kv.a) oaVar.Db.get();
        pinVideoGridCell.organicAudioOverlayPowerscoreExperimentManager = (kv.c) oaVar.f113776ke.get();
        pinVideoGridCell.adsCommonDisplay = (es.h) oaVar.f113735i7.get();
        pinVideoGridCell.adsCommonAnalytics = (vr.a) oaVar.Q8.get();
        pinVideoGridCell.dlAdCloseupPinOverlayVisibility = (hs.e) oaVar.Fb.get();
        pinVideoGridCell.premiereSpotlightHFSlotIndexDebugLogger = (qs.g) oaVar.Qe.get();
        pinVideoGridCell.adsOpenMeasurementManager = (ow.a) oaVar.f113880qc.get();
    }

    @Override // af2.c
    public final ye2.o componentManager() {
        if (this.componentManager == null) {
            this.componentManager = createComponentManager();
        }
        return this.componentManager;
    }
}
