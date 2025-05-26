package e72;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* renamed from: a, reason: collision with root package name */
    public final String f57637a;

    /* renamed from: b, reason: collision with root package name */
    public final String f57638b;

    /* renamed from: c, reason: collision with root package name */
    public final String f57639c;

    /* renamed from: d, reason: collision with root package name */
    public final String f57640d;

    /* renamed from: e, reason: collision with root package name */
    public final String f57641e;

    /* renamed from: f, reason: collision with root package name */
    public final f72.i f57642f;

    /* renamed from: g, reason: collision with root package name */
    public final i f57643g;

    /* renamed from: h, reason: collision with root package name */
    public final i f57644h;

    /* renamed from: i, reason: collision with root package name */
    public final i f57645i;

    /* renamed from: j, reason: collision with root package name */
    public final u f57646j;

    /* renamed from: k, reason: collision with root package name */
    public final r f57647k;

    /* renamed from: l, reason: collision with root package name */
    public final o f57648l;

    /* renamed from: m, reason: collision with root package name */
    public final c f57649m;

    /* renamed from: n, reason: collision with root package name */
    public final String f57650n;

    /* renamed from: o, reason: collision with root package name */
    public final f72.r f57651o;

    public f(int i13, String str, String str2, String str3, String str4, String str5, f72.i iVar, i iVar2, i iVar3, i iVar4, u uVar, r rVar, o oVar, c cVar, String str6, f72.r rVar2) {
        if (1 != (i13 & 1)) {
            kg.t.b1(i13, 1, d.f57630b);
            throw null;
        }
        this.f57637a = str;
        if ((i13 & 2) == 0) {
            this.f57638b = null;
        } else {
            this.f57638b = str2;
        }
        if ((i13 & 4) == 0) {
            this.f57639c = null;
        } else {
            this.f57639c = str3;
        }
        if ((i13 & 8) == 0) {
            this.f57640d = null;
        } else {
            this.f57640d = str4;
        }
        if ((i13 & 16) == 0) {
            this.f57641e = null;
        } else {
            this.f57641e = str5;
        }
        if ((i13 & 32) == 0) {
            this.f57642f = null;
        } else {
            this.f57642f = iVar;
        }
        if ((i13 & 64) == 0) {
            this.f57643g = null;
        } else {
            this.f57643g = iVar2;
        }
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0) {
            this.f57644h = null;
        } else {
            this.f57644h = iVar3;
        }
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 0) {
            this.f57645i = null;
        } else {
            this.f57645i = iVar4;
        }
        if ((i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 0) {
            this.f57646j = null;
        } else {
            this.f57646j = uVar;
        }
        if ((i13 & 1024) == 0) {
            this.f57647k = null;
        } else {
            this.f57647k = rVar;
        }
        if ((i13 & 2048) == 0) {
            this.f57648l = null;
        } else {
            this.f57648l = oVar;
        }
        if ((i13 & 4096) == 0) {
            this.f57649m = null;
        } else {
            this.f57649m = cVar;
        }
        if ((i13 & 8192) == 0) {
            this.f57650n = null;
        } else {
            this.f57650n = str6;
        }
        if ((i13 & 16384) == 0) {
            this.f57651o = null;
        } else {
            this.f57651o = rVar2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f57637a, fVar.f57637a) && Intrinsics.d(this.f57638b, fVar.f57638b) && Intrinsics.d(this.f57639c, fVar.f57639c) && Intrinsics.d(this.f57640d, fVar.f57640d) && Intrinsics.d(this.f57641e, fVar.f57641e) && Intrinsics.d(this.f57642f, fVar.f57642f) && Intrinsics.d(this.f57643g, fVar.f57643g) && Intrinsics.d(this.f57644h, fVar.f57644h) && Intrinsics.d(this.f57645i, fVar.f57645i) && Intrinsics.d(this.f57646j, fVar.f57646j) && Intrinsics.d(this.f57647k, fVar.f57647k) && Intrinsics.d(this.f57648l, fVar.f57648l) && Intrinsics.d(this.f57649m, fVar.f57649m) && Intrinsics.d(this.f57650n, fVar.f57650n) && Intrinsics.d(this.f57651o, fVar.f57651o);
    }

    public final int hashCode() {
        int hashCode = this.f57637a.hashCode() * 31;
        String str = this.f57638b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57639c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57640d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f57641e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        f72.i iVar = this.f57642f;
        int hashCode6 = (hashCode5 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        i iVar2 = this.f57643g;
        int hashCode7 = (hashCode6 + (iVar2 == null ? 0 : iVar2.hashCode())) * 31;
        i iVar3 = this.f57644h;
        int hashCode8 = (hashCode7 + (iVar3 == null ? 0 : iVar3.hashCode())) * 31;
        i iVar4 = this.f57645i;
        int hashCode9 = (hashCode8 + (iVar4 == null ? 0 : iVar4.hashCode())) * 31;
        u uVar = this.f57646j;
        int hashCode10 = (hashCode9 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        r rVar = this.f57647k;
        int hashCode11 = (hashCode10 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        o oVar = this.f57648l;
        int hashCode12 = (hashCode11 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        c cVar = this.f57649m;
        int hashCode13 = (hashCode12 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str5 = this.f57650n;
        int hashCode14 = (hashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        f72.r rVar2 = this.f57651o;
        return hashCode14 + (rVar2 != null ? rVar2.hashCode() : 0);
    }

    public final String toString() {
        return "PinEntity(id=" + this.f57637a + ", image_signature=" + this.f57638b + ", title=" + this.f57639c + ", link=" + this.f57640d + ", cacheable_id=" + this.f57641e + ", images=" + this.f57642f + ", pinner=" + this.f57643g + ", origin_pinner=" + this.f57644h + ", native_creator=" + this.f57645i + ", rich_summary=" + this.f57646j + ", rich_metadata=" + this.f57647k + ", product_pin_data=" + this.f57648l + ", link_domain=" + this.f57649m + ", grid_title=" + this.f57650n + ", shuffle_asset=" + this.f57651o + ")";
    }
}
