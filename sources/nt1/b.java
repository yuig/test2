package nt1;

import ft1.i;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f92293a;

    public b(Map formatDictionary) {
        Intrinsics.checkNotNullParameter(formatDictionary, "formatDictionary");
        HashMap hashMap = new HashMap();
        this.f92293a = hashMap;
        hashMap.putAll(formatDictionary);
    }

    @Override // nt1.c
    public final long a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.f92293a.get(key);
        Long l13 = obj instanceof Long ? (Long) obj : null;
        if (l13 != null) {
            return l13.longValue();
        }
        return 0L;
    }

    @Override // nt1.c
    public final Integer b() {
        Object obj = this.f92293a.get("sample-rate");
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        return null;
    }

    @Override // nt1.c
    public final String c() {
        Object obj = this.f92293a.get("mime");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @Override // nt1.c
    public final String d(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.f92293a.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @Override // nt1.c
    public final int e(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.f92293a.get(key);
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return Intrinsics.d(this.f92293a, ((b) obj).f92293a);
        }
        return false;
    }

    @Override // nt1.c
    public final Integer f() {
        HashMap hashMap = this.f92293a;
        Object obj = hashMap.get("channel-mask");
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num != null) {
            return num;
        }
        Object obj2 = hashMap.get("channel-count");
        Integer num2 = obj2 instanceof Integer ? (Integer) obj2 : null;
        if (num2 != null && num2.intValue() == 1) {
            return 16;
        }
        return (num2 != null && num2.intValue() == 2) ? 12 : null;
    }

    @Override // nt1.c
    public final i g() {
        Object obj = this.f92293a.get("pcm-encoding");
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num != null) {
            return l3.c.j(num.intValue());
        }
        if (Intrinsics.d(c(), "audio/raw")) {
            return i.Short;
        }
        return null;
    }

    @Override // nt1.c
    public final Integer h() {
        Object obj = this.f92293a.get("channel-count");
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        return null;
    }

    public final int hashCode() {
        Integer h10 = h();
        int intValue = h10 != null ? h10.intValue() : 0;
        Integer f13 = f();
        int intValue2 = (intValue ^ (f13 != null ? f13.intValue() : 0)) ^ this.f92293a.hashCode();
        Integer b13 = b();
        int intValue3 = intValue2 ^ (b13 != null ? b13.intValue() : 0);
        String c13 = c();
        int hashCode = intValue3 ^ (c13 != null ? c13.hashCode() : 0);
        i g13 = g();
        return hashCode ^ (g13 != null ? g13.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImmutableDictionaryMediaFormat [");
        boolean z13 = true;
        for (Map.Entry entry : this.f92293a.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (!z13) {
                sb3.append(", ");
            }
            sb3.append("[" + str + "] = [" + value + "]");
            z13 = false;
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    @Override // nt1.c
    public final boolean w(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f92293a.containsKey(key);
    }
}
