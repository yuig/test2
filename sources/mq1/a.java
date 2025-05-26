package mq1;

import android.content.Context;
import ca2.b;
import com.pinterest.api.model.cp0;
import com.pinterest.api.model.ql0;
import com.pinterest.api.model.ro0;
import com.pinterest.api.model.sp0;
import com.pinterest.api.model.uo0;
import com.pinterest.api.model.wo0;
import com.pinterest.gestalt.text.GestaltText;
import dl1.s;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m60.w0;
import nq1.e;
import pk.a0;
import pq1.f;
import qf1.b0;
import r70.h;
import uj2.q;
import uk1.d;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public final class a extends t implements b {

    /* renamed from: a, reason: collision with root package name */
    public final wo0 f88067a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(s sVar, d presenterPinalytics, q networkStateStream) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        wo0 wo0Var = sVar instanceof wo0 ? (wo0) sVar : null;
        if (wo0Var == null) {
            throw new IllegalArgumentException("Model argument must be of type: javaClass");
        }
        this.f88067a = wo0Var;
    }

    @Override // ca2.b
    public final void M0(String str) {
        if (isBound()) {
            e eVar = (e) ((lq1.b) getView());
            eVar.P7();
            eVar.f7().f(new h(false, false));
        }
    }

    @Override // yk1.p
    /* renamed from: p3, reason: merged with bridge method [inline-methods] */
    public final void r3(lq1.b view) {
        int intValue;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        e eVar = (e) view;
        eVar.b8().f27252k = this;
        wo0 wo0Var = this.f88067a;
        uo0 uo0Var = wo0Var.f43310a;
        Integer r13 = uo0Var.r();
        if (r13.intValue() == cp0.INGREDIENTS.getType()) {
            int i13 = fq1.d.idea_pin_list_bottom_sheet_title_ingredients;
            GestaltText gestaltText = eVar.f91826o0;
            if (gestaltText == null) {
                Intrinsics.r("titleView");
                throw null;
            }
            String string = eVar.getString(i13);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            a0.p(gestaltText, string);
        } else if (r13.intValue() == cp0.SUPPLIES.getType()) {
            int i14 = fq1.d.idea_pin_list_bottom_sheet_title_supplies;
            GestaltText gestaltText2 = eVar.f91826o0;
            if (gestaltText2 == null) {
                Intrinsics.r("titleView");
                throw null;
            }
            String string2 = eVar.getString(i14);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            a0.p(gestaltText2, string2);
        }
        b0 b0Var = new b0(view);
        List o13 = uo0Var.o();
        if (o13 != null) {
            Iterator it = o13.iterator();
            while (it.hasNext()) {
                ((ro0) it.next()).a(b0Var);
            }
        }
        sp0 sp0Var = wo0Var.f43314e;
        Integer e13 = sp0Var != null ? sp0Var.e() : null;
        Integer d2 = sp0Var != null ? sp0Var.d() : null;
        String str = "";
        if (e13 != null && (intValue = e13.intValue()) > 0) {
            str = a.a.j("", eVar.getResources().getQuantityString(w0.recipe_serving, intValue, Integer.valueOf(intValue)));
        }
        if (d2 != null) {
            int intValue2 = d2.intValue();
            if (!z.j(str)) {
                str = ((Object) str) + " " + eVar.getString(f.idea_pin_list_display_dot) + " ";
            }
            Context requireContext = eVar.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            str = ((Object) str) + qg1.d.b(intValue2, requireContext, true);
        }
        if (!z.j(str)) {
            GestaltText gestaltText3 = eVar.f91827p0;
            if (gestaltText3 == null) {
                Intrinsics.r("metadataView");
                throw null;
            }
            a0.p(gestaltText3, str);
            GestaltText gestaltText4 = eVar.f91827p0;
            if (gestaltText4 == null) {
                Intrinsics.r("metadataView");
                throw null;
            }
            a0.w1(gestaltText4);
        }
        ql0 ql0Var = wo0Var.f43315f;
        Integer b13 = ql0Var != null ? ql0Var.b() : null;
        if (b13 != null) {
            int intValue3 = b13.intValue();
            GestaltText gestaltText5 = eVar.f91827p0;
            if (gestaltText5 == null) {
                Intrinsics.r("metadataView");
                throw null;
            }
            String string3 = eVar.getString(qg1.d.f103827a[intValue3 - 1].intValue());
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            a0.p(gestaltText5, string3);
            GestaltText gestaltText6 = eVar.f91827p0;
            if (gestaltText6 == null) {
                Intrinsics.r("metadataView");
                throw null;
            }
            a0.w1(gestaltText6);
        }
        ca2.e.w(eVar.b8(), 0, null, null, null, 15);
    }
}
