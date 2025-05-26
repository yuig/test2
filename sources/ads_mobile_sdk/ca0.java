package ads_mobile_sdk;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ca0 implements Map, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final Map f3835a;

    public ca0(Map delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f3835a = delegate;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f3835a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f3835a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new ew2(this.f3835a.entrySet());
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return Intrinsics.d(this.f3835a, obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f3835a.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f3835a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f3835a.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        Set delegate = this.f3835a.keySet();
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new a.i4(delegate);
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f3835a.size();
    }

    public final String toString() {
        return this.f3835a.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return new aw2(this.f3835a.values());
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
