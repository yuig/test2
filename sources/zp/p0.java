package zp;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.widget.LinearLayout;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.ui.imageview.ProportionalImageView;
import k1.j1;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import x02.l2;

/* loaded from: classes3.dex */
public final class p0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142474i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w0 f142475j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(w0 w0Var, int i13) {
        super(1);
        this.f142474i = i13;
        this.f142475j = w0Var;
    }

    public final void b(xn1.j it) {
        yp0.b bVar;
        int i13 = this.f142474i;
        w0 w0Var = this.f142475j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof xn1.f) {
                    boolean z13 = ((xn1.f) it).f135448c;
                    GestaltTextField gestaltTextField = w0Var.f142531d;
                    if (!z13) {
                        pk.a0.p(w0Var.f142533e, StringsKt.i0(String.valueOf(gestaltTextField.z0())).toString());
                        if (String.valueOf(gestaltTextField.z0()).length() == 0) {
                            kg.a.n(w0Var.f142531d, w0Var.f142533e);
                            break;
                        }
                    } else {
                        w0Var.z0().b0(h32.u0.EDIT_PIN_TITLE, h32.g0.PIN_EDIT_MODAL, w0Var.f142542i0.getUid(), false);
                        hf0.b.s(gestaltTextField);
                        break;
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "event");
                if (!(it instanceof xn1.f)) {
                    if (!(it instanceof xn1.a) && !(it instanceof xn1.b)) {
                        if ((it instanceof xn1.i) && (bVar = w0Var.f142570w0) != null) {
                            bVar.h3(it);
                            break;
                        }
                    } else {
                        up0.m mVar = w0Var.f142568v0;
                        if (mVar != null) {
                            mVar.h3(it);
                            break;
                        }
                    }
                } else {
                    boolean z14 = ((xn1.f) it).f135448c;
                    GestaltTextField gestaltTextField2 = w0Var.f142539h;
                    if (!z14) {
                        pk.a0.p(w0Var.f142537g, StringsKt.i0(String.valueOf(gestaltTextField2.z0())).toString());
                        if (String.valueOf(gestaltTextField2.z0()).length() == 0) {
                            kg.a.n(w0Var.f142539h, w0Var.f142537g);
                            break;
                        }
                    } else {
                        w0Var.z0().b0(h32.u0.EDIT_PIN_DESCRIPTION, h32.g0.PIN_EDIT_MODAL, w0Var.f142542i0.getUid(), false);
                        hf0.b.s(gestaltTextField2);
                        break;
                    }
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String A3;
        int i13 = this.f142474i;
        w0 w0Var = this.f142475j;
        switch (i13) {
            case 0:
                b((xn1.j) obj);
                return Unit.f80348a;
            case 1:
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(pin, "pin");
                w0Var.f142542i0 = pin;
                ProportionalImageView proportionalImageView = w0Var.f142547l;
                proportionalImageView.setVisibility(0);
                proportionalImageView.loadUrl(bs1.c.B0(pin));
                if (b40.Q0(w0Var.f142542i0)) {
                    w0Var.f142557q.i(u.f142505s);
                }
                boolean t03 = b40.t0(pin);
                k3.R1(w0Var.f142569w, t03);
                v0 v0Var = new v0(0, pin, t03);
                GestaltSwitchWithLabel gestaltSwitchWithLabel = w0Var.f142571x;
                gestaltSwitchWithLabel.T(v0Var);
                wy0 z53 = pin.z5();
                if (z53 != null) {
                    Boolean r43 = z53.r4();
                    Boolean bool = Boolean.TRUE;
                    if (Intrinsics.d(r43, bool)) {
                        wy0 z54 = pin.z5();
                        GestaltText gestaltText = w0Var.f142573y;
                        if (z54 != null && Intrinsics.d(z54.r4(), bool)) {
                            pk.a0.o(gestaltText, m60.x0.comments_turned_off_in_social_permissions, new Object[0]);
                            w0Var.f142574z.i(u.f142510x);
                        }
                        gestaltText.i(u.f142511y);
                        gestaltSwitchWithLabel.T(u.f142512z);
                    }
                }
                w0Var.S0(pin);
                String str = w0Var.f142536f0;
                if (str == null || Intrinsics.d(str, pin.z6())) {
                    w0Var.b1(pin.z6());
                }
                w0Var.T0(pin);
                if (w0Var.k0() && (A3 = pin.A3()) != null) {
                    w0Var.f142555p.X(new j1(A3, 12));
                }
                boolean I0 = w0Var.I0(pin);
                LinearLayout linearLayout = w0Var.f142567v;
                if (!I0 || pin.e5().booleanValue() || b40.r0(pin) || b40.N0(pin) || b40.Q0(pin)) {
                    k3.R1(linearLayout, false);
                } else {
                    String s53 = pin.s5();
                    if (s53 != null && s53.length() != 0) {
                        w0Var.f142543j.X(new j1(s53, 15));
                        k3.R1(w0Var.f142567v, true);
                    }
                    k3.R1(linearLayout, true);
                }
                if (!w0Var.o0(pin)) {
                    k3.R1(w0Var.f142563t, false);
                }
                if (b40.r0(pin) || b40.Q0(pin)) {
                    k3.R1(w0Var.f142565u, false);
                }
                if (w0Var.f142552n0 == null && w0Var.f142556p0 == null && !w0Var.f142562s0) {
                    w0Var.L0(pin.D3(), pin.j6());
                }
                w0Var.Y0();
                return Unit.f80348a;
            case 2:
                b((xn1.j) obj);
                return Unit.f80348a;
            default:
                if (((Boolean) obj).booleanValue()) {
                    Editable z03 = w0Var.f142539h.z0();
                    Intrinsics.g(z03, "null cannot be cast to non-null type android.text.SpannableStringBuilder");
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) z03;
                    m60.w eventManager = w0Var.getEventManager();
                    int selectionStart = w0Var.f142539h.o0().getSelectionStart();
                    up0.l B0 = w0Var.B0();
                    l2 l2Var = w0Var.W;
                    if (l2Var == null) {
                        Intrinsics.r("typeaheadRepository");
                        throw null;
                    }
                    uk1.e eVar = w0Var.f142528a0;
                    if (eVar == null) {
                        Intrinsics.r("presenterPinalyticsFactory");
                        throw null;
                    }
                    nx.f0 f0Var = w0Var.f142530c0;
                    if (f0Var == null) {
                        Intrinsics.r("pinalyticsFactory");
                        throw null;
                    }
                    eventManager.d(new jc0.v(new zp0.b(spannableStringBuilder, selectionStart, B0, l2Var, eVar, f0Var, wp0.f.PinEdit, w0Var, (Boolean) null, (h32.g0) null, 1792), false, 0L, 30));
                }
                return Unit.f80348a;
        }
    }
}
