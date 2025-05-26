package jp2;

import java.util.concurrent.Executor;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UrlRequest;

/* loaded from: classes2.dex */
public abstract class e extends ExperimentalCronetEngine {
    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final ExperimentalUrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return new z(str, callback, executor, this);
    }
}
