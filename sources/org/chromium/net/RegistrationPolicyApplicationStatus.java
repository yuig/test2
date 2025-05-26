package org.chromium.net;

import org.chromium.base.ApplicationStatus;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* loaded from: classes4.dex */
public class RegistrationPolicyApplicationStatus extends NetworkChangeNotifierAutoDetect.RegistrationPolicy implements dp2.a {
    private boolean mDestroyed;

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.RegistrationPolicy
    public void destroy() {
        if (this.mDestroyed) {
            return;
        }
        dp2.g gVar = ApplicationStatus.f97282d;
        if (gVar != null) {
            gVar.d(this);
        }
        this.mDestroyed = true;
    }

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.RegistrationPolicy
    public void init(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        super.init(networkChangeNotifierAutoDetect);
        if (ApplicationStatus.f97282d == null) {
            ApplicationStatus.f97282d = new dp2.g();
        }
        ApplicationStatus.f97282d.b(this);
        onApplicationStateChange(0);
    }

    public void onApplicationStateChange(int i13) {
        if (ApplicationStatus.hasVisibleActivities()) {
            register();
        } else {
            unregister();
        }
    }
}
