package ss1;

import android.os.Bundle;
import androidx.appcompat.app.n;
import androidx.lifecycle.p1;
import kh2.j1;
import ye2.j;

/* loaded from: classes4.dex */
public abstract class a extends n implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public j f115137a;

    /* renamed from: b, reason: collision with root package name */
    public volatile ye2.b f115138b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f115139c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f115140d = false;

    public a() {
        addOnContextAvailableListener(new vo.f(this, 14));
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.activity.o, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.b0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.o, c5.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof af2.b) {
            j b13 = componentManager().b();
            this.f115137a = b13;
            if (b13.a()) {
                this.f115137a.f138918a = getDefaultViewModelCreationExtras();
            }
        }
    }

    @Override // androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        j jVar = this.f115137a;
        if (jVar != null) {
            jVar.f138918a = null;
        }
    }

    @Override // af2.c
    public final ye2.b componentManager() {
        if (this.f115138b == null) {
            synchronized (this.f115139c) {
                try {
                    if (this.f115138b == null) {
                        this.f115138b = new ye2.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f115138b;
    }
}
