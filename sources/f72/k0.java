package f72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class k0 {

    @NotNull
    public static final j0 Companion = new j0();

    /* renamed from: a, reason: collision with root package name */
    public final String f61288a;

    /* renamed from: b, reason: collision with root package name */
    public final String f61289b;

    /* renamed from: c, reason: collision with root package name */
    public final String f61290c;

    /* renamed from: d, reason: collision with root package name */
    public final String f61291d;

    /* renamed from: e, reason: collision with root package name */
    public final String f61292e;

    /* renamed from: f, reason: collision with root package name */
    public final String f61293f;

    public k0(int i13, String str, String str2, String str3, String str4, String str5, String str6) {
        if (63 != (i13 & 63)) {
            kg.t.b1(i13, 63, i0.f61275b);
            throw null;
        }
        this.f61288a = str;
        this.f61289b = str2;
        this.f61290c = str3;
        this.f61291d = str4;
        this.f61292e = str5;
        this.f61293f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Intrinsics.d(this.f61288a, k0Var.f61288a) && Intrinsics.d(this.f61289b, k0Var.f61289b) && Intrinsics.d(this.f61290c, k0Var.f61290c) && Intrinsics.d(this.f61291d, k0Var.f61291d) && Intrinsics.d(this.f61292e, k0Var.f61292e) && Intrinsics.d(this.f61293f, k0Var.f61293f);
    }

    public final int hashCode() {
        String str = this.f61288a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f61289b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f61290c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f61291d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f61292e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f61293f;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Attribution(author=");
        sb3.append(this.f61288a);
        sb3.append(", provider_name=");
        sb3.append(this.f61289b);
        sb3.append(", title=");
        sb3.append(this.f61290c);
        sb3.append(", link=");
        sb3.append(this.f61291d);
        sb3.append(", author_url=");
        sb3.append(this.f61292e);
        sb3.append(", author_image_url=");
        return a.a.p(sb3, this.f61293f, ")");
    }
}
