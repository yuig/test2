package tq;

import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import oq.c1;

/* loaded from: classes3.dex */
public final class i0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f118857i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j0 f118858j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(j0 j0Var, int i13) {
        super(1);
        this.f118857i = i13;
        this.f118858j = j0Var;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f118857i;
        j0 j0Var = this.f118858j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, j0Var.f118863f ? vn1.g.UI_300 : vn1.g.UI_400, 1, null, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096975);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, j0Var.f118865h, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097071);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                int i14 = n80.f.pdp_formatted_description_see_less;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return rn1.a.y(it, new u50.k0(i14, new ArrayList(0)), null, kotlin.collections.e0.b(vn1.b.END), j0Var.f118866i, vn1.g.BODY_200, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097122);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                int i15 = x0.see_more;
                String[] formatArgs2 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
                return rn1.a.y(it, new u50.k0(i15, new ArrayList(0)), null, kotlin.collections.e0.b(vn1.b.END), j0Var.f118866i, vn1.g.BODY_200, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097122);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.SUBTLE, null, null, j0Var.f118865h, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097069);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                String str = j0Var.f118878u;
                return rn1.a.y(it, ep.b.x(str, "string", str), null, null, null, null, 0, j0Var.f118878u.length() > 0 ? fm1.c.VISIBLE : fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                SpannableStringBuilder string = new SpannableStringBuilder(j0Var.f118879v);
                string.setSpan(new StrikethroughSpan(), 0, j0Var.f118879v.length(), 33);
                Unit unit = Unit.f80348a;
                Intrinsics.checkNotNullParameter(string, "string");
                return rn1.a.y(it, new u50.f0(string), null, null, null, null, 0, j0Var.f118879v.length() > 0 ? fm1.c.VISIBLE : fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                String str2 = j0Var.f118882y;
                return rn1.a.y(it, ep.b.x(str2, "string", str2), null, null, null, null, 0, j0Var.f118882y.length() > 0 ? fm1.c.VISIBLE : fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                String str3 = j0Var.f118881x;
                u50.f0 x13 = ep.b.x(str3, "string", str3);
                c1 c1Var = j0Var.f118880w;
                c1 c1Var2 = c1.OUT_OF_STOCK;
                return rn1.a.y(it, x13, c1Var == c1Var2 ? vn1.c.SUBTLE : vn1.c.DEFAULT, null, (c1Var != c1Var2 || j0Var.f118863f) ? q0.f80391a : kotlin.collections.e0.b(vn1.e.BOLD), null, 0, j0Var.f118881x.length() > 0 ? fm1.c.VISIBLE : fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097076);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f118857i) {
        }
        return b((rn1.a) obj);
    }
}
