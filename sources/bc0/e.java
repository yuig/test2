package bc0;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f22626a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22627b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22628c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22629d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f22630e;

    /* renamed from: f, reason: collision with root package name */
    public final String f22631f;

    /* renamed from: g, reason: collision with root package name */
    public final int f22632g;

    public /* synthetic */ e(String str, int i13) {
        this("", (i13 & 2) != 0 ? "" : str, false, sm1.b.ic_check_circle_gestalt, null, "", 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f22626a, eVar.f22626a) && Intrinsics.d(this.f22627b, eVar.f22627b) && this.f22628c == eVar.f22628c && this.f22629d == eVar.f22629d && Intrinsics.d(this.f22630e, eVar.f22630e) && Intrinsics.d(this.f22631f, eVar.f22631f) && this.f22632g == eVar.f22632g;
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f22629d, ep.b.e(this.f22628c, cb.d(this.f22627b, this.f22626a.hashCode() * 31, 31), 31), 31);
        Integer num = this.f22630e;
        return Integer.hashCode(this.f22632g) + cb.d(this.f22631f, (b13 + (num == null ? 0 : num.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AvatarDisplay(imageUrl=");
        sb3.append(this.f22626a);
        sb3.append(", initial=");
        sb3.append(this.f22627b);
        sb3.append(", isVerified=");
        sb3.append(this.f22628c);
        sb3.append(", verifiedIconResId=");
        sb3.append(this.f22629d);
        sb3.append(", verifiedIconTintResId=");
        sb3.append(this.f22630e);
        sb3.append(", userId=");
        sb3.append(this.f22631f);
        sb3.append(", colorIndex=");
        return a.a.n(sb3, this.f22632g, ")");
    }

    public e(String imageUrl, String initial, boolean z13, int i13, Integer num, String userId, int i14) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(initial, "initial");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f22626a = imageUrl;
        this.f22627b = initial;
        this.f22628c = z13;
        this.f22629d = i13;
        this.f22630e = num;
        this.f22631f = userId;
        this.f22632g = i14;
    }
}
