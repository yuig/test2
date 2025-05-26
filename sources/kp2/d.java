package kp2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes4.dex */
public final class d extends UrlRequest.Callback {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f80594j;

    public d(e eVar) {
        this.f80594j = eVar;
    }

    public final void a(IOException iOException) {
        e eVar = this.f80594j;
        eVar.f80606l = iOException;
        g gVar = eVar.f80603i;
        if (gVar != null) {
            gVar.f80615d = iOException;
            gVar.f80613b = true;
            gVar.f80614c = null;
        }
        h hVar = eVar.f80604j;
        if (hVar != null) {
            hVar.f80616a = iOException;
            hVar.f80618c = true;
        }
        eVar.f80608n = true;
        eVar.f80596b.f80621b = false;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f80594j.f80605k = urlResponseInfo;
        a(new IOException("disconnect() called"));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        if (cronetException == null) {
            throw new IllegalStateException("Exception cannot be null in onFailed.");
        }
        this.f80594j.f80605k = urlResponseInfo;
        a(cronetException);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        e eVar = this.f80594j;
        eVar.f80605k = urlResponseInfo;
        eVar.f80596b.f80621b = false;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        URL url;
        boolean z13;
        boolean z14;
        e eVar = this.f80594j;
        eVar.f80607m = true;
        try {
            URL url2 = new URL(str);
            String protocol = url2.getProtocol();
            url = ((HttpURLConnection) eVar).url;
            boolean equals = protocol.equals(url.getProtocol());
            z13 = ((HttpURLConnection) eVar).instanceFollowRedirects;
            if (z13) {
                ((HttpURLConnection) eVar).url = url2;
            }
            z14 = ((HttpURLConnection) eVar).instanceFollowRedirects;
            if (z14 && equals) {
                eVar.f80597c.followRedirect();
                return;
            }
        } catch (MalformedURLException unused) {
        }
        eVar.f80605k = urlResponseInfo;
        eVar.f80597c.cancel();
        a(null);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        e eVar = this.f80594j;
        eVar.f80605k = urlResponseInfo;
        eVar.f80608n = true;
        eVar.f80596b.f80621b = false;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f80594j.f80605k = urlResponseInfo;
        a(null);
    }
}
