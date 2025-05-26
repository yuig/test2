package okhttp3.internal.cache2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import wo2.e0;
import wo2.i0;
import wo2.j;
import wo2.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/cache2/Relay;", "", "Companion", "RelaySource", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class Relay {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/cache2/Relay$Companion;", "", "", "FILE_HEADER_SIZE", "J", "Lwo2/m;", "PREFIX_CLEAN", "Lwo2/m;", "PREFIX_DIRTY", "", "SOURCE_FILE", "I", "SOURCE_UPSTREAM", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/cache2/Relay$RelaySource;", "Lwo2/e0;", "okhttp"}, k = 1, mv = {1, 8, 0})
    public final class RelaySource implements e0 {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // wo2.e0
        public final long read(j sink, long j13) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            throw new IllegalStateException("Check failed.".toString());
        }

        @Override // wo2.e0
        public final i0 timeout() {
            return null;
        }
    }

    static {
        new Companion(0);
        m mVar = m.f130712d;
        f0.h0("OkHttp cache v1\n");
        f0.h0("OkHttp DIRTY :(\n");
    }
}
