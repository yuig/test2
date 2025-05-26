package pd;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final de.i f99763a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f99764b;

    public u(de.i iVar, Executor executor) {
        this.f99763a = iVar;
        this.f99764b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return this.f99763a.equals(((u) obj).f99763a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f99763a.hashCode();
    }
}
