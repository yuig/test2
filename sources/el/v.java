package el;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public static final v f59543b = new v(Collections.unmodifiableMap(new HashMap()));

    /* renamed from: a, reason: collision with root package name */
    public final Map f59544a;

    public v(Map map) {
        this.f59544a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return this.f59544a.equals(((v) obj).f59544a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f59544a.hashCode();
    }

    public final String toString() {
        return this.f59544a.toString();
    }
}
