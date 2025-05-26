package com.amazonaws.services.s3.model;

/* loaded from: classes3.dex */
public class EmailAddressGrantee implements Grantee {

    /* renamed from: a, reason: collision with root package name */
    public String f28866a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EmailAddressGrantee emailAddressGrantee = (EmailAddressGrantee) obj;
        String str = this.f28866a;
        if (str == null) {
            if (emailAddressGrantee.f28866a != null) {
                return false;
            }
        } else if (!str.equals(emailAddressGrantee.f28866a)) {
            return false;
        }
        return true;
    }

    @Override // com.amazonaws.services.s3.model.Grantee
    public final String getIdentifier() {
        return this.f28866a;
    }

    @Override // com.amazonaws.services.s3.model.Grantee
    public final String getTypeIdentifier() {
        return "emailAddress";
    }

    public final int hashCode() {
        String str = this.f28866a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    @Override // com.amazonaws.services.s3.model.Grantee
    public final void setIdentifier(String str) {
        this.f28866a = str;
    }

    public final String toString() {
        return this.f28866a;
    }
}
