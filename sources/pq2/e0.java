package pq2;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class e0 extends ResponseBody {

    /* renamed from: d, reason: collision with root package name */
    public final ResponseBody f101019d;

    /* renamed from: e, reason: collision with root package name */
    public final wo2.y f101020e;

    /* renamed from: f, reason: collision with root package name */
    public IOException f101021f;

    public e0(ResponseBody responseBody) {
        this.f101019d = responseBody;
        this.f101020e = ao2.m0.i(new d0(this, responseBody.getF95981f()));
    }

    public final void a() {
        IOException iOException = this.f101021f;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f101019d.close();
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength */
    public final long getF95980e() {
        return this.f101019d.getF95980e();
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentType */
    public final MediaType getF95751d() {
        return this.f101019d.getF95751d();
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: source */
    public final wo2.l getF95981f() {
        return this.f101020e;
    }
}
