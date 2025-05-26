package lb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w implements u {

    /* renamed from: a, reason: collision with root package name */
    public final u f82676a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f82677b;

    public w(v delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f82676a = delegate;
        this.f82677b = new Object();
    }

    @Override // lb.u
    public final boolean a(tb.j id3) {
        boolean a13;
        Intrinsics.checkNotNullParameter(id3, "id");
        synchronized (this.f82677b) {
            a13 = this.f82676a.a(id3);
        }
        return a13;
    }

    @Override // lb.u
    public final t b(tb.j id3) {
        t b13;
        Intrinsics.checkNotNullParameter(id3, "id");
        synchronized (this.f82677b) {
            b13 = this.f82676a.b(id3);
        }
        return b13;
    }

    @Override // lb.u
    public final t d(tb.j id3) {
        t d2;
        Intrinsics.checkNotNullParameter(id3, "id");
        synchronized (this.f82677b) {
            d2 = this.f82676a.d(id3);
        }
        return d2;
    }

    @Override // lb.u
    public final List remove(String workSpecId) {
        List remove;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.f82677b) {
            remove = this.f82676a.remove(workSpecId);
        }
        return remove;
    }
}
