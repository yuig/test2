package ye2;

import android.app.Application;
import android.app.Service;
import df.j1;
import so.d9;
import so.oa;

/* loaded from: classes2.dex */
public final class l implements af2.b {

    /* renamed from: a, reason: collision with root package name */
    public final Service f138919a;

    /* renamed from: b, reason: collision with root package name */
    public d9 f138920b;

    public l(Service service) {
        this.f138919a = service;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f138920b == null) {
            Application application = this.f138919a.getApplication();
            d7.b.q(application instanceof af2.b, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
            this.f138920b = new d9(((oa) ((k) j1.b0(k.class, application))).f113762k0);
        }
        return this.f138920b;
    }
}
