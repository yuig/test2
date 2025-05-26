package rc0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.attribution.GestaltAttribution;
import com.pinterest.gestalt.bannerOverlay.GestaltBannerOverlay;
import com.pinterest.gestalt.indicator.GestaltIndicator;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import k1.n2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final Date f107289a;

    /* renamed from: b, reason: collision with root package name */
    public final Date f107290b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f107291c;

    public c1() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(12, -5);
        this.f107289a = calendar.getTime();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(5, -3);
        this.f107290b = calendar2.getTime();
        Calendar calendar3 = Calendar.getInstance();
        calendar3.add(2, -1);
        this.f107291c = calendar3.getTime();
    }

    public static final GestaltText a(c1 c1Var, Context context, String str) {
        c1Var.getClass();
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        pp2.a.k(gestaltText, new jc0.l(str, 4));
        int W = bs1.c.W(gestaltText, eo1.c.space_300);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        com.bumptech.glide.c.a1(layoutParams, 0, W, 0, W);
        gestaltText.setLayoutParams(layoutParams);
        return gestaltText;
    }

    public static final List b(c1 c1Var) {
        c1Var.getClass();
        return kotlin.collections.f0.j(new u50.f0("Option 1"), new u50.f0("Option 2"), new u50.f0("Option 3"), new u50.f0("Option 4"), new u50.f0("Option 5"));
    }

    public static final LinearLayout c(c1 c1Var, Context context, GestaltIndicator gestaltIndicator) {
        c1Var.getClass();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        pp2.a.k(gestaltText, w0.L);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int W = bs1.c.W(gestaltText, eo1.c.space_100);
        Intrinsics.checkNotNullParameter(layoutParams, "<this>");
        com.bumptech.glide.c.a1(layoutParams, W, W, W, W);
        gestaltText.setLayoutParams(layoutParams);
        linearLayout.addView(gestaltText);
        linearLayout.addView(gestaltIndicator);
        return linearLayout;
    }

    public static b d(u50.i0 i0Var, ul1.l lVar, boolean z13) {
        return new b(i0Var, lVar, z13, 1);
    }

    public static c e(c1 c1Var, rm1.q qVar, String str, Boolean bool, boolean z13, int i13) {
        rm1.q qVar2;
        if ((i13 & 1) != 0) {
            al1.n nVar = GestaltBannerOverlay.f49304m;
            qVar2 = null;
        } else {
            qVar2 = qVar;
        }
        rm1.c cVar = GestaltBannerOverlay.f49305n;
        String str2 = (i13 & 4) != 0 ? null : str;
        if ((i13 & 8) != 0) {
            bool = Boolean.FALSE;
        }
        Boolean bool2 = bool;
        if ((i13 & 16) != 0) {
            z13 = true;
        }
        return new c((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? bs1.c.j2(new String[0], oc0.q.component_callout_state_title) : null, (i13 & 32) != 0 ? bs1.c.j2(new String[0], oc0.q.component_banner_overlay_state_primary_action_button_text) : null, (i13 & 64) != 0 ? bs1.c.j2(new String[0], oc0.q.component_banner_overlay_state_secondary_action_button_text) : null, cVar, qVar2, bool2, str2, z13);
    }

    public static String f(om1.e eVar, Context context) {
        String name = eVar.name();
        int backgroundSize = eVar.getBackgroundSize();
        Intrinsics.checkNotNullParameter(context, "<this>");
        return name + " (" + ((int) j1.E(dl2.b.D0(context, backgroundSize), context)) + "dp)";
    }

    public static GestaltAttribution g(c1 c1Var, Context context, ql1.f fVar, boolean z13, boolean z14, int i13) {
        if ((i13 & 2) != 0) {
            fVar = ql1.f.PINNER;
        }
        if ((i13 & 4) != 0) {
            z13 = true;
        }
        boolean z15 = (i13 & 16) != 0;
        c1Var.getClass();
        GestaltAttribution gestaltAttribution = new GestaltAttribution(6, context, (AttributeSet) null);
        n2 init = new n2(z14, z15, fVar, z13);
        Intrinsics.checkNotNullParameter(gestaltAttribution, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        com.google.firebase.messaging.q qVar = gestaltAttribution.f49244a;
        ql1.j jVar = new ql1.j((ql1.e) ((u50.o) qVar.f33803a));
        init.invoke(jVar);
        ql1.k nextState = new ql1.k(jVar, 0);
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        return gestaltAttribution;
    }

    public static wm1.z h(wm1.a0 a0Var, Context context) {
        int i13 = a.f107239a[a0Var.ordinal()];
        if (i13 == 1) {
            return new wm1.u("https://i.pinimg.com/150x150_RS/35/7b/f5/357bf5667759044421fcd3ccc977f6e1.jpg", "Example");
        }
        if (i13 == 2) {
            return new wm1.y(rm1.q.SEARCH);
        }
        if (i13 == 3) {
            return new wm1.w(new u50.w("https://i.pinimg.com/150x150_RS/35/7b/f5/357bf5667759044421fcd3ccc977f6e1.jpg"));
        }
        if (i13 != 4) {
            if (i13 == 5) {
                return wm1.x.f130340b;
            }
            throw new NoWhenBranchMatchedException();
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(oc0.p.custom_slot);
        return new wm1.v(imageView);
    }

    public static x0 i(c1 c1Var, om1.f fVar, om1.e eVar, int i13) {
        if ((i13 & 1) != 0) {
            fVar = om1.f.DEFAULT_DARK_GRAY;
        }
        if ((i13 & 2) != 0) {
            eVar = om1.e.LG;
        }
        return new x0(1, eVar, fVar, rm1.q.PERSON_ADD);
    }

    public static y0 j(c1 c1Var, boolean z13, wm1.z zVar, wm1.r rVar, wm1.n nVar, int i13) {
        boolean z14 = (i13 & 1) != 0 ? false : z13;
        wm1.s sVar = rVar;
        if ((i13 & 4) != 0) {
            sVar = new wm1.q(bs1.c.p2("Title"), bs1.c.p2("Optional subtext"), false, 4);
        }
        return new y0(z14, zVar, sVar, nVar, 1);
    }

    public static an1.e k(c1 c1Var, u50.f0 f0Var, int i13) {
        u50.k0 j23 = bs1.c.j2(new String[0], oc0.q.component_radio_button_label);
        u50.k0 j24 = bs1.c.j2(new String[0], oc0.q.component_radio_button_sub_text);
        u50.i0 i0Var = f0Var;
        if ((i13 & 4) != 0) {
            i0Var = u50.h0.f120562a;
        }
        return new an1.e(j23, j24, i0Var, (i13 & 8) != 0, 48);
    }

    public static a1 l(c1 c1Var, u50.k0 k0Var, u50.k0 k0Var2, List list, int i13, int i14) {
        return new a1(bs1.c.j2(new String[0], oc0.q.component_radio_group_legend), (i14 & 2) != 0 ? bs1.c.j2(new String[0], oc0.q.component_radio_group_helper_text) : k0Var, (i14 & 4) != 0 ? u50.h0.f120562a : k0Var2, (i14 & 8) != 0 ? kotlin.collections.f0.j(k(c1Var, null, 15), k(c1Var, null, 15)) : list, (i14 & 16) != 0 ? -1 : i13, bs1.c.j2(new String[0], oc0.q.component_radio_group_content_description), 1);
    }

    public static b1 m(c1 c1Var, String str, vn1.c cVar, vn1.g gVar, List list, rn1.b bVar, int i13, int i14) {
        if ((i14 & 1) != 0) {
            str = "Pinterest";
        }
        String str2 = str;
        if ((i14 & 2) != 0) {
            cVar = vn1.c.DEFAULT;
        }
        vn1.c cVar2 = cVar;
        if ((i14 & 4) != 0) {
            gVar = vn1.g.HEADING_700;
        }
        vn1.g gVar2 = gVar;
        if ((i14 & 8) != 0) {
            list = kotlin.collections.e0.b(vn1.e.REGULAR);
        }
        List list2 = list;
        if ((i14 & 16) != 0) {
            bVar = rn1.b.NONE;
        }
        rn1.b bVar2 = bVar;
        if ((i14 & 32) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        return new b1(str2, gVar2, cVar2, list2, bVar2, i13, 1);
    }
}
