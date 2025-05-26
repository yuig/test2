package com.google.android.gms.internal.measurement;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final pk.o1 f31310d = pk.o1.p(3, "_syn", "_err", "_el");

    /* renamed from: a, reason: collision with root package name */
    public String f31311a;

    /* renamed from: b, reason: collision with root package name */
    public final long f31312b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f31313c;

    public c(String str, long j13, HashMap hashMap) {
        this.f31311a = str;
        this.f31312b = j13;
        HashMap hashMap2 = new HashMap();
        this.f31313c = hashMap2;
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
    }

    public static Object a(Object obj, Object obj2, String str) {
        return (f31310d.contains(str) && (obj2 instanceof Double)) ? Long.valueOf(Math.round(((Double) obj2).doubleValue())) : str.startsWith("_") ? ((obj instanceof String) || obj == null) ? obj2 : obj : obj instanceof Double ? obj2 : obj instanceof Long ? Long.valueOf(Math.round(((Double) obj2).doubleValue())) : obj instanceof String ? obj2.toString() : obj2;
    }

    public final /* synthetic */ Object clone() {
        return new c(this.f31311a, this.f31312b, new HashMap(this.f31313c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f31312b == cVar.f31312b && this.f31311a.equals(cVar.f31311a)) {
            return this.f31313c.equals(cVar.f31313c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f31311a.hashCode() * 31;
        long j13 = this.f31312b;
        return this.f31313c.hashCode() + ((hashCode + ((int) (j13 ^ (j13 >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f31311a;
        String valueOf = String.valueOf(this.f31313c);
        StringBuilder o13 = a.cb.o("Event{name='", str, "', timestamp=");
        o13.append(this.f31312b);
        o13.append(", params=");
        o13.append(valueOf);
        o13.append("}");
        return o13.toString();
    }
}
