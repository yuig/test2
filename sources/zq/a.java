package zq;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.radioGroup.GestaltRadioGroup;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import h32.f1;
import h32.g0;
import h32.i0;
import h32.u0;
import java.util.HashMap;
import java.util.List;
import jc0.a0;
import jc0.v;
import ju.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import lb.l0;
import m60.w;
import nt.d1;
import nt.e1;
import nt.g1;
import nt.j2;
import nt.n1;
import nt.r1;
import nt.s1;
import nt.t0;
import nt.t1;
import nt.u1;
import nt.v1;
import nt.w1;
import ps.p;
import ps.q;
import u50.r;
import zy.e0;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142631a;

    public /* synthetic */ a(int i13) {
        this.f142631a = i13;
    }

    public static final void a(a aVar, w wVar, e1 e1Var, s1 s1Var) {
        aVar.getClass();
        List list = e1Var.f92024g;
        if (list == null || wVar == null) {
            return;
        }
        wVar.d(new v((a0) s1Var.invoke(list), false, 0L, 30));
    }

    public static t0 b(i0 context, String id3, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        return c(new zy.a(i0.a(context, null, null, g0.AD_LEAD_FORM_SIGNUP, null, RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL), f1.LEAD_FORM_OPEN, id3, auxData, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM));
    }

    public static t0 c(zy.a aVar) {
        return new t0(new e0(aVar));
    }

    public static e1 d(Context context, CharSequence charSequence, LinearLayoutCompat linearLayoutCompat, g gVar, n1 n1Var, int i13, List list, u0 u0Var, r rVar, r1 r1Var, t1 t1Var) {
        View inflate;
        g gVar2 = g.DATE_OF_BIRTH_MONTH;
        if (gVar == gVar2) {
            inflate = View.inflate(context, q.field_header, null);
        } else {
            inflate = View.inflate(context, q.field_header, null);
            View findViewById = inflate.findViewById(p.field_header);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            pk.a0.p((GestaltText) findViewById, charSequence.toString());
            linearLayoutCompat.addView(inflate);
        }
        View view = inflate;
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(d1.f92005m);
        gestaltText.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        View inflate2 = View.inflate(context, q.field_dropdown_input, null);
        if (gVar == gVar2) {
            inflate2.setPaddingRelative(0, kh2.d.p(8), 0, 0);
        }
        linearLayoutCompat.addView(inflate2);
        j0 j0Var = new j0();
        View findViewById2 = inflate2.findViewById(p.field_dropdown);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate2.findViewById(p.field_dropdown_parent);
        j0Var.f80434a = new e1(n1Var, view, (GestaltText) findViewById2, gestaltText, i13, list, r1Var);
        constraintLayout.setOnClickListener(new androidx.media3.ui.q(t1Var, j0Var, rVar, u0Var, 4));
        linearLayoutCompat.addView(gestaltText);
        return (e1) j0Var.f80434a;
    }

    public static g1 e(Context context, String str, List list, LinearLayoutCompat linearLayoutCompat, n1 n1Var, u0 u0Var, boolean z13, r rVar) {
        View inflate = View.inflate(context, q.field_radio_input, null);
        Intrinsics.g(inflate, "null cannot be cast to non-null type com.pinterest.gestalt.radioGroup.GestaltRadioGroup");
        GestaltRadioGroup gestaltRadioGroup = (GestaltRadioGroup) inflate;
        linearLayoutCompat.addView(gestaltRadioGroup);
        gestaltRadioGroup.t(new hs.a(7, str, list));
        g1 g1Var = new g1(n1Var, gestaltRadioGroup, gestaltRadioGroup, list);
        kh2.r.p(gestaltRadioGroup, new u1(g1Var, list, gestaltRadioGroup, rVar, u0Var, z13, str));
        return g1Var;
    }

    public static nt.f1 f(a aVar, Context context, CharSequence charSequence, CharSequence charSequence2, LinearLayoutCompat linearLayoutCompat, Integer num, boolean z13, n1 n1Var, Integer num2, j2 j2Var, u0 u0Var, int i13, int i14) {
        Integer num3 = (i14 & 16) != 0 ? null : num;
        boolean z14 = (i14 & 32) != 0 ? false : z13;
        Integer num4 = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : num2;
        View inflate = View.inflate(context, q.field_text_input, null);
        Intrinsics.g(inflate, "null cannot be cast to non-null type com.pinterest.gestalt.textfield.view.GestaltTextField");
        GestaltTextField gestaltTextField = (GestaltTextField) inflate;
        int intValue = num3 != null ? num3.intValue() : 1;
        gestaltTextField.X(new v1(num4, charSequence2, charSequence, z14, z14 ? 131072 | intValue : intValue, i13)).L(new i1.f1(6, j2Var));
        linearLayoutCompat.addView(gestaltTextField);
        return new nt.f1(n1Var, gestaltTextField, gestaltTextField, u0Var, l0.D(new w1(gestaltTextField, null)), charSequence.toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13, int i14) {
        this(0);
        this.f142631a = i13;
        switch (i13) {
            case 1:
                this(1);
                break;
            case 2:
                this(2);
                break;
            case 3:
                this(3);
                break;
            case 4:
                this(4);
                break;
            case 5:
                this(5);
                break;
            case 6:
                this(6);
                break;
            case 7:
                this(7);
                break;
            case 8:
                this(8);
                break;
            case 9:
                this(9);
                break;
            case 10:
                this(10);
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            case 13:
                this(13);
                break;
            case 14:
                this(14);
                break;
            case 15:
                this(15);
                break;
            case 16:
                this(16);
                break;
            case 17:
                this(17);
                break;
            case 18:
                this(18);
                break;
            case 19:
            default:
                break;
            case 20:
                this(20);
                break;
            case 21:
                this(21);
                break;
            case 22:
                this(22);
                break;
            case 23:
                this(23);
                break;
            case 24:
                this(24);
                break;
            case 25:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 27:
                this(27);
                break;
            case 28:
                this(28);
                break;
            case 29:
                this(29);
                break;
        }
    }
}
