package okhttp3;

import a.a;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ln2.k;
import m60.f0;
import wo2.e0;
import wo2.i0;
import wo2.j;
import wo2.m;
import wo2.v;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", "Companion", "Part", "PartSource", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class MultipartReader implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f95673a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/MultipartReader$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Part implements Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/MultipartReader$PartSource;", "Lwo2/e0;", "okhttp"}, k = 1, mv = {1, 8, 0})
    public final class PartSource implements e0 {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // wo2.e0
        public final long read(j sink, long j13) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j13 >= 0) {
                throw null;
            }
            throw new IllegalArgumentException(a.g("byteCount < 0: ", j13).toString());
        }

        @Override // wo2.e0
        public final i0 timeout() {
            return null;
        }
    }

    static {
        new Companion(0);
        int i13 = v.f130737d;
        m mVar = m.f130712d;
        k.j(f0.h0("\r\n"), f0.h0("--"), f0.h0(" "), f0.h0("\t"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f95673a) {
            return;
        }
        this.f95673a = true;
        throw null;
    }
}
