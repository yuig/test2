package rc0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.buttonSocial.GestaltButtonSocial;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import df.j1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107259i;

    /* renamed from: j, reason: collision with root package name */
    public static final a0 f107242j = new a0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a0 f107243k = new a0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a0 f107244l = new a0(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a0 f107245m = new a0(3);

    /* renamed from: n, reason: collision with root package name */
    public static final a0 f107246n = new a0(4);

    /* renamed from: o, reason: collision with root package name */
    public static final a0 f107247o = new a0(5);

    /* renamed from: p, reason: collision with root package name */
    public static final a0 f107248p = new a0(6);

    /* renamed from: q, reason: collision with root package name */
    public static final a0 f107249q = new a0(7);

    /* renamed from: r, reason: collision with root package name */
    public static final a0 f107250r = new a0(8);

    /* renamed from: s, reason: collision with root package name */
    public static final a0 f107251s = new a0(9);

    /* renamed from: t, reason: collision with root package name */
    public static final a0 f107252t = new a0(10);

    /* renamed from: u, reason: collision with root package name */
    public static final a0 f107253u = new a0(11);

    /* renamed from: v, reason: collision with root package name */
    public static final a0 f107254v = new a0(12);

    /* renamed from: w, reason: collision with root package name */
    public static final a0 f107255w = new a0(13);

    /* renamed from: x, reason: collision with root package name */
    public static final a0 f107256x = new a0(14);

    /* renamed from: y, reason: collision with root package name */
    public static final a0 f107257y = new a0(15);

    /* renamed from: z, reason: collision with root package name */
    public static final a0 f107258z = new a0(16);
    public static final a0 A = new a0(17);
    public static final a0 B = new a0(18);
    public static final a0 C = new a0(19);
    public static final a0 D = new a0(20);
    public static final a0 E = new a0(21);
    public static final a0 F = new a0(22);
    public static final a0 G = new a0(23);
    public static final a0 H = new a0(24);
    public static final a0 I = new a0(25);

    /* renamed from: J, reason: collision with root package name */
    public static final a0 f107241J = new a0(26);
    public static final a0 K = new a0(27);
    public static final a0 L = new a0(28);
    public static final a0 M = new a0(29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i13) {
        super(1);
        this.f107259i = i13;
    }

    public final View b(Context context) {
        em1.i invokeAfterStateMutation = em1.i.f59625r;
        int i13 = 6;
        AttributeSet attributeSet = null;
        em1.i iVar = em1.i.f59624q;
        switch (this.f107259i) {
            case 9:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltButtonSocial gestaltButtonSocial = new GestaltButtonSocial(i13, context, attributeSet);
                kh2.b0.O(gestaltButtonSocial, f107250r);
                gestaltButtonSocial.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                return gestaltButtonSocial;
            case 10:
            case 12:
            case 14:
            case 16:
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltCheckBox gestaltCheckBox = new GestaltCheckBox(context, new em1.d(em1.b.UNCHECKED, em1.e.ERROR, fm1.c.VISIBLE, bs1.c.j2(new String[0], oc0.q.checkbox_unchecked), bs1.c.j2(new String[0], oc0.q.error_text), 0, false, 992));
                c0.d.l(gestaltCheckBox, iVar);
                return gestaltCheckBox;
            case 11:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltButtonSocial gestaltButtonSocial2 = new GestaltButtonSocial(i13, context, attributeSet);
                kh2.b0.O(gestaltButtonSocial2, f107252t);
                gestaltButtonSocial2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                return gestaltButtonSocial2;
            case 13:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltButtonSocial gestaltButtonSocial3 = new GestaltButtonSocial(i13, context, attributeSet);
                kh2.b0.O(gestaltButtonSocial3, f107254v);
                gestaltButtonSocial3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                return gestaltButtonSocial3;
            case 15:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltButtonSocial gestaltButtonSocial4 = new GestaltButtonSocial(i13, context, attributeSet);
                kh2.b0.O(gestaltButtonSocial4, f107256x);
                gestaltButtonSocial4.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                return gestaltButtonSocial4;
            case 17:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltButtonSocial gestaltButtonSocial5 = new GestaltButtonSocial(i13, context, attributeSet);
                kh2.b0.O(gestaltButtonSocial5, f107258z);
                gestaltButtonSocial5.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                return gestaltButtonSocial5;
            case 18:
                Intrinsics.checkNotNullParameter(context, "context");
                CharSequence a03 = j1.a0("This is disabled. <a href=\"http://google.com\">You can still click</a>");
                em1.b bVar = em1.b.UNCHECKED;
                fm1.c cVar = fm1.c.VISIBLE;
                em1.e eVar = em1.e.DISABLED;
                Intrinsics.f(a03);
                GestaltCheckBox gestaltCheckBox2 = new GestaltCheckBox(context, new em1.d(bVar, eVar, cVar, bs1.c.h2(a03), null, 0, true, 752));
                c0.d.l(gestaltCheckBox2, iVar);
                return gestaltCheckBox2;
            case 19:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltCheckBox gestaltCheckBox3 = new GestaltCheckBox(context, new em1.d(em1.b.INDETERMINATE, em1.e.ENABLED, fm1.c.VISIBLE, bs1.c.h2("Indeterminate"), null, 0, false, 1008));
                Intrinsics.checkNotNullParameter(gestaltCheckBox3, "<this>");
                Intrinsics.checkNotNullParameter(invokeAfterStateMutation, "invokeAfterStateMutation");
                gestaltCheckBox3.T(new em1.l(gestaltCheckBox3, invokeAfterStateMutation, 1));
                return gestaltCheckBox3;
            case 20:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltCheckBox gestaltCheckBox4 = new GestaltCheckBox(context, new em1.d(em1.b.INDETERMINATE, em1.e.DISABLED, fm1.c.VISIBLE, bs1.c.h2("Indeterminate Disabled"), null, 0, false, 1008));
                Intrinsics.checkNotNullParameter(gestaltCheckBox4, "<this>");
                Intrinsics.checkNotNullParameter(invokeAfterStateMutation, "invokeAfterStateMutation");
                gestaltCheckBox4.T(new em1.l(gestaltCheckBox4, invokeAfterStateMutation, 1));
                return gestaltCheckBox4;
            case 21:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltCheckBox gestaltCheckBox5 = new GestaltCheckBox(context, new em1.d(em1.b.UNCHECKED, em1.e.ENABLED, fm1.c.VISIBLE, bs1.c.h2("Label"), bs1.c.h2("Helper text"), 0, false, 992));
                c0.d.l(gestaltCheckBox5, iVar);
                return gestaltCheckBox5;
            case 22:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltCheckBox gestaltCheckBox6 = new GestaltCheckBox(context, new em1.d(em1.b.UNCHECKED, em1.e.ENABLED, fm1.c.VISIBLE, bs1.c.h2("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "), null, 10, false, 944));
                c0.d.l(gestaltCheckBox6, iVar);
                return gestaltCheckBox6;
            case 23:
                Intrinsics.checkNotNullParameter(context, "context");
                return new GestaltCheckBox(context, new em1.d(em1.b.UNCHECKED, em1.e.ENABLED, fm1.c.VISIBLE, bs1.c.j2(new String[0], oc0.q.checkbox_unchecked), null, 0, false, 1008));
            case 24:
                Intrinsics.checkNotNullParameter(context, "context");
                return new GestaltCheckBox(context, new em1.d(em1.b.CHECKED, em1.e.ENABLED, fm1.c.VISIBLE, bs1.c.j2(new String[0], oc0.q.checkbox_checked), null, 0, false, 1008));
            case 25:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltCheckBox gestaltCheckBox7 = new GestaltCheckBox(context, new em1.d(em1.b.UNCHECKED, em1.e.ENABLED, fm1.c.VISIBLE, bs1.c.j2(new String[0], oc0.q.checkbox_checked), null, 0, false, 1008));
                c0.d.l(gestaltCheckBox7, iVar);
                return gestaltCheckBox7;
            case 26:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltCheckBox gestaltCheckBox8 = new GestaltCheckBox(context, new em1.d(em1.b.CHECKED, em1.e.ENABLED, fm1.c.VISIBLE, bs1.c.j2(new String[0], oc0.q.checkbox_checked), null, 0, false, 1008));
                c0.d.l(gestaltCheckBox8, iVar);
                return gestaltCheckBox8;
            case 27:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltCheckBox gestaltCheckBox9 = new GestaltCheckBox(context, new em1.d(em1.b.UNCHECKED, em1.e.DISABLED, fm1.c.VISIBLE, bs1.c.j2(new String[0], oc0.q.checkbox_unchecked), null, 0, false, 1008));
                c0.d.l(gestaltCheckBox9, iVar);
                return gestaltCheckBox9;
            case 28:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltCheckBox gestaltCheckBox10 = new GestaltCheckBox(context, new em1.d(em1.b.CHECKED, em1.e.DISABLED, fm1.c.VISIBLE, bs1.c.j2(new String[0], oc0.q.checkbox_checked), null, 0, false, 1008));
                c0.d.l(gestaltCheckBox10, iVar);
                return gestaltCheckBox10;
        }
    }

    public final void e(am1.h bind) {
        switch (this.f107259i) {
            case 8:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                am1.d serviceVariant = am1.d.GOOGLE;
                bind.getClass();
                Intrinsics.checkNotNullParameter(serviceVariant, "serviceVariant");
                bind.f15538a = serviceVariant;
                am1.c labelType = am1.c.LOGIN;
                Intrinsics.checkNotNullParameter(labelType, "labelType");
                bind.f15539b = labelType;
                break;
            case 9:
            case 11:
            case 13:
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                am1.d serviceVariant2 = am1.d.LINE;
                bind.getClass();
                Intrinsics.checkNotNullParameter(serviceVariant2, "serviceVariant");
                bind.f15538a = serviceVariant2;
                am1.c labelType2 = am1.c.CONTINUE;
                Intrinsics.checkNotNullParameter(labelType2, "labelType");
                bind.f15539b = labelType2;
                break;
            case 10:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                am1.d serviceVariant3 = am1.d.APPLE;
                bind.getClass();
                Intrinsics.checkNotNullParameter(serviceVariant3, "serviceVariant");
                bind.f15538a = serviceVariant3;
                am1.c labelType3 = am1.c.SIGNUP;
                Intrinsics.checkNotNullParameter(labelType3, "labelType");
                bind.f15539b = labelType3;
                break;
            case 12:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                am1.d serviceVariant4 = am1.d.FACEBOOK;
                bind.getClass();
                Intrinsics.checkNotNullParameter(serviceVariant4, "serviceVariant");
                bind.f15538a = serviceVariant4;
                break;
            case 14:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                am1.d serviceVariant5 = am1.d.EMAIL;
                bind.getClass();
                Intrinsics.checkNotNullParameter(serviceVariant5, "serviceVariant");
                bind.f15538a = serviceVariant5;
                am1.c labelType4 = am1.c.CONTINUE;
                Intrinsics.checkNotNullParameter(labelType4, "labelType");
                bind.f15539b = labelType4;
                break;
        }
    }

    public final void f(yl1.l bind) {
        switch (this.f107259i) {
            case 0:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.d("Button");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.d("Full Width Large Button");
                bind.f(yl1.e.FULL_WIDTH);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.d("Button");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.d("Full Width Large Button");
                bind.f(yl1.e.FULL_WIDTH);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.d("Full Width Small Button");
                bind.f(yl1.e.FULL_WIDTH);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.d("Full Width Small Button");
                bind.f(yl1.e.FULL_WIDTH);
                break;
            case 6:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.d("Full Width Large Button");
                bind.f(yl1.e.FULL_WIDTH);
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.d("Full Width Small Button");
                bind.f(yl1.e.FULL_WIDTH);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f107259i) {
            case 0:
                f((yl1.l) obj);
                break;
            case 1:
                f((yl1.l) obj);
                break;
            case 2:
                f((yl1.l) obj);
                break;
            case 3:
                f((yl1.l) obj);
                break;
            case 4:
                f((yl1.l) obj);
                break;
            case 5:
                f((yl1.l) obj);
                break;
            case 6:
                f((yl1.l) obj);
                break;
            case 7:
                f((yl1.l) obj);
                break;
            case 8:
                e((am1.h) obj);
                break;
            case 10:
                e((am1.h) obj);
                break;
            case 12:
                e((am1.h) obj);
                break;
            case 14:
                e((am1.h) obj);
                break;
            case 16:
                e((am1.h) obj);
                break;
        }
        return b((Context) obj);
    }
}
