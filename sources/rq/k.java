package rq;

import android.widget.LinearLayout;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import so.jb;
import so.oa;
import so.s8;

/* loaded from: classes3.dex */
public abstract class k extends LinearLayout implements af2.c {
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
        PinCloseupBaseModule pinCloseupBaseModule = (PinCloseupBaseModule) this;
        jb jbVar = (jb) ((h0) generatedComponent());
        oa oaVar = jbVar.f113483a;
        pinCloseupBaseModule.clickThroughHelperFactory = (a11.d) oaVar.f113668ec.get();
        pinCloseupBaseModule.presenterPinalyticsFactory = (uk1.e) oaVar.f113702ga.get();
        s8 s8Var = jbVar.f113485c;
        pinCloseupBaseModule.closeupActionController = s8Var.h5();
        pinCloseupBaseModule.bidiFormatter = a02.e.I1();
        pinCloseupBaseModule.baseCloseupLibraryExperiments = s8Var.k5();
        pinCloseupBaseModule.pinAuxHelper = (nx.b0) oaVar.R8.get();
    }

    @Override // af2.c
    public final ye2.o componentManager() {
        if (this.componentManager == null) {
            this.componentManager = createComponentManager();
        }
        return this.componentManager;
    }
}
