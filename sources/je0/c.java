package je0;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import java.util.HashSet;
import nm.u;
import tb0.g;
import tb0.h;

/* loaded from: classes.dex */
public final class c implements InstallReferrerStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f75838a;

    public c(d dVar) {
        this.f75838a = dVar;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
        d dVar = this.f75838a;
        dVar.b(null, "play_store_connection_ended");
        InstallReferrerClient installReferrerClient = dVar.f75841c;
        if (installReferrerClient != null) {
            installReferrerClient.endConnection();
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i13) {
        String installReferrer;
        d dVar = this.f75838a;
        ((lb0.b) dVar.f75839a).n("PREF_INSTALL_REFERRER_LATEST", new u().toString());
        try {
            if (i13 == 0) {
                ReferrerDetails referrerDetails = null;
                dVar.b(null, "play_store_connection_established");
                try {
                    InstallReferrerClient installReferrerClient = dVar.f75841c;
                    if (installReferrerClient != null) {
                        referrerDetails = installReferrerClient.getInstallReferrer();
                    }
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
                if (referrerDetails != null && (installReferrer = referrerDetails.getInstallReferrer()) != null) {
                    String a13 = d.a(dVar, installReferrer);
                    ((lb0.b) dVar.f75839a).n("PREF_GOOGLE_PLAY_INSTALL_REFERRER_DATA", a13);
                    ((lb0.b) dVar.f75839a).n("PREF_INSTALL_REFERRER_LATEST", a13);
                }
            } else {
                dVar.b(Integer.valueOf(i13), "play_store_connection_failure");
            }
            InstallReferrerClient installReferrerClient2 = dVar.f75841c;
            if (installReferrerClient2 != null) {
                installReferrerClient2.endConnection();
            }
        } catch (Exception e14) {
            HashSet hashSet = h.f117076w;
            g.f117075a.p(e14);
        }
    }
}
