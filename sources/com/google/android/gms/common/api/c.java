package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;
import java.util.Set;

/* loaded from: classes.dex */
public interface c {
    Set b();

    void connect(jh.d dVar);

    void disconnect();

    void disconnect(String str);

    Feature[] getAvailableFeatures();

    String getEndpointPackageName();

    String getLastDisconnectMessage();

    int getMinApkVersion();

    void getRemoteService(jh.j jVar, Set set);

    boolean isConnected();

    boolean isConnecting();

    void onUserSignOut(jh.e eVar);

    boolean requiresGooglePlayServices();

    boolean requiresSignIn();
}
