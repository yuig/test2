package m62;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    public final String f85951a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f85952b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85953c;

    public a(String color, boolean z13) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.f85951a = color;
        this.f85952b = z13;
        this.f85953c = color;
    }

    public static a b(a aVar, boolean z13) {
        String color = aVar.f85951a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(color, "color");
        return new a(color, z13);
    }

    @Override // m62.e
    public final String a() {
        return this.f85953c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f85951a, aVar.f85951a) && this.f85952b == aVar.f85952b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f85952b) + (this.f85951a.hashCode() * 31);
    }

    public final String toString() {
        return "ColorItem(color=" + this.f85951a + ", isSelected=" + this.f85952b + ")";
    }
}
