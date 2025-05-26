package d6;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends i {

    /* renamed from: a, reason: collision with root package name */
    public final Map f53725a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f53726b;

    public b(Map preferencesMap, boolean z13) {
        Intrinsics.checkNotNullParameter(preferencesMap, "preferencesMap");
        this.f53725a = preferencesMap;
        this.f53726b = new AtomicBoolean(z13);
    }

    public final void a() {
        if (!(!this.f53726b.get())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public final void b(g key) {
        Intrinsics.checkNotNullParameter(key, "key");
        a();
        this.f53725a.remove(key);
    }

    public final void c(g key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        a();
        if (obj == null) {
            b(key);
            return;
        }
        boolean z13 = obj instanceof Set;
        Map map = this.f53725a;
        if (!z13) {
            map.put(key, obj);
            return;
        }
        Set unmodifiableSet = Collections.unmodifiableSet(CollectionsKt.J0((Iterable) obj));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(value.toSet())");
        map.put(key, unmodifiableSet);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return Intrinsics.d(this.f53725a, ((b) obj).f53725a);
    }

    public final int hashCode() {
        return this.f53725a.hashCode();
    }

    public final String toString() {
        return CollectionsKt.Z(this.f53725a.entrySet(), ",\n", "{\n", "\n}", 0, null, a.f53724i, 24);
    }

    public /* synthetic */ b(boolean z13) {
        this(new LinkedHashMap(), z13);
    }
}
