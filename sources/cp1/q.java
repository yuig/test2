package cp1;

import android.os.Bundle;
import androidx.lifecycle.p1;
import kh2.j1;

/* loaded from: classes2.dex */
public abstract class q extends androidx.appcompat.app.n implements af2.c {
    private volatile ye2.b componentManager;
    private final Object componentManagerLock = new Object();
    private boolean injected = false;
    private ye2.j savedStateHandleHolder;

    public q() {
        addOnContextAvailableListener(new androidx.appcompat.app.m(this, 5));
    }

    public ye2.b createComponentManager() {
        return new ye2.b(this);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.activity.o, androidx.lifecycle.k
    public p1 getDefaultViewModelProviderFactory() {
        return j1.b0(this, super.getDefaultViewModelProviderFactory());
    }

    public abstract void inject();

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.o, c5.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof af2.b) {
            ye2.j b13 = componentManager().b();
            this.savedStateHandleHolder = b13;
            if (b13.a()) {
                this.savedStateHandleHolder.f138918a = getDefaultViewModelCreationExtras();
            }
        }
    }

    @Override // androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ye2.j jVar = this.savedStateHandleHolder;
        if (jVar != null) {
            jVar.f138918a = null;
        }
    }

    @Override // af2.c
    public final ye2.b componentManager() {
        if (this.componentManager == null) {
            synchronized (this.componentManagerLock) {
                try {
                    if (this.componentManager == null) {
                        this.componentManager = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.componentManager;
    }
}
