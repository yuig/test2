package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class oa implements z40.z {

    /* renamed from: a, reason: collision with root package name */
    public final String f132956a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132957b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132958c;

    public oa(String __typename, String str, String str2) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132956a = __typename;
        this.f132957b = str;
        this.f132958c = str2;
    }

    @Override // z40.z
    public final String a() {
        return this.f132958c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa)) {
            return false;
        }
        oa oaVar = (oa) obj;
        return Intrinsics.d(this.f132956a, oaVar.f132956a) && Intrinsics.d(this.f132957b, oaVar.f132957b) && Intrinsics.d(this.f132958c, oaVar.f132958c);
    }

    @Override // z40.z
    public final String getType() {
        return this.f132957b;
    }

    public final int hashCode() {
        int hashCode = this.f132956a.hashCode() * 31;
        String str = this.f132957b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132958c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Embed(__typename=");
        sb3.append(this.f132956a);
        sb3.append(", type=");
        sb3.append(this.f132957b);
        sb3.append(", src=");
        return a.a.p(sb3, this.f132958c, ")");
    }
}
