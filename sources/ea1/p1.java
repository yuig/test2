package ea1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes5.dex */
public final class p1 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.l0 f58102a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f58103b;

    /* renamed from: c, reason: collision with root package name */
    public final e82.w f58104c;

    /* renamed from: d, reason: collision with root package name */
    public final String f58105d;

    /* renamed from: e, reason: collision with root package name */
    public final String f58106e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f58107f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f58108g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f58109h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f58110i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f58111j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f58112k;

    public p1(zy.l0 pinalyticsVMState, boolean z13, e82.w network, String str, String str2, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(network, "network");
        this.f58102a = pinalyticsVMState;
        this.f58103b = z13;
        this.f58104c = network;
        this.f58105d = str;
        this.f58106e = str2;
        this.f58107f = z14;
        this.f58108g = z15;
        this.f58109h = z16;
        this.f58110i = z17;
        this.f58111j = z18;
        this.f58112k = z19;
    }

    public static p1 b(p1 p1Var, zy.l0 l0Var, boolean z13, String str, String str2, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i13) {
        zy.l0 pinalyticsVMState = (i13 & 1) != 0 ? p1Var.f58102a : l0Var;
        boolean z23 = (i13 & 2) != 0 ? p1Var.f58103b : z13;
        e82.w network = p1Var.f58104c;
        String str3 = (i13 & 8) != 0 ? p1Var.f58105d : str;
        String str4 = (i13 & 16) != 0 ? p1Var.f58106e : str2;
        boolean z24 = (i13 & 32) != 0 ? p1Var.f58107f : z14;
        boolean z25 = (i13 & 64) != 0 ? p1Var.f58108g : z15;
        boolean z26 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? p1Var.f58109h : z16;
        boolean z27 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? p1Var.f58110i : z17;
        boolean z28 = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? p1Var.f58111j : z18;
        boolean z29 = (i13 & 1024) != 0 ? p1Var.f58112k : z19;
        p1Var.getClass();
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(network, "network");
        return new p1(pinalyticsVMState, z23, network, str3, str4, z24, z25, z26, z27, z28, z29);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return Intrinsics.d(this.f58102a, p1Var.f58102a) && this.f58103b == p1Var.f58103b && this.f58104c == p1Var.f58104c && Intrinsics.d(this.f58105d, p1Var.f58105d) && Intrinsics.d(this.f58106e, p1Var.f58106e) && this.f58107f == p1Var.f58107f && this.f58108g == p1Var.f58108g && this.f58109h == p1Var.f58109h && this.f58110i == p1Var.f58110i && this.f58111j == p1Var.f58111j && this.f58112k == p1Var.f58112k;
    }

    public final int hashCode() {
        int hashCode = (this.f58104c.hashCode() + ep.b.e(this.f58103b, this.f58102a.hashCode() * 31, 31)) * 31;
        String str = this.f58105d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f58106e;
        return Boolean.hashCode(this.f58112k) + ep.b.e(this.f58111j, ep.b.e(this.f58110i, ep.b.e(this.f58109h, ep.b.e(this.f58108g, ep.b.e(this.f58107f, (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ClaimRedesignVMState(pinalyticsVMState=");
        sb3.append(this.f58102a);
        sb3.append(", isReclaiming=");
        sb3.append(this.f58103b);
        sb3.append(", network=");
        sb3.append(this.f58104c);
        sb3.append(", boardId=");
        sb3.append(this.f58105d);
        sb3.append(", sectionId=");
        sb3.append(this.f58106e);
        sb3.append(", isAutoPublishEnabled=");
        sb3.append(this.f58107f);
        sb3.append(", isAutoOrgEnabled=");
        sb3.append(this.f58108g);
        sb3.append(", isAutoOrgFeatureEnabled=");
        sb3.append(this.f58109h);
        sb3.append(", shouldShowPrivateBoardMessage=");
        sb3.append(this.f58110i);
        sb3.append(", isConnected=");
        sb3.append(this.f58111j);
        sb3.append(", isConnectedToNewAPI=");
        return a.a.r(sb3, this.f58112k, ")");
    }
}
