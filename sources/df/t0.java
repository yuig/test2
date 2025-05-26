package df;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class t0 implements InstallReferrerStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InstallReferrerClient f54843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g4.u f54844b;

    public t0(InstallReferrerClient installReferrerClient, g4.u uVar) {
        this.f54843a = installReferrerClient;
        this.f54844b = uVar;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i13) {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            if (i13 != 0) {
                if (i13 != 2) {
                    return;
                }
                le.v.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
                return;
            }
            try {
                ReferrerDetails installReferrer = this.f54843a.getInstallReferrer();
                Intrinsics.checkNotNullExpressionValue(installReferrer, "{\n                      referrerClient.installReferrer\n                    }");
                String installReferrer2 = installReferrer.getInstallReferrer();
                if (installReferrer2 != null) {
                    if (!StringsKt.E(installReferrer2, "fb", false)) {
                        if (StringsKt.E(installReferrer2, "facebook", false)) {
                        }
                    }
                    this.f54844b.getClass();
                    wc.j jVar = me.m.f86996c;
                    le.v.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("install_referrer", installReferrer2).apply();
                }
                le.v.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
            } catch (RemoteException unused) {
            }
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }
}
