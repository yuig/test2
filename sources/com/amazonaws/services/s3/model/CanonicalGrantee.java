package com.amazonaws.services.s3.model;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class CanonicalGrantee implements Grantee, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public String f28864a;

    public final boolean equals(Object obj) {
        if (obj instanceof CanonicalGrantee) {
            return this.f28864a.equals(((CanonicalGrantee) obj).f28864a);
        }
        return false;
    }

    @Override // com.amazonaws.services.s3.model.Grantee
    public final String getIdentifier() {
        return this.f28864a;
    }

    @Override // com.amazonaws.services.s3.model.Grantee
    public final String getTypeIdentifier() {
        return "id";
    }

    public final int hashCode() {
        return this.f28864a.hashCode();
    }

    @Override // com.amazonaws.services.s3.model.Grantee
    public final void setIdentifier(String str) {
        this.f28864a = str;
    }
}
