package okhttp3;

import kotlin.Metadata;
import wo2.l;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okhttp3/ResponseBody$Companion$asResponseBody$1", "Lokhttp3/ResponseBody;", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ResponseBody$Companion$asResponseBody$1 extends ResponseBody {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MediaType f95751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f95752e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f95753f;

    public ResponseBody$Companion$asResponseBody$1(MediaType mediaType, long j13, l lVar) {
        this.f95751d = mediaType;
        this.f95752e = j13;
        this.f95753f = lVar;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength, reason: from getter */
    public final long getF95752e() {
        return this.f95752e;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentType, reason: from getter */
    public final MediaType getF95751d() {
        return this.f95751d;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: source, reason: from getter */
    public final l getF95753f() {
        return this.f95753f;
    }
}
