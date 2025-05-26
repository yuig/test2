package ac2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.CronetEngine;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final CronetEngine f1954a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f1955b;

    public g(CronetEngine cronetEngine, ExecutorService executor) {
        Intrinsics.checkNotNullParameter(cronetEngine, "cronetEngine");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f1954a = cronetEngine;
        this.f1955b = executor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f1954a, gVar.f1954a) && Intrinsics.d(this.f1955b, gVar.f1955b);
    }

    public final int hashCode() {
        return this.f1955b.hashCode() + (this.f1954a.hashCode() * 31);
    }

    public final String toString() {
        return "EngineData(cronetEngine=" + this.f1954a + ", executor=" + this.f1955b + ")";
    }
}
