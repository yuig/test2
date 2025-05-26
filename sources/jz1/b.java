package jz1;

import java.util.List;
import java.util.Map;
import kotlin.collections.q0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f77775b = new b(z0.d());

    /* renamed from: a, reason: collision with root package name */
    public final Map f77776a;

    public b(Map valueMap) {
        Intrinsics.checkNotNullParameter(valueMap, "valueMap");
        this.f77776a = valueMap;
    }

    public final List a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        List list = (List) this.f77776a.get(key);
        return list == null ? q0.f80391a : list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f77776a, ((b) obj).f77776a);
    }

    public final int hashCode() {
        return this.f77776a.hashCode();
    }

    public final String toString() {
        return "PowerscoreExperimentValues(valueMap=" + this.f77776a + ")";
    }
}
