package bk1;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements n {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f23188a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23189b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23190c;

    /* renamed from: d, reason: collision with root package name */
    public final h32.c1 f23191d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f23192e;

    /* renamed from: f, reason: collision with root package name */
    public final String f23193f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f23194g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f23195h;

    public c(f30 pin, boolean z13, String str, h32.c1 c1Var, Integer num, String str2, boolean z14, boolean z15) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f23188a = pin;
        this.f23189b = z13;
        this.f23190c = str;
        this.f23191d = c1Var;
        this.f23192e = num;
        this.f23193f = str2;
        this.f23194g = z14;
        this.f23195h = z15;
    }

    public final Integer a() {
        return this.f23192e;
    }

    public final h32.c1 b() {
        return this.f23191d;
    }

    public final String c() {
        return this.f23190c;
    }

    public final f30 d() {
        return this.f23188a;
    }

    public final boolean e() {
        return this.f23189b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f23188a, cVar.f23188a) && this.f23189b == cVar.f23189b && Intrinsics.d(this.f23190c, cVar.f23190c) && Intrinsics.d(this.f23191d, cVar.f23191d) && Intrinsics.d(this.f23192e, cVar.f23192e) && Intrinsics.d(this.f23193f, cVar.f23193f) && this.f23194g == cVar.f23194g && this.f23195h == cVar.f23195h;
    }

    public final boolean f() {
        return this.f23194g;
    }

    public final boolean g() {
        return this.f23195h;
    }

    public final String h() {
        return this.f23193f;
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f23189b, this.f23188a.hashCode() * 31, 31);
        String str = this.f23190c;
        int hashCode = (e13 + (str == null ? 0 : str.hashCode())) * 31;
        h32.c1 c1Var = this.f23191d;
        int hashCode2 = (hashCode + (c1Var == null ? 0 : c1Var.hashCode())) * 31;
        Integer num = this.f23192e;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f23193f;
        return Boolean.hashCode(this.f23195h) + ep.b.e(this.f23194g, (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AttemptDeepLink(pin=");
        sb3.append(this.f23188a);
        sb3.append(", shouldLog=");
        sb3.append(this.f23189b);
        sb3.append(", insertionId=");
        sb3.append(this.f23190c);
        sb3.append(", eventData=");
        sb3.append(this.f23191d);
        sb3.append(", collectionSelectedPosition=");
        sb3.append(this.f23192e);
        sb3.append(", storyType=");
        sb3.append(this.f23193f);
        sb3.append(", shouldLogPrice=");
        sb3.append(this.f23194g);
        sb3.append(", shouldLogRating=");
        return a.a.r(sb3, this.f23195h, ")");
    }
}
