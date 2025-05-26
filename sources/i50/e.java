package i50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements k50.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f71542a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71543b;

    /* renamed from: c, reason: collision with root package name */
    public final String f71544c;

    public e(String __typename, String str, String str2) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f71542a = __typename;
        this.f71543b = str;
        this.f71544c = str2;
    }

    @Override // k50.a
    public final String a() {
        return this.f71543b;
    }

    @Override // k50.a
    public final String b() {
        return this.f71544c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f71542a, eVar.f71542a) && Intrinsics.d(this.f71543b, eVar.f71543b) && Intrinsics.d(this.f71544c, eVar.f71544c);
    }

    public final int hashCode() {
        int hashCode = this.f71542a.hashCode() * 31;
        String str = this.f71543b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f71544c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Data(__typename=");
        sb3.append(this.f71542a);
        sb3.append(", videoTrackingId=");
        sb3.append(this.f71543b);
        sb3.append(", videoUrl=");
        return a.a.p(sb3, this.f71544c, ")");
    }
}
