package xk2;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f135234a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f135235b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f135236c;

    public w(Object obj, Object obj2, Object obj3) {
        this.f135234a = obj;
        this.f135235b = obj2;
        this.f135236c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.f135234a, wVar.f135234a) && Intrinsics.d(this.f135235b, wVar.f135235b) && Intrinsics.d(this.f135236c, wVar.f135236c);
    }

    public final int hashCode() {
        Object obj = this.f135234a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f135235b;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f135236c;
        return hashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f135234a + ", " + this.f135235b + ", " + this.f135236c + ')';
    }
}
