package ea1;

import com.pinterest.api.model.ba;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes5.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f58011a;

    /* renamed from: b, reason: collision with root package name */
    public final wy0 f58012b;

    /* renamed from: c, reason: collision with root package name */
    public final zy.a0 f58013c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f58014d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f58015e;

    /* renamed from: f, reason: collision with root package name */
    public final v7 f58016f;

    /* renamed from: g, reason: collision with root package name */
    public final ba f58017g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f58018h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f58019i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f58020j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f58021k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f58022l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f58023m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f58024n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f58025o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f58026p;

    /* renamed from: q, reason: collision with root package name */
    public final String f58027q;

    /* renamed from: r, reason: collision with root package name */
    public final String f58028r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f58029s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f58030t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f58031u;

    public a(boolean z13, wy0 wy0Var, zy.a0 pinalyticsDisplayState, boolean z14, Integer num, v7 v7Var, ba baVar, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z23, boolean z24, boolean z25, boolean z26, String str, String str2, boolean z27, Integer num2, boolean z28) {
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        this.f58011a = z13;
        this.f58012b = wy0Var;
        this.f58013c = pinalyticsDisplayState;
        this.f58014d = z14;
        this.f58015e = num;
        this.f58016f = v7Var;
        this.f58017g = baVar;
        this.f58018h = z15;
        this.f58019i = z16;
        this.f58020j = z17;
        this.f58021k = z18;
        this.f58022l = z19;
        this.f58023m = z23;
        this.f58024n = z24;
        this.f58025o = z25;
        this.f58026p = z26;
        this.f58027q = str;
        this.f58028r = str2;
        this.f58029s = z27;
        this.f58030t = num2;
        this.f58031u = z28;
    }

    public static a e(a aVar, boolean z13, wy0 wy0Var, zy.a0 a0Var, boolean z14, Integer num, v7 v7Var, ba baVar, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z23, boolean z24, boolean z25, String str, String str2, boolean z26, Integer num2, boolean z27, int i13) {
        boolean z28;
        boolean z29;
        boolean z33;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z34;
        boolean z35;
        Integer num3;
        boolean z36 = (i13 & 1) != 0 ? aVar.f58011a : z13;
        wy0 wy0Var2 = (i13 & 2) != 0 ? aVar.f58012b : wy0Var;
        zy.a0 pinalyticsDisplayState = (i13 & 4) != 0 ? aVar.f58013c : a0Var;
        boolean z37 = (i13 & 8) != 0 ? aVar.f58014d : z14;
        Integer num4 = (i13 & 16) != 0 ? aVar.f58015e : num;
        v7 v7Var2 = (i13 & 32) != 0 ? aVar.f58016f : v7Var;
        ba baVar2 = (i13 & 64) != 0 ? aVar.f58017g : baVar;
        boolean z38 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? aVar.f58018h : z15;
        boolean z39 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? aVar.f58019i : z16;
        boolean z43 = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? aVar.f58020j : z17;
        boolean z44 = (i13 & 1024) != 0 ? aVar.f58021k : z18;
        boolean z45 = (i13 & 2048) != 0 ? aVar.f58022l : z19;
        boolean z46 = (i13 & 4096) != 0 ? aVar.f58023m : z23;
        boolean z47 = aVar.f58024n;
        boolean z48 = (i13 & 16384) != 0 ? aVar.f58025o : z24;
        if ((i13 & 32768) != 0) {
            z28 = z48;
            z29 = aVar.f58026p;
        } else {
            z28 = z48;
            z29 = z25;
        }
        if ((i13 & 65536) != 0) {
            z33 = z29;
            str3 = aVar.f58027q;
        } else {
            z33 = z29;
            str3 = str;
        }
        if ((i13 & 131072) != 0) {
            str4 = str3;
            str5 = aVar.f58028r;
        } else {
            str4 = str3;
            str5 = str2;
        }
        if ((i13 & 262144) != 0) {
            str6 = str5;
            z34 = aVar.f58029s;
        } else {
            str6 = str5;
            z34 = z26;
        }
        if ((i13 & 524288) != 0) {
            z35 = z34;
            num3 = aVar.f58030t;
        } else {
            z35 = z34;
            num3 = num2;
        }
        boolean z49 = (i13 & 1048576) != 0 ? aVar.f58031u : z27;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        return new a(z36, wy0Var2, pinalyticsDisplayState, z37, num4, v7Var2, baVar2, z38, z39, z43, z44, z45, z46, z47, z28, z33, str4, str6, z35, num3, z49);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f58011a == aVar.f58011a && Intrinsics.d(this.f58012b, aVar.f58012b) && Intrinsics.d(this.f58013c, aVar.f58013c) && this.f58014d == aVar.f58014d && Intrinsics.d(this.f58015e, aVar.f58015e) && Intrinsics.d(this.f58016f, aVar.f58016f) && Intrinsics.d(this.f58017g, aVar.f58017g) && this.f58018h == aVar.f58018h && this.f58019i == aVar.f58019i && this.f58020j == aVar.f58020j && this.f58021k == aVar.f58021k && this.f58022l == aVar.f58022l && this.f58023m == aVar.f58023m && this.f58024n == aVar.f58024n && this.f58025o == aVar.f58025o && this.f58026p == aVar.f58026p && Intrinsics.d(this.f58027q, aVar.f58027q) && Intrinsics.d(this.f58028r, aVar.f58028r) && this.f58029s == aVar.f58029s && Intrinsics.d(this.f58030t, aVar.f58030t) && this.f58031u == aVar.f58031u;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f58011a) * 31;
        wy0 wy0Var = this.f58012b;
        int e13 = ep.b.e(this.f58014d, (this.f58013c.hashCode() + ((hashCode + (wy0Var == null ? 0 : wy0Var.hashCode())) * 31)) * 31, 31);
        Integer num = this.f58015e;
        int hashCode2 = (e13 + (num == null ? 0 : num.hashCode())) * 31;
        v7 v7Var = this.f58016f;
        int hashCode3 = (hashCode2 + (v7Var == null ? 0 : v7Var.hashCode())) * 31;
        ba baVar = this.f58017g;
        int e14 = ep.b.e(this.f58026p, ep.b.e(this.f58025o, ep.b.e(this.f58024n, ep.b.e(this.f58023m, ep.b.e(this.f58022l, ep.b.e(this.f58021k, ep.b.e(this.f58020j, ep.b.e(this.f58019i, ep.b.e(this.f58018h, (hashCode3 + (baVar == null ? 0 : baVar.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        String str = this.f58027q;
        int hashCode4 = (e14 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f58028r;
        int e15 = ep.b.e(this.f58029s, (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Integer num2 = this.f58030t;
        return Boolean.hashCode(this.f58031u) + ((e15 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ClaimRedesignDisplayState(isLoading=");
        sb3.append(this.f58011a);
        sb3.append(", user=");
        sb3.append(this.f58012b);
        sb3.append(", pinalyticsDisplayState=");
        sb3.append(this.f58013c);
        sb3.append(", showUnclaimModal=");
        sb3.append(this.f58014d);
        sb3.append(", errorStringId=");
        sb3.append(this.f58015e);
        sb3.append(", board=");
        sb3.append(this.f58016f);
        sb3.append(", section=");
        sb3.append(this.f58017g);
        sb3.append(", shouldShowBoardError=");
        sb3.append(this.f58018h);
        sb3.append(", isAutoPublishEnabled=");
        sb3.append(this.f58019i);
        sb3.append(", showProfileBoard=");
        sb3.append(this.f58020j);
        sb3.append(", isPrivateBoard=");
        sb3.append(this.f58021k);
        sb3.append(", shouldShowPrivateBoardMessage=");
        sb3.append(this.f58022l);
        sb3.append(", autoPublishToggleState=");
        sb3.append(this.f58023m);
        sb3.append(", showAutoControlTogglesV2=");
        sb3.append(this.f58024n);
        sb3.append(", autoOrgToggleState=");
        sb3.append(this.f58025o);
        sb3.append(", autoOrgToggleEnabled=");
        sb3.append(this.f58026p);
        sb3.append(", fallbackBoardName=");
        sb3.append(this.f58027q);
        sb3.append(", fallbackBoardImageUrl=");
        sb3.append(this.f58028r);
        sb3.append(", fallbackBoardIsQuickSavesBoard=");
        sb3.append(this.f58029s);
        sb3.append(", apiMigrationErrorStringId=");
        sb3.append(this.f58030t);
        sb3.append(", isApiMigrationWarning=");
        return a.a.r(sb3, this.f58031u, ")");
    }
}
