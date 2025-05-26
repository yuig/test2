package zu0;

import ao1.i;
import cn1.d0;
import cn1.n;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wn0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rl2.u;
import u50.f0;
import u50.i0;
import wm1.k0;
import wm1.q;
import y01.n1;
import y01.z;
import z3.j;
import z3.t;
import z3.w;
import z3.x;
import z3.y;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142815i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f142816j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, int i13) {
        super(1);
        this.f142815i = i13;
        this.f142816j = str;
    }

    public final tp b(tp it) {
        switch (this.f142815i) {
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                return tp.e(it, null, null, null, null, null, null, this.f142816j, null, null, null, null, null, 4031);
            default:
                Intrinsics.checkNotNullParameter(it, "page");
                return tp.e(it, null, null, null, null, null, null, null, this.f142816j, null, null, null, null, 3967);
        }
    }

    public final ln0 e(ln0 it) {
        switch (this.f142815i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return ln0.a(it, wn0.a(it.getMetadata(), this.f142816j, null, null, null, false, null, RecyclerViewTypes.VIEW_TYPE_PIN_CLUSTER), null, null, null, null, null, false, null, null, null, null, 16381);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return ln0.a(it, wn0.a(it.getMetadata(), this.f142816j, null, null, null, false, null, RecyclerViewTypes.VIEW_TYPE_PIN_CLUSTER), null, null, null, null, null, false, null, null, null, null, 16381);
            default:
                Intrinsics.checkNotNullParameter(it, "data");
                return ln0.a(it, null, null, null, this.f142816j, null, null, false, null, null, null, null, 16367);
        }
    }

    public final rn1.a f(rn1.a it) {
        int i13 = this.f142815i;
        String string = this.f142816j;
        switch (i13) {
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(string), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 8:
            case 10:
            case 11:
            case 12:
            case 16:
            case 17:
            case 25:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(string), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(string != null ? string : ""), null, null, null, null, 0, d7.b.Z(!(string == null || string.length() == 0)), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(string), null, null, null, null, 0, d7.b.Z(string.length() > 0), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 14:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(string), null, null, null, null, 0, d7.b.Z(string.length() > 0), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 15:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(string), null, null, null, null, 0, d7.b.Z(string.length() > 0), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 18:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(string), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 19:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(string), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 20:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(string), null, null, null, null, 2, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097118);
            case 21:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(string), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 22:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(string), null, null, null, null, 0, string.length() == 0 ? fm1.c.GONE : fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 23:
                Intrinsics.checkNotNullParameter(it, "displayState");
                Intrinsics.checkNotNullParameter(it, "displayState");
                i0 i0Var = it.f108849g;
                Intrinsics.checkNotNullParameter(string, "string");
                f0 text = new f0(string);
                Intrinsics.checkNotNullParameter(text, "text");
                return new rn1.a(text, it.f108850h, it.f108851i, it.f108852j, it.f108853k, it.f108854l, it.f108855m, it.f108856n, it.f108857o, it.f108858p, it.f108859q, it.f108860r, new f0(string), it.f108862t, it.f108863u, it.f108864v, it.f108865w, it.f108866x, it.f108867y, it.f108868z, it.A);
            case 24:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(string != null ? string : ""), null, null, null, null, 0, d7.b.Z(!(string == null || string.length() == 0)), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 26:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(string), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 27:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(string != null ? string : ""), null, null, null, null, 0, d7.b.Z(!(string == null || string.length() == 0)), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 28:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(string != null ? string : ""), null, null, null, null, 0, d7.b.Z(!(string == null || string.length() == 0)), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
        }
    }

    public final yl1.b h(yl1.b it) {
        int i13 = this.f142815i;
        String string = this.f142816j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.h2(string), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                Intrinsics.checkNotNullExpressionValue(string, "$title");
                Intrinsics.checkNotNullParameter(string, "string");
                return yl1.b.f(it, new f0(string), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z13 = false;
        int i13 = this.f142815i;
        String string = this.f142816j;
        switch (i13) {
            case 4:
                n bind = (n) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f28227s = true;
                bind.f28211c = ep.b.x(string, "helperText", string);
                break;
            case 5:
                d0 bind2 = (d0) obj;
                Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                bind2.a(string);
                break;
            case 10:
                k0 bind3 = (k0) obj;
                Intrinsics.checkNotNullParameter(bind3, "$this$bind");
                Intrinsics.checkNotNullParameter(string, "string");
                q middleItem = new q(new f0(string), null, z13, 6);
                bind3.getClass();
                Intrinsics.checkNotNullParameter(middleItem, "middleItem");
                bind3.f130312c = middleItem;
                break;
            case 11:
                y semantics = (y) obj;
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                u[] uVarArr = w.f140760a;
                x xVar = t.f140742k;
                u uVar = w.f140760a[3];
                xVar.a(semantics, new z3.e());
                w.f(semantics, string);
                x xVar2 = t.f140740i;
                Unit unit = Unit.f80348a;
                ((j) semantics).e(xVar2, unit);
                break;
            case 16:
                n1 it = (n1) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                z zVar = it.f136443a;
                List pins = zVar.f136504a;
                Intrinsics.checkNotNullParameter(pins, "pins");
                String baseUrl = this.f142816j;
                Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
                break;
            case 17:
                v7 b13 = (v7) obj;
                Intrinsics.checkNotNullParameter(b13, "b");
                String j13 = b13.j1();
                Intrinsics.checkNotNullExpressionValue(j13, "getName(...)");
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                String lowerCase = j13.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                Locale locale2 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
                String lowerCase2 = string.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                break;
            case 25:
                i bind4 = (i) obj;
                Intrinsics.checkNotNullParameter(bind4, "$this$bind");
                if (string == null) {
                    string = "";
                }
                bind4.d(string);
                break;
        }
        return f((rn1.a) obj);
    }
}
