package xa0;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f134388a;

    /* renamed from: b, reason: collision with root package name */
    public final int f134389b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f134390c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f134391d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f134392e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f134393f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f134394g;

    public a(f30 f30Var, int i13, boolean z13, boolean z14, boolean z15, boolean z16, int i14) {
        f30Var = (i14 & 1) != 0 ? null : f30Var;
        i13 = (i14 & 2) != 0 ? 0 : i13;
        z13 = (i14 & 4) != 0 ? false : z13;
        z14 = (i14 & 8) != 0 ? false : z14;
        boolean z17 = (i14 & 16) != 0;
        z15 = (i14 & 32) != 0 ? true : z15;
        z16 = (i14 & 64) != 0 ? true : z16;
        this.f134388a = f30Var;
        this.f134389b = i13;
        this.f134390c = z13;
        this.f134391d = z14;
        this.f134392e = z17;
        this.f134393f = z15;
        this.f134394g = z16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f134388a, aVar.f134388a) && this.f134389b == aVar.f134389b && this.f134390c == aVar.f134390c && this.f134391d == aVar.f134391d && this.f134392e == aVar.f134392e && this.f134393f == aVar.f134393f && this.f134394g == aVar.f134394g;
    }

    public final int hashCode() {
        f30 f30Var = this.f134388a;
        return Boolean.hashCode(this.f134394g) + ep.b.e(this.f134393f, ep.b.e(this.f134392e, ep.b.e(this.f134391d, ep.b.e(this.f134390c, ep.b.b(this.f134389b, (f30Var == null ? 0 : f30Var.hashCode()) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CollageFeedItemDisplayState(pin=");
        sb3.append(this.f134388a);
        sb3.append(", position=");
        sb3.append(this.f134389b);
        sb3.append(", isDraft=");
        sb3.append(this.f134390c);
        sb3.append(", isImageOnly=");
        sb3.append(this.f134391d);
        sb3.append(", isOverflowMenuVisible=");
        sb3.append(this.f134392e);
        sb3.append(", showLastEditedLabel=");
        sb3.append(this.f134393f);
        sb3.append(", isEditButtonCentered=");
        return a.a.r(sb3, this.f134394g, ")");
    }
}
