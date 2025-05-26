package t80;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import s80.h7;
import s80.l7;
import u50.g0;
import u50.k0;

/* loaded from: classes5.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final u80.j f116737a;

    /* renamed from: b, reason: collision with root package name */
    public static final u80.j f116738b;

    /* renamed from: c, reason: collision with root package name */
    public static final u80.j f116739c;

    /* renamed from: d, reason: collision with root package name */
    public static final u80.j f116740d;

    /* renamed from: e, reason: collision with root package name */
    public static final u80.j f116741e;

    /* renamed from: f, reason: collision with root package name */
    public static final u80.j f116742f;

    static {
        k0 b13 = g0.b(new String[0], l7.empty_state_carousel_card_drafts);
        Integer valueOf = Integer.valueOf(h7.composer_carousel_card_background_01);
        long d2 = androidx.compose.ui.graphics.a.d(4292538354L);
        u80.g gVar = new u80.g(u80.m.f120966a, 0, 14);
        c cVar = c.Drafts;
        f116737a = new u80.j(b13, null, null, valueOf, null, d2, gVar, cVar.ordinal(), null, 0.0f, null, 1814);
        k0 b14 = g0.b(new String[0], l7.empty_state_carousel_card_remix);
        Integer valueOf2 = Integer.valueOf(h7.composer_carousel_card_background_02);
        long d13 = androidx.compose.ui.graphics.a.d(4294113508L);
        u80.g gVar2 = new u80.g(u80.m.f120967b, 0, 14);
        c cVar2 = c.Remixes;
        f116738b = new u80.j(b14, null, null, valueOf2, null, d13, gVar2, cVar2.ordinal(), null, 0.0f, null, 1814);
        k0 b15 = g0.b(new String[0], l7.empty_state_carousel_card_onboarding);
        Integer valueOf3 = Integer.valueOf(h7.composer_carousel_card_background_03);
        long d14 = androidx.compose.ui.graphics.a.d(4292796903L);
        u80.g gVar3 = new u80.g(null, 0, 15);
        c cVar3 = c.Onboarding;
        f116739c = new u80.j(b15, null, null, valueOf3, null, d14, gVar3, cVar3.ordinal(), null, 0.0f, null, 1814);
        n4.e eVar = null;
        float f13 = 0.0f;
        vn1.c cVar4 = null;
        vn1.c cVar5 = null;
        Integer num = null;
        f116740d = new u80.j(g0.b(new String[0], l7.empty_state_carousel_card_drafts), cVar4, cVar5, Integer.valueOf(h7.composer_carousel_card_drafts_background), num, androidx.compose.ui.graphics.a.d(4292538354L), new u80.g(u80.m.f120968c, eo1.c.rounding_400, 2), cVar.ordinal(), eVar, f13, g0.b(new String[0], l7.empty_state_carousel_drafts_cta), 790);
        k0 b16 = g0.b(new String[0], l7.empty_state_carousel_card_templates);
        int i13 = eo1.b.base_color_purple_500;
        long d15 = androidx.compose.ui.graphics.a.d(4285350512L);
        vn1.c cVar6 = vn1.c.LIGHT;
        vn1.c cVar7 = null;
        Integer num2 = null;
        f116741e = new u80.j(b16, cVar6, cVar7, num2, Integer.valueOf(i13), d15, new u80.g(u80.m.f120969d, eo1.c.rounding_400, 2), cVar2.ordinal(), null, 0.6f, g0.b(new String[0], l7.empty_state_carousel_templates_cta), RecyclerViewTypes.VIEW_TYPE_PROTECTED_BOARD_HEADER);
        vn1.c cVar8 = null;
        float f14 = 0.0f;
        f116742f = new u80.j(g0.b(new String[0], l7.empty_state_carousel_card_onboarding_new), cVar8, cVar6, Integer.valueOf(h7.composer_carousel_card_learn_more_background), Integer.valueOf(eo1.b.color_background_default), androidx.compose.ui.graphics.a.d(4292796903L), new u80.g(null, eo1.c.rounding_400, 3), cVar3.ordinal(), new n4.e(183.0f), f14, g0.b(new String[0], l7.empty_state_carousel_onboarding_cta), 514);
    }

    public static final u80.j a(u80.j jVar, boolean z13) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return z13 ? jVar : u80.j.e(jVar, null, null, 1023);
    }

    public static final u80.j b(u80.j jVar, List previews) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(previews, "previews");
        u80.g gVar = jVar.f120953g;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(previews, "previews");
        u80.b placement = gVar.f120937a;
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(previews, "previews");
        return u80.j.e(jVar, new u80.g(placement, previews, gVar.f120939c, gVar.f120940d), null, 1983);
    }
}
