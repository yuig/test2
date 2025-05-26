package pq2;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/* loaded from: classes4.dex */
public final class w0 extends RequestBody {

    /* renamed from: b, reason: collision with root package name */
    public final RequestBody f101093b;

    /* renamed from: c, reason: collision with root package name */
    public final MediaType f101094c;

    public w0(RequestBody requestBody, MediaType mediaType) {
        this.f101093b = requestBody;
        this.f101094c = mediaType;
    }

    @Override // okhttp3.RequestBody
    public final long a() {
        return this.f101093b.a();
    }

    @Override // okhttp3.RequestBody
    /* renamed from: b */
    public final MediaType getF95665d() {
        return this.f101094c;
    }

    @Override // okhttp3.RequestBody
    public final void d(wo2.k kVar) {
        this.f101093b.d(kVar);
    }
}
