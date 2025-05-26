package androidx.appcompat.app;

import java.io.IOException;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f16142a = new ArrayDeque(16);

    public final void a() {
        ArrayDeque arrayDeque = this.f16142a;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + c());
    }

    public final void b(long j13) {
        long c13 = c();
        if (c13 != j13) {
            if (c13 != -1) {
                if (c13 != -2) {
                    return;
                } else {
                    c13 = -2;
                }
            }
            StringBuilder u13 = a.a.u("expected non-string scope or scope ", j13, " but found ");
            u13.append(c13);
            throw new IOException(u13.toString());
        }
    }

    public final long c() {
        ArrayDeque arrayDeque = this.f16142a;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }
}
