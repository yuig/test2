package qa2;

import android.widget.FrameLayout;
import ni1.t2;
import so.jb;
import so.oa;
import so.y8;

/* loaded from: classes4.dex */
public abstract class i extends FrameLayout implements af2.c {
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
        p0 p0Var = (p0) this;
        jb jbVar = (jb) ((q0) generatedComponent());
        oa oaVar = jbVar.f113483a;
        p0Var.baseGridActionUtils = (jo1.c) oaVar.f113810md.get();
        p0Var.gridActionPinViewComponentBuilder = new y8(oaVar, jbVar.f113484b, jbVar.f113485c);
        p0Var.mvpBinder = (yk1.j) oaVar.Qc.get();
        p0Var.pinGridCellFactory = oaVar.v2();
        p0Var.pinRepViewModelFactory = (t2) oaVar.f113950uc.get();
        p0Var.vmStateConverterFactory = (ni1.d0) oaVar.Gb.get();
    }

    @Override // af2.c
    public final ye2.o componentManager() {
        if (this.componentManager == null) {
            this.componentManager = createComponentManager();
        }
        return this.componentManager;
    }
}
