package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wo2.c0;
import wo2.j;
import wo2.o;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/cache/FaultHidingSink;", "Lwo2/o;", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public class FaultHidingSink extends o {

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f95838b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f95839c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaultHidingSink(c0 delegate, Function1 onException) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(onException, "onException");
        this.f95838b = onException;
    }

    @Override // wo2.o, wo2.c0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f95839c) {
            return;
        }
        try {
            super.close();
        } catch (IOException e13) {
            this.f95839c = true;
            this.f95838b.invoke(e13);
        }
    }

    @Override // wo2.o, wo2.c0, java.io.Flushable
    public final void flush() {
        if (this.f95839c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e13) {
            this.f95839c = true;
            this.f95838b.invoke(e13);
        }
    }

    @Override // wo2.o, wo2.c0
    public final void write(j source, long j13) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f95839c) {
            source.skip(j13);
            return;
        }
        try {
            super.write(source, j13);
        } catch (IOException e13) {
            this.f95839c = true;
            this.f95838b.invoke(e13);
        }
    }
}
