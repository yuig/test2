package ads_mobile_sdk;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class v81 extends e {

    /* renamed from: b, reason: collision with root package name */
    public static final xv0 f12395b = xv0.a(Collections.emptyMap());

    public v81(LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
    }

    @Override // a.v7
    public final Object get() {
        int size = this.f4527a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        for (Map.Entry entry : this.f4527a.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((a.o8) entry.getValue()).get());
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }
}
