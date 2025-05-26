package r72;

import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f2 {

    /* renamed from: j, reason: collision with root package name */
    public static final f2 f106468j;

    /* renamed from: a, reason: collision with root package name */
    public final String f106469a;

    /* renamed from: b, reason: collision with root package name */
    public final List f106470b;

    /* renamed from: c, reason: collision with root package name */
    public final String f106471c;

    /* renamed from: d, reason: collision with root package name */
    public final String f106472d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f106473e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f106474f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f106475g;

    /* renamed from: h, reason: collision with root package name */
    public final q1 f106476h;

    /* renamed from: i, reason: collision with root package name */
    public final i1 f106477i;

    static {
        int i13 = t1.f106663a;
        f106468j = new f2("-1", kotlin.collections.q0.f80391a, null, null, true, false, true, q1.f106625d, i1.f106497c);
    }

    public f2(String id3, List items, String str, String str2, boolean z13, boolean z14, boolean z15, q1 shuffleEffectData, i1 mask) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(shuffleEffectData, "shuffleEffectData");
        Intrinsics.checkNotNullParameter(mask, "mask");
        this.f106469a = id3;
        this.f106470b = items;
        this.f106471c = str;
        this.f106472d = str2;
        this.f106473e = z13;
        this.f106474f = z14;
        this.f106475g = z15;
        this.f106476h = shuffleEffectData;
        this.f106477i = mask;
    }

    public static f2 a(f2 f2Var, String str, List list, String str2, String str3, q1 q1Var, int i13) {
        String id3 = (i13 & 1) != 0 ? f2Var.f106469a : str;
        List items = (i13 & 2) != 0 ? f2Var.f106470b : list;
        String str4 = (i13 & 4) != 0 ? f2Var.f106471c : str2;
        String str5 = (i13 & 8) != 0 ? f2Var.f106472d : str3;
        boolean z13 = f2Var.f106473e;
        boolean z14 = f2Var.f106474f;
        boolean z15 = f2Var.f106475g;
        q1 shuffleEffectData = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? f2Var.f106476h : q1Var;
        i1 mask = f2Var.f106477i;
        f2Var.getClass();
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(shuffleEffectData, "shuffleEffectData");
        Intrinsics.checkNotNullParameter(mask, "mask");
        return new f2(id3, items, str4, str5, z13, z14, z15, shuffleEffectData, mask);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj;
        String str = f2Var.f106469a;
        int i13 = t1.f106663a;
        if (!Intrinsics.d(this.f106469a, str) || !Intrinsics.d(this.f106470b, f2Var.f106470b)) {
            return false;
        }
        String str2 = this.f106471c;
        String str3 = f2Var.f106471c;
        if (str2 != null ? str3 != null && Intrinsics.d(str2, str3) : str3 == null) {
            return Intrinsics.d(this.f106472d, f2Var.f106472d) && this.f106473e == f2Var.f106473e && this.f106474f == f2Var.f106474f && this.f106475g == f2Var.f106475g && Intrinsics.d(this.f106476h, f2Var.f106476h) && Intrinsics.d(this.f106477i, f2Var.f106477i);
        }
        return false;
    }

    public final int hashCode() {
        int i13 = t1.f106663a;
        int c13 = ep.b.c(this.f106470b, this.f106469a.hashCode() * 31, 31);
        String str = this.f106471c;
        int hashCode = (c13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f106472d;
        return this.f106477i.hashCode() + ((this.f106476h.hashCode() + ep.b.e(this.f106475g, ep.b.e(this.f106474f, ep.b.e(this.f106473e, (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        int i13 = t1.f106663a;
        String p13 = a.a.p(new StringBuilder("ShuffleId(value="), this.f106469a, ")");
        String str = this.f106471c;
        String k13 = str == null ? "null" : a.a.k("ShuffleId(value=", str, ")");
        StringBuilder o13 = cb.o("ShuffleUploadData(id=", p13, ", items=");
        o13.append(this.f106470b);
        o13.append(", parentId=");
        o13.append(k13);
        o13.append(", details=");
        o13.append(this.f106472d);
        o13.append(", isDraft=");
        o13.append(this.f106473e);
        o13.append(", isFinished=");
        o13.append(this.f106474f);
        o13.append(", isPrivate=");
        o13.append(this.f106475g);
        o13.append(", shuffleEffectData=");
        o13.append(this.f106476h);
        o13.append(", mask=");
        o13.append(this.f106477i);
        o13.append(")");
        return o13.toString();
    }
}
