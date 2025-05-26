package kp2;

import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import org.chromium.net.ExperimentalCronetEngine;

/* loaded from: classes4.dex */
public final class i implements URLStreamHandlerFactory {

    /* renamed from: a, reason: collision with root package name */
    public final ExperimentalCronetEngine f80619a;

    public i(ExperimentalCronetEngine experimentalCronetEngine) {
        if (experimentalCronetEngine == null) {
            throw new NullPointerException("CronetEngine is null.");
        }
        this.f80619a = experimentalCronetEngine;
    }

    @Override // java.net.URLStreamHandlerFactory
    public final URLStreamHandler createURLStreamHandler(String str) {
        if ("http".equals(str) || "https".equals(str)) {
            return new f(this.f80619a);
        }
        return null;
    }
}
