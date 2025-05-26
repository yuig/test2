package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class pk0 implements a.ad {

    /* renamed from: b, reason: collision with root package name */
    public final Object f9719b;

    public pk0(Object obj) {
        this.f9719b = obj;
    }

    public final Object a() {
        return this.f9719b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pk0) && Intrinsics.d(this.f9719b, ((pk0) obj).f9719b);
    }

    public final int hashCode() {
        Object obj = this.f9719b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Success(result=" + this.f9719b + ")";
    }
}
