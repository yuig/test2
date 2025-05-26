package ti1;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.ui.grid.LegoPinGridCell;
import ey.g3;
import m60.f0;
import nx.b0;
import so.jb;
import so.oa;
import so.s8;

/* loaded from: classes2.dex */
public abstract class b extends LegoPinGridCell implements af2.c {
    private ye2.o componentManager;
    private boolean injected;

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inject();
    }

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
        SbaPinRep sbaPinRep = (SbaPinRep) this;
        jb jbVar = (jb) ((a0) generatedComponent());
        oa oaVar = jbVar.f113483a;
        sbaPinRep.clock = (pb0.a) oaVar.f113834o1.get();
        sbaPinRep.deviceInfoProvider = (hf0.c) oaVar.f113717h7.get();
        sbaPinRep.scrollToTopEventManager = (aa2.a) oaVar.f113686fc.get();
        sbaPinRep.eventManager = (m60.w) oaVar.f113885r0.get();
        sbaPinRep.perfLogApplicationUtils = (g3) oaVar.f113683f9.get();
        sbaPinRep.experiments = oa.x1(oaVar);
        sbaPinRep.prefetchManager = (ip1.b) oaVar.H7.get();
        sbaPinRep.clickThroughHelperFactory = (a11.d) oaVar.f113668ec.get();
        s8 s8Var = jbVar.f113485c;
        sbaPinRep.pinTrafficSourceMapper = (jq.c) s8Var.f114432p.get();
        sbaPinRep.baseGridActionUtils = (jo1.c) oaVar.f113810md.get();
        sbaPinRep.viewabilityCalculator = com.pinterest.widget.configuration.k.y2(oaVar.f113638d);
        sbaPinRep.deepLinkHelper = (ni1.d) s8Var.f114551x.get();
        sbaPinRep.impressionDebugUtils = new f0();
        sbaPinRep.adFormats = (es.a) oaVar.P6.get();
        sbaPinRep.adsHandshakeQuarantine = (bs.b) oaVar.f113650dc.get();
        sbaPinRep.pinAuxHelper = (b0) oaVar.R8.get();
        sbaPinRep.adsCommonDisplay = (es.h) oaVar.f113735i7.get();
        sbaPinRep.adsCommonAnalytics = (vr.a) oaVar.Q8.get();
        sbaPinRep.imageCache = (hs1.q) oaVar.f113875q7.get();
        sbaPinRep.adsOpenMeasurementManager = (ow.a) oaVar.f113880qc.get();
    }

    @Override // af2.c
    public final ye2.o componentManager() {
        if (this.componentManager == null) {
            this.componentManager = createComponentManager();
        }
        return this.componentManager;
    }

    public b(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        inject();
    }
}
