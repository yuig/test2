package tu1;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes2.dex */
public final class e0 extends UrlRequest.Callback {
    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest request, UrlResponseInfo info2, CronetException error) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(info2, "info");
        Intrinsics.checkNotNullParameter(error, "error");
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest request, UrlResponseInfo info2, ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(info2, "info");
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest request, UrlResponseInfo info2, String newLocationUrl) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(info2, "info");
        Intrinsics.checkNotNullParameter(newLocationUrl, "newLocationUrl");
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest request, UrlResponseInfo info2) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(info2, "info");
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest request, UrlResponseInfo info2) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(info2, "info");
    }
}
