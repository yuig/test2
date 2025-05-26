package px1;

import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f101681a;

    /* renamed from: b, reason: collision with root package name */
    public final String f101682b;

    /* renamed from: c, reason: collision with root package name */
    public final String f101683c;

    /* renamed from: d, reason: collision with root package name */
    public final String f101684d;

    /* renamed from: e, reason: collision with root package name */
    public final String f101685e;

    /* renamed from: f, reason: collision with root package name */
    public final String f101686f;

    /* renamed from: g, reason: collision with root package name */
    public final int f101687g;

    /* renamed from: h, reason: collision with root package name */
    public final List f101688h;

    public q(int i13, String description, String str, String str2, String str3, String str4, List nestedSelectionList, int i14) {
        str = (i14 & 4) != 0 ? null : str;
        str2 = (i14 & 8) != 0 ? null : str2;
        str3 = (i14 & 16) != 0 ? null : str3;
        str4 = (i14 & 32) != 0 ? null : str4;
        nestedSelectionList = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? q0.f80391a : nestedSelectionList;
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(nestedSelectionList, "nestedSelectionList");
        this.f101681a = i13;
        this.f101682b = description;
        this.f101683c = str;
        this.f101684d = str2;
        this.f101685e = str3;
        this.f101686f = str4;
        this.f101687g = 0;
        this.f101688h = nestedSelectionList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f101681a == qVar.f101681a && Intrinsics.d(this.f101682b, qVar.f101682b) && Intrinsics.d(this.f101683c, qVar.f101683c) && Intrinsics.d(this.f101684d, qVar.f101684d) && Intrinsics.d(this.f101685e, qVar.f101685e) && Intrinsics.d(this.f101686f, qVar.f101686f) && this.f101687g == qVar.f101687g && Intrinsics.d(this.f101688h, qVar.f101688h);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f101682b, Integer.hashCode(this.f101681a) * 31, 31);
        String str = this.f101683c;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f101684d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f101685e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f101686f;
        return this.f101688h.hashCode() + ep.b.b(this.f101687g, (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FilterSelection(position=");
        sb3.append(this.f101681a);
        sb3.append(", description=");
        sb3.append(this.f101682b);
        sb3.append(", name=");
        sb3.append(this.f101683c);
        sb3.append(", disclaimer=");
        sb3.append(this.f101684d);
        sb3.append(", nestedSelectionTitle=");
        sb3.append(this.f101685e);
        sb3.append(", nestedSelectionDisclaimer=");
        sb3.append(this.f101686f);
        sb3.append(", subSelectionSelectedPosition=");
        sb3.append(this.f101687g);
        sb3.append(", nestedSelectionList=");
        return a.c.j(sb3, this.f101688h, ")");
    }
}
