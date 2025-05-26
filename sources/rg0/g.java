package rg0;

import com.pinterest.api.model.c6;
import i32.v0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends ag2.e {

    /* renamed from: c, reason: collision with root package name */
    public final String f108007c;

    /* renamed from: d, reason: collision with root package name */
    public final String f108008d;

    /* renamed from: e, reason: collision with root package name */
    public final String f108009e;

    /* renamed from: f, reason: collision with root package name */
    public final String f108010f;

    /* renamed from: g, reason: collision with root package name */
    public final String f108011g;

    /* renamed from: h, reason: collision with root package name */
    public final String f108012h;

    /* renamed from: i, reason: collision with root package name */
    public final String f108013i;

    /* renamed from: j, reason: collision with root package name */
    public final String f108014j;

    /* renamed from: k, reason: collision with root package name */
    public final String f108015k;

    /* renamed from: l, reason: collision with root package name */
    public final String f108016l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f108017m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f108018n;

    /* renamed from: o, reason: collision with root package name */
    public final String f108019o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f108020p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f108021q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f108022r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f108023s;

    public g(vd0.c cVar) {
        super(null, null);
        ArrayList arrayList;
        this.f108017m = new ArrayList();
        this.f108018n = new ArrayList();
        this.f108021q = new ArrayList();
        this.f108022r = false;
        this.f15163a = cVar.o("title_text", "");
        this.f15164b = cVar.o("detailed_text", "");
        this.f108007c = cVar.o("button1_text", "");
        this.f108008d = cVar.o("button1_uri", "");
        this.f108009e = cVar.o("button2_text", "");
        this.f108010f = cVar.o("button2_uri", "");
        cVar.p("bg_img_url_1x");
        cVar.p("bg_img_url_2x");
        i32.u.findByValue(cVar.j(0, "complete_action"));
        cVar.j(v0.STANDARD.value(), "display_type");
        cVar.j(0, "bag_item_count");
        Boolean bool = Boolean.FALSE;
        cVar.h("bag_display_empty", bool).getClass();
        cVar.h("show_close_button", bool).getClass();
        cVar.j(0, "bag_flyout_timeout_ms");
        cVar.h("expires_after_save", bool).getClass();
        cVar.h("expires_after_closeup", bool).getClass();
        cVar.j(0, "days_to_expire");
        this.f108015k = cVar.o("detailed_text_with_links", "");
        cVar.p("eu_parent_approval_step");
        vd0.c m13 = cVar.m("dismiss_button");
        if (m13 != null) {
            this.f108011g = m13.o("text", "");
            this.f108012h = m13.o("uri", "");
        }
        this.f108023s = cVar.h("dismiss_on_background_tap", Boolean.TRUE).booleanValue();
        vd0.c m14 = cVar.m("complete_button");
        if (m14 != null) {
            this.f108013i = m14.o("text", "");
            this.f108014j = m14.o("uri", "");
        }
        cVar.d("experiment_group");
        cVar.j(0, "pin_impressions");
        cVar.j(0, "pin_clicks");
        cVar.j(0, "pin_saves");
        String pinId = cVar.o("pin_id", "");
        String pinImageUrl = cVar.o("pin_image_url", "");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(pinImageUrl, "pinImageUrl");
        cVar.p("style");
        this.f108016l = cVar.o("board_id", "");
        cVar.p("board_name");
        vd0.c m15 = cVar.m("background_image");
        vd0.c m16 = cVar.m("icon_image");
        vd0.c m17 = cVar.m("cover_image");
        String backgroundImageUri = m15 != null ? m15.o("uri", "") : "";
        cVar.j(0, "layout_narrow");
        String textColorNarrow = cVar.o("text_color_narrow", "");
        String backgroundColorNarrow = cVar.o("background_color_narrow", "");
        String completeButtonBackgroundColorNarrow = cVar.o("complete_button_background_color_narrow", "");
        String completeButtonTextColorNarrow = cVar.o("complete_button_text_color_narrow", "");
        String dismissButtonBackgroundColorNarrow = cVar.o("dismiss_button_background_color_narrow", "");
        String dismissButtonTextColorNarrow = cVar.o("dismiss_button_text_color_narrow", "");
        String iconImageUri = m16 != null ? m16.o("uri", "") : "";
        String coverImageUri = m17 != null ? m17.o("uri", "") : "";
        Intrinsics.checkNotNullParameter(backgroundImageUri, "backgroundImageUri");
        Intrinsics.checkNotNullParameter(textColorNarrow, "textColorNarrow");
        Intrinsics.checkNotNullParameter(backgroundColorNarrow, "backgroundColorNarrow");
        Intrinsics.checkNotNullParameter(completeButtonBackgroundColorNarrow, "completeButtonBackgroundColorNarrow");
        Intrinsics.checkNotNullParameter(completeButtonTextColorNarrow, "completeButtonTextColorNarrow");
        Intrinsics.checkNotNullParameter(dismissButtonBackgroundColorNarrow, "dismissButtonBackgroundColorNarrow");
        Intrinsics.checkNotNullParameter(dismissButtonTextColorNarrow, "dismissButtonTextColorNarrow");
        Intrinsics.checkNotNullParameter(iconImageUri, "iconImageUri");
        Intrinsics.checkNotNullParameter(coverImageUri, "coverImageUri");
        String d2 = cVar.d("component_type");
        if (d2 != null && !d2.isEmpty()) {
            try {
                int parseInt = Integer.parseInt(d2);
                if (i32.s0.findByValue(parseInt) == i32.s0.MULTI_PLATFORM_BANNER) {
                    i32.u.findByValue(cVar.j(0, "complete_button_action"));
                } else if (i32.s0.findByValue(parseInt) == i32.s0.MULTI_PLATFORM_SEARCHDELIGHT) {
                    vd0.a k13 = cVar.k("search_query_list");
                    int d13 = k13.d();
                    for (int i13 = 0; i13 < d13; i13++) {
                        this.f108017m.add(k13.l(i13));
                    }
                    vd0.a k14 = cVar.k("text_colors");
                    int d14 = k14.d();
                    for (int i14 = 0; i14 < d14; i14++) {
                        this.f108018n.add(k14.l(i14));
                    }
                    this.f108019o = cVar.d("text_background_color");
                }
            } catch (Exception unused) {
            }
        }
        this.f108020p = cVar.h("can_close", Boolean.FALSE).booleanValue();
        vd0.a k15 = cVar.k("objects");
        int d15 = k15.d();
        for (int i15 = 0; i15 < d15; i15++) {
            vd0.c j13 = k15.j(i15);
            if ("announcementitem".equals(j13.o("type", "")) && (arrayList = this.f108021q) != null) {
                arrayList.add(vd0.c.f125622b.e(j13.f125623a, c6.class));
            }
        }
        this.f108022r = cVar.h("is_blocking", Boolean.FALSE).booleanValue();
    }
}
