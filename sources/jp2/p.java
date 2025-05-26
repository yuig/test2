package jp2;

import org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;

/* loaded from: classes4.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VersionSafeCallbacks$UrlRequestStatusListener f77374a;

    public p(VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener) {
        this.f77374a = versionSafeCallbacks$UrlRequestStatusListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77374a.onStatus(-1);
    }
}
