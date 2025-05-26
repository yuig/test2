package n00;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import df.j1;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import kh2.a1;
import kh2.c3;
import kh2.g3;
import kh2.k3;
import kh2.m2;
import kh2.n3;
import kh2.p2;
import kh2.s0;
import kh2.u2;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.g2;
import lh0.z3;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f88764a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f88765b;

    static {
        Map synchronizedMap = Collections.synchronizedMap(new EnumMap(c.class));
        Intrinsics.checkNotNullExpressionValue(synchronizedMap, "synchronizedMap(...)");
        f88764a = synchronizedMap;
    }

    public static final String a(c apiFieldType) {
        String str;
        Intrinsics.checkNotNullParameter(apiFieldType, "apiFieldType");
        if (f88765b && (str = (String) f88764a.get(apiFieldType)) != null) {
            return str;
        }
        x92.b apiFieldsMap = new x92.b(23);
        switch (a.f88762a[apiFieldType.ordinal()]) {
            case 1:
                dl2.b.l(apiFieldsMap);
                break;
            case 2:
                j1.k(apiFieldsMap);
                break;
            case 3:
                d7.b.f(apiFieldsMap);
                break;
            case 4:
                s0.v(apiFieldsMap);
                break;
            case 5:
                int i13 = f0.f88773a;
                bz.h.c(apiFieldsMap, true);
                break;
            case 6:
                bs1.c.h(apiFieldsMap);
                break;
            case 7:
                c3.f(apiFieldsMap);
                break;
            case 8:
                n3.i(apiFieldsMap);
                break;
            case 9:
                g3.n(apiFieldsMap);
                break;
            case 10:
                bs1.c.h(apiFieldsMap);
                apiFieldsMap.e("board.image_thumbnail_url");
                break;
            case 11:
                kh2.j1.G(apiFieldsMap);
                break;
            case 12:
                kh2.j1.G(apiFieldsMap);
                apiFieldsMap.e("interest.is_followed");
                break;
            case 13:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                apiFieldsMap.h("interest.images", "75x75");
                n60.o.A(apiFieldsMap, "interest.images", "236x", "usecase.id", "usecase.type");
                n60.o.w(apiFieldsMap, "usecase.label", "usecase.key", "usecase.images", "usecase.image_signature");
                apiFieldsMap.e("usecase.recommendation_reason");
                break;
            case 14:
                m2.b0(apiFieldsMap);
                break;
            case 15:
                f0.h.k(apiFieldsMap);
                break;
            case 16:
                dn.c.k(apiFieldsMap);
                break;
            case 17:
                p2.L(apiFieldsMap);
                break;
            case 18:
                g3.o(apiFieldsMap);
                break;
            case 19:
                k3.t(apiFieldsMap);
                break;
            case 20:
                g3.r(apiFieldsMap);
                break;
            case 21:
                kh2.j.l(apiFieldsMap);
                break;
            case 22:
                dn.c.l(apiFieldsMap);
                break;
            case 23:
                u2.q(apiFieldsMap);
                break;
            case 24:
                bs1.c.h(apiFieldsMap);
                apiFieldsMap.e("board.image_cover_hd_url");
                break;
            case 25:
                com.bumptech.glide.c.i(apiFieldsMap);
                break;
            case 26:
                gh0.b.A(apiFieldsMap);
                break;
            case 27:
                el.a.s(apiFieldsMap);
                break;
            case 28:
                k.a(apiFieldsMap);
                break;
            case 29:
                f0.h.l(apiFieldsMap);
                break;
            case 30:
                u2.r(apiFieldsMap);
                break;
            case 31:
                a1.n(apiFieldsMap);
                break;
            case 32:
                jk.v.e(apiFieldsMap);
                break;
            case 33:
                kh2.r.m(apiFieldsMap, false);
                break;
            case 34:
                kh2.r.m(apiFieldsMap, true);
                break;
            case 35:
                i.f88778a.a(apiFieldsMap);
                break;
            case 36:
                kh2.b0.I(apiFieldsMap);
                break;
            case 37:
                k3.s(apiFieldsMap);
                break;
            case 38:
                n3.k(apiFieldsMap);
                break;
            case 39:
                kg.t.h(apiFieldsMap);
                break;
            case 40:
                dl2.b.m(apiFieldsMap);
                break;
            case 41:
                kh2.d.f(apiFieldsMap);
                break;
            case 42:
                j1.h(apiFieldsMap);
                break;
            case 43:
                kh2.j1.E(apiFieldsMap);
                break;
            case 44:
                kotlin.jvm.internal.r.g(apiFieldsMap);
                break;
            case 45:
                a1.m(apiFieldsMap);
                break;
            case 46:
                kh2.j1.F(apiFieldsMap);
                break;
            case 47:
                g3.q(apiFieldsMap);
                break;
            case 48:
                c3.g(apiFieldsMap);
                break;
            case 49:
                el.a.q(apiFieldsMap);
                break;
            case 50:
                d.f88768a.b(apiFieldsMap);
                break;
            case 51:
                el.a.p(apiFieldsMap);
                break;
            case 52:
                jk.v.f(apiFieldsMap);
                break;
            case 53:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                apiFieldsMap.h("interest.images", "236x");
                apiFieldsMap.e("interest.id");
                apiFieldsMap.e("interest.name");
                apiFieldsMap.e("interest.background_color");
                break;
            case 54:
                com.bumptech.glide.c.j(apiFieldsMap);
                break;
            case 55:
                pk.a0.c(apiFieldsMap);
                break;
            case 56:
                p2.K(apiFieldsMap);
                break;
            case 57:
                g3.m(apiFieldsMap);
                break;
            case 58:
                kotlin.jvm.internal.r.f(apiFieldsMap);
                break;
            case 59:
                el.a.r(apiFieldsMap);
                break;
            case 60:
                com.bumptech.glide.d.d(apiFieldsMap);
                break;
            case 61:
                el.a.o(apiFieldsMap);
                break;
            case 62:
                kh2.b0.H(apiFieldsMap);
                break;
            case 63:
                h0.f88777a.a(apiFieldsMap);
                break;
            case 64:
                lp2.b.a(apiFieldsMap);
                break;
            case 65:
                apiFieldsMap.e("board.blocking_actions");
                break;
            case 66:
                k3.w(apiFieldsMap);
                break;
            case 67:
                gh0.b.A(apiFieldsMap);
                apiFieldsMap.e("board.blocking_actions");
                break;
            case 68:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "<this>");
                dl2.b.l(apiFieldsMap);
                g3.p(apiFieldsMap);
                i.f88778a.a(apiFieldsMap);
                break;
            case 69:
                n3.j(apiFieldsMap);
                break;
            case 70:
                f.f88772a.a(apiFieldsMap);
                break;
            case 71:
                g3.p(apiFieldsMap);
                break;
            case 72:
                p2.N(apiFieldsMap);
                break;
            case 73:
                k3.x(apiFieldsMap);
                break;
            case 74:
                o.f88785a.a(apiFieldsMap);
                break;
            case 75:
                a0.f88763a.a(apiFieldsMap);
                break;
            case 76:
                g.f88774a.a(apiFieldsMap);
                break;
            case 77:
                h.f88776a.a(apiFieldsMap);
                break;
            case 78:
                c0.f88767a.a(apiFieldsMap);
                break;
            case 79:
                t.f88790a.a(apiFieldsMap);
                break;
            case 80:
                k3.u(apiFieldsMap);
                break;
            case 81:
                n.f88784a.a(apiFieldsMap);
                break;
            case 82:
                oe.f.m(apiFieldsMap);
                break;
            case 83:
                l.f88782a.a(apiFieldsMap);
                break;
            case 84:
                m.f88783a.a(apiFieldsMap);
                break;
            case 85:
                pp2.a.g(apiFieldsMap);
                break;
            case 86:
                e0.f88771a.a(apiFieldsMap);
                break;
            case 87:
                n60.o.C(apiFieldsMap, "apiFieldsMap", "pin.id", "pin.reaction_by_me", "pin.reaction_counts");
                apiFieldsMap.e("pin.total_reaction_count");
                break;
            case 88:
                dl2.b.k(apiFieldsMap);
                break;
            case 89:
                apiFieldsMap.e("user.messaging_permissions");
                break;
            case 90:
                k3.r(apiFieldsMap);
                break;
            case 91:
                j0.f88781a.a(apiFieldsMap);
                break;
            case 92:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                s0.v(apiFieldsMap);
                apiFieldsMap.h("user.recent_pin_images", "345x");
                apiFieldsMap.h("user.contextual_pin_image_urls", "345x");
                break;
            case 93:
                pe.i.e(apiFieldsMap);
                break;
            case 94:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                pe.i.e(apiFieldsMap);
                apiFieldsMap.e("pin.link_domain()");
                apiFieldsMap.e("domain.official_user()");
                break;
            case 95:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                oe.f.m(apiFieldsMap);
                apiFieldsMap.e("pin.is_virtual_try_on");
                break;
            case 96:
                ph.a.g(apiFieldsMap);
                break;
            case 97:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                ph.a.g(apiFieldsMap);
                apiFieldsMap.e("pin.rich_metadata()");
                apiFieldsMap.e("pin.link_domain()");
                n60.o.w(apiFieldsMap, "pin.link_user_website()", "domain.official_user()", "userwebsite.official_user()", "user.is_primary_website_verified");
                break;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_VIDEO_CREATOR_ANALYTICS_MODULE /* 98 */:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                j1.h(apiFieldsMap);
                apiFieldsMap.e("pin.shopping_flags");
                com.bumptech.glide.d.d(apiFieldsMap);
                break;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NOTE_AND_FAVORITE_MODULE /* 99 */:
                kg.t.j(apiFieldsMap);
                break;
            case 100:
                n3.l(apiFieldsMap);
                break;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE /* 101 */:
                p.f88786a.a(apiFieldsMap);
                break;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE /* 102 */:
                r.f88788a.a(apiFieldsMap);
                break;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE /* 103 */:
                q.f88787a.a(apiFieldsMap);
                break;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE /* 104 */:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "<this>");
                q.f88787a.a(apiFieldsMap);
                g2 d2 = g2.f83370b.d();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) d2.f83373a;
                if (g1Var.o("android_own_profile_pin_shopping_rec_field_pwt", "enabled", z3Var) || g1Var.l("android_own_profile_pin_shopping_rec_field_pwt")) {
                    apiFieldsMap.e("pin.shopping_rec_disabled");
                }
                apiFieldsMap.e("pin.section()");
                break;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE /* 105 */:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "<this>");
                m2.b0(apiFieldsMap);
                apiFieldsMap.e("userdiditdata.videos()");
                apiFieldsMap.e("userdiditdata.paragraph_blocks");
                apiFieldsMap.e("userdiditdata.dominant_color");
                break;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID /* 106 */:
                k3.y(apiFieldsMap);
                break;
            case RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER /* 107 */:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                pp2.a.g(apiFieldsMap);
                apiFieldsMap.e("user.is_verified_merchant");
                break;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE /* 108 */:
                d0.f88769a.a(apiFieldsMap);
                break;
            case RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL /* 109 */:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                d.f88768a.b(apiFieldsMap);
                apiFieldsMap.e("pin.image_medium_url");
                apiFieldsMap.e("profilecoversource.images[1200x]");
                apiFieldsMap.e("user.profile_cover()");
                apiFieldsMap.e("user.image_large_url");
                apiFieldsMap.e("user.image_medium_url");
                break;
            case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL /* 110 */:
                j.f88780a.a(apiFieldsMap);
                break;
            case RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE /* 111 */:
                g0.f88775a.a(apiFieldsMap);
                break;
            case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER /* 112 */:
                x.f88796a.a(apiFieldsMap);
                break;
            case RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL /* 113 */:
                y.f88797a.a(apiFieldsMap);
                break;
            case RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER /* 114 */:
                n60.o.C(apiFieldsMap, "<this>", "pin.type", "pin.id", "pin.embed");
                apiFieldsMap.h("pin.images", "236x");
                apiFieldsMap.h("pin.images", "736x");
                apiFieldsMap.e("pin.image_signature");
                break;
            case RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE /* 115 */:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                l3.c.i(apiFieldsMap);
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                n60.o.A(apiFieldsMap, "interest.images", "236x", "interest.id", "interest.name");
                n60.o.w(apiFieldsMap, "interest.background_color", "creatorrecommendationitem.interest()", "creatorrecommendationitem.pins()", "pin.id");
                apiFieldsMap.e("pin.type");
                apiFieldsMap.h("pin.images", "236x");
                apiFieldsMap.e("pin.story_pin_data_id");
                break;
            case RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW /* 116 */:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                l3.c.i(apiFieldsMap);
                apiFieldsMap.e("creatorrecommendationitem.pins()");
                apiFieldsMap.e("pin.id");
                apiFieldsMap.e("pin.type");
                apiFieldsMap.h("pin.images", "236x");
                apiFieldsMap.e("pin.story_pin_data_id");
                apiFieldsMap.e("user.verified_identity");
                apiFieldsMap.e("user.is_verified_merchant");
                break;
            case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN /* 117 */:
                n60.o.C(apiFieldsMap, "apiFieldsMap", "board.id", "board.name", "board.image_cover_url");
                break;
            case RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL /* 118 */:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                g2 d13 = g2.f83370b.d();
                com.bumptech.glide.d.e(apiFieldsMap);
                apiFieldsMap.e("user.verified_identity");
                apiFieldsMap.e("user.is_verified_merchant");
                apiFieldsMap.e("user.image_medium_url");
                apiFieldsMap.e("user.image_large_url");
                apiFieldsMap.e("user.recent_story_pin_images");
                apiFieldsMap.h("user.recent_pin_images", "345x");
                pk.a0.c(apiFieldsMap);
                apiFieldsMap.e("pin.native_creator()");
                apiFieldsMap.e("storypindata.page_count");
                apiFieldsMap.e("storypindata.pages_preview");
                apiFieldsMap.e("pin.story_pin_data()");
                b0.f88766a.b(apiFieldsMap);
                w.f88795a.a(apiFieldsMap);
                com.bumptech.glide.d.d(apiFieldsMap);
                apiFieldsMap.e("todayarticle.id");
                apiFieldsMap.e("todayarticle.type");
                n60.o.w(apiFieldsMap, "todayarticle.title", "todayarticle.subtitle", "todayarticle.image_urls", "todayarticle.display_type");
                n60.o.w(apiFieldsMap, "todayarticle.cover_pins()", "todayarticle.cover_pin()", "todayarticle.creators()", "todayarticle.article_description");
                n60.o.w(apiFieldsMap, "todayarticle.is_feed_single_column", "todayarticle.article_creator_user()", "todayarticle.override_navigation_url", "todayarticle.display_color");
                n60.o.v(apiFieldsMap, "todayarticle.has_dark_display_color", "todayarticle.is_video_cover", "todayarticle.is_product_pin_feed");
                d.f88768a.b(apiFieldsMap);
                apiFieldsMap.e("user.is_verified_merchant");
                z3 z3Var2 = a4.f83297a;
                g1 g1Var2 = (g1) d13.f83373a;
                if (g1Var2.o("android_premiere_video_quality", "enabled", z3Var2) || g1Var2.l("android_premiere_video_quality")) {
                    i0.b(apiFieldsMap);
                }
                apiFieldsMap.e("pin.duplicated_ad_insertions");
                if (d13.g("enabled", z3Var2) || d13.g("employees", z3Var2) || d13.d()) {
                    pk.a0.b(apiFieldsMap);
                    apiFieldsMap.e("board.board_order_modified_at");
                    apiFieldsMap.e("board.collaborator_count");
                    apiFieldsMap.e("board.pin_count");
                    apiFieldsMap.e("board.section_count");
                    n60.o.w(apiFieldsMap, "board.collaborated_by_me", "board.collaborating_users()", "board.followed_by_me", "board.image_cover_hd_url");
                    n60.o.A(apiFieldsMap, "board.images", "236x", "board.has_custom_cover", "board.is_collaborative");
                    apiFieldsMap.e("board.owner()");
                }
                if (d13.d()) {
                    n60.o.w(apiFieldsMap, "board.featured_board_metadata()", "featuredboard.board_subtitle", "featuredboard.curator()", "featuredboard.is_sponsored_content");
                    apiFieldsMap.e("featuredboard.has_expanded_sections");
                    apiFieldsMap.e("featuredboard.show_curator_attribution_on_slp");
                    break;
                }
                break;
            case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL /* 119 */:
                n60.o.C(apiFieldsMap, "apiFieldsMap", "board.type", "board.id", "board.name");
                break;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL /* 120 */:
                lf.a.a(apiFieldsMap);
                break;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL /* 121 */:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                apiFieldsMap.e("pin.id");
                apiFieldsMap.e("pin.created_at");
                n60.o.A(apiFieldsMap, "pin.images", "736x", "pin.title", "pin.description");
                n60.o.w(apiFieldsMap, "pin.dominant_color", "pin.aggregated_pin_data()", "pin.creator_analytics", "pin.can_delete_did_it_and_comments");
                n60.o.w(apiFieldsMap, "pin.comments_disabled", "pin.did_it_disabled", "pin.user_mention_tags", "pin.closeup_unified_description");
                n60.o.w(apiFieldsMap, "pin.pinner()", "pin.closeup_attribution", "pin.is_repin", "user.username");
                apiFieldsMap.e("user.id");
                j1.g(apiFieldsMap);
                break;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN /* 122 */:
                n60.o.C(apiFieldsMap, "apiFieldsMap", "trackedcommentv2.timestamp", "trackedcommentv2.seen", "trackedcommentv2.source_type");
                n60.o.w(apiFieldsMap, "trackedcommentv2.source_id", "trackedcommentv2.parent_id", "trackedcommentv2.content", "trackedcommentv2.hidden_for");
                n60.o.w(apiFieldsMap, "trackedcommentv2.pin()", "trackedcommentv2.user()", "trackedcommentv2.aggregated_comment", "trackedcommentv2.user_did_it_data");
                n60.o.w(apiFieldsMap, "trackedcommentv2.type", "trackedcommentv2.id", "user.username", "user.full_name");
                n60.o.v(apiFieldsMap, "user.id", "pin.id", "pin.created_at");
                n60.o.A(apiFieldsMap, "pin.images", "736x", "pin.title", "pin.description");
                n60.o.w(apiFieldsMap, "pin.dominant_color", "pin.aggregated_pin_data()", "pin.creator_analytics", "pin.can_delete_did_it_and_comments");
                n60.o.w(apiFieldsMap, "pin.comments_disabled", "pin.did_it_disabled", "pin.user_mention_tags", "pin.closeup_unified_description");
                n60.o.w(apiFieldsMap, "pin.pinner()", "pin.closeup_attribution", "pin.is_repin", "aggregatedpindata.id");
                n60.o.v(apiFieldsMap, "aggregatedpindata.aggregated_stats", "aggregatedpindata.comment_count", "aggregatedpindata.did_it_data");
                break;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL /* 123 */:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                d.f88768a.b(apiFieldsMap);
                apiFieldsMap.e("userdiditdata.id");
                apiFieldsMap.e("userdiditdata.type");
                apiFieldsMap.e("userdiditdata.done_at");
                n60.o.w(apiFieldsMap, "userdiditdata.tags", "userdiditdata.details", "userdiditdata.user()", "user.username");
                n60.o.w(apiFieldsMap, "user.full_name", "user.image_medium_url", "user.image_large_url", "user.image_xlarge_url");
                n60.o.A(apiFieldsMap, "userdiditdata.images", "1080x", "userdiditdata.reaction_by_me", "userdiditdata.reaction_counts");
                n60.o.w(apiFieldsMap, "userdiditdata.comment_count", "userdiditdata.image_signatures", "pin.is_whitelisted_for_tried_it", "pin.is_eligible_for_aggregated_comments");
                apiFieldsMap.e("pin.can_delete_did_it_and_comments");
                break;
            case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER /* 124 */:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                p2.K(apiFieldsMap);
                apiFieldsMap.e("user.username");
                break;
            case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED /* 125 */:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                com.bumptech.glide.d.e(apiFieldsMap);
                break;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL /* 126 */:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                apiFieldsMap.e("user.id");
                apiFieldsMap.e("user.has_confirmed_email");
                break;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK /* 127 */:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                apiFieldsMap.e("user.id");
                apiFieldsMap.e("user.show_all_pins");
                break;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN /* 128 */:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "<this>");
                lf.a.a(apiFieldsMap);
                com.bumptech.glide.c.j(apiFieldsMap);
                break;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS /* 129 */:
                n60.o.C(apiFieldsMap, "apiFieldsMap", "pin.id", "pin.story_pin_data_id", "pin.image_signature");
                w.f88795a.a(apiFieldsMap);
                break;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN /* 130 */:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "<this>");
                kh2.r.m(apiFieldsMap, false);
                apiFieldsMap.e("pin.creator_class()");
                apiFieldsMap.e("pin.creator_class_instance()");
                break;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL /* 131 */:
                e.f88770a.a(apiFieldsMap);
                break;
            case RecyclerViewTypes.VIEW_TYPE_FEED_SECTION_TITLE /* 132 */:
                n60.o.C(apiFieldsMap, "apiFieldsMap", "place.id", "place.type", "place.name");
                n60.o.w(apiFieldsMap, "place.street", "place.images()", "place.latitude", "place.longitude");
                break;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CAROUSEL /* 133 */:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                g2 d14 = g2.f83370b.d();
                pk.a0.b(apiFieldsMap);
                apiFieldsMap.e("board.collaborated_by_me");
                apiFieldsMap.e("board.collaborating_users()");
                apiFieldsMap.e("board.followed_by_me");
                apiFieldsMap.e("board.image_cover_hd_url");
                apiFieldsMap.h("board.images", "236x");
                apiFieldsMap.e("board.has_custom_cover");
                n60.o.w(apiFieldsMap, "board.is_collaborative", "board.owner()", "board.pin_count", "board.privacy");
                apiFieldsMap.e("board.board_order_modified_at");
                z3 z3Var3 = a4.f83297a;
                g1 g1Var3 = (g1) d14.f83373a;
                if (g1Var3.o("android_boards_gg_unification", "enabled", z3Var3) || g1Var3.l("android_boards_gg_unification")) {
                    n60.o.v(apiFieldsMap, "board.collaborator_count", "user.is_verified_merchant", "user.verified_identity");
                }
                apiFieldsMap.e("user.image_medium_url");
                break;
            case RecyclerViewTypes.VIEW_TYPE_PIN_MINI_CELL /* 134 */:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                apiFieldsMap.e("pin.is_eligible_for_filters");
                u2.r(apiFieldsMap);
                break;
            case RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL /* 135 */:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "<this>");
                apiFieldsMap.e("user.id");
                apiFieldsMap.e("user.partnership_opt_in");
                break;
            case RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL /* 136 */:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "<this>");
                j1.i(apiFieldsMap);
                apiFieldsMap.e("user.connected_to_instagram");
                apiFieldsMap.e("user.connected_to_etsy");
                apiFieldsMap.e("user.connected_to_youtube");
                apiFieldsMap.e("user.verified_user_websites");
                break;
            case RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_IMAGE /* 137 */:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "<this>");
                apiFieldsMap.e("scheduledpin.id");
                apiFieldsMap.e("scheduledpin.image");
                break;
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL /* 138 */:
                n60.o.C(apiFieldsMap, "<this>", "scheduledpin.id", "scheduledpin.type", "scheduledpin.image");
                n60.o.w(apiFieldsMap, "scheduledpin.board", "scheduledpin.section", "scheduledpin.user", "scheduledpin.model_type");
                n60.o.v(apiFieldsMap, "scheduledpin.status", "scheduledpin.metadata_attributes", "scheduledpin.scheduled_ts");
                break;
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM /* 139 */:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                pk.a0.c(apiFieldsMap);
                com.bumptech.glide.d.e(apiFieldsMap);
                gh0.b.A(apiFieldsMap);
                apiFieldsMap.e("pin.is_eligible_for_web_closeup");
                apiFieldsMap.e("pin.ad_destination_url");
                apiFieldsMap.e("pin.image_signature");
                j1.g(apiFieldsMap);
                g3.r(apiFieldsMap);
                d.f88768a.b(apiFieldsMap);
                i0.a(apiFieldsMap);
                apiFieldsMap.e("explorearticle.identifier_icon_type");
                apiFieldsMap.e("pin.is_full_width");
                n60.o.w(apiFieldsMap, "pin.image_signature", "pin.pinned_to_board", "pin.aggregated_pin_data()", "aggregatedpindata.id");
                n60.o.w(apiFieldsMap, "aggregatedpindata.pin_tags", "aggregatedpindata.is_shop_the_look", "aggregatedpindata.is_dynamic_collections", "board.should_show_shop_feed");
                n60.o.w(apiFieldsMap, "aggregatedpindata.catalog_collection_type", "aggregatedpindata.pin_tags_chips", "aggregatedpindata.has_xy_tags", "pin.ad_targeting_attribution()");
                j1.g(apiFieldsMap);
                apiFieldsMap.e("aggregatedpindata.aggregated_stats");
                apiFieldsMap.e("user.image_medium_url");
                apiFieldsMap.e("pin.dominant_color");
                apiFieldsMap.e("pin.rich_summary()");
                n60.o.w(apiFieldsMap, "pin.embed", "pin.promoter()", "pin.is_promoted", "pin.promoted_is_removable");
                n60.o.w(apiFieldsMap, "pin.promoted_is_max_video", "pin.is_downstream_promotion", "pin.is_cpc_ad", "pin.promoted_android_deep_link");
                n60.o.w(apiFieldsMap, "pin.recommendation_reason", "pin.board()", "pin.pinner()", "pin.source_interest()");
                n60.o.w(apiFieldsMap, "pin.is_video", "pin.ad_match_reason", "pin.done_by_me", "pin.dark_profile_link");
                n60.o.w(apiFieldsMap, "pin.closeup_description", "pin.domain", "pin.destination_url_type", "user.explicitly_followed_by_me");
                n60.o.w(apiFieldsMap, "board.followed_by_me", "pin.is_repin", "pin.is_native", "pin.native_creator()");
                n60.o.w(apiFieldsMap, "pin.tracking_params", "pin.link_domain()", "pin.link_user_website()", "domain.official_user()");
                apiFieldsMap.e("userwebsite.official_user()");
                apiFieldsMap.e("user.is_verified_merchant");
                d7.b.i(apiFieldsMap);
                apiFieldsMap.e("pin.image_crop");
                n60.o.w(apiFieldsMap, "pin.story_pin_data()", "pin.story_pin_data_id", "storypindata.page_count", "storypindata.pages_preview");
                n60.o.v(apiFieldsMap, "storypindata.has_affiliate_products", "storypindata.metadata()", "storypindata.has_product_pins");
                break;
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ACTION_ITEM /* 140 */:
                n60.o.C(apiFieldsMap, "<this>", "pearinsight.id", "pearinsight.type", "pearinsight.cover_pins()");
                n60.o.w(apiFieldsMap, "pearinsight.insight_type", "pearinsight.primary_style_names()", "pearinsight.subtitle", "pearinsight.title");
                n60.o.w(apiFieldsMap, "pin.id", "pin.type", "pin.dominant_color", "pin.image_medium_url");
                break;
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM_HIDDEN /* 141 */:
                n60.o.C(apiFieldsMap, "<this>", "pearinsight.id", "pearinsight.type", "pearinsight.background_pins()");
                n60.o.w(apiFieldsMap, "pearinsight.description", "pearinsight.domain", "pearinsight.insight_type", "pearinsight.pear_styles()");
                n60.o.w(apiFieldsMap, "pearinsight.pear_simple_styles()", "pearinsight.primary_style_names()", "pearinsight.secondary_style_names()", "pearinsight.subtitle");
                apiFieldsMap.e("pearinsight.title");
                apiFieldsMap.e("pearinsight.description_detail");
                apiFieldsMap.e("pearinsight.board()");
                pk.a0.b(apiFieldsMap);
                n60.o.A(apiFieldsMap, "board.cover_images", "60x60", "pearstyle.id", "pearstyle.cover_image_urls()");
                n60.o.w(apiFieldsMap, "pearstyle.short_description", "pearstyle.title", "pearstyle.query", "pearsimplestyle.cover_image_urls()");
                n60.o.w(apiFieldsMap, "pearsimplestyle.short_description", "pearsimplestyle.title", "pearsimplestyle.query", "pin.id");
                apiFieldsMap.e("pin.type");
                apiFieldsMap.e("pin.dominant_color");
                apiFieldsMap.h("pin.images", "236x");
                break;
            case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL /* 142 */:
                n60.o.C(apiFieldsMap, "<this>", "pearstyle.id", "pearstyle.title", "pearstyle.description");
                n60.o.v(apiFieldsMap, "pearstyle.related_styles()", "pearstyle.vertical", "pearstyle.category");
                break;
            case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_IMAGE /* 143 */:
                n60.o.C(apiFieldsMap, "<this>", "peartopic.type", "peartopic.title", "peartopic.cover_image_urls()");
                apiFieldsMap.e("peartopic.description");
                apiFieldsMap.e("peartopic.query");
                break;
            case RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM /* 144 */:
                n60.o.C(apiFieldsMap, "<this>", "quiz.title", "quiz.questions()", "quizquestion.question_string");
                n60.o.w(apiFieldsMap, "quizquestion.answers", "quizquestion.cover_image_urls()", "quizquestion.format_type", "quizanswer.answer_string");
                n60.o.v(apiFieldsMap, "quizanswer.cover_image_urls()", "quiz.intro_data", "quiz.intro_data");
                break;
            case RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM_TINTED /* 145 */:
                n60.o.C(apiFieldsMap, "<this>", "quizoutput.title", "quizoutput.output_key", "quizoutput.survey");
                n60.o.w(apiFieldsMap, "quizoutput.footer", "quizoutputheadersection.share_cta_title", "quizoutputheadersection.share_cta_subtitle", "quizoutputheadersection.share_option");
                n60.o.w(apiFieldsMap, "quizoutput.header_section", "quizoutputheadersection.custom_background_color", "quizoutputheadersection.cover_pins()", "quizoutputheadersection.title");
                n60.o.w(apiFieldsMap, "quizoutputheadersection.subtitle", "quizoutputheadersection.description", "quizoutputheadersection.nav_title", "quizoutputheadersection.layout_type");
                n60.o.w(apiFieldsMap, "quizoutputheadersection.cover_image_urls()", "quizoutputheadersection.cover_image_urls_dark()", "pin.id", "pin.type");
                apiFieldsMap.e("pin.dominant_color");
                apiFieldsMap.e("pin.image_medium_url");
                apiFieldsMap.h("pin.images", "236x");
                break;
            case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_VIDEO /* 146 */:
                n60.o.C(apiFieldsMap, "<this>", "quizoutputsection.topics()", "quizoutputsection.title", "quizoutputsection.description");
                n60.o.w(apiFieldsMap, "quizoutputsection.section_type", "quizoutputsection.output_data", "quizoutputsectiondata.layout_type", "quizoutputsectiondata.num_columns");
                n60.o.w(apiFieldsMap, "quizoutputsectiondata.objects()", "board.id", "board.name", "board.type");
                n60.o.w(apiFieldsMap, "board.has_custom_cover", "board.pin_count", "board.section_count", "board.image_cover_url");
                n60.o.w(apiFieldsMap, "board.image_cover_hd_url", "board.board_order_modified_at", "board.collaborator_count", "board.action");
                n60.o.A(apiFieldsMap, "board.images", "236x", "board.owner()", "user.full_name");
                n60.o.w(apiFieldsMap, "user.is_verified_merchant", "user.verified_identity", "pin.id", "pin.type");
                apiFieldsMap.e("pin.dominant_color");
                apiFieldsMap.e("pin.image_medium_url");
                apiFieldsMap.h("pin.images", "236x");
                break;
            case RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY /* 147 */:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                bs1.c.h(apiFieldsMap);
                apiFieldsMap.e("user.image_medium_url");
                break;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_BUBBLES_PACKAGE_GRID_MODULE /* 148 */:
                xk2.v vVar = v.f88794a;
                n60.o.C(apiFieldsMap, "<this>", "shuffle.is_draft", "shuffle.type", "shuffle.images[70x,345x,750x]");
                bz.h.f(apiFieldsMap);
                bz.h.e(apiFieldsMap);
                break;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_BRAND_PACKAGE_GRID_MODULE /* 149 */:
                xk2.v vVar2 = v.f88794a;
                bz.h.f(apiFieldsMap);
                break;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY /* 150 */:
                xk2.v vVar3 = v.f88794a;
                Intrinsics.checkNotNullParameter(apiFieldsMap, "<this>");
                bz.h.f(apiFieldsMap);
                bz.h.h(apiFieldsMap);
                break;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIFIED_FILTER_MULTI_SELECT_ITEM /* 151 */:
                xk2.v vVar4 = v.f88794a;
                Intrinsics.checkNotNullParameter(apiFieldsMap, "<this>");
                com.bumptech.glide.c.j(apiFieldsMap);
                bz.h.f(apiFieldsMap);
                break;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRICE_FILTER_ITEM /* 152 */:
                xk2.v vVar5 = v.f88794a;
                n60.o.C(apiFieldsMap, "<this>", "shuffle.is_draft", "shuffle.type", "shuffle.images[70x,345x,750x]");
                bz.h.f(apiFieldsMap);
                break;
            case RecyclerViewTypes.VIEW_TYPE_STANDARD_FILTER_ITEM /* 153 */:
                n60.o.C(apiFieldsMap, "<this>", "board.id", "board.name", "board.privacy");
                n60.o.w(apiFieldsMap, "board.type", "board.owner()", "board.collaborating_users()", "board.is_collaborative");
                n60.o.w(apiFieldsMap, "board.pin_count", "board.section_count", "board.board_order_modified_at", "board.has_custom_cover");
                n60.o.v(apiFieldsMap, "board.pin_thumbnail_urls", "board.image_cover_url", "board.image_cover_hd_url");
                apiFieldsMap.h("board.images", "150x150");
                break;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRODUCT_FILTER_HEADER /* 154 */:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "<this>");
                apiFieldsMap.h("pin.images", "236x");
                apiFieldsMap.e("storypindata.is_deleted");
                d.f88768a.b(apiFieldsMap);
                apiFieldsMap.e("user.is_verified_merchant");
                break;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_FILTER /* 155 */:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "<this>");
                apiFieldsMap.h("pin.images", "736x");
                d.f88768a.b(apiFieldsMap);
                apiFieldsMap.e("user.is_verified_merchant");
                break;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY_FILTER_ITEM /* 156 */:
                n60.o.C(apiFieldsMap, "<this>", "nuxusecase.id", "nuxusecase.background_color", "nuxusecase.display_name");
                apiFieldsMap.e("nuxusecase.pin()");
                apiFieldsMap.e("nuxusecase.pins()");
                pk.a0.c(apiFieldsMap);
                break;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_SORT_FILTER /* 157 */:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "<this>");
                apiFieldsMap.e("nuxusecasepinsresponse.pins()");
                d.f88768a.b(apiFieldsMap);
                break;
            case RecyclerViewTypes.VIEW_TYPE_STELA_IN_FLASHLIGHT_ONE_COLUMN /* 158 */:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "<this>");
                pk.a0.b(apiFieldsMap);
                apiFieldsMap.e("board.description");
                apiFieldsMap.e("board.header");
                apiFieldsMap.e("board.pin_count");
                apiFieldsMap.e("board.automagical_board_metadata");
                break;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_EDUCATION_HEADER /* 159 */:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "<this>");
                apiFieldsMap.e("pin.id");
                apiFieldsMap.e("pin.digital_media_source_type");
                break;
            case 160:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "<this>");
                apiFieldsMap.e("instagramconnectendpointresponse.is_migration_backfilled");
                break;
            default:
                throw new IllegalArgumentException("Provided ApiFieldType is not supported");
        }
        String T = apiFieldsMap.T();
        if (f88765b) {
            Map map = f88764a;
            Intrinsics.f(T);
            map.put(apiFieldType, T);
        }
        Intrinsics.checkNotNullExpressionValue(T, "also(...)");
        return T;
    }
}
