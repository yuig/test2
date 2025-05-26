package com.amazonaws.regions;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class Region {

    /* renamed from: a, reason: collision with root package name */
    public final String f28755a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28756b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f28757c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f28758d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f28759e = new HashMap();

    public Region(String str, String str2) {
        this.f28755a = str;
        if (str2 == null || str2.isEmpty()) {
            this.f28756b = "amazonaws.com";
        } else {
            this.f28756b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Region)) {
            return false;
        }
        return this.f28755a.equals(((Region) obj).f28755a);
    }

    public final int hashCode() {
        return this.f28755a.hashCode();
    }

    public final String toString() {
        return this.f28755a;
    }
}
