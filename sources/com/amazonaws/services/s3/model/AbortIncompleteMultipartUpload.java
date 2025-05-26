package com.amazonaws.services.s3.model;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class AbortIncompleteMultipartUpload implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public int f28828a;

    public final Object clone() {
        try {
            return (AbortIncompleteMultipartUpload) super.clone();
        } catch (CloneNotSupportedException e13) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e13);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f28828a == ((AbortIncompleteMultipartUpload) obj).f28828a;
    }

    public final int hashCode() {
        return this.f28828a;
    }
}
