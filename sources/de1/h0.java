package de1;

import a.cb;
import com.pinterest.api.model.px0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final px0 f54572a;

    /* renamed from: b, reason: collision with root package name */
    public final String f54573b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f54574c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f54575d;

    /* renamed from: e, reason: collision with root package name */
    public final String f54576e;

    /* renamed from: f, reason: collision with root package name */
    public final String f54577f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f54578g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f54579h;

    /* renamed from: i, reason: collision with root package name */
    public final String f54580i;

    public /* synthetic */ h0(px0 px0Var, String str, String str2, boolean z13, String str3, int i13) {
        this((i13 & 1) != 0 ? null : px0Var, (i13 & 2) != 0 ? "" : str, null, false, null, (i13 & 32) != 0 ? null : str2, null, z13, str3);
    }

    public static h0 a(h0 h0Var, px0 px0Var, String str, ArrayList arrayList, boolean z13, String str2, int i13) {
        px0 px0Var2 = (i13 & 1) != 0 ? h0Var.f54572a : px0Var;
        String title = (i13 & 2) != 0 ? h0Var.f54573b : str;
        Intrinsics.checkNotNullParameter(title, "title");
        return new h0(px0Var2, title, arrayList, z13, str2, h0Var.f54577f, h0Var.f54578g, h0Var.f54579h, h0Var.f54580i);
    }

    public final String b() {
        return this.f54577f;
    }

    public final String c() {
        return this.f54580i;
    }

    public final ArrayList d() {
        return this.f54574c;
    }

    public final String e() {
        return this.f54576e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return Intrinsics.d(this.f54572a, h0Var.f54572a) && Intrinsics.d(this.f54573b, h0Var.f54573b) && Intrinsics.d(this.f54574c, h0Var.f54574c) && this.f54575d == h0Var.f54575d && Intrinsics.d(this.f54576e, h0Var.f54576e) && Intrinsics.d(this.f54577f, h0Var.f54577f) && Intrinsics.d(this.f54578g, h0Var.f54578g) && this.f54579h == h0Var.f54579h && Intrinsics.d(this.f54580i, h0Var.f54580i);
    }

    public final String f() {
        return this.f54573b;
    }

    public final px0 g() {
        return this.f54572a;
    }

    public final boolean h() {
        return this.f54575d;
    }

    public final int hashCode() {
        px0 px0Var = this.f54572a;
        int d2 = cb.d(this.f54573b, (px0Var == null ? 0 : px0Var.hashCode()) * 31, 31);
        ArrayList arrayList = this.f54574c;
        int e13 = ep.b.e(this.f54575d, (d2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31, 31);
        String str = this.f54576e;
        int hashCode = (e13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f54577f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ArrayList arrayList2 = this.f54578g;
        int e14 = ep.b.e(this.f54579h, (hashCode2 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31, 31);
        String str3 = this.f54580i;
        return e14 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UnifiedInlineFilterDataModel(unifiedFilterData=");
        sb3.append(this.f54572a);
        sb3.append(", title=");
        sb3.append(this.f54573b);
        sb3.append(", productFilterList=");
        sb3.append(this.f54574c);
        sb3.append(", isAppliedFilter=");
        sb3.append(this.f54575d);
        sb3.append(", productFilterType=");
        sb3.append(this.f54576e);
        sb3.append(", currency=");
        sb3.append(this.f54577f);
        sb3.append(", appliedFilterList=");
        sb3.append(this.f54578g);
        sb3.append(", isOnebarModuleSelected=");
        sb3.append(this.f54579h);
        sb3.append(", moduleId=");
        return a.a.p(sb3, this.f54580i, ")");
    }

    public h0(px0 px0Var, String title, ArrayList arrayList, boolean z13, String str, String str2, ArrayList arrayList2, boolean z14, String str3) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f54572a = px0Var;
        this.f54573b = title;
        this.f54574c = arrayList;
        this.f54575d = z13;
        this.f54576e = str;
        this.f54577f = str2;
        this.f54578g = arrayList2;
        this.f54579h = z14;
        this.f54580i = str3;
    }
}
