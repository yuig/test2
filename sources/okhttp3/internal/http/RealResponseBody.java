package okhttp3.internal.http;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import wo2.l;
import wo2.y;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http/RealResponseBody;", "Lokhttp3/ResponseBody;", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RealResponseBody extends ResponseBody {

    /* renamed from: d, reason: collision with root package name */
    public final String f95979d;

    /* renamed from: e, reason: collision with root package name */
    public final long f95980e;

    /* renamed from: f, reason: collision with root package name */
    public final l f95981f;

    public RealResponseBody(String str, long j13, y source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f95979d = str;
        this.f95980e = j13;
        this.f95981f = source;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength, reason: from getter */
    public final long getF95980e() {
        return this.f95980e;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentType */
    public final MediaType getF95751d() {
        String str = this.f95979d;
        if (str == null) {
            return null;
        }
        MediaType.f95651d.getClass();
        return MediaType.Companion.b(str);
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: source, reason: from getter */
    public final l getF95981f() {
        return this.f95981f;
    }
}
