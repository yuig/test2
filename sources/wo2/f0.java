package wo2;

import java.io.InterruptedIOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f0 extends p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f130688b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(l lVar, g0 g0Var) {
        super(lVar);
        this.f130688b = g0Var;
    }

    @Override // wo2.p, wo2.e0
    public final long read(j sink, long j13) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            return super.read(sink, this.f130688b.c(j13));
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}
