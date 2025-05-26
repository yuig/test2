package com.amazonaws.services.s3.model;

import a.a;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class Owner implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public String f28894a;

    /* renamed from: b, reason: collision with root package name */
    public String f28895b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof Owner)) {
            return false;
        }
        Owner owner = (Owner) obj;
        String str = owner.f28895b;
        String str2 = owner.f28894a;
        String str3 = this.f28895b;
        String str4 = this.f28894a;
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        if (str4 == null) {
            str4 = "";
        }
        return str.equals(str3) && str2.equals(str4);
    }

    public final int hashCode() {
        String str = this.f28895b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("S3Owner [name=");
        sb3.append(this.f28894a);
        sb3.append(",id=");
        return a.p(sb3, this.f28895b, "]");
    }
}
