package f72;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class m0 {

    @NotNull
    public static final l0 Companion = new l0();

    /* renamed from: a, reason: collision with root package name */
    public final String f61308a;

    /* renamed from: b, reason: collision with root package name */
    public final int f61309b;

    /* renamed from: c, reason: collision with root package name */
    public final String f61310c;

    /* renamed from: d, reason: collision with root package name */
    public final i f61311d;

    /* renamed from: e, reason: collision with root package name */
    public final String f61312e;

    /* renamed from: f, reason: collision with root package name */
    public final t1 f61313f;

    /* renamed from: g, reason: collision with root package name */
    public final k0 f61314g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f61315h;

    /* renamed from: i, reason: collision with root package name */
    public final String f61316i;

    /* renamed from: j, reason: collision with root package name */
    public final String f61317j;

    public m0(int i13, String str, int i14, String str2, i iVar, String str3, t1 t1Var, k0 k0Var, boolean z13, String str4, String str5) {
        if (1 != (i13 & 1)) {
            kg.t.b1(i13, 1, h0.f61268b);
            throw null;
        }
        this.f61308a = str;
        if ((i13 & 2) == 0) {
            this.f61309b = 1;
        } else {
            this.f61309b = i14;
        }
        if ((i13 & 4) == 0) {
            this.f61310c = null;
        } else {
            this.f61310c = str2;
        }
        if ((i13 & 8) == 0) {
            this.f61311d = null;
        } else {
            this.f61311d = iVar;
        }
        if ((i13 & 16) == 0) {
            this.f61312e = null;
        } else {
            this.f61312e = str3;
        }
        if ((i13 & 32) == 0) {
            this.f61313f = null;
        } else {
            this.f61313f = t1Var;
        }
        if ((i13 & 64) == 0) {
            this.f61314g = null;
        } else {
            this.f61314g = k0Var;
        }
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0) {
            this.f61315h = true;
        } else {
            this.f61315h = z13;
        }
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 0) {
            this.f61316i = null;
        } else {
            this.f61316i = str4;
        }
        if ((i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 0) {
            this.f61317j = null;
        } else {
            this.f61317j = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Intrinsics.d(this.f61308a, m0Var.f61308a) && this.f61309b == m0Var.f61309b && Intrinsics.d(this.f61310c, m0Var.f61310c) && Intrinsics.d(this.f61311d, m0Var.f61311d) && Intrinsics.d(this.f61312e, m0Var.f61312e) && Intrinsics.d(this.f61313f, m0Var.f61313f) && Intrinsics.d(this.f61314g, m0Var.f61314g) && this.f61315h == m0Var.f61315h && Intrinsics.d(this.f61316i, m0Var.f61316i) && Intrinsics.d(this.f61317j, m0Var.f61317j);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f61309b, this.f61308a.hashCode() * 31, 31);
        String str = this.f61310c;
        int hashCode = (b13 + (str == null ? 0 : str.hashCode())) * 31;
        i iVar = this.f61311d;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str2 = this.f61312e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        t1 t1Var = this.f61313f;
        int hashCode4 = (hashCode3 + (t1Var == null ? 0 : t1Var.f61363a.hashCode())) * 31;
        k0 k0Var = this.f61314g;
        int e13 = ep.b.e(this.f61315h, (hashCode4 + (k0Var == null ? 0 : k0Var.hashCode())) * 31, 31);
        String str3 = this.f61316i;
        int hashCode5 = (e13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f61317j;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShuffleItemImageEntity(id=");
        sb3.append(this.f61308a);
        sb3.append(", source=");
        sb3.append(this.f61309b);
        sb3.append(", file_name=");
        sb3.append(this.f61310c);
        sb3.append(", images=");
        sb3.append(this.f61311d);
        sb3.append(", asset_id=");
        sb3.append(this.f61312e);
        sb3.append(", user=");
        sb3.append(this.f61313f);
        sb3.append(", attribution=");
        sb3.append(this.f61314g);
        sb3.append(", community_available=");
        sb3.append(this.f61315h);
        sb3.append(", mask=");
        sb3.append(this.f61316i);
        sb3.append(", image_tracking_id=");
        return a.a.p(sb3, this.f61317j, ")");
    }
}
