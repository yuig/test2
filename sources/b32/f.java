package b32;

import c50.t4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final t4 f21473c = new t4(10);

    /* renamed from: a, reason: collision with root package name */
    public final i f21474a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21475b;

    public f(i iVar, String str) {
        this.f21474a = iVar;
        this.f21475b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f21474a == fVar.f21474a && Intrinsics.d(this.f21475b, fVar.f21475b);
    }

    public final int hashCode() {
        i iVar = this.f21474a;
        int hashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
        String str = this.f21475b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FulfillmentOptionData(type=" + this.f21474a + ", text=" + this.f21475b + ")";
    }
}
