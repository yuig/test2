package hb2;

import android.widget.LinearLayout;
import com.pinterest.ui.view.VideoViewabilityLinearLayout;
import so.jb;

/* loaded from: classes2.dex */
public abstract class h extends LinearLayout implements af2.c {
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
        ((VideoViewabilityLinearLayout) this).videoViewabilityRecyclerListenerProvider = ((jb) ((v) generatedComponent())).f113494l;
    }

    @Override // af2.c
    public final ye2.o componentManager() {
        if (this.componentManager == null) {
            this.componentManager = createComponentManager();
        }
        return this.componentManager;
    }
}
