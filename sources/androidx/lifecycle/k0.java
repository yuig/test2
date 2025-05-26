package androidx.lifecycle;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public Map f18655a;

    public k0(int i13) {
        if (i13 == 1) {
            this.f18655a = new LinkedHashMap();
            return;
        }
        if (i13 == 2) {
            this.f18655a = new HashMap();
            return;
        }
        if (i13 == 3) {
            this.f18655a = new HashMap();
            return;
        }
        if (i13 == 5) {
            this.f18655a = new LinkedHashMap();
            return;
        }
        if (i13 == 6) {
            this.f18655a = new HashMap();
        } else if (i13 != 7) {
            this.f18655a = new HashMap();
        } else {
            this.f18655a = new ConcurrentHashMap(16);
        }
    }

    public final HashMap a(Collection collection) {
        Set unmodifiableSet;
        HashMap hashMap = new HashMap();
        for (String str : this.f18655a.keySet()) {
            if (this.f18655a.containsKey(str)) {
                HashSet hashSet = new HashSet();
                for (Map.Entry entry : ((Map) this.f18655a.get(str)).entrySet()) {
                    if (collection.contains(entry.getKey())) {
                        hashSet.add((String) entry.getValue());
                    }
                }
                unmodifiableSet = Collections.unmodifiableSet(hashSet);
            } else {
                unmodifiableSet = Collections.emptySet();
            }
            hashMap.put(str, unmodifiableSet);
        }
        return hashMap;
    }

    public final void b(String str, String str2, String str3) {
        if (!this.f18655a.containsKey(str2)) {
            this.f18655a.put(str2, new HashMap());
        }
        ((Map) this.f18655a.get(str2)).put(str, str3);
    }

    public final k0 c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f18655a.entrySet()) {
            hashMap.put((String) entry.getKey(), Collections.unmodifiableMap(new HashMap((Map) entry.getValue())));
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        k0 k0Var = new k0();
        k0Var.f18655a = unmodifiableMap;
        return k0Var;
    }
}
