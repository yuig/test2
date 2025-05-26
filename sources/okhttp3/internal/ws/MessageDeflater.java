package okhttp3.internal.ws;

import ao2.m0;
import java.io.Closeable;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import wo2.j;
import wo2.n;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class MessageDeflater implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f96257a;

    /* renamed from: b, reason: collision with root package name */
    public final j f96258b;

    /* renamed from: c, reason: collision with root package name */
    public final Deflater f96259c;

    /* renamed from: d, reason: collision with root package name */
    public final n f96260d;

    public MessageDeflater(boolean z13) {
        this.f96257a = z13;
        j sink = new j();
        this.f96258b = sink;
        Deflater deflater = new Deflater(-1, true);
        this.f96259c = deflater;
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        this.f96260d = new n(m0.h(sink), deflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f96260d.close();
    }
}
