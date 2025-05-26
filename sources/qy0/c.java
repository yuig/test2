package qy0;

import com.pinterest.api.model.qz;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.util.Map;
import jv1.h;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import u50.f0;
import u50.g0;
import u50.i0;
import u50.k0;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f105351a = z0.g(new Pair(SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE, g0.b(new String[0], h.nux_use_case_title_cute_animals)), new Pair("2", g0.b(new String[0], h.nux_use_case_title_visual_art)), new Pair("3", g0.b(new String[0], h.nux_use_case_title_nail_trends)), new Pair("4", g0.b(new String[0], h.nux_use_case_title_hair_inspiration)), new Pair("5", g0.b(new String[0], h.nux_use_case_title_makeup_looks)), new Pair("6", g0.b(new String[0], h.nux_use_case_title_phone_wallpapers)), new Pair("7", g0.b(new String[0], h.nux_use_case_title_diy_projects)), new Pair("8", g0.b(new String[0], h.nux_use_case_title_pop_culture)), new Pair("9", g0.b(new String[0], h.nux_use_case_title_weddings)), new Pair("10", g0.b(new String[0], h.nux_use_case_title_outfit_ideas)), new Pair("11", g0.b(new String[0], h.nux_use_case_title_sneakers)), new Pair("12", g0.b(new String[0], h.nux_use_case_title_cooking)), new Pair("13", g0.b(new String[0], h.nux_use_case_title_baking)), new Pair("14", g0.b(new String[0], h.nux_use_case_title_workouts)), new Pair("15", g0.b(new String[0], h.nux_use_case_title_relaxation)), new Pair("16", g0.b(new String[0], h.nux_use_case_title_home_decor)), new Pair("17", g0.b(new String[0], h.nux_use_case_title_small_spaces)), new Pair("18", g0.b(new String[0], h.nux_use_case_title_plants)), new Pair("19", g0.b(new String[0], h.nux_use_case_title_tattoos)), new Pair("20", g0.b(new String[0], h.nux_use_case_title_travel)), new Pair("21", g0.b(new String[0], h.nux_use_case_title_aesthetics)));

    public static final i0 a(qz qzVar, boolean z13) {
        Intrinsics.checkNotNullParameter(qzVar, "<this>");
        if (!z13) {
            String string = qzVar.l();
            Intrinsics.checkNotNullExpressionValue(string, "getDisplayName(...)");
            Intrinsics.checkNotNullParameter(string, "string");
            return new f0(string);
        }
        k0 k0Var = (k0) f105351a.get(qzVar.getId());
        if (k0Var != null) {
            return k0Var;
        }
        String string2 = qzVar.l();
        Intrinsics.checkNotNullExpressionValue(string2, "getDisplayName(...)");
        Intrinsics.checkNotNullParameter(string2, "string");
        return new f0(string2);
    }
}
