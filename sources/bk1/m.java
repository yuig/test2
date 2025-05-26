package bk1;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f23261a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23262b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23263c;

    /* renamed from: d, reason: collision with root package name */
    public final h32.c1 f23264d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f23265e;

    /* renamed from: f, reason: collision with root package name */
    public final String f23266f;

    public m(f30 pin, boolean z13, boolean z14, h32.c1 c1Var, Integer num, String str) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f23261a = pin;
        this.f23262b = z13;
        this.f23263c = z14;
        this.f23264d = c1Var;
        this.f23265e = num;
        this.f23266f = str;
    }

    public final Integer a() {
        return this.f23265e;
    }

    public final h32.c1 b() {
        return this.f23264d;
    }

    public final String c() {
        return this.f23266f;
    }

    public final f30 d() {
        return this.f23261a;
    }

    public final boolean e() {
        return this.f23262b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f23261a, mVar.f23261a) && this.f23262b == mVar.f23262b && this.f23263c == mVar.f23263c && Intrinsics.d(this.f23264d, mVar.f23264d) && Intrinsics.d(this.f23265e, mVar.f23265e) && Intrinsics.d(this.f23266f, mVar.f23266f);
    }

    public final boolean f() {
        return this.f23263c;
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f23263c, ep.b.e(this.f23262b, this.f23261a.hashCode() * 31, 31), 31);
        h32.c1 c1Var = this.f23264d;
        int hashCode = (e13 + (c1Var == null ? 0 : c1Var.hashCode())) * 31;
        Integer num = this.f23265e;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f23266f;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "SetDeepLinkData(pin=" + this.f23261a + ", shouldLogPrice=" + this.f23262b + ", shouldLogRating=" + this.f23263c + ", eventData=" + this.f23264d + ", collectionSelectedPosition=" + this.f23265e + ", insertionId=" + this.f23266f + ")";
    }
}
