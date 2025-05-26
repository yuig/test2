package com.pinterest.api.model;

import androidx.annotation.NonNull;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class f30 implements dl1.s {

    @om.b("closeup_unified_description")
    private String A;

    @om.b("is_downstream_promotion")
    private Boolean A0;

    @om.b("link")
    private String A1;

    @om.b("shopping_mdl_browser_type")
    private Integer A2;

    @om.b("collage_pin_id")
    private String B;

    @om.b("is_draft")
    private Boolean B0;

    @om.b("link_domain")
    private hh B1;

    @om.b("shopping_rec_disabled")
    private Boolean B2;

    @om.b("collection_pin")
    private md C;

    @om.b("is_eligible_for_aggregated_comments")
    private Boolean C0;

    @om.b("link_user_website")
    private pz0 C1;

    @om.b("should_animate_follow")
    private Boolean C2;

    @om.b("comment_count")
    private Integer D;

    @om.b("is_eligible_for_closeup_one_bar_refinements")
    private Boolean D0;

    @om.b("link_utm_applicable_and_replaced")
    private c D1;

    @om.b("should_mute")
    private Boolean D2;

    @om.b("comment_reply_comment_id")
    private String E;

    @om.b("is_eligible_for_collage_grid_animation")
    private Boolean E0;

    @om.b("media_attribution")
    private ou E1;

    @om.b("should_open_in_stream")
    private Boolean E2;

    @om.b("comments_disabled")
    private Boolean F;

    @om.b("is_eligible_for_cutout_tool")
    private Boolean F0;

    @om.b("mobile_link")
    private String F1;

    @om.b("shuffle")
    private fi0 F2;

    @om.b("conversation_id")
    private String G;

    @om.b("is_eligible_for_filters")
    private Boolean G0;

    @om.b("music_attributions")
    private List<hx> G1;

    @om.b("shuffle_asset")
    private hi0 G2;

    @om.b("conversation_pin_id")
    private String H;

    @om.b("is_eligible_for_flashlight_shopping")
    private Boolean H0;

    @om.b("native_creator")
    private wy0 H1;

    @om.b("social_insight_pear_styles")
    private List<p20> H2;

    @om.b("conversation_sender_id")
    private String I;

    @om.b("is_eligible_for_hybrid_search")
    private Boolean I0;

    @om.b("native_pin_stats")
    private nx I1;

    @om.b("source_interest")
    private zs I2;

    /* renamed from: J */
    @om.b("created_at")
    private Date f37446J;

    @om.b("is_eligible_for_in_content_ads")
    private Boolean J0;

    @om.b("near_dup_sig")
    private String J1;

    @om.b("sponsorship")
    private rj0 J2;

    @om.b("creative_enhancement_slideshow_aspect_ratio")
    private Double K;

    @om.b("is_eligible_for_pdp")
    private Boolean K0;

    @om.b("new_repin_id")
    private String K1;

    @om.b("story_pin_data")
    private dl0 K2;

    @om.b("creator_analytics")
    private Map<String, bg> L;

    @om.b("is_eligible_for_pre_loved_goods_label")
    private Boolean L0;

    @om.b("origin_pinner")
    private wy0 L1;

    @om.b("story_pin_data_id")
    private String L2;

    @om.b("current_story_pin_page_id")
    private Integer M;

    @om.b("is_eligible_for_promoted_partnership")
    private Boolean M0;

    @om.b("pear_styles")
    private List<p20> M1;

    @om.b("subscribed_to_notifications")
    private Boolean M2;

    @om.b("dark_profile_link")
    private String N;

    @om.b("is_eligible_for_relabeling")
    private Boolean N0;

    @om.b("pin_note")
    private w40 N1;

    @om.b("take_default_template_type")
    private Integer N2;

    @om.b("deb_content_quality")
    private List<sg> O;

    @om.b("is_eligible_for_related_pins_tabs")
    private Boolean O0;

    @om.b("pin_promotion_id_reformatted")
    private String O1;

    @om.b("third_party_pin_owner")
    private wy0 O2;

    @om.b("deb_inclusive_product")
    private List<sg> P;

    @om.b("is_eligible_for_related_products")
    private Boolean P0;

    @om.b("pinned_to_board")
    private v7 P1;

    @om.b("title")
    private String P2;

    @om.b("deb_shopping")
    private List<sg> Q;

    @om.b("is_eligible_for_responses")
    private Boolean Q0;

    @om.b("pinned_to_profile")
    private Boolean Q1;

    @om.b("top_community_insight")
    private dw0 Q2;

    @om.b("deb_trust_and_safety")
    private List<sg> R;

    @om.b("is_eligible_for_web_closeup")
    private Boolean R0;

    @om.b("pinner")
    private wy0 R1;

    @om.b("top_interest")
    private Integer R2;

    @om.b("description")
    private String S;

    @om.b("is_from_cache_feed")
    private Boolean S0;

    @om.b("price_currency")
    private String S1;

    @om.b("total_reaction_count")
    private Integer S2;

    @om.b("destination_url_type")
    private Integer T;

    @om.b("is_from_initial_page_load")
    private Boolean T0;

    @om.b("price_value")
    private Double T1;

    @om.b("tracked_link")
    private String T2;

    @om.b("did_it_disabled")
    private Boolean U;

    @om.b("is_full_width")
    private Boolean U0;

    @om.b("privacy")
    private String U1;

    @om.b("tracking_params")
    private String U2;

    @om.b("digital_media_source_type")
    private a V;

    @om.b("is_ghost")
    private Boolean V0;

    @om.b("promoted_android_deep_link")
    private String V1;

    @om.b("type")
    private String V2;

    @om.b("digital_media_source_type_label")
    private String W;

    @om.b("is_go_linkless")
    private Boolean W0;

    @om.b("promoted_is_auto_assembled")
    private Boolean W1;

    @om.b("unified_user_note")
    private String W2;

    @om.b("domain")
    private String X;

    @om.b("is_hidden")
    private Boolean X0;

    @om.b("promoted_is_catalog_carousel_ad")
    private Boolean X1;

    @om.b("updated_at")
    private Date X2;

    @om.b("dominant_color")
    private String Y;

    @om.b("is_instagram_api")
    private Boolean Y0;

    @om.b("promoted_is_congruency_enabled")
    private Boolean Y1;

    @om.b("user_mention_tags")
    private List<ts0> Y2;

    @om.b("done_by_me")
    private Boolean Z;

    @om.b("is_native")
    private Boolean Z0;

    @om.b("promoted_is_lead_ad")
    private Boolean Z1;

    @om.b("utm_link")
    private String Z2;

    /* renamed from: a */
    @NonNull
    @om.b("id")
    private String f37447a;

    /* renamed from: a0 */
    @om.b("dpa_creative_type")
    private Integer f37448a0;

    /* renamed from: a1 */
    @om.b("is_native_content")
    private Boolean f37449a1;

    /* renamed from: a2 */
    @om.b("promoted_is_max_video")
    private Boolean f37450a2;

    /* renamed from: a3 */
    @om.b("via_pinner")
    private wy0 f37451a3;

    /* renamed from: b */
    @om.b("node_id")
    private String f37452b;

    /* renamed from: b0 */
    @om.b("duplicated_ad_insertions")
    private List<String> f37453b0;

    /* renamed from: b1 */
    @om.b("is_oos_product")
    private Boolean f37454b1;

    /* renamed from: b2 */
    @om.b("promoted_is_opaque_onetap_enabled")
    private Boolean f37455b2;

    /* renamed from: b3 */
    @om.b("video_status")
    private Integer f37456b3;

    /* renamed from: c */
    @om.b("activity_timestamp")
    private Double f37457c;

    /* renamed from: c0 */
    @om.b("edited_fields")
    private List<String> f37458c0;

    /* renamed from: c1 */
    @om.b("is_outfit_of_the_day_enabled")
    private Boolean f37459c1;

    /* renamed from: c2 */
    @om.b("promoted_is_personalized")
    private Boolean f37460c2;

    /* renamed from: c3 */
    @om.b("video_status_message")
    private o01 f37461c3;

    /* renamed from: d */
    @om.b("ad_data")
    private g f37462d;

    /* renamed from: d0 */
    @om.b("embed")
    private gn f37463d0;

    /* renamed from: d1 */
    @om.b("is_owned_by_viewer")
    private Boolean f37464d1;

    @om.b("promoted_is_quiz")
    private Boolean d2;

    /* renamed from: d3 */
    @om.b("videos")
    private b01 f37465d3;

    /* renamed from: e */
    @om.b("ad_destination_url")
    private String f37466e;

    /* renamed from: e0 */
    @om.b("favorite_user_count")
    private Integer f37467e0;

    /* renamed from: e1 */
    @om.b("is_post_reranked")
    private Boolean f37468e1;

    /* renamed from: e2 */
    @om.b("promoted_is_removable")
    private Boolean f37469e2;

    /* renamed from: e3 */
    @om.b("virtual_try_on_data")
    private s01 f37470e3;

    /* renamed from: f */
    @om.b("ad_match_reason")
    private Integer f37471f;

    /* renamed from: f0 */
    @om.b("favorited_by_me")
    private Boolean f37472f0;

    /* renamed from: f1 */
    @om.b("is_premiere")
    private Boolean f37473f1;

    /* renamed from: f2 */
    @om.b("promoted_is_showcase")
    private Boolean f37474f2;

    /* renamed from: f3 */
    @om.b("virtual_try_on_type")
    private Integer f37475f3;

    /* renamed from: g */
    @om.b("ad_targeting_attribution")
    private l0 f37476g;

    /* renamed from: g0 */
    @om.b("formatted_description")
    private em f37477g0;

    /* renamed from: g1 */
    @om.b("is_product_tagging_enabled_standard_pin")
    private Boolean f37478g1;

    /* renamed from: g2 */
    @om.b("promoted_is_sideswipe_disabled")
    private Boolean f37479g2;

    /* renamed from: g3 */
    @om.b("visual_objects")
    private List<q11> f37480g3;

    /* renamed from: h */
    @om.b("advertiser_id")
    private String f37481h;

    /* renamed from: h0 */
    @om.b("gen_ai_topics")
    private List<ym> f37482h0;

    /* renamed from: h1 */
    @om.b("is_promoted")
    private Boolean f37483h1;

    /* renamed from: h2 */
    @om.b("promoted_lead_form")
    private n90 f37484h2;

    /* renamed from: h3 */
    public final boolean[] f37485h3;

    /* renamed from: i */
    @om.b("affiliate_link")
    private String f37486i;

    /* renamed from: i0 */
    @om.b("grid_title")
    private String f37487i0;

    /* renamed from: i1 */
    @om.b("is_quick_promotable")
    private Boolean f37488i1;

    /* renamed from: i2 */
    @om.b("promoted_partnership_advertiser_name")
    private String f37489i2;

    /* renamed from: j */
    @om.b("aggregated_pin_data")
    private f3 f37490j;

    /* renamed from: j0 */
    @om.b("has_been_promoted")
    private Boolean f37491j0;

    /* renamed from: j1 */
    @om.b("is_repin")
    private Boolean f37492j1;

    /* renamed from: j2 */
    @om.b("promoted_partnership_attribution_name")
    private String f37493j2;

    /* renamed from: k */
    @om.b("alt_text")
    private String f37494k;

    /* renamed from: k0 */
    @om.b("has_displayable_community_content")
    private b f37495k0;

    /* renamed from: k1 */
    @om.b("is_scene")
    private Boolean f37496k1;

    /* renamed from: k2 */
    @om.b("promoted_quiz_pin_data")
    private z90 f37497k2;

    /* renamed from: l */
    @om.b("attribution")
    private x6 f37498l;

    /* renamed from: l0 */
    @om.b("has_link")
    private Boolean f37499l0;

    /* renamed from: l1 */
    @om.b("is_shoppable")
    private Boolean f37500l1;

    /* renamed from: l2 */
    @om.b("promoter")
    private wy0 f37501l2;

    /* renamed from: m */
    @om.b("attribution_source_id")
    private String f37502m;

    /* renamed from: m0 */
    @om.b("has_variants")
    private Boolean f37503m0;

    /* renamed from: m1 */
    @om.b("is_stale_product")
    private Boolean f37504m1;

    /* renamed from: m2 */
    @om.b("public_creator_analytics")
    private Map<String, bg> f37505m2;

    /* renamed from: n */
    @om.b("auto_alt_text")
    private String f37506n;

    /* renamed from: n0 */
    @om.b("hashtags")
    private List<String> f37507n0;

    /* renamed from: n1 */
    @om.b("is_subtle_ad")
    private Boolean f37508n1;

    /* renamed from: n2 */
    @om.b("quality_state")
    private Integer f37509n2;

    /* renamed from: o */
    @om.b("board")
    private v7 f37510o;

    /* renamed from: o0 */
    @om.b("highlighted_aggregated_comments")
    private List<String> f37511o0;

    /* renamed from: o1 */
    @om.b("is_third_party_ad")
    private Boolean f37512o1;

    /* renamed from: o2 */
    @om.b("reaction_by_me")
    private Integer f37513o2;

    /* renamed from: p */
    @om.b("board_conversation_thread")
    private z7 f37514p;

    /* renamed from: p0 */
    @om.b("highlighted_did_it")
    private List<String> f37515p0;

    /* renamed from: p1 */
    @om.b("is_tml_merchant")
    private Boolean f37516p1;

    /* renamed from: p2 */
    @om.b("reaction_counts")
    private Map<String, Integer> f37517p2;

    /* renamed from: q */
    @om.b("cacheable_id")
    private String f37518q;

    /* renamed from: q0 */
    @om.b("image_crop")
    private or f37519q0;

    /* renamed from: q1 */
    @om.b("is_translatable")
    private Boolean f37520q1;

    /* renamed from: q2 */
    @om.b("recommendation_reason")
    private oc0 f37521q2;

    /* renamed from: r */
    @om.b("call_to_action_text")
    private String f37522r;

    /* renamed from: r0 */
    @om.b("image_medium_url")
    private String f37523r0;

    /* renamed from: r1 */
    @om.b("is_unsafe")
    private Boolean f37524r1;

    /* renamed from: r2 */
    @om.b("repin_count")
    private Integer f37525r2;

    /* renamed from: s */
    @om.b("campaign_id_reformatted")
    private String f37526s;

    /* renamed from: s0 */
    @om.b("image_signature")
    private String f37527s0;

    /* renamed from: s1 */
    @om.b("is_unsafe_for_comments")
    private Boolean f37528s1;

    /* renamed from: s2 */
    @om.b("repin_users")
    private List<wy0> f37529s2;

    /* renamed from: t */
    @om.b("can_delete_did_it_and_comments")
    private Boolean f37530t;

    /* renamed from: t0 */
    @om.b("images")
    private Map<String, sr> f37531t0;

    /* renamed from: t1 */
    @om.b("is_video")
    private Boolean f37532t1;

    /* renamed from: t2 */
    @om.b("rich_metadata")
    private oe0 f37533t2;

    /* renamed from: u */
    @om.b("canonical_merchant_domain")
    private String f37534u;

    /* renamed from: u0 */
    @om.b("insertion_id")
    private String f37535u0;

    /* renamed from: u1 */
    @om.b("is_viewing_user_in_dsa_countries")
    private Boolean f37536u1;

    /* renamed from: u2 */
    @om.b("rich_summary")
    private se0 f37537u2;

    /* renamed from: v */
    @om.b("canonical_merchant_name")
    private String f37538v;

    /* renamed from: v0 */
    @om.b("ip_eligible_for_stela")
    private Boolean f37539v0;

    /* renamed from: v1 */
    @om.b("is_virtual_try_on")
    private Boolean f37540v1;

    /* renamed from: v2 */
    @om.b("root_pin_id")
    private String f37541v2;

    /* renamed from: w */
    @om.b("carousel_data")
    private cc f37542w;

    /* renamed from: w0 */
    @om.b("is_active_ad")
    private Boolean f37543w0;

    /* renamed from: w1 */
    @om.b("is_visualization_enabled")
    private Boolean f37544w1;

    /* renamed from: w2 */
    @om.b("scene_data")
    private Map<String, ig0> f37545w2;

    /* renamed from: x */
    @om.b("category")
    private String f37546x;

    /* renamed from: x0 */
    @om.b("is_blocked")
    private Boolean f37547x0;

    /* renamed from: x1 */
    @om.b("is_whitelisted_for_tried_it")
    private Boolean f37548x1;

    /* renamed from: x2 */
    @om.b("section")
    private ba f37549x2;

    /* renamed from: y */
    @om.b("closeup_attribution")
    private wy0 f37550y;

    /* renamed from: y0 */
    @om.b("is_cpc_ad")
    private Boolean f37551y0;

    /* renamed from: y1 */
    @om.b("is_year_in_preview")
    private Boolean f37552y1;

    /* renamed from: y2 */
    @om.b("share_count")
    private Integer f37553y2;

    /* renamed from: z */
    @om.b("closeup_description")
    private String f37554z;

    /* renamed from: z0 */
    @om.b("is_disabled_by_dsa")
    private Boolean f37555z0;

    /* renamed from: z1 */
    @om.b("item_id")
    private String f37556z1;

    /* renamed from: z2 */
    @om.b("shopping_flags")
    private List<Integer> f37557z2;

    public enum a {
        TRAINED_ALGORITHMIC_MEDIA(11),
        COMPOSITE_WITH_TRAINED_ALGORITHMIC_MEDIA(12),
        MULTI_PIN_TRAINED_ALGORITHMIC_MEDIA(15),
        DETECTED_TRAINED_ALGORITHMIC_MEDIA(16);

        private final int value;

        a(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes3.dex */
    public enum b {
        COMMENT(0);

        private final int value;

        b(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes3.dex */
    public enum c {
        LINK_NOT_APPLICABLE(0),
        LINK_HAS_BEEN_REPLACED(1),
        LINK_HAS_NOT_BEEN_REPLACED(2);

        private final int value;

        c(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    public /* synthetic */ f30(String str, String str2, Double d2, g gVar, String str3, Integer num, l0 l0Var, String str4, String str5, f3 f3Var, String str6, x6 x6Var, String str7, String str8, v7 v7Var, z7 z7Var, String str9, String str10, String str11, Boolean bool, String str12, String str13, cc ccVar, String str14, wy0 wy0Var, String str15, String str16, String str17, md mdVar, Integer num2, String str18, Boolean bool2, String str19, String str20, String str21, Date date, Double d13, Map map, Integer num3, String str22, List list, List list2, List list3, List list4, String str23, Integer num4, Boolean bool3, a aVar, String str24, String str25, String str26, Boolean bool4, Integer num5, List list5, List list6, gn gnVar, Integer num6, Boolean bool5, em emVar, List list7, String str27, Boolean bool6, b bVar, Boolean bool7, Boolean bool8, List list8, List list9, List list10, or orVar, String str28, String str29, Map map2, String str30, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, Boolean bool26, Boolean bool27, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, Boolean bool33, Boolean bool34, Boolean bool35, Boolean bool36, Boolean bool37, Boolean bool38, Boolean bool39, Boolean bool40, Boolean bool41, Boolean bool42, Boolean bool43, Boolean bool44, Boolean bool45, Boolean bool46, Boolean bool47, Boolean bool48, Boolean bool49, Boolean bool50, Boolean bool51, Boolean bool52, Boolean bool53, Boolean bool54, Boolean bool55, Boolean bool56, Boolean bool57, Boolean bool58, Boolean bool59, Boolean bool60, Boolean bool61, Boolean bool62, Boolean bool63, Boolean bool64, String str31, String str32, hh hhVar, pz0 pz0Var, c cVar, ou ouVar, String str33, List list11, wy0 wy0Var2, nx nxVar, String str34, String str35, wy0 wy0Var3, List list12, w40 w40Var, String str36, v7 v7Var2, Boolean bool65, wy0 wy0Var4, String str37, Double d14, String str38, String str39, Boolean bool66, Boolean bool67, Boolean bool68, Boolean bool69, Boolean bool70, Boolean bool71, Boolean bool72, Boolean bool73, Boolean bool74, Boolean bool75, Boolean bool76, n90 n90Var, String str40, String str41, z90 z90Var, wy0 wy0Var5, Map map3, Integer num7, Integer num8, Map map4, oc0 oc0Var, Integer num9, List list13, oe0 oe0Var, se0 se0Var, String str42, Map map5, ba baVar, Integer num10, List list14, Integer num11, Boolean bool77, Boolean bool78, Boolean bool79, Boolean bool80, fi0 fi0Var, hi0 hi0Var, List list15, zs zsVar, rj0 rj0Var, dl0 dl0Var, String str43, Boolean bool81, Integer num12, wy0 wy0Var6, String str44, dw0 dw0Var, Integer num13, Integer num14, String str45, String str46, String str47, String str48, Date date2, List list16, String str49, wy0 wy0Var7, Integer num15, o01 o01Var, b01 b01Var, s01 s01Var, Integer num16, List list17, boolean[] zArr, int i13) {
        this(str, str2, d2, gVar, str3, num, l0Var, str4, str5, f3Var, str6, x6Var, str7, str8, v7Var, z7Var, str9, str10, str11, bool, str12, str13, ccVar, str14, wy0Var, str15, str16, str17, mdVar, num2, str18, bool2, str19, str20, str21, date, d13, map, num3, str22, list, list2, list3, list4, str23, num4, bool3, aVar, str24, str25, str26, bool4, num5, list5, list6, gnVar, num6, bool5, emVar, list7, str27, bool6, bVar, bool7, bool8, list8, list9, list10, orVar, str28, str29, map2, str30, bool9, bool10, bool11, bool12, bool13, bool14, bool15, bool16, bool17, bool18, bool19, bool20, bool21, bool22, bool23, bool24, bool25, bool26, bool27, bool28, bool29, bool30, bool31, bool32, bool33, bool34, bool35, bool36, bool37, bool38, bool39, bool40, bool41, bool42, bool43, bool44, bool45, bool46, bool47, bool48, bool49, bool50, bool51, bool52, bool53, bool54, bool55, bool56, bool57, bool58, bool59, bool60, bool61, bool62, bool63, bool64, str31, str32, hhVar, pz0Var, cVar, ouVar, str33, list11, wy0Var2, nxVar, str34, str35, wy0Var3, list12, w40Var, str36, v7Var2, bool65, wy0Var4, str37, d14, str38, str39, bool66, bool67, bool68, bool69, bool70, bool71, bool72, bool73, bool74, bool75, bool76, n90Var, str40, str41, z90Var, wy0Var5, map3, num7, num8, map4, oc0Var, num9, list13, oe0Var, se0Var, str42, map5, baVar, num10, list14, num11, bool77, bool78, bool79, bool80, fi0Var, hi0Var, list15, zsVar, rj0Var, dl0Var, str43, bool81, num12, wy0Var6, str44, dw0Var, num13, num14, str45, str46, str47, str48, date2, list16, str49, wy0Var7, num15, o01Var, b01Var, s01Var, num16, list17, zArr);
    }

    public static e30 r3() {
        return new e30(0);
    }

    public final String A3() {
        return this.f37494k;
    }

    public final Map A4() {
        return this.f37531t0;
    }

    public final String A5() {
        return this.J1;
    }

    public final dw0 A6() {
        return this.Q2;
    }

    public final String B3() {
        return this.f37502m;
    }

    public final String B4() {
        return this.f37535u0;
    }

    public final String B5() {
        return this.K1;
    }

    public final Integer B6() {
        Integer num = this.R2;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String C3() {
        return this.f37506n;
    }

    public final Boolean C4() {
        Boolean bool = this.f37543w0;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final wy0 C5() {
        return this.L1;
    }

    public final Integer C6() {
        Integer num = this.S2;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final v7 D3() {
        return this.f37510o;
    }

    public final Boolean D4() {
        Boolean bool = this.f37547x0;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final List D5() {
        return this.M1;
    }

    public final String D6() {
        return this.T2;
    }

    public final z7 E3() {
        return this.f37514p;
    }

    public final Boolean E4() {
        Boolean bool = this.f37555z0;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final w40 E5() {
        return this.N1;
    }

    public final String E6() {
        return this.U2;
    }

    public final String F3() {
        return this.f37518q;
    }

    public final Boolean F4() {
        Boolean bool = this.A0;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String F5() {
        return this.O1;
    }

    public final String F6() {
        return this.W2;
    }

    public final String G3() {
        return this.f37522r;
    }

    public final Boolean G4() {
        Boolean bool = this.C0;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final v7 G5() {
        return this.P1;
    }

    public final Date G6() {
        return this.X2;
    }

    public final String H3() {
        return this.f37526s;
    }

    public final Boolean H4() {
        Boolean bool = this.D0;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean H5() {
        Boolean bool = this.Q1;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final List H6() {
        return this.Y2;
    }

    public final Boolean I3() {
        Boolean bool = this.f37530t;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean I4() {
        Boolean bool = this.E0;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final wy0 I5() {
        return this.R1;
    }

    public final String I6() {
        return this.Z2;
    }

    public final cc J3() {
        return this.f37542w;
    }

    public final Boolean J4() {
        Boolean bool = this.F0;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String J5() {
        return this.S1;
    }

    public final wy0 J6() {
        return this.f37451a3;
    }

    public final String K3() {
        return this.f37546x;
    }

    public final Boolean K4() {
        Boolean bool = this.H0;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Double K5() {
        Double d2 = this.T1;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Integer K6() {
        Integer num = this.f37456b3;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final wy0 L3() {
        return this.f37550y;
    }

    public final Boolean L4() {
        Boolean bool = this.I0;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String L5() {
        return this.U1;
    }

    public final o01 L6() {
        return this.f37461c3;
    }

    public final String M3() {
        return this.f37554z;
    }

    public final Boolean M4() {
        Boolean bool = this.K0;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String M5() {
        return this.V1;
    }

    public final b01 M6() {
        return this.f37465d3;
    }

    public final String N3() {
        return this.A;
    }

    public final Boolean N4() {
        Boolean bool = this.L0;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean N5() {
        Boolean bool = this.W1;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final boolean N6() {
        boolean[] zArr = this.f37485h3;
        return zArr.length > 211 && zArr[211];
    }

    public final md O3() {
        return this.C;
    }

    public final Boolean O4() {
        Boolean bool = this.M0;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean O5() {
        Boolean bool = this.X1;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final s01 O6() {
        return this.f37470e3;
    }

    public final Integer P3() {
        Integer num = this.D;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Boolean P4() {
        Boolean bool = this.O0;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean P5() {
        Boolean bool = this.Z1;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Integer P6() {
        Integer num = this.f37475f3;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Boolean Q3() {
        Boolean bool = this.F;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean Q4() {
        Boolean bool = this.P0;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean Q5() {
        Boolean bool = this.f37450a2;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final List Q6() {
        return this.f37480g3;
    }

    public final String R3() {
        return this.G;
    }

    public final Boolean R4() {
        Boolean bool = this.R0;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean R5() {
        Boolean bool = this.f37460c2;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final e30 R6() {
        return new e30(this, 0);
    }

    public final String S3() {
        return this.H;
    }

    public final Boolean S4() {
        Boolean bool = this.U0;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean S5() {
        Boolean bool = this.d2;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String T3() {
        return this.I;
    }

    public final Boolean T4() {
        Boolean bool = this.V0;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean T5() {
        Boolean bool = this.f37469e2;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Date U3() {
        return this.f37446J;
    }

    public final Boolean U4() {
        Boolean bool = this.W0;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean U5() {
        Boolean bool = this.f37474f2;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Map V3() {
        return this.L;
    }

    public final boolean V4() {
        boolean[] zArr = this.f37485h3;
        return zArr.length > 100 && zArr[100];
    }

    public final Boolean V5() {
        Boolean bool = this.f37479g2;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Integer W3() {
        Integer num = this.M;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Boolean W4() {
        Boolean bool = this.X0;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final n90 W5() {
        return this.f37484h2;
    }

    public final String X3() {
        return this.N;
    }

    public final Boolean X4() {
        Boolean bool = this.Y0;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String X5() {
        return this.f37489i2;
    }

    public final List Y3() {
        return this.O;
    }

    public final Boolean Y4() {
        Boolean bool = this.Z0;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String Y5() {
        return this.f37493j2;
    }

    public final List Z3() {
        return this.P;
    }

    public final Boolean Z4() {
        Boolean bool = this.f37454b1;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final z90 Z5() {
        return this.f37497k2;
    }

    public final List a4() {
        return this.Q;
    }

    public final Boolean a5() {
        Boolean bool = this.f37464d1;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final wy0 a6() {
        return this.f37501l2;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f37447a;
    }

    public final List b4() {
        return this.R;
    }

    public final Boolean b5() {
        Boolean bool = this.f37473f1;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Integer b6() {
        Integer num = this.f37513o2;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String c4() {
        return this.S;
    }

    public final Boolean c5() {
        Boolean bool = this.f37478g1;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Map c6() {
        return this.f37517p2;
    }

    public final Integer d4() {
        Integer num = this.T;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Boolean d5() {
        Boolean bool = this.f37483h1;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final oc0 d6() {
        return this.f37521q2;
    }

    public final Boolean e4() {
        Boolean bool = this.U;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean e5() {
        Boolean bool = this.f37492j1;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Integer e6() {
        Integer num = this.f37525r2;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f30 f30Var = (f30) obj;
        return Objects.equals(this.f37475f3, f30Var.f37475f3) && Objects.equals(this.f37456b3, f30Var.f37456b3) && Objects.equals(this.S2, f30Var.S2) && Objects.equals(this.R2, f30Var.R2) && Objects.equals(this.N2, f30Var.N2) && Objects.equals(this.M2, f30Var.M2) && Objects.equals(this.E2, f30Var.E2) && Objects.equals(this.D2, f30Var.D2) && Objects.equals(this.C2, f30Var.C2) && Objects.equals(this.B2, f30Var.B2) && Objects.equals(this.A2, f30Var.A2) && Objects.equals(this.f37553y2, f30Var.f37553y2) && Objects.equals(this.f37525r2, f30Var.f37525r2) && Objects.equals(this.f37513o2, f30Var.f37513o2) && Objects.equals(this.f37509n2, f30Var.f37509n2) && Objects.equals(this.f37479g2, f30Var.f37479g2) && Objects.equals(this.f37474f2, f30Var.f37474f2) && Objects.equals(this.f37469e2, f30Var.f37469e2) && Objects.equals(this.d2, f30Var.d2) && Objects.equals(this.f37460c2, f30Var.f37460c2) && Objects.equals(this.f37455b2, f30Var.f37455b2) && Objects.equals(this.f37450a2, f30Var.f37450a2) && Objects.equals(this.Z1, f30Var.Z1) && Objects.equals(this.Y1, f30Var.Y1) && Objects.equals(this.X1, f30Var.X1) && Objects.equals(this.W1, f30Var.W1) && Objects.equals(this.T1, f30Var.T1) && Objects.equals(this.Q1, f30Var.Q1) && Objects.equals(this.D1, f30Var.D1) && Objects.equals(this.f37552y1, f30Var.f37552y1) && Objects.equals(this.f37548x1, f30Var.f37548x1) && Objects.equals(this.f37544w1, f30Var.f37544w1) && Objects.equals(this.f37540v1, f30Var.f37540v1) && Objects.equals(this.f37536u1, f30Var.f37536u1) && Objects.equals(this.f37532t1, f30Var.f37532t1) && Objects.equals(this.f37528s1, f30Var.f37528s1) && Objects.equals(this.f37524r1, f30Var.f37524r1) && Objects.equals(this.f37520q1, f30Var.f37520q1) && Objects.equals(this.f37516p1, f30Var.f37516p1) && Objects.equals(this.f37512o1, f30Var.f37512o1) && Objects.equals(this.f37508n1, f30Var.f37508n1) && Objects.equals(this.f37504m1, f30Var.f37504m1) && Objects.equals(this.f37500l1, f30Var.f37500l1) && Objects.equals(this.f37496k1, f30Var.f37496k1) && Objects.equals(this.f37492j1, f30Var.f37492j1) && Objects.equals(this.f37488i1, f30Var.f37488i1) && Objects.equals(this.f37483h1, f30Var.f37483h1) && Objects.equals(this.f37478g1, f30Var.f37478g1) && Objects.equals(this.f37473f1, f30Var.f37473f1) && Objects.equals(this.f37468e1, f30Var.f37468e1) && Objects.equals(this.f37464d1, f30Var.f37464d1) && Objects.equals(this.f37459c1, f30Var.f37459c1) && Objects.equals(this.f37454b1, f30Var.f37454b1) && Objects.equals(this.f37449a1, f30Var.f37449a1) && Objects.equals(this.Z0, f30Var.Z0) && Objects.equals(this.Y0, f30Var.Y0) && Objects.equals(this.X0, f30Var.X0) && Objects.equals(this.W0, f30Var.W0) && Objects.equals(this.V0, f30Var.V0) && Objects.equals(this.U0, f30Var.U0) && Objects.equals(this.T0, f30Var.T0) && Objects.equals(this.S0, f30Var.S0) && Objects.equals(this.R0, f30Var.R0) && Objects.equals(this.Q0, f30Var.Q0) && Objects.equals(this.P0, f30Var.P0) && Objects.equals(this.O0, f30Var.O0) && Objects.equals(this.N0, f30Var.N0) && Objects.equals(this.M0, f30Var.M0) && Objects.equals(this.L0, f30Var.L0) && Objects.equals(this.K0, f30Var.K0) && Objects.equals(this.J0, f30Var.J0) && Objects.equals(this.I0, f30Var.I0) && Objects.equals(this.H0, f30Var.H0) && Objects.equals(this.G0, f30Var.G0) && Objects.equals(this.F0, f30Var.F0) && Objects.equals(this.E0, f30Var.E0) && Objects.equals(this.D0, f30Var.D0) && Objects.equals(this.C0, f30Var.C0) && Objects.equals(this.B0, f30Var.B0) && Objects.equals(this.A0, f30Var.A0) && Objects.equals(this.f37555z0, f30Var.f37555z0) && Objects.equals(this.f37551y0, f30Var.f37551y0) && Objects.equals(this.f37547x0, f30Var.f37547x0) && Objects.equals(this.f37543w0, f30Var.f37543w0) && Objects.equals(this.f37539v0, f30Var.f37539v0) && Objects.equals(this.f37503m0, f30Var.f37503m0) && Objects.equals(this.f37499l0, f30Var.f37499l0) && Objects.equals(this.f37495k0, f30Var.f37495k0) && Objects.equals(this.f37491j0, f30Var.f37491j0) && Objects.equals(this.f37472f0, f30Var.f37472f0) && Objects.equals(this.f37467e0, f30Var.f37467e0) && Objects.equals(this.f37448a0, f30Var.f37448a0) && Objects.equals(this.Z, f30Var.Z) && Objects.equals(this.V, f30Var.V) && Objects.equals(this.U, f30Var.U) && Objects.equals(this.T, f30Var.T) && Objects.equals(this.M, f30Var.M) && Objects.equals(this.K, f30Var.K) && Objects.equals(this.F, f30Var.F) && Objects.equals(this.D, f30Var.D) && Objects.equals(this.f37530t, f30Var.f37530t) && Objects.equals(this.f37471f, f30Var.f37471f) && Objects.equals(this.f37457c, f30Var.f37457c) && Objects.equals(this.f37447a, f30Var.f37447a) && Objects.equals(this.f37452b, f30Var.f37452b) && Objects.equals(this.f37462d, f30Var.f37462d) && Objects.equals(this.f37466e, f30Var.f37466e) && Objects.equals(this.f37476g, f30Var.f37476g) && Objects.equals(this.f37481h, f30Var.f37481h) && Objects.equals(this.f37486i, f30Var.f37486i) && Objects.equals(this.f37490j, f30Var.f37490j) && Objects.equals(this.f37494k, f30Var.f37494k) && Objects.equals(this.f37498l, f30Var.f37498l) && Objects.equals(this.f37502m, f30Var.f37502m) && Objects.equals(this.f37506n, f30Var.f37506n) && Objects.equals(this.f37510o, f30Var.f37510o) && Objects.equals(this.f37514p, f30Var.f37514p) && Objects.equals(this.f37518q, f30Var.f37518q) && Objects.equals(this.f37522r, f30Var.f37522r) && Objects.equals(this.f37526s, f30Var.f37526s) && Objects.equals(this.f37534u, f30Var.f37534u) && Objects.equals(this.f37538v, f30Var.f37538v) && Objects.equals(this.f37542w, f30Var.f37542w) && Objects.equals(this.f37546x, f30Var.f37546x) && Objects.equals(this.f37550y, f30Var.f37550y) && Objects.equals(this.f37554z, f30Var.f37554z) && Objects.equals(this.A, f30Var.A) && Objects.equals(this.B, f30Var.B) && Objects.equals(this.C, f30Var.C) && Objects.equals(this.E, f30Var.E) && Objects.equals(this.G, f30Var.G) && Objects.equals(this.H, f30Var.H) && Objects.equals(this.I, f30Var.I) && Objects.equals(this.f37446J, f30Var.f37446J) && Objects.equals(this.L, f30Var.L) && Objects.equals(this.N, f30Var.N) && Objects.equals(this.O, f30Var.O) && Objects.equals(this.P, f30Var.P) && Objects.equals(this.Q, f30Var.Q) && Objects.equals(this.R, f30Var.R) && Objects.equals(this.S, f30Var.S) && Objects.equals(this.W, f30Var.W) && Objects.equals(this.X, f30Var.X) && Objects.equals(this.Y, f30Var.Y) && Objects.equals(this.f37453b0, f30Var.f37453b0) && Objects.equals(this.f37458c0, f30Var.f37458c0) && Objects.equals(this.f37463d0, f30Var.f37463d0) && Objects.equals(this.f37477g0, f30Var.f37477g0) && Objects.equals(this.f37482h0, f30Var.f37482h0) && Objects.equals(this.f37487i0, f30Var.f37487i0) && Objects.equals(this.f37507n0, f30Var.f37507n0) && Objects.equals(this.f37511o0, f30Var.f37511o0) && Objects.equals(this.f37515p0, f30Var.f37515p0) && Objects.equals(this.f37519q0, f30Var.f37519q0) && Objects.equals(this.f37523r0, f30Var.f37523r0) && Objects.equals(this.f37527s0, f30Var.f37527s0) && Objects.equals(this.f37531t0, f30Var.f37531t0) && Objects.equals(this.f37535u0, f30Var.f37535u0) && Objects.equals(this.f37556z1, f30Var.f37556z1) && Objects.equals(this.A1, f30Var.A1) && Objects.equals(this.B1, f30Var.B1) && Objects.equals(this.C1, f30Var.C1) && Objects.equals(this.E1, f30Var.E1) && Objects.equals(this.F1, f30Var.F1) && Objects.equals(this.G1, f30Var.G1) && Objects.equals(this.H1, f30Var.H1) && Objects.equals(this.I1, f30Var.I1) && Objects.equals(this.J1, f30Var.J1) && Objects.equals(this.K1, f30Var.K1) && Objects.equals(this.L1, f30Var.L1) && Objects.equals(this.M1, f30Var.M1) && Objects.equals(this.N1, f30Var.N1) && Objects.equals(this.O1, f30Var.O1) && Objects.equals(this.P1, f30Var.P1) && Objects.equals(this.R1, f30Var.R1) && Objects.equals(this.S1, f30Var.S1) && Objects.equals(this.U1, f30Var.U1) && Objects.equals(this.V1, f30Var.V1) && Objects.equals(this.f37484h2, f30Var.f37484h2) && Objects.equals(this.f37489i2, f30Var.f37489i2) && Objects.equals(this.f37493j2, f30Var.f37493j2) && Objects.equals(this.f37497k2, f30Var.f37497k2) && Objects.equals(this.f37501l2, f30Var.f37501l2) && Objects.equals(this.f37505m2, f30Var.f37505m2) && Objects.equals(this.f37517p2, f30Var.f37517p2) && Objects.equals(this.f37521q2, f30Var.f37521q2) && Objects.equals(this.f37529s2, f30Var.f37529s2) && Objects.equals(this.f37533t2, f30Var.f37533t2) && Objects.equals(this.f37537u2, f30Var.f37537u2) && Objects.equals(this.f37541v2, f30Var.f37541v2) && Objects.equals(this.f37545w2, f30Var.f37545w2) && Objects.equals(this.f37549x2, f30Var.f37549x2) && Objects.equals(this.f37557z2, f30Var.f37557z2) && Objects.equals(this.F2, f30Var.F2) && Objects.equals(this.G2, f30Var.G2) && Objects.equals(this.H2, f30Var.H2) && Objects.equals(this.I2, f30Var.I2) && Objects.equals(this.J2, f30Var.J2) && Objects.equals(this.K2, f30Var.K2) && Objects.equals(this.L2, f30Var.L2) && Objects.equals(this.O2, f30Var.O2) && Objects.equals(this.P2, f30Var.P2) && Objects.equals(this.Q2, f30Var.Q2) && Objects.equals(this.T2, f30Var.T2) && Objects.equals(this.U2, f30Var.U2) && Objects.equals(this.V2, f30Var.V2) && Objects.equals(this.W2, f30Var.W2) && Objects.equals(this.X2, f30Var.X2) && Objects.equals(this.Y2, f30Var.Y2) && Objects.equals(this.Z2, f30Var.Z2) && Objects.equals(this.f37451a3, f30Var.f37451a3) && Objects.equals(this.f37461c3, f30Var.f37461c3) && Objects.equals(this.f37465d3, f30Var.f37465d3) && Objects.equals(this.f37470e3, f30Var.f37470e3) && Objects.equals(this.f37480g3, f30Var.f37480g3);
    }

    public final a f4() {
        return this.V;
    }

    public final Boolean f5() {
        Boolean bool = this.f37496k1;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final oe0 f6() {
        return this.f37533t2;
    }

    public final String g4() {
        return this.W;
    }

    public final Boolean g5() {
        Boolean bool = this.f37504m1;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final se0 g6() {
        return this.f37537u2;
    }

    public final String h4() {
        return this.X;
    }

    public final Boolean h5() {
        Boolean bool = this.f37508n1;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final boolean h6() {
        boolean[] zArr = this.f37485h3;
        return zArr.length > 176 && zArr[176];
    }

    public final int hashCode() {
        return Objects.hash(this.f37447a, this.f37452b, this.f37457c, this.f37462d, this.f37466e, this.f37471f, this.f37476g, this.f37481h, this.f37486i, this.f37490j, this.f37494k, this.f37498l, this.f37502m, this.f37506n, this.f37510o, this.f37514p, this.f37518q, this.f37522r, this.f37526s, this.f37530t, this.f37534u, this.f37538v, this.f37542w, this.f37546x, this.f37550y, this.f37554z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.f37446J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.f37448a0, this.f37453b0, this.f37458c0, this.f37463d0, this.f37467e0, this.f37472f0, this.f37477g0, this.f37482h0, this.f37487i0, this.f37491j0, this.f37495k0, this.f37499l0, this.f37503m0, this.f37507n0, this.f37511o0, this.f37515p0, this.f37519q0, this.f37523r0, this.f37527s0, this.f37531t0, this.f37535u0, this.f37539v0, this.f37543w0, this.f37547x0, this.f37551y0, this.f37555z0, this.A0, this.B0, this.C0, this.D0, this.E0, this.F0, this.G0, this.H0, this.I0, this.J0, this.K0, this.L0, this.M0, this.N0, this.O0, this.P0, this.Q0, this.R0, this.S0, this.T0, this.U0, this.V0, this.W0, this.X0, this.Y0, this.Z0, this.f37449a1, this.f37454b1, this.f37459c1, this.f37464d1, this.f37468e1, this.f37473f1, this.f37478g1, this.f37483h1, this.f37488i1, this.f37492j1, this.f37496k1, this.f37500l1, this.f37504m1, this.f37508n1, this.f37512o1, this.f37516p1, this.f37520q1, this.f37524r1, this.f37528s1, this.f37532t1, this.f37536u1, this.f37540v1, this.f37544w1, this.f37548x1, this.f37552y1, this.f37556z1, this.A1, this.B1, this.C1, this.D1, this.E1, this.F1, this.G1, this.H1, this.I1, this.J1, this.K1, this.L1, this.M1, this.N1, this.O1, this.P1, this.Q1, this.R1, this.S1, this.T1, this.U1, this.V1, this.W1, this.X1, this.Y1, this.Z1, this.f37450a2, this.f37455b2, this.f37460c2, this.d2, this.f37469e2, this.f37474f2, this.f37479g2, this.f37484h2, this.f37489i2, this.f37493j2, this.f37497k2, this.f37501l2, this.f37505m2, this.f37509n2, this.f37513o2, this.f37517p2, this.f37521q2, this.f37525r2, this.f37529s2, this.f37533t2, this.f37537u2, this.f37541v2, this.f37545w2, this.f37549x2, this.f37553y2, this.f37557z2, this.A2, this.B2, this.C2, this.D2, this.E2, this.F2, this.G2, this.H2, this.I2, this.J2, this.K2, this.L2, this.M2, this.N2, this.O2, this.P2, this.Q2, this.R2, this.S2, this.T2, this.U2, this.V2, this.W2, this.X2, this.Y2, this.Z2, this.f37451a3, this.f37456b3, this.f37461c3, this.f37465d3, this.f37470e3, this.f37475f3, this.f37480g3);
    }

    public final String i4() {
        return this.Y;
    }

    public final Boolean i5() {
        Boolean bool = this.f37512o1;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String i6() {
        return this.f37541v2;
    }

    public final Boolean j4() {
        Boolean bool = this.Z;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean j5() {
        Boolean bool = this.f37520q1;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final ba j6() {
        return this.f37549x2;
    }

    public final Integer k4() {
        Integer num = this.f37448a0;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Boolean k5() {
        Boolean bool = this.f37524r1;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Integer k6() {
        Integer num = this.f37553y2;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final List l4() {
        return this.f37453b0;
    }

    public final Boolean l5() {
        Boolean bool = this.f37528s1;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final List l6() {
        return this.f37557z2;
    }

    public final gn m4() {
        return this.f37463d0;
    }

    public final Boolean m5() {
        Boolean bool = this.f37532t1;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Integer m6() {
        Integer num = this.A2;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer n4() {
        Integer num = this.f37467e0;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Boolean n5() {
        Boolean bool = this.f37540v1;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final boolean n6() {
        boolean[] zArr = this.f37485h3;
        return zArr.length > 182 && zArr[182];
    }

    @Override // dl1.s
    public final String o() {
        return this.f37452b;
    }

    public final Boolean o4() {
        Boolean bool = this.f37472f0;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean o5() {
        Boolean bool = this.f37544w1;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean o6() {
        Boolean bool = this.B2;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final em p4() {
        return this.f37477g0;
    }

    public final Boolean p5() {
        Boolean bool = this.f37548x1;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean p6() {
        Boolean bool = this.D2;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final List q4() {
        return this.f37482h0;
    }

    public final Boolean q5() {
        Boolean bool = this.f37552y1;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean q6() {
        Boolean bool = this.E2;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String r4() {
        return this.f37487i0;
    }

    public final String r5() {
        return this.f37556z1;
    }

    public final fi0 r6() {
        return this.F2;
    }

    public final Double s3() {
        Double d2 = this.f37457c;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Boolean s4() {
        Boolean bool = this.f37491j0;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String s5() {
        return this.A1;
    }

    public final hi0 s6() {
        return this.G2;
    }

    public final g t3() {
        return this.f37462d;
    }

    public final Boolean t4() {
        Boolean bool = this.f37499l0;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final hh t5() {
        return this.B1;
    }

    public final zs t6() {
        return this.I2;
    }

    public final String u3() {
        return this.f37466e;
    }

    public final Boolean u4() {
        Boolean bool = this.f37503m0;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final pz0 u5() {
        return this.C1;
    }

    public final rj0 u6() {
        return this.J2;
    }

    public final Integer v3() {
        Integer num = this.f37471f;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final List v4() {
        return this.f37511o0;
    }

    public final c v5() {
        return this.D1;
    }

    public final dl0 v6() {
        return this.K2;
    }

    public final l0 w3() {
        return this.f37476g;
    }

    public final List w4() {
        return this.f37515p0;
    }

    public final ou w5() {
        return this.E1;
    }

    public final String w6() {
        return this.L2;
    }

    public final String x3() {
        return this.f37481h;
    }

    public final or x4() {
        return this.f37519q0;
    }

    public final String x5() {
        return this.F1;
    }

    public final Boolean x6() {
        Boolean bool = this.M2;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String y3() {
        return this.f37486i;
    }

    public final String y4() {
        return this.f37523r0;
    }

    public final List y5() {
        return this.G1;
    }

    public final wy0 y6() {
        return this.O2;
    }

    public final f3 z3() {
        return this.f37490j;
    }

    public final String z4() {
        return this.f37527s0;
    }

    public final wy0 z5() {
        return this.H1;
    }

    public final String z6() {
        return this.P2;
    }

    public f30() {
        this.f37485h3 = new boolean[RecyclerViewTypes.VIEW_TYPE_BOARD_INVITE_HEADER];
    }

    private f30(@NonNull String str, String str2, Double d2, g gVar, String str3, Integer num, l0 l0Var, String str4, String str5, f3 f3Var, String str6, x6 x6Var, String str7, String str8, v7 v7Var, z7 z7Var, String str9, String str10, String str11, Boolean bool, String str12, String str13, cc ccVar, String str14, wy0 wy0Var, String str15, String str16, String str17, md mdVar, Integer num2, String str18, Boolean bool2, String str19, String str20, String str21, Date date, Double d13, Map<String, bg> map, Integer num3, String str22, List<sg> list, List<sg> list2, List<sg> list3, List<sg> list4, String str23, Integer num4, Boolean bool3, a aVar, String str24, String str25, String str26, Boolean bool4, Integer num5, List<String> list5, List<String> list6, gn gnVar, Integer num6, Boolean bool5, em emVar, List<ym> list7, String str27, Boolean bool6, b bVar, Boolean bool7, Boolean bool8, List<String> list8, List<String> list9, List<String> list10, or orVar, String str28, String str29, Map<String, sr> map2, String str30, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, Boolean bool26, Boolean bool27, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, Boolean bool33, Boolean bool34, Boolean bool35, Boolean bool36, Boolean bool37, Boolean bool38, Boolean bool39, Boolean bool40, Boolean bool41, Boolean bool42, Boolean bool43, Boolean bool44, Boolean bool45, Boolean bool46, Boolean bool47, Boolean bool48, Boolean bool49, Boolean bool50, Boolean bool51, Boolean bool52, Boolean bool53, Boolean bool54, Boolean bool55, Boolean bool56, Boolean bool57, Boolean bool58, Boolean bool59, Boolean bool60, Boolean bool61, Boolean bool62, Boolean bool63, Boolean bool64, String str31, String str32, hh hhVar, pz0 pz0Var, c cVar, ou ouVar, String str33, List<hx> list11, wy0 wy0Var2, nx nxVar, String str34, String str35, wy0 wy0Var3, List<p20> list12, w40 w40Var, String str36, v7 v7Var2, Boolean bool65, wy0 wy0Var4, String str37, Double d14, String str38, String str39, Boolean bool66, Boolean bool67, Boolean bool68, Boolean bool69, Boolean bool70, Boolean bool71, Boolean bool72, Boolean bool73, Boolean bool74, Boolean bool75, Boolean bool76, n90 n90Var, String str40, String str41, z90 z90Var, wy0 wy0Var5, Map<String, bg> map3, Integer num7, Integer num8, Map<String, Integer> map4, oc0 oc0Var, Integer num9, List<wy0> list13, oe0 oe0Var, se0 se0Var, String str42, Map<String, ig0> map5, ba baVar, Integer num10, List<Integer> list14, Integer num11, Boolean bool77, Boolean bool78, Boolean bool79, Boolean bool80, fi0 fi0Var, hi0 hi0Var, List<p20> list15, zs zsVar, rj0 rj0Var, dl0 dl0Var, String str43, Boolean bool81, Integer num12, wy0 wy0Var6, String str44, dw0 dw0Var, Integer num13, Integer num14, String str45, String str46, String str47, String str48, Date date2, List<ts0> list16, String str49, wy0 wy0Var7, Integer num15, o01 o01Var, b01 b01Var, s01 s01Var, Integer num16, List<q11> list17, boolean[] zArr) {
        this.f37447a = str;
        this.f37452b = str2;
        this.f37457c = d2;
        this.f37462d = gVar;
        this.f37466e = str3;
        this.f37471f = num;
        this.f37476g = l0Var;
        this.f37481h = str4;
        this.f37486i = str5;
        this.f37490j = f3Var;
        this.f37494k = str6;
        this.f37498l = x6Var;
        this.f37502m = str7;
        this.f37506n = str8;
        this.f37510o = v7Var;
        this.f37514p = z7Var;
        this.f37518q = str9;
        this.f37522r = str10;
        this.f37526s = str11;
        this.f37530t = bool;
        this.f37534u = str12;
        this.f37538v = str13;
        this.f37542w = ccVar;
        this.f37546x = str14;
        this.f37550y = wy0Var;
        this.f37554z = str15;
        this.A = str16;
        this.B = str17;
        this.C = mdVar;
        this.D = num2;
        this.E = str18;
        this.F = bool2;
        this.G = str19;
        this.H = str20;
        this.I = str21;
        this.f37446J = date;
        this.K = d13;
        this.L = map;
        this.M = num3;
        this.N = str22;
        this.O = list;
        this.P = list2;
        this.Q = list3;
        this.R = list4;
        this.S = str23;
        this.T = num4;
        this.U = bool3;
        this.V = aVar;
        this.W = str24;
        this.X = str25;
        this.Y = str26;
        this.Z = bool4;
        this.f37448a0 = num5;
        this.f37453b0 = list5;
        this.f37458c0 = list6;
        this.f37463d0 = gnVar;
        this.f37467e0 = num6;
        this.f37472f0 = bool5;
        this.f37477g0 = emVar;
        this.f37482h0 = list7;
        this.f37487i0 = str27;
        this.f37491j0 = bool6;
        this.f37495k0 = bVar;
        this.f37499l0 = bool7;
        this.f37503m0 = bool8;
        this.f37507n0 = list8;
        this.f37511o0 = list9;
        this.f37515p0 = list10;
        this.f37519q0 = orVar;
        this.f37523r0 = str28;
        this.f37527s0 = str29;
        this.f37531t0 = map2;
        this.f37535u0 = str30;
        this.f37539v0 = bool9;
        this.f37543w0 = bool10;
        this.f37547x0 = bool11;
        this.f37551y0 = bool12;
        this.f37555z0 = bool13;
        this.A0 = bool14;
        this.B0 = bool15;
        this.C0 = bool16;
        this.D0 = bool17;
        this.E0 = bool18;
        this.F0 = bool19;
        this.G0 = bool20;
        this.H0 = bool21;
        this.I0 = bool22;
        this.J0 = bool23;
        this.K0 = bool24;
        this.L0 = bool25;
        this.M0 = bool26;
        this.N0 = bool27;
        this.O0 = bool28;
        this.P0 = bool29;
        this.Q0 = bool30;
        this.R0 = bool31;
        this.S0 = bool32;
        this.T0 = bool33;
        this.U0 = bool34;
        this.V0 = bool35;
        this.W0 = bool36;
        this.X0 = bool37;
        this.Y0 = bool38;
        this.Z0 = bool39;
        this.f37449a1 = bool40;
        this.f37454b1 = bool41;
        this.f37459c1 = bool42;
        this.f37464d1 = bool43;
        this.f37468e1 = bool44;
        this.f37473f1 = bool45;
        this.f37478g1 = bool46;
        this.f37483h1 = bool47;
        this.f37488i1 = bool48;
        this.f37492j1 = bool49;
        this.f37496k1 = bool50;
        this.f37500l1 = bool51;
        this.f37504m1 = bool52;
        this.f37508n1 = bool53;
        this.f37512o1 = bool54;
        this.f37516p1 = bool55;
        this.f37520q1 = bool56;
        this.f37524r1 = bool57;
        this.f37528s1 = bool58;
        this.f37532t1 = bool59;
        this.f37536u1 = bool60;
        this.f37540v1 = bool61;
        this.f37544w1 = bool62;
        this.f37548x1 = bool63;
        this.f37552y1 = bool64;
        this.f37556z1 = str31;
        this.A1 = str32;
        this.B1 = hhVar;
        this.C1 = pz0Var;
        this.D1 = cVar;
        this.E1 = ouVar;
        this.F1 = str33;
        this.G1 = list11;
        this.H1 = wy0Var2;
        this.I1 = nxVar;
        this.J1 = str34;
        this.K1 = str35;
        this.L1 = wy0Var3;
        this.M1 = list12;
        this.N1 = w40Var;
        this.O1 = str36;
        this.P1 = v7Var2;
        this.Q1 = bool65;
        this.R1 = wy0Var4;
        this.S1 = str37;
        this.T1 = d14;
        this.U1 = str38;
        this.V1 = str39;
        this.W1 = bool66;
        this.X1 = bool67;
        this.Y1 = bool68;
        this.Z1 = bool69;
        this.f37450a2 = bool70;
        this.f37455b2 = bool71;
        this.f37460c2 = bool72;
        this.d2 = bool73;
        this.f37469e2 = bool74;
        this.f37474f2 = bool75;
        this.f37479g2 = bool76;
        this.f37484h2 = n90Var;
        this.f37489i2 = str40;
        this.f37493j2 = str41;
        this.f37497k2 = z90Var;
        this.f37501l2 = wy0Var5;
        this.f37505m2 = map3;
        this.f37509n2 = num7;
        this.f37513o2 = num8;
        this.f37517p2 = map4;
        this.f37521q2 = oc0Var;
        this.f37525r2 = num9;
        this.f37529s2 = list13;
        this.f37533t2 = oe0Var;
        this.f37537u2 = se0Var;
        this.f37541v2 = str42;
        this.f37545w2 = map5;
        this.f37549x2 = baVar;
        this.f37553y2 = num10;
        this.f37557z2 = list14;
        this.A2 = num11;
        this.B2 = bool77;
        this.C2 = bool78;
        this.D2 = bool79;
        this.E2 = bool80;
        this.F2 = fi0Var;
        this.G2 = hi0Var;
        this.H2 = list15;
        this.I2 = zsVar;
        this.J2 = rj0Var;
        this.K2 = dl0Var;
        this.L2 = str43;
        this.M2 = bool81;
        this.N2 = num12;
        this.O2 = wy0Var6;
        this.P2 = str44;
        this.Q2 = dw0Var;
        this.R2 = num13;
        this.S2 = num14;
        this.T2 = str45;
        this.U2 = str46;
        this.V2 = str47;
        this.W2 = str48;
        this.X2 = date2;
        this.Y2 = list16;
        this.Z2 = str49;
        this.f37451a3 = wy0Var7;
        this.f37456b3 = num15;
        this.f37461c3 = o01Var;
        this.f37465d3 = b01Var;
        this.f37470e3 = s01Var;
        this.f37475f3 = num16;
        this.f37480g3 = list17;
        this.f37485h3 = zArr;
    }
}
