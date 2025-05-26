package aj2;

import a.cb;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
public final class b extends HashMap implements qi2.d {

    /* renamed from: a, reason: collision with root package name */
    public final long f15430a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15431b;

    /* renamed from: c, reason: collision with root package name */
    public int f15432c = 0;

    public b(long j13, int i13) {
        this.f15430a = j13;
        this.f15431b = i13;
    }

    @Override // qi2.d
    public final Map a() {
        return Collections.unmodifiableMap(this);
    }

    @Override // qi2.d
    public final Object b(ri2.e eVar) {
        return get(eVar);
    }

    public final void c(ri2.e eVar, Object obj) {
        this.f15432c++;
        if (size() < this.f15430a || containsKey(eVar)) {
            put(eVar, r.h(this.f15431b, obj));
        }
    }

    @Override // java.util.HashMap, java.util.Map, qi2.d
    public final void forEach(BiConsumer biConsumer) {
        super.forEach(biConsumer);
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AttributesMap{data=");
        sb3.append(super.toString());
        sb3.append(", capacity=");
        sb3.append(this.f15430a);
        sb3.append(", totalAddedValues=");
        return cb.l(sb3, this.f15432c, '}');
    }
}
