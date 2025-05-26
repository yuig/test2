package td;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class x implements u {

    /* renamed from: b, reason: collision with root package name */
    public final Map f117448b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Map f117449c;

    public x(Map map) {
        this.f117448b = Collections.unmodifiableMap(map);
    }

    @Override // td.u
    public final Map a() {
        if (this.f117449c == null) {
            synchronized (this) {
                try {
                    if (this.f117449c == null) {
                        this.f117449c = Collections.unmodifiableMap(b());
                    }
                } finally {
                }
            }
        }
        return this.f117449c;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f117448b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb3 = new StringBuilder();
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                String str = ((w) list.get(i13)).f117447a;
                if (!TextUtils.isEmpty(str)) {
                    sb3.append(str);
                    if (i13 != list.size() - 1) {
                        sb3.append(',');
                    }
                }
            }
            String sb4 = sb3.toString();
            if (!TextUtils.isEmpty(sb4)) {
                hashMap.put(entry.getKey(), sb4);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            return this.f117448b.equals(((x) obj).f117448b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f117448b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f117448b + '}';
    }
}
