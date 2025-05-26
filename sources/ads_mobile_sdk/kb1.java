package ads_mobile_sdk;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class kb1 {

    /* renamed from: b, reason: collision with root package name */
    public static final kb1 f7207b = new kb1(Collections.unmodifiableMap(new HashMap()));

    /* renamed from: a, reason: collision with root package name */
    public final Map f7208a;

    public kb1(Map map) {
        this.f7208a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kb1) {
            return this.f7208a.equals(((kb1) obj).f7208a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7208a.hashCode();
    }

    public final String toString() {
        return this.f7208a.toString();
    }
}
