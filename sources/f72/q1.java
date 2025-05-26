package f72;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import g72.x4;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class q1 {

    @NotNull
    public static final d1 Companion = new d1();

    /* renamed from: i, reason: collision with root package name */
    public static final no2.b[] f61340i = {new qo2.d(q0.f61339b, 0), null, null, null, null, null, null, null};

    /* renamed from: a, reason: collision with root package name */
    public final List f61341a;

    /* renamed from: b, reason: collision with root package name */
    public final String f61342b;

    /* renamed from: c, reason: collision with root package name */
    public final String f61343c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f61344d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f61345e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f61346f;

    /* renamed from: g, reason: collision with root package name */
    public final x4 f61347g;

    /* renamed from: h, reason: collision with root package name */
    public final String f61348h;

    public q1(int i13, List list, String str, String str2, boolean z13, boolean z14, boolean z15, x4 x4Var, String str3) {
        if (127 != (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK)) {
            kg.t.b1(i13, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK, c1.f61239b);
            throw null;
        }
        this.f61341a = list;
        this.f61342b = str;
        this.f61343c = str2;
        this.f61344d = z13;
        this.f61345e = z14;
        this.f61346f = z15;
        this.f61347g = x4Var;
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0) {
            this.f61348h = "1.0.270";
        } else {
            this.f61348h = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return Intrinsics.d(this.f61341a, q1Var.f61341a) && Intrinsics.d(this.f61342b, q1Var.f61342b) && Intrinsics.d(this.f61343c, q1Var.f61343c) && this.f61344d == q1Var.f61344d && this.f61345e == q1Var.f61345e && this.f61346f == q1Var.f61346f && Intrinsics.d(this.f61347g, q1Var.f61347g) && Intrinsics.d(this.f61348h, q1Var.f61348h);
    }

    public final int hashCode() {
        int hashCode = this.f61341a.hashCode() * 31;
        String str = this.f61342b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f61343c;
        int e13 = ep.b.e(this.f61346f, ep.b.e(this.f61345e, ep.b.e(this.f61344d, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31);
        x4 x4Var = this.f61347g;
        return this.f61348h.hashCode() + ((e13 + (x4Var != null ? x4Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShuffleUploadEntity(items=");
        sb3.append(this.f61341a);
        sb3.append(", parent_id=");
        sb3.append(this.f61342b);
        sb3.append(", details=");
        sb3.append(this.f61343c);
        sb3.append(", is_draft=");
        sb3.append(this.f61344d);
        sb3.append(", is_finished=");
        sb3.append(this.f61345e);
        sb3.append(", private=");
        sb3.append(this.f61346f);
        sb3.append(", effect_data=");
        sb3.append(this.f61347g);
        sb3.append(", compatible_version=");
        return a.a.p(sb3, this.f61348h, ")");
    }

    public q1(ArrayList items, String str, String str2, boolean z13, boolean z14, boolean z15, x4 x4Var) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter("1.0.270", "compatible_version");
        this.f61341a = items;
        this.f61342b = str;
        this.f61343c = str2;
        this.f61344d = z13;
        this.f61345e = z14;
        this.f61346f = z15;
        this.f61347g = x4Var;
        this.f61348h = "1.0.270";
    }
}
