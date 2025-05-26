package ads_mobile_sdk;

import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public abstract class bv extends ResponseBody {

    /* renamed from: a, reason: collision with root package name */
    public final ResponseBody f3607a;

    public bv(ResponseBody responseBody) {
        this.f3607a = responseBody;
    }

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3607a.close();
        yu yuVar = (yu) this;
        yuVar.f14407c.f14934b.remove(yuVar.f14406b);
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength */
    public final long getF95980e() {
        return this.f3607a.getF95980e();
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentType */
    public final MediaType getF95751d() {
        return this.f3607a.getF95751d();
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: source */
    public final wo2.l getF95981f() {
        return this.f3607a.getF95981f();
    }
}
