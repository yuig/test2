package pq2;

import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class f0 extends ResponseBody {

    /* renamed from: d, reason: collision with root package name */
    public final MediaType f101023d;

    /* renamed from: e, reason: collision with root package name */
    public final long f101024e;

    public f0(MediaType mediaType, long j13) {
        this.f101023d = mediaType;
        this.f101024e = j13;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength */
    public final long getF95752e() {
        return this.f101024e;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentType */
    public final MediaType getF95751d() {
        return this.f101023d;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: source */
    public final wo2.l getF95753f() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
