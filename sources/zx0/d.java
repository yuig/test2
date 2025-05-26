package zx0;

import an1.l;
import android.content.Context;
import ao1.i;
import bk1.a2;
import com.pinterest.api.model.kg0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import dl1.s0;
import e82.u;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ny0.t0;
import qb0.j;
import rh1.k;
import so.oa;
import u50.g0;
import u50.i0;
import u50.k0;
import y01.n1;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f143012i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f143013j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13, int i14) {
        super(1);
        this.f143012i = i14;
        this.f143013j = i13;
    }

    public final l b(l it) {
        switch (this.f143012i) {
            case 17:
                Intrinsics.checkNotNullParameter(it, "it");
                return l.e(it, null, null, null, null, this.f143013j, null, null, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                Integer displayString = u.QUARTER.getDisplayString();
                Intrinsics.checkNotNullExpressionValue(displayString, "getDisplayString(...)");
                boolean z13 = false;
                int i13 = 62;
                i0 i0Var = null;
                i0 i0Var2 = null;
                an1.e eVar = new an1.e(bs1.c.j2(new String[0], displayString.intValue()), i0Var, i0Var2, z13, i13);
                Integer displayString2 = u.HALF_YEAR.getDisplayString();
                Intrinsics.checkNotNullExpressionValue(displayString2, "getDisplayString(...)");
                i0 i0Var3 = null;
                i0 i0Var4 = null;
                an1.e eVar2 = new an1.e(bs1.c.j2(new String[0], displayString2.intValue()), i0Var3, i0Var4, false, 62);
                Integer displayString3 = u.YEAR.getDisplayString();
                Intrinsics.checkNotNullExpressionValue(displayString3, "getDisplayString(...)");
                an1.e eVar3 = new an1.e(bs1.c.j2(new String[0], displayString3.intValue()), i0Var, i0Var2, z13, i13);
                Integer displayString4 = u.NONE.getDisplayString();
                Intrinsics.checkNotNullExpressionValue(displayString4, "getDisplayString(...)");
                return l.e(it, null, null, null, f0.j(eVar, eVar2, eVar3, new an1.e(bs1.c.j2(new String[0], displayString4.intValue()), i0Var4, null, false, 62)), this.f143013j, null, null, RecyclerViewTypes.VIEW_TYPE_RECENTLY_SAVED_PRODUCT_HEADER);
        }
    }

    public final rn1.a e(rn1.a it) {
        int i13 = this.f143012i;
        int i14 = this.f143013j;
        switch (i13) {
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], i14), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 5:
                Intrinsics.checkNotNullParameter(it, "displayState");
                Intrinsics.checkNotNullParameter(it, "displayState");
                i0 i0Var = it.f108849g;
                k0 text = bs1.c.j2(new String[0], i14);
                Intrinsics.checkNotNullParameter(text, "text");
                return new rn1.a(text, it.f108850h, it.f108851i, it.f108852j, it.f108853k, it.f108854l, it.f108855m, it.f108856n, it.f108857o, it.f108858p, it.f108859q, it.f108860r, new k0(i14), it.f108862t, it.f108863u, it.f108864v, it.f108865w, it.f108866x, it.f108867y, it.f108868z, it.A);
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2("+" + i14), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.i2(nz1.e.scheduled_pins_preview_subtitle, i14, j.b(i14)), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 14:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], i14), vn1.c.SUBTLE, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097148);
            case 18:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], i14), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 21:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], i14), null, e0.b(vn1.b.CENTER), null, vn1.g.UI_400, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097130);
            case 22:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], i14), null, e0.b(vn1.b.CENTER), null, vn1.g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097130);
            case 24:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], i14), vn1.c.SUBTLE, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097148);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(i14 + "/500"), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    public final yl1.b f(yl1.b it) {
        int i13 = this.f143012i;
        int i14 = this.f143013j;
        switch (i13) {
            case 12:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, g0.b(new String[0], i14), false, null, g0.b(new String[0], i14), null, null, null, null, 0, null, 1014);
            case 15:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], i14), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], i14), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        kg0 kg0Var;
        int i13 = this.f143012i;
        int i14 = this.f143013j;
        switch (i13) {
            case 0:
                pn1.b it = (pn1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
                t0 it2 = (t0) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                break;
            case 2:
                ny0.f it3 = (ny0.f) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                break;
            case 3:
                n1 it4 = (n1) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                ul1.c it5 = (ul1.c) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                break;
            case 7:
                i bind = (i) obj;
                switch (i13) {
                    case 7:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.getClass();
                        bind.f20088e = new k0(i14);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.b(i14);
                        break;
                }
                break;
            case 8:
                i bind2 = (i) obj;
                switch (i13) {
                    case 7:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.getClass();
                        bind2.f20088e = new k0(i14);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.b(i14);
                        break;
                }
                break;
            case 9:
                tt1.a response = (tt1.a) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                Object c13 = response.c();
                Intrinsics.checkNotNullExpressionValue(c13, "getData(...)");
                ArrayList arrayList = new ArrayList();
                for (nm.s sVar : (Iterable) c13) {
                    nm.u uVar = sVar instanceof nm.u ? (nm.u) sVar : null;
                    if (uVar != null) {
                        Context context = kb0.a.f79058b;
                        kg0Var = (kg0) ((ke0.a) ((oa) ((so1.b) ep.b.g(so1.b.class))).Lc.get()).d(new vd0.c(uVar));
                    } else {
                        kg0Var = null;
                    }
                    if (kg0Var != null) {
                        arrayList.add(kg0Var);
                    }
                }
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                un1.c it6 = (un1.c) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                ao1.b it7 = (ao1.b) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                com.pinterest.feature.unifiedcomments.d view = (com.pinterest.feature.unifiedcomments.d) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                ((k) view).E8(i14, true);
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                a2 it8 = (a2) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            case 27:
                s0 s0Var = (s0) obj;
                Intrinsics.checkNotNullParameter(s0Var, "<name for destructuring parameter 0>");
                break;
            case 28:
                rn1.k bind3 = (rn1.k) obj;
                switch (i13) {
                    case 28:
                        Intrinsics.checkNotNullParameter(bind3, "$this$bind");
                        bind3.f108897l = i14;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind3, "$this$bind");
                        bind3.f108897l = i14;
                        break;
                }
                break;
            default:
                rn1.k bind4 = (rn1.k) obj;
                switch (i13) {
                    case 28:
                        Intrinsics.checkNotNullParameter(bind4, "$this$bind");
                        bind4.f108897l = i14;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind4, "$this$bind");
                        bind4.f108897l = i14;
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
