package ed;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* loaded from: classes.dex */
public final class a extends RequestBody {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qc.e f58461b;

    public a(qc.e eVar) {
        this.f58461b = eVar;
    }

    @Override // okhttp3.RequestBody
    public final long a() {
        return this.f58461b.a();
    }

    @Override // okhttp3.RequestBody
    /* renamed from: b */
    public final MediaType getF95665d() {
        MediaType.Companion companion = MediaType.f95651d;
        String contentType = this.f58461b.getContentType();
        companion.getClass();
        return MediaType.Companion.a(contentType);
    }

    @Override // okhttp3.RequestBody
    public final boolean c() {
        return this.f58461b instanceof qc.j;
    }

    @Override // okhttp3.RequestBody
    public final void d(wo2.k sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f58461b.b(sink);
    }
}
