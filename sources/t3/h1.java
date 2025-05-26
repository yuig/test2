package t3;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* loaded from: classes.dex */
public final class h1 implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x3.e f116032a;

    public h1(x3.e eVar) {
        this.f116032a = eVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f116032a.a();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f116032a.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i13) {
        this.f116032a.a();
    }
}
