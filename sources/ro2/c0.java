package ro2;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g(with = f0.class)
/* loaded from: classes4.dex */
public final class c0 extends n implements Map<String, n>, ll2.a {

    @NotNull
    public static final b0 Companion = new b0();

    /* renamed from: a, reason: collision with root package name */
    public final Map f108979a;

    public c0(Map content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f108979a = content;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ n compute(String str, BiFunction<? super String, ? super n, ? extends n> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ n computeIfAbsent(String str, Function<? super String, ? extends n> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ n computeIfPresent(String str, BiFunction<? super String, ? super n, ? extends n> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String key = (String) obj;
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f108979a.containsKey(key);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n value = (n) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f108979a.containsValue(value);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, n>> entrySet() {
        return this.f108979a.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return Intrinsics.d(this.f108979a, obj);
    }

    @Override // java.util.Map
    public final n get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        Intrinsics.checkNotNullParameter(key, "key");
        return (n) this.f108979a.get(key);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f108979a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f108979a.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f108979a.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ n merge(String str, n nVar, BiFunction<? super n, ? super n, ? extends n> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ n put(String str, n nVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends n> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ n putIfAbsent(String str, n nVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final n remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ n replace(String str, n nVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super n, ? extends n> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f108979a.size();
    }

    public final String toString() {
        return CollectionsKt.Z(this.f108979a.entrySet(), ",", "{", "}", 0, null, q.f109035k, 24);
    }

    @Override // java.util.Map
    public final Collection<n> values() {
        return this.f108979a.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, n nVar, n nVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
