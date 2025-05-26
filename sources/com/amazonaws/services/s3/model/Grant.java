package com.amazonaws.services.s3.model;

/* loaded from: classes3.dex */
public class Grant {

    /* renamed from: a, reason: collision with root package name */
    public Grantee f28873a;

    /* renamed from: b, reason: collision with root package name */
    public Permission f28874b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Grant grant = (Grant) obj;
        Grantee grantee = grant.f28873a;
        Grantee grantee2 = this.f28873a;
        if (grantee2 == null) {
            if (grantee != null) {
                return false;
            }
        } else if (!grantee2.equals(grantee)) {
            return false;
        }
        return this.f28874b == grant.f28874b;
    }

    public final int hashCode() {
        Grantee grantee = this.f28873a;
        int hashCode = ((grantee == null ? 0 : grantee.hashCode()) + 31) * 31;
        Permission permission = this.f28874b;
        return hashCode + (permission != null ? permission.hashCode() : 0);
    }

    public final String toString() {
        return "Grant [grantee=" + this.f28873a + ", permission=" + this.f28874b + "]";
    }
}
