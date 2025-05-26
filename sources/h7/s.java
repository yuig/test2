package h7;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class s implements r {

    /* renamed from: c, reason: collision with root package name */
    public static final s f67927c = new s(Collections.emptyMap());

    /* renamed from: a, reason: collision with root package name */
    public int f67928a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f67929b;

    public s(Map map) {
        this.f67929b = Collections.unmodifiableMap(map);
    }

    public static byte[] c(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(StandardCharsets.UTF_8);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    public static boolean d(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final s b(tb.l lVar) {
        Map map = this.f67929b;
        HashMap hashMap = new HashMap(map);
        List unmodifiableList = Collections.unmodifiableList(new ArrayList((List) lVar.f116987c));
        for (int i13 = 0; i13 < unmodifiableList.size(); i13++) {
            hashMap.remove(unmodifiableList.get(i13));
        }
        HashMap hashMap2 = new HashMap((Map) lVar.f116986b);
        for (Map.Entry entry : hashMap2.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        for (Map.Entry entry2 : Collections.unmodifiableMap(hashMap2).entrySet()) {
            hashMap.put((String) entry2.getKey(), c(entry2.getValue()));
        }
        return d(map, hashMap) ? this : new s(hashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        return d(this.f67929b, ((s) obj).f67929b);
    }

    public final int hashCode() {
        if (this.f67928a == 0) {
            int i13 = 0;
            for (Map.Entry entry : this.f67929b.entrySet()) {
                i13 += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.f67928a = i13;
        }
        return this.f67928a;
    }
}
