package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* loaded from: classes2.dex */
public final class x extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!"android.security.action.TRUST_STORE_CHANGED".equals(intent.getAction())) {
            if ("android.security.action.KEYCHAIN_CHANGED".equals(intent.getAction())) {
                y.P().V();
                return;
            } else {
                if (!"android.security.action.KEY_ACCESS_CHANGED".equals(intent.getAction()) || intent.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false)) {
                    return;
                }
                y.P().V();
                return;
            }
        }
        try {
            X509Util.reloadDefaultTrustManager();
        } catch (KeyStoreException e13) {
            Log.e("cr_X509Util", "Unable to reload the default TrustManager", e13);
        } catch (NoSuchAlgorithmException e14) {
            Log.e("cr_X509Util", "Unable to reload the default TrustManager", e14);
        } catch (CertificateException e15) {
            Log.e("cr_X509Util", "Unable to reload the default TrustManager", e15);
        }
    }
}
