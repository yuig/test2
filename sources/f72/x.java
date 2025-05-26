package f72;

import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import g72.x4;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class x {
    public final String A;

    /* renamed from: a, reason: collision with root package name */
    public final String f61382a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f61383b;

    /* renamed from: c, reason: collision with root package name */
    public final i f61384c;

    /* renamed from: d, reason: collision with root package name */
    public final int f61385d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f61386e;

    /* renamed from: f, reason: collision with root package name */
    public final String f61387f;

    /* renamed from: g, reason: collision with root package name */
    public final String f61388g;

    /* renamed from: h, reason: collision with root package name */
    public final int f61389h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f61390i;

    /* renamed from: j, reason: collision with root package name */
    public final String f61391j;

    /* renamed from: k, reason: collision with root package name */
    public final String f61392k;

    /* renamed from: l, reason: collision with root package name */
    public final o f61393l;

    /* renamed from: m, reason: collision with root package name */
    public final List f61394m;

    /* renamed from: n, reason: collision with root package name */
    public final String f61395n;

    /* renamed from: o, reason: collision with root package name */
    public final String f61396o;

    /* renamed from: p, reason: collision with root package name */
    public final Boolean f61397p;

    /* renamed from: q, reason: collision with root package name */
    public final int f61398q;

    /* renamed from: r, reason: collision with root package name */
    public final int f61399r;

    /* renamed from: s, reason: collision with root package name */
    public final d72.f f61400s;

    /* renamed from: t, reason: collision with root package name */
    public final x4 f61401t;

    /* renamed from: u, reason: collision with root package name */
    public final x f61402u;

    /* renamed from: v, reason: collision with root package name */
    public final x f61403v;

    /* renamed from: w, reason: collision with root package name */
    public final c f61404w;

    /* renamed from: x, reason: collision with root package name */
    public final Long f61405x;

    /* renamed from: y, reason: collision with root package name */
    public final String f61406y;

    /* renamed from: z, reason: collision with root package name */
    public final Integer f61407z;

    @NotNull
    public static final w Companion = new w();
    public static final no2.b[] B = {null, null, null, null, null, null, null, null, null, null, null, null, new qo2.d(b0.f61232a, 0), null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    public x(int i13, String str, Boolean bool, i iVar, int i14, boolean z13, String str2, String str3, int i15, Boolean bool2, String str4, String str5, o oVar, List list, String str6, String str7, Boolean bool3, int i16, int i17, d72.f fVar, x4 x4Var, x xVar, x xVar2, c cVar, Long l13, String str8, Integer num, String str9) {
        if (199817 != (i13 & 199817)) {
            kg.t.b1(i13, 199817, v.f61374b);
            throw null;
        }
        this.f61382a = str;
        this.f61383b = (i13 & 2) == 0 ? Boolean.FALSE : bool;
        if ((i13 & 4) == 0) {
            this.f61384c = null;
        } else {
            this.f61384c = iVar;
        }
        this.f61385d = i14;
        this.f61386e = (i13 & 16) == 0 ? true : z13;
        if ((i13 & 32) == 0) {
            this.f61387f = null;
        } else {
            this.f61387f = str2;
        }
        if ((i13 & 64) == 0) {
            this.f61388g = null;
        } else {
            this.f61388g = str3;
        }
        this.f61389h = i15;
        this.f61390i = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 0 ? Boolean.FALSE : bool2;
        if ((i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 0) {
            this.f61391j = null;
        } else {
            this.f61391j = str4;
        }
        this.f61392k = str5;
        this.f61393l = oVar;
        if ((i13 & 4096) == 0) {
            this.f61394m = null;
        } else {
            this.f61394m = list;
        }
        if ((i13 & 8192) == 0) {
            this.f61395n = null;
        } else {
            this.f61395n = str6;
        }
        if ((i13 & 16384) == 0) {
            this.f61396o = null;
        } else {
            this.f61396o = str7;
        }
        this.f61397p = (32768 & i13) == 0 ? Boolean.FALSE : bool3;
        this.f61398q = i16;
        this.f61399r = i17;
        if ((262144 & i13) == 0) {
            this.f61400s = null;
        } else {
            this.f61400s = fVar;
        }
        if ((524288 & i13) == 0) {
            this.f61401t = null;
        } else {
            this.f61401t = x4Var;
        }
        if ((1048576 & i13) == 0) {
            this.f61402u = null;
        } else {
            this.f61402u = xVar;
        }
        if ((2097152 & i13) == 0) {
            this.f61403v = null;
        } else {
            this.f61403v = xVar2;
        }
        if ((4194304 & i13) == 0) {
            this.f61404w = null;
        } else {
            this.f61404w = cVar;
        }
        if ((8388608 & i13) == 0) {
            this.f61405x = null;
        } else {
            this.f61405x = l13;
        }
        if ((16777216 & i13) == 0) {
            this.f61406y = null;
        } else {
            this.f61406y = str8;
        }
        if ((33554432 & i13) == 0) {
            this.f61407z = null;
        } else {
            this.f61407z = num;
        }
        if ((i13 & 67108864) == 0) {
            this.A = null;
        } else {
            this.A = str9;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.f61382a, xVar.f61382a) && Intrinsics.d(this.f61383b, xVar.f61383b) && Intrinsics.d(this.f61384c, xVar.f61384c) && this.f61385d == xVar.f61385d && this.f61386e == xVar.f61386e && Intrinsics.d(this.f61387f, xVar.f61387f) && Intrinsics.d(this.f61388g, xVar.f61388g) && this.f61389h == xVar.f61389h && Intrinsics.d(this.f61390i, xVar.f61390i) && Intrinsics.d(this.f61391j, xVar.f61391j) && Intrinsics.d(this.f61392k, xVar.f61392k) && Intrinsics.d(this.f61393l, xVar.f61393l) && Intrinsics.d(this.f61394m, xVar.f61394m) && Intrinsics.d(this.f61395n, xVar.f61395n) && Intrinsics.d(this.f61396o, xVar.f61396o) && Intrinsics.d(this.f61397p, xVar.f61397p) && this.f61398q == xVar.f61398q && this.f61399r == xVar.f61399r && Intrinsics.d(this.f61400s, xVar.f61400s) && Intrinsics.d(this.f61401t, xVar.f61401t) && Intrinsics.d(this.f61402u, xVar.f61402u) && Intrinsics.d(this.f61403v, xVar.f61403v) && Intrinsics.d(this.f61404w, xVar.f61404w) && Intrinsics.d(this.f61405x, xVar.f61405x) && Intrinsics.d(this.f61406y, xVar.f61406y) && Intrinsics.d(this.f61407z, xVar.f61407z) && Intrinsics.d(this.A, xVar.A);
    }

    public final int hashCode() {
        int hashCode = this.f61382a.hashCode() * 31;
        Boolean bool = this.f61383b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        i iVar = this.f61384c;
        int e13 = ep.b.e(this.f61386e, ep.b.b(this.f61385d, (hashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31, 31), 31);
        String str = this.f61387f;
        int hashCode3 = (e13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f61388g;
        int b13 = ep.b.b(this.f61389h, (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Boolean bool2 = this.f61390i;
        int hashCode4 = (b13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.f61391j;
        int b14 = ep.b.b(this.f61393l.f61322a, cb.d(this.f61392k, (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31);
        List list = this.f61394m;
        int hashCode5 = (b14 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.f61395n;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f61396o;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool3 = this.f61397p;
        int b15 = ep.b.b(this.f61399r, ep.b.b(this.f61398q, (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31, 31), 31);
        d72.f fVar = this.f61400s;
        int hashCode8 = (b15 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        x4 x4Var = this.f61401t;
        int hashCode9 = (hashCode8 + (x4Var == null ? 0 : x4Var.hashCode())) * 31;
        x xVar = this.f61402u;
        int hashCode10 = (hashCode9 + (xVar == null ? 0 : xVar.hashCode())) * 31;
        x xVar2 = this.f61403v;
        int hashCode11 = (hashCode10 + (xVar2 == null ? 0 : xVar2.hashCode())) * 31;
        c cVar = this.f61404w;
        int hashCode12 = (hashCode11 + (cVar == null ? 0 : cVar.f61237a.hashCode())) * 31;
        Long l13 = this.f61405x;
        int hashCode13 = (hashCode12 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str6 = this.f61406y;
        int hashCode14 = (hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.f61407z;
        int hashCode15 = (hashCode14 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.A;
        return hashCode15 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShuffleEntity(id=");
        sb3.append(this.f61382a);
        sb3.append(", is_draft=");
        sb3.append(this.f61383b);
        sb3.append(", images=");
        sb3.append(this.f61384c);
        sb3.append(", posted_comments_count=");
        sb3.append(this.f61385d);
        sb3.append(", is_compatible=");
        sb3.append(this.f61386e);
        sb3.append(", details=");
        sb3.append(this.f61387f);
        sb3.append(", updated_at=");
        sb3.append(this.f61388g);
        sb3.append(", comments_count=");
        sb3.append(this.f61389h);
        sb3.append(", private=");
        sb3.append(this.f61390i);
        sb3.append(", created_at=");
        sb3.append(this.f61391j);
        sb3.append(", type=");
        sb3.append(this.f61392k);
        sb3.append(", reaction_counts=");
        sb3.append(this.f61393l);
        sb3.append(", items=");
        sb3.append(this.f61394m);
        sb3.append(", link=");
        sb3.append(this.f61395n);
        sb3.append(", posted_at=");
        sb3.append(this.f61396o);
        sb3.append(", is_finished=");
        sb3.append(this.f61397p);
        sb3.append(", reaction_by_me=");
        sb3.append(this.f61398q);
        sb3.append(", descendants_count=");
        sb3.append(this.f61399r);
        sb3.append(", user=");
        sb3.append(this.f61400s);
        sb3.append(", effect_data=");
        sb3.append(this.f61401t);
        sb3.append(", parent=");
        sb3.append(this.f61402u);
        sb3.append(", root=");
        sb3.append(this.f61403v);
        sb3.append(", canonical_pin=");
        sb3.append(this.f61404w);
        sb3.append(", edge_score=");
        sb3.append(this.f61405x);
        sb3.append(", image_tracking_id=");
        sb3.append(this.f61406y);
        sb3.append(", source_app_type_detailed=");
        sb3.append(this.f61407z);
        sb3.append(", version=");
        return a.a.p(sb3, this.A, ")");
    }
}
