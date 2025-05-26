package org.chromium.net.impl;

import org.chromium.net.UrlRequest;

/* loaded from: classes4.dex */
public final class VersionSafeCallbacks$UrlRequestStatusListener extends UrlRequest.StatusListener {

    /* renamed from: a, reason: collision with root package name */
    public final UrlRequest.StatusListener f97441a;

    public VersionSafeCallbacks$UrlRequestStatusListener(UrlRequest.StatusListener statusListener) {
        this.f97441a = statusListener;
    }

    @Override // org.chromium.net.UrlRequest.StatusListener
    public final void onStatus(int i13) {
        this.f97441a.onStatus(i13);
    }
}
