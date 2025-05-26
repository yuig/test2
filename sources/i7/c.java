package i7;

import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes.dex */
public final class c extends UrlRequest.Callback {

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f71640j = false;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d f71641k;

    public c(d dVar) {
        this.f71641k = dVar;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final synchronized void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        try {
            if (this.f71640j) {
                return;
            }
            if ((cronetException instanceof NetworkException) && ((NetworkException) cronetException).getErrorCode() == 1) {
                this.f71641k.A = new UnknownHostException();
            } else {
                this.f71641k.A = cronetException;
            }
            this.f71641k.f71652o.h();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final synchronized void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        if (this.f71640j) {
            return;
        }
        this.f71641k.f71652o.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef A[Catch: all -> 0x004b, TryCatch #0 {, blocks: (B:4:0x0003, B:9:0x0009, B:15:0x0030, B:18:0x004e, B:20:0x0054, B:21:0x0063, B:23:0x006a, B:29:0x0077, B:31:0x007b, B:34:0x0080, B:36:0x008e, B:39:0x0095, B:41:0x009f, B:43:0x00a5, B:47:0x00ac, B:49:0x00b0, B:50:0x00e9, B:52:0x00ef, B:53:0x0108, B:55:0x010e, B:56:0x0114, B:58:0x0118, B:60:0x011e, B:61:0x0123, B:66:0x012d, B:68:0x00c3), top: B:3:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010e A[Catch: all -> 0x004b, TryCatch #0 {, blocks: (B:4:0x0003, B:9:0x0009, B:15:0x0030, B:18:0x004e, B:20:0x0054, B:21:0x0063, B:23:0x006a, B:29:0x0077, B:31:0x007b, B:34:0x0080, B:36:0x008e, B:39:0x0095, B:41:0x009f, B:43:0x00a5, B:47:0x00ac, B:49:0x00b0, B:50:0x00e9, B:52:0x00ef, B:53:0x0108, B:55:0x010e, B:56:0x0114, B:58:0x0118, B:60:0x011e, B:61:0x0123, B:66:0x012d, B:68:0x00c3), top: B:3:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0118 A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:9:0x0009, B:15:0x0030, B:18:0x004e, B:20:0x0054, B:21:0x0063, B:23:0x006a, B:29:0x0077, B:31:0x007b, B:34:0x0080, B:36:0x008e, B:39:0x0095, B:41:0x009f, B:43:0x00a5, B:47:0x00ac, B:49:0x00b0, B:50:0x00e9, B:52:0x00ef, B:53:0x0108, B:55:0x010e, B:56:0x0114, B:58:0x0118, B:60:0x011e, B:61:0x0123, B:66:0x012d, B:68:0x00c3), top: B:3:0x0003, inners: #1 }] */
    @Override // org.chromium.net.UrlRequest.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void onRedirectReceived(org.chromium.net.UrlRequest r23, org.chromium.net.UrlResponseInfo r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.c.onRedirectReceived(org.chromium.net.UrlRequest, org.chromium.net.UrlResponseInfo, java.lang.String):void");
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final synchronized void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (this.f71640j) {
            return;
        }
        d dVar = this.f71641k;
        dVar.f71663z = urlResponseInfo;
        dVar.f71652o.h();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final synchronized void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (this.f71640j) {
            return;
        }
        d dVar = this.f71641k;
        dVar.B = true;
        dVar.f71652o.h();
    }
}
