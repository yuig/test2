package s02;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f110333a;

    /* renamed from: b, reason: collision with root package name */
    public final String f110334b;

    /* renamed from: c, reason: collision with root package name */
    public final String f110335c;

    /* renamed from: d, reason: collision with root package name */
    public final String f110336d;

    /* renamed from: e, reason: collision with root package name */
    public final String f110337e;

    public o() {
        Intrinsics.checkNotNullParameter("", "actionId");
        this.f110333a = false;
        this.f110334b = "";
        this.f110335c = null;
        this.f110336d = null;
        this.f110337e = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f110333a == oVar.f110333a && Intrinsics.d(this.f110334b, oVar.f110334b) && Intrinsics.d(this.f110335c, oVar.f110335c) && Intrinsics.d(this.f110336d, oVar.f110336d) && Intrinsics.d(this.f110337e, oVar.f110337e);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f110334b, Boolean.hashCode(this.f110333a) * 31, 31);
        String str = this.f110335c;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f110336d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f110337e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SubmitAppealDisplayState(isYourAccountTab=");
        sb3.append(this.f110333a);
        sb3.append(", actionId=");
        sb3.append(this.f110334b);
        sb3.append(", userId=");
        sb3.append(this.f110335c);
        sb3.append(", explanation=");
        sb3.append(this.f110336d);
        sb3.append(", attachmentBase64=");
        return a.a.p(sb3, this.f110337e, ")");
    }
}
