package n70;

import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes5.dex */
public final class o0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f89635a;

    /* renamed from: b, reason: collision with root package name */
    public final String f89636b;

    /* renamed from: c, reason: collision with root package name */
    public final String f89637c;

    /* renamed from: d, reason: collision with root package name */
    public final String f89638d;

    /* renamed from: e, reason: collision with root package name */
    public final String f89639e;

    /* renamed from: f, reason: collision with root package name */
    public final String f89640f;

    /* renamed from: g, reason: collision with root package name */
    public final String f89641g;

    /* renamed from: h, reason: collision with root package name */
    public final String f89642h;

    /* renamed from: i, reason: collision with root package name */
    public final String f89643i;

    /* renamed from: j, reason: collision with root package name */
    public final String f89644j;

    /* renamed from: k, reason: collision with root package name */
    public final int f89645k;

    /* renamed from: l, reason: collision with root package name */
    public final o82.j0 f89646l;

    /* renamed from: m, reason: collision with root package name */
    public final zy.l0 f89647m;

    public o0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i13, o82.j0 multiSectionVMState, zy.l0 pinalyticsVMState) {
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f89635a = str;
        this.f89636b = str2;
        this.f89637c = str3;
        this.f89638d = str4;
        this.f89639e = str5;
        this.f89640f = str6;
        this.f89641g = str7;
        this.f89642h = str8;
        this.f89643i = str9;
        this.f89644j = str10;
        this.f89645k = i13;
        this.f89646l = multiSectionVMState;
        this.f89647m = pinalyticsVMState;
    }

    public static o0 b(o0 o0Var, String str, int i13, o82.j0 j0Var, zy.l0 l0Var, int i14) {
        String str2 = o0Var.f89635a;
        String str3 = o0Var.f89636b;
        String str4 = o0Var.f89637c;
        String str5 = o0Var.f89638d;
        String str6 = o0Var.f89639e;
        String str7 = o0Var.f89640f;
        String str8 = o0Var.f89641g;
        String str9 = o0Var.f89642h;
        String str10 = o0Var.f89643i;
        String str11 = (i14 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? o0Var.f89644j : str;
        int i15 = (i14 & 1024) != 0 ? o0Var.f89645k : i13;
        o82.j0 multiSectionVMState = (i14 & 2048) != 0 ? o0Var.f89646l : j0Var;
        zy.l0 pinalyticsVMState = (i14 & 4096) != 0 ? o0Var.f89647m : l0Var;
        o0Var.getClass();
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        return new o0(str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, i15, multiSectionVMState, pinalyticsVMState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Intrinsics.d(this.f89635a, o0Var.f89635a) && Intrinsics.d(this.f89636b, o0Var.f89636b) && Intrinsics.d(this.f89637c, o0Var.f89637c) && Intrinsics.d(this.f89638d, o0Var.f89638d) && Intrinsics.d(this.f89639e, o0Var.f89639e) && Intrinsics.d(this.f89640f, o0Var.f89640f) && Intrinsics.d(this.f89641g, o0Var.f89641g) && Intrinsics.d(this.f89642h, o0Var.f89642h) && Intrinsics.d(this.f89643i, o0Var.f89643i) && Intrinsics.d(this.f89644j, o0Var.f89644j) && this.f89645k == o0Var.f89645k && Intrinsics.d(this.f89646l, o0Var.f89646l) && Intrinsics.d(this.f89647m, o0Var.f89647m);
    }

    public final int hashCode() {
        String str = this.f89635a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f89636b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f89637c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f89638d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f89639e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f89640f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f89641g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f89642h;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f89643i;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f89644j;
        return this.f89647m.hashCode() + ep.b.c(this.f89646l.f93634a, ep.b.b(this.f89645k, (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        return "BoardShopToolVMState(boardId=" + this.f89635a + ", boardSessionId=" + this.f89636b + ", storyId=" + this.f89637c + ", pinId=" + this.f89638d + ", categoryId=" + this.f89639e + ", stlIds=" + this.f89640f + ", cropSource=" + this.f89641g + ", entrypoint=" + this.f89642h + ", requestParams=" + this.f89643i + ", appliedFilters=" + this.f89644j + ", activeSection=" + this.f89645k + ", multiSectionVMState=" + this.f89646l + ", pinalyticsVMState=" + this.f89647m + ")";
    }
}
