package bc0;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f22618a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22619b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22620c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22621d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f22622e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f22623f;

    public /* synthetic */ a(String str, String str2, int i13) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, false, sm1.b.ic_check_circle_gestalt, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f22618a, aVar.f22618a) && Intrinsics.d(this.f22619b, aVar.f22619b) && this.f22620c == aVar.f22620c && this.f22621d == aVar.f22621d && Intrinsics.d(this.f22622e, aVar.f22622e) && Intrinsics.d(this.f22623f, aVar.f22623f);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f22621d, ep.b.e(this.f22620c, cb.d(this.f22619b, this.f22618a.hashCode() * 31, 31), 31), 31);
        Integer num = this.f22622e;
        int hashCode = (b13 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f22623f;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AvatarDisplay(imageUrl=");
        sb3.append(this.f22618a);
        sb3.append(", initial=");
        sb3.append(this.f22619b);
        sb3.append(", isVerified=");
        sb3.append(this.f22620c);
        sb3.append(", verifiedIconResId=");
        sb3.append(this.f22621d);
        sb3.append(", verifiedIconTintResId=");
        sb3.append(this.f22622e);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f22623f, ")");
    }

    public a(String imageUrl, String initial, boolean z13, int i13, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(initial, "initial");
        this.f22618a = imageUrl;
        this.f22619b = initial;
        this.f22620c = z13;
        this.f22621d = i13;
        this.f22622e = num;
        this.f22623f = num2;
    }
}
