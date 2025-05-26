package pg2;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends i {

    /* renamed from: a */
    public final int f100121a;

    /* renamed from: b */
    public final Map f100122b;

    public c(int i13, Map map) {
        this.f100121a = i13;
        this.f100122b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f100121a == cVar.f100121a && Intrinsics.d(this.f100122b, cVar.f100122b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f100121a) * 31;
        Map map = this.f100122b;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "Failure(code=" + this.f100121a + ", headers=" + this.f100122b + ')';
    }
}
