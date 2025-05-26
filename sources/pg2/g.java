package pg2;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g extends i {

    /* renamed from: a, reason: collision with root package name */
    public final String f100127a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f100128b;

    public g(String str, Map map) {
        this.f100127a = str;
        this.f100128b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f100127a, gVar.f100127a) && Intrinsics.d(this.f100128b, gVar.f100128b);
    }

    public final int hashCode() {
        String str = this.f100127a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map map = this.f100128b;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "Success(body=" + this.f100127a + ", headers=" + this.f100128b + ')';
    }
}
