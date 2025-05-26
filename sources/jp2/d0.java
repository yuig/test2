package jp2;

import java.nio.ByteBuffer;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes4.dex */
public final class d0 extends BidirectionalStream.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final BidirectionalStream.Callback f77322a;

    public d0(BidirectionalStream.Callback callback) {
        this.f77322a = callback;
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onCanceled(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        this.f77322a.onCanceled(bidirectionalStream, urlResponseInfo);
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onFailed(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.f77322a.onFailed(bidirectionalStream, urlResponseInfo, cronetException);
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onReadCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z13) {
        this.f77322a.onReadCompleted(bidirectionalStream, urlResponseInfo, byteBuffer, z13);
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onResponseHeadersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        this.f77322a.onResponseHeadersReceived(bidirectionalStream, urlResponseInfo);
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onResponseTrailersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, UrlResponseInfo.HeaderBlock headerBlock) {
        this.f77322a.onResponseTrailersReceived(bidirectionalStream, urlResponseInfo, headerBlock);
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onStreamReady(BidirectionalStream bidirectionalStream) {
        this.f77322a.onStreamReady(bidirectionalStream);
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onSucceeded(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        this.f77322a.onSucceeded(bidirectionalStream, urlResponseInfo);
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onWriteCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z13) {
        this.f77322a.onWriteCompleted(bidirectionalStream, urlResponseInfo, byteBuffer, z13);
    }
}
