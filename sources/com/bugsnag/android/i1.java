package com.bugsnag.android;

import java.util.Map;

/* loaded from: classes3.dex */
public final class i1 implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final String f29271a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29272b;

    public i1(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("FeatureFlags cannot have null name");
        }
        this.f29271a = str;
        this.f29272b = str2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.f29271a.equals(entry.getKey())) {
            String str = this.f29272b;
            Object value = entry.getValue();
            if (str == null) {
                if (value == null) {
                    return true;
                }
            } else if (str.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f29271a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f29272b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode = this.f29271a.hashCode();
        String str = this.f29272b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("FeatureFlag is immutable");
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FeatureFlag{name='");
        sb3.append(this.f29271a);
        sb3.append("', variant='");
        return a.a.p(sb3, this.f29272b, "'}");
    }
}
