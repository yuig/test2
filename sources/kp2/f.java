package kp2;

import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import org.chromium.net.ExperimentalCronetEngine;

/* loaded from: classes4.dex */
public final class f extends URLStreamHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ExperimentalCronetEngine f80611a;

    public f(ExperimentalCronetEngine experimentalCronetEngine) {
        this.f80611a = experimentalCronetEngine;
    }

    @Override // java.net.URLStreamHandler
    public final URLConnection openConnection(URL url) {
        return this.f80611a.openConnection(url);
    }

    @Override // java.net.URLStreamHandler
    public final URLConnection openConnection(URL url, Proxy proxy) {
        return this.f80611a.openConnection(url, proxy);
    }
}
