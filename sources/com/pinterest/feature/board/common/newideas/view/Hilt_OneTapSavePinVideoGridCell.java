package com.pinterest.feature.board.common.newideas.view;

import ac2.f;
import android.content.Context;
import ao2.j0;
import bc2.e;
import com.pinterest.ui.grid.videopin.PinVideoGridCell;
import com.pinterest.widget.configuration.k;
import es.a;
import es.h;
import j80.b;
import java.util.List;
import kv.c;
import lh0.m4;
import lh0.o;
import lh0.z0;
import m60.w;
import ni1.t2;
import nx.d0;
import qs.g;
import so.jb;
import so.oa;
import tj0.c0;
import wa2.m;
import yk1.i;

/* loaded from: classes.dex */
public abstract class Hilt_OneTapSavePinVideoGridCell extends PinVideoGridCell {
    private boolean injected;

    public Hilt_OneTapSavePinVideoGridCell(Context context, d0 d0Var, m mVar, j0 j0Var, qa2.j0 j0Var2, ni1.d0 d0Var2, boolean z13, boolean z14) {
        super(context, d0Var, mVar, j0Var, j0Var2, d0Var2, z13, z14);
        inject();
    }

    @Override // com.pinterest.ui.grid.videopin.PinVideoGridCell, y92.g
    public /* bridge */ /* synthetic */ int getAllowedHeightChange(int i13) {
        return super.getAllowedHeightChange(i13);
    }

    @Override // com.pinterest.ui.grid.videopin.PinVideoGridCell, nx.v
    public /* bridge */ /* synthetic */ List getChildImpressionViews() {
        return null;
    }

    @Override // ab2.b
    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        OneTapSavePinVideoGridCell oneTapSavePinVideoGridCell = (OneTapSavePinVideoGridCell) this;
        jb jbVar = (jb) ((c0) generatedComponent());
        oa oaVar = jbVar.f113483a;
        oneTapSavePinVideoGridCell.pgcViewFactory = oaVar.v2();
        oneTapSavePinVideoGridCell.pinRepViewModelFactory = (t2) oaVar.f113950uc.get();
        oneTapSavePinVideoGridCell.pinModelToVMStateConverterFactory = (ni1.d0) oaVar.Gb.get();
        oneTapSavePinVideoGridCell.baseExperimentsHelper = (o) oaVar.f113769k7.get();
        oneTapSavePinVideoGridCell.videoFeatureLibraryExperiments = new m4((z0) jbVar.f113483a.D0.get());
        oneTapSavePinVideoGridCell.adsLibraryExperiments = oa.g0(oaVar);
        oneTapSavePinVideoGridCell.eventManager = (w) oaVar.f113885r0.get();
        oneTapSavePinVideoGridCell.mp4TrackSelector = (e) oaVar.F7.get();
        k.x2(oaVar.f113638d);
        oneTapSavePinVideoGridCell.videoManagerUtil = f.f1945a;
        oneTapSavePinVideoGridCell.videoManager = (ac2.m) oaVar.C7.get();
        oneTapSavePinVideoGridCell.carouselUtil = (b) oaVar.O6.get();
        oneTapSavePinVideoGridCell.adFormats = (a) oaVar.P6.get();
        oneTapSavePinVideoGridCell.adsCoreDependencies = (ur.a) oaVar.Kb.get();
        oneTapSavePinVideoGridCell.adsAudioOverlayPowerscoreExperimentManager = (kv.a) oaVar.Db.get();
        oneTapSavePinVideoGridCell.organicAudioOverlayPowerscoreExperimentManager = (c) oaVar.f113776ke.get();
        oneTapSavePinVideoGridCell.adsCommonDisplay = (h) oaVar.f113735i7.get();
        oneTapSavePinVideoGridCell.adsCommonAnalytics = (vr.a) oaVar.Q8.get();
        oneTapSavePinVideoGridCell.dlAdCloseupPinOverlayVisibility = (hs.e) oaVar.Fb.get();
        oneTapSavePinVideoGridCell.premiereSpotlightHFSlotIndexDebugLogger = (g) oaVar.Qe.get();
        oneTapSavePinVideoGridCell.adsOpenMeasurementManager = (ow.a) oaVar.f113880qc.get();
    }

    @Override // com.pinterest.ui.grid.videopin.PinVideoGridCell, qa2.f0, y92.i
    public /* bridge */ /* synthetic */ void onViewDetached() {
        super.onViewDetached();
    }

    @Override // com.pinterest.ui.grid.videopin.PinVideoGridCell, yk1.n
    public /* bridge */ /* synthetic */ void setLoadState(i iVar) {
    }
}
