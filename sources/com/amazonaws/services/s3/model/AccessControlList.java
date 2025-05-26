package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes3.dex */
public class AccessControlList implements Serializable, S3RequesterChargedResult {

    /* renamed from: a, reason: collision with root package name */
    public HashSet f28843a;

    /* renamed from: b, reason: collision with root package name */
    public LinkedList f28844b;

    /* renamed from: c, reason: collision with root package name */
    public Owner f28845c = null;

    public final List a() {
        HashSet hashSet = this.f28843a;
        if (hashSet != null && this.f28844b != null) {
            throw new IllegalStateException("Both grant set and grant list cannot be null");
        }
        if (this.f28844b == null) {
            if (hashSet == null) {
                this.f28844b = new LinkedList();
            } else {
                this.f28844b = new LinkedList(this.f28843a);
                this.f28843a = null;
            }
        }
        return this.f28844b;
    }

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    public final void c(boolean z13) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessControlList accessControlList = (AccessControlList) obj;
        Owner owner = this.f28845c;
        if (owner == null) {
            if (accessControlList.f28845c != null) {
                return false;
            }
        } else if (!owner.equals(accessControlList.f28845c)) {
            return false;
        }
        HashSet hashSet = this.f28843a;
        if (hashSet == null) {
            if (accessControlList.f28843a != null) {
                return false;
            }
        } else if (!hashSet.equals(accessControlList.f28843a)) {
            return false;
        }
        LinkedList linkedList = this.f28844b;
        if (linkedList == null) {
            if (accessControlList.f28844b != null) {
                return false;
            }
        } else if (!linkedList.equals(accessControlList.f28844b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Owner owner = this.f28845c;
        int hashCode = ((owner == null ? 0 : owner.hashCode()) + 31) * 31;
        HashSet hashSet = this.f28843a;
        int hashCode2 = (hashCode + (hashSet == null ? 0 : hashSet.hashCode())) * 31;
        LinkedList linkedList = this.f28844b;
        return hashCode2 + (linkedList != null ? linkedList.hashCode() : 0);
    }

    public final String toString() {
        return "AccessControlList [owner=" + this.f28845c + ", grants=" + a() + "]";
    }
}
