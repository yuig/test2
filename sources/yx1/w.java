package yx1;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w extends ig1.b {

    /* renamed from: b, reason: collision with root package name */
    public final Date f140415b;

    public w(Date date) {
        this.f140415b = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Intrinsics.d(this.f140415b, ((w) obj).f140415b);
    }

    public final int hashCode() {
        Date date = this.f140415b;
        if (date == null) {
            return 0;
        }
        return date.hashCode();
    }

    public final Date s1() {
        return this.f140415b;
    }

    public final String toString() {
        return "Success(createdDate=" + this.f140415b + ")";
    }
}
