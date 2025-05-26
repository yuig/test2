package nx;

import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f92390a;

    /* renamed from: b, reason: collision with root package name */
    public final d4 f92391b;

    /* renamed from: c, reason: collision with root package name */
    public final a4 f92392c;

    /* renamed from: d, reason: collision with root package name */
    public final String f92393d;

    public e1(a4 a4Var, d4 viewType, String pinId, String str) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        this.f92390a = pinId;
        this.f92391b = viewType;
        this.f92392c = a4Var;
        this.f92393d = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        if (!Intrinsics.d(e1Var.f92390a, this.f92390a) || e1Var.f92391b != this.f92391b || e1Var.f92392c != this.f92392c) {
            return false;
        }
        String str = e1Var.f92393d;
        String str2 = this.f92393d;
        return ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) || kotlin.text.z.i(str, str2, false);
    }

    public final int hashCode() {
        int hashCode = this.f92391b.hashCode() + (this.f92390a.hashCode() * 31);
        a4 a4Var = this.f92392c;
        if (a4Var != null) {
            hashCode = (hashCode * 31) + a4Var.hashCode();
        }
        String str = this.f92393d;
        return (str == null || str.length() == 0) ? hashCode : (hashCode * 31) + str.hashCode();
    }

    public final String toString() {
        return "TrackingParamKey(pinId=" + this.f92390a + ", viewType=" + this.f92391b + ", viewParameterType=" + this.f92392c + ", screenUniqueId=" + this.f92393d + ")";
    }
}
