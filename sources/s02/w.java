package s02;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;

/* loaded from: classes4.dex */
public final class w implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f110357a;

    /* renamed from: b, reason: collision with root package name */
    public final String f110358b;

    /* renamed from: c, reason: collision with root package name */
    public final String f110359c;

    /* renamed from: d, reason: collision with root package name */
    public final String f110360d;

    /* renamed from: e, reason: collision with root package name */
    public final String f110361e;

    public w() {
        Intrinsics.checkNotNullParameter("", "actionId");
        this.f110357a = false;
        this.f110358b = "";
        this.f110359c = null;
        this.f110360d = null;
        this.f110361e = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f110357a == wVar.f110357a && Intrinsics.d(this.f110358b, wVar.f110358b) && Intrinsics.d(this.f110359c, wVar.f110359c) && Intrinsics.d(this.f110360d, wVar.f110360d) && Intrinsics.d(this.f110361e, wVar.f110361e);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f110358b, Boolean.hashCode(this.f110357a) * 31, 31);
        String str = this.f110359c;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f110360d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f110361e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SubmitAppealVMState(isYourAccountTab=");
        sb3.append(this.f110357a);
        sb3.append(", actionId=");
        sb3.append(this.f110358b);
        sb3.append(", userId=");
        sb3.append(this.f110359c);
        sb3.append(", explanation=");
        sb3.append(this.f110360d);
        sb3.append(", attachmentBase64=");
        return a.a.p(sb3, this.f110361e, ")");
    }
}
