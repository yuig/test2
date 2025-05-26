package wc;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f129078b;

    /* renamed from: a, reason: collision with root package name */
    public final String f129079a;

    static {
        new Regex("ApolloCacheReference\\{(.*)\\}");
        f129078b = new c("QUERY_ROOT");
    }

    public c(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f129079a = key;
    }

    public final boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return Intrinsics.d(this.f129079a, cVar != null ? cVar.f129079a : null);
    }

    public final int hashCode() {
        return this.f129079a.hashCode();
    }

    public final String toString() {
        return ep.b.k(new StringBuilder("CacheKey("), this.f129079a, ')');
    }
}
