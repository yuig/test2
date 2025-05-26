package com.facebook.login;

import android.content.ComponentName;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b extends s.q {

    /* renamed from: g, reason: collision with root package name */
    public static s.k f30003g;

    /* renamed from: h, reason: collision with root package name */
    public static s.r f30004h;

    /* renamed from: i, reason: collision with root package name */
    public static final ReentrantLock f30005i = new ReentrantLock();

    @Override // s.q
    public final void onCustomTabsServiceConnected(ComponentName name, s.k newClient) {
        s.k kVar;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(newClient, "newClient");
        newClient.e();
        f30003g = newClient;
        ReentrantLock reentrantLock = f30005i;
        reentrantLock.lock();
        if (f30004h == null && (kVar = f30003g) != null) {
            f30004h = kVar.d(null);
        }
        reentrantLock.unlock();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
    }
}
