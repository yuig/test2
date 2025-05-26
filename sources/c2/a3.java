package c2;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a3 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f24525a;

    public a3(Map map) {
        this.f24525a = map;
    }

    public final Object a(float f13) {
        Object next;
        Iterator it = this.f24525a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(f13 - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    Object next2 = it.next();
                    float abs2 = Math.abs(f13 - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    public final Object b(float f13, boolean z13) {
        Object next;
        Iterator it = this.f24525a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f14 = z13 ? floatValue - f13 : f13 - floatValue;
                if (f14 < 0.0f) {
                    f14 = Float.POSITIVE_INFINITY;
                }
                do {
                    Object next2 = it.next();
                    float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f15 = z13 ? floatValue2 - f13 : f13 - floatValue2;
                    if (f15 < 0.0f) {
                        f15 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f14, f15) > 0) {
                        next = next2;
                        f14 = f15;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    public final float c(Object obj) {
        Float f13 = (Float) this.f24525a.get(obj);
        if (f13 != null) {
            return f13.floatValue();
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return false;
        }
        return Intrinsics.d(this.f24525a, ((a3) obj).f24525a);
    }

    public final int hashCode() {
        return this.f24525a.hashCode() * 31;
    }

    public final String toString() {
        return "MapDraggableAnchors(" + this.f24525a + ')';
    }
}
