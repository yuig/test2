package lh0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83469a;

    public r2(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83469a = experimentsActivator;
    }

    public final void A() {
        ((g1) this.f83469a).c("dl_ad_closeup_format_expansion");
    }

    public final void B() {
        ((g1) this.f83469a).c("android_dl_ad_closeup_overlay_hide");
    }

    public final void C() {
        ((g1) this.f83469a).c("android_grid_inline_actions_phase_1");
    }

    public final void D() {
        ((g1) this.f83469a).c("android_grid_pin_rep_indicator_and_affiliate_cleanup");
    }

    public final void E() {
        ((g1) this.f83469a).c("android_hide_playable_pin_grid_title");
    }

    public final void F() {
        ((g1) this.f83469a).c("android_max_video_ads_on_tablet");
    }

    public final void G() {
        ((g1) this.f83469a).c("mdl_carousel_holdout");
    }

    public final void H() {
        ((g1) this.f83469a).c("android_organic_video_time_stamp_removal");
    }

    public final void I() {
        ((g1) this.f83469a).c("personalized_deal_indicator");
    }

    public final void J() {
        ((g1) this.f83469a).c("android_pgc_sba_clickthrough");
    }

    public final void K() {
        ((g1) this.f83469a).c("price_and_ratings_broad");
    }

    public final void L() {
        ((g1) this.f83469a).c("android_simpler_ad_attribution_ads_modules");
    }

    public final void M() {
        ((g1) this.f83469a).c("android_vto_indicator_removal");
    }

    public final boolean N(String keyWord) {
        Intrinsics.checkNotNullParameter(keyWord, "keyWord");
        z0.f83518a.getClass();
        String h10 = ((g1) this.f83469a).h("android_grid_inline_actions_phase_1", y0.f83512b);
        if (h10 != null) {
            return (kotlin.text.z.p(h10, "enabled", false) || kotlin.text.z.p(h10, "employee", false)) && StringsKt.E(h10, keyWord, false);
        }
        return false;
    }

    public final boolean O(String keyWord) {
        Intrinsics.checkNotNullParameter(keyWord, "keyWord");
        z0.f83518a.getClass();
        String h10 = ((g1) this.f83469a).h("android_grid_pin_rep_indicator_and_affiliate_cleanup", y0.f83512b);
        return h10 != null && kotlin.text.z.p(h10, "control", false) && StringsKt.E(h10, keyWord, false);
    }

    public final boolean P(String keyWord) {
        Intrinsics.checkNotNullParameter(keyWord, "keyWord");
        z0.f83518a.getClass();
        String h10 = ((g1) this.f83469a).h("android_grid_pin_rep_indicator_and_affiliate_cleanup", y0.f83512b);
        if (h10 != null) {
            return (kotlin.text.z.p(h10, "enabled", false) || kotlin.text.z.p(h10, "employee", false)) && StringsKt.E(h10, keyWord, false);
        }
        return false;
    }

    public final boolean Q(z3 activate) {
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83469a).g("android_ad_vm_badge", activate) != null;
    }

    public final boolean R(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83469a).k("android_ctx_remove_creator_attribution_in_grid", group, activate);
    }

    public final boolean S() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83469a;
        return ((g1) z0Var).o("android_collage_ads_alpha", "enabled", z3Var) || ((g1) z0Var).l("android_collage_ads_alpha");
    }

    public final boolean T() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83469a;
        return ((g1) z0Var).o("android_ads_ttd_video_mp4_rendering", "enabled", z3Var) || ((g1) z0Var).l("android_ads_ttd_video_mp4_rendering");
    }

    public final boolean U() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83469a;
        return ((g1) z0Var).o("android_ad_vm_badge", "enabled", z3Var) || ((g1) z0Var).l("android_ad_vm_badge");
    }

    public final boolean V() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83469a;
        return ((g1) z0Var).o("android_dynamic_ads_killswitch", "enabled", z3Var) || ((g1) z0Var).l("android_dynamic_ads_killswitch");
    }

    public final boolean W() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83469a;
        return ((g1) z0Var).o("android_ctx_remove_creator_attribution_in_grid", "enabled", z3Var) || ((g1) z0Var).l("android_ctx_remove_creator_attribution_in_grid");
    }

    public final boolean X() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83469a;
        return ((g1) z0Var).o("android_dl_ad_closeup_overlay_hide", "enabled", z3Var) || ((g1) z0Var).l("android_dl_ad_closeup_overlay_hide");
    }

    public final boolean Y() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83469a;
        return ((g1) z0Var).o("hfp_one_tap_save_pin_leveling", "enabled", z3Var) || ((g1) z0Var).l("hfp_one_tap_save_pin_leveling");
    }

    public final boolean Z() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83469a;
        return ((g1) z0Var).o("android_hide_playable_pin_grid_title", "enabled", z3Var) || ((g1) z0Var).l("android_hide_playable_pin_grid_title");
    }

    public final void a() {
        ((g1) this.f83469a).c("android_3p_audio_control_on_grid");
    }

    public final boolean a0() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83469a;
        return ((g1) z0Var).o("android_pintag_decan_v2", "enabled", z3Var) || ((g1) z0Var).l("android_pintag_decan_v2");
    }

    public final void b() {
        ((g1) this.f83469a).c("ads_amazon_native_video_new_chin");
    }

    public final boolean b0() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83469a;
        return ((g1) z0Var).o("android_pintag_decan_v2", "enabled", z3Var) || ((g1) z0Var).l("android_pintag_decan_v2");
    }

    public final void c() {
        ((g1) this.f83469a).c("ads_android_internal_link_support");
    }

    public final boolean c0(String keyWord) {
        Intrinsics.checkNotNullParameter(keyWord, "keyWord");
        z0.f83518a.getClass();
        String h10 = ((g1) this.f83469a).h("android_pin_rep_event_queue", y0.f83512b);
        if (h10 != null) {
            return (kotlin.text.z.p(h10, "enabled", false) || kotlin.text.z.p(h10, "employee", false)) && StringsKt.E(h10, keyWord, false);
        }
        return false;
    }

    public final void d() {
        ((g1) this.f83469a).c("android_collage_ads_alpha");
    }

    public final boolean d0(String group, z3 activate) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) this.f83469a).o("price_and_ratings_broad", group, activate);
    }

    public final void e() {
        ((g1) this.f83469a).c("android_collage_ads_beta");
    }

    public final void f() {
        ((g1) this.f83469a).c("ads_dl_video_fullscreen_audio_overlay");
    }

    public final void g() {
        ((g1) this.f83469a).c("android_deals_collection_expansion");
    }

    public final void h() {
        ((g1) this.f83469a).c("ads_android_deal_ads_expansion_idea_ads");
    }

    public final void i() {
        ((g1) this.f83469a).c("android_idea_ads_grid_static_playtime");
    }

    public final void j() {
        ((g1) this.f83469a).c("android_ads_mrc_btr_1px1s");
    }

    public final void k() {
        ((g1) this.f83469a).c("ads_nbd_advertiser");
    }

    public final void l() {
        ((g1) this.f83469a).c("android_ads_should_render_black_price");
    }

    public final void m() {
        ((g1) this.f83469a).c("android_ads_short_video_letterbox_pharma_finserv");
    }

    public final void n() {
        ((g1) this.f83469a).c("ads_android_deal_ads_expansion_video_remove_timestamp");
    }

    public final void o() {
        ((g1) this.f83469a).c("android_ad_handshake");
    }

    public final void p() {
        ((g1) this.f83469a).c("android_ad_om");
    }

    public final void q() {
        ((g1) this.f83469a).c("android_dynamic_corner_badge_killswitch");
    }

    public final void r() {
        ((g1) this.f83469a).c("android_handshake_show_badge");
    }

    public final void s() {
        ((g1) this.f83469a).c("android_handshake_show_price");
    }

    public final void t() {
        ((g1) this.f83469a).c("android_handshake_show_rating");
    }

    public final void u() {
        ((g1) this.f83469a).c("android_handshake_show_shipping");
    }

    public final void v() {
        ((g1) this.f83469a).c("android_max_video_audio_overlay");
    }

    public final void w() {
        ((g1) this.f83469a).c("android_target_account_linking");
    }

    public final void x() {
        ((g1) this.f83469a).c("android_video_in_carousel");
    }

    public final void y() {
        ((g1) this.f83469a).c("android_video_block_browser_pin_warmup");
    }

    public final void z() {
        ((g1) this.f83469a).c("android_dl_ad_closeup");
    }
}
