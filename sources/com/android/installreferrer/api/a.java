package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.android.installreferrer.commons.InstallReferrerCommons;
import zg.c;

/* loaded from: classes.dex */
public final class a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final InstallReferrerStateListener f29059a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f29060b;

    public a(b bVar, InstallReferrerStateListener installReferrerStateListener) {
        this.f29060b = bVar;
        if (installReferrerStateListener == null) {
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }
        this.f29059a = installReferrerStateListener;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c aVar;
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
        int i13 = zg.b.f141951a;
        if (iBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            aVar = queryLocalInterface instanceof c ? (c) queryLocalInterface : new zg.a(iBinder);
        }
        b bVar = this.f29060b;
        bVar.f29063c = aVar;
        bVar.f29061a = 2;
        this.f29059a.onInstallReferrerSetupFinished(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
        b bVar = this.f29060b;
        bVar.f29063c = null;
        bVar.f29061a = 0;
        this.f29059a.onInstallReferrerServiceDisconnected();
    }
}
