package i50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m implements k50.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f71555a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71556b;

    /* renamed from: c, reason: collision with root package name */
    public final String f71557c;

    public m(String __typename, String str, String str2) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f71555a = __typename;
        this.f71556b = str;
        this.f71557c = str2;
    }

    @Override // k50.a
    public final String a() {
        return this.f71556b;
    }

    @Override // k50.a
    public final String b() {
        return this.f71557c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f71555a, mVar.f71555a) && Intrinsics.d(this.f71556b, mVar.f71556b) && Intrinsics.d(this.f71557c, mVar.f71557c);
    }

    public final int hashCode() {
        int hashCode = this.f71555a.hashCode() * 31;
        String str = this.f71556b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f71557c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Data(__typename=");
        sb3.append(this.f71555a);
        sb3.append(", videoTrackingId=");
        sb3.append(this.f71556b);
        sb3.append(", videoUrl=");
        return a.a.p(sb3, this.f71557c, ")");
    }
}
