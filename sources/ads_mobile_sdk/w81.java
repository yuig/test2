package ads_mobile_sdk;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class w81 extends LinkedHashMap {

    /* renamed from: b, reason: collision with root package name */
    public static final w81 f12896b;

    /* renamed from: a, reason: collision with root package name */
    public boolean f12897a;

    static {
        w81 w81Var = new w81();
        f12896b = w81Var;
        w81Var.f12897a = false;
    }

    public w81() {
        this.f12897a = true;
    }

    public static w81 a() {
        return f12896b;
    }

    public final w81 b() {
        return isEmpty() ? new w81() : new w81(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (!this.f12897a) {
            throw new UnsupportedOperationException();
        }
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    for (Map.Entry entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            Object value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int hashCode;
        int i13 = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            int i14 = 1;
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                Charset charset = hw0.f6126a;
                hashCode = bArr.length;
                for (byte b13 : bArr) {
                    hashCode = (hashCode * 31) + b13;
                }
                if (hashCode == 0) {
                    hashCode = 1;
                }
            } else {
                if (key instanceof a.w) {
                    throw new UnsupportedOperationException();
                }
                hashCode = key.hashCode();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                Charset charset2 = hw0.f6126a;
                int length = bArr2.length;
                for (byte b14 : bArr2) {
                    length = (length * 31) + b14;
                }
                if (length != 0) {
                    i14 = length;
                }
            } else {
                if (value instanceof a.w) {
                    throw new UnsupportedOperationException();
                }
                i14 = value.hashCode();
            }
            i13 += hashCode ^ i14;
        }
        return i13;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (!this.f12897a) {
            throw new UnsupportedOperationException();
        }
        Charset charset = hw0.f6126a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        if (!this.f12897a) {
            throw new UnsupportedOperationException();
        }
        for (Object obj : map.keySet()) {
            Charset charset = hw0.f6126a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (this.f12897a) {
            return super.remove(obj);
        }
        throw new UnsupportedOperationException();
    }

    public w81(Map map) {
        super(map);
        this.f12897a = true;
    }
}
