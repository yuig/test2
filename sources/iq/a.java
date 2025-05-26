package iq;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Map f73385a;

    public a(LinkedHashMap linkedHashMap) {
        this.f73385a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f73385a, ((a) obj).f73385a);
    }

    public final int hashCode() {
        Map map = this.f73385a;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final String toString() {
        return "NUXCompletedEvent(nuxSignalsMap=" + this.f73385a + ")";
    }
}
