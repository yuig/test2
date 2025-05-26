package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class g30 extends nm.i0 {
    public nm.m A;
    public nm.m B;
    public nm.m C;
    public nm.m D;
    public nm.m E;
    public nm.m F;
    public nm.m G;
    public nm.m H;
    public nm.m I;

    /* renamed from: J, reason: collision with root package name */
    public nm.m f37929J;
    public nm.m K;
    public nm.m L;
    public nm.m M;
    public nm.m N;
    public nm.m O;
    public nm.m P;
    public nm.m Q;
    public nm.m R;
    public nm.m S;
    public nm.m T;
    public nm.m U;
    public nm.m V;
    public nm.m W;
    public nm.m X;
    public nm.m Y;
    public nm.m Z;

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37930a;

    /* renamed from: a0, reason: collision with root package name */
    public nm.m f37931a0;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37932b;

    /* renamed from: b0, reason: collision with root package name */
    public nm.m f37933b0;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f37934c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f37935d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f37936e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f37937f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f37938g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f37939h;

    /* renamed from: i, reason: collision with root package name */
    public nm.m f37940i;

    /* renamed from: j, reason: collision with root package name */
    public nm.m f37941j;

    /* renamed from: k, reason: collision with root package name */
    public nm.m f37942k;

    /* renamed from: l, reason: collision with root package name */
    public nm.m f37943l;

    /* renamed from: m, reason: collision with root package name */
    public nm.m f37944m;

    /* renamed from: n, reason: collision with root package name */
    public nm.m f37945n;

    /* renamed from: o, reason: collision with root package name */
    public nm.m f37946o;

    /* renamed from: p, reason: collision with root package name */
    public nm.m f37947p;

    /* renamed from: q, reason: collision with root package name */
    public nm.m f37948q;

    /* renamed from: r, reason: collision with root package name */
    public nm.m f37949r;

    /* renamed from: s, reason: collision with root package name */
    public nm.m f37950s;

    /* renamed from: t, reason: collision with root package name */
    public nm.m f37951t;

    /* renamed from: u, reason: collision with root package name */
    public nm.m f37952u;

    /* renamed from: v, reason: collision with root package name */
    public nm.m f37953v;

    /* renamed from: w, reason: collision with root package name */
    public nm.m f37954w;

    /* renamed from: x, reason: collision with root package name */
    public nm.m f37955x;

    /* renamed from: y, reason: collision with root package name */
    public nm.m f37956y;

    /* renamed from: z, reason: collision with root package name */
    public nm.m f37957z;

    public g30(nm.o oVar) {
        this.f37930a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final f30 c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        e30 r33 = f30.r3();
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2146872676:
                    if (k03.equals("digital_media_source_type")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -2108494628:
                    if (k03.equals("story_pin_data_id")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -2041736265:
                    if (k03.equals("new_repin_id")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -2017127186:
                    if (k03.equals("is_premiere")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -1972655661:
                    if (k03.equals("call_to_action_text")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -1966187246:
                    if (k03.equals("repin_count")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case -1959780154:
                    if (k03.equals("is_translatable")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case -1949459957:
                    if (k03.equals("repin_users")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case -1943447534:
                    if (k03.equals("is_eligible_for_filters")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case -1936389946:
                    if (k03.equals("promoted_is_max_video")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case -1891087284:
                    if (k03.equals("promoted_is_lead_ad")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case -1878317026:
                    if (k03.equals("story_pin_data")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case -1856527355:
                    if (k03.equals("is_eligible_for_aggregated_comments")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case -1837056000:
                    if (k03.equals("is_eligible_for_collage_grid_animation")) {
                        c13 = '\r';
                        break;
                    }
                    break;
                case -1806567213:
                    if (k03.equals("closeup_attribution")) {
                        c13 = 14;
                        break;
                    }
                    break;
                case -1791318309:
                    if (k03.equals("is_year_in_preview")) {
                        c13 = 15;
                        break;
                    }
                    break;
                case -1749737700:
                    if (k03.equals("promoted_is_auto_assembled")) {
                        c13 = 16;
                        break;
                    }
                    break;
                case -1736882007:
                    if (k03.equals("pinned_to_board")) {
                        c13 = 17;
                        break;
                    }
                    break;
                case -1730642919:
                    if (k03.equals("is_promoted")) {
                        c13 = 18;
                        break;
                    }
                    break;
                case -1724546052:
                    if (k03.equals("description")) {
                        c13 = 19;
                        break;
                    }
                    break;
                case -1693706799:
                    if (k03.equals("is_visualization_enabled")) {
                        c13 = 20;
                        break;
                    }
                    break;
                case -1677833210:
                    if (k03.equals("is_native_content")) {
                        c13 = 21;
                        break;
                    }
                    break;
                case -1670898864:
                    if (k03.equals("did_it_disabled")) {
                        c13 = 22;
                        break;
                    }
                    break;
                case -1651960392:
                    if (k03.equals("is_instagram_api")) {
                        c13 = 23;
                        break;
                    }
                    break;
                case -1650981408:
                    if (k03.equals("is_product_tagging_enabled_standard_pin")) {
                        c13 = 24;
                        break;
                    }
                    break;
                case -1531591314:
                    if (k03.equals("is_eligible_for_closeup_one_bar_refinements")) {
                        c13 = 25;
                        break;
                    }
                    break;
                case -1521734740:
                    if (k03.equals("affiliate_link")) {
                        c13 = 26;
                        break;
                    }
                    break;
                case -1520801335:
                    if (k03.equals("favorited_by_me")) {
                        c13 = 27;
                        break;
                    }
                    break;
                case -1496002765:
                    if (k03.equals("creator_analytics")) {
                        c13 = 28;
                        break;
                    }
                    break;
                case -1487281798:
                    if (k03.equals("near_dup_sig")) {
                        c13 = 29;
                        break;
                    }
                    break;
                case -1479477032:
                    if (k03.equals("top_community_insight")) {
                        c13 = 30;
                        break;
                    }
                    break;
                case -1443271948:
                    if (k03.equals("image_crop")) {
                        c13 = 31;
                        break;
                    }
                    break;
                case -1431929873:
                    if (k03.equals("tracked_link")) {
                        c13 = ' ';
                        break;
                    }
                    break;
                case -1418779634:
                    if (k03.equals("is_unsafe_for_comments")) {
                        c13 = '!';
                        break;
                    }
                    break;
                case -1414322612:
                    if (k03.equals("is_virtual_try_on")) {
                        c13 = '\"';
                        break;
                    }
                    break;
                case -1402908567:
                    if (k03.equals("is_tml_merchant")) {
                        c13 = '#';
                        break;
                    }
                    break;
                case -1326197564:
                    if (k03.equals("domain")) {
                        c13 = '$';
                        break;
                    }
                    break;
                case -1314001545:
                    if (k03.equals("mobile_link")) {
                        c13 = '%';
                        break;
                    }
                    break;
                case -1305900592:
                    if (k03.equals("canonical_merchant_domain")) {
                        c13 = '&';
                        break;
                    }
                    break;
                case -1300320989:
                    if (k03.equals("closeup_unified_description")) {
                        c13 = '\'';
                        break;
                    }
                    break;
                case -1282563927:
                    if (k03.equals("take_default_template_type")) {
                        c13 = '(';
                        break;
                    }
                    break;
                case -1261598721:
                    if (k03.equals("attribution_source_id")) {
                        c13 = ')';
                        break;
                    }
                    break;
                case -1224640436:
                    if (k03.equals("link_user_website")) {
                        c13 = '*';
                        break;
                    }
                    break;
                case -1214139627:
                    if (k03.equals("visual_objects")) {
                        c13 = '+';
                        break;
                    }
                    break;
                case -1185250696:
                    if (k03.equals("images")) {
                        c13 = ',';
                        break;
                    }
                    break;
                case -1170158853:
                    if (k03.equals("deb_content_quality")) {
                        c13 = '-';
                        break;
                    }
                    break;
                case -1152730554:
                    if (k03.equals("ad_data")) {
                        c13 = '.';
                        break;
                    }
                    break;
                case -1144433861:
                    if (k03.equals("is_downstream_promotion")) {
                        c13 = '/';
                        break;
                    }
                    break;
                case -1127621238:
                    if (k03.equals("recommendation_reason")) {
                        c13 = '0';
                        break;
                    }
                    break;
                case -1120985297:
                    if (k03.equals("comment_count")) {
                        c13 = '1';
                        break;
                    }
                    break;
                case -1116260677:
                    if (k03.equals("is_from_initial_page_load")) {
                        c13 = '2';
                        break;
                    }
                    break;
                case -1113838309:
                    if (k03.equals("destination_url_type")) {
                        c13 = '3';
                        break;
                    }
                    break;
                case -1106614489:
                    if (k03.equals("is_active_ad")) {
                        c13 = '4';
                        break;
                    }
                    break;
                case -1054548316:
                    if (k03.equals("is_whitelisted_for_tried_it")) {
                        c13 = '5';
                        break;
                    }
                    break;
                case -1002837387:
                    if (k03.equals("is_go_linkless")) {
                        c13 = '6';
                        break;
                    }
                    break;
                case -995612494:
                    if (k03.equals("promoter")) {
                        c13 = '7';
                        break;
                    }
                    break;
                case -988146714:
                    if (k03.equals("pinner")) {
                        c13 = '8';
                        break;
                    }
                    break;
                case -980783469:
                    if (k03.equals("auto_alt_text")) {
                        c13 = '9';
                        break;
                    }
                    break;
                case -942793740:
                    if (k03.equals("is_stale_product")) {
                        c13 = ':';
                        break;
                    }
                    break;
                case -920271678:
                    if (k03.equals("is_eligible_for_cutout_tool")) {
                        c13 = ';';
                        break;
                    }
                    break;
                case -890164191:
                    if (k03.equals("is_cpc_ad")) {
                        c13 = '<';
                        break;
                    }
                    break;
                case -855777186:
                    if (k03.equals("cacheable_id")) {
                        c13 = '=';
                        break;
                    }
                    break;
                case -836830170:
                    if (k03.equals("is_quick_promotable")) {
                        c13 = '>';
                        break;
                    }
                    break;
                case -820196392:
                    if (k03.equals("is_disabled_by_dsa")) {
                        c13 = '?';
                        break;
                    }
                    break;
                case -816678056:
                    if (k03.equals("videos")) {
                        c13 = '@';
                        break;
                    }
                    break;
                case -816507870:
                    if (k03.equals("is_eligible_for_hybrid_search")) {
                        c13 = 'A';
                        break;
                    }
                    break;
                case -810647895:
                    if (k03.equals("conversation_sender_id")) {
                        c13 = 'B';
                        break;
                    }
                    break;
                case -784536239:
                    if (k03.equals("quality_state")) {
                        c13 = 'C';
                        break;
                    }
                    break;
                case -759720416:
                    if (k03.equals("is_subtle_ad")) {
                        c13 = 'D';
                        break;
                    }
                    break;
                case -753448353:
                    if (k03.equals("is_hidden")) {
                        c13 = 'E';
                        break;
                    }
                    break;
                case -740173570:
                    if (k03.equals("video_status_message")) {
                        c13 = 'F';
                        break;
                    }
                    break;
                case -665849108:
                    if (k03.equals("gen_ai_topics")) {
                        c13 = 'G';
                        break;
                    }
                    break;
                case -662151474:
                    if (k03.equals("source_interest")) {
                        c13 = 'H';
                        break;
                    }
                    break;
                case -656922289:
                    if (k03.equals("is_outfit_of_the_day_enabled")) {
                        c13 = 'I';
                        break;
                    }
                    break;
                case -648579848:
                    if (k03.equals("creative_enhancement_slideshow_aspect_ratio")) {
                        c13 = 'J';
                        break;
                    }
                    break;
                case -605258694:
                    if (k03.equals("duplicated_ad_insertions")) {
                        c13 = 'K';
                        break;
                    }
                    break;
                case -592843119:
                    if (k03.equals("current_story_pin_page_id")) {
                        c13 = 'L';
                        break;
                    }
                    break;
                case -588579636:
                    if (k03.equals("is_native")) {
                        c13 = 'M';
                        break;
                    }
                    break;
                case -571052028:
                    if (k03.equals("native_creator")) {
                        c13 = 'N';
                        break;
                    }
                    break;
                case -542322813:
                    if (k03.equals("done_by_me")) {
                        c13 = 'O';
                        break;
                    }
                    break;
                case -517665250:
                    if (k03.equals("favorite_user_count")) {
                        c13 = 'P';
                        break;
                    }
                    break;
                case -446984923:
                    if (k03.equals("should_mute")) {
                        c13 = 'Q';
                        break;
                    }
                    break;
                case -442289112:
                    if (k03.equals("is_post_reranked")) {
                        c13 = 'R';
                        break;
                    }
                    break;
                case -440783776:
                    if (k03.equals("dpa_creative_type")) {
                        c13 = 'S';
                        break;
                    }
                    break;
                case -434803620:
                    if (k03.equals("pin_note")) {
                        c13 = 'T';
                        break;
                    }
                    break;
                case -422233151:
                    if (k03.equals("promoted_is_removable")) {
                        c13 = 'U';
                        break;
                    }
                    break;
                case -421036375:
                    if (k03.equals("is_eligible_for_responses")) {
                        c13 = 'V';
                        break;
                    }
                    break;
                case -419323305:
                    if (k03.equals("conversation_id")) {
                        c13 = 'W';
                        break;
                    }
                    break;
                case -411250981:
                    if (k03.equals("is_from_cache_feed")) {
                        c13 = 'X';
                        break;
                    }
                    break;
                case -393374713:
                    if (k03.equals("promoted_is_showcase")) {
                        c13 = 'Y';
                        break;
                    }
                    break;
                case -376207781:
                    if (k03.equals("is_unsafe")) {
                        c13 = 'Z';
                        break;
                    }
                    break;
                case -314498168:
                    if (k03.equals("privacy")) {
                        c13 = '[';
                        break;
                    }
                    break;
                case -309882753:
                    if (k03.equals("attribution")) {
                        c13 = '\\';
                        break;
                    }
                    break;
                case -295464393:
                    if (k03.equals("updated_at")) {
                        c13 = ']';
                        break;
                    }
                    break;
                case -290344918:
                    if (k03.equals("is_eligible_for_relabeling")) {
                        c13 = '^';
                        break;
                    }
                    break;
                case -232779045:
                    if (k03.equals("should_animate_follow")) {
                        c13 = '_';
                        break;
                    }
                    break;
                case -213127347:
                    if (k03.equals("native_pin_stats")) {
                        c13 = '`';
                        break;
                    }
                    break;
                case -171091719:
                    if (k03.equals("formatted_description")) {
                        c13 = 'a';
                        break;
                    }
                    break;
                case -155705013:
                    if (k03.equals("pin_promotion_id_reformatted")) {
                        c13 = 'b';
                        break;
                    }
                    break;
                case -127926097:
                    if (k03.equals("advertiser_id")) {
                        c13 = 'c';
                        break;
                    }
                    break;
                case -94753778:
                    if (k03.equals("tracking_params")) {
                        c13 = 'd';
                        break;
                    }
                    break;
                case -68291070:
                    if (k03.equals("root_pin_id")) {
                        c13 = 'e';
                        break;
                    }
                    break;
                case -67594391:
                    if (k03.equals("subscribed_to_notifications")) {
                        c13 = 'f';
                        break;
                    }
                    break;
                case -54790569:
                    if (k03.equals("highlighted_did_it")) {
                        c13 = 'g';
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 'h';
                        break;
                    }
                    break;
                case 3321850:
                    if (k03.equals("link")) {
                        c13 = 'i';
                        break;
                    }
                    break;
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = 'j';
                        break;
                    }
                    break;
                case 4180022:
                    if (k03.equals("video_status")) {
                        c13 = 'k';
                        break;
                    }
                    break;
                case 12197203:
                    if (k03.equals("ip_eligible_for_stela")) {
                        c13 = 'l';
                        break;
                    }
                    break;
                case 45804691:
                    if (k03.equals("has_variants")) {
                        c13 = 'm';
                        break;
                    }
                    break;
                case 50511102:
                    if (k03.equals("category")) {
                        c13 = 'n';
                        break;
                    }
                    break;
                case 62577656:
                    if (k03.equals("is_eligible_for_flashlight_shopping")) {
                        c13 = 'o';
                        break;
                    }
                    break;
                case 93908710:
                    if (k03.equals("board")) {
                        c13 = 'p';
                        break;
                    }
                    break;
                case 96620249:
                    if (k03.equals("embed")) {
                        c13 = 'q';
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 'r';
                        break;
                    }
                    break;
                case 110813772:
                    if (k03.equals("is_draft")) {
                        c13 = 's';
                        break;
                    }
                    break;
                case 113300282:
                    if (k03.equals("is_ghost")) {
                        c13 = 't';
                        break;
                    }
                    break;
                case 123370285:
                    if (k03.equals("is_repin")) {
                        c13 = 'u';
                        break;
                    }
                    break;
                case 124223799:
                    if (k03.equals("is_scene")) {
                        c13 = 'v';
                        break;
                    }
                    break;
                case 127171878:
                    if (k03.equals("is_video")) {
                        c13 = 'w';
                        break;
                    }
                    break;
                case 140600959:
                    if (k03.equals("has_link")) {
                        c13 = 'x';
                        break;
                    }
                    break;
                case 149143079:
                    if (k03.equals("hashtags")) {
                        c13 = 'y';
                        break;
                    }
                    break;
                case 149618889:
                    if (k03.equals("promoted_partnership_advertiser_name")) {
                        c13 = 'z';
                        break;
                    }
                    break;
                case 173776866:
                    if (k03.equals("link_utm_applicable_and_replaced")) {
                        c13 = '{';
                        break;
                    }
                    break;
                case 185447986:
                    if (k03.equals("shopping_mdl_browser_type")) {
                        c13 = '|';
                        break;
                    }
                    break;
                case 211954463:
                    if (k03.equals("origin_pinner")) {
                        c13 = '}';
                        break;
                    }
                    break;
                case 246023289:
                    if (k03.equals("is_eligible_for_pre_loved_goods_label")) {
                        c13 = '~';
                        break;
                    }
                    break;
                case 311300212:
                    if (k03.equals("collection_pin")) {
                        c13 = 127;
                        break;
                    }
                    break;
                case 313202786:
                    if (k03.equals("social_insight_pear_styles")) {
                        c13 = 128;
                        break;
                    }
                    break;
                case 321832660:
                    if (k03.equals("top_interest")) {
                        c13 = 129;
                        break;
                    }
                    break;
                case 328316458:
                    if (k03.equals("shuffle_asset")) {
                        c13 = 130;
                        break;
                    }
                    break;
                case 356795441:
                    if (k03.equals("should_open_in_stream")) {
                        c13 = 131;
                        break;
                    }
                    break;
                case 392126639:
                    if (k03.equals("share_count")) {
                        c13 = 132;
                        break;
                    }
                    break;
                case 400421739:
                    if (k03.equals("can_delete_did_it_and_comments")) {
                        c13 = 133;
                        break;
                    }
                    break;
                case 427005168:
                    if (k03.equals("shopping_flags")) {
                        c13 = 134;
                        break;
                    }
                    break;
                case 453999410:
                    if (k03.equals("rich_metadata")) {
                        c13 = 135;
                        break;
                    }
                    break;
                case 467184874:
                    if (k03.equals("reaction_by_me")) {
                        c13 = 136;
                        break;
                    }
                    break;
                case 474940125:
                    if (k03.equals("public_creator_analytics")) {
                        c13 = 137;
                        break;
                    }
                    break;
                case 475727340:
                    if (k03.equals("promoted_lead_form")) {
                        c13 = 138;
                        break;
                    }
                    break;
                case 486351579:
                    if (k03.equals("has_displayable_community_content")) {
                        c13 = 139;
                        break;
                    }
                    break;
                case 530484378:
                    if (k03.equals("ad_match_reason")) {
                        c13 = 140;
                        break;
                    }
                    break;
                case 536608871:
                    if (k03.equals("comments_disabled")) {
                        c13 = 141;
                        break;
                    }
                    break;
                case 543474386:
                    if (k03.equals("promoted_is_sideswipe_disabled")) {
                        c13 = 142;
                        break;
                    }
                    break;
                case 582199257:
                    if (k03.equals("is_eligible_for_in_content_ads")) {
                        c13 = 143;
                        break;
                    }
                    break;
                case 590237918:
                    if (k03.equals("deb_inclusive_product")) {
                        c13 = 144;
                        break;
                    }
                    break;
                case 604341972:
                    if (k03.equals("image_signature")) {
                        c13 = 145;
                        break;
                    }
                    break;
                case 640278314:
                    if (k03.equals("promoted_is_personalized")) {
                        c13 = 146;
                        break;
                    }
                    break;
                case 659074354:
                    if (k03.equals("is_eligible_for_promoted_partnership")) {
                        c13 = 147;
                        break;
                    }
                    break;
                case 668947659:
                    if (k03.equals("is_owned_by_viewer")) {
                        c13 = 148;
                        break;
                    }
                    break;
                case 751287607:
                    if (k03.equals("via_pinner")) {
                        c13 = 149;
                        break;
                    }
                    break;
                case 788962217:
                    if (k03.equals("is_third_party_ad")) {
                        c13 = 150;
                        break;
                    }
                    break;
                case 831998713:
                    if (k03.equals("dark_profile_link")) {
                        c13 = 151;
                        break;
                    }
                    break;
                case 833224683:
                    if (k03.equals("utm_link")) {
                        c13 = 152;
                        break;
                    }
                    break;
                case 836774030:
                    if (k03.equals("aggregated_pin_data")) {
                        c13 = 153;
                        break;
                    }
                    break;
                case 852363411:
                    if (k03.equals("is_eligible_for_pdp")) {
                        c13 = 154;
                        break;
                    }
                    break;
                case 863147785:
                    if (k03.equals("image_medium_url")) {
                        c13 = 155;
                        break;
                    }
                    break;
                case 865917870:
                    if (k03.equals("is_oos_product")) {
                        c13 = 156;
                        break;
                    }
                    break;
                case 882479078:
                    if (k03.equals("deb_shopping")) {
                        c13 = 157;
                        break;
                    }
                    break;
                case 887173442:
                    if (k03.equals("user_mention_tags")) {
                        c13 = 158;
                        break;
                    }
                    break;
                case 891867110:
                    if (k03.equals("activity_timestamp")) {
                        c13 = 159;
                        break;
                    }
                    break;
                case 895256511:
                    if (k03.equals("is_shoppable")) {
                        c13 = 160;
                        break;
                    }
                    break;
                case 916328534:
                    if (k03.equals("sponsorship")) {
                        c13 = 161;
                        break;
                    }
                    break;
                case 952881041:
                    if (k03.equals("digital_media_source_type_label")) {
                        c13 = 162;
                        break;
                    }
                    break;
                case 979246805:
                    if (k03.equals("ad_targeting_attribution")) {
                        c13 = 163;
                        break;
                    }
                    break;
                case 1017555108:
                    if (k03.equals("media_attribution")) {
                        c13 = 164;
                        break;
                    }
                    break;
                case 1040253983:
                    if (k03.equals("grid_title")) {
                        c13 = 165;
                        break;
                    }
                    break;
                case 1073736784:
                    if (k03.equals("closeup_description")) {
                        c13 = 166;
                        break;
                    }
                    break;
                case 1087385682:
                    if (k03.equals("virtual_try_on_data")) {
                        c13 = 167;
                        break;
                    }
                    break;
                case 1087885282:
                    if (k03.equals("virtual_try_on_type")) {
                        c13 = 168;
                        break;
                    }
                    break;
                case 1108543970:
                    if (k03.equals("is_eligible_for_related_pins_tabs")) {
                        c13 = 169;
                        break;
                    }
                    break;
                case 1127941746:
                    if (k03.equals("has_been_promoted")) {
                        c13 = 170;
                        break;
                    }
                    break;
                case 1169076845:
                    if (k03.equals("board_conversation_thread")) {
                        c13 = 171;
                        break;
                    }
                    break;
                case 1184205711:
                    if (k03.equals("edited_fields")) {
                        c13 = 172;
                        break;
                    }
                    break;
                case 1236876706:
                    if (k03.equals("ad_destination_url")) {
                        c13 = 173;
                        break;
                    }
                    break;
                case 1237286572:
                    if (k03.equals("pinned_to_profile")) {
                        c13 = 174;
                        break;
                    }
                    break;
                case 1280954951:
                    if (k03.equals("price_currency")) {
                        c13 = 175;
                        break;
                    }
                    break;
                case 1358109507:
                    if (k03.equals("rich_summary")) {
                        c13 = 176;
                        break;
                    }
                    break;
                case 1363670595:
                    if (k03.equals("promoted_is_opaque_onetap_enabled")) {
                        c13 = 177;
                        break;
                    }
                    break;
                case 1369680106:
                    if (k03.equals("created_at")) {
                        c13 = 178;
                        break;
                    }
                    break;
                case 1379176619:
                    if (k03.equals("insertion_id")) {
                        c13 = 179;
                        break;
                    }
                    break;
                case 1384276911:
                    if (k03.equals("promoted_is_quiz")) {
                        c13 = 180;
                        break;
                    }
                    break;
                case 1388436673:
                    if (k03.equals("is_eligible_for_related_products")) {
                        c13 = 181;
                        break;
                    }
                    break;
                case 1441956546:
                    if (k03.equals("promoted_android_deep_link")) {
                        c13 = 182;
                        break;
                    }
                    break;
                case 1478872023:
                    if (k03.equals("is_blocked")) {
                        c13 = 183;
                        break;
                    }
                    break;
                case 1567200867:
                    if (k03.equals("promoted_quiz_pin_data")) {
                        c13 = 184;
                        break;
                    }
                    break;
                case 1578360750:
                    if (k03.equals("music_attributions")) {
                        c13 = 185;
                        break;
                    }
                    break;
                case 1611731874:
                    if (k03.equals("promoted_is_catalog_carousel_ad")) {
                        c13 = 186;
                        break;
                    }
                    break;
                case 1617880090:
                    if (k03.equals("reaction_counts")) {
                        c13 = 187;
                        break;
                    }
                    break;
                case 1630208663:
                    if (k03.equals("canonical_merchant_name")) {
                        c13 = 188;
                        break;
                    }
                    break;
                case 1636071003:
                    if (k03.equals("pear_styles")) {
                        c13 = 189;
                        break;
                    }
                    break;
                case 1652927956:
                    if (k03.equals("total_reaction_count")) {
                        c13 = 190;
                        break;
                    }
                    break;
                case 1699844473:
                    if (k03.equals("unified_user_note")) {
                        c13 = 191;
                        break;
                    }
                    break;
                case 1714924804:
                    if (k03.equals("dominant_color")) {
                        c13 = 192;
                        break;
                    }
                    break;
                case 1715871384:
                    if (k03.equals("third_party_pin_owner")) {
                        c13 = 193;
                        break;
                    }
                    break;
                case 1763418879:
                    if (k03.equals("deb_trust_and_safety")) {
                        c13 = 194;
                        break;
                    }
                    break;
                case 1769845204:
                    if (k03.equals("campaign_id_reformatted")) {
                        c13 = 195;
                        break;
                    }
                    break;
                case 1789076265:
                    if (k03.equals("carousel_data")) {
                        c13 = 196;
                        break;
                    }
                    break;
                case 1824459569:
                    if (k03.equals("collage_pin_id")) {
                        c13 = 197;
                        break;
                    }
                    break;
                case 1861064267:
                    if (k03.equals("is_full_width")) {
                        c13 = 198;
                        break;
                    }
                    break;
                case 1863772129:
                    if (k03.equals("promoted_partnership_attribution_name")) {
                        c13 = 199;
                        break;
                    }
                    break;
                case 1887881979:
                    if (k03.equals("price_value")) {
                        c13 = 200;
                        break;
                    }
                    break;
                case 1892817098:
                    if (k03.equals("is_viewing_user_in_dsa_countries")) {
                        c13 = 201;
                        break;
                    }
                    break;
                case 1942797442:
                    if (k03.equals("highlighted_aggregated_comments")) {
                        c13 = 202;
                        break;
                    }
                    break;
                case 1970241253:
                    if (k03.equals("section")) {
                        c13 = 203;
                        break;
                    }
                    break;
                case 1971590313:
                    if (k03.equals("link_domain")) {
                        c13 = 204;
                        break;
                    }
                    break;
                case 1989410111:
                    if (k03.equals("is_eligible_for_web_closeup")) {
                        c13 = 205;
                        break;
                    }
                    break;
                case 1991857858:
                    if (k03.equals("shopping_rec_disabled")) {
                        c13 = 206;
                        break;
                    }
                    break;
                case 2007121232:
                    if (k03.equals("comment_reply_comment_id")) {
                        c13 = 207;
                        break;
                    }
                    break;
                case 2027300355:
                    if (k03.equals("alt_text")) {
                        c13 = 208;
                        break;
                    }
                    break;
                case 2047925731:
                    if (k03.equals("promoted_is_congruency_enabled")) {
                        c13 = 209;
                        break;
                    }
                    break;
                case 2056680257:
                    if (k03.equals("conversation_pin_id")) {
                        c13 = 210;
                        break;
                    }
                    break;
                case 2072332025:
                    if (k03.equals("shuffle")) {
                        c13 = 211;
                        break;
                    }
                    break;
                case 2080114557:
                    if (k03.equals("scene_data")) {
                        c13 = 212;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 213;
                        break;
                    }
                    break;
                case 2116204999:
                    if (k03.equals("item_id")) {
                        c13 = 214;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f37930a;
            switch (c13) {
                case 0:
                    if (this.I == null) {
                        this.I = oVar.h(f30.a.class).b();
                    }
                    r33.P((f30.a) this.I.c(aVar));
                    break;
                case 1:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.L2 = (String) this.V.c(aVar);
                    boolean[] zArr = r33.f37101h3;
                    if (zArr.length <= 193) {
                        break;
                    } else {
                        zArr[193] = true;
                        break;
                    }
                case 2:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.x1((String) this.V.c(aVar));
                    break;
                case 3:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.f37089f1 = (Boolean) this.f37940i.c(aVar);
                    boolean[] zArr2 = r33.f37101h3;
                    if (zArr2.length <= 109) {
                        break;
                    } else {
                        zArr2[109] = true;
                        break;
                    }
                case 4:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.f37138r = (String) this.V.c(aVar);
                    boolean[] zArr3 = r33.f37101h3;
                    if (zArr3.length <= 17) {
                        break;
                    } else {
                        zArr3[17] = true;
                        break;
                    }
                case 5:
                    if (this.f37949r == null) {
                        this.f37949r = oVar.h(Integer.class).b();
                    }
                    r33.U1((Integer) this.f37949r.c(aVar));
                    break;
                case 6:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.d1((Boolean) this.f37940i.c(aVar));
                    break;
                case 7:
                    if (this.A == null) {
                        this.A = oVar.g(new TypeToken<List<wy0>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$39
                        }).b();
                    }
                    r33.V1((List) this.A.c(aVar));
                    break;
                case '\b':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.w0((Boolean) this.f37940i.c(aVar));
                    break;
                case '\t':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.f37066a2 = (Boolean) this.f37940i.c(aVar);
                    boolean[] zArr4 = r33.f37101h3;
                    if (zArr4.length <= 156) {
                        break;
                    } else {
                        zArr4[156] = true;
                        break;
                    }
                case '\n':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.Z1 = (Boolean) this.f37940i.c(aVar);
                    boolean[] zArr5 = r33.f37101h3;
                    if (zArr5.length <= 155) {
                        break;
                    } else {
                        zArr5[155] = true;
                        break;
                    }
                case 11:
                    if (this.U == null) {
                        this.U = oVar.h(dl0.class).b();
                    }
                    r33.m2((dl0) this.U.c(aVar));
                    break;
                case '\f':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.s0((Boolean) this.f37940i.c(aVar));
                    break;
                case '\r':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.u0((Boolean) this.f37940i.c(aVar));
                    break;
                case 14:
                    if (this.X == null) {
                        this.X = oVar.h(wy0.class).b();
                    }
                    r33.u((wy0) this.X.c(aVar));
                    break;
                case 15:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.l1((Boolean) this.f37940i.c(aVar));
                    break;
                case 16:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.W1 = (Boolean) this.f37940i.c(aVar);
                    boolean[] zArr6 = r33.f37101h3;
                    if (zArr6.length <= 152) {
                        break;
                    } else {
                        zArr6[152] = true;
                        break;
                    }
                case 17:
                    if (this.f37937f == null) {
                        this.f37937f = oVar.h(v7.class).b();
                    }
                    r33.C1((v7) this.f37937f.c(aVar));
                    break;
                case 18:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.V0((Boolean) this.f37940i.c(aVar));
                    break;
                case 19:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.M((String) this.V.c(aVar));
                    break;
                case 20:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.j1((Boolean) this.f37940i.c(aVar));
                    break;
                case 21:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.P0((Boolean) this.f37940i.c(aVar));
                    break;
                case 22:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.O((Boolean) this.f37940i.c(aVar));
                    break;
                case 23:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.N0((Boolean) this.f37940i.c(aVar));
                    break;
                case 24:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.U0((Boolean) this.f37940i.c(aVar));
                    break;
                case 25:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.t0((Boolean) this.f37940i.c(aVar));
                    break;
                case 26:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.g((String) this.V.c(aVar));
                    break;
                case 27:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.W((Boolean) this.f37940i.c(aVar));
                    break;
                case 28:
                    if (this.C == null) {
                        this.C = oVar.g(new TypeToken<Map<String, bg>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$23
                        }).b();
                    }
                    r33.F((Map) this.C.c(aVar));
                    break;
                case 29:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.w1((String) this.V.c(aVar));
                    break;
                case 30:
                    if (this.W == null) {
                        this.W = oVar.h(dw0.class).b();
                    }
                    r33.r2((dw0) this.W.c(aVar));
                    break;
                case 31:
                    if (this.f37948q == null) {
                        this.f37948q = oVar.h(or.class).b();
                    }
                    r33.g0((or) this.f37948q.c(aVar));
                    break;
                case ' ':
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.u2((String) this.V.c(aVar));
                    break;
                case '!':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.f1((Boolean) this.f37940i.c(aVar));
                    break;
                case '\"':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.i1((Boolean) this.f37940i.c(aVar));
                    break;
                case '#':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.c1((Boolean) this.f37940i.c(aVar));
                    break;
                case '$':
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.R((String) this.V.c(aVar));
                    break;
                case '%':
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.s1((String) this.V.c(aVar));
                    break;
                case '&':
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.q((String) this.V.c(aVar));
                    break;
                case '\'':
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.w((String) this.V.c(aVar));
                    break;
                case '(':
                    if (this.f37949r == null) {
                        this.f37949r = oVar.h(Integer.class).b();
                    }
                    r33.o2((Integer) this.f37949r.c(aVar));
                    break;
                case ')':
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.j((String) this.V.c(aVar));
                    break;
                case '*':
                    if (this.Y == null) {
                        this.Y = oVar.h(pz0.class).b();
                    }
                    r33.p1((pz0) this.Y.c(aVar));
                    break;
                case '+':
                    if (this.B == null) {
                        this.B = oVar.g(new TypeToken<List<q11>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$44
                        }).b();
                    }
                    r33.I2((List) this.B.c(aVar));
                    break;
                case ',':
                    if (this.D == null) {
                        this.D = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$34
                        }).b();
                    }
                    r33.j0((Map) this.D.c(aVar));
                    break;
                case '-':
                    if (this.f37951t == null) {
                        this.f37951t = oVar.g(new TypeToken<List<sg>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$24
                        }).b();
                    }
                    r33.I((List) this.f37951t.c(aVar));
                    break;
                case '.':
                    if (this.f37932b == null) {
                        this.f37932b = oVar.h(g.class).b();
                    }
                    r33.f37078d = (g) this.f37932b.c(aVar);
                    boolean[] zArr7 = r33.f37101h3;
                    if (zArr7.length <= 3) {
                        break;
                    } else {
                        zArr7[3] = true;
                        break;
                    }
                case '/':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.q0((Boolean) this.f37940i.c(aVar));
                    break;
                case '0':
                    if (this.O == null) {
                        this.O = oVar.h(oc0.class).b();
                    }
                    r33.T1((oc0) this.O.c(aVar));
                    break;
                case '1':
                    if (this.f37949r == null) {
                        this.f37949r = oVar.h(Integer.class).b();
                    }
                    r33.D = (Integer) this.f37949r.c(aVar);
                    boolean[] zArr8 = r33.f37101h3;
                    if (zArr8.length <= 29) {
                        break;
                    } else {
                        zArr8[29] = true;
                        break;
                    }
                case '2':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.I0((Boolean) this.f37940i.c(aVar));
                    break;
                case '3':
                    if (this.f37949r == null) {
                        this.f37949r = oVar.h(Integer.class).b();
                    }
                    r33.N((Integer) this.f37949r.c(aVar));
                    break;
                case '4':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.m0((Boolean) this.f37940i.c(aVar));
                    break;
                case '5':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.k1((Boolean) this.f37940i.c(aVar));
                    break;
                case '6':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.L0((Boolean) this.f37940i.c(aVar));
                    break;
                case '7':
                    if (this.X == null) {
                        this.X = oVar.h(wy0.class).b();
                    }
                    r33.f37117l2 = (wy0) this.X.c(aVar);
                    boolean[] zArr9 = r33.f37101h3;
                    if (zArr9.length <= 167) {
                        break;
                    } else {
                        zArr9[167] = true;
                        break;
                    }
                case '8':
                    if (this.X == null) {
                        this.X = oVar.h(wy0.class).b();
                    }
                    r33.E1((wy0) this.X.c(aVar));
                    break;
                case '9':
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.k((String) this.V.c(aVar));
                    break;
                case ':':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.Z0((Boolean) this.f37940i.c(aVar));
                    break;
                case ';':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.v0((Boolean) this.f37940i.c(aVar));
                    break;
                case '<':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.o0((Boolean) this.f37940i.c(aVar));
                    break;
                case '=':
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.n((String) this.V.c(aVar));
                    break;
                case '>':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.W0((Boolean) this.f37940i.c(aVar));
                    break;
                case '?':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.p0((Boolean) this.f37940i.c(aVar));
                    break;
                case '@':
                    if (this.Z == null) {
                        this.Z = oVar.h(b01.class).b();
                    }
                    r33.F2((b01) this.Z.c(aVar));
                    break;
                case 'A':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.y0((Boolean) this.f37940i.c(aVar));
                    break;
                case 'B':
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.C((String) this.V.c(aVar));
                    break;
                case 'C':
                    if (this.f37949r == null) {
                        this.f37949r = oVar.h(Integer.class).b();
                    }
                    r33.Q1((Integer) this.f37949r.c(aVar));
                    break;
                case 'D':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.a1((Boolean) this.f37940i.c(aVar));
                    break;
                case 'E':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.M0((Boolean) this.f37940i.c(aVar));
                    break;
                case 'F':
                    if (this.f37931a0 == null) {
                        this.f37931a0 = oVar.h(o01.class).b();
                    }
                    r33.E2((o01) this.f37931a0.c(aVar));
                    break;
                case 'G':
                    if (this.f37952u == null) {
                        this.f37952u = oVar.g(new TypeToken<List<ym>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$30
                        }).b();
                    }
                    r33.Y((List) this.f37952u.c(aVar));
                    break;
                case 'H':
                    if (this.f37950s == null) {
                        this.f37950s = oVar.h(zs.class).b();
                    }
                    r33.k2((zs) this.f37950s.c(aVar));
                    break;
                case 'I':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.R0((Boolean) this.f37940i.c(aVar));
                    break;
                case 'J':
                    if (this.f37945n == null) {
                        this.f37945n = oVar.h(Double.class).b();
                    }
                    r33.E((Double) this.f37945n.c(aVar));
                    break;
                case 'K':
                    if (this.f37956y == null) {
                        this.f37956y = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$28
                        }).b();
                    }
                    r33.S((List) this.f37956y.c(aVar));
                    break;
                case 'L':
                    if (this.f37949r == null) {
                        this.f37949r = oVar.h(Integer.class).b();
                    }
                    r33.G((Integer) this.f37949r.c(aVar));
                    break;
                case 'M':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.O0((Boolean) this.f37940i.c(aVar));
                    break;
                case 'N':
                    if (this.X == null) {
                        this.X = oVar.h(wy0.class).b();
                    }
                    r33.u1((wy0) this.X.c(aVar));
                    break;
                case 'O':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.Z = (Boolean) this.f37940i.c(aVar);
                    boolean[] zArr10 = r33.f37101h3;
                    if (zArr10.length <= 51) {
                        break;
                    } else {
                        zArr10[51] = true;
                        break;
                    }
                case 'P':
                    if (this.f37949r == null) {
                        this.f37949r = oVar.h(Integer.class).b();
                    }
                    r33.V((Integer) this.f37949r.c(aVar));
                    break;
                case 'Q':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.f2((Boolean) this.f37940i.c(aVar));
                    break;
                case 'R':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.T0((Boolean) this.f37940i.c(aVar));
                    break;
                case 'S':
                    if (this.f37949r == null) {
                        this.f37949r = oVar.h(Integer.class).b();
                    }
                    r33.f37064a0 = (Integer) this.f37949r.c(aVar);
                    boolean[] zArr11 = r33.f37101h3;
                    if (zArr11.length <= 52) {
                        break;
                    } else {
                        zArr11[52] = true;
                        break;
                    }
                case 'T':
                    if (this.L == null) {
                        this.L = oVar.h(w40.class).b();
                    }
                    r33.A1((w40) this.L.c(aVar));
                    break;
                case 'U':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.f37085e2 = (Boolean) this.f37940i.c(aVar);
                    boolean[] zArr12 = r33.f37101h3;
                    if (zArr12.length <= 160) {
                        break;
                    } else {
                        zArr12[160] = true;
                        break;
                    }
                case 'V':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.G0((Boolean) this.f37940i.c(aVar));
                    break;
                case 'W':
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.A((String) this.V.c(aVar));
                    break;
                case 'X':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.H0((Boolean) this.f37940i.c(aVar));
                    break;
                case 'Y':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.f37090f2 = (Boolean) this.f37940i.c(aVar);
                    boolean[] zArr13 = r33.f37101h3;
                    if (zArr13.length <= 161) {
                        break;
                    } else {
                        zArr13[161] = true;
                        break;
                    }
                case 'Z':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.e1((Boolean) this.f37940i.c(aVar));
                    break;
                case '[':
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.H1((String) this.V.c(aVar));
                    break;
                case '\\':
                    if (this.f37936e == null) {
                        this.f37936e = oVar.h(x6.class).b();
                    }
                    r33.i((x6) this.f37936e.c(aVar));
                    break;
                case ']':
                    if (this.f37943l == null) {
                        this.f37943l = oVar.h(Date.class).b();
                    }
                    r33.z2((Date) this.f37943l.c(aVar));
                    break;
                case '^':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.D0((Boolean) this.f37940i.c(aVar));
                    break;
                case '_':
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.e2((Boolean) this.f37940i.c(aVar));
                    break;
                case '`':
                    if (this.H == null) {
                        this.H = oVar.h(nx.class).b();
                    }
                    r33.v1((nx) this.H.c(aVar));
                    break;
                case 'a':
                    if (this.f37946o == null) {
                        this.f37946o = oVar.h(em.class).b();
                    }
                    r33.X((em) this.f37946o.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_VIDEO_CREATOR_ANALYTICS_MODULE /* 98 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.B1((String) this.V.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NOTE_AND_FAVORITE_MODULE /* 99 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.f((String) this.V.c(aVar));
                    break;
                case 'd':
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.v2((String) this.V.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE /* 101 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.X1((String) this.V.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE /* 102 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.n2((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE /* 103 */:
                    if (this.f37956y == null) {
                        this.f37956y = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$33
                        }).b();
                    }
                    r33.f0((List) this.f37956y.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE /* 104 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.x2((String) this.V.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE /* 105 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.n1((String) this.V.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID /* 106 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.w2((String) this.V.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER /* 107 */:
                    if (this.f37949r == null) {
                        this.f37949r = oVar.h(Integer.class).b();
                    }
                    r33.D2((Integer) this.f37949r.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE /* 108 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.l0((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL /* 109 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.c0((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL /* 110 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.t((String) this.V.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE /* 111 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.x0((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER /* 112 */:
                    if (this.f37937f == null) {
                        this.f37937f = oVar.h(v7.class).b();
                    }
                    r33.l((v7) this.f37937f.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL /* 113 */:
                    if (this.f37947p == null) {
                        this.f37947p = oVar.h(gn.class).b();
                    }
                    r33.U((gn) this.f37947p.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER /* 114 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.q2((String) this.V.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE /* 115 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.r0((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW /* 116 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.K0((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN /* 117 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.f37108j1 = (Boolean) this.f37940i.c(aVar);
                    boolean[] zArr14 = r33.f37101h3;
                    if (zArr14.length <= 113) {
                        break;
                    } else {
                        zArr14[113] = true;
                        break;
                    }
                case RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL /* 118 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.X0((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL /* 119 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.g1((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL /* 120 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.b0((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL /* 121 */:
                    if (this.f37956y == null) {
                        this.f37956y = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$31
                        }).b();
                    }
                    r33.d0((List) this.f37956y.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN /* 122 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.N1((String) this.V.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL /* 123 */:
                    if (this.K == null) {
                        this.K = oVar.h(f30.c.class).b();
                    }
                    r33.q1((f30.c) this.K.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER /* 124 */:
                    if (this.f37949r == null) {
                        this.f37949r = oVar.h(Integer.class).b();
                    }
                    r33.c2((Integer) this.f37949r.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED /* 125 */:
                    if (this.X == null) {
                        this.X = oVar.h(wy0.class).b();
                    }
                    r33.y1((wy0) this.X.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL /* 126 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.B0((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK /* 127 */:
                    if (this.f37942k == null) {
                        this.f37942k = oVar.h(md.class).b();
                    }
                    r33.C = (md) this.f37942k.c(aVar);
                    boolean[] zArr15 = r33.f37101h3;
                    if (zArr15.length <= 28) {
                        break;
                    } else {
                        zArr15[28] = true;
                        break;
                    }
                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN /* 128 */:
                    if (this.f37955x == null) {
                        this.f37955x = oVar.g(new TypeToken<List<p20>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$42
                        }).b();
                    }
                    r33.j2((List) this.f37955x.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS /* 129 */:
                    if (this.f37949r == null) {
                        this.f37949r = oVar.h(Integer.class).b();
                    }
                    r33.s2((Integer) this.f37949r.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN /* 130 */:
                    if (this.S == null) {
                        this.S = oVar.h(hi0.class).b();
                    }
                    r33.i2((hi0) this.S.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL /* 131 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.g2((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_FEED_SECTION_TITLE /* 132 */:
                    if (this.f37949r == null) {
                        this.f37949r = oVar.h(Integer.class).b();
                    }
                    r33.a2((Integer) this.f37949r.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_PIN_CAROUSEL /* 133 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.p((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_PIN_MINI_CELL /* 134 */:
                    if (this.f37953v == null) {
                        this.f37953v = oVar.g(new TypeToken<List<Integer>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$41
                        }).b();
                    }
                    r33.b2((List) this.f37953v.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL /* 135 */:
                    if (this.P == null) {
                        this.P = oVar.h(oe0.class).b();
                    }
                    r33.W1((oe0) this.P.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL /* 136 */:
                    if (this.f37949r == null) {
                        this.f37949r = oVar.h(Integer.class).b();
                    }
                    r33.R1((Integer) this.f37949r.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_IMAGE /* 137 */:
                    if (this.C == null) {
                        this.C = oVar.g(new TypeToken<Map<String, bg>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$37
                        }).b();
                    }
                    r33.P1((Map) this.C.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL /* 138 */:
                    if (this.M == null) {
                        this.M = oVar.h(n90.class).b();
                    }
                    r33.f37100h2 = (n90) this.M.c(aVar);
                    boolean[] zArr16 = r33.f37101h3;
                    if (zArr16.length <= 163) {
                        break;
                    } else {
                        zArr16[163] = true;
                        break;
                    }
                case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM /* 139 */:
                    if (this.f37929J == null) {
                        this.f37929J = oVar.h(f30.b.class).b();
                    }
                    r33.a0((f30.b) this.f37929J.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ACTION_ITEM /* 140 */:
                    if (this.f37949r == null) {
                        this.f37949r = oVar.h(Integer.class).b();
                    }
                    r33.d((Integer) this.f37949r.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM_HIDDEN /* 141 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.z((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL /* 142 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.M1((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_IMAGE /* 143 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.z0((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM /* 144 */:
                    if (this.f37951t == null) {
                        this.f37951t = oVar.g(new TypeToken<List<sg>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$25
                        }).b();
                    }
                    r33.J((List) this.f37951t.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM_TINTED /* 145 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.i0((String) this.V.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_VIDEO /* 146 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.L1((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY /* 147 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.C0((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_SHOPPING_BUBBLES_PACKAGE_GRID_MODULE /* 148 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.S0((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_SHOPPING_BRAND_PACKAGE_GRID_MODULE /* 149 */:
                    if (this.X == null) {
                        this.X = oVar.h(wy0.class).b();
                    }
                    r33.C2((wy0) this.X.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY /* 150 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.b1((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIFIED_FILTER_MULTI_SELECT_ITEM /* 151 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.H((String) this.V.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRICE_FILTER_ITEM /* 152 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.B2((String) this.V.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_STANDARD_FILTER_ITEM /* 153 */:
                    if (this.f37935d == null) {
                        this.f37935d = oVar.h(f3.class).b();
                    }
                    r33.h((f3) this.f37935d.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRODUCT_FILTER_HEADER /* 154 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.A0((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_FILTER /* 155 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.h0((String) this.V.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY_FILTER_ITEM /* 156 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.Q0((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_SHOPPING_SORT_FILTER /* 157 */:
                    if (this.f37951t == null) {
                        this.f37951t = oVar.g(new TypeToken<List<sg>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$26
                        }).b();
                    }
                    r33.K((List) this.f37951t.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_STELA_IN_FLASHLIGHT_ONE_COLUMN /* 158 */:
                    if (this.f37957z == null) {
                        this.f37957z = oVar.g(new TypeToken<List<ts0>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$43
                        }).b();
                    }
                    r33.A2((List) this.f37957z.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_EDUCATION_HEADER /* 159 */:
                    if (this.f37945n == null) {
                        this.f37945n = oVar.h(Double.class).b();
                    }
                    r33.c((Double) this.f37945n.c(aVar));
                    break;
                case 160:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.Y0((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_PLACEHOLDER /* 161 */:
                    if (this.T == null) {
                        this.T = oVar.h(rj0.class).b();
                    }
                    r33.l2((rj0) this.T.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_FULL_SPAN_PLACEHOLDER /* 162 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.Q((String) this.V.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM /* 163 */:
                    if (this.f37934c == null) {
                        this.f37934c = oVar.h(l0.class).b();
                    }
                    r33.e((l0) this.f37934c.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_LOADING /* 164 */:
                    if (this.G == null) {
                        this.G = oVar.h(ou.class).b();
                    }
                    r33.r1((ou) this.G.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_CLEAR /* 165 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.f37103i0 = (String) this.V.c(aVar);
                    boolean[] zArr17 = r33.f37101h3;
                    if (zArr17.length <= 60) {
                        break;
                    } else {
                        zArr17[60] = true;
                        break;
                    }
                case RecyclerViewTypes.VIEW_TYPE_LEGO_EMPTY_STATE_MESSAGE /* 166 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.v((String) this.V.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TRY_ON_FEED_PRODUCT_CARD /* 167 */:
                    if (this.f37933b0 == null) {
                        this.f37933b0 = oVar.h(s01.class).b();
                    }
                    r33.G2((s01) this.f37933b0.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_USER_PIN_REACTION /* 168 */:
                    if (this.f37949r == null) {
                        this.f37949r = oVar.h(Integer.class).b();
                    }
                    r33.H2((Integer) this.f37949r.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_SHOPPING_SPOTLIGHT /* 169 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.E0((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE /* 170 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.Z((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO /* 171 */:
                    if (this.f37938g == null) {
                        this.f37938g = oVar.h(z7.class).b();
                    }
                    r33.m((z7) this.f37938g.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE /* 172 */:
                    if (this.f37956y == null) {
                        this.f37956y = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$29
                        }).b();
                    }
                    r33.T((List) this.f37956y.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO /* 173 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.f37082e = (String) this.V.c(aVar);
                    boolean[] zArr18 = r33.f37101h3;
                    if (zArr18.length <= 4) {
                        break;
                    } else {
                        zArr18[4] = true;
                        break;
                    }
                case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE_FULL_SPAN /* 174 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.D1((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO_FULL_SPAN /* 175 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.F1((String) this.V.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE_FULL_SPAN /* 176 */:
                    if (this.Q == null) {
                        this.Q = oVar.h(se0.class).b();
                    }
                    r33.f37153u2 = (se0) this.Q.c(aVar);
                    boolean[] zArr19 = r33.f37101h3;
                    if (zArr19.length <= 176) {
                        break;
                    } else {
                        zArr19[176] = true;
                        break;
                    }
                case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO_FULL_SPAN /* 177 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.K1((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD /* 178 */:
                    if (this.f37943l == null) {
                        this.f37943l = oVar.h(Date.class).b();
                    }
                    r33.D((Date) this.f37943l.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD_FULL_SPAN /* 179 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.k0((String) this.V.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP /* 180 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.d2 = (Boolean) this.f37940i.c(aVar);
                    boolean[] zArr20 = r33.f37101h3;
                    if (zArr20.length <= 159) {
                        break;
                    } else {
                        zArr20[159] = true;
                        break;
                    }
                case RecyclerViewTypes.VIEW_TYPE_BUBBLE_NAVIGATION_REP /* 181 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.F0((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_BUBBLE_DEFAULT_REP /* 182 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.I1((String) this.V.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_BUBBLE_STYLE_REP /* 183 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.n0((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_IMAGE_REP /* 184 */:
                    if (this.N == null) {
                        this.N = oVar.h(z90.class).b();
                    }
                    r33.f37113k2 = (z90) this.N.c(aVar);
                    boolean[] zArr21 = r33.f37101h3;
                    if (zArr21.length <= 166) {
                        break;
                    } else {
                        zArr21[166] = true;
                        break;
                    }
                case RecyclerViewTypes.VIEW_TYPE_BUBBLE_IMAGE_GRID_REP /* 185 */:
                    if (this.f37954w == null) {
                        this.f37954w = oVar.g(new TypeToken<List<hx>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$35
                        }).b();
                    }
                    r33.t1((List) this.f37954w.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_TOPIC_TILE /* 186 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.X1 = (Boolean) this.f37940i.c(aVar);
                    boolean[] zArr22 = r33.f37101h3;
                    if (zArr22.length <= 153) {
                        break;
                    } else {
                        zArr22[153] = true;
                        break;
                    }
                case RecyclerViewTypes.VIEW_TYPE_BUBBLE_EDITORIAL_CARD /* 187 */:
                    if (this.E == null) {
                        this.E = oVar.g(new TypeToken<Map<String, Integer>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$38
                        }).b();
                    }
                    r33.S1((Map) this.E.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_IMAGE_EDITORIAL_CARD /* 188 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.r((String) this.V.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_BUBBLE_IMAGE_WITH_TITLE_OVERLAY /* 189 */:
                    if (this.f37955x == null) {
                        this.f37955x = oVar.g(new TypeToken<List<p20>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$36
                        }).b();
                    }
                    r33.z1((List) this.f37955x.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ICON_AND_TEXT_INLINE_BUBBLE /* 190 */:
                    if (this.f37949r == null) {
                        this.f37949r = oVar.h(Integer.class).b();
                    }
                    r33.t2((Integer) this.f37949r.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_LENS_PHOTO /* 191 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.y2((String) this.V.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY /* 192 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.Y = (String) this.V.c(aVar);
                    boolean[] zArr23 = r33.f37101h3;
                    if (zArr23.length <= 50) {
                        break;
                    } else {
                        zArr23[50] = true;
                        break;
                    }
                case RecyclerViewTypes.VIEW_TYPE_LENS_HISTORY /* 193 */:
                    if (this.X == null) {
                        this.X = oVar.h(wy0.class).b();
                    }
                    r33.p2((wy0) this.X.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_OVERSCROLL_SEARCH_CELL /* 194 */:
                    if (this.f37951t == null) {
                        this.f37951t = oVar.g(new TypeToken<List<sg>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$27
                        }).b();
                    }
                    r33.L((List) this.f37951t.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_USER /* 195 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.o((String) this.V.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_SHOP_THE_LOOK_CLOSEUP_MODULE /* 196 */:
                    if (this.f37941j == null) {
                        this.f37941j = oVar.h(cc.class).b();
                    }
                    r33.s((cc) this.f37941j.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_HERO /* 197 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.x((String) this.V.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_THREE_PINS_COLLECTION /* 198 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.J0((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_VIDEO /* 199 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.O1((String) this.V.c(aVar));
                    break;
                case 200:
                    if (this.f37945n == null) {
                        this.f37945n = oVar.h(Double.class).b();
                    }
                    r33.G1((Double) this.f37945n.c(aVar));
                    break;
                case 201:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.h1((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_STORY_PIN /* 202 */:
                    if (this.f37956y == null) {
                        this.f37956y = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$32
                        }).b();
                    }
                    r33.e0((List) this.f37956y.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_CUSTOM_COVER /* 203 */:
                    if (this.f37939h == null) {
                        this.f37939h = oVar.h(ba.class).b();
                    }
                    r33.Z1((ba) this.f37939h.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_CREATOR /* 204 */:
                    if (this.f37944m == null) {
                        this.f37944m = oVar.h(hh.class).b();
                    }
                    r33.o1((hh) this.f37944m.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_HEADER /* 205 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.R0 = (Boolean) this.f37940i.c(aVar);
                    boolean[] zArr24 = r33.f37101h3;
                    if (zArr24.length <= 95) {
                        break;
                    } else {
                        zArr24[95] = true;
                        break;
                    }
                case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_FOOTER /* 206 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.d2((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_FEED_FOOTER /* 207 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.y((String) this.V.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_SECTION /* 208 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.f37110k = (String) this.V.c(aVar);
                    boolean[] zArr25 = r33.f37101h3;
                    if (zArr25.length <= 10) {
                        break;
                    } else {
                        zArr25[10] = true;
                        break;
                    }
                case RecyclerViewTypes.VIEW_TYPE_TODAY_ARTICLE_BOARD_SECTION_HEADER /* 209 */:
                    if (this.f37940i == null) {
                        this.f37940i = oVar.h(Boolean.class).b();
                    }
                    r33.J1((Boolean) this.f37940i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_RELATED_ARTICLES_HEADER /* 210 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.B((String) this.V.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_GO_TO_HOME_FEED_FOOTER /* 211 */:
                    if (this.R == null) {
                        this.R = oVar.h(fi0.class).b();
                    }
                    r33.h2((fi0) this.R.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_SIMPLE_ACTION_STORY /* 212 */:
                    if (this.F == null) {
                        this.F = oVar.g(new TypeToken<Map<String, ig0>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$40
                        }).b();
                    }
                    r33.Y1((Map) this.F.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_CONVERSATION_GIF_REACTION /* 213 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.f37068b = (String) this.V.c(aVar);
                    boolean[] zArr26 = r33.f37101h3;
                    if (zArr26.length <= 1) {
                        break;
                    } else {
                        zArr26[1] = true;
                        break;
                    }
                case RecyclerViewTypes.VIEW_TYPE_INBOX_HEADER /* 214 */:
                    if (this.V == null) {
                        this.V = oVar.h(String.class).b();
                    }
                    r33.m1((String) this.V.c(aVar));
                    break;
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return r33.a();
    }

    @Override // nm.i0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void e(um.c cVar, f30 f30Var) {
        boolean[] zArr;
        boolean[] zArr2;
        boolean[] zArr3;
        boolean[] zArr4;
        boolean[] zArr5;
        boolean[] zArr6;
        boolean[] zArr7;
        boolean[] zArr8;
        boolean[] zArr9;
        boolean[] zArr10;
        boolean[] zArr11;
        boolean[] zArr12;
        boolean[] zArr13;
        boolean[] zArr14;
        boolean[] zArr15;
        boolean[] zArr16;
        boolean[] zArr17;
        boolean[] zArr18;
        boolean[] zArr19;
        boolean[] zArr20;
        boolean[] zArr21;
        boolean[] zArr22;
        boolean[] zArr23;
        boolean[] zArr24;
        boolean[] zArr25;
        boolean[] zArr26;
        boolean[] zArr27;
        boolean[] zArr28;
        boolean[] zArr29;
        boolean[] zArr30;
        boolean[] zArr31;
        boolean[] zArr32;
        boolean[] zArr33;
        boolean[] zArr34;
        boolean[] zArr35;
        boolean[] zArr36;
        boolean[] zArr37;
        boolean[] zArr38;
        boolean[] zArr39;
        boolean[] zArr40;
        boolean[] zArr41;
        boolean[] zArr42;
        boolean[] zArr43;
        boolean[] zArr44;
        boolean[] zArr45;
        boolean[] zArr46;
        boolean[] zArr47;
        boolean[] zArr48;
        boolean[] zArr49;
        boolean[] zArr50;
        boolean[] zArr51;
        boolean[] zArr52;
        boolean[] zArr53;
        boolean[] zArr54;
        boolean[] zArr55;
        boolean[] zArr56;
        boolean[] zArr57;
        boolean[] zArr58;
        boolean[] zArr59;
        boolean[] zArr60;
        boolean[] zArr61;
        boolean[] zArr62;
        boolean[] zArr63;
        boolean[] zArr64;
        boolean[] zArr65;
        boolean[] zArr66;
        boolean[] zArr67;
        boolean[] zArr68;
        boolean[] zArr69;
        boolean[] zArr70;
        boolean[] zArr71;
        boolean[] zArr72;
        boolean[] zArr73;
        boolean[] zArr74;
        boolean[] zArr75;
        boolean[] zArr76;
        boolean[] zArr77;
        boolean[] zArr78;
        boolean[] zArr79;
        boolean[] zArr80;
        boolean[] zArr81;
        boolean[] zArr82;
        boolean[] zArr83;
        boolean[] zArr84;
        boolean[] zArr85;
        boolean[] zArr86;
        boolean[] zArr87;
        boolean[] zArr88;
        boolean[] zArr89;
        boolean[] zArr90;
        boolean[] zArr91;
        boolean[] zArr92;
        boolean[] zArr93;
        boolean[] zArr94;
        boolean[] zArr95;
        boolean[] zArr96;
        boolean[] zArr97;
        boolean[] zArr98;
        boolean[] zArr99;
        boolean[] zArr100;
        boolean[] zArr101;
        boolean[] zArr102;
        boolean[] zArr103;
        boolean[] zArr104;
        boolean[] zArr105;
        boolean[] zArr106;
        boolean[] zArr107;
        boolean[] zArr108;
        boolean[] zArr109;
        boolean[] zArr110;
        boolean[] zArr111;
        boolean[] zArr112;
        boolean[] zArr113;
        boolean[] zArr114;
        boolean[] zArr115;
        boolean[] zArr116;
        boolean[] zArr117;
        boolean[] zArr118;
        boolean[] zArr119;
        boolean[] zArr120;
        boolean[] zArr121;
        boolean[] zArr122;
        boolean[] zArr123;
        boolean[] zArr124;
        boolean[] zArr125;
        boolean[] zArr126;
        boolean[] zArr127;
        boolean[] zArr128;
        boolean[] zArr129;
        boolean[] zArr130;
        boolean[] zArr131;
        boolean[] zArr132;
        boolean[] zArr133;
        boolean[] zArr134;
        boolean[] zArr135;
        boolean[] zArr136;
        boolean[] zArr137;
        boolean[] zArr138;
        boolean[] zArr139;
        boolean[] zArr140;
        boolean[] zArr141;
        boolean[] zArr142;
        boolean[] zArr143;
        boolean[] zArr144;
        boolean[] zArr145;
        boolean[] zArr146;
        boolean[] zArr147;
        boolean[] zArr148;
        boolean[] zArr149;
        boolean[] zArr150;
        boolean[] zArr151;
        boolean[] zArr152;
        boolean[] zArr153;
        boolean[] zArr154;
        boolean[] zArr155;
        boolean[] zArr156;
        boolean[] zArr157;
        boolean[] zArr158;
        boolean[] zArr159;
        boolean[] zArr160;
        boolean[] zArr161;
        boolean[] zArr162;
        boolean[] zArr163;
        boolean[] zArr164;
        boolean[] zArr165;
        boolean[] zArr166;
        boolean[] zArr167;
        boolean[] zArr168;
        boolean[] zArr169;
        boolean[] zArr170;
        boolean[] zArr171;
        boolean[] zArr172;
        boolean[] zArr173;
        boolean[] zArr174;
        boolean[] zArr175;
        boolean[] zArr176;
        boolean[] zArr177;
        boolean[] zArr178;
        boolean[] zArr179;
        boolean[] zArr180;
        boolean[] zArr181;
        boolean[] zArr182;
        boolean[] zArr183;
        boolean[] zArr184;
        boolean[] zArr185;
        boolean[] zArr186;
        boolean[] zArr187;
        boolean[] zArr188;
        boolean[] zArr189;
        boolean[] zArr190;
        boolean[] zArr191;
        boolean[] zArr192;
        boolean[] zArr193;
        boolean[] zArr194;
        boolean[] zArr195;
        boolean[] zArr196;
        boolean[] zArr197;
        boolean[] zArr198;
        boolean[] zArr199;
        boolean[] zArr200;
        boolean[] zArr201;
        boolean[] zArr202;
        boolean[] zArr203;
        boolean[] zArr204;
        boolean[] zArr205;
        boolean[] zArr206;
        boolean[] zArr207;
        boolean[] zArr208;
        boolean[] zArr209;
        boolean[] zArr210;
        boolean[] zArr211;
        boolean[] zArr212;
        boolean[] zArr213;
        boolean[] zArr214;
        boolean[] zArr215;
        boolean[] zArr216;
        List list;
        boolean[] zArr217;
        Integer num;
        boolean[] zArr218;
        s01 s01Var;
        boolean[] zArr219;
        b01 b01Var;
        boolean[] zArr220;
        o01 o01Var;
        boolean[] zArr221;
        Integer num2;
        boolean[] zArr222;
        wy0 wy0Var;
        boolean[] zArr223;
        String str;
        boolean[] zArr224;
        List list2;
        boolean[] zArr225;
        Date date;
        boolean[] zArr226;
        String str2;
        boolean[] zArr227;
        String str3;
        boolean[] zArr228;
        String str4;
        boolean[] zArr229;
        String str5;
        boolean[] zArr230;
        Integer num3;
        boolean[] zArr231;
        Integer num4;
        boolean[] zArr232;
        dw0 dw0Var;
        boolean[] zArr233;
        String str6;
        boolean[] zArr234;
        wy0 wy0Var2;
        boolean[] zArr235;
        Integer num5;
        boolean[] zArr236;
        Boolean bool;
        boolean[] zArr237;
        String str7;
        boolean[] zArr238;
        dl0 dl0Var;
        boolean[] zArr239;
        rj0 rj0Var;
        boolean[] zArr240;
        zs zsVar;
        boolean[] zArr241;
        List list3;
        boolean[] zArr242;
        hi0 hi0Var;
        boolean[] zArr243;
        fi0 fi0Var;
        boolean[] zArr244;
        Boolean bool2;
        boolean[] zArr245;
        Boolean bool3;
        boolean[] zArr246;
        Boolean bool4;
        boolean[] zArr247;
        Boolean bool5;
        boolean[] zArr248;
        Integer num6;
        boolean[] zArr249;
        List list4;
        boolean[] zArr250;
        Integer num7;
        boolean[] zArr251;
        ba baVar;
        boolean[] zArr252;
        Map map;
        boolean[] zArr253;
        String str8;
        boolean[] zArr254;
        se0 se0Var;
        boolean[] zArr255;
        oe0 oe0Var;
        boolean[] zArr256;
        List list5;
        boolean[] zArr257;
        Integer num8;
        boolean[] zArr258;
        oc0 oc0Var;
        boolean[] zArr259;
        Map map2;
        boolean[] zArr260;
        Integer num9;
        boolean[] zArr261;
        Integer num10;
        boolean[] zArr262;
        Map map3;
        boolean[] zArr263;
        wy0 wy0Var3;
        boolean[] zArr264;
        z90 z90Var;
        boolean[] zArr265;
        String str9;
        boolean[] zArr266;
        String str10;
        boolean[] zArr267;
        n90 n90Var;
        boolean[] zArr268;
        Boolean bool6;
        boolean[] zArr269;
        Boolean bool7;
        boolean[] zArr270;
        Boolean bool8;
        boolean[] zArr271;
        Boolean bool9;
        boolean[] zArr272;
        Boolean bool10;
        boolean[] zArr273;
        Boolean bool11;
        boolean[] zArr274;
        Boolean bool12;
        boolean[] zArr275;
        Boolean bool13;
        boolean[] zArr276;
        Boolean bool14;
        boolean[] zArr277;
        Boolean bool15;
        boolean[] zArr278;
        Boolean bool16;
        boolean[] zArr279;
        String str11;
        boolean[] zArr280;
        String str12;
        boolean[] zArr281;
        Double d2;
        boolean[] zArr282;
        String str13;
        boolean[] zArr283;
        wy0 wy0Var4;
        boolean[] zArr284;
        Boolean bool17;
        boolean[] zArr285;
        v7 v7Var;
        boolean[] zArr286;
        String str14;
        boolean[] zArr287;
        w40 w40Var;
        boolean[] zArr288;
        List list6;
        boolean[] zArr289;
        wy0 wy0Var5;
        boolean[] zArr290;
        String str15;
        boolean[] zArr291;
        String str16;
        boolean[] zArr292;
        nx nxVar;
        boolean[] zArr293;
        wy0 wy0Var6;
        boolean[] zArr294;
        List list7;
        boolean[] zArr295;
        String str17;
        boolean[] zArr296;
        ou ouVar;
        boolean[] zArr297;
        f30.c cVar2;
        boolean[] zArr298;
        pz0 pz0Var;
        boolean[] zArr299;
        hh hhVar;
        boolean[] zArr300;
        String str18;
        boolean[] zArr301;
        String str19;
        boolean[] zArr302;
        Boolean bool18;
        boolean[] zArr303;
        Boolean bool19;
        boolean[] zArr304;
        Boolean bool20;
        boolean[] zArr305;
        Boolean bool21;
        boolean[] zArr306;
        Boolean bool22;
        boolean[] zArr307;
        Boolean bool23;
        boolean[] zArr308;
        Boolean bool24;
        boolean[] zArr309;
        Boolean bool25;
        boolean[] zArr310;
        Boolean bool26;
        boolean[] zArr311;
        Boolean bool27;
        boolean[] zArr312;
        Boolean bool28;
        boolean[] zArr313;
        Boolean bool29;
        boolean[] zArr314;
        Boolean bool30;
        boolean[] zArr315;
        Boolean bool31;
        boolean[] zArr316;
        Boolean bool32;
        boolean[] zArr317;
        Boolean bool33;
        boolean[] zArr318;
        Boolean bool34;
        boolean[] zArr319;
        Boolean bool35;
        boolean[] zArr320;
        Boolean bool36;
        boolean[] zArr321;
        Boolean bool37;
        boolean[] zArr322;
        Boolean bool38;
        boolean[] zArr323;
        Boolean bool39;
        boolean[] zArr324;
        Boolean bool40;
        boolean[] zArr325;
        Boolean bool41;
        boolean[] zArr326;
        Boolean bool42;
        boolean[] zArr327;
        Boolean bool43;
        boolean[] zArr328;
        Boolean bool44;
        boolean[] zArr329;
        Boolean bool45;
        boolean[] zArr330;
        Boolean bool46;
        boolean[] zArr331;
        Boolean bool47;
        boolean[] zArr332;
        Boolean bool48;
        boolean[] zArr333;
        Boolean bool49;
        boolean[] zArr334;
        Boolean bool50;
        boolean[] zArr335;
        Boolean bool51;
        boolean[] zArr336;
        Boolean bool52;
        boolean[] zArr337;
        Boolean bool53;
        boolean[] zArr338;
        Boolean bool54;
        boolean[] zArr339;
        Boolean bool55;
        boolean[] zArr340;
        Boolean bool56;
        boolean[] zArr341;
        Boolean bool57;
        boolean[] zArr342;
        Boolean bool58;
        boolean[] zArr343;
        Boolean bool59;
        boolean[] zArr344;
        Boolean bool60;
        boolean[] zArr345;
        Boolean bool61;
        boolean[] zArr346;
        Boolean bool62;
        boolean[] zArr347;
        Boolean bool63;
        boolean[] zArr348;
        Boolean bool64;
        boolean[] zArr349;
        Boolean bool65;
        boolean[] zArr350;
        Boolean bool66;
        boolean[] zArr351;
        Boolean bool67;
        boolean[] zArr352;
        Boolean bool68;
        boolean[] zArr353;
        Boolean bool69;
        boolean[] zArr354;
        Boolean bool70;
        boolean[] zArr355;
        Boolean bool71;
        boolean[] zArr356;
        Boolean bool72;
        boolean[] zArr357;
        Boolean bool73;
        boolean[] zArr358;
        String str20;
        boolean[] zArr359;
        Map map4;
        boolean[] zArr360;
        String str21;
        boolean[] zArr361;
        String str22;
        boolean[] zArr362;
        or orVar;
        boolean[] zArr363;
        List list8;
        boolean[] zArr364;
        List list9;
        boolean[] zArr365;
        List list10;
        boolean[] zArr366;
        Boolean bool74;
        boolean[] zArr367;
        Boolean bool75;
        boolean[] zArr368;
        f30.b bVar;
        boolean[] zArr369;
        Boolean bool76;
        boolean[] zArr370;
        String str23;
        boolean[] zArr371;
        List list11;
        boolean[] zArr372;
        em emVar;
        boolean[] zArr373;
        Boolean bool77;
        boolean[] zArr374;
        Integer num11;
        boolean[] zArr375;
        gn gnVar;
        boolean[] zArr376;
        List list12;
        boolean[] zArr377;
        List list13;
        boolean[] zArr378;
        Integer num12;
        boolean[] zArr379;
        Boolean bool78;
        boolean[] zArr380;
        String str24;
        boolean[] zArr381;
        String str25;
        boolean[] zArr382;
        String str26;
        boolean[] zArr383;
        f30.a aVar;
        boolean[] zArr384;
        Boolean bool79;
        boolean[] zArr385;
        Integer num13;
        boolean[] zArr386;
        String str27;
        boolean[] zArr387;
        List list14;
        boolean[] zArr388;
        List list15;
        boolean[] zArr389;
        List list16;
        boolean[] zArr390;
        List list17;
        boolean[] zArr391;
        String str28;
        boolean[] zArr392;
        Integer num14;
        boolean[] zArr393;
        Map map5;
        boolean[] zArr394;
        Double d13;
        boolean[] zArr395;
        Date date2;
        boolean[] zArr396;
        String str29;
        boolean[] zArr397;
        String str30;
        boolean[] zArr398;
        String str31;
        boolean[] zArr399;
        Boolean bool80;
        boolean[] zArr400;
        String str32;
        boolean[] zArr401;
        Integer num15;
        boolean[] zArr402;
        md mdVar;
        boolean[] zArr403;
        String str33;
        boolean[] zArr404;
        String str34;
        boolean[] zArr405;
        String str35;
        boolean[] zArr406;
        wy0 wy0Var7;
        boolean[] zArr407;
        String str36;
        boolean[] zArr408;
        cc ccVar;
        boolean[] zArr409;
        String str37;
        boolean[] zArr410;
        String str38;
        boolean[] zArr411;
        Boolean bool81;
        boolean[] zArr412;
        String str39;
        boolean[] zArr413;
        String str40;
        boolean[] zArr414;
        String str41;
        boolean[] zArr415;
        z7 z7Var;
        boolean[] zArr416;
        v7 v7Var2;
        boolean[] zArr417;
        String str42;
        boolean[] zArr418;
        String str43;
        boolean[] zArr419;
        x6 x6Var;
        boolean[] zArr420;
        String str44;
        boolean[] zArr421;
        f3 f3Var;
        boolean[] zArr422;
        String str45;
        boolean[] zArr423;
        String str46;
        boolean[] zArr424;
        l0 l0Var;
        boolean[] zArr425;
        Integer num16;
        boolean[] zArr426;
        String str47;
        boolean[] zArr427;
        g gVar;
        boolean[] zArr428;
        Double d14;
        boolean[] zArr429;
        String str48;
        boolean[] zArr430;
        String str49;
        if (f30Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        zArr = f30Var.f37485h3;
        int length = zArr.length;
        nm.o oVar = this.f37930a;
        if (length > 0) {
            zArr430 = f30Var.f37485h3;
            if (zArr430[0]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar = this.V;
                um.c h10 = cVar.h("id");
                str49 = f30Var.f37447a;
                mVar.e(h10, str49);
            }
        }
        zArr2 = f30Var.f37485h3;
        if (zArr2.length > 1) {
            zArr429 = f30Var.f37485h3;
            if (zArr429[1]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar2 = this.V;
                um.c h13 = cVar.h("node_id");
                str48 = f30Var.f37452b;
                mVar2.e(h13, str48);
            }
        }
        zArr3 = f30Var.f37485h3;
        if (zArr3.length > 2) {
            zArr428 = f30Var.f37485h3;
            if (zArr428[2]) {
                if (this.f37945n == null) {
                    this.f37945n = oVar.h(Double.class).b();
                }
                nm.m mVar3 = this.f37945n;
                um.c h14 = cVar.h("activity_timestamp");
                d14 = f30Var.f37457c;
                mVar3.e(h14, d14);
            }
        }
        zArr4 = f30Var.f37485h3;
        if (zArr4.length > 3) {
            zArr427 = f30Var.f37485h3;
            if (zArr427[3]) {
                if (this.f37932b == null) {
                    this.f37932b = oVar.h(g.class).b();
                }
                nm.m mVar4 = this.f37932b;
                um.c h15 = cVar.h("ad_data");
                gVar = f30Var.f37462d;
                mVar4.e(h15, gVar);
            }
        }
        zArr5 = f30Var.f37485h3;
        if (zArr5.length > 4) {
            zArr426 = f30Var.f37485h3;
            if (zArr426[4]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar5 = this.V;
                um.c h16 = cVar.h("ad_destination_url");
                str47 = f30Var.f37466e;
                mVar5.e(h16, str47);
            }
        }
        zArr6 = f30Var.f37485h3;
        if (zArr6.length > 5) {
            zArr425 = f30Var.f37485h3;
            if (zArr425[5]) {
                if (this.f37949r == null) {
                    this.f37949r = oVar.h(Integer.class).b();
                }
                nm.m mVar6 = this.f37949r;
                um.c h17 = cVar.h("ad_match_reason");
                num16 = f30Var.f37471f;
                mVar6.e(h17, num16);
            }
        }
        zArr7 = f30Var.f37485h3;
        if (zArr7.length > 6) {
            zArr424 = f30Var.f37485h3;
            if (zArr424[6]) {
                if (this.f37934c == null) {
                    this.f37934c = oVar.h(l0.class).b();
                }
                nm.m mVar7 = this.f37934c;
                um.c h18 = cVar.h("ad_targeting_attribution");
                l0Var = f30Var.f37476g;
                mVar7.e(h18, l0Var);
            }
        }
        zArr8 = f30Var.f37485h3;
        if (zArr8.length > 7) {
            zArr423 = f30Var.f37485h3;
            if (zArr423[7]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar8 = this.V;
                um.c h19 = cVar.h("advertiser_id");
                str46 = f30Var.f37481h;
                mVar8.e(h19, str46);
            }
        }
        zArr9 = f30Var.f37485h3;
        if (zArr9.length > 8) {
            zArr422 = f30Var.f37485h3;
            if (zArr422[8]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar9 = this.V;
                um.c h23 = cVar.h("affiliate_link");
                str45 = f30Var.f37486i;
                mVar9.e(h23, str45);
            }
        }
        zArr10 = f30Var.f37485h3;
        if (zArr10.length > 9) {
            zArr421 = f30Var.f37485h3;
            if (zArr421[9]) {
                if (this.f37935d == null) {
                    this.f37935d = oVar.h(f3.class).b();
                }
                nm.m mVar10 = this.f37935d;
                um.c h24 = cVar.h("aggregated_pin_data");
                f3Var = f30Var.f37490j;
                mVar10.e(h24, f3Var);
            }
        }
        zArr11 = f30Var.f37485h3;
        if (zArr11.length > 10) {
            zArr420 = f30Var.f37485h3;
            if (zArr420[10]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar11 = this.V;
                um.c h25 = cVar.h("alt_text");
                str44 = f30Var.f37494k;
                mVar11.e(h25, str44);
            }
        }
        zArr12 = f30Var.f37485h3;
        if (zArr12.length > 11) {
            zArr419 = f30Var.f37485h3;
            if (zArr419[11]) {
                if (this.f37936e == null) {
                    this.f37936e = oVar.h(x6.class).b();
                }
                nm.m mVar12 = this.f37936e;
                um.c h26 = cVar.h("attribution");
                x6Var = f30Var.f37498l;
                mVar12.e(h26, x6Var);
            }
        }
        zArr13 = f30Var.f37485h3;
        if (zArr13.length > 12) {
            zArr418 = f30Var.f37485h3;
            if (zArr418[12]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar13 = this.V;
                um.c h27 = cVar.h("attribution_source_id");
                str43 = f30Var.f37502m;
                mVar13.e(h27, str43);
            }
        }
        zArr14 = f30Var.f37485h3;
        if (zArr14.length > 13) {
            zArr417 = f30Var.f37485h3;
            if (zArr417[13]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar14 = this.V;
                um.c h28 = cVar.h("auto_alt_text");
                str42 = f30Var.f37506n;
                mVar14.e(h28, str42);
            }
        }
        zArr15 = f30Var.f37485h3;
        if (zArr15.length > 14) {
            zArr416 = f30Var.f37485h3;
            if (zArr416[14]) {
                if (this.f37937f == null) {
                    this.f37937f = oVar.h(v7.class).b();
                }
                nm.m mVar15 = this.f37937f;
                um.c h29 = cVar.h("board");
                v7Var2 = f30Var.f37510o;
                mVar15.e(h29, v7Var2);
            }
        }
        zArr16 = f30Var.f37485h3;
        if (zArr16.length > 15) {
            zArr415 = f30Var.f37485h3;
            if (zArr415[15]) {
                if (this.f37938g == null) {
                    this.f37938g = oVar.h(z7.class).b();
                }
                nm.m mVar16 = this.f37938g;
                um.c h33 = cVar.h("board_conversation_thread");
                z7Var = f30Var.f37514p;
                mVar16.e(h33, z7Var);
            }
        }
        zArr17 = f30Var.f37485h3;
        if (zArr17.length > 16) {
            zArr414 = f30Var.f37485h3;
            if (zArr414[16]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar17 = this.V;
                um.c h34 = cVar.h("cacheable_id");
                str41 = f30Var.f37518q;
                mVar17.e(h34, str41);
            }
        }
        zArr18 = f30Var.f37485h3;
        if (zArr18.length > 17) {
            zArr413 = f30Var.f37485h3;
            if (zArr413[17]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar18 = this.V;
                um.c h35 = cVar.h("call_to_action_text");
                str40 = f30Var.f37522r;
                mVar18.e(h35, str40);
            }
        }
        zArr19 = f30Var.f37485h3;
        if (zArr19.length > 18) {
            zArr412 = f30Var.f37485h3;
            if (zArr412[18]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar19 = this.V;
                um.c h36 = cVar.h("campaign_id_reformatted");
                str39 = f30Var.f37526s;
                mVar19.e(h36, str39);
            }
        }
        zArr20 = f30Var.f37485h3;
        if (zArr20.length > 19) {
            zArr411 = f30Var.f37485h3;
            if (zArr411[19]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar20 = this.f37940i;
                um.c h37 = cVar.h("can_delete_did_it_and_comments");
                bool81 = f30Var.f37530t;
                mVar20.e(h37, bool81);
            }
        }
        zArr21 = f30Var.f37485h3;
        if (zArr21.length > 20) {
            zArr410 = f30Var.f37485h3;
            if (zArr410[20]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar21 = this.V;
                um.c h38 = cVar.h("canonical_merchant_domain");
                str38 = f30Var.f37534u;
                mVar21.e(h38, str38);
            }
        }
        zArr22 = f30Var.f37485h3;
        if (zArr22.length > 21) {
            zArr409 = f30Var.f37485h3;
            if (zArr409[21]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar22 = this.V;
                um.c h39 = cVar.h("canonical_merchant_name");
                str37 = f30Var.f37538v;
                mVar22.e(h39, str37);
            }
        }
        zArr23 = f30Var.f37485h3;
        if (zArr23.length > 22) {
            zArr408 = f30Var.f37485h3;
            if (zArr408[22]) {
                if (this.f37941j == null) {
                    this.f37941j = oVar.h(cc.class).b();
                }
                nm.m mVar23 = this.f37941j;
                um.c h43 = cVar.h("carousel_data");
                ccVar = f30Var.f37542w;
                mVar23.e(h43, ccVar);
            }
        }
        zArr24 = f30Var.f37485h3;
        if (zArr24.length > 23) {
            zArr407 = f30Var.f37485h3;
            if (zArr407[23]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar24 = this.V;
                um.c h44 = cVar.h("category");
                str36 = f30Var.f37546x;
                mVar24.e(h44, str36);
            }
        }
        zArr25 = f30Var.f37485h3;
        if (zArr25.length > 24) {
            zArr406 = f30Var.f37485h3;
            if (zArr406[24]) {
                if (this.X == null) {
                    this.X = oVar.h(wy0.class).b();
                }
                nm.m mVar25 = this.X;
                um.c h45 = cVar.h("closeup_attribution");
                wy0Var7 = f30Var.f37550y;
                mVar25.e(h45, wy0Var7);
            }
        }
        zArr26 = f30Var.f37485h3;
        if (zArr26.length > 25) {
            zArr405 = f30Var.f37485h3;
            if (zArr405[25]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar26 = this.V;
                um.c h46 = cVar.h("closeup_description");
                str35 = f30Var.f37554z;
                mVar26.e(h46, str35);
            }
        }
        zArr27 = f30Var.f37485h3;
        if (zArr27.length > 26) {
            zArr404 = f30Var.f37485h3;
            if (zArr404[26]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar27 = this.V;
                um.c h47 = cVar.h("closeup_unified_description");
                str34 = f30Var.A;
                mVar27.e(h47, str34);
            }
        }
        zArr28 = f30Var.f37485h3;
        if (zArr28.length > 27) {
            zArr403 = f30Var.f37485h3;
            if (zArr403[27]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar28 = this.V;
                um.c h48 = cVar.h("collage_pin_id");
                str33 = f30Var.B;
                mVar28.e(h48, str33);
            }
        }
        zArr29 = f30Var.f37485h3;
        if (zArr29.length > 28) {
            zArr402 = f30Var.f37485h3;
            if (zArr402[28]) {
                if (this.f37942k == null) {
                    this.f37942k = oVar.h(md.class).b();
                }
                nm.m mVar29 = this.f37942k;
                um.c h49 = cVar.h("collection_pin");
                mdVar = f30Var.C;
                mVar29.e(h49, mdVar);
            }
        }
        zArr30 = f30Var.f37485h3;
        if (zArr30.length > 29) {
            zArr401 = f30Var.f37485h3;
            if (zArr401[29]) {
                if (this.f37949r == null) {
                    this.f37949r = oVar.h(Integer.class).b();
                }
                nm.m mVar30 = this.f37949r;
                um.c h53 = cVar.h("comment_count");
                num15 = f30Var.D;
                mVar30.e(h53, num15);
            }
        }
        zArr31 = f30Var.f37485h3;
        if (zArr31.length > 30) {
            zArr400 = f30Var.f37485h3;
            if (zArr400[30]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar31 = this.V;
                um.c h54 = cVar.h("comment_reply_comment_id");
                str32 = f30Var.E;
                mVar31.e(h54, str32);
            }
        }
        zArr32 = f30Var.f37485h3;
        if (zArr32.length > 31) {
            zArr399 = f30Var.f37485h3;
            if (zArr399[31]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar32 = this.f37940i;
                um.c h55 = cVar.h("comments_disabled");
                bool80 = f30Var.F;
                mVar32.e(h55, bool80);
            }
        }
        zArr33 = f30Var.f37485h3;
        if (zArr33.length > 32) {
            zArr398 = f30Var.f37485h3;
            if (zArr398[32]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar33 = this.V;
                um.c h56 = cVar.h("conversation_id");
                str31 = f30Var.G;
                mVar33.e(h56, str31);
            }
        }
        zArr34 = f30Var.f37485h3;
        if (zArr34.length > 33) {
            zArr397 = f30Var.f37485h3;
            if (zArr397[33]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar34 = this.V;
                um.c h57 = cVar.h("conversation_pin_id");
                str30 = f30Var.H;
                mVar34.e(h57, str30);
            }
        }
        zArr35 = f30Var.f37485h3;
        if (zArr35.length > 34) {
            zArr396 = f30Var.f37485h3;
            if (zArr396[34]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar35 = this.V;
                um.c h58 = cVar.h("conversation_sender_id");
                str29 = f30Var.I;
                mVar35.e(h58, str29);
            }
        }
        zArr36 = f30Var.f37485h3;
        if (zArr36.length > 35) {
            zArr395 = f30Var.f37485h3;
            if (zArr395[35]) {
                if (this.f37943l == null) {
                    this.f37943l = oVar.h(Date.class).b();
                }
                nm.m mVar36 = this.f37943l;
                um.c h59 = cVar.h("created_at");
                date2 = f30Var.f37446J;
                mVar36.e(h59, date2);
            }
        }
        zArr37 = f30Var.f37485h3;
        if (zArr37.length > 36) {
            zArr394 = f30Var.f37485h3;
            if (zArr394[36]) {
                if (this.f37945n == null) {
                    this.f37945n = oVar.h(Double.class).b();
                }
                nm.m mVar37 = this.f37945n;
                um.c h63 = cVar.h("creative_enhancement_slideshow_aspect_ratio");
                d13 = f30Var.K;
                mVar37.e(h63, d13);
            }
        }
        zArr38 = f30Var.f37485h3;
        if (zArr38.length > 37) {
            zArr393 = f30Var.f37485h3;
            if (zArr393[37]) {
                if (this.C == null) {
                    this.C = oVar.g(new TypeToken<Map<String, bg>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$1
                    }).b();
                }
                nm.m mVar38 = this.C;
                um.c h64 = cVar.h("creator_analytics");
                map5 = f30Var.L;
                mVar38.e(h64, map5);
            }
        }
        zArr39 = f30Var.f37485h3;
        if (zArr39.length > 38) {
            zArr392 = f30Var.f37485h3;
            if (zArr392[38]) {
                if (this.f37949r == null) {
                    this.f37949r = oVar.h(Integer.class).b();
                }
                nm.m mVar39 = this.f37949r;
                um.c h65 = cVar.h("current_story_pin_page_id");
                num14 = f30Var.M;
                mVar39.e(h65, num14);
            }
        }
        zArr40 = f30Var.f37485h3;
        if (zArr40.length > 39) {
            zArr391 = f30Var.f37485h3;
            if (zArr391[39]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar40 = this.V;
                um.c h66 = cVar.h("dark_profile_link");
                str28 = f30Var.N;
                mVar40.e(h66, str28);
            }
        }
        zArr41 = f30Var.f37485h3;
        if (zArr41.length > 40) {
            zArr390 = f30Var.f37485h3;
            if (zArr390[40]) {
                if (this.f37951t == null) {
                    this.f37951t = oVar.g(new TypeToken<List<sg>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$2
                    }).b();
                }
                nm.m mVar41 = this.f37951t;
                um.c h67 = cVar.h("deb_content_quality");
                list17 = f30Var.O;
                mVar41.e(h67, list17);
            }
        }
        zArr42 = f30Var.f37485h3;
        if (zArr42.length > 41) {
            zArr389 = f30Var.f37485h3;
            if (zArr389[41]) {
                if (this.f37951t == null) {
                    this.f37951t = oVar.g(new TypeToken<List<sg>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$3
                    }).b();
                }
                nm.m mVar42 = this.f37951t;
                um.c h68 = cVar.h("deb_inclusive_product");
                list16 = f30Var.P;
                mVar42.e(h68, list16);
            }
        }
        zArr43 = f30Var.f37485h3;
        if (zArr43.length > 42) {
            zArr388 = f30Var.f37485h3;
            if (zArr388[42]) {
                if (this.f37951t == null) {
                    this.f37951t = oVar.g(new TypeToken<List<sg>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$4
                    }).b();
                }
                nm.m mVar43 = this.f37951t;
                um.c h69 = cVar.h("deb_shopping");
                list15 = f30Var.Q;
                mVar43.e(h69, list15);
            }
        }
        zArr44 = f30Var.f37485h3;
        if (zArr44.length > 43) {
            zArr387 = f30Var.f37485h3;
            if (zArr387[43]) {
                if (this.f37951t == null) {
                    this.f37951t = oVar.g(new TypeToken<List<sg>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$5
                    }).b();
                }
                nm.m mVar44 = this.f37951t;
                um.c h73 = cVar.h("deb_trust_and_safety");
                list14 = f30Var.R;
                mVar44.e(h73, list14);
            }
        }
        zArr45 = f30Var.f37485h3;
        if (zArr45.length > 44) {
            zArr386 = f30Var.f37485h3;
            if (zArr386[44]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar45 = this.V;
                um.c h74 = cVar.h("description");
                str27 = f30Var.S;
                mVar45.e(h74, str27);
            }
        }
        zArr46 = f30Var.f37485h3;
        if (zArr46.length > 45) {
            zArr385 = f30Var.f37485h3;
            if (zArr385[45]) {
                if (this.f37949r == null) {
                    this.f37949r = oVar.h(Integer.class).b();
                }
                nm.m mVar46 = this.f37949r;
                um.c h75 = cVar.h("destination_url_type");
                num13 = f30Var.T;
                mVar46.e(h75, num13);
            }
        }
        zArr47 = f30Var.f37485h3;
        if (zArr47.length > 46) {
            zArr384 = f30Var.f37485h3;
            if (zArr384[46]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar47 = this.f37940i;
                um.c h76 = cVar.h("did_it_disabled");
                bool79 = f30Var.U;
                mVar47.e(h76, bool79);
            }
        }
        zArr48 = f30Var.f37485h3;
        if (zArr48.length > 47) {
            zArr383 = f30Var.f37485h3;
            if (zArr383[47]) {
                if (this.I == null) {
                    this.I = oVar.h(f30.a.class).b();
                }
                nm.m mVar48 = this.I;
                um.c h77 = cVar.h("digital_media_source_type");
                aVar = f30Var.V;
                mVar48.e(h77, aVar);
            }
        }
        zArr49 = f30Var.f37485h3;
        if (zArr49.length > 48) {
            zArr382 = f30Var.f37485h3;
            if (zArr382[48]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar49 = this.V;
                um.c h78 = cVar.h("digital_media_source_type_label");
                str26 = f30Var.W;
                mVar49.e(h78, str26);
            }
        }
        zArr50 = f30Var.f37485h3;
        if (zArr50.length > 49) {
            zArr381 = f30Var.f37485h3;
            if (zArr381[49]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar50 = this.V;
                um.c h79 = cVar.h("domain");
                str25 = f30Var.X;
                mVar50.e(h79, str25);
            }
        }
        zArr51 = f30Var.f37485h3;
        if (zArr51.length > 50) {
            zArr380 = f30Var.f37485h3;
            if (zArr380[50]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar51 = this.V;
                um.c h83 = cVar.h("dominant_color");
                str24 = f30Var.Y;
                mVar51.e(h83, str24);
            }
        }
        zArr52 = f30Var.f37485h3;
        if (zArr52.length > 51) {
            zArr379 = f30Var.f37485h3;
            if (zArr379[51]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar52 = this.f37940i;
                um.c h84 = cVar.h("done_by_me");
                bool78 = f30Var.Z;
                mVar52.e(h84, bool78);
            }
        }
        zArr53 = f30Var.f37485h3;
        if (zArr53.length > 52) {
            zArr378 = f30Var.f37485h3;
            if (zArr378[52]) {
                if (this.f37949r == null) {
                    this.f37949r = oVar.h(Integer.class).b();
                }
                nm.m mVar53 = this.f37949r;
                um.c h85 = cVar.h("dpa_creative_type");
                num12 = f30Var.f37448a0;
                mVar53.e(h85, num12);
            }
        }
        zArr54 = f30Var.f37485h3;
        if (zArr54.length > 53) {
            zArr377 = f30Var.f37485h3;
            if (zArr377[53]) {
                if (this.f37956y == null) {
                    this.f37956y = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$6
                    }).b();
                }
                nm.m mVar54 = this.f37956y;
                um.c h86 = cVar.h("duplicated_ad_insertions");
                list13 = f30Var.f37453b0;
                mVar54.e(h86, list13);
            }
        }
        zArr55 = f30Var.f37485h3;
        if (zArr55.length > 54) {
            zArr376 = f30Var.f37485h3;
            if (zArr376[54]) {
                if (this.f37956y == null) {
                    this.f37956y = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$7
                    }).b();
                }
                nm.m mVar55 = this.f37956y;
                um.c h87 = cVar.h("edited_fields");
                list12 = f30Var.f37458c0;
                mVar55.e(h87, list12);
            }
        }
        zArr56 = f30Var.f37485h3;
        if (zArr56.length > 55) {
            zArr375 = f30Var.f37485h3;
            if (zArr375[55]) {
                if (this.f37947p == null) {
                    this.f37947p = oVar.h(gn.class).b();
                }
                nm.m mVar56 = this.f37947p;
                um.c h88 = cVar.h("embed");
                gnVar = f30Var.f37463d0;
                mVar56.e(h88, gnVar);
            }
        }
        zArr57 = f30Var.f37485h3;
        if (zArr57.length > 56) {
            zArr374 = f30Var.f37485h3;
            if (zArr374[56]) {
                if (this.f37949r == null) {
                    this.f37949r = oVar.h(Integer.class).b();
                }
                nm.m mVar57 = this.f37949r;
                um.c h89 = cVar.h("favorite_user_count");
                num11 = f30Var.f37467e0;
                mVar57.e(h89, num11);
            }
        }
        zArr58 = f30Var.f37485h3;
        if (zArr58.length > 57) {
            zArr373 = f30Var.f37485h3;
            if (zArr373[57]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar58 = this.f37940i;
                um.c h93 = cVar.h("favorited_by_me");
                bool77 = f30Var.f37472f0;
                mVar58.e(h93, bool77);
            }
        }
        zArr59 = f30Var.f37485h3;
        if (zArr59.length > 58) {
            zArr372 = f30Var.f37485h3;
            if (zArr372[58]) {
                if (this.f37946o == null) {
                    this.f37946o = oVar.h(em.class).b();
                }
                nm.m mVar59 = this.f37946o;
                um.c h94 = cVar.h("formatted_description");
                emVar = f30Var.f37477g0;
                mVar59.e(h94, emVar);
            }
        }
        zArr60 = f30Var.f37485h3;
        if (zArr60.length > 59) {
            zArr371 = f30Var.f37485h3;
            if (zArr371[59]) {
                if (this.f37952u == null) {
                    this.f37952u = oVar.g(new TypeToken<List<ym>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$8
                    }).b();
                }
                nm.m mVar60 = this.f37952u;
                um.c h95 = cVar.h("gen_ai_topics");
                list11 = f30Var.f37482h0;
                mVar60.e(h95, list11);
            }
        }
        zArr61 = f30Var.f37485h3;
        if (zArr61.length > 60) {
            zArr370 = f30Var.f37485h3;
            if (zArr370[60]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar61 = this.V;
                um.c h96 = cVar.h("grid_title");
                str23 = f30Var.f37487i0;
                mVar61.e(h96, str23);
            }
        }
        zArr62 = f30Var.f37485h3;
        if (zArr62.length > 61) {
            zArr369 = f30Var.f37485h3;
            if (zArr369[61]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar62 = this.f37940i;
                um.c h97 = cVar.h("has_been_promoted");
                bool76 = f30Var.f37491j0;
                mVar62.e(h97, bool76);
            }
        }
        zArr63 = f30Var.f37485h3;
        if (zArr63.length > 62) {
            zArr368 = f30Var.f37485h3;
            if (zArr368[62]) {
                if (this.f37929J == null) {
                    this.f37929J = oVar.h(f30.b.class).b();
                }
                nm.m mVar63 = this.f37929J;
                um.c h98 = cVar.h("has_displayable_community_content");
                bVar = f30Var.f37495k0;
                mVar63.e(h98, bVar);
            }
        }
        zArr64 = f30Var.f37485h3;
        if (zArr64.length > 63) {
            zArr367 = f30Var.f37485h3;
            if (zArr367[63]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar64 = this.f37940i;
                um.c h99 = cVar.h("has_link");
                bool75 = f30Var.f37499l0;
                mVar64.e(h99, bool75);
            }
        }
        zArr65 = f30Var.f37485h3;
        if (zArr65.length > 64) {
            zArr366 = f30Var.f37485h3;
            if (zArr366[64]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar65 = this.f37940i;
                um.c h100 = cVar.h("has_variants");
                bool74 = f30Var.f37503m0;
                mVar65.e(h100, bool74);
            }
        }
        zArr66 = f30Var.f37485h3;
        if (zArr66.length > 65) {
            zArr365 = f30Var.f37485h3;
            if (zArr365[65]) {
                if (this.f37956y == null) {
                    this.f37956y = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$9
                    }).b();
                }
                nm.m mVar66 = this.f37956y;
                um.c h101 = cVar.h("hashtags");
                list10 = f30Var.f37507n0;
                mVar66.e(h101, list10);
            }
        }
        zArr67 = f30Var.f37485h3;
        if (zArr67.length > 66) {
            zArr364 = f30Var.f37485h3;
            if (zArr364[66]) {
                if (this.f37956y == null) {
                    this.f37956y = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$10
                    }).b();
                }
                nm.m mVar67 = this.f37956y;
                um.c h102 = cVar.h("highlighted_aggregated_comments");
                list9 = f30Var.f37511o0;
                mVar67.e(h102, list9);
            }
        }
        zArr68 = f30Var.f37485h3;
        if (zArr68.length > 67) {
            zArr363 = f30Var.f37485h3;
            if (zArr363[67]) {
                if (this.f37956y == null) {
                    this.f37956y = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$11
                    }).b();
                }
                nm.m mVar68 = this.f37956y;
                um.c h103 = cVar.h("highlighted_did_it");
                list8 = f30Var.f37515p0;
                mVar68.e(h103, list8);
            }
        }
        zArr69 = f30Var.f37485h3;
        if (zArr69.length > 68) {
            zArr362 = f30Var.f37485h3;
            if (zArr362[68]) {
                if (this.f37948q == null) {
                    this.f37948q = oVar.h(or.class).b();
                }
                nm.m mVar69 = this.f37948q;
                um.c h104 = cVar.h("image_crop");
                orVar = f30Var.f37519q0;
                mVar69.e(h104, orVar);
            }
        }
        zArr70 = f30Var.f37485h3;
        if (zArr70.length > 69) {
            zArr361 = f30Var.f37485h3;
            if (zArr361[69]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar70 = this.V;
                um.c h105 = cVar.h("image_medium_url");
                str22 = f30Var.f37523r0;
                mVar70.e(h105, str22);
            }
        }
        zArr71 = f30Var.f37485h3;
        if (zArr71.length > 70) {
            zArr360 = f30Var.f37485h3;
            if (zArr360[70]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar71 = this.V;
                um.c h106 = cVar.h("image_signature");
                str21 = f30Var.f37527s0;
                mVar71.e(h106, str21);
            }
        }
        zArr72 = f30Var.f37485h3;
        if (zArr72.length > 71) {
            zArr359 = f30Var.f37485h3;
            if (zArr359[71]) {
                if (this.D == null) {
                    this.D = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$12
                    }).b();
                }
                nm.m mVar72 = this.D;
                um.c h107 = cVar.h("images");
                map4 = f30Var.f37531t0;
                mVar72.e(h107, map4);
            }
        }
        zArr73 = f30Var.f37485h3;
        if (zArr73.length > 72) {
            zArr358 = f30Var.f37485h3;
            if (zArr358[72]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar73 = this.V;
                um.c h108 = cVar.h("insertion_id");
                str20 = f30Var.f37535u0;
                mVar73.e(h108, str20);
            }
        }
        zArr74 = f30Var.f37485h3;
        if (zArr74.length > 73) {
            zArr357 = f30Var.f37485h3;
            if (zArr357[73]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar74 = this.f37940i;
                um.c h109 = cVar.h("ip_eligible_for_stela");
                bool73 = f30Var.f37539v0;
                mVar74.e(h109, bool73);
            }
        }
        zArr75 = f30Var.f37485h3;
        if (zArr75.length > 74) {
            zArr356 = f30Var.f37485h3;
            if (zArr356[74]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar75 = this.f37940i;
                um.c h110 = cVar.h("is_active_ad");
                bool72 = f30Var.f37543w0;
                mVar75.e(h110, bool72);
            }
        }
        zArr76 = f30Var.f37485h3;
        if (zArr76.length > 75) {
            zArr355 = f30Var.f37485h3;
            if (zArr355[75]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar76 = this.f37940i;
                um.c h111 = cVar.h("is_blocked");
                bool71 = f30Var.f37547x0;
                mVar76.e(h111, bool71);
            }
        }
        zArr77 = f30Var.f37485h3;
        if (zArr77.length > 76) {
            zArr354 = f30Var.f37485h3;
            if (zArr354[76]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar77 = this.f37940i;
                um.c h112 = cVar.h("is_cpc_ad");
                bool70 = f30Var.f37551y0;
                mVar77.e(h112, bool70);
            }
        }
        zArr78 = f30Var.f37485h3;
        if (zArr78.length > 77) {
            zArr353 = f30Var.f37485h3;
            if (zArr353[77]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar78 = this.f37940i;
                um.c h113 = cVar.h("is_disabled_by_dsa");
                bool69 = f30Var.f37555z0;
                mVar78.e(h113, bool69);
            }
        }
        zArr79 = f30Var.f37485h3;
        if (zArr79.length > 78) {
            zArr352 = f30Var.f37485h3;
            if (zArr352[78]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar79 = this.f37940i;
                um.c h114 = cVar.h("is_downstream_promotion");
                bool68 = f30Var.A0;
                mVar79.e(h114, bool68);
            }
        }
        zArr80 = f30Var.f37485h3;
        if (zArr80.length > 79) {
            zArr351 = f30Var.f37485h3;
            if (zArr351[79]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar80 = this.f37940i;
                um.c h115 = cVar.h("is_draft");
                bool67 = f30Var.B0;
                mVar80.e(h115, bool67);
            }
        }
        zArr81 = f30Var.f37485h3;
        if (zArr81.length > 80) {
            zArr350 = f30Var.f37485h3;
            if (zArr350[80]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar81 = this.f37940i;
                um.c h116 = cVar.h("is_eligible_for_aggregated_comments");
                bool66 = f30Var.C0;
                mVar81.e(h116, bool66);
            }
        }
        zArr82 = f30Var.f37485h3;
        if (zArr82.length > 81) {
            zArr349 = f30Var.f37485h3;
            if (zArr349[81]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar82 = this.f37940i;
                um.c h117 = cVar.h("is_eligible_for_closeup_one_bar_refinements");
                bool65 = f30Var.D0;
                mVar82.e(h117, bool65);
            }
        }
        zArr83 = f30Var.f37485h3;
        if (zArr83.length > 82) {
            zArr348 = f30Var.f37485h3;
            if (zArr348[82]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar83 = this.f37940i;
                um.c h118 = cVar.h("is_eligible_for_collage_grid_animation");
                bool64 = f30Var.E0;
                mVar83.e(h118, bool64);
            }
        }
        zArr84 = f30Var.f37485h3;
        if (zArr84.length > 83) {
            zArr347 = f30Var.f37485h3;
            if (zArr347[83]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar84 = this.f37940i;
                um.c h119 = cVar.h("is_eligible_for_cutout_tool");
                bool63 = f30Var.F0;
                mVar84.e(h119, bool63);
            }
        }
        zArr85 = f30Var.f37485h3;
        if (zArr85.length > 84) {
            zArr346 = f30Var.f37485h3;
            if (zArr346[84]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar85 = this.f37940i;
                um.c h120 = cVar.h("is_eligible_for_filters");
                bool62 = f30Var.G0;
                mVar85.e(h120, bool62);
            }
        }
        zArr86 = f30Var.f37485h3;
        if (zArr86.length > 85) {
            zArr345 = f30Var.f37485h3;
            if (zArr345[85]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar86 = this.f37940i;
                um.c h121 = cVar.h("is_eligible_for_flashlight_shopping");
                bool61 = f30Var.H0;
                mVar86.e(h121, bool61);
            }
        }
        zArr87 = f30Var.f37485h3;
        if (zArr87.length > 86) {
            zArr344 = f30Var.f37485h3;
            if (zArr344[86]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar87 = this.f37940i;
                um.c h122 = cVar.h("is_eligible_for_hybrid_search");
                bool60 = f30Var.I0;
                mVar87.e(h122, bool60);
            }
        }
        zArr88 = f30Var.f37485h3;
        if (zArr88.length > 87) {
            zArr343 = f30Var.f37485h3;
            if (zArr343[87]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar88 = this.f37940i;
                um.c h123 = cVar.h("is_eligible_for_in_content_ads");
                bool59 = f30Var.J0;
                mVar88.e(h123, bool59);
            }
        }
        zArr89 = f30Var.f37485h3;
        if (zArr89.length > 88) {
            zArr342 = f30Var.f37485h3;
            if (zArr342[88]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar89 = this.f37940i;
                um.c h124 = cVar.h("is_eligible_for_pdp");
                bool58 = f30Var.K0;
                mVar89.e(h124, bool58);
            }
        }
        zArr90 = f30Var.f37485h3;
        if (zArr90.length > 89) {
            zArr341 = f30Var.f37485h3;
            if (zArr341[89]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar90 = this.f37940i;
                um.c h125 = cVar.h("is_eligible_for_pre_loved_goods_label");
                bool57 = f30Var.L0;
                mVar90.e(h125, bool57);
            }
        }
        zArr91 = f30Var.f37485h3;
        if (zArr91.length > 90) {
            zArr340 = f30Var.f37485h3;
            if (zArr340[90]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar91 = this.f37940i;
                um.c h126 = cVar.h("is_eligible_for_promoted_partnership");
                bool56 = f30Var.M0;
                mVar91.e(h126, bool56);
            }
        }
        zArr92 = f30Var.f37485h3;
        if (zArr92.length > 91) {
            zArr339 = f30Var.f37485h3;
            if (zArr339[91]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar92 = this.f37940i;
                um.c h127 = cVar.h("is_eligible_for_relabeling");
                bool55 = f30Var.N0;
                mVar92.e(h127, bool55);
            }
        }
        zArr93 = f30Var.f37485h3;
        if (zArr93.length > 92) {
            zArr338 = f30Var.f37485h3;
            if (zArr338[92]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar93 = this.f37940i;
                um.c h128 = cVar.h("is_eligible_for_related_pins_tabs");
                bool54 = f30Var.O0;
                mVar93.e(h128, bool54);
            }
        }
        zArr94 = f30Var.f37485h3;
        if (zArr94.length > 93) {
            zArr337 = f30Var.f37485h3;
            if (zArr337[93]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar94 = this.f37940i;
                um.c h129 = cVar.h("is_eligible_for_related_products");
                bool53 = f30Var.P0;
                mVar94.e(h129, bool53);
            }
        }
        zArr95 = f30Var.f37485h3;
        if (zArr95.length > 94) {
            zArr336 = f30Var.f37485h3;
            if (zArr336[94]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar95 = this.f37940i;
                um.c h130 = cVar.h("is_eligible_for_responses");
                bool52 = f30Var.Q0;
                mVar95.e(h130, bool52);
            }
        }
        zArr96 = f30Var.f37485h3;
        if (zArr96.length > 95) {
            zArr335 = f30Var.f37485h3;
            if (zArr335[95]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar96 = this.f37940i;
                um.c h131 = cVar.h("is_eligible_for_web_closeup");
                bool51 = f30Var.R0;
                mVar96.e(h131, bool51);
            }
        }
        zArr97 = f30Var.f37485h3;
        if (zArr97.length > 96) {
            zArr334 = f30Var.f37485h3;
            if (zArr334[96]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar97 = this.f37940i;
                um.c h132 = cVar.h("is_from_cache_feed");
                bool50 = f30Var.S0;
                mVar97.e(h132, bool50);
            }
        }
        zArr98 = f30Var.f37485h3;
        if (zArr98.length > 97) {
            zArr333 = f30Var.f37485h3;
            if (zArr333[97]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar98 = this.f37940i;
                um.c h133 = cVar.h("is_from_initial_page_load");
                bool49 = f30Var.T0;
                mVar98.e(h133, bool49);
            }
        }
        zArr99 = f30Var.f37485h3;
        if (zArr99.length > 98) {
            zArr332 = f30Var.f37485h3;
            if (zArr332[98]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar99 = this.f37940i;
                um.c h134 = cVar.h("is_full_width");
                bool48 = f30Var.U0;
                mVar99.e(h134, bool48);
            }
        }
        zArr100 = f30Var.f37485h3;
        if (zArr100.length > 99) {
            zArr331 = f30Var.f37485h3;
            if (zArr331[99]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar100 = this.f37940i;
                um.c h135 = cVar.h("is_ghost");
                bool47 = f30Var.V0;
                mVar100.e(h135, bool47);
            }
        }
        zArr101 = f30Var.f37485h3;
        if (zArr101.length > 100) {
            zArr330 = f30Var.f37485h3;
            if (zArr330[100]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar101 = this.f37940i;
                um.c h136 = cVar.h("is_go_linkless");
                bool46 = f30Var.W0;
                mVar101.e(h136, bool46);
            }
        }
        zArr102 = f30Var.f37485h3;
        if (zArr102.length > 101) {
            zArr329 = f30Var.f37485h3;
            if (zArr329[101]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar102 = this.f37940i;
                um.c h137 = cVar.h("is_hidden");
                bool45 = f30Var.X0;
                mVar102.e(h137, bool45);
            }
        }
        zArr103 = f30Var.f37485h3;
        if (zArr103.length > 102) {
            zArr328 = f30Var.f37485h3;
            if (zArr328[102]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar103 = this.f37940i;
                um.c h138 = cVar.h("is_instagram_api");
                bool44 = f30Var.Y0;
                mVar103.e(h138, bool44);
            }
        }
        zArr104 = f30Var.f37485h3;
        if (zArr104.length > 103) {
            zArr327 = f30Var.f37485h3;
            if (zArr327[103]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar104 = this.f37940i;
                um.c h139 = cVar.h("is_native");
                bool43 = f30Var.Z0;
                mVar104.e(h139, bool43);
            }
        }
        zArr105 = f30Var.f37485h3;
        if (zArr105.length > 104) {
            zArr326 = f30Var.f37485h3;
            if (zArr326[104]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar105 = this.f37940i;
                um.c h140 = cVar.h("is_native_content");
                bool42 = f30Var.f37449a1;
                mVar105.e(h140, bool42);
            }
        }
        zArr106 = f30Var.f37485h3;
        if (zArr106.length > 105) {
            zArr325 = f30Var.f37485h3;
            if (zArr325[105]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar106 = this.f37940i;
                um.c h141 = cVar.h("is_oos_product");
                bool41 = f30Var.f37454b1;
                mVar106.e(h141, bool41);
            }
        }
        zArr107 = f30Var.f37485h3;
        if (zArr107.length > 106) {
            zArr324 = f30Var.f37485h3;
            if (zArr324[106]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar107 = this.f37940i;
                um.c h142 = cVar.h("is_outfit_of_the_day_enabled");
                bool40 = f30Var.f37459c1;
                mVar107.e(h142, bool40);
            }
        }
        zArr108 = f30Var.f37485h3;
        if (zArr108.length > 107) {
            zArr323 = f30Var.f37485h3;
            if (zArr323[107]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar108 = this.f37940i;
                um.c h143 = cVar.h("is_owned_by_viewer");
                bool39 = f30Var.f37464d1;
                mVar108.e(h143, bool39);
            }
        }
        zArr109 = f30Var.f37485h3;
        if (zArr109.length > 108) {
            zArr322 = f30Var.f37485h3;
            if (zArr322[108]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar109 = this.f37940i;
                um.c h144 = cVar.h("is_post_reranked");
                bool38 = f30Var.f37468e1;
                mVar109.e(h144, bool38);
            }
        }
        zArr110 = f30Var.f37485h3;
        if (zArr110.length > 109) {
            zArr321 = f30Var.f37485h3;
            if (zArr321[109]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar110 = this.f37940i;
                um.c h145 = cVar.h("is_premiere");
                bool37 = f30Var.f37473f1;
                mVar110.e(h145, bool37);
            }
        }
        zArr111 = f30Var.f37485h3;
        if (zArr111.length > 110) {
            zArr320 = f30Var.f37485h3;
            if (zArr320[110]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar111 = this.f37940i;
                um.c h146 = cVar.h("is_product_tagging_enabled_standard_pin");
                bool36 = f30Var.f37478g1;
                mVar111.e(h146, bool36);
            }
        }
        zArr112 = f30Var.f37485h3;
        if (zArr112.length > 111) {
            zArr319 = f30Var.f37485h3;
            if (zArr319[111]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar112 = this.f37940i;
                um.c h147 = cVar.h("is_promoted");
                bool35 = f30Var.f37483h1;
                mVar112.e(h147, bool35);
            }
        }
        zArr113 = f30Var.f37485h3;
        if (zArr113.length > 112) {
            zArr318 = f30Var.f37485h3;
            if (zArr318[112]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar113 = this.f37940i;
                um.c h148 = cVar.h("is_quick_promotable");
                bool34 = f30Var.f37488i1;
                mVar113.e(h148, bool34);
            }
        }
        zArr114 = f30Var.f37485h3;
        if (zArr114.length > 113) {
            zArr317 = f30Var.f37485h3;
            if (zArr317[113]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar114 = this.f37940i;
                um.c h149 = cVar.h("is_repin");
                bool33 = f30Var.f37492j1;
                mVar114.e(h149, bool33);
            }
        }
        zArr115 = f30Var.f37485h3;
        if (zArr115.length > 114) {
            zArr316 = f30Var.f37485h3;
            if (zArr316[114]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar115 = this.f37940i;
                um.c h150 = cVar.h("is_scene");
                bool32 = f30Var.f37496k1;
                mVar115.e(h150, bool32);
            }
        }
        zArr116 = f30Var.f37485h3;
        if (zArr116.length > 115) {
            zArr315 = f30Var.f37485h3;
            if (zArr315[115]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar116 = this.f37940i;
                um.c h151 = cVar.h("is_shoppable");
                bool31 = f30Var.f37500l1;
                mVar116.e(h151, bool31);
            }
        }
        zArr117 = f30Var.f37485h3;
        if (zArr117.length > 116) {
            zArr314 = f30Var.f37485h3;
            if (zArr314[116]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar117 = this.f37940i;
                um.c h152 = cVar.h("is_stale_product");
                bool30 = f30Var.f37504m1;
                mVar117.e(h152, bool30);
            }
        }
        zArr118 = f30Var.f37485h3;
        if (zArr118.length > 117) {
            zArr313 = f30Var.f37485h3;
            if (zArr313[117]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar118 = this.f37940i;
                um.c h153 = cVar.h("is_subtle_ad");
                bool29 = f30Var.f37508n1;
                mVar118.e(h153, bool29);
            }
        }
        zArr119 = f30Var.f37485h3;
        if (zArr119.length > 118) {
            zArr312 = f30Var.f37485h3;
            if (zArr312[118]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar119 = this.f37940i;
                um.c h154 = cVar.h("is_third_party_ad");
                bool28 = f30Var.f37512o1;
                mVar119.e(h154, bool28);
            }
        }
        zArr120 = f30Var.f37485h3;
        if (zArr120.length > 119) {
            zArr311 = f30Var.f37485h3;
            if (zArr311[119]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar120 = this.f37940i;
                um.c h155 = cVar.h("is_tml_merchant");
                bool27 = f30Var.f37516p1;
                mVar120.e(h155, bool27);
            }
        }
        zArr121 = f30Var.f37485h3;
        if (zArr121.length > 120) {
            zArr310 = f30Var.f37485h3;
            if (zArr310[120]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar121 = this.f37940i;
                um.c h156 = cVar.h("is_translatable");
                bool26 = f30Var.f37520q1;
                mVar121.e(h156, bool26);
            }
        }
        zArr122 = f30Var.f37485h3;
        if (zArr122.length > 121) {
            zArr309 = f30Var.f37485h3;
            if (zArr309[121]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar122 = this.f37940i;
                um.c h157 = cVar.h("is_unsafe");
                bool25 = f30Var.f37524r1;
                mVar122.e(h157, bool25);
            }
        }
        zArr123 = f30Var.f37485h3;
        if (zArr123.length > 122) {
            zArr308 = f30Var.f37485h3;
            if (zArr308[122]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar123 = this.f37940i;
                um.c h158 = cVar.h("is_unsafe_for_comments");
                bool24 = f30Var.f37528s1;
                mVar123.e(h158, bool24);
            }
        }
        zArr124 = f30Var.f37485h3;
        if (zArr124.length > 123) {
            zArr307 = f30Var.f37485h3;
            if (zArr307[123]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar124 = this.f37940i;
                um.c h159 = cVar.h("is_video");
                bool23 = f30Var.f37532t1;
                mVar124.e(h159, bool23);
            }
        }
        zArr125 = f30Var.f37485h3;
        if (zArr125.length > 124) {
            zArr306 = f30Var.f37485h3;
            if (zArr306[124]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar125 = this.f37940i;
                um.c h160 = cVar.h("is_viewing_user_in_dsa_countries");
                bool22 = f30Var.f37536u1;
                mVar125.e(h160, bool22);
            }
        }
        zArr126 = f30Var.f37485h3;
        if (zArr126.length > 125) {
            zArr305 = f30Var.f37485h3;
            if (zArr305[125]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar126 = this.f37940i;
                um.c h161 = cVar.h("is_virtual_try_on");
                bool21 = f30Var.f37540v1;
                mVar126.e(h161, bool21);
            }
        }
        zArr127 = f30Var.f37485h3;
        if (zArr127.length > 126) {
            zArr304 = f30Var.f37485h3;
            if (zArr304[126]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar127 = this.f37940i;
                um.c h162 = cVar.h("is_visualization_enabled");
                bool20 = f30Var.f37544w1;
                mVar127.e(h162, bool20);
            }
        }
        zArr128 = f30Var.f37485h3;
        if (zArr128.length > 127) {
            zArr303 = f30Var.f37485h3;
            if (zArr303[127]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar128 = this.f37940i;
                um.c h163 = cVar.h("is_whitelisted_for_tried_it");
                bool19 = f30Var.f37548x1;
                mVar128.e(h163, bool19);
            }
        }
        zArr129 = f30Var.f37485h3;
        if (zArr129.length > 128) {
            zArr302 = f30Var.f37485h3;
            if (zArr302[128]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar129 = this.f37940i;
                um.c h164 = cVar.h("is_year_in_preview");
                bool18 = f30Var.f37552y1;
                mVar129.e(h164, bool18);
            }
        }
        zArr130 = f30Var.f37485h3;
        if (zArr130.length > 129) {
            zArr301 = f30Var.f37485h3;
            if (zArr301[129]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar130 = this.V;
                um.c h165 = cVar.h("item_id");
                str19 = f30Var.f37556z1;
                mVar130.e(h165, str19);
            }
        }
        zArr131 = f30Var.f37485h3;
        if (zArr131.length > 130) {
            zArr300 = f30Var.f37485h3;
            if (zArr300[130]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar131 = this.V;
                um.c h166 = cVar.h("link");
                str18 = f30Var.A1;
                mVar131.e(h166, str18);
            }
        }
        zArr132 = f30Var.f37485h3;
        if (zArr132.length > 131) {
            zArr299 = f30Var.f37485h3;
            if (zArr299[131]) {
                if (this.f37944m == null) {
                    this.f37944m = oVar.h(hh.class).b();
                }
                nm.m mVar132 = this.f37944m;
                um.c h167 = cVar.h("link_domain");
                hhVar = f30Var.B1;
                mVar132.e(h167, hhVar);
            }
        }
        zArr133 = f30Var.f37485h3;
        if (zArr133.length > 132) {
            zArr298 = f30Var.f37485h3;
            if (zArr298[132]) {
                if (this.Y == null) {
                    this.Y = oVar.h(pz0.class).b();
                }
                nm.m mVar133 = this.Y;
                um.c h168 = cVar.h("link_user_website");
                pz0Var = f30Var.C1;
                mVar133.e(h168, pz0Var);
            }
        }
        zArr134 = f30Var.f37485h3;
        if (zArr134.length > 133) {
            zArr297 = f30Var.f37485h3;
            if (zArr297[133]) {
                if (this.K == null) {
                    this.K = oVar.h(f30.c.class).b();
                }
                nm.m mVar134 = this.K;
                um.c h169 = cVar.h("link_utm_applicable_and_replaced");
                cVar2 = f30Var.D1;
                mVar134.e(h169, cVar2);
            }
        }
        zArr135 = f30Var.f37485h3;
        if (zArr135.length > 134) {
            zArr296 = f30Var.f37485h3;
            if (zArr296[134]) {
                if (this.G == null) {
                    this.G = oVar.h(ou.class).b();
                }
                nm.m mVar135 = this.G;
                um.c h170 = cVar.h("media_attribution");
                ouVar = f30Var.E1;
                mVar135.e(h170, ouVar);
            }
        }
        zArr136 = f30Var.f37485h3;
        if (zArr136.length > 135) {
            zArr295 = f30Var.f37485h3;
            if (zArr295[135]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar136 = this.V;
                um.c h171 = cVar.h("mobile_link");
                str17 = f30Var.F1;
                mVar136.e(h171, str17);
            }
        }
        zArr137 = f30Var.f37485h3;
        if (zArr137.length > 136) {
            zArr294 = f30Var.f37485h3;
            if (zArr294[136]) {
                if (this.f37954w == null) {
                    this.f37954w = oVar.g(new TypeToken<List<hx>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$13
                    }).b();
                }
                nm.m mVar137 = this.f37954w;
                um.c h172 = cVar.h("music_attributions");
                list7 = f30Var.G1;
                mVar137.e(h172, list7);
            }
        }
        zArr138 = f30Var.f37485h3;
        if (zArr138.length > 137) {
            zArr293 = f30Var.f37485h3;
            if (zArr293[137]) {
                if (this.X == null) {
                    this.X = oVar.h(wy0.class).b();
                }
                nm.m mVar138 = this.X;
                um.c h173 = cVar.h("native_creator");
                wy0Var6 = f30Var.H1;
                mVar138.e(h173, wy0Var6);
            }
        }
        zArr139 = f30Var.f37485h3;
        if (zArr139.length > 138) {
            zArr292 = f30Var.f37485h3;
            if (zArr292[138]) {
                if (this.H == null) {
                    this.H = oVar.h(nx.class).b();
                }
                nm.m mVar139 = this.H;
                um.c h174 = cVar.h("native_pin_stats");
                nxVar = f30Var.I1;
                mVar139.e(h174, nxVar);
            }
        }
        zArr140 = f30Var.f37485h3;
        if (zArr140.length > 139) {
            zArr291 = f30Var.f37485h3;
            if (zArr291[139]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar140 = this.V;
                um.c h175 = cVar.h("near_dup_sig");
                str16 = f30Var.J1;
                mVar140.e(h175, str16);
            }
        }
        zArr141 = f30Var.f37485h3;
        if (zArr141.length > 140) {
            zArr290 = f30Var.f37485h3;
            if (zArr290[140]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar141 = this.V;
                um.c h176 = cVar.h("new_repin_id");
                str15 = f30Var.K1;
                mVar141.e(h176, str15);
            }
        }
        zArr142 = f30Var.f37485h3;
        if (zArr142.length > 141) {
            zArr289 = f30Var.f37485h3;
            if (zArr289[141]) {
                if (this.X == null) {
                    this.X = oVar.h(wy0.class).b();
                }
                nm.m mVar142 = this.X;
                um.c h177 = cVar.h("origin_pinner");
                wy0Var5 = f30Var.L1;
                mVar142.e(h177, wy0Var5);
            }
        }
        zArr143 = f30Var.f37485h3;
        if (zArr143.length > 142) {
            zArr288 = f30Var.f37485h3;
            if (zArr288[142]) {
                if (this.f37955x == null) {
                    this.f37955x = oVar.g(new TypeToken<List<p20>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$14
                    }).b();
                }
                nm.m mVar143 = this.f37955x;
                um.c h178 = cVar.h("pear_styles");
                list6 = f30Var.M1;
                mVar143.e(h178, list6);
            }
        }
        zArr144 = f30Var.f37485h3;
        if (zArr144.length > 143) {
            zArr287 = f30Var.f37485h3;
            if (zArr287[143]) {
                if (this.L == null) {
                    this.L = oVar.h(w40.class).b();
                }
                nm.m mVar144 = this.L;
                um.c h179 = cVar.h("pin_note");
                w40Var = f30Var.N1;
                mVar144.e(h179, w40Var);
            }
        }
        zArr145 = f30Var.f37485h3;
        if (zArr145.length > 144) {
            zArr286 = f30Var.f37485h3;
            if (zArr286[144]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar145 = this.V;
                um.c h180 = cVar.h("pin_promotion_id_reformatted");
                str14 = f30Var.O1;
                mVar145.e(h180, str14);
            }
        }
        zArr146 = f30Var.f37485h3;
        if (zArr146.length > 145) {
            zArr285 = f30Var.f37485h3;
            if (zArr285[145]) {
                if (this.f37937f == null) {
                    this.f37937f = oVar.h(v7.class).b();
                }
                nm.m mVar146 = this.f37937f;
                um.c h181 = cVar.h("pinned_to_board");
                v7Var = f30Var.P1;
                mVar146.e(h181, v7Var);
            }
        }
        zArr147 = f30Var.f37485h3;
        if (zArr147.length > 146) {
            zArr284 = f30Var.f37485h3;
            if (zArr284[146]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar147 = this.f37940i;
                um.c h182 = cVar.h("pinned_to_profile");
                bool17 = f30Var.Q1;
                mVar147.e(h182, bool17);
            }
        }
        zArr148 = f30Var.f37485h3;
        if (zArr148.length > 147) {
            zArr283 = f30Var.f37485h3;
            if (zArr283[147]) {
                if (this.X == null) {
                    this.X = oVar.h(wy0.class).b();
                }
                nm.m mVar148 = this.X;
                um.c h183 = cVar.h("pinner");
                wy0Var4 = f30Var.R1;
                mVar148.e(h183, wy0Var4);
            }
        }
        zArr149 = f30Var.f37485h3;
        if (zArr149.length > 148) {
            zArr282 = f30Var.f37485h3;
            if (zArr282[148]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar149 = this.V;
                um.c h184 = cVar.h("price_currency");
                str13 = f30Var.S1;
                mVar149.e(h184, str13);
            }
        }
        zArr150 = f30Var.f37485h3;
        if (zArr150.length > 149) {
            zArr281 = f30Var.f37485h3;
            if (zArr281[149]) {
                if (this.f37945n == null) {
                    this.f37945n = oVar.h(Double.class).b();
                }
                nm.m mVar150 = this.f37945n;
                um.c h185 = cVar.h("price_value");
                d2 = f30Var.T1;
                mVar150.e(h185, d2);
            }
        }
        zArr151 = f30Var.f37485h3;
        if (zArr151.length > 150) {
            zArr280 = f30Var.f37485h3;
            if (zArr280[150]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar151 = this.V;
                um.c h186 = cVar.h("privacy");
                str12 = f30Var.U1;
                mVar151.e(h186, str12);
            }
        }
        zArr152 = f30Var.f37485h3;
        if (zArr152.length > 151) {
            zArr279 = f30Var.f37485h3;
            if (zArr279[151]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar152 = this.V;
                um.c h187 = cVar.h("promoted_android_deep_link");
                str11 = f30Var.V1;
                mVar152.e(h187, str11);
            }
        }
        zArr153 = f30Var.f37485h3;
        if (zArr153.length > 152) {
            zArr278 = f30Var.f37485h3;
            if (zArr278[152]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar153 = this.f37940i;
                um.c h188 = cVar.h("promoted_is_auto_assembled");
                bool16 = f30Var.W1;
                mVar153.e(h188, bool16);
            }
        }
        zArr154 = f30Var.f37485h3;
        if (zArr154.length > 153) {
            zArr277 = f30Var.f37485h3;
            if (zArr277[153]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar154 = this.f37940i;
                um.c h189 = cVar.h("promoted_is_catalog_carousel_ad");
                bool15 = f30Var.X1;
                mVar154.e(h189, bool15);
            }
        }
        zArr155 = f30Var.f37485h3;
        if (zArr155.length > 154) {
            zArr276 = f30Var.f37485h3;
            if (zArr276[154]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar155 = this.f37940i;
                um.c h190 = cVar.h("promoted_is_congruency_enabled");
                bool14 = f30Var.Y1;
                mVar155.e(h190, bool14);
            }
        }
        zArr156 = f30Var.f37485h3;
        if (zArr156.length > 155) {
            zArr275 = f30Var.f37485h3;
            if (zArr275[155]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar156 = this.f37940i;
                um.c h191 = cVar.h("promoted_is_lead_ad");
                bool13 = f30Var.Z1;
                mVar156.e(h191, bool13);
            }
        }
        zArr157 = f30Var.f37485h3;
        if (zArr157.length > 156) {
            zArr274 = f30Var.f37485h3;
            if (zArr274[156]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar157 = this.f37940i;
                um.c h192 = cVar.h("promoted_is_max_video");
                bool12 = f30Var.f37450a2;
                mVar157.e(h192, bool12);
            }
        }
        zArr158 = f30Var.f37485h3;
        if (zArr158.length > 157) {
            zArr273 = f30Var.f37485h3;
            if (zArr273[157]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar158 = this.f37940i;
                um.c h193 = cVar.h("promoted_is_opaque_onetap_enabled");
                bool11 = f30Var.f37455b2;
                mVar158.e(h193, bool11);
            }
        }
        zArr159 = f30Var.f37485h3;
        if (zArr159.length > 158) {
            zArr272 = f30Var.f37485h3;
            if (zArr272[158]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar159 = this.f37940i;
                um.c h194 = cVar.h("promoted_is_personalized");
                bool10 = f30Var.f37460c2;
                mVar159.e(h194, bool10);
            }
        }
        zArr160 = f30Var.f37485h3;
        if (zArr160.length > 159) {
            zArr271 = f30Var.f37485h3;
            if (zArr271[159]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar160 = this.f37940i;
                um.c h195 = cVar.h("promoted_is_quiz");
                bool9 = f30Var.d2;
                mVar160.e(h195, bool9);
            }
        }
        zArr161 = f30Var.f37485h3;
        if (zArr161.length > 160) {
            zArr270 = f30Var.f37485h3;
            if (zArr270[160]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar161 = this.f37940i;
                um.c h196 = cVar.h("promoted_is_removable");
                bool8 = f30Var.f37469e2;
                mVar161.e(h196, bool8);
            }
        }
        zArr162 = f30Var.f37485h3;
        if (zArr162.length > 161) {
            zArr269 = f30Var.f37485h3;
            if (zArr269[161]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar162 = this.f37940i;
                um.c h197 = cVar.h("promoted_is_showcase");
                bool7 = f30Var.f37474f2;
                mVar162.e(h197, bool7);
            }
        }
        zArr163 = f30Var.f37485h3;
        if (zArr163.length > 162) {
            zArr268 = f30Var.f37485h3;
            if (zArr268[162]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar163 = this.f37940i;
                um.c h198 = cVar.h("promoted_is_sideswipe_disabled");
                bool6 = f30Var.f37479g2;
                mVar163.e(h198, bool6);
            }
        }
        zArr164 = f30Var.f37485h3;
        if (zArr164.length > 163) {
            zArr267 = f30Var.f37485h3;
            if (zArr267[163]) {
                if (this.M == null) {
                    this.M = oVar.h(n90.class).b();
                }
                nm.m mVar164 = this.M;
                um.c h199 = cVar.h("promoted_lead_form");
                n90Var = f30Var.f37484h2;
                mVar164.e(h199, n90Var);
            }
        }
        zArr165 = f30Var.f37485h3;
        if (zArr165.length > 164) {
            zArr266 = f30Var.f37485h3;
            if (zArr266[164]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar165 = this.V;
                um.c h200 = cVar.h("promoted_partnership_advertiser_name");
                str10 = f30Var.f37489i2;
                mVar165.e(h200, str10);
            }
        }
        zArr166 = f30Var.f37485h3;
        if (zArr166.length > 165) {
            zArr265 = f30Var.f37485h3;
            if (zArr265[165]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar166 = this.V;
                um.c h201 = cVar.h("promoted_partnership_attribution_name");
                str9 = f30Var.f37493j2;
                mVar166.e(h201, str9);
            }
        }
        zArr167 = f30Var.f37485h3;
        if (zArr167.length > 166) {
            zArr264 = f30Var.f37485h3;
            if (zArr264[166]) {
                if (this.N == null) {
                    this.N = oVar.h(z90.class).b();
                }
                nm.m mVar167 = this.N;
                um.c h202 = cVar.h("promoted_quiz_pin_data");
                z90Var = f30Var.f37497k2;
                mVar167.e(h202, z90Var);
            }
        }
        zArr168 = f30Var.f37485h3;
        if (zArr168.length > 167) {
            zArr263 = f30Var.f37485h3;
            if (zArr263[167]) {
                if (this.X == null) {
                    this.X = oVar.h(wy0.class).b();
                }
                nm.m mVar168 = this.X;
                um.c h203 = cVar.h("promoter");
                wy0Var3 = f30Var.f37501l2;
                mVar168.e(h203, wy0Var3);
            }
        }
        zArr169 = f30Var.f37485h3;
        if (zArr169.length > 168) {
            zArr262 = f30Var.f37485h3;
            if (zArr262[168]) {
                if (this.C == null) {
                    this.C = oVar.g(new TypeToken<Map<String, bg>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$15
                    }).b();
                }
                nm.m mVar169 = this.C;
                um.c h204 = cVar.h("public_creator_analytics");
                map3 = f30Var.f37505m2;
                mVar169.e(h204, map3);
            }
        }
        zArr170 = f30Var.f37485h3;
        if (zArr170.length > 169) {
            zArr261 = f30Var.f37485h3;
            if (zArr261[169]) {
                if (this.f37949r == null) {
                    this.f37949r = oVar.h(Integer.class).b();
                }
                nm.m mVar170 = this.f37949r;
                um.c h205 = cVar.h("quality_state");
                num10 = f30Var.f37509n2;
                mVar170.e(h205, num10);
            }
        }
        zArr171 = f30Var.f37485h3;
        if (zArr171.length > 170) {
            zArr260 = f30Var.f37485h3;
            if (zArr260[170]) {
                if (this.f37949r == null) {
                    this.f37949r = oVar.h(Integer.class).b();
                }
                nm.m mVar171 = this.f37949r;
                um.c h206 = cVar.h("reaction_by_me");
                num9 = f30Var.f37513o2;
                mVar171.e(h206, num9);
            }
        }
        zArr172 = f30Var.f37485h3;
        if (zArr172.length > 171) {
            zArr259 = f30Var.f37485h3;
            if (zArr259[171]) {
                if (this.E == null) {
                    this.E = oVar.g(new TypeToken<Map<String, Integer>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$16
                    }).b();
                }
                nm.m mVar172 = this.E;
                um.c h207 = cVar.h("reaction_counts");
                map2 = f30Var.f37517p2;
                mVar172.e(h207, map2);
            }
        }
        zArr173 = f30Var.f37485h3;
        if (zArr173.length > 172) {
            zArr258 = f30Var.f37485h3;
            if (zArr258[172]) {
                if (this.O == null) {
                    this.O = oVar.h(oc0.class).b();
                }
                nm.m mVar173 = this.O;
                um.c h208 = cVar.h("recommendation_reason");
                oc0Var = f30Var.f37521q2;
                mVar173.e(h208, oc0Var);
            }
        }
        zArr174 = f30Var.f37485h3;
        if (zArr174.length > 173) {
            zArr257 = f30Var.f37485h3;
            if (zArr257[173]) {
                if (this.f37949r == null) {
                    this.f37949r = oVar.h(Integer.class).b();
                }
                nm.m mVar174 = this.f37949r;
                um.c h209 = cVar.h("repin_count");
                num8 = f30Var.f37525r2;
                mVar174.e(h209, num8);
            }
        }
        zArr175 = f30Var.f37485h3;
        if (zArr175.length > 174) {
            zArr256 = f30Var.f37485h3;
            if (zArr256[174]) {
                if (this.A == null) {
                    this.A = oVar.g(new TypeToken<List<wy0>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$17
                    }).b();
                }
                nm.m mVar175 = this.A;
                um.c h210 = cVar.h("repin_users");
                list5 = f30Var.f37529s2;
                mVar175.e(h210, list5);
            }
        }
        zArr176 = f30Var.f37485h3;
        if (zArr176.length > 175) {
            zArr255 = f30Var.f37485h3;
            if (zArr255[175]) {
                if (this.P == null) {
                    this.P = oVar.h(oe0.class).b();
                }
                nm.m mVar176 = this.P;
                um.c h211 = cVar.h("rich_metadata");
                oe0Var = f30Var.f37533t2;
                mVar176.e(h211, oe0Var);
            }
        }
        zArr177 = f30Var.f37485h3;
        if (zArr177.length > 176) {
            zArr254 = f30Var.f37485h3;
            if (zArr254[176]) {
                if (this.Q == null) {
                    this.Q = oVar.h(se0.class).b();
                }
                nm.m mVar177 = this.Q;
                um.c h212 = cVar.h("rich_summary");
                se0Var = f30Var.f37537u2;
                mVar177.e(h212, se0Var);
            }
        }
        zArr178 = f30Var.f37485h3;
        if (zArr178.length > 177) {
            zArr253 = f30Var.f37485h3;
            if (zArr253[177]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar178 = this.V;
                um.c h213 = cVar.h("root_pin_id");
                str8 = f30Var.f37541v2;
                mVar178.e(h213, str8);
            }
        }
        zArr179 = f30Var.f37485h3;
        if (zArr179.length > 178) {
            zArr252 = f30Var.f37485h3;
            if (zArr252[178]) {
                if (this.F == null) {
                    this.F = oVar.g(new TypeToken<Map<String, ig0>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$18
                    }).b();
                }
                nm.m mVar179 = this.F;
                um.c h214 = cVar.h("scene_data");
                map = f30Var.f37545w2;
                mVar179.e(h214, map);
            }
        }
        zArr180 = f30Var.f37485h3;
        if (zArr180.length > 179) {
            zArr251 = f30Var.f37485h3;
            if (zArr251[179]) {
                if (this.f37939h == null) {
                    this.f37939h = oVar.h(ba.class).b();
                }
                nm.m mVar180 = this.f37939h;
                um.c h215 = cVar.h("section");
                baVar = f30Var.f37549x2;
                mVar180.e(h215, baVar);
            }
        }
        zArr181 = f30Var.f37485h3;
        if (zArr181.length > 180) {
            zArr250 = f30Var.f37485h3;
            if (zArr250[180]) {
                if (this.f37949r == null) {
                    this.f37949r = oVar.h(Integer.class).b();
                }
                nm.m mVar181 = this.f37949r;
                um.c h216 = cVar.h("share_count");
                num7 = f30Var.f37553y2;
                mVar181.e(h216, num7);
            }
        }
        zArr182 = f30Var.f37485h3;
        if (zArr182.length > 181) {
            zArr249 = f30Var.f37485h3;
            if (zArr249[181]) {
                if (this.f37953v == null) {
                    this.f37953v = oVar.g(new TypeToken<List<Integer>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$19
                    }).b();
                }
                nm.m mVar182 = this.f37953v;
                um.c h217 = cVar.h("shopping_flags");
                list4 = f30Var.f37557z2;
                mVar182.e(h217, list4);
            }
        }
        zArr183 = f30Var.f37485h3;
        if (zArr183.length > 182) {
            zArr248 = f30Var.f37485h3;
            if (zArr248[182]) {
                if (this.f37949r == null) {
                    this.f37949r = oVar.h(Integer.class).b();
                }
                nm.m mVar183 = this.f37949r;
                um.c h218 = cVar.h("shopping_mdl_browser_type");
                num6 = f30Var.A2;
                mVar183.e(h218, num6);
            }
        }
        zArr184 = f30Var.f37485h3;
        if (zArr184.length > 183) {
            zArr247 = f30Var.f37485h3;
            if (zArr247[183]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar184 = this.f37940i;
                um.c h219 = cVar.h("shopping_rec_disabled");
                bool5 = f30Var.B2;
                mVar184.e(h219, bool5);
            }
        }
        zArr185 = f30Var.f37485h3;
        if (zArr185.length > 184) {
            zArr246 = f30Var.f37485h3;
            if (zArr246[184]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar185 = this.f37940i;
                um.c h220 = cVar.h("should_animate_follow");
                bool4 = f30Var.C2;
                mVar185.e(h220, bool4);
            }
        }
        zArr186 = f30Var.f37485h3;
        if (zArr186.length > 185) {
            zArr245 = f30Var.f37485h3;
            if (zArr245[185]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar186 = this.f37940i;
                um.c h221 = cVar.h("should_mute");
                bool3 = f30Var.D2;
                mVar186.e(h221, bool3);
            }
        }
        zArr187 = f30Var.f37485h3;
        if (zArr187.length > 186) {
            zArr244 = f30Var.f37485h3;
            if (zArr244[186]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar187 = this.f37940i;
                um.c h222 = cVar.h("should_open_in_stream");
                bool2 = f30Var.E2;
                mVar187.e(h222, bool2);
            }
        }
        zArr188 = f30Var.f37485h3;
        if (zArr188.length > 187) {
            zArr243 = f30Var.f37485h3;
            if (zArr243[187]) {
                if (this.R == null) {
                    this.R = oVar.h(fi0.class).b();
                }
                nm.m mVar188 = this.R;
                um.c h223 = cVar.h("shuffle");
                fi0Var = f30Var.F2;
                mVar188.e(h223, fi0Var);
            }
        }
        zArr189 = f30Var.f37485h3;
        if (zArr189.length > 188) {
            zArr242 = f30Var.f37485h3;
            if (zArr242[188]) {
                if (this.S == null) {
                    this.S = oVar.h(hi0.class).b();
                }
                nm.m mVar189 = this.S;
                um.c h224 = cVar.h("shuffle_asset");
                hi0Var = f30Var.G2;
                mVar189.e(h224, hi0Var);
            }
        }
        zArr190 = f30Var.f37485h3;
        if (zArr190.length > 189) {
            zArr241 = f30Var.f37485h3;
            if (zArr241[189]) {
                if (this.f37955x == null) {
                    this.f37955x = oVar.g(new TypeToken<List<p20>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$20
                    }).b();
                }
                nm.m mVar190 = this.f37955x;
                um.c h225 = cVar.h("social_insight_pear_styles");
                list3 = f30Var.H2;
                mVar190.e(h225, list3);
            }
        }
        zArr191 = f30Var.f37485h3;
        if (zArr191.length > 190) {
            zArr240 = f30Var.f37485h3;
            if (zArr240[190]) {
                if (this.f37950s == null) {
                    this.f37950s = oVar.h(zs.class).b();
                }
                nm.m mVar191 = this.f37950s;
                um.c h226 = cVar.h("source_interest");
                zsVar = f30Var.I2;
                mVar191.e(h226, zsVar);
            }
        }
        zArr192 = f30Var.f37485h3;
        if (zArr192.length > 191) {
            zArr239 = f30Var.f37485h3;
            if (zArr239[191]) {
                if (this.T == null) {
                    this.T = oVar.h(rj0.class).b();
                }
                nm.m mVar192 = this.T;
                um.c h227 = cVar.h("sponsorship");
                rj0Var = f30Var.J2;
                mVar192.e(h227, rj0Var);
            }
        }
        zArr193 = f30Var.f37485h3;
        if (zArr193.length > 192) {
            zArr238 = f30Var.f37485h3;
            if (zArr238[192]) {
                if (this.U == null) {
                    this.U = oVar.h(dl0.class).b();
                }
                nm.m mVar193 = this.U;
                um.c h228 = cVar.h("story_pin_data");
                dl0Var = f30Var.K2;
                mVar193.e(h228, dl0Var);
            }
        }
        zArr194 = f30Var.f37485h3;
        if (zArr194.length > 193) {
            zArr237 = f30Var.f37485h3;
            if (zArr237[193]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar194 = this.V;
                um.c h229 = cVar.h("story_pin_data_id");
                str7 = f30Var.L2;
                mVar194.e(h229, str7);
            }
        }
        zArr195 = f30Var.f37485h3;
        if (zArr195.length > 194) {
            zArr236 = f30Var.f37485h3;
            if (zArr236[194]) {
                if (this.f37940i == null) {
                    this.f37940i = oVar.h(Boolean.class).b();
                }
                nm.m mVar195 = this.f37940i;
                um.c h230 = cVar.h("subscribed_to_notifications");
                bool = f30Var.M2;
                mVar195.e(h230, bool);
            }
        }
        zArr196 = f30Var.f37485h3;
        if (zArr196.length > 195) {
            zArr235 = f30Var.f37485h3;
            if (zArr235[195]) {
                if (this.f37949r == null) {
                    this.f37949r = oVar.h(Integer.class).b();
                }
                nm.m mVar196 = this.f37949r;
                um.c h231 = cVar.h("take_default_template_type");
                num5 = f30Var.N2;
                mVar196.e(h231, num5);
            }
        }
        zArr197 = f30Var.f37485h3;
        if (zArr197.length > 196) {
            zArr234 = f30Var.f37485h3;
            if (zArr234[196]) {
                if (this.X == null) {
                    this.X = oVar.h(wy0.class).b();
                }
                nm.m mVar197 = this.X;
                um.c h232 = cVar.h("third_party_pin_owner");
                wy0Var2 = f30Var.O2;
                mVar197.e(h232, wy0Var2);
            }
        }
        zArr198 = f30Var.f37485h3;
        if (zArr198.length > 197) {
            zArr233 = f30Var.f37485h3;
            if (zArr233[197]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar198 = this.V;
                um.c h233 = cVar.h("title");
                str6 = f30Var.P2;
                mVar198.e(h233, str6);
            }
        }
        zArr199 = f30Var.f37485h3;
        if (zArr199.length > 198) {
            zArr232 = f30Var.f37485h3;
            if (zArr232[198]) {
                if (this.W == null) {
                    this.W = oVar.h(dw0.class).b();
                }
                nm.m mVar199 = this.W;
                um.c h234 = cVar.h("top_community_insight");
                dw0Var = f30Var.Q2;
                mVar199.e(h234, dw0Var);
            }
        }
        zArr200 = f30Var.f37485h3;
        if (zArr200.length > 199) {
            zArr231 = f30Var.f37485h3;
            if (zArr231[199]) {
                if (this.f37949r == null) {
                    this.f37949r = oVar.h(Integer.class).b();
                }
                nm.m mVar200 = this.f37949r;
                um.c h235 = cVar.h("top_interest");
                num4 = f30Var.R2;
                mVar200.e(h235, num4);
            }
        }
        zArr201 = f30Var.f37485h3;
        if (zArr201.length > 200) {
            zArr230 = f30Var.f37485h3;
            if (zArr230[200]) {
                if (this.f37949r == null) {
                    this.f37949r = oVar.h(Integer.class).b();
                }
                nm.m mVar201 = this.f37949r;
                um.c h236 = cVar.h("total_reaction_count");
                num3 = f30Var.S2;
                mVar201.e(h236, num3);
            }
        }
        zArr202 = f30Var.f37485h3;
        if (zArr202.length > 201) {
            zArr229 = f30Var.f37485h3;
            if (zArr229[201]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar202 = this.V;
                um.c h237 = cVar.h("tracked_link");
                str5 = f30Var.T2;
                mVar202.e(h237, str5);
            }
        }
        zArr203 = f30Var.f37485h3;
        if (zArr203.length > 202) {
            zArr228 = f30Var.f37485h3;
            if (zArr228[202]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar203 = this.V;
                um.c h238 = cVar.h("tracking_params");
                str4 = f30Var.U2;
                mVar203.e(h238, str4);
            }
        }
        zArr204 = f30Var.f37485h3;
        if (zArr204.length > 203) {
            zArr227 = f30Var.f37485h3;
            if (zArr227[203]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar204 = this.V;
                um.c h239 = cVar.h("type");
                str3 = f30Var.V2;
                mVar204.e(h239, str3);
            }
        }
        zArr205 = f30Var.f37485h3;
        if (zArr205.length > 204) {
            zArr226 = f30Var.f37485h3;
            if (zArr226[204]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar205 = this.V;
                um.c h240 = cVar.h("unified_user_note");
                str2 = f30Var.W2;
                mVar205.e(h240, str2);
            }
        }
        zArr206 = f30Var.f37485h3;
        if (zArr206.length > 205) {
            zArr225 = f30Var.f37485h3;
            if (zArr225[205]) {
                if (this.f37943l == null) {
                    this.f37943l = oVar.h(Date.class).b();
                }
                nm.m mVar206 = this.f37943l;
                um.c h241 = cVar.h("updated_at");
                date = f30Var.X2;
                mVar206.e(h241, date);
            }
        }
        zArr207 = f30Var.f37485h3;
        if (zArr207.length > 206) {
            zArr224 = f30Var.f37485h3;
            if (zArr224[206]) {
                if (this.f37957z == null) {
                    this.f37957z = oVar.g(new TypeToken<List<ts0>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$21
                    }).b();
                }
                nm.m mVar207 = this.f37957z;
                um.c h242 = cVar.h("user_mention_tags");
                list2 = f30Var.Y2;
                mVar207.e(h242, list2);
            }
        }
        zArr208 = f30Var.f37485h3;
        if (zArr208.length > 207) {
            zArr223 = f30Var.f37485h3;
            if (zArr223[207]) {
                if (this.V == null) {
                    this.V = oVar.h(String.class).b();
                }
                nm.m mVar208 = this.V;
                um.c h243 = cVar.h("utm_link");
                str = f30Var.Z2;
                mVar208.e(h243, str);
            }
        }
        zArr209 = f30Var.f37485h3;
        if (zArr209.length > 208) {
            zArr222 = f30Var.f37485h3;
            if (zArr222[208]) {
                if (this.X == null) {
                    this.X = oVar.h(wy0.class).b();
                }
                nm.m mVar209 = this.X;
                um.c h244 = cVar.h("via_pinner");
                wy0Var = f30Var.f37451a3;
                mVar209.e(h244, wy0Var);
            }
        }
        zArr210 = f30Var.f37485h3;
        if (zArr210.length > 209) {
            zArr221 = f30Var.f37485h3;
            if (zArr221[209]) {
                if (this.f37949r == null) {
                    this.f37949r = oVar.h(Integer.class).b();
                }
                nm.m mVar210 = this.f37949r;
                um.c h245 = cVar.h("video_status");
                num2 = f30Var.f37456b3;
                mVar210.e(h245, num2);
            }
        }
        zArr211 = f30Var.f37485h3;
        if (zArr211.length > 210) {
            zArr220 = f30Var.f37485h3;
            if (zArr220[210]) {
                if (this.f37931a0 == null) {
                    this.f37931a0 = oVar.h(o01.class).b();
                }
                nm.m mVar211 = this.f37931a0;
                um.c h246 = cVar.h("video_status_message");
                o01Var = f30Var.f37461c3;
                mVar211.e(h246, o01Var);
            }
        }
        zArr212 = f30Var.f37485h3;
        if (zArr212.length > 211) {
            zArr219 = f30Var.f37485h3;
            if (zArr219[211]) {
                if (this.Z == null) {
                    this.Z = oVar.h(b01.class).b();
                }
                nm.m mVar212 = this.Z;
                um.c h247 = cVar.h("videos");
                b01Var = f30Var.f37465d3;
                mVar212.e(h247, b01Var);
            }
        }
        zArr213 = f30Var.f37485h3;
        if (zArr213.length > 212) {
            zArr218 = f30Var.f37485h3;
            if (zArr218[212]) {
                if (this.f37933b0 == null) {
                    this.f37933b0 = oVar.h(s01.class).b();
                }
                nm.m mVar213 = this.f37933b0;
                um.c h248 = cVar.h("virtual_try_on_data");
                s01Var = f30Var.f37470e3;
                mVar213.e(h248, s01Var);
            }
        }
        zArr214 = f30Var.f37485h3;
        if (zArr214.length > 213) {
            zArr217 = f30Var.f37485h3;
            if (zArr217[213]) {
                if (this.f37949r == null) {
                    this.f37949r = oVar.h(Integer.class).b();
                }
                nm.m mVar214 = this.f37949r;
                um.c h249 = cVar.h("virtual_try_on_type");
                num = f30Var.f37475f3;
                mVar214.e(h249, num);
            }
        }
        zArr215 = f30Var.f37485h3;
        if (zArr215.length > 214) {
            zArr216 = f30Var.f37485h3;
            if (zArr216[214]) {
                if (this.B == null) {
                    this.B = oVar.g(new TypeToken<List<q11>>(this) { // from class: com.pinterest.api.model.Pin$PinTypeAdapter$22
                    }).b();
                }
                nm.m mVar215 = this.B;
                um.c h250 = cVar.h("visual_objects");
                list = f30Var.f37480g3;
                mVar215.e(h250, list);
            }
        }
        cVar.g();
    }
}
