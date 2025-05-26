package com.amazonaws.services.s3.model;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class Tag implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final String f28914a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28915b;

    public Tag(String str, String str2) {
        this.f28914a = str;
        this.f28915b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Tag tag = (Tag) obj;
        String str = tag.f28914a;
        String str2 = this.f28914a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = tag.f28915b;
        String str4 = this.f28915b;
        return str4 != null ? str4.equals(str3) : str3 == null;
    }

    public final int hashCode() {
        String str = this.f28914a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f28915b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
