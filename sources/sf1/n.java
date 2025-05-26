package sf1;

import android.content.Context;
import android.view.View;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.text.previewText.GestaltPreviewTextView;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f112659i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f112660j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f112661k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i13, Object obj, Object obj2) {
        super(1);
        this.f112659i = i13;
        this.f112660j = obj;
        this.f112661k = obj2;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f112659i;
        Object obj = this.f112661k;
        Object obj2 = this.f112660j;
        switch (i13) {
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                String str = (String) obj2;
                return rn1.a.y(it, ep.b.x(str, "string", str), null, null, null, null, 0, fm1.c.VISIBLE, null, null, (rm1.d) obj, false, 0, null, null, null, null, null, false, null, null, 2096574);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                List b13 = kotlin.collections.e0.b(vn1.b.CENTER);
                vn1.g gVar = vn1.g.HEADING_700;
                vn1.c cVar = vn1.c.LIGHT;
                String string = ((GestaltText) obj2).getResources().getString(uq1.b.update_your_app);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return rn1.a.y(it, bs1.c.h2(df.j1.Y(string, new Object[]{(String) obj}, null, 6)), cVar, b13, null, gVar, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097128);
        }
    }

    public final void e(View tooltip) {
        int i13 = this.f112659i;
        Object obj = this.f112661k;
        Object obj2 = this.f112660j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(tooltip, "tooltip");
                s sVar = (s) obj2;
                sVar.removeView(tooltip);
                w0 w0Var = sVar.C;
                if (w0Var != null) {
                    qf1.x sticker = (qf1.x) obj;
                    Intrinsics.checkNotNullParameter(sticker, "sticker");
                    e1 e1Var = w0Var.f112788a;
                    j1 j1Var = e1Var.G;
                    if (j1Var != null) {
                        rf1.p0 p0Var = (rf1.p0) j1Var;
                        Intrinsics.checkNotNullParameter(sticker, "sticker");
                        p0Var.Y3(qf1.y.a(sticker.f103776b, h32.f1.DISMISS, null, 6));
                        p0Var.d4(sticker);
                    }
                    e1Var.f112559r.Z();
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(tooltip, "tooltip");
                ((s) obj2).removeView(tooltip);
                ((Function1) obj).invoke(tooltip);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f112659i;
        int i14 = 1;
        Object obj2 = this.f112661k;
        Object obj3 = this.f112660j;
        switch (i13) {
            case 0:
                e((View) obj);
                return Unit.f80348a;
            case 1:
                Intrinsics.checkNotNullParameter((sp0.d) obj, "it");
                s sVar = (s) obj3;
                b60.b bVar = sVar.f112715v;
                if (bVar == null) {
                    Intrinsics.r("activeUserManager");
                    throw null;
                }
                wy0 f13 = ((b60.d) bVar).f();
                int i15 = 5;
                if (d7.b.i0(f13) && f13 != null && Intrinsics.d("US", f13.G2())) {
                    w0 w0Var = sVar.C;
                    if (w0Var != null) {
                        String pinId = (String) obj2;
                        Intrinsics.checkNotNullParameter(pinId, "pinId");
                        j1 j1Var = w0Var.f112788a.G;
                        if (j1Var != null) {
                            rf1.p0 p0Var = (rf1.p0) j1Var;
                            Intrinsics.checkNotNullParameter(pinId, "pinId");
                            p0Var.addDisposable(p0Var.f107837f.getPinWithFields(pinId, n00.b.a(n00.c.VIRTUAL_TRY_ON)).r(tk2.e.f118017c).l(wj2.c.a()).o(new rf1.v(4, new rf1.z(p0Var, i14)), new rf1.v(i15, new rf1.z(p0Var, 2))));
                        }
                    }
                } else {
                    i92.k kVar = sVar.f112707n;
                    if (kVar == null) {
                        Intrinsics.r("toastUtils");
                        throw null;
                    }
                    kVar.m(bs1.c.f2(sVar, uq1.b.try_on_unavailable));
                }
                sVar.n();
                String pinId2 = (String) obj2;
                Intrinsics.checkNotNullParameter(pinId2, "pinId");
                qf1.y d03 = kg.p.d0(h32.u0.IDEA_PIN_VTO_STICKER, new qf1.z(pinId2, 0));
                sVar.z(new qf1.x(d03, qf1.y.a(d03, null, h32.u0.IDEA_PIN_VTO_STICKER_PREVIEW, 5)));
                return Unit.f80348a;
            case 2:
                un1.c it = (un1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                String str = (String) obj3;
                u50.f0 x13 = ep.b.x(str, "string", str);
                GestaltPreviewTextView gestaltPreviewTextView = (GestaltPreviewTextView) obj2;
                Context context = gestaltPreviewTextView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                vn1.g gVar = dl2.b.T1(context) ? vn1.g.BODY_100 : vn1.g.BODY_300;
                fm1.c Z = d7.b.Z(true ^ kotlin.text.z.j(str));
                u50.f0 x14 = ep.b.x(str, "string", str);
                String string = gestaltPreviewTextView.getResources().getString(m60.x0.more_no_dot);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                String string2 = string.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
                Intrinsics.checkNotNullParameter(string2, "string");
                return un1.c.y(it, x13, gVar, 0, Z, true, x14, null, 2, new u50.f0(string2), false, 423342);
            case 3:
                e((View) obj);
                return Unit.f80348a;
            case 4:
                return b((rn1.a) obj);
            default:
                return b((rn1.a) obj);
        }
    }
}
