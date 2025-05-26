package vl;

import androidx.camera.core.impl.x2;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f126102a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f126103b;

    public b(String str, Map map) {
        this.f126102a = str;
        this.f126103b = map;
    }

    public static x2 a(String str) {
        return new x2(str, 2);
    }

    public static b b(String str) {
        return new b(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f126102a.equals(bVar.f126102a) && this.f126103b.equals(bVar.f126103b);
    }

    public final int hashCode() {
        return this.f126103b.hashCode() + (this.f126102a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f126102a + ", properties=" + this.f126103b.values() + "}";
    }
}
