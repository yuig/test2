package ti1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final bb2.e f117702a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f117703b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f117704c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f117705d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f117706e;

    public a(bb2.e eVar, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f117702a = eVar;
        this.f117703b = z13;
        this.f117704c = z14;
        this.f117705d = z15;
        this.f117706e = z16;
    }

    public final boolean a() {
        return this.f117704c;
    }

    public final boolean b() {
        return this.f117705d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f117702a, aVar.f117702a) && this.f117703b == aVar.f117703b && this.f117704c == aVar.f117704c && this.f117705d == aVar.f117705d && this.f117706e == aVar.f117706e;
    }

    public final int hashCode() {
        bb2.e eVar = this.f117702a;
        return Boolean.hashCode(this.f117706e) + ep.b.e(this.f117705d, ep.b.e(this.f117704c, ep.b.e(this.f117703b, (eVar == null ? 0 : eVar.hashCode()) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CalculatedFields(shoppingGridConfigsFixedHeightSpec=");
        sb3.append(this.f117702a);
        sb3.append(", isRelatedContent=");
        sb3.append(this.f117703b);
        sb3.append(", isInAdsOnlyModule=");
        sb3.append(this.f117704c);
        sb3.append(", isInStlModule=");
        sb3.append(this.f117705d);
        sb3.append(", shouldShowPinChips=");
        return a.a.r(sb3, this.f117706e, ")");
    }
}
