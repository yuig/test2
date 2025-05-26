package rc0;

import android.content.Context;
import android.view.View;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.gestalt.headerBar.GestaltHeaderBar;
import df.j1;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107349i;

    /* renamed from: j, reason: collision with root package name */
    public static final n0 f107332j = new n0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final n0 f107333k = new n0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final n0 f107334l = new n0(2);

    /* renamed from: m, reason: collision with root package name */
    public static final n0 f107335m = new n0(3);

    /* renamed from: n, reason: collision with root package name */
    public static final n0 f107336n = new n0(4);

    /* renamed from: o, reason: collision with root package name */
    public static final n0 f107337o = new n0(5);

    /* renamed from: p, reason: collision with root package name */
    public static final n0 f107338p = new n0(6);

    /* renamed from: q, reason: collision with root package name */
    public static final n0 f107339q = new n0(7);

    /* renamed from: r, reason: collision with root package name */
    public static final n0 f107340r = new n0(8);

    /* renamed from: s, reason: collision with root package name */
    public static final n0 f107341s = new n0(9);

    /* renamed from: t, reason: collision with root package name */
    public static final n0 f107342t = new n0(10);

    /* renamed from: u, reason: collision with root package name */
    public static final n0 f107343u = new n0(11);

    /* renamed from: v, reason: collision with root package name */
    public static final n0 f107344v = new n0(12);

    /* renamed from: w, reason: collision with root package name */
    public static final n0 f107345w = new n0(13);

    /* renamed from: x, reason: collision with root package name */
    public static final n0 f107346x = new n0(14);

    /* renamed from: y, reason: collision with root package name */
    public static final n0 f107347y = new n0(15);

    /* renamed from: z, reason: collision with root package name */
    public static final n0 f107348z = new n0(16);
    public static final n0 A = new n0(17);
    public static final n0 B = new n0(18);
    public static final n0 C = new n0(19);
    public static final n0 D = new n0(20);
    public static final n0 E = new n0(21);
    public static final n0 F = new n0(22);
    public static final n0 G = new n0(23);
    public static final n0 H = new n0(24);
    public static final n0 I = new n0(25);

    /* renamed from: J, reason: collision with root package name */
    public static final n0 f107331J = new n0(26);
    public static final n0 K = new n0(27);
    public static final n0 L = new n0(28);
    public static final n0 M = new n0(29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(int i13) {
        super(1);
        this.f107349i = i13;
    }

    public final View b(Context context) {
        nm1.f fVar = nm1.f.f91423a;
        em1.i iVar = em1.i.f59624q;
        switch (this.f107349i) {
            case 0:
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltCheckBox gestaltCheckBox = new GestaltCheckBox(context, new em1.d(em1.b.CHECKED, em1.e.ERROR, fm1.c.VISIBLE, bs1.c.j2(new String[0], oc0.q.checkbox_checked), bs1.c.j2(new String[0], oc0.q.error_text), 0, false, 992));
                c0.d.l(gestaltCheckBox, iVar);
                return gestaltCheckBox;
            case 1:
                Intrinsics.checkNotNullParameter(context, "context");
                CharSequence a03 = j1.a0("This is some text. <a href=\"http://google.com\">Click here</a>");
                em1.b bVar = em1.b.UNCHECKED;
                fm1.c cVar = fm1.c.VISIBLE;
                Intrinsics.f(a03);
                GestaltCheckBox gestaltCheckBox2 = new GestaltCheckBox(context, new em1.d(bVar, null, cVar, bs1.c.h2(a03), null, 0, true, 754));
                c0.d.l(gestaltCheckBox2, iVar);
                return gestaltCheckBox2;
            case 2:
            default:
                Intrinsics.checkNotNullParameter(context, "ctx");
                int i13 = oc0.q.component_header_bar_component_title;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return new GestaltHeaderBar(context, new nm1.e0(new u50.k0(i13, new ArrayList(0)), null, new nm1.h(bs1.c.p2("Button")), new nm1.h(bs1.c.p2("Button")), nm1.h0.TRANSPARENT, 34));
            case 3:
                Intrinsics.checkNotNullParameter(context, "ctx");
                int i14 = oc0.q.component_header_bar_component_title;
                String[] formatArgs2 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
                return new GestaltHeaderBar(context, new nm1.e0(new u50.k0(i14, new ArrayList(0)), null, new nm1.i(0, "", "User"), new nm1.e(new nm1.n(null, rm1.q.ELLIPSIS), new nm1.n(null, rm1.q.FILTER)), null, 50));
            case 4:
                Intrinsics.checkNotNullParameter(context, "ctx");
                int i15 = oc0.q.component_header_bar_component_title;
                String[] formatArgs3 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs3, "formatArgs");
                return new GestaltHeaderBar(context, new nm1.e0(new u50.k0(i15, new ArrayList(0)), null, new nm1.i(0, "", "User"), new nm1.e(new nm1.n(null, rm1.q.ELLIPSIS), new nm1.n(null, rm1.q.FILTER)), null, 50));
            case 5:
                Intrinsics.checkNotNullParameter(context, "ctx");
                int i16 = oc0.q.component_header_bar_component_title;
                String[] formatArgs4 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs4, "formatArgs");
                return new GestaltHeaderBar(context, new nm1.e0(new u50.k0(i16, new ArrayList(0)), null, new nm1.i(0, "", "User"), new nm1.i(0, "", "User"), null, 50));
            case 6:
                Intrinsics.checkNotNullParameter(context, "ctx");
                return new GestaltHeaderBar(context, new nm1.f0(new nm1.i(0, "", "User"), new nm1.g(new nm1.n(null, rm1.q.FILTER)), null, 12));
            case 7:
                Intrinsics.checkNotNullParameter(context, "ctx");
                return new GestaltHeaderBar(context, new nm1.f0(new nm1.i(0, "", "User"), new nm1.e(new nm1.n(null, rm1.q.ELLIPSIS), new nm1.n(null, rm1.q.FILTER)), null, 12));
            case 8:
                Intrinsics.checkNotNullParameter(context, "ctx");
                return new GestaltHeaderBar(context, new nm1.f0(new nm1.i(0, "", "User"), new nm1.e(new nm1.n(null, rm1.q.ELLIPSIS), new nm1.n(null, rm1.q.FILTER)), nm1.h0.TRANSPARENT, 8));
            case 9:
                Intrinsics.checkNotNullParameter(context, "ctx");
                return new GestaltHeaderBar(context, new nm1.f0(new nm1.i(0, "", "User"), fVar, null, 12));
            case 10:
                Intrinsics.checkNotNullParameter(context, "ctx");
                Intrinsics.checkNotNullParameter("Search your Pins", "string");
                return new GestaltHeaderBar(context, new nm1.z(new u50.f0("Search your Pins"), new nm1.x(null, rm1.q.CAMERA), fVar, null, 24));
            case 11:
                Intrinsics.checkNotNullParameter(context, "ctx");
                Intrinsics.checkNotNullParameter("Search your Pins", "string");
                return new GestaltHeaderBar(context, new nm1.z(new u50.f0("Search your Pins"), new nm1.w(rm1.q.MICROPHONE, rm1.q.CAMERA, null, null), fVar, null, 24));
            case 12:
                Intrinsics.checkNotNullParameter(context, "ctx");
                Intrinsics.checkNotNullParameter("Search your Pins", "string");
                return new GestaltHeaderBar(context, new nm1.z(new u50.f0("Search your Pins"), new nm1.x(null, rm1.q.CAMERA), new nm1.e(new nm1.n(null, rm1.q.ELLIPSIS), new nm1.n(null, rm1.q.FILTER)), null, 24));
            case 13:
                Intrinsics.checkNotNullParameter(context, "ctx");
                int i17 = oc0.q.component_header_bar_component_title;
                String[] formatArgs5 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs5, "formatArgs");
                return new GestaltHeaderBar(context, new nm1.e0(new u50.k0(i17, new ArrayList(0)), null, new nm1.g(new nm1.n(null, rm1.q.ARROW_BACK)), new nm1.g(new nm1.n(null, rm1.q.FILTER)), null, 50));
            case 14:
                Intrinsics.checkNotNullParameter(context, "ctx");
                Intrinsics.checkNotNullParameter("Search your Pins", "string");
                return new GestaltHeaderBar(context, new nm1.z(new u50.f0("Search your Pins"), new nm1.w(rm1.q.MICROPHONE, rm1.q.CAMERA, null, null), new nm1.e(new nm1.n(null, rm1.q.ELLIPSIS), new nm1.n(null, rm1.q.FILTER)), null, 24));
            case 15:
                Intrinsics.checkNotNullParameter(context, "ctx");
                Intrinsics.checkNotNullParameter("Search your Pins", "string");
                return new GestaltHeaderBar(context, new nm1.z(new u50.f0("Search your Pins"), new nm1.x(null, rm1.q.CAMERA), new nm1.e(new nm1.n(null, rm1.q.ELLIPSIS), new nm1.n(null, rm1.q.FILTER)), nm1.h0.TRANSPARENT, 16));
            case 16:
                Intrinsics.checkNotNullParameter(context, "ctx");
                Intrinsics.checkNotNullParameter("Tab 1", "string");
                nm1.c0 c0Var = new nm1.c0(0, new u50.f0("Tab 1"));
                Intrinsics.checkNotNullParameter("Tab 2", "string");
                nm1.c0 c0Var2 = new nm1.c0(0, new u50.f0("Tab 2"));
                Intrinsics.checkNotNullParameter("Tab 3", "string");
                return new GestaltHeaderBar(context, new nm1.a0(kotlin.collections.f0.j(c0Var, c0Var2, new nm1.c0(0, new u50.f0("Tab 3"))), 0, null, 12, 0));
            case 17:
                Intrinsics.checkNotNullParameter(context, "ctx");
                Intrinsics.checkNotNullParameter("Tab 1", "string");
                nm1.c0 c0Var3 = new nm1.c0(0, new u50.f0("Tab 1"));
                Intrinsics.checkNotNullParameter("Tab 2", "string");
                nm1.c0 c0Var4 = new nm1.c0(0, new u50.f0("Tab 2"));
                Intrinsics.checkNotNullParameter("Tab 3", "string");
                return new GestaltHeaderBar(context, new nm1.a0(kotlin.collections.f0.j(c0Var3, c0Var4, new nm1.c0(0, new u50.f0("Tab 3"))), 0, nm1.h0.TRANSPARENT, 8, 0));
            case 18:
                Intrinsics.checkNotNullParameter(context, "ctx");
                Intrinsics.checkNotNullParameter("Visible tab", "string");
                nm1.c0 c0Var5 = new nm1.c0(0, new u50.f0("Visible tab"));
                Intrinsics.checkNotNullParameter("Visible tab", "string");
                nm1.c0 c0Var6 = new nm1.c0(0, new u50.f0("Visible tab"));
                Intrinsics.checkNotNullParameter("Visible tab", "string");
                nm1.c0 c0Var7 = new nm1.c0(0, new u50.f0("Visible tab"));
                Intrinsics.checkNotNullParameter("Partially visible tab", "string");
                return new GestaltHeaderBar(context, new nm1.a0(kotlin.collections.f0.j(c0Var5, c0Var6, c0Var7, new nm1.c0(0, new u50.f0("Partially visible tab"))), 0, null, 12, 0));
            case 19:
                Intrinsics.checkNotNullParameter(context, "ctx");
                Intrinsics.checkNotNullParameter("Tab 1", "string");
                nm1.c0 c0Var8 = new nm1.c0(0, new u50.f0("Tab 1"));
                Intrinsics.checkNotNullParameter("Tab 2", "string");
                return new GestaltHeaderBar(context, new nm1.b0(c0Var8, new nm1.c0(0, new u50.f0("Tab 2")), 0, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL, 0));
            case 20:
                Intrinsics.checkNotNullParameter(context, "ctx");
                Intrinsics.checkNotNullParameter("Tab 1", "string");
                nm1.c0 c0Var9 = new nm1.c0(0, new u50.f0("Tab 1"));
                Intrinsics.checkNotNullParameter("Tab 2", "string");
                return new GestaltHeaderBar(context, new nm1.b0(c0Var9, new nm1.c0(0, new u50.f0("Tab 2")), 0, nm1.h0.TRANSPARENT, null, null, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, 0));
            case 21:
                Intrinsics.checkNotNullParameter(context, "ctx");
                Intrinsics.checkNotNullParameter("Tab 1", "string");
                nm1.c0 c0Var10 = new nm1.c0(0, new u50.f0("Tab 1"));
                Intrinsics.checkNotNullParameter("Tab 2", "string");
                return new GestaltHeaderBar(context, new nm1.b0(c0Var10, new nm1.c0(0, new u50.f0("Tab 2")), 0, null, new nm1.g(new nm1.n(null, rm1.q.ARROW_BACK)), new nm1.g(new nm1.n(null, rm1.q.FILTER)), 72, 0));
            case 22:
                Intrinsics.checkNotNullParameter(context, "ctx");
                int i18 = oc0.q.component_header_bar_component_title;
                String[] formatArgs6 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs6, "formatArgs");
                return new GestaltHeaderBar(context, new nm1.e0(new u50.k0(i18, new ArrayList(0)), null, new nm1.g(new nm1.n(null, rm1.q.ARROW_BACK)), new nm1.g(new nm1.n(null, rm1.q.FILTER)), nm1.h0.TRANSPARENT, 34));
            case 23:
                Intrinsics.checkNotNullParameter(context, "ctx");
                int i19 = oc0.q.component_header_bar_component_title;
                String[] formatArgs7 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs7, "formatArgs");
                return new GestaltHeaderBar(context, new nm1.e0(new u50.k0(i19, new ArrayList(0)), null, new nm1.g(new nm1.n(null, rm1.q.ARROW_BACK)), null, null, 58));
            case 24:
                Intrinsics.checkNotNullParameter(context, "ctx");
                int i23 = oc0.q.component_header_bar_component_title;
                String[] formatArgs8 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs8, "formatArgs");
                return new GestaltHeaderBar(context, new nm1.e0(new u50.k0(i23, new ArrayList(0)), null, null, new nm1.g(new nm1.n(null, rm1.q.FILTER)), null, 54));
            case 25:
                Intrinsics.checkNotNullParameter(context, "ctx");
                return new GestaltHeaderBar(context, new nm1.e0(null, null, new nm1.g(new nm1.n(null, rm1.q.ARROW_BACK)), new nm1.g(new nm1.n(null, rm1.q.FILTER)), null, 51));
            case 26:
                Intrinsics.checkNotNullParameter(context, "ctx");
                return new GestaltHeaderBar(context, new nm1.e0(u50.g0.b(new String[0], oc0.q.component_header_bar_component_title), u50.g0.b(new String[0], oc0.q.component_header_bar_component_subtitle), new nm1.g(new nm1.n(null, rm1.q.ARROW_BACK)), new nm1.g(new nm1.n(null, rm1.q.FILTER)), null, 48));
            case 27:
                Intrinsics.checkNotNullParameter(context, "ctx");
                int i24 = oc0.q.component_header_bar_component_title;
                String[] formatArgs9 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs9, "formatArgs");
                u50.k0 k0Var = new u50.k0(i24, new ArrayList(0));
                rm1.q qVar = rm1.q.ARROW_BACK;
                nm1.n nVar = new nm1.n(null, qVar);
                rm1.q qVar2 = rm1.q.ADD;
                return new GestaltHeaderBar(context, new nm1.e0(k0Var, null, new nm1.e(nVar, new nm1.n(null, qVar2)), new nm1.e(new nm1.n(null, qVar), new nm1.n(null, qVar2)), null, 50));
            case 28:
                Intrinsics.checkNotNullParameter(context, "ctx");
                int i25 = oc0.q.component_header_bar_component_title;
                String[] formatArgs10 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs10, "formatArgs");
                return new GestaltHeaderBar(context, new nm1.e0(new u50.k0(i25, new ArrayList(0)), null, new nm1.h(bs1.c.p2("Button")), new nm1.h(bs1.c.p2("Button")), null, 50));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f107349i) {
            case 2:
                jm1.f bind = (jm1.f) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                jm1.c orientation = jm1.c.VERTICAL;
                bind.getClass();
                Intrinsics.checkNotNullParameter(orientation, "orientation");
                bind.f77040f = orientation;
                int i13 = eo1.c.space_300;
                bind.f77038d = new u50.b0(i13);
                bind.f77039e = new u50.b0(i13);
                break;
        }
        return b((Context) obj);
    }
}
