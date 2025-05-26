package bz;

import c50.a1;
import c50.c0;
import c50.j1;
import c50.n0;
import c50.o1;
import c50.q;
import c50.q1;
import c50.r0;
import c50.s;
import c50.u;
import c50.y;
import c50.y0;
import h32.d4;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.g2;
import lh0.z3;
import n00.i0;
import n60.o;
import pc.m0;
import pc.w;
import xk2.v;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24181a;

    public /* synthetic */ h(int i13) {
        this.f24181a = i13;
    }

    public static final LinkedHashSet a(d4... d4VarArr) {
        int i13 = i.f24182g;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(f0.j(Arrays.copyOf(d4VarArr, d4VarArr.length)));
        return linkedHashSet;
    }

    public static void c(x92.b apiFieldsMap, boolean z13) {
        Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
        com.bumptech.glide.d.e(apiFieldsMap);
        apiFieldsMap.e("user.image_medium_url");
        apiFieldsMap.e("user.image_large_url");
        o.w(apiFieldsMap, "user.image_xlarge_url", "user.profile_cover()", "profilecoversource.source_id", "profilecoversource.source");
        apiFieldsMap.e("profilecoversource.images[1200x]");
        v vVar = i0.f88779a;
        Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
        apiFieldsMap.e("profilecoversource.video()");
        i0.b(apiFieldsMap);
        apiFieldsMap.e("video.signature");
        o.w(apiFieldsMap, "user.about", "user.blocked_by_me", "user.board_count", "user.secret_board_count");
        o.w(apiFieldsMap, "user.is_primary_website_verified", "user.explicitly_followed_by_me", "user.explicitly_following_me", "user.follower_count");
        o.w(apiFieldsMap, "user.following_count", "user.interest_following_count", "user.explicit_user_following_count", "user.explicit_board_following_count");
        o.w(apiFieldsMap, "user.most_recent_board_sort_order", "user.implicitly_followed_by_me", "user.location", "user.pin_count");
        o.w(apiFieldsMap, "user.story_pin_count", "user.video_pin_count", "user.video_views", "user.has_showcase");
        o.w(apiFieldsMap, "user.verified_identity", "user.website_url", "user.canonical_merchant_domain", "user.impressum_url");
        o.w(apiFieldsMap, "user.pins_done_count", "user.last_pin_save_time", "user.show_discovered_feed", "user.profile_discovered_public");
        apiFieldsMap.e("user.profile_reach");
        apiFieldsMap.e("user.has_catalog");
        if (z13) {
            apiFieldsMap.e("user.eligible_profile_tabs");
        }
        o.w(apiFieldsMap, "partner.id", "partner.enable_profile_message", "partner.contact_email", "partner.contact_phone");
        apiFieldsMap.e("partner.contact_phone_country");
        apiFieldsMap.e("partner.biz_ownership_email");
        g2 d2 = g2.f83370b.d();
        apiFieldsMap.e("user.has_quicksave_board");
        apiFieldsMap.e("user.is_verified_merchant");
        apiFieldsMap.e("user.is_inspirational_merchant");
        o.w(apiFieldsMap, "user.profile_views", "user.email", "user.login_state", "user.ppa_merchant_id");
        apiFieldsMap.e("user.shopping_rec_disabled");
        List j13 = f0.j("en_US", "en_GB", "de", "fr", "it", "es_ES", "es_MX", "es_AR", "es_419", "pt_BR");
        if (j13.contains(Locale.getDefault().toString()) || j13.contains(Locale.getDefault().getLanguage())) {
            apiFieldsMap.e("user.pronouns");
        }
        o.w(apiFieldsMap, "user.has_confirmed_email", "user.creator_level", "user.allow_idea_pin_downloads", "user.ip_stela_rec_disabled");
        o.w(apiFieldsMap, "partner.profile_place()", "user.scheduled_pin_count", "user.is_ads_only_profile", "user.ads_only_profile_site");
        o.w(apiFieldsMap, "user.is_name_eligible_for_lead_form_autofill", "user.is_email_eligible_for_lead_form_autofill", "user.is_age_eligible_for_lead_form_autofill", "user.is_gender_eligible_for_lead_form_autofill");
        o.w(apiFieldsMap, "user.is_country_eligible_for_lead_form_autofill", "user.is_private_profile", "user.is_under_16", "user.is_under_18");
        o.w(apiFieldsMap, "user.is_candidate_for_parental_control_passcode", "user.is_parental_control_passcode_enabled", "user.parental_control_anonymized_email", "user.quick_saves_pin_count");
        o.w(apiFieldsMap, "user.has_pin_clusters", "user.has_created_all_clusters", "user.instagram_data", "user.has_archived_boards");
        o.v(apiFieldsMap, "user.invisible_board_count", "user.archived_board_count", "user.collage_draft_count");
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) d2.f83373a;
        if (g1Var.o("android_weight_loss_opt_out_option", "enabled", z3Var) || g1Var.l("android_weight_loss_opt_out_option")) {
            apiFieldsMap.e("user.weight_loss_ads_opted_out");
        }
        if (g1Var.o("android_featured_boards_be_migration", "enabled", a4.f83298b) || g1Var.l("android_featured_boards_be_migration")) {
            apiFieldsMap.e("user.is_gco_account");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0049, code lost:
    
        if (r1.l("android_curation_tracking_params_addition") == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(x92.b r5) {
        /*
            java.lang.String r0 = "<this>"
            java.lang.String r1 = "pin.shuffle()"
            java.lang.String r2 = "shuffle.id"
            java.lang.String r3 = "shuffle.is_auto_created"
            n60.o.C(r5, r0, r1, r2, r3)
            java.lang.String r0 = "shuffle.source_app_type_detailed"
            r5.e(r0)
            xk2.v r0 = n00.v.f88794a
            java.lang.Object r1 = r0.getValue()
            lh0.g2 r1 = (lh0.g2) r1
            lh0.z3 r2 = lh0.z3.ACTIVATE_EXPERIMENT
            r1.getClass()
            java.lang.String r3 = "activate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            lh0.z0 r1 = r1.f83373a
            lh0.g1 r1 = (lh0.g1) r1
            java.lang.String r3 = "android_curation_tracking_params_addition"
            java.lang.String r1 = r1.g(r3, r2)
            java.lang.String r2 = "enabled"
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r0.getValue()
            lh0.g2 r1 = (lh0.g2) r1
            r1.getClass()
            lh0.z3 r4 = lh0.a4.f83297a
            lh0.z0 r1 = r1.f83373a
            lh0.g1 r1 = (lh0.g1) r1
            boolean r4 = r1.o(r3, r2, r4)
            if (r4 != 0) goto L4b
            boolean r1 = r1.l(r3)
            if (r1 == 0) goto L50
        L4b:
            java.lang.String r1 = "shuffle.tracking_params"
            r5.e(r1)
        L50:
            java.lang.Object r0 = r0.getValue()
            lh0.g2 r0 = (lh0.g2) r0
            r0.getClass()
            lh0.z3 r1 = lh0.a4.f83297a
            lh0.z0 r0 = r0.f83373a
            lh0.g1 r0 = (lh0.g1) r0
            java.lang.String r3 = "android_pgc_render_collage"
            boolean r1 = r0.o(r3, r2, r1)
            if (r1 != 0) goto L6d
            boolean r0 = r0.l(r3)
            if (r0 == 0) goto L77
        L6d:
            java.lang.String r0 = "shuffle.is_animated"
            r5.e(r0)
            java.lang.String r0 = "pin.is_eligible_for_collage_grid_animation"
            r5.e(r0)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bz.h.d(x92.b):void");
    }

    public static void e(x92.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        bVar.e("pin.is_eligible_for_cutout_tool");
        d(bVar);
        bVar.e("shuffle.items()");
        o.w(bVar, "shuffle.effect_data", "shuffle.created_at", "shuffle.posted_at", "shuffle.updated_at");
        o.w(bVar, "shuffleitem.id", "shuffleitem.item_type", "shuffleitem.pin", "shuffleitem.offset");
        o.w(bVar, "shuffleitem.scale", "shuffleitem.rotation", "shuffleitem.effect_data", "shuffleitem.mask");
        o.v(bVar, "shuffleitem.text", "shuffleitem.shuffle_item_image()", "shuffleitem.shuffle_asset");
        bVar.h("shuffleitem.images", "365x");
        o.A(bVar, "shuffleitem.images", "736x", "shuffleitemimage.id", "shuffleitemimage.user");
        bVar.e("shuffleitem.template_config");
        g(bVar);
        bVar.e("shuffleasset.mask");
        bVar.e("shuffleasset.bitmap_mask");
        h(bVar);
        bVar.e("shuffle.images[236x]");
    }

    public static void f(x92.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        n00.d.f88768a.b(bVar);
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        d(bVar);
        g(bVar);
        bVar.e("shuffleasset.mask");
        bVar.e("shuffleasset.bitmap_mask");
    }

    public static void g(x92.b bVar) {
        o.w(bVar, "pin.shuffle_asset()", "shuffleasset.id", "shuffleasset.type", "shuffleasset.item_type");
        bVar.e("shuffleasset.shuffle_item_image");
        bVar.e("shuffleasset.pin()");
        bVar.h("shuffleasset.cutout_images", "originals");
    }

    public static void h(x92.b bVar) {
        o.w(bVar, "shuffle.is_remixable", "shuffle.is_promoted", "shuffle.root()", "shuffle.parent()");
        bVar.e("shuffle.user()");
        bVar.e("shuffle.canonical_pin");
    }

    public static boolean k(g2 experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) experiments.f83373a;
        boolean z13 = g1Var.o("android_pintag_decan_v2", "enabled", z3Var) || g1Var.l("android_pintag_decan_v2");
        boolean c13 = experiments.c("control", z3Var);
        boolean c14 = experiments.c("pwt_enabled", z3Var);
        boolean c15 = experiments.c("control_pwt", z3Var);
        if (c14 || c15) {
            g1Var.c("android_pintag_decan_v2");
        }
        return z13 || c13 || c14;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x02ca, code lost:
    
        if (((lh0.g1) r2).k("ads_subtle", "enabled", r1) != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(x92.b r12) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bz.h.b(x92.b):void");
    }

    public final w i() {
        switch (this.f24181a) {
            case 23:
                return r0.f26260b;
            case 24:
                return y0.f26458b;
            case 28:
                return o1.f26194b;
            default:
                return q1.f26240b;
        }
    }

    public final m0 j() {
        switch (this.f24181a) {
            case 16:
                return c50.a.f25867b;
            case 17:
                return q.f26236b;
            case 18:
                return s.f26280b;
            case 19:
                return u.f26369b;
            case 20:
                return y.f26456b;
            case 21:
                return c0.f25917b;
            case 22:
                return n0.f26169b;
            case 23:
            case 24:
            default:
                return j1.f26082b;
            case 25:
                return a1.f25871b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i13, int i14) {
        this(0);
        this.f24181a = i13;
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
                this(19);
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
            default:
                break;
        }
    }
}
