package rq;

import android.content.Context;
import com.pinterest.activity.pin.view.modules.PinCloseupVideoModule;
import so.jb;
import so.oa;
import so.s8;

/* loaded from: classes3.dex */
public abstract class m extends r1 {
    private boolean injected;

    public m(Context context) {
        super(context);
        inject();
    }

    @Override // rq.k
    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        PinCloseupVideoModule pinCloseupVideoModule = (PinCloseupVideoModule) this;
        jb jbVar = (jb) ((u4) generatedComponent());
        oa oaVar = jbVar.f113483a;
        pinCloseupVideoModule.clickThroughHelperFactory = (a11.d) oaVar.f113668ec.get();
        pinCloseupVideoModule.presenterPinalyticsFactory = (uk1.e) oaVar.f113702ga.get();
        s8 s8Var = jbVar.f113485c;
        pinCloseupVideoModule.closeupActionController = s8Var.h5();
        pinCloseupVideoModule.bidiFormatter = a02.e.I1();
        pinCloseupVideoModule.baseCloseupLibraryExperiments = s8Var.k5();
        pinCloseupVideoModule.pinAuxHelper = (nx.b0) oaVar.R8.get();
        pinCloseupVideoModule.pinOverflowMenuModalProvider = oaVar.w2();
        pinCloseupVideoModule.pinRepository = (x02.i2) oaVar.F3.get();
        pinCloseupVideoModule.attributionReporting = (xr.a) oaVar.f113756jc.get();
        pinCloseupVideoModule.mp4TrackSelector = (bc2.e) oaVar.F7.get();
        pinCloseupVideoModule.moduleViewabilityHelper = s8Var.a6();
        pinCloseupVideoModule.adsCoreDependencies = (ur.a) oaVar.Kb.get();
        pinCloseupVideoModule.adsCommonDisplay = (es.h) oaVar.f113735i7.get();
        pinCloseupVideoModule.adFormats = (es.a) oaVar.P6.get();
    }
}
