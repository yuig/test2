package okhttp3.internal.ws;

import ao2.m0;
import java.io.Closeable;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import wo2.j;
import wo2.t;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/ws/MessageInflater;", "Ljava/io/Closeable;", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class MessageInflater implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f96262a;

    /* renamed from: b, reason: collision with root package name */
    public final j f96263b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f96264c;

    /* renamed from: d, reason: collision with root package name */
    public final t f96265d;

    public MessageInflater(boolean z13) {
        this.f96262a = z13;
        j source = new j();
        this.f96263b = source;
        Inflater inflater = new Inflater(true);
        this.f96264c = inflater;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f96265d = new t(m0.i(source), inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f96265d.close();
    }
}
