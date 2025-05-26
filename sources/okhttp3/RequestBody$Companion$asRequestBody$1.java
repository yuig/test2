package okhttp3;

import dl2.b;
import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import wo2.d;
import wo2.i0;
import wo2.k;
import wo2.u;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okhttp3/RequestBody$Companion$asRequestBody$1", "Lokhttp3/RequestBody;", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class RequestBody$Companion$asRequestBody$1 extends RequestBody {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaType f95712b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f95713c;

    public RequestBody$Companion$asRequestBody$1(File file, MediaType mediaType) {
        this.f95712b = mediaType;
        this.f95713c = file;
    }

    @Override // okhttp3.RequestBody
    public final long a() {
        return this.f95713c.length();
    }

    @Override // okhttp3.RequestBody
    /* renamed from: b, reason: from getter */
    public final MediaType getF95712b() {
        return this.f95712b;
    }

    @Override // okhttp3.RequestBody
    public final void d(k sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Logger logger = u.f130736a;
        File file = this.f95713c;
        Intrinsics.checkNotNullParameter(file, "<this>");
        d dVar = new d(new FileInputStream(file), i0.f130705e);
        try {
            sink.i2(dVar);
            b.J(dVar, null);
        } finally {
        }
    }
}
