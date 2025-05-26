package zp;

import a.cb;
import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import com.pinterest.api.model.rp;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import k1.j1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import x02.l2;

/* loaded from: classes3.dex */
public final class z0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142585i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d1 f142586j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(d1 d1Var, int i13) {
        super(1);
        this.f142585i = i13;
        this.f142586j = d1Var;
    }

    public final void b(rn1.f it) {
        int i13 = this.f142585i;
        d1 d1Var = this.f142586j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                kg.a.n(d1Var.f142365d, d1Var.f142367e);
                d1Var.f142365d.requestFocus();
                break;
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                kg.a.n(d1Var.f142369g, d1Var.f142368f);
                d1Var.f142369g.requestFocus();
                break;
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                aq.j jVar = d1Var.L;
                if (jVar.c()) {
                    int i14 = m60.x0.delete_confirm;
                    int i15 = m60.x0.cancel;
                    int i16 = r80.f.delete_pin_confirm_title;
                    int i17 = r80.f.delete_pin_confirm;
                    if (jVar.Z()) {
                        i16 = ry1.f.delete_idea_pin_confirm_title;
                        i17 = ry1.f.delete_idea_pin_confirm_message;
                    }
                    Context context = d1Var.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    x0 onConfirmClickListener = new x0(d1Var, 3);
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(onConfirmClickListener, "onConfirmClickListener");
                    yb0.n nVar = new yb0.n(context);
                    Resources resources = context.getResources();
                    String string = resources.getString(i16);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    nVar.w(string);
                    nVar.u(resources.getString(i17));
                    String string2 = resources.getString(i14);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    nVar.q(string2);
                    String string3 = resources.getString(i15);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    nVar.m(string3);
                    nVar.f138513j = new o0(nVar, onConfirmClickListener, 3);
                    cb.x(nVar, d1Var.getEventManager());
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                String R = pk.a0.R(d1Var.f142379q);
                d1Var.f142381s.i(c1.f142349n);
                d1Var.f142379q.i(c1.f142350o);
                j1 j1Var = new j1(R, 23);
                GestaltTextField gestaltTextField = d1Var.f142371i;
                gestaltTextField.X(j1Var);
                gestaltTextField.requestFocus();
                hf0.b.s(gestaltTextField);
                break;
        }
    }

    public final void e(xn1.j it) {
        yp0.b bVar;
        int i13 = this.f142585i;
        d1 d1Var = this.f142586j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof xn1.f) {
                    boolean z13 = ((xn1.f) it).f135448c;
                    GestaltTextField gestaltTextField = d1Var.f142365d;
                    if (!z13) {
                        pk.a0.p(d1Var.f142367e, StringsKt.i0(String.valueOf(gestaltTextField.z0())).toString());
                        if (String.valueOf(gestaltTextField.z0()).length() == 0) {
                            kg.a.n(d1Var.f142365d, d1Var.f142367e);
                            break;
                        }
                    } else {
                        d1Var.t0().b0(h32.u0.EDIT_PIN_TITLE, h32.g0.PIN_EDIT_MODAL, d1Var.L.z(aq.d.PIN_ID), false);
                        hf0.b.s(gestaltTextField);
                        break;
                    }
                }
                break;
            case 4:
                Intrinsics.checkNotNullParameter(it, "event");
                if (!(it instanceof xn1.f)) {
                    if (!(it instanceof xn1.a) && !(it instanceof xn1.b)) {
                        if ((it instanceof xn1.i) && (bVar = d1Var.f142364c0) != null) {
                            bVar.h3(it);
                            break;
                        }
                    } else {
                        up0.m mVar = d1Var.f142363b0;
                        if (mVar != null) {
                            mVar.h3(it);
                            break;
                        }
                    }
                } else {
                    boolean z14 = ((xn1.f) it).f135448c;
                    GestaltTextField gestaltTextField2 = d1Var.f142369g;
                    if (!z14) {
                        pk.a0.p(d1Var.f142368f, StringsKt.i0(String.valueOf(gestaltTextField2.z0())).toString());
                        if (String.valueOf(gestaltTextField2.z0()).length() == 0) {
                            kg.a.n(d1Var.f142369g, d1Var.f142368f);
                            break;
                        }
                    } else {
                        d1Var.t0().b0(h32.u0.EDIT_PIN_DESCRIPTION, h32.g0.PIN_EDIT_MODAL, d1Var.L.z(aq.d.PIN_ID), false);
                        hf0.b.s(gestaltTextField2);
                        break;
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "event");
                if (!(it instanceof xn1.d)) {
                    if ((it instanceof xn1.f) && !((xn1.f) it).f135448c) {
                        d1.k0(d1Var);
                        break;
                    }
                } else if (((xn1.d) it).f135444c == 6) {
                    hf0.b.k(d1Var.f142371i);
                    d1.k0(d1Var);
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f142585i;
        d1 d1Var = this.f142586j;
        switch (i13) {
            case 0:
                b((rn1.f) obj);
                return Unit.f80348a;
            case 1:
                b((rn1.f) obj);
                return Unit.f80348a;
            case 2:
                b((rn1.f) obj);
                return Unit.f80348a;
            case 3:
                e((xn1.j) obj);
                return Unit.f80348a;
            case 4:
                e((xn1.j) obj);
                return Unit.f80348a;
            case 5:
                if (((Boolean) obj).booleanValue()) {
                    Editable z03 = d1Var.f142369g.z0();
                    Intrinsics.g(z03, "null cannot be cast to non-null type android.text.SpannableStringBuilder");
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) z03;
                    m60.w eventManager = d1Var.getEventManager();
                    int selectionStart = d1Var.f142369g.o0().getSelectionStart();
                    up0.l lVar = d1Var.E;
                    if (lVar == null) {
                        Intrinsics.r("typeaheadTextUtility");
                        throw null;
                    }
                    l2 l2Var = d1Var.F;
                    if (l2Var == null) {
                        Intrinsics.r("typeaheadRepository");
                        throw null;
                    }
                    uk1.e eVar = d1Var.G;
                    if (eVar == null) {
                        Intrinsics.r("presenterPinalyticsFactory");
                        throw null;
                    }
                    nx.f0 f0Var = d1Var.H;
                    if (f0Var == null) {
                        Intrinsics.r("pinalyticsFactory");
                        throw null;
                    }
                    eventManager.d(new jc0.v(new zp0.b(spannableStringBuilder, selectionStart, lVar, l2Var, eVar, f0Var, wp0.f.PinEdit, d1Var, (Boolean) null, (h32.g0) null, 1792), false, 0L, 30));
                }
                return Unit.f80348a;
            case 6:
                e((xn1.j) obj);
                return Unit.f80348a;
            case 7:
                b((rn1.f) obj);
                return Unit.f80348a;
            case 8:
                tt1.a aVar = (tt1.a) obj;
                d1Var.f142380r.setVisibility(8);
                String blockReason = ((rp) aVar.c()).getBlockReason();
                GestaltText gestaltText = d1Var.f142381s;
                if (blockReason == null || blockReason.length() == 0) {
                    gestaltText.i(c1.f142353r);
                } else {
                    gestaltText.i(new z3.m(aVar, 18));
                }
                return Unit.f80348a;
            default:
                d1Var.f142381s.i(c1.f142354s);
                d1Var.f142380r.setVisibility(8);
                return Unit.f80348a;
        }
    }
}
