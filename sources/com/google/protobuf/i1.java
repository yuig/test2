package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class i1 extends LinkedHashMap {

    /* renamed from: b, reason: collision with root package name */
    public static final i1 f33908b;

    /* renamed from: a, reason: collision with root package name */
    public boolean f33909a = true;

    static {
        i1 i1Var = new i1();
        f33908b = i1Var;
        i1Var.f33909a = false;
    }

    public final void a() {
        if (!this.f33909a) {
            throw new UnsupportedOperationException();
        }
    }

    public final i1 b() {
        if (isEmpty()) {
            return new i1();
        }
        i1 i1Var = new i1(this);
        i1Var.f33909a = true;
        return i1Var;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        a();
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
                Charset charset = w0.f34008a;
                hashCode = bArr.length;
                for (byte b13 : bArr) {
                    hashCode = (hashCode * 31) + b13;
                }
                if (hashCode == 0) {
                    hashCode = 1;
                }
            } else {
                hashCode = key.hashCode();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                Charset charset2 = w0.f34008a;
                int length = bArr2.length;
                for (byte b14 : bArr2) {
                    length = (length * 31) + b14;
                }
                if (length != 0) {
                    i14 = length;
                }
            } else {
                i14 = value.hashCode();
            }
            i13 += hashCode ^ i14;
        }
        return i13;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        a();
        Charset charset = w0.f34008a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        a();
        for (Object obj : map.keySet()) {
            Charset charset = w0.f34008a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        a();
        return super.remove(obj);
    }
}
