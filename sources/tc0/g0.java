package tc0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes5.dex */
public final class g0 extends h0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f117256a;

    /* renamed from: b, reason: collision with root package name */
    public final String f117257b;

    /* renamed from: c, reason: collision with root package name */
    public final String f117258c;

    /* renamed from: d, reason: collision with root package name */
    public final List f117259d;

    /* renamed from: e, reason: collision with root package name */
    public final u2.q f117260e;

    /* renamed from: f, reason: collision with root package name */
    public final u2.q f117261f;

    /* renamed from: g, reason: collision with root package name */
    public final Function1 f117262g;

    /* renamed from: h, reason: collision with root package name */
    public final Function1 f117263h;

    /* renamed from: i, reason: collision with root package name */
    public final Function1 f117264i;

    /* renamed from: j, reason: collision with root package name */
    public final Function1 f117265j;

    public g0(String str, String str2, String str3, List provides, u2.q leftModifier, u2.q rightModifier, Function1 leftInverse, Function1 rightInverse, Function1 function1, Function1 function12, int i13) {
        str = (i13 & 1) != 0 ? null : str;
        str2 = (i13 & 2) != 0 ? null : str2;
        str3 = (i13 & 4) != 0 ? null : str3;
        provides = (i13 & 8) != 0 ? kotlin.collections.q0.f80391a : provides;
        int i14 = i13 & 16;
        u2.n nVar = u2.n.f120041b;
        leftModifier = i14 != 0 ? nVar : leftModifier;
        rightModifier = (i13 & 32) != 0 ? nVar : rightModifier;
        leftInverse = (i13 & 64) != 0 ? d.f117232q : leftInverse;
        rightInverse = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? d.f117233r : rightInverse;
        function12 = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : function12;
        Intrinsics.checkNotNullParameter(provides, "provides");
        Intrinsics.checkNotNullParameter(leftModifier, "leftModifier");
        Intrinsics.checkNotNullParameter(rightModifier, "rightModifier");
        Intrinsics.checkNotNullParameter(leftInverse, "leftInverse");
        Intrinsics.checkNotNullParameter(rightInverse, "rightInverse");
        this.f117256a = str;
        this.f117257b = str2;
        this.f117258c = str3;
        this.f117259d = provides;
        this.f117260e = leftModifier;
        this.f117261f = rightModifier;
        this.f117262g = leftInverse;
        this.f117263h = rightInverse;
        this.f117264i = function1;
        this.f117265j = function12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.d(this.f117256a, g0Var.f117256a) && Intrinsics.d(this.f117257b, g0Var.f117257b) && Intrinsics.d(this.f117258c, g0Var.f117258c) && Intrinsics.d(this.f117259d, g0Var.f117259d) && Intrinsics.d(this.f117260e, g0Var.f117260e) && Intrinsics.d(this.f117261f, g0Var.f117261f) && Intrinsics.d(this.f117262g, g0Var.f117262g) && Intrinsics.d(this.f117263h, g0Var.f117263h) && Intrinsics.d(this.f117264i, g0Var.f117264i) && Intrinsics.d(this.f117265j, g0Var.f117265j);
    }

    public final int hashCode() {
        String str = this.f117256a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f117257b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f117258c;
        int c13 = d7.g.c(this.f117263h, d7.g.c(this.f117262g, (this.f117261f.hashCode() + ((this.f117260e.hashCode() + ep.b.c(this.f117259d, (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31)) * 31)) * 31, 31), 31);
        Function1 function1 = this.f117264i;
        int hashCode3 = (c13 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1 function12 = this.f117265j;
        return hashCode3 + (function12 != null ? function12.hashCode() : 0);
    }

    public final String toString() {
        return "ItemDisplayStateTwoViewsWithStrings(title=" + this.f117256a + ", leftSubtitle=" + this.f117257b + ", rightSubtitle=" + this.f117258c + ", provides=" + this.f117259d + ", leftModifier=" + this.f117260e + ", rightModifier=" + this.f117261f + ", leftInverse=" + this.f117262g + ", rightInverse=" + this.f117263h + ", leftView=" + this.f117264i + ", rightView=" + this.f117265j + ")";
    }
}
