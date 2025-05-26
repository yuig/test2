package com.google.protobuf;

import java.util.Map;

/* loaded from: classes3.dex */
public final class h2 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f33905a;

    /* renamed from: b, reason: collision with root package name */
    public Object f33906b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f2 f33907c;

    public h2(f2 f2Var, Comparable comparable, Object obj) {
        this.f33907c = f2Var;
        this.f33905a = comparable;
        this.f33906b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f33905a.compareTo(((h2) obj).f33905a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f33905a;
        if (comparable != null ? comparable.equals(key) : key == null) {
            Object obj2 = this.f33906b;
            Object value = entry.getValue();
            if (obj2 == null) {
                if (value == null) {
                    return true;
                }
            } else if (obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f33905a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f33906b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f33905a;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f33906b;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i13 = f2.f33885g;
        this.f33907c.b();
        Object obj2 = this.f33906b;
        this.f33906b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f33905a + "=" + this.f33906b;
    }
}
