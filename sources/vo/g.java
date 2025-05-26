package vo;

import android.os.Bundle;
import androidx.lifecycle.p1;
import com.pinterest.activity.ExperimentsReloaderActivity;
import com.pinterest.activity.PinterestActivity;
import com.pinterest.componentBrowser.ComponentBrowserActivity;
import kh2.j1;
import lh0.g1;
import lh0.n1;
import so.oa;
import so.s8;

/* loaded from: classes.dex */
public abstract class g extends androidx.appcompat.app.n implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126360a;

    /* renamed from: b, reason: collision with root package name */
    public ye2.j f126361b;

    /* renamed from: c, reason: collision with root package name */
    public volatile ye2.b f126362c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f126363d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f126364e;

    public g(int i13) {
        this.f126360a = i13;
        int i14 = 1;
        int i15 = 0;
        if (i13 == 1) {
            this.f126363d = new Object();
            this.f126364e = false;
            addOnContextAvailableListener(new androidx.appcompat.app.m(this, i14));
        } else if (i13 != 2) {
            this.f126363d = new Object();
            this.f126364e = false;
            addOnContextAvailableListener(new f(this, i15));
        } else {
            this.f126363d = new Object();
            this.f126364e = false;
            addOnContextAvailableListener(new f(this, 10));
        }
    }

    @Override // af2.c
    public final /* bridge */ /* synthetic */ af2.b componentManager() {
        switch (this.f126360a) {
        }
        return componentManager();
    }

    public final ye2.b createComponentManager() {
        switch (this.f126360a) {
        }
        return new ye2.b(this);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        switch (this.f126360a) {
        }
        return componentManager().generatedComponent();
    }

    @Override // androidx.activity.o, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        switch (this.f126360a) {
        }
        return j1.b0(this, super.getDefaultViewModelProviderFactory());
    }

    public final void inject() {
        switch (this.f126360a) {
            case 0:
                if (!this.f126364e) {
                    this.f126364e = true;
                    ExperimentsReloaderActivity experimentsReloaderActivity = (ExperimentsReloaderActivity) this;
                    oa oaVar = ((s8) ((e) generatedComponent())).f114255d;
                    experimentsReloaderActivity.f34801f = (g1) oaVar.D0.get();
                    experimentsReloaderActivity.f34802g = (m60.w) oaVar.f113885r0.get();
                    experimentsReloaderActivity.f34803h = (vy.m) oaVar.M1.get();
                    break;
                }
                break;
            case 1:
                if (!this.f126364e) {
                    this.f126364e = true;
                    PinterestActivity pinterestActivity = (PinterestActivity) this;
                    s8 s8Var = (s8) ((s) generatedComponent());
                    oa oaVar2 = s8Var.f114255d;
                    pinterestActivity.f34813f = (n1) oaVar2.E0.get();
                    pinterestActivity.f34814g = bf2.b.a(oaVar2.f113961v5);
                    pinterestActivity.f34815h = (m60.w) oaVar2.f113885r0.get();
                    pinterestActivity.f34816i = (g1) oaVar2.D0.get();
                    pinterestActivity.f34817j = oaVar2.s2();
                    pinterestActivity.f34818k = bf2.b.a(s8Var.f114299g);
                    pinterestActivity.f34819l = (dy.a) oaVar2.f113943u5.get();
                    pinterestActivity.f34820m = bf2.b.a(oaVar2.Tc);
                    pinterestActivity.f34821n = bf2.b.a(oaVar2.M1);
                    pinterestActivity.f34822o = (dy.d) oaVar2.f113925t5.get();
                    pinterestActivity.f34823p = bf2.b.a(s8Var.f114314h);
                    pinterestActivity.f34824q = bf2.b.a(s8Var.f114329i);
                    pinterestActivity.f34825r = (b60.b) oaVar2.f113850p0.get();
                    pinterestActivity.f34826s = (rg0.s) oaVar2.Q5.get();
                    pinterestActivity.f34827t = bf2.b.a(oaVar2.C1);
                    pinterestActivity.f34828u = bf2.b.a(oaVar2.O0);
                    pinterestActivity.f34829v = bf2.b.a(oaVar2.f113622c1);
                    pinterestActivity.f34830w = new r(oaVar2.e3(), 0);
                    pinterestActivity.f34831x = bf2.b.a(oaVar2.Y9);
                    pinterestActivity.f34832y = bf2.b.a(oaVar2.D6);
                    pinterestActivity.f34833z = bf2.b.a(oaVar2.X8);
                    break;
                }
                break;
            default:
                if (!this.f126364e) {
                    this.f126364e = true;
                    ComponentBrowserActivity componentBrowserActivity = (ComponentBrowserActivity) this;
                    oa oaVar3 = ((s8) ((oc0.g) generatedComponent())).f114255d;
                    componentBrowserActivity.f44772f = (oc0.i) oaVar3.Of.get();
                    componentBrowserActivity.f44773g = new oc0.k(oaVar3.e3());
                    break;
                }
                break;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.o, c5.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        switch (this.f126360a) {
            case 0:
                super.onCreate(bundle);
                if (getApplication() instanceof af2.b) {
                    ye2.j b13 = componentManager().b();
                    this.f126361b = b13;
                    if (b13.a()) {
                        this.f126361b.f138918a = getDefaultViewModelCreationExtras();
                        break;
                    }
                }
                break;
            case 1:
                super.onCreate(bundle);
                if (getApplication() instanceof af2.b) {
                    ye2.j b14 = componentManager().b();
                    this.f126361b = b14;
                    if (b14.a()) {
                        this.f126361b.f138918a = getDefaultViewModelCreationExtras();
                        break;
                    }
                }
                break;
            default:
                super.onCreate(bundle);
                if (getApplication() instanceof af2.b) {
                    ye2.j b15 = componentManager().b();
                    this.f126361b = b15;
                    if (b15.a()) {
                        this.f126361b.f138918a = getDefaultViewModelCreationExtras();
                        break;
                    }
                }
                break;
        }
    }

    @Override // androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        switch (this.f126360a) {
            case 0:
                super.onDestroy();
                ye2.j jVar = this.f126361b;
                if (jVar != null) {
                    jVar.f138918a = null;
                    break;
                }
                break;
            case 1:
                super.onDestroy();
                ye2.j jVar2 = this.f126361b;
                if (jVar2 != null) {
                    jVar2.f138918a = null;
                    break;
                }
                break;
            default:
                super.onDestroy();
                ye2.j jVar3 = this.f126361b;
                if (jVar3 != null) {
                    jVar3.f138918a = null;
                    break;
                }
                break;
        }
    }

    @Override // af2.c
    public final ye2.b componentManager() {
        switch (this.f126360a) {
            case 0:
                if (this.f126362c == null) {
                    synchronized (this.f126363d) {
                        try {
                            if (this.f126362c == null) {
                                this.f126362c = createComponentManager();
                            }
                        } finally {
                        }
                    }
                }
                return this.f126362c;
            case 1:
                if (this.f126362c == null) {
                    synchronized (this.f126363d) {
                        try {
                            if (this.f126362c == null) {
                                this.f126362c = createComponentManager();
                            }
                        } finally {
                        }
                    }
                }
                return this.f126362c;
            default:
                if (this.f126362c == null) {
                    synchronized (this.f126363d) {
                        try {
                            if (this.f126362c == null) {
                                this.f126362c = createComponentManager();
                            }
                        } finally {
                        }
                    }
                }
                return this.f126362c;
        }
    }
}
