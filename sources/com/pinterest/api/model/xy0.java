package com.pinterest.api.model;

import com.appsflyer.AdRevenueScheme;
import com.google.gson.reflect.TypeToken;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class xy0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43831a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43832b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f43833c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f43834d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f43835e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f43836f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f43837g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f43838h;

    /* renamed from: i, reason: collision with root package name */
    public nm.m f43839i;

    /* renamed from: j, reason: collision with root package name */
    public nm.m f43840j;

    /* renamed from: k, reason: collision with root package name */
    public nm.m f43841k;

    /* renamed from: l, reason: collision with root package name */
    public nm.m f43842l;

    /* renamed from: m, reason: collision with root package name */
    public nm.m f43843m;

    /* renamed from: n, reason: collision with root package name */
    public nm.m f43844n;

    /* renamed from: o, reason: collision with root package name */
    public nm.m f43845o;

    /* renamed from: p, reason: collision with root package name */
    public nm.m f43846p;

    /* renamed from: q, reason: collision with root package name */
    public nm.m f43847q;

    /* renamed from: r, reason: collision with root package name */
    public nm.m f43848r;

    /* renamed from: s, reason: collision with root package name */
    public nm.m f43849s;

    /* renamed from: t, reason: collision with root package name */
    public nm.m f43850t;

    public xy0(nm.o oVar) {
        this.f43831a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final wy0 c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        vy0 f23 = wy0.f2();
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2126243030:
                    if (k03.equals("profile_discovered_public")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -2119108802:
                    if (k03.equals("implicitly_followed_by_me")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -2118185013:
                    if (k03.equals("website_url")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -2109887664:
                    if (k03.equals("recent_story_pin_images")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -2107390546:
                    if (k03.equals("follower_count")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -2092131245:
                    if (k03.equals("image_small_url")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case -2081612553:
                    if (k03.equals("is_parental_control_passcode_enabled")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case -1999090628:
                    if (k03.equals("last_pin_save_time")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case -1980184278:
                    if (k03.equals("quick_saves_pin_count")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case -1939755710:
                    if (k03.equals("is_in_dsa_countries")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case -1894541219:
                    if (k03.equals("weight_loss_ads_opted_out")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case -1879367706:
                    if (k03.equals("teen_safety_options_url")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case -1872399824:
                    if (k03.equals("is_regulated_by_aadc")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case -1870202921:
                    if (k03.equals("can_edit_search_privacy")) {
                        c13 = '\r';
                        break;
                    }
                    break;
                case -1825774636:
                    if (k03.equals("connected_to_facebook")) {
                        c13 = 14;
                        break;
                    }
                    break;
                case -1808139924:
                    if (k03.equals("is_gco_account")) {
                        c13 = 15;
                        break;
                    }
                    break;
                case -1782602080:
                    if (k03.equals("has_password")) {
                        c13 = 16;
                        break;
                    }
                    break;
                case -1677176261:
                    if (k03.equals("full_name")) {
                        c13 = 17;
                        break;
                    }
                    break;
                case -1672833015:
                    if (k03.equals("is_name_eligible_for_lead_form_autofill")) {
                        c13 = 18;
                        break;
                    }
                    break;
                case -1620866987:
                    if (k03.equals("connected_to_youtube")) {
                        c13 = 19;
                        break;
                    }
                    break;
                case -1611410758:
                    if (k03.equals("personalize_from_offsite_browsing")) {
                        c13 = 20;
                        break;
                    }
                    break;
                case -1601404029:
                    if (k03.equals("allow_switch_between_private_and_public_profile")) {
                        c13 = 21;
                        break;
                    }
                    break;
                case -1517158411:
                    if (k03.equals("verified_user_websites")) {
                        c13 = 22;
                        break;
                    }
                    break;
                case -1499886491:
                    if (k03.equals("instagram_token_status")) {
                        c13 = 23;
                        break;
                    }
                    break;
                case -1483491085:
                    if (k03.equals("search_privacy_enabled")) {
                        c13 = 24;
                        break;
                    }
                    break;
                case -1470933202:
                    if (k03.equals("profile_highlight_count")) {
                        c13 = 25;
                        break;
                    }
                    break;
                case -1470844941:
                    if (k03.equals("is_age_eligible_for_lead_form_autofill")) {
                        c13 = 26;
                        break;
                    }
                    break;
                case -1463758578:
                    if (k03.equals("most_recent_board_sort_order")) {
                        c13 = 27;
                        break;
                    }
                    break;
                case -1409963943:
                    if (k03.equals("parental_control_anonymized_email")) {
                        c13 = 28;
                        break;
                    }
                    break;
                case -1387569546:
                    if (k03.equals("board_count")) {
                        c13 = 29;
                        break;
                    }
                    break;
                case -1376459578:
                    if (k03.equals("recent_pin_images")) {
                        c13 = 30;
                        break;
                    }
                    break;
                case -1249512767:
                    if (k03.equals("gender")) {
                        c13 = 31;
                        break;
                    }
                    break;
                case -1183814557:
                    if (k03.equals("is_under_18")) {
                        c13 = ' ';
                        break;
                    }
                    break;
                case -1113119520:
                    if (k03.equals("contextual_pin_image_urls")) {
                        c13 = '!';
                        break;
                    }
                    break;
                case -1097462182:
                    if (k03.equals("locale")) {
                        c13 = '\"';
                        break;
                    }
                    break;
                case -1063509047:
                    if (k03.equals("messaging_permissions")) {
                        c13 = '#';
                        break;
                    }
                    break;
                case -1062616221:
                    if (k03.equals("is_story_pin_creator")) {
                        c13 = '$';
                        break;
                    }
                    break;
                case -1047842393:
                    if (k03.equals("impressum_url")) {
                        c13 = '%';
                        break;
                    }
                    break;
                case -1003854816:
                    if (k03.equals("owners")) {
                        c13 = '&';
                        break;
                    }
                    break;
                case -994687732:
                    if (k03.equals("pronouns")) {
                        c13 = '\'';
                        break;
                    }
                    break;
                case -940201117:
                    if (k03.equals("connected_to_etsy")) {
                        c13 = '(';
                        break;
                    }
                    break;
                case -940003326:
                    if (k03.equals("connected_to_line")) {
                        c13 = ')';
                        break;
                    }
                    break;
                case -863297155:
                    if (k03.equals("is_parental_control_passcode_verification_pending")) {
                        c13 = '*';
                        break;
                    }
                    break;
                case -839170288:
                    if (k03.equals("avatar_color_index")) {
                        c13 = '+';
                        break;
                    }
                    break;
                case -792929080:
                    if (k03.equals("partner")) {
                        c13 = ',';
                        break;
                    }
                    break;
                case -756613026:
                    if (k03.equals("show_all_pins")) {
                        c13 = '-';
                        break;
                    }
                    break;
                case -729506399:
                    if (k03.equals("profile_cover")) {
                        c13 = '.';
                        break;
                    }
                    break;
                case -729372461:
                    if (k03.equals("scheduled_pin_count")) {
                        c13 = '/';
                        break;
                    }
                    break;
                case -715971747:
                    if (k03.equals("profile_reach")) {
                        c13 = '0';
                        break;
                    }
                    break;
                case -712154024:
                    if (k03.equals("profile_views")) {
                        c13 = '1';
                        break;
                    }
                    break;
                case -678974426:
                    if (k03.equals("resurrection_info")) {
                        c13 = '2';
                        break;
                    }
                    break;
                case -624650643:
                    if (k03.equals("blocked_by_me")) {
                        c13 = '3';
                        break;
                    }
                    break;
                case -604167707:
                    if (k03.equals("pin_count")) {
                        c13 = '4';
                        break;
                    }
                    break;
                case -547199506:
                    if (k03.equals("popular_product_images")) {
                        c13 = '5';
                        break;
                    }
                    break;
                case -478400103:
                    if (k03.equals("archived_board_count")) {
                        c13 = '6';
                        break;
                    }
                    break;
                case -455503874:
                    if (k03.equals("is_primary_website_verified")) {
                        c13 = '7';
                        break;
                    }
                    break;
                case -357240360:
                    if (k03.equals("is_private_profile")) {
                        c13 = '8';
                        break;
                    }
                    break;
                case -265847560:
                    if (k03.equals("exclude_from_search")) {
                        c13 = '9';
                        break;
                    }
                    break;
                case -265713450:
                    if (k03.equals("username")) {
                        c13 = ':';
                        break;
                    }
                    break;
                case -238344414:
                    if (k03.equals("board_sort_type")) {
                        c13 = ';';
                        break;
                    }
                    break;
                case -215652351:
                    if (k03.equals("ads_only_profile_site")) {
                        c13 = '<';
                        break;
                    }
                    break;
                case -171132853:
                    if (k03.equals("facebook_publish_stream_enabled")) {
                        c13 = '=';
                        break;
                    }
                    break;
                case -160985414:
                    if (k03.equals("first_name")) {
                        c13 = '>';
                        break;
                    }
                    break;
                case -117556152:
                    if (k03.equals("dominant_color_css")) {
                        c13 = '?';
                        break;
                    }
                    break;
                case -98820795:
                    if (k03.equals("collage_draft_count")) {
                        c13 = '@';
                        break;
                    }
                    break;
                case -95906779:
                    if (k03.equals("hide_birthdate_for_business")) {
                        c13 = 'A';
                        break;
                    }
                    break;
                case -67594391:
                    if (k03.equals("subscribed_to_notifications")) {
                        c13 = 'B';
                        break;
                    }
                    break;
                case -36194627:
                    if (k03.equals("explicit_board_following_count")) {
                        c13 = 'C';
                        break;
                    }
                    break;
                case -26763580:
                    if (k03.equals("explicitly_following_me")) {
                        c13 = 'D';
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 'E';
                        break;
                    }
                    break;
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = 'F';
                        break;
                    }
                    break;
                case 26868616:
                    if (k03.equals("is_default_image")) {
                        c13 = 'G';
                        break;
                    }
                    break;
                case 77572976:
                    if (k03.equals("is_sso_user")) {
                        c13 = 'H';
                        break;
                    }
                    break;
                case 87942565:
                    if (k03.equals("has_archived_boards")) {
                        c13 = 'I';
                        break;
                    }
                    break;
                case 89975233:
                    if (k03.equals("show_personal_boutique")) {
                        c13 = 'J';
                        break;
                    }
                    break;
                case 92611469:
                    if (k03.equals("about")) {
                        c13 = 'K';
                        break;
                    }
                    break;
                case 94717811:
                    if (k03.equals("pins_done_count")) {
                        c13 = 'L';
                        break;
                    }
                    break;
                case 96619420:
                    if (k03.equals("email")) {
                        c13 = 'M';
                        break;
                    }
                    break;
                case 205765818:
                    if (k03.equals("has_quick_create_board")) {
                        c13 = 'N';
                        break;
                    }
                    break;
                case 216961255:
                    if (k03.equals("is_inspirational_merchant")) {
                        c13 = 'O';
                        break;
                    }
                    break;
                case 228096501:
                    if (k03.equals("email_status")) {
                        c13 = 'P';
                        break;
                    }
                    break;
                case 275612090:
                    if (k03.equals("is_ads_only_profile")) {
                        c13 = 'Q';
                        break;
                    }
                    break;
                case 286050542:
                    if (k03.equals("should_default_comments_off")) {
                        c13 = 'R';
                        break;
                    }
                    break;
                case 289310855:
                    if (k03.equals("image_large_url")) {
                        c13 = 'S';
                        break;
                    }
                    break;
                case 349325139:
                    if (k03.equals("show_shopping_list")) {
                        c13 = 'T';
                        break;
                    }
                    break;
                case 356425680:
                    if (k03.equals("is_email_eligible_for_lead_form_autofill")) {
                        c13 = 'U';
                        break;
                    }
                    break;
                case 386703308:
                    if (k03.equals("partnership_opt_in")) {
                        c13 = 'V';
                        break;
                    }
                    break;
                case 398623591:
                    if (k03.equals("secret_board_count")) {
                        c13 = 'W';
                        break;
                    }
                    break;
                case 409905620:
                    if (k03.equals("dsa_opted_out")) {
                        c13 = 'X';
                        break;
                    }
                    break;
                case 458439203:
                    if (k03.equals("is_employee")) {
                        c13 = 'Y';
                        break;
                    }
                    break;
                case 458536417:
                    if (k03.equals("following_count")) {
                        c13 = 'Z';
                        break;
                    }
                    break;
                case 539369164:
                    if (k03.equals("interest_following_count")) {
                        c13 = '[';
                        break;
                    }
                    break;
                case 670437119:
                    if (k03.equals("is_gender_eligible_for_lead_form_autofill")) {
                        c13 = '\\';
                        break;
                    }
                    break;
                case 707380915:
                    if (k03.equals("is_partner")) {
                        c13 = ']';
                        break;
                    }
                    break;
                case 733894531:
                    if (k03.equals("third_party_marketing_tracking_enabled")) {
                        c13 = '^';
                        break;
                    }
                    break;
                case 751805525:
                    if (k03.equals("verified_identity")) {
                        c13 = '_';
                        break;
                    }
                    break;
                case 798049601:
                    if (k03.equals("additional_locales")) {
                        c13 = '`';
                        break;
                    }
                    break;
                case 811717455:
                    if (k03.equals("custom_gender")) {
                        c13 = 'a';
                        break;
                    }
                    break;
                case 826368228:
                    if (k03.equals("invisible_board_count")) {
                        c13 = 'b';
                        break;
                    }
                    break;
                case 827639296:
                    if (k03.equals("ads_customize_from_conversion")) {
                        c13 = 'c';
                        break;
                    }
                    break;
                case 863147785:
                    if (k03.equals("image_medium_url")) {
                        c13 = 'd';
                        break;
                    }
                    break;
                case 920257587:
                    if (k03.equals("connected_to_gplus")) {
                        c13 = 'e';
                        break;
                    }
                    break;
                case 923311072:
                    if (k03.equals("live_creator_type")) {
                        c13 = 'f';
                        break;
                    }
                    break;
                case 938485628:
                    if (k03.equals("age_in_years")) {
                        c13 = 'g';
                        break;
                    }
                    break;
                case 956988338:
                    if (k03.equals("has_showcase")) {
                        c13 = 'h';
                        break;
                    }
                    break;
                case 957831062:
                    if (k03.equals(AdRevenueScheme.COUNTRY)) {
                        c13 = 'i';
                        break;
                    }
                    break;
                case 980293548:
                    if (k03.equals("has_quicksave_board")) {
                        c13 = 'j';
                        break;
                    }
                    break;
                case 1027322228:
                    if (k03.equals("has_published_pins")) {
                        c13 = 'k';
                        break;
                    }
                    break;
                case 1033298020:
                    if (k03.equals("connected_to_instagram")) {
                        c13 = 'l';
                        break;
                    }
                    break;
                case 1034895800:
                    if (k03.equals("verified_domains")) {
                        c13 = 'm';
                        break;
                    }
                    break;
                case 1069376125:
                    if (k03.equals("birthday")) {
                        c13 = 'n';
                        break;
                    }
                    break;
                case 1109350755:
                    if (k03.equals("opt_in_private_account")) {
                        c13 = 'o';
                        break;
                    }
                    break;
                case 1116259594:
                    if (k03.equals("is_country_eligible_for_lead_form_autofill")) {
                        c13 = 'p';
                        break;
                    }
                    break;
                case 1157686991:
                    if (k03.equals("explicitly_followed_by_me")) {
                        c13 = 'q';
                        break;
                    }
                    break;
                case 1169636447:
                    if (k03.equals("private_story_pin_count")) {
                        c13 = 'r';
                        break;
                    }
                    break;
                case 1190353748:
                    if (k03.equals("show_creator_profile")) {
                        c13 = 's';
                        break;
                    }
                    break;
                case 1279021827:
                    if (k03.equals("is_candidate_for_parental_control_passcode")) {
                        c13 = 't';
                        break;
                    }
                    break;
                case 1285125719:
                    if (k03.equals("image_xlarge_url")) {
                        c13 = 'u';
                        break;
                    }
                    break;
                case 1303761379:
                    if (k03.equals("eligible_for_wishlist")) {
                        c13 = 'v';
                        break;
                    }
                    break;
                case 1340023434:
                    if (k03.equals("connected_to_amazon_handshake")) {
                        c13 = 'w';
                        break;
                    }
                    break;
                case 1340069708:
                    if (k03.equals("auto_tagging_status")) {
                        c13 = 'x';
                        break;
                    }
                    break;
                case 1341021848:
                    if (k03.equals("explicit_user_following_count")) {
                        c13 = 'y';
                        break;
                    }
                    break;
                case 1358667799:
                    if (k03.equals("instagram_data")) {
                        c13 = 'z';
                        break;
                    }
                    break;
                case 1369680106:
                    if (k03.equals("created_at")) {
                        c13 = '{';
                        break;
                    }
                    break;
                case 1388054954:
                    if (k03.equals("video_views")) {
                        c13 = '|';
                        break;
                    }
                    break;
                case 1428774772:
                    if (k03.equals("has_catalog")) {
                        c13 = '}';
                        break;
                    }
                    break;
                case 1439109921:
                    if (k03.equals("video_pin_count")) {
                        c13 = '~';
                        break;
                    }
                    break;
                case 1495486486:
                    if (k03.equals("user_recommendation_reason")) {
                        c13 = 127;
                        break;
                    }
                    break;
                case 1605219315:
                    if (k03.equals("show_discovered_feed")) {
                        c13 = 128;
                        break;
                    }
                    break;
                case 1619461800:
                    if (k03.equals("has_pin_clusters")) {
                        c13 = 129;
                        break;
                    }
                    break;
                case 1629657875:
                    if (k03.equals("has_created_all_clusters")) {
                        c13 = 130;
                        break;
                    }
                    break;
                case 1650076092:
                    if (k03.equals("eligible_profile_tabs")) {
                        c13 = 131;
                        break;
                    }
                    break;
                case 1657545787:
                    if (k03.equals("login_state")) {
                        c13 = 132;
                        break;
                    }
                    break;
                case 1702091886:
                    if (k03.equals("businesses")) {
                        c13 = 133;
                        break;
                    }
                    break;
                case 1716809545:
                    if (k03.equals("ip_stela_rec_disabled")) {
                        c13 = 134;
                        break;
                    }
                    break;
                case 1748938161:
                    if (k03.equals("creator_level")) {
                        c13 = 135;
                        break;
                    }
                    break;
                case 1805364147:
                    if (k03.equals("ccpa_opted_out")) {
                        c13 = 136;
                        break;
                    }
                    break;
                case 1842789770:
                    if (k03.equals("is_verified_merchant")) {
                        c13 = 137;
                        break;
                    }
                    break;
                case 1842853935:
                    if (k03.equals("allow_idea_pin_downloads")) {
                        c13 = 138;
                        break;
                    }
                    break;
                case 1896054484:
                    if (k03.equals("save_behavior")) {
                        c13 = 139;
                        break;
                    }
                    break;
                case 1896327864:
                    if (k03.equals("vto_beauty_access_status")) {
                        c13 = 140;
                        break;
                    }
                    break;
                case 1901043637:
                    if (k03.equals("location")) {
                        c13 = 141;
                        break;
                    }
                    break;
                case 1901209371:
                    if (k03.equals("story_pin_count")) {
                        c13 = 142;
                        break;
                    }
                    break;
                case 1911738367:
                    if (k03.equals("allow_mentions")) {
                        c13 = 143;
                        break;
                    }
                    break;
                case 1991857858:
                    if (k03.equals("shopping_rec_disabled")) {
                        c13 = 144;
                        break;
                    }
                    break;
                case 2013122196:
                    if (k03.equals("last_name")) {
                        c13 = 145;
                        break;
                    }
                    break;
                case 2067434538:
                    if (k03.equals("has_orders")) {
                        c13 = 146;
                        break;
                    }
                    break;
                case 2091978830:
                    if (k03.equals("should_show_messaging")) {
                        c13 = 147;
                        break;
                    }
                    break;
                case 2110945812:
                    if (k03.equals("ppa_merchant_id")) {
                        c13 = 148;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 149;
                        break;
                    }
                    break;
                case 2136023831:
                    if (k03.equals("has_confirmed_email")) {
                        c13 = 150;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f43831a;
            switch (c13) {
                case 0:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.R0((Boolean) this.f43832b.c(aVar));
                    break;
                case 1:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.e0((Boolean) this.f43832b.c(aVar));
                    break;
                case 2:
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.T1 = (String) this.f43846p.c(aVar);
                    boolean[] zArr = f23.V1;
                    if (zArr.length <= 149) {
                        break;
                    } else {
                        zArr[149] = true;
                        break;
                    }
                case 3:
                    if (this.f43842l == null) {
                        this.f43842l = oVar.g(new TypeToken<Map<String, List<String>>>(this) { // from class: com.pinterest.api.model.User$UserTypeAdapter$20
                        }).b();
                    }
                    f23.Y0((Map) this.f43842l.c(aVar));
                    break;
                case 4:
                    if (this.f43836f == null) {
                        this.f43836f = oVar.h(Integer.class).b();
                    }
                    f23.L((Integer) this.f43836f.c(aVar));
                    break;
                case 5:
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.c0((String) this.f43846p.c(aVar));
                    break;
                case 6:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.v0((Boolean) this.f43832b.c(aVar));
                    break;
                case 7:
                    if (this.f43833c == null) {
                        this.f43833c = oVar.h(Date.class).b();
                    }
                    f23.E0((Date) this.f43833c.c(aVar));
                    break;
                case '\b':
                    if (this.f43836f == null) {
                        this.f43836f = oVar.h(Integer.class).b();
                    }
                    f23.W0((Integer) this.f43836f.c(aVar));
                    break;
                case '\t':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.s0((Boolean) this.f43832b.c(aVar));
                    break;
                case '\n':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.y1((Boolean) this.f43832b.c(aVar));
                    break;
                case 11:
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.m1((String) this.f43846p.c(aVar));
                    break;
                case '\f':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.y0((Boolean) this.f43832b.c(aVar));
                    break;
                case '\r':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.o((Boolean) this.f43832b.c(aVar));
                    break;
                case 14:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.s((Boolean) this.f43832b.c(aVar));
                    break;
                case 15:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.q0((Boolean) this.f43832b.c(aVar));
                    break;
                case 16:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.T((Boolean) this.f43832b.c(aVar));
                    break;
                case 17:
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.N((String) this.f43846p.c(aVar));
                    break;
                case 18:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.u0((Boolean) this.f43832b.c(aVar));
                    break;
                case 19:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.w((Boolean) this.f43832b.c(aVar));
                    break;
                case 20:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.M0((Boolean) this.f43832b.c(aVar));
                    break;
                case 21:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.h((Boolean) this.f43832b.c(aVar));
                    break;
                case 22:
                    if (this.f43839i == null) {
                        this.f43839i = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.User$UserTypeAdapter$22
                        }).b();
                    }
                    f23.u1((List) this.f43839i.c(aVar));
                    break;
                case 23:
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.g0((String) this.f43846p.c(aVar));
                    break;
                case 24:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.c1((Boolean) this.f43832b.c(aVar));
                    break;
                case 25:
                    if (this.f43836f == null) {
                        this.f43836f = oVar.h(Integer.class).b();
                    }
                    f23.S0((Integer) this.f43836f.c(aVar));
                    break;
                case 26:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.l0((Boolean) this.f43832b.c(aVar));
                    break;
                case 27:
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.Y0 = (String) this.f43846p.c(aVar);
                    boolean[] zArr2 = f23.V1;
                    if (zArr2.length <= 102) {
                        break;
                    } else {
                        zArr2[102] = true;
                        break;
                    }
                case 28:
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.f43028b1 = (String) this.f43846p.c(aVar);
                    boolean[] zArr3 = f23.V1;
                    if (zArr3.length <= 105) {
                        break;
                    } else {
                        zArr3[105] = true;
                        break;
                    }
                case 29:
                    if (this.f43836f == null) {
                        this.f43836f = oVar.h(Integer.class).b();
                    }
                    f23.f43068p = (Integer) this.f43836f.c(aVar);
                    boolean[] zArr4 = f23.V1;
                    if (zArr4.length <= 15) {
                        break;
                    } else {
                        zArr4[15] = true;
                        break;
                    }
                case 30:
                    if (this.f43841k == null) {
                        this.f43841k = oVar.g(new TypeToken<Map<String, List<sr>>>(this) { // from class: com.pinterest.api.model.User$UserTypeAdapter$19
                        }).b();
                    }
                    f23.X0((Map) this.f43841k.c(aVar));
                    break;
                case 31:
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.O((String) this.f43846p.c(aVar));
                    break;
                case ' ':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.B0((Boolean) this.f43832b.c(aVar));
                    break;
                case '!':
                    if (this.f43841k == null) {
                        this.f43841k = oVar.g(new TypeToken<Map<String, List<sr>>>(this) { // from class: com.pinterest.api.model.User$UserTypeAdapter$13
                        }).b();
                    }
                    f23.x((Map) this.f43841k.c(aVar));
                    break;
                case '\"':
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.U0 = (String) this.f43846p.c(aVar);
                    boolean[] zArr5 = f23.V1;
                    if (zArr5.length <= 98) {
                        break;
                    } else {
                        zArr5[98] = true;
                        break;
                    }
                case '#':
                    if (this.f43837g == null) {
                        this.f43837g = oVar.g(new TypeToken<List<qv>>(this) { // from class: com.pinterest.api.model.User$UserTypeAdapter$15
                        }).b();
                    }
                    f23.H0((List) this.f43837g.c(aVar));
                    break;
                case '$':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.A0((Boolean) this.f43832b.c(aVar));
                    break;
                case '%':
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.f43069p0 = (String) this.f43846p.c(aVar);
                    boolean[] zArr6 = f23.V1;
                    if (zArr6.length <= 67) {
                        break;
                    } else {
                        zArr6[67] = true;
                        break;
                    }
                case '&':
                    if (this.f43840j == null) {
                        this.f43840j = oVar.g(new TypeToken<List<wy0>>(this) { // from class: com.pinterest.api.model.User$UserTypeAdapter$16
                        }).b();
                    }
                    f23.K0((List) this.f43840j.c(aVar));
                    break;
                case '\'':
                    if (this.f43839i == null) {
                        this.f43839i = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.User$UserTypeAdapter$18
                        }).b();
                    }
                    f23.V0((List) this.f43839i.c(aVar));
                    break;
                case '(':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.f43089w = (Boolean) this.f43832b.c(aVar);
                    boolean[] zArr7 = f23.V1;
                    if (zArr7.length <= 22) {
                        break;
                    } else {
                        zArr7[22] = true;
                        break;
                    }
                case ')':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.v((Boolean) this.f43832b.c(aVar));
                    break;
                case '*':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.I0 = (Boolean) this.f43832b.c(aVar);
                    boolean[] zArr8 = f23.V1;
                    if (zArr8.length <= 86) {
                        break;
                    } else {
                        zArr8[86] = true;
                        break;
                    }
                case '+':
                    if (this.f43836f == null) {
                        this.f43836f = oVar.h(Integer.class).b();
                    }
                    f23.k((Integer) this.f43836f.c(aVar));
                    break;
                case ',':
                    if (this.f43843m == null) {
                        this.f43843m = oVar.h(v10.class).b();
                    }
                    f23.L0((v10) this.f43843m.c(aVar));
                    break;
                case '-':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.f1((Boolean) this.f43832b.c(aVar));
                    break;
                case '.':
                    if (this.f43844n == null) {
                        this.f43844n = oVar.h(b90.class).b();
                    }
                    f23.Q0((b90) this.f43844n.c(aVar));
                    break;
                case '/':
                    if (this.f43836f == null) {
                        this.f43836f = oVar.h(Integer.class).b();
                    }
                    f23.b1((Integer) this.f43836f.c(aVar));
                    break;
                case '0':
                    if (this.f43836f == null) {
                        this.f43836f = oVar.h(Integer.class).b();
                    }
                    f23.T0((Integer) this.f43836f.c(aVar));
                    break;
                case '1':
                    if (this.f43836f == null) {
                        this.f43836f = oVar.h(Integer.class).b();
                    }
                    f23.U0((Integer) this.f43836f.c(aVar));
                    break;
                case '2':
                    if (this.f43845o == null) {
                        this.f43845o = oVar.h(ke0.class).b();
                    }
                    f23.Z0((ke0) this.f43845o.c(aVar));
                    break;
                case '3':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.l((Boolean) this.f43832b.c(aVar));
                    break;
                case '4':
                    if (this.f43836f == null) {
                        this.f43836f = oVar.h(Integer.class).b();
                    }
                    f23.f43040f1 = (Integer) this.f43836f.c(aVar);
                    boolean[] zArr9 = f23.V1;
                    if (zArr9.length <= 109) {
                        break;
                    } else {
                        zArr9[109] = true;
                        break;
                    }
                case '5':
                    if (this.f43841k == null) {
                        this.f43841k = oVar.g(new TypeToken<Map<String, List<sr>>>(this) { // from class: com.pinterest.api.model.User$UserTypeAdapter$17
                        }).b();
                    }
                    f23.N0((Map) this.f43841k.c(aVar));
                    break;
                case '6':
                    if (this.f43836f == null) {
                        this.f43836f = oVar.h(Integer.class).b();
                    }
                    f23.i((Integer) this.f43836f.c(aVar));
                    break;
                case '7':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.w0((Boolean) this.f43832b.c(aVar));
                    break;
                case '8':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.x0((Boolean) this.f43832b.c(aVar));
                    break;
                case '9':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.G((Boolean) this.f43832b.c(aVar));
                    break;
                case ':':
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.r1((String) this.f43846p.c(aVar));
                    break;
                case ';':
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.m((String) this.f43846p.c(aVar));
                    break;
                case '<':
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.e((String) this.f43846p.c(aVar));
                    break;
                case '=':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.J((Boolean) this.f43832b.c(aVar));
                    break;
                case '>':
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.K((String) this.f43846p.c(aVar));
                    break;
                case '?':
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.A((String) this.f43846p.c(aVar));
                    break;
                case '@':
                    if (this.f43836f == null) {
                        this.f43836f = oVar.h(Integer.class).b();
                    }
                    f23.q((Integer) this.f43836f.c(aVar));
                    break;
                case 'A':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.Z((Boolean) this.f43832b.c(aVar));
                    break;
                case 'B':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.l1((Boolean) this.f43832b.c(aVar));
                    break;
                case 'C':
                    if (this.f43836f == null) {
                        this.f43836f = oVar.h(Integer.class).b();
                    }
                    f23.O = (Integer) this.f43836f.c(aVar);
                    boolean[] zArr10 = f23.V1;
                    if (zArr10.length <= 40) {
                        break;
                    } else {
                        zArr10[40] = true;
                        break;
                    }
                case 'D':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.I((Boolean) this.f43832b.c(aVar));
                    break;
                case 'E':
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.p1((String) this.f43846p.c(aVar));
                    break;
                case 'F':
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.o1((String) this.f43846p.c(aVar));
                    break;
                case 'G':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.n0((Boolean) this.f43832b.c(aVar));
                    break;
                case 'H':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.z0((Boolean) this.f43832b.c(aVar));
                    break;
                case 'I':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.P((Boolean) this.f43832b.c(aVar));
                    break;
                case 'J':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.i1((Boolean) this.f43832b.c(aVar));
                    break;
                case 'K':
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.f43029c = (String) this.f43846p.c(aVar);
                    boolean[] zArr11 = f23.V1;
                    if (zArr11.length <= 2) {
                        break;
                    } else {
                        zArr11[2] = true;
                        break;
                    }
                case 'L':
                    if (this.f43836f == null) {
                        this.f43836f = oVar.h(Integer.class).b();
                    }
                    f23.f43043g1 = (Integer) this.f43836f.c(aVar);
                    boolean[] zArr12 = f23.V1;
                    if (zArr12.length <= 110) {
                        break;
                    } else {
                        zArr12[110] = true;
                        break;
                    }
                case 'M':
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.E((String) this.f43846p.c(aVar));
                    break;
                case 'N':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.W((Boolean) this.f43832b.c(aVar));
                    break;
                case 'O':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.t0((Boolean) this.f43832b.c(aVar));
                    break;
                case 'P':
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.F((String) this.f43846p.c(aVar));
                    break;
                case 'Q':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.k0((Boolean) this.f43832b.c(aVar));
                    break;
                case 'R':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.f43100z1 = (Boolean) this.f43832b.c(aVar);
                    boolean[] zArr13 = f23.V1;
                    if (zArr13.length <= 129) {
                        break;
                    } else {
                        zArr13[129] = true;
                        break;
                    }
                case 'S':
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.a0((String) this.f43846p.c(aVar));
                    break;
                case 'T':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.j1((Boolean) this.f43832b.c(aVar));
                    break;
                case 'U':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.o0((Boolean) this.f43832b.c(aVar));
                    break;
                case 'V':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.f43034d1 = (Boolean) this.f43832b.c(aVar);
                    boolean[] zArr14 = f23.V1;
                    if (zArr14.length <= 107) {
                        break;
                    } else {
                        zArr14[107] = true;
                        break;
                    }
                case 'W':
                    if (this.f43836f == null) {
                        this.f43836f = oVar.h(Integer.class).b();
                    }
                    f23.f43094x1 = (Integer) this.f43836f.c(aVar);
                    boolean[] zArr15 = f23.V1;
                    if (zArr15.length <= 127) {
                        break;
                    } else {
                        zArr15[127] = true;
                        break;
                    }
                case 'X':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.B((Boolean) this.f43832b.c(aVar));
                    break;
                case 'Y':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.p0((Boolean) this.f43832b.c(aVar));
                    break;
                case 'Z':
                    if (this.f43836f == null) {
                        this.f43836f = oVar.h(Integer.class).b();
                    }
                    f23.M((Integer) this.f43836f.c(aVar));
                    break;
                case '[':
                    if (this.f43836f == null) {
                        this.f43836f = oVar.h(Integer.class).b();
                    }
                    f23.h0((Integer) this.f43836f.c(aVar));
                    break;
                case '\\':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.r0((Boolean) this.f43832b.c(aVar));
                    break;
                case ']':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.J0 = (Boolean) this.f43832b.c(aVar);
                    boolean[] zArr16 = f23.V1;
                    if (zArr16.length <= 87) {
                        break;
                    } else {
                        zArr16[87] = true;
                        break;
                    }
                case '^':
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.n1((Boolean) this.f43832b.c(aVar));
                    break;
                case '_':
                    if (this.f43850t == null) {
                        this.f43850t = oVar.h(tz0.class).b();
                    }
                    f23.t1((tz0) this.f43850t.c(aVar));
                    break;
                case '`':
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.c((String) this.f43846p.c(aVar));
                    break;
                case 'a':
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.G = (String) this.f43846p.c(aVar);
                    boolean[] zArr17 = f23.V1;
                    if (zArr17.length <= 32) {
                        break;
                    } else {
                        zArr17[32] = true;
                        break;
                    }
                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_VIDEO_CREATOR_ANALYTICS_MODULE /* 98 */:
                    if (this.f43836f == null) {
                        this.f43836f = oVar.h(Integer.class).b();
                    }
                    f23.i0((Integer) this.f43836f.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NOTE_AND_FAVORITE_MODULE /* 99 */:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.d((Boolean) this.f43832b.c(aVar));
                    break;
                case 'd':
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.b0((String) this.f43846p.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE /* 101 */:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.t((Boolean) this.f43832b.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE /* 102 */:
                    if (this.f43836f == null) {
                        this.f43836f = oVar.h(Integer.class).b();
                    }
                    f23.F0((Integer) this.f43836f.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE /* 103 */:
                    if (this.f43836f == null) {
                        this.f43836f = oVar.h(Integer.class).b();
                    }
                    f23.f43041g = (Integer) this.f43836f.c(aVar);
                    boolean[] zArr18 = f23.V1;
                    if (zArr18.length <= 6) {
                        break;
                    } else {
                        zArr18[6] = true;
                        break;
                    }
                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE /* 104 */:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.Y((Boolean) this.f43832b.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE /* 105 */:
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.D = (String) this.f43846p.c(aVar);
                    boolean[] zArr19 = f23.V1;
                    if (zArr19.length <= 29) {
                        break;
                    } else {
                        zArr19[29] = true;
                        break;
                    }
                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID /* 106 */:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.X((Boolean) this.f43832b.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER /* 107 */:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.V((Boolean) this.f43832b.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE /* 108 */:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.u((Boolean) this.f43832b.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL /* 109 */:
                    if (this.f43839i == null) {
                        this.f43839i = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.User$UserTypeAdapter$21
                        }).b();
                    }
                    f23.s1((List) this.f43839i.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL /* 110 */:
                    if (this.f43834d == null) {
                        this.f43834d = oVar.h(Double.class).b();
                    }
                    f23.f43062n = (Double) this.f43834d.c(aVar);
                    boolean[] zArr20 = f23.V1;
                    if (zArr20.length <= 13) {
                        break;
                    } else {
                        zArr20[13] = true;
                        break;
                    }
                case RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE /* 111 */:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.J0((Boolean) this.f43832b.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER /* 112 */:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.m0((Boolean) this.f43832b.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL /* 113 */:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.H((Boolean) this.f43832b.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER /* 114 */:
                    if (this.f43836f == null) {
                        this.f43836f = oVar.h(Integer.class).b();
                    }
                    f23.P0((Integer) this.f43836f.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE /* 115 */:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.g1((Boolean) this.f43832b.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW /* 116 */:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.f43093x0 = (Boolean) this.f43832b.c(aVar);
                    boolean[] zArr21 = f23.V1;
                    if (zArr21.length <= 75) {
                        break;
                    } else {
                        zArr21[75] = true;
                        break;
                    }
                case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN /* 117 */:
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.d0((String) this.f43846p.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL /* 118 */:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.C((Boolean) this.f43832b.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL /* 119 */:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.r((Boolean) this.f43832b.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL /* 120 */:
                    if (this.f43847q == null) {
                        this.f43847q = oVar.h(wy0.a.class).b();
                    }
                    f23.j((wy0.a) this.f43847q.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL /* 121 */:
                    if (this.f43836f == null) {
                        this.f43836f = oVar.h(Integer.class).b();
                    }
                    f23.P = (Integer) this.f43836f.c(aVar);
                    boolean[] zArr22 = f23.V1;
                    if (zArr22.length <= 41) {
                        break;
                    } else {
                        zArr22[41] = true;
                        break;
                    }
                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN /* 122 */:
                    if (this.f43835e == null) {
                        this.f43835e = oVar.h(vs.class).b();
                    }
                    f23.f0((vs) this.f43835e.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL /* 123 */:
                    if (this.f43833c == null) {
                        this.f43833c = oVar.h(Date.class).b();
                    }
                    f23.y((Date) this.f43833c.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER /* 124 */:
                    if (this.f43836f == null) {
                        this.f43836f = oVar.h(Integer.class).b();
                    }
                    f23.w1((Integer) this.f43836f.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED /* 125 */:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.Q((Boolean) this.f43832b.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL /* 126 */:
                    if (this.f43836f == null) {
                        this.f43836f = oVar.h(Integer.class).b();
                    }
                    f23.v1((Integer) this.f43836f.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK /* 127 */:
                    if (this.f43849s == null) {
                        this.f43849s = oVar.h(kz0.class).b();
                    }
                    f23.q1((kz0) this.f43849s.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN /* 128 */:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.h1((Boolean) this.f43832b.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS /* 129 */:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.U((Boolean) this.f43832b.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN /* 130 */:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.R((Boolean) this.f43832b.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL /* 131 */:
                    if (this.f43838h == null) {
                        this.f43838h = oVar.g(new TypeToken<List<j90>>(this) { // from class: com.pinterest.api.model.User$UserTypeAdapter$14
                        }).b();
                    }
                    f23.D((List) this.f43838h.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_FEED_SECTION_TITLE /* 132 */:
                    if (this.f43848r == null) {
                        this.f43848r = oVar.h(wy0.b.class).b();
                    }
                    f23.G0((wy0.b) this.f43848r.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_PIN_CAROUSEL /* 133 */:
                    if (this.f43840j == null) {
                        this.f43840j = oVar.g(new TypeToken<List<wy0>>(this) { // from class: com.pinterest.api.model.User$UserTypeAdapter$12
                        }).b();
                    }
                    f23.n((List) this.f43840j.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_PIN_MINI_CELL /* 134 */:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.j0((Boolean) this.f43832b.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL /* 135 */:
                    if (this.f43836f == null) {
                        this.f43836f = oVar.h(Integer.class).b();
                    }
                    f23.z((Integer) this.f43836f.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL /* 136 */:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.p((Boolean) this.f43832b.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_IMAGE /* 137 */:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.C0((Boolean) this.f43832b.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL /* 138 */:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.f((Boolean) this.f43832b.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM /* 139 */:
                    if (this.f43836f == null) {
                        this.f43836f = oVar.h(Integer.class).b();
                    }
                    f23.a1((Integer) this.f43836f.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ACTION_ITEM /* 140 */:
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.x1((String) this.f43846p.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM_HIDDEN /* 141 */:
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.V0 = (String) this.f43846p.c(aVar);
                    boolean[] zArr23 = f23.V1;
                    if (zArr23.length <= 99) {
                        break;
                    } else {
                        zArr23[99] = true;
                        break;
                    }
                case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL /* 142 */:
                    if (this.f43836f == null) {
                        this.f43836f = oVar.h(Integer.class).b();
                    }
                    f23.k1((Integer) this.f43836f.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_IMAGE /* 143 */:
                    if (this.f43836f == null) {
                        this.f43836f = oVar.h(Integer.class).b();
                    }
                    f23.g((Integer) this.f43836f.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM /* 144 */:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.d1((Boolean) this.f43832b.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM_TINTED /* 145 */:
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.D0((String) this.f43846p.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_VIDEO /* 146 */:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.S((Boolean) this.f43832b.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY /* 147 */:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.e1((Boolean) this.f43832b.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_SHOPPING_BUBBLES_PACKAGE_GRID_MODULE /* 148 */:
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.O0((String) this.f43846p.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_SHOPPING_BRAND_PACKAGE_GRID_MODULE /* 149 */:
                    if (this.f43846p == null) {
                        this.f43846p = oVar.h(String.class).b();
                    }
                    f23.I0((String) this.f43846p.c(aVar));
                    break;
                case RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY /* 150 */:
                    if (this.f43832b == null) {
                        this.f43832b = oVar.h(Boolean.class).b();
                    }
                    f23.f43024a0 = (Boolean) this.f43832b.c(aVar);
                    boolean[] zArr24 = f23.V1;
                    if (zArr24.length <= 52) {
                        break;
                    } else {
                        zArr24[52] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return f23.a();
    }

    @Override // nm.i0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void e(um.c cVar, wy0 wy0Var) {
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
        Boolean bool;
        boolean[] zArr153;
        String str;
        boolean[] zArr154;
        String str2;
        boolean[] zArr155;
        Integer num;
        boolean[] zArr156;
        Integer num2;
        boolean[] zArr157;
        List list;
        boolean[] zArr158;
        tz0 tz0Var;
        boolean[] zArr159;
        List list2;
        boolean[] zArr160;
        String str3;
        boolean[] zArr161;
        kz0 kz0Var;
        boolean[] zArr162;
        String str4;
        boolean[] zArr163;
        Boolean bool2;
        boolean[] zArr164;
        String str5;
        boolean[] zArr165;
        Boolean bool3;
        boolean[] zArr166;
        Integer num3;
        boolean[] zArr167;
        Boolean bool4;
        boolean[] zArr168;
        Boolean bool5;
        boolean[] zArr169;
        Boolean bool6;
        boolean[] zArr170;
        Boolean bool7;
        boolean[] zArr171;
        Boolean bool8;
        boolean[] zArr172;
        Boolean bool9;
        boolean[] zArr173;
        Boolean bool10;
        boolean[] zArr174;
        Boolean bool11;
        boolean[] zArr175;
        Integer num4;
        boolean[] zArr176;
        Boolean bool12;
        boolean[] zArr177;
        Integer num5;
        boolean[] zArr178;
        Integer num6;
        boolean[] zArr179;
        ke0 ke0Var;
        boolean[] zArr180;
        Map map;
        boolean[] zArr181;
        Map map2;
        boolean[] zArr182;
        Integer num7;
        boolean[] zArr183;
        List list3;
        boolean[] zArr184;
        Integer num8;
        boolean[] zArr185;
        Integer num9;
        boolean[] zArr186;
        Integer num10;
        boolean[] zArr187;
        Boolean bool13;
        boolean[] zArr188;
        b90 b90Var;
        boolean[] zArr189;
        Integer num11;
        boolean[] zArr190;
        String str6;
        boolean[] zArr191;
        Map map3;
        boolean[] zArr192;
        Integer num12;
        boolean[] zArr193;
        Integer num13;
        boolean[] zArr194;
        Boolean bool14;
        boolean[] zArr195;
        Boolean bool15;
        boolean[] zArr196;
        v10 v10Var;
        boolean[] zArr197;
        String str7;
        boolean[] zArr198;
        List list4;
        boolean[] zArr199;
        Boolean bool16;
        boolean[] zArr200;
        String str8;
        boolean[] zArr201;
        List list5;
        boolean[] zArr202;
        wy0.b bVar;
        boolean[] zArr203;
        String str9;
        boolean[] zArr204;
        String str10;
        boolean[] zArr205;
        Integer num14;
        boolean[] zArr206;
        Date date;
        boolean[] zArr207;
        String str11;
        boolean[] zArr208;
        Boolean bool17;
        boolean[] zArr209;
        Boolean bool18;
        boolean[] zArr210;
        Boolean bool19;
        boolean[] zArr211;
        Boolean bool20;
        boolean[] zArr212;
        Boolean bool21;
        boolean[] zArr213;
        Boolean bool22;
        boolean[] zArr214;
        Boolean bool23;
        boolean[] zArr215;
        Boolean bool24;
        boolean[] zArr216;
        Boolean bool25;
        boolean[] zArr217;
        Boolean bool26;
        boolean[] zArr218;
        Boolean bool27;
        boolean[] zArr219;
        Boolean bool28;
        boolean[] zArr220;
        Boolean bool29;
        boolean[] zArr221;
        Boolean bool30;
        boolean[] zArr222;
        Boolean bool31;
        boolean[] zArr223;
        Boolean bool32;
        boolean[] zArr224;
        Boolean bool33;
        boolean[] zArr225;
        Boolean bool34;
        boolean[] zArr226;
        Boolean bool35;
        boolean[] zArr227;
        Boolean bool36;
        boolean[] zArr228;
        Boolean bool37;
        boolean[] zArr229;
        Boolean bool38;
        boolean[] zArr230;
        Boolean bool39;
        boolean[] zArr231;
        Integer num15;
        boolean[] zArr232;
        Integer num16;
        boolean[] zArr233;
        String str12;
        boolean[] zArr234;
        vs vsVar;
        boolean[] zArr235;
        String str13;
        boolean[] zArr236;
        Boolean bool40;
        boolean[] zArr237;
        String str14;
        boolean[] zArr238;
        String str15;
        boolean[] zArr239;
        String str16;
        boolean[] zArr240;
        String str17;
        boolean[] zArr241;
        Boolean bool41;
        boolean[] zArr242;
        Boolean bool42;
        boolean[] zArr243;
        Boolean bool43;
        boolean[] zArr244;
        Boolean bool44;
        boolean[] zArr245;
        Boolean bool45;
        boolean[] zArr246;
        Boolean bool46;
        boolean[] zArr247;
        Boolean bool47;
        boolean[] zArr248;
        Boolean bool48;
        boolean[] zArr249;
        Boolean bool49;
        boolean[] zArr250;
        Boolean bool50;
        boolean[] zArr251;
        Boolean bool51;
        boolean[] zArr252;
        Boolean bool52;
        boolean[] zArr253;
        String str18;
        boolean[] zArr254;
        String str19;
        boolean[] zArr255;
        Integer num17;
        boolean[] zArr256;
        Integer num18;
        boolean[] zArr257;
        String str20;
        boolean[] zArr258;
        Boolean bool53;
        boolean[] zArr259;
        Boolean bool54;
        boolean[] zArr260;
        Boolean bool55;
        boolean[] zArr261;
        Integer num19;
        boolean[] zArr262;
        Integer num20;
        boolean[] zArr263;
        Boolean bool56;
        boolean[] zArr264;
        String str21;
        boolean[] zArr265;
        String str22;
        boolean[] zArr266;
        List list6;
        boolean[] zArr267;
        Boolean bool57;
        boolean[] zArr268;
        Boolean bool58;
        boolean[] zArr269;
        String str23;
        boolean[] zArr270;
        String str24;
        boolean[] zArr271;
        Integer num21;
        boolean[] zArr272;
        Date date2;
        boolean[] zArr273;
        String str25;
        boolean[] zArr274;
        Map map4;
        boolean[] zArr275;
        Boolean bool59;
        boolean[] zArr276;
        Boolean bool60;
        boolean[] zArr277;
        Boolean bool61;
        boolean[] zArr278;
        Boolean bool62;
        boolean[] zArr279;
        Boolean bool63;
        boolean[] zArr280;
        Boolean bool64;
        boolean[] zArr281;
        Boolean bool65;
        boolean[] zArr282;
        Integer num22;
        boolean[] zArr283;
        Boolean bool66;
        boolean[] zArr284;
        Boolean bool67;
        boolean[] zArr285;
        List list7;
        boolean[] zArr286;
        String str26;
        boolean[] zArr287;
        Integer num23;
        boolean[] zArr288;
        Boolean bool68;
        boolean[] zArr289;
        Double d2;
        boolean[] zArr290;
        Integer num24;
        boolean[] zArr291;
        wy0.a aVar;
        boolean[] zArr292;
        Integer num25;
        boolean[] zArr293;
        Boolean bool69;
        boolean[] zArr294;
        Integer num26;
        boolean[] zArr295;
        Boolean bool70;
        boolean[] zArr296;
        Integer num27;
        boolean[] zArr297;
        String str27;
        boolean[] zArr298;
        Boolean bool71;
        boolean[] zArr299;
        String str28;
        boolean[] zArr300;
        String str29;
        boolean[] zArr301;
        String str30;
        boolean[] zArr302;
        String str31;
        if (wy0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        zArr = wy0Var.V1;
        int length = zArr.length;
        nm.o oVar = this.f43831a;
        if (length > 0) {
            zArr302 = wy0Var.V1;
            if (zArr302[0]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar = this.f43846p;
                um.c h10 = cVar.h("id");
                str31 = wy0Var.f43424a;
                mVar.e(h10, str31);
            }
        }
        zArr2 = wy0Var.V1;
        if (zArr2.length > 1) {
            zArr301 = wy0Var.V1;
            if (zArr301[1]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar2 = this.f43846p;
                um.c h13 = cVar.h("node_id");
                str30 = wy0Var.f43427b;
                mVar2.e(h13, str30);
            }
        }
        zArr3 = wy0Var.V1;
        if (zArr3.length > 2) {
            zArr300 = wy0Var.V1;
            if (zArr300[2]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar3 = this.f43846p;
                um.c h14 = cVar.h("about");
                str29 = wy0Var.f43430c;
                mVar3.e(h14, str29);
            }
        }
        zArr4 = wy0Var.V1;
        if (zArr4.length > 3) {
            zArr299 = wy0Var.V1;
            if (zArr299[3]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar4 = this.f43846p;
                um.c h15 = cVar.h("additional_locales");
                str28 = wy0Var.f43433d;
                mVar4.e(h15, str28);
            }
        }
        zArr5 = wy0Var.V1;
        if (zArr5.length > 4) {
            zArr298 = wy0Var.V1;
            if (zArr298[4]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar5 = this.f43832b;
                um.c h16 = cVar.h("ads_customize_from_conversion");
                bool71 = wy0Var.f43436e;
                mVar5.e(h16, bool71);
            }
        }
        zArr6 = wy0Var.V1;
        if (zArr6.length > 5) {
            zArr297 = wy0Var.V1;
            if (zArr297[5]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar6 = this.f43846p;
                um.c h17 = cVar.h("ads_only_profile_site");
                str27 = wy0Var.f43439f;
                mVar6.e(h17, str27);
            }
        }
        zArr7 = wy0Var.V1;
        if (zArr7.length > 6) {
            zArr296 = wy0Var.V1;
            if (zArr296[6]) {
                if (this.f43836f == null) {
                    this.f43836f = oVar.h(Integer.class).b();
                }
                nm.m mVar7 = this.f43836f;
                um.c h18 = cVar.h("age_in_years");
                num27 = wy0Var.f43442g;
                mVar7.e(h18, num27);
            }
        }
        zArr8 = wy0Var.V1;
        if (zArr8.length > 7) {
            zArr295 = wy0Var.V1;
            if (zArr295[7]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar8 = this.f43832b;
                um.c h19 = cVar.h("allow_idea_pin_downloads");
                bool70 = wy0Var.f43445h;
                mVar8.e(h19, bool70);
            }
        }
        zArr9 = wy0Var.V1;
        if (zArr9.length > 8) {
            zArr294 = wy0Var.V1;
            if (zArr294[8]) {
                if (this.f43836f == null) {
                    this.f43836f = oVar.h(Integer.class).b();
                }
                nm.m mVar9 = this.f43836f;
                um.c h23 = cVar.h("allow_mentions");
                num26 = wy0Var.f43448i;
                mVar9.e(h23, num26);
            }
        }
        zArr10 = wy0Var.V1;
        if (zArr10.length > 9) {
            zArr293 = wy0Var.V1;
            if (zArr293[9]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar10 = this.f43832b;
                um.c h24 = cVar.h("allow_switch_between_private_and_public_profile");
                bool69 = wy0Var.f43451j;
                mVar10.e(h24, bool69);
            }
        }
        zArr11 = wy0Var.V1;
        if (zArr11.length > 10) {
            zArr292 = wy0Var.V1;
            if (zArr292[10]) {
                if (this.f43836f == null) {
                    this.f43836f = oVar.h(Integer.class).b();
                }
                nm.m mVar11 = this.f43836f;
                um.c h25 = cVar.h("archived_board_count");
                num25 = wy0Var.f43454k;
                mVar11.e(h25, num25);
            }
        }
        zArr12 = wy0Var.V1;
        if (zArr12.length > 11) {
            zArr291 = wy0Var.V1;
            if (zArr291[11]) {
                if (this.f43847q == null) {
                    this.f43847q = oVar.h(wy0.a.class).b();
                }
                nm.m mVar12 = this.f43847q;
                um.c h26 = cVar.h("auto_tagging_status");
                aVar = wy0Var.f43457l;
                mVar12.e(h26, aVar);
            }
        }
        zArr13 = wy0Var.V1;
        if (zArr13.length > 12) {
            zArr290 = wy0Var.V1;
            if (zArr290[12]) {
                if (this.f43836f == null) {
                    this.f43836f = oVar.h(Integer.class).b();
                }
                nm.m mVar13 = this.f43836f;
                um.c h27 = cVar.h("avatar_color_index");
                num24 = wy0Var.f43460m;
                mVar13.e(h27, num24);
            }
        }
        zArr14 = wy0Var.V1;
        if (zArr14.length > 13) {
            zArr289 = wy0Var.V1;
            if (zArr289[13]) {
                if (this.f43834d == null) {
                    this.f43834d = oVar.h(Double.class).b();
                }
                nm.m mVar14 = this.f43834d;
                um.c h28 = cVar.h("birthday");
                d2 = wy0Var.f43463n;
                mVar14.e(h28, d2);
            }
        }
        zArr15 = wy0Var.V1;
        if (zArr15.length > 14) {
            zArr288 = wy0Var.V1;
            if (zArr288[14]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar15 = this.f43832b;
                um.c h29 = cVar.h("blocked_by_me");
                bool68 = wy0Var.f43466o;
                mVar15.e(h29, bool68);
            }
        }
        zArr16 = wy0Var.V1;
        if (zArr16.length > 15) {
            zArr287 = wy0Var.V1;
            if (zArr287[15]) {
                if (this.f43836f == null) {
                    this.f43836f = oVar.h(Integer.class).b();
                }
                nm.m mVar16 = this.f43836f;
                um.c h33 = cVar.h("board_count");
                num23 = wy0Var.f43469p;
                mVar16.e(h33, num23);
            }
        }
        zArr17 = wy0Var.V1;
        if (zArr17.length > 16) {
            zArr286 = wy0Var.V1;
            if (zArr286[16]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar17 = this.f43846p;
                um.c h34 = cVar.h("board_sort_type");
                str26 = wy0Var.f43472q;
                mVar17.e(h34, str26);
            }
        }
        zArr18 = wy0Var.V1;
        if (zArr18.length > 17) {
            zArr285 = wy0Var.V1;
            if (zArr285[17]) {
                if (this.f43840j == null) {
                    this.f43840j = oVar.g(new TypeToken<List<wy0>>(this) { // from class: com.pinterest.api.model.User$UserTypeAdapter$1
                    }).b();
                }
                nm.m mVar18 = this.f43840j;
                um.c h35 = cVar.h("businesses");
                list7 = wy0Var.f43475r;
                mVar18.e(h35, list7);
            }
        }
        zArr19 = wy0Var.V1;
        if (zArr19.length > 18) {
            zArr284 = wy0Var.V1;
            if (zArr284[18]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar19 = this.f43832b;
                um.c h36 = cVar.h("can_edit_search_privacy");
                bool67 = wy0Var.f43478s;
                mVar19.e(h36, bool67);
            }
        }
        zArr20 = wy0Var.V1;
        if (zArr20.length > 19) {
            zArr283 = wy0Var.V1;
            if (zArr283[19]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar20 = this.f43832b;
                um.c h37 = cVar.h("ccpa_opted_out");
                bool66 = wy0Var.f43481t;
                mVar20.e(h37, bool66);
            }
        }
        zArr21 = wy0Var.V1;
        if (zArr21.length > 20) {
            zArr282 = wy0Var.V1;
            if (zArr282[20]) {
                if (this.f43836f == null) {
                    this.f43836f = oVar.h(Integer.class).b();
                }
                nm.m mVar21 = this.f43836f;
                um.c h38 = cVar.h("collage_draft_count");
                num22 = wy0Var.f43484u;
                mVar21.e(h38, num22);
            }
        }
        zArr22 = wy0Var.V1;
        if (zArr22.length > 21) {
            zArr281 = wy0Var.V1;
            if (zArr281[21]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar22 = this.f43832b;
                um.c h39 = cVar.h("connected_to_amazon_handshake");
                bool65 = wy0Var.f43487v;
                mVar22.e(h39, bool65);
            }
        }
        zArr23 = wy0Var.V1;
        if (zArr23.length > 22) {
            zArr280 = wy0Var.V1;
            if (zArr280[22]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar23 = this.f43832b;
                um.c h43 = cVar.h("connected_to_etsy");
                bool64 = wy0Var.f43490w;
                mVar23.e(h43, bool64);
            }
        }
        zArr24 = wy0Var.V1;
        if (zArr24.length > 23) {
            zArr279 = wy0Var.V1;
            if (zArr279[23]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar24 = this.f43832b;
                um.c h44 = cVar.h("connected_to_facebook");
                bool63 = wy0Var.f43493x;
                mVar24.e(h44, bool63);
            }
        }
        zArr25 = wy0Var.V1;
        if (zArr25.length > 24) {
            zArr278 = wy0Var.V1;
            if (zArr278[24]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar25 = this.f43832b;
                um.c h45 = cVar.h("connected_to_gplus");
                bool62 = wy0Var.f43496y;
                mVar25.e(h45, bool62);
            }
        }
        zArr26 = wy0Var.V1;
        if (zArr26.length > 25) {
            zArr277 = wy0Var.V1;
            if (zArr277[25]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar26 = this.f43832b;
                um.c h46 = cVar.h("connected_to_instagram");
                bool61 = wy0Var.f43499z;
                mVar26.e(h46, bool61);
            }
        }
        zArr27 = wy0Var.V1;
        if (zArr27.length > 26) {
            zArr276 = wy0Var.V1;
            if (zArr276[26]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar27 = this.f43832b;
                um.c h47 = cVar.h("connected_to_line");
                bool60 = wy0Var.A;
                mVar27.e(h47, bool60);
            }
        }
        zArr28 = wy0Var.V1;
        if (zArr28.length > 27) {
            zArr275 = wy0Var.V1;
            if (zArr275[27]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar28 = this.f43832b;
                um.c h48 = cVar.h("connected_to_youtube");
                bool59 = wy0Var.B;
                mVar28.e(h48, bool59);
            }
        }
        zArr29 = wy0Var.V1;
        if (zArr29.length > 28) {
            zArr274 = wy0Var.V1;
            if (zArr274[28]) {
                if (this.f43841k == null) {
                    this.f43841k = oVar.g(new TypeToken<Map<String, List<sr>>>(this) { // from class: com.pinterest.api.model.User$UserTypeAdapter$2
                    }).b();
                }
                nm.m mVar29 = this.f43841k;
                um.c h49 = cVar.h("contextual_pin_image_urls");
                map4 = wy0Var.C;
                mVar29.e(h49, map4);
            }
        }
        zArr30 = wy0Var.V1;
        if (zArr30.length > 29) {
            zArr273 = wy0Var.V1;
            if (zArr273[29]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar30 = this.f43846p;
                um.c h53 = cVar.h(AdRevenueScheme.COUNTRY);
                str25 = wy0Var.D;
                mVar30.e(h53, str25);
            }
        }
        zArr31 = wy0Var.V1;
        if (zArr31.length > 30) {
            zArr272 = wy0Var.V1;
            if (zArr272[30]) {
                if (this.f43833c == null) {
                    this.f43833c = oVar.h(Date.class).b();
                }
                nm.m mVar31 = this.f43833c;
                um.c h54 = cVar.h("created_at");
                date2 = wy0Var.E;
                mVar31.e(h54, date2);
            }
        }
        zArr32 = wy0Var.V1;
        if (zArr32.length > 31) {
            zArr271 = wy0Var.V1;
            if (zArr271[31]) {
                if (this.f43836f == null) {
                    this.f43836f = oVar.h(Integer.class).b();
                }
                nm.m mVar32 = this.f43836f;
                um.c h55 = cVar.h("creator_level");
                num21 = wy0Var.F;
                mVar32.e(h55, num21);
            }
        }
        zArr33 = wy0Var.V1;
        if (zArr33.length > 32) {
            zArr270 = wy0Var.V1;
            if (zArr270[32]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar33 = this.f43846p;
                um.c h56 = cVar.h("custom_gender");
                str24 = wy0Var.G;
                mVar33.e(h56, str24);
            }
        }
        zArr34 = wy0Var.V1;
        if (zArr34.length > 33) {
            zArr269 = wy0Var.V1;
            if (zArr269[33]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar34 = this.f43846p;
                um.c h57 = cVar.h("dominant_color_css");
                str23 = wy0Var.H;
                mVar34.e(h57, str23);
            }
        }
        zArr35 = wy0Var.V1;
        if (zArr35.length > 34) {
            zArr268 = wy0Var.V1;
            if (zArr268[34]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar35 = this.f43832b;
                um.c h58 = cVar.h("dsa_opted_out");
                bool58 = wy0Var.I;
                mVar35.e(h58, bool58);
            }
        }
        zArr36 = wy0Var.V1;
        if (zArr36.length > 35) {
            zArr267 = wy0Var.V1;
            if (zArr267[35]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar36 = this.f43832b;
                um.c h59 = cVar.h("eligible_for_wishlist");
                bool57 = wy0Var.f43423J;
                mVar36.e(h59, bool57);
            }
        }
        zArr37 = wy0Var.V1;
        if (zArr37.length > 36) {
            zArr266 = wy0Var.V1;
            if (zArr266[36]) {
                if (this.f43838h == null) {
                    this.f43838h = oVar.g(new TypeToken<List<j90>>(this) { // from class: com.pinterest.api.model.User$UserTypeAdapter$3
                    }).b();
                }
                nm.m mVar37 = this.f43838h;
                um.c h63 = cVar.h("eligible_profile_tabs");
                list6 = wy0Var.K;
                mVar37.e(h63, list6);
            }
        }
        zArr38 = wy0Var.V1;
        if (zArr38.length > 37) {
            zArr265 = wy0Var.V1;
            if (zArr265[37]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar38 = this.f43846p;
                um.c h64 = cVar.h("email");
                str22 = wy0Var.L;
                mVar38.e(h64, str22);
            }
        }
        zArr39 = wy0Var.V1;
        if (zArr39.length > 38) {
            zArr264 = wy0Var.V1;
            if (zArr264[38]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar39 = this.f43846p;
                um.c h65 = cVar.h("email_status");
                str21 = wy0Var.M;
                mVar39.e(h65, str21);
            }
        }
        zArr40 = wy0Var.V1;
        if (zArr40.length > 39) {
            zArr263 = wy0Var.V1;
            if (zArr263[39]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar40 = this.f43832b;
                um.c h66 = cVar.h("exclude_from_search");
                bool56 = wy0Var.N;
                mVar40.e(h66, bool56);
            }
        }
        zArr41 = wy0Var.V1;
        if (zArr41.length > 40) {
            zArr262 = wy0Var.V1;
            if (zArr262[40]) {
                if (this.f43836f == null) {
                    this.f43836f = oVar.h(Integer.class).b();
                }
                nm.m mVar41 = this.f43836f;
                um.c h67 = cVar.h("explicit_board_following_count");
                num20 = wy0Var.O;
                mVar41.e(h67, num20);
            }
        }
        zArr42 = wy0Var.V1;
        if (zArr42.length > 41) {
            zArr261 = wy0Var.V1;
            if (zArr261[41]) {
                if (this.f43836f == null) {
                    this.f43836f = oVar.h(Integer.class).b();
                }
                nm.m mVar42 = this.f43836f;
                um.c h68 = cVar.h("explicit_user_following_count");
                num19 = wy0Var.P;
                mVar42.e(h68, num19);
            }
        }
        zArr43 = wy0Var.V1;
        if (zArr43.length > 42) {
            zArr260 = wy0Var.V1;
            if (zArr260[42]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar43 = this.f43832b;
                um.c h69 = cVar.h("explicitly_followed_by_me");
                bool55 = wy0Var.Q;
                mVar43.e(h69, bool55);
            }
        }
        zArr44 = wy0Var.V1;
        if (zArr44.length > 43) {
            zArr259 = wy0Var.V1;
            if (zArr259[43]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar44 = this.f43832b;
                um.c h73 = cVar.h("explicitly_following_me");
                bool54 = wy0Var.R;
                mVar44.e(h73, bool54);
            }
        }
        zArr45 = wy0Var.V1;
        if (zArr45.length > 44) {
            zArr258 = wy0Var.V1;
            if (zArr258[44]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar45 = this.f43832b;
                um.c h74 = cVar.h("facebook_publish_stream_enabled");
                bool53 = wy0Var.S;
                mVar45.e(h74, bool53);
            }
        }
        zArr46 = wy0Var.V1;
        if (zArr46.length > 45) {
            zArr257 = wy0Var.V1;
            if (zArr257[45]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar46 = this.f43846p;
                um.c h75 = cVar.h("first_name");
                str20 = wy0Var.T;
                mVar46.e(h75, str20);
            }
        }
        zArr47 = wy0Var.V1;
        if (zArr47.length > 46) {
            zArr256 = wy0Var.V1;
            if (zArr256[46]) {
                if (this.f43836f == null) {
                    this.f43836f = oVar.h(Integer.class).b();
                }
                nm.m mVar47 = this.f43836f;
                um.c h76 = cVar.h("follower_count");
                num18 = wy0Var.U;
                mVar47.e(h76, num18);
            }
        }
        zArr48 = wy0Var.V1;
        if (zArr48.length > 47) {
            zArr255 = wy0Var.V1;
            if (zArr255[47]) {
                if (this.f43836f == null) {
                    this.f43836f = oVar.h(Integer.class).b();
                }
                nm.m mVar48 = this.f43836f;
                um.c h77 = cVar.h("following_count");
                num17 = wy0Var.V;
                mVar48.e(h77, num17);
            }
        }
        zArr49 = wy0Var.V1;
        if (zArr49.length > 48) {
            zArr254 = wy0Var.V1;
            if (zArr254[48]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar49 = this.f43846p;
                um.c h78 = cVar.h("full_name");
                str19 = wy0Var.W;
                mVar49.e(h78, str19);
            }
        }
        zArr50 = wy0Var.V1;
        if (zArr50.length > 49) {
            zArr253 = wy0Var.V1;
            if (zArr253[49]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar50 = this.f43846p;
                um.c h79 = cVar.h("gender");
                str18 = wy0Var.X;
                mVar50.e(h79, str18);
            }
        }
        zArr51 = wy0Var.V1;
        if (zArr51.length > 50) {
            zArr252 = wy0Var.V1;
            if (zArr252[50]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar51 = this.f43832b;
                um.c h83 = cVar.h("has_archived_boards");
                bool52 = wy0Var.Y;
                mVar51.e(h83, bool52);
            }
        }
        zArr52 = wy0Var.V1;
        if (zArr52.length > 51) {
            zArr251 = wy0Var.V1;
            if (zArr251[51]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar52 = this.f43832b;
                um.c h84 = cVar.h("has_catalog");
                bool51 = wy0Var.Z;
                mVar52.e(h84, bool51);
            }
        }
        zArr53 = wy0Var.V1;
        if (zArr53.length > 52) {
            zArr250 = wy0Var.V1;
            if (zArr250[52]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar53 = this.f43832b;
                um.c h85 = cVar.h("has_confirmed_email");
                bool50 = wy0Var.f43425a0;
                mVar53.e(h85, bool50);
            }
        }
        zArr54 = wy0Var.V1;
        if (zArr54.length > 53) {
            zArr249 = wy0Var.V1;
            if (zArr249[53]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar54 = this.f43832b;
                um.c h86 = cVar.h("has_created_all_clusters");
                bool49 = wy0Var.f43428b0;
                mVar54.e(h86, bool49);
            }
        }
        zArr55 = wy0Var.V1;
        if (zArr55.length > 54) {
            zArr248 = wy0Var.V1;
            if (zArr248[54]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar55 = this.f43832b;
                um.c h87 = cVar.h("has_orders");
                bool48 = wy0Var.f43431c0;
                mVar55.e(h87, bool48);
            }
        }
        zArr56 = wy0Var.V1;
        if (zArr56.length > 55) {
            zArr247 = wy0Var.V1;
            if (zArr247[55]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar56 = this.f43832b;
                um.c h88 = cVar.h("has_password");
                bool47 = wy0Var.f43434d0;
                mVar56.e(h88, bool47);
            }
        }
        zArr57 = wy0Var.V1;
        if (zArr57.length > 56) {
            zArr246 = wy0Var.V1;
            if (zArr246[56]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar57 = this.f43832b;
                um.c h89 = cVar.h("has_pin_clusters");
                bool46 = wy0Var.f43437e0;
                mVar57.e(h89, bool46);
            }
        }
        zArr58 = wy0Var.V1;
        if (zArr58.length > 57) {
            zArr245 = wy0Var.V1;
            if (zArr245[57]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar58 = this.f43832b;
                um.c h93 = cVar.h("has_published_pins");
                bool45 = wy0Var.f43440f0;
                mVar58.e(h93, bool45);
            }
        }
        zArr59 = wy0Var.V1;
        if (zArr59.length > 58) {
            zArr244 = wy0Var.V1;
            if (zArr244[58]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar59 = this.f43832b;
                um.c h94 = cVar.h("has_quick_create_board");
                bool44 = wy0Var.f43443g0;
                mVar59.e(h94, bool44);
            }
        }
        zArr60 = wy0Var.V1;
        if (zArr60.length > 59) {
            zArr243 = wy0Var.V1;
            if (zArr243[59]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar60 = this.f43832b;
                um.c h95 = cVar.h("has_quicksave_board");
                bool43 = wy0Var.f43446h0;
                mVar60.e(h95, bool43);
            }
        }
        zArr61 = wy0Var.V1;
        if (zArr61.length > 60) {
            zArr242 = wy0Var.V1;
            if (zArr242[60]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar61 = this.f43832b;
                um.c h96 = cVar.h("has_showcase");
                bool42 = wy0Var.f43449i0;
                mVar61.e(h96, bool42);
            }
        }
        zArr62 = wy0Var.V1;
        if (zArr62.length > 61) {
            zArr241 = wy0Var.V1;
            if (zArr241[61]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar62 = this.f43832b;
                um.c h97 = cVar.h("hide_birthdate_for_business");
                bool41 = wy0Var.f43452j0;
                mVar62.e(h97, bool41);
            }
        }
        zArr63 = wy0Var.V1;
        if (zArr63.length > 62) {
            zArr240 = wy0Var.V1;
            if (zArr240[62]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar63 = this.f43846p;
                um.c h98 = cVar.h("image_large_url");
                str17 = wy0Var.f43455k0;
                mVar63.e(h98, str17);
            }
        }
        zArr64 = wy0Var.V1;
        if (zArr64.length > 63) {
            zArr239 = wy0Var.V1;
            if (zArr239[63]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar64 = this.f43846p;
                um.c h99 = cVar.h("image_medium_url");
                str16 = wy0Var.f43458l0;
                mVar64.e(h99, str16);
            }
        }
        zArr65 = wy0Var.V1;
        if (zArr65.length > 64) {
            zArr238 = wy0Var.V1;
            if (zArr238[64]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar65 = this.f43846p;
                um.c h100 = cVar.h("image_small_url");
                str15 = wy0Var.f43461m0;
                mVar65.e(h100, str15);
            }
        }
        zArr66 = wy0Var.V1;
        if (zArr66.length > 65) {
            zArr237 = wy0Var.V1;
            if (zArr237[65]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar66 = this.f43846p;
                um.c h101 = cVar.h("image_xlarge_url");
                str14 = wy0Var.f43464n0;
                mVar66.e(h101, str14);
            }
        }
        zArr67 = wy0Var.V1;
        if (zArr67.length > 66) {
            zArr236 = wy0Var.V1;
            if (zArr236[66]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar67 = this.f43832b;
                um.c h102 = cVar.h("implicitly_followed_by_me");
                bool40 = wy0Var.f43467o0;
                mVar67.e(h102, bool40);
            }
        }
        zArr68 = wy0Var.V1;
        if (zArr68.length > 67) {
            zArr235 = wy0Var.V1;
            if (zArr235[67]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar68 = this.f43846p;
                um.c h103 = cVar.h("impressum_url");
                str13 = wy0Var.f43470p0;
                mVar68.e(h103, str13);
            }
        }
        zArr69 = wy0Var.V1;
        if (zArr69.length > 68) {
            zArr234 = wy0Var.V1;
            if (zArr234[68]) {
                if (this.f43835e == null) {
                    this.f43835e = oVar.h(vs.class).b();
                }
                nm.m mVar69 = this.f43835e;
                um.c h104 = cVar.h("instagram_data");
                vsVar = wy0Var.f43473q0;
                mVar69.e(h104, vsVar);
            }
        }
        zArr70 = wy0Var.V1;
        if (zArr70.length > 69) {
            zArr233 = wy0Var.V1;
            if (zArr233[69]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar70 = this.f43846p;
                um.c h105 = cVar.h("instagram_token_status");
                str12 = wy0Var.f43476r0;
                mVar70.e(h105, str12);
            }
        }
        zArr71 = wy0Var.V1;
        if (zArr71.length > 70) {
            zArr232 = wy0Var.V1;
            if (zArr232[70]) {
                if (this.f43836f == null) {
                    this.f43836f = oVar.h(Integer.class).b();
                }
                nm.m mVar71 = this.f43836f;
                um.c h106 = cVar.h("interest_following_count");
                num16 = wy0Var.f43479s0;
                mVar71.e(h106, num16);
            }
        }
        zArr72 = wy0Var.V1;
        if (zArr72.length > 71) {
            zArr231 = wy0Var.V1;
            if (zArr231[71]) {
                if (this.f43836f == null) {
                    this.f43836f = oVar.h(Integer.class).b();
                }
                nm.m mVar72 = this.f43836f;
                um.c h107 = cVar.h("invisible_board_count");
                num15 = wy0Var.f43482t0;
                mVar72.e(h107, num15);
            }
        }
        zArr73 = wy0Var.V1;
        if (zArr73.length > 72) {
            zArr230 = wy0Var.V1;
            if (zArr230[72]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar73 = this.f43832b;
                um.c h108 = cVar.h("ip_stela_rec_disabled");
                bool39 = wy0Var.f43485u0;
                mVar73.e(h108, bool39);
            }
        }
        zArr74 = wy0Var.V1;
        if (zArr74.length > 73) {
            zArr229 = wy0Var.V1;
            if (zArr229[73]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar74 = this.f43832b;
                um.c h109 = cVar.h("is_ads_only_profile");
                bool38 = wy0Var.f43488v0;
                mVar74.e(h109, bool38);
            }
        }
        zArr75 = wy0Var.V1;
        if (zArr75.length > 74) {
            zArr228 = wy0Var.V1;
            if (zArr228[74]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar75 = this.f43832b;
                um.c h110 = cVar.h("is_age_eligible_for_lead_form_autofill");
                bool37 = wy0Var.f43491w0;
                mVar75.e(h110, bool37);
            }
        }
        zArr76 = wy0Var.V1;
        if (zArr76.length > 75) {
            zArr227 = wy0Var.V1;
            if (zArr227[75]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar76 = this.f43832b;
                um.c h111 = cVar.h("is_candidate_for_parental_control_passcode");
                bool36 = wy0Var.f43494x0;
                mVar76.e(h111, bool36);
            }
        }
        zArr77 = wy0Var.V1;
        if (zArr77.length > 76) {
            zArr226 = wy0Var.V1;
            if (zArr226[76]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar77 = this.f43832b;
                um.c h112 = cVar.h("is_country_eligible_for_lead_form_autofill");
                bool35 = wy0Var.f43497y0;
                mVar77.e(h112, bool35);
            }
        }
        zArr78 = wy0Var.V1;
        if (zArr78.length > 77) {
            zArr225 = wy0Var.V1;
            if (zArr225[77]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar78 = this.f43832b;
                um.c h113 = cVar.h("is_default_image");
                bool34 = wy0Var.f43500z0;
                mVar78.e(h113, bool34);
            }
        }
        zArr79 = wy0Var.V1;
        if (zArr79.length > 78) {
            zArr224 = wy0Var.V1;
            if (zArr224[78]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar79 = this.f43832b;
                um.c h114 = cVar.h("is_email_eligible_for_lead_form_autofill");
                bool33 = wy0Var.A0;
                mVar79.e(h114, bool33);
            }
        }
        zArr80 = wy0Var.V1;
        if (zArr80.length > 79) {
            zArr223 = wy0Var.V1;
            if (zArr223[79]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar80 = this.f43832b;
                um.c h115 = cVar.h("is_employee");
                bool32 = wy0Var.B0;
                mVar80.e(h115, bool32);
            }
        }
        zArr81 = wy0Var.V1;
        if (zArr81.length > 80) {
            zArr222 = wy0Var.V1;
            if (zArr222[80]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar81 = this.f43832b;
                um.c h116 = cVar.h("is_gco_account");
                bool31 = wy0Var.C0;
                mVar81.e(h116, bool31);
            }
        }
        zArr82 = wy0Var.V1;
        if (zArr82.length > 81) {
            zArr221 = wy0Var.V1;
            if (zArr221[81]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar82 = this.f43832b;
                um.c h117 = cVar.h("is_gender_eligible_for_lead_form_autofill");
                bool30 = wy0Var.D0;
                mVar82.e(h117, bool30);
            }
        }
        zArr83 = wy0Var.V1;
        if (zArr83.length > 82) {
            zArr220 = wy0Var.V1;
            if (zArr220[82]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar83 = this.f43832b;
                um.c h118 = cVar.h("is_in_dsa_countries");
                bool29 = wy0Var.E0;
                mVar83.e(h118, bool29);
            }
        }
        zArr84 = wy0Var.V1;
        if (zArr84.length > 83) {
            zArr219 = wy0Var.V1;
            if (zArr219[83]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar84 = this.f43832b;
                um.c h119 = cVar.h("is_inspirational_merchant");
                bool28 = wy0Var.F0;
                mVar84.e(h119, bool28);
            }
        }
        zArr85 = wy0Var.V1;
        if (zArr85.length > 84) {
            zArr218 = wy0Var.V1;
            if (zArr218[84]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar85 = this.f43832b;
                um.c h120 = cVar.h("is_name_eligible_for_lead_form_autofill");
                bool27 = wy0Var.G0;
                mVar85.e(h120, bool27);
            }
        }
        zArr86 = wy0Var.V1;
        if (zArr86.length > 85) {
            zArr217 = wy0Var.V1;
            if (zArr217[85]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar86 = this.f43832b;
                um.c h121 = cVar.h("is_parental_control_passcode_enabled");
                bool26 = wy0Var.H0;
                mVar86.e(h121, bool26);
            }
        }
        zArr87 = wy0Var.V1;
        if (zArr87.length > 86) {
            zArr216 = wy0Var.V1;
            if (zArr216[86]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar87 = this.f43832b;
                um.c h122 = cVar.h("is_parental_control_passcode_verification_pending");
                bool25 = wy0Var.I0;
                mVar87.e(h122, bool25);
            }
        }
        zArr88 = wy0Var.V1;
        if (zArr88.length > 87) {
            zArr215 = wy0Var.V1;
            if (zArr215[87]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar88 = this.f43832b;
                um.c h123 = cVar.h("is_partner");
                bool24 = wy0Var.J0;
                mVar88.e(h123, bool24);
            }
        }
        zArr89 = wy0Var.V1;
        if (zArr89.length > 88) {
            zArr214 = wy0Var.V1;
            if (zArr214[88]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar89 = this.f43832b;
                um.c h124 = cVar.h("is_primary_website_verified");
                bool23 = wy0Var.K0;
                mVar89.e(h124, bool23);
            }
        }
        zArr90 = wy0Var.V1;
        if (zArr90.length > 89) {
            zArr213 = wy0Var.V1;
            if (zArr213[89]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar90 = this.f43832b;
                um.c h125 = cVar.h("is_private_profile");
                bool22 = wy0Var.L0;
                mVar90.e(h125, bool22);
            }
        }
        zArr91 = wy0Var.V1;
        if (zArr91.length > 90) {
            zArr212 = wy0Var.V1;
            if (zArr212[90]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar91 = this.f43832b;
                um.c h126 = cVar.h("is_regulated_by_aadc");
                bool21 = wy0Var.M0;
                mVar91.e(h126, bool21);
            }
        }
        zArr92 = wy0Var.V1;
        if (zArr92.length > 91) {
            zArr211 = wy0Var.V1;
            if (zArr211[91]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar92 = this.f43832b;
                um.c h127 = cVar.h("is_sso_user");
                bool20 = wy0Var.N0;
                mVar92.e(h127, bool20);
            }
        }
        zArr93 = wy0Var.V1;
        if (zArr93.length > 92) {
            zArr210 = wy0Var.V1;
            if (zArr210[92]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar93 = this.f43832b;
                um.c h128 = cVar.h("is_story_pin_creator");
                bool19 = wy0Var.O0;
                mVar93.e(h128, bool19);
            }
        }
        zArr94 = wy0Var.V1;
        if (zArr94.length > 93) {
            zArr209 = wy0Var.V1;
            if (zArr209[93]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar94 = this.f43832b;
                um.c h129 = cVar.h("is_under_18");
                bool18 = wy0Var.P0;
                mVar94.e(h129, bool18);
            }
        }
        zArr95 = wy0Var.V1;
        if (zArr95.length > 94) {
            zArr208 = wy0Var.V1;
            if (zArr208[94]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar95 = this.f43832b;
                um.c h130 = cVar.h("is_verified_merchant");
                bool17 = wy0Var.Q0;
                mVar95.e(h130, bool17);
            }
        }
        zArr96 = wy0Var.V1;
        if (zArr96.length > 95) {
            zArr207 = wy0Var.V1;
            if (zArr207[95]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar96 = this.f43846p;
                um.c h131 = cVar.h("last_name");
                str11 = wy0Var.R0;
                mVar96.e(h131, str11);
            }
        }
        zArr97 = wy0Var.V1;
        if (zArr97.length > 96) {
            zArr206 = wy0Var.V1;
            if (zArr206[96]) {
                if (this.f43833c == null) {
                    this.f43833c = oVar.h(Date.class).b();
                }
                nm.m mVar97 = this.f43833c;
                um.c h132 = cVar.h("last_pin_save_time");
                date = wy0Var.S0;
                mVar97.e(h132, date);
            }
        }
        zArr98 = wy0Var.V1;
        if (zArr98.length > 97) {
            zArr205 = wy0Var.V1;
            if (zArr205[97]) {
                if (this.f43836f == null) {
                    this.f43836f = oVar.h(Integer.class).b();
                }
                nm.m mVar98 = this.f43836f;
                um.c h133 = cVar.h("live_creator_type");
                num14 = wy0Var.T0;
                mVar98.e(h133, num14);
            }
        }
        zArr99 = wy0Var.V1;
        if (zArr99.length > 98) {
            zArr204 = wy0Var.V1;
            if (zArr204[98]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar99 = this.f43846p;
                um.c h134 = cVar.h("locale");
                str10 = wy0Var.U0;
                mVar99.e(h134, str10);
            }
        }
        zArr100 = wy0Var.V1;
        if (zArr100.length > 99) {
            zArr203 = wy0Var.V1;
            if (zArr203[99]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar100 = this.f43846p;
                um.c h135 = cVar.h("location");
                str9 = wy0Var.V0;
                mVar100.e(h135, str9);
            }
        }
        zArr101 = wy0Var.V1;
        if (zArr101.length > 100) {
            zArr202 = wy0Var.V1;
            if (zArr202[100]) {
                if (this.f43848r == null) {
                    this.f43848r = oVar.h(wy0.b.class).b();
                }
                nm.m mVar101 = this.f43848r;
                um.c h136 = cVar.h("login_state");
                bVar = wy0Var.W0;
                mVar101.e(h136, bVar);
            }
        }
        zArr102 = wy0Var.V1;
        if (zArr102.length > 101) {
            zArr201 = wy0Var.V1;
            if (zArr201[101]) {
                if (this.f43837g == null) {
                    this.f43837g = oVar.g(new TypeToken<List<qv>>(this) { // from class: com.pinterest.api.model.User$UserTypeAdapter$4
                    }).b();
                }
                nm.m mVar102 = this.f43837g;
                um.c h137 = cVar.h("messaging_permissions");
                list5 = wy0Var.X0;
                mVar102.e(h137, list5);
            }
        }
        zArr103 = wy0Var.V1;
        if (zArr103.length > 102) {
            zArr200 = wy0Var.V1;
            if (zArr200[102]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar103 = this.f43846p;
                um.c h138 = cVar.h("most_recent_board_sort_order");
                str8 = wy0Var.Y0;
                mVar103.e(h138, str8);
            }
        }
        zArr104 = wy0Var.V1;
        if (zArr104.length > 103) {
            zArr199 = wy0Var.V1;
            if (zArr199[103]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar104 = this.f43832b;
                um.c h139 = cVar.h("opt_in_private_account");
                bool16 = wy0Var.Z0;
                mVar104.e(h139, bool16);
            }
        }
        zArr105 = wy0Var.V1;
        if (zArr105.length > 104) {
            zArr198 = wy0Var.V1;
            if (zArr198[104]) {
                if (this.f43840j == null) {
                    this.f43840j = oVar.g(new TypeToken<List<wy0>>(this) { // from class: com.pinterest.api.model.User$UserTypeAdapter$5
                    }).b();
                }
                nm.m mVar105 = this.f43840j;
                um.c h140 = cVar.h("owners");
                list4 = wy0Var.f43426a1;
                mVar105.e(h140, list4);
            }
        }
        zArr106 = wy0Var.V1;
        if (zArr106.length > 105) {
            zArr197 = wy0Var.V1;
            if (zArr197[105]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar106 = this.f43846p;
                um.c h141 = cVar.h("parental_control_anonymized_email");
                str7 = wy0Var.f43429b1;
                mVar106.e(h141, str7);
            }
        }
        zArr107 = wy0Var.V1;
        if (zArr107.length > 106) {
            zArr196 = wy0Var.V1;
            if (zArr196[106]) {
                if (this.f43843m == null) {
                    this.f43843m = oVar.h(v10.class).b();
                }
                nm.m mVar107 = this.f43843m;
                um.c h142 = cVar.h("partner");
                v10Var = wy0Var.f43432c1;
                mVar107.e(h142, v10Var);
            }
        }
        zArr108 = wy0Var.V1;
        if (zArr108.length > 107) {
            zArr195 = wy0Var.V1;
            if (zArr195[107]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar108 = this.f43832b;
                um.c h143 = cVar.h("partnership_opt_in");
                bool15 = wy0Var.f43435d1;
                mVar108.e(h143, bool15);
            }
        }
        zArr109 = wy0Var.V1;
        if (zArr109.length > 108) {
            zArr194 = wy0Var.V1;
            if (zArr194[108]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar109 = this.f43832b;
                um.c h144 = cVar.h("personalize_from_offsite_browsing");
                bool14 = wy0Var.f43438e1;
                mVar109.e(h144, bool14);
            }
        }
        zArr110 = wy0Var.V1;
        if (zArr110.length > 109) {
            zArr193 = wy0Var.V1;
            if (zArr193[109]) {
                if (this.f43836f == null) {
                    this.f43836f = oVar.h(Integer.class).b();
                }
                nm.m mVar110 = this.f43836f;
                um.c h145 = cVar.h("pin_count");
                num13 = wy0Var.f43441f1;
                mVar110.e(h145, num13);
            }
        }
        zArr111 = wy0Var.V1;
        if (zArr111.length > 110) {
            zArr192 = wy0Var.V1;
            if (zArr192[110]) {
                if (this.f43836f == null) {
                    this.f43836f = oVar.h(Integer.class).b();
                }
                nm.m mVar111 = this.f43836f;
                um.c h146 = cVar.h("pins_done_count");
                num12 = wy0Var.f43444g1;
                mVar111.e(h146, num12);
            }
        }
        zArr112 = wy0Var.V1;
        if (zArr112.length > 111) {
            zArr191 = wy0Var.V1;
            if (zArr191[111]) {
                if (this.f43841k == null) {
                    this.f43841k = oVar.g(new TypeToken<Map<String, List<sr>>>(this) { // from class: com.pinterest.api.model.User$UserTypeAdapter$6
                    }).b();
                }
                nm.m mVar112 = this.f43841k;
                um.c h147 = cVar.h("popular_product_images");
                map3 = wy0Var.f43447h1;
                mVar112.e(h147, map3);
            }
        }
        zArr113 = wy0Var.V1;
        if (zArr113.length > 112) {
            zArr190 = wy0Var.V1;
            if (zArr190[112]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar113 = this.f43846p;
                um.c h148 = cVar.h("ppa_merchant_id");
                str6 = wy0Var.f43450i1;
                mVar113.e(h148, str6);
            }
        }
        zArr114 = wy0Var.V1;
        if (zArr114.length > 113) {
            zArr189 = wy0Var.V1;
            if (zArr189[113]) {
                if (this.f43836f == null) {
                    this.f43836f = oVar.h(Integer.class).b();
                }
                nm.m mVar114 = this.f43836f;
                um.c h149 = cVar.h("private_story_pin_count");
                num11 = wy0Var.f43453j1;
                mVar114.e(h149, num11);
            }
        }
        zArr115 = wy0Var.V1;
        if (zArr115.length > 114) {
            zArr188 = wy0Var.V1;
            if (zArr188[114]) {
                if (this.f43844n == null) {
                    this.f43844n = oVar.h(b90.class).b();
                }
                nm.m mVar115 = this.f43844n;
                um.c h150 = cVar.h("profile_cover");
                b90Var = wy0Var.f43456k1;
                mVar115.e(h150, b90Var);
            }
        }
        zArr116 = wy0Var.V1;
        if (zArr116.length > 115) {
            zArr187 = wy0Var.V1;
            if (zArr187[115]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar116 = this.f43832b;
                um.c h151 = cVar.h("profile_discovered_public");
                bool13 = wy0Var.f43459l1;
                mVar116.e(h151, bool13);
            }
        }
        zArr117 = wy0Var.V1;
        if (zArr117.length > 116) {
            zArr186 = wy0Var.V1;
            if (zArr186[116]) {
                if (this.f43836f == null) {
                    this.f43836f = oVar.h(Integer.class).b();
                }
                nm.m mVar117 = this.f43836f;
                um.c h152 = cVar.h("profile_highlight_count");
                num10 = wy0Var.f43462m1;
                mVar117.e(h152, num10);
            }
        }
        zArr118 = wy0Var.V1;
        if (zArr118.length > 117) {
            zArr185 = wy0Var.V1;
            if (zArr185[117]) {
                if (this.f43836f == null) {
                    this.f43836f = oVar.h(Integer.class).b();
                }
                nm.m mVar118 = this.f43836f;
                um.c h153 = cVar.h("profile_reach");
                num9 = wy0Var.f43465n1;
                mVar118.e(h153, num9);
            }
        }
        zArr119 = wy0Var.V1;
        if (zArr119.length > 118) {
            zArr184 = wy0Var.V1;
            if (zArr184[118]) {
                if (this.f43836f == null) {
                    this.f43836f = oVar.h(Integer.class).b();
                }
                nm.m mVar119 = this.f43836f;
                um.c h154 = cVar.h("profile_views");
                num8 = wy0Var.f43468o1;
                mVar119.e(h154, num8);
            }
        }
        zArr120 = wy0Var.V1;
        if (zArr120.length > 119) {
            zArr183 = wy0Var.V1;
            if (zArr183[119]) {
                if (this.f43839i == null) {
                    this.f43839i = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.User$UserTypeAdapter$7
                    }).b();
                }
                nm.m mVar120 = this.f43839i;
                um.c h155 = cVar.h("pronouns");
                list3 = wy0Var.f43471p1;
                mVar120.e(h155, list3);
            }
        }
        zArr121 = wy0Var.V1;
        if (zArr121.length > 120) {
            zArr182 = wy0Var.V1;
            if (zArr182[120]) {
                if (this.f43836f == null) {
                    this.f43836f = oVar.h(Integer.class).b();
                }
                nm.m mVar121 = this.f43836f;
                um.c h156 = cVar.h("quick_saves_pin_count");
                num7 = wy0Var.f43474q1;
                mVar121.e(h156, num7);
            }
        }
        zArr122 = wy0Var.V1;
        if (zArr122.length > 121) {
            zArr181 = wy0Var.V1;
            if (zArr181[121]) {
                if (this.f43841k == null) {
                    this.f43841k = oVar.g(new TypeToken<Map<String, List<sr>>>(this) { // from class: com.pinterest.api.model.User$UserTypeAdapter$8
                    }).b();
                }
                nm.m mVar122 = this.f43841k;
                um.c h157 = cVar.h("recent_pin_images");
                map2 = wy0Var.f43477r1;
                mVar122.e(h157, map2);
            }
        }
        zArr123 = wy0Var.V1;
        if (zArr123.length > 122) {
            zArr180 = wy0Var.V1;
            if (zArr180[122]) {
                if (this.f43842l == null) {
                    this.f43842l = oVar.g(new TypeToken<Map<String, List<String>>>(this) { // from class: com.pinterest.api.model.User$UserTypeAdapter$9
                    }).b();
                }
                nm.m mVar123 = this.f43842l;
                um.c h158 = cVar.h("recent_story_pin_images");
                map = wy0Var.f43480s1;
                mVar123.e(h158, map);
            }
        }
        zArr124 = wy0Var.V1;
        if (zArr124.length > 123) {
            zArr179 = wy0Var.V1;
            if (zArr179[123]) {
                if (this.f43845o == null) {
                    this.f43845o = oVar.h(ke0.class).b();
                }
                nm.m mVar124 = this.f43845o;
                um.c h159 = cVar.h("resurrection_info");
                ke0Var = wy0Var.f43483t1;
                mVar124.e(h159, ke0Var);
            }
        }
        zArr125 = wy0Var.V1;
        if (zArr125.length > 124) {
            zArr178 = wy0Var.V1;
            if (zArr178[124]) {
                if (this.f43836f == null) {
                    this.f43836f = oVar.h(Integer.class).b();
                }
                nm.m mVar125 = this.f43836f;
                um.c h160 = cVar.h("save_behavior");
                num6 = wy0Var.f43486u1;
                mVar125.e(h160, num6);
            }
        }
        zArr126 = wy0Var.V1;
        if (zArr126.length > 125) {
            zArr177 = wy0Var.V1;
            if (zArr177[125]) {
                if (this.f43836f == null) {
                    this.f43836f = oVar.h(Integer.class).b();
                }
                nm.m mVar126 = this.f43836f;
                um.c h161 = cVar.h("scheduled_pin_count");
                num5 = wy0Var.f43489v1;
                mVar126.e(h161, num5);
            }
        }
        zArr127 = wy0Var.V1;
        if (zArr127.length > 126) {
            zArr176 = wy0Var.V1;
            if (zArr176[126]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar127 = this.f43832b;
                um.c h162 = cVar.h("search_privacy_enabled");
                bool12 = wy0Var.f43492w1;
                mVar127.e(h162, bool12);
            }
        }
        zArr128 = wy0Var.V1;
        if (zArr128.length > 127) {
            zArr175 = wy0Var.V1;
            if (zArr175[127]) {
                if (this.f43836f == null) {
                    this.f43836f = oVar.h(Integer.class).b();
                }
                nm.m mVar128 = this.f43836f;
                um.c h163 = cVar.h("secret_board_count");
                num4 = wy0Var.f43495x1;
                mVar128.e(h163, num4);
            }
        }
        zArr129 = wy0Var.V1;
        if (zArr129.length > 128) {
            zArr174 = wy0Var.V1;
            if (zArr174[128]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar129 = this.f43832b;
                um.c h164 = cVar.h("shopping_rec_disabled");
                bool11 = wy0Var.f43498y1;
                mVar129.e(h164, bool11);
            }
        }
        zArr130 = wy0Var.V1;
        if (zArr130.length > 129) {
            zArr173 = wy0Var.V1;
            if (zArr173[129]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar130 = this.f43832b;
                um.c h165 = cVar.h("should_default_comments_off");
                bool10 = wy0Var.f43501z1;
                mVar130.e(h165, bool10);
            }
        }
        zArr131 = wy0Var.V1;
        if (zArr131.length > 130) {
            zArr172 = wy0Var.V1;
            if (zArr172[130]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar131 = this.f43832b;
                um.c h166 = cVar.h("should_show_messaging");
                bool9 = wy0Var.A1;
                mVar131.e(h166, bool9);
            }
        }
        zArr132 = wy0Var.V1;
        if (zArr132.length > 131) {
            zArr171 = wy0Var.V1;
            if (zArr171[131]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar132 = this.f43832b;
                um.c h167 = cVar.h("show_all_pins");
                bool8 = wy0Var.B1;
                mVar132.e(h167, bool8);
            }
        }
        zArr133 = wy0Var.V1;
        if (zArr133.length > 132) {
            zArr170 = wy0Var.V1;
            if (zArr170[132]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar133 = this.f43832b;
                um.c h168 = cVar.h("show_creator_profile");
                bool7 = wy0Var.C1;
                mVar133.e(h168, bool7);
            }
        }
        zArr134 = wy0Var.V1;
        if (zArr134.length > 133) {
            zArr169 = wy0Var.V1;
            if (zArr169[133]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar134 = this.f43832b;
                um.c h169 = cVar.h("show_discovered_feed");
                bool6 = wy0Var.D1;
                mVar134.e(h169, bool6);
            }
        }
        zArr135 = wy0Var.V1;
        if (zArr135.length > 134) {
            zArr168 = wy0Var.V1;
            if (zArr168[134]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar135 = this.f43832b;
                um.c h170 = cVar.h("show_personal_boutique");
                bool5 = wy0Var.E1;
                mVar135.e(h170, bool5);
            }
        }
        zArr136 = wy0Var.V1;
        if (zArr136.length > 135) {
            zArr167 = wy0Var.V1;
            if (zArr167[135]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar136 = this.f43832b;
                um.c h171 = cVar.h("show_shopping_list");
                bool4 = wy0Var.F1;
                mVar136.e(h171, bool4);
            }
        }
        zArr137 = wy0Var.V1;
        if (zArr137.length > 136) {
            zArr166 = wy0Var.V1;
            if (zArr166[136]) {
                if (this.f43836f == null) {
                    this.f43836f = oVar.h(Integer.class).b();
                }
                nm.m mVar137 = this.f43836f;
                um.c h172 = cVar.h("story_pin_count");
                num3 = wy0Var.G1;
                mVar137.e(h172, num3);
            }
        }
        zArr138 = wy0Var.V1;
        if (zArr138.length > 137) {
            zArr165 = wy0Var.V1;
            if (zArr165[137]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar138 = this.f43832b;
                um.c h173 = cVar.h("subscribed_to_notifications");
                bool3 = wy0Var.H1;
                mVar138.e(h173, bool3);
            }
        }
        zArr139 = wy0Var.V1;
        if (zArr139.length > 138) {
            zArr164 = wy0Var.V1;
            if (zArr164[138]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar139 = this.f43846p;
                um.c h174 = cVar.h("teen_safety_options_url");
                str5 = wy0Var.I1;
                mVar139.e(h174, str5);
            }
        }
        zArr140 = wy0Var.V1;
        if (zArr140.length > 139) {
            zArr163 = wy0Var.V1;
            if (zArr163[139]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar140 = this.f43832b;
                um.c h175 = cVar.h("third_party_marketing_tracking_enabled");
                bool2 = wy0Var.J1;
                mVar140.e(h175, bool2);
            }
        }
        zArr141 = wy0Var.V1;
        if (zArr141.length > 140) {
            zArr162 = wy0Var.V1;
            if (zArr162[140]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar141 = this.f43846p;
                um.c h176 = cVar.h("type");
                str4 = wy0Var.K1;
                mVar141.e(h176, str4);
            }
        }
        zArr142 = wy0Var.V1;
        if (zArr142.length > 141) {
            zArr161 = wy0Var.V1;
            if (zArr161[141]) {
                if (this.f43849s == null) {
                    this.f43849s = oVar.h(kz0.class).b();
                }
                nm.m mVar142 = this.f43849s;
                um.c h177 = cVar.h("user_recommendation_reason");
                kz0Var = wy0Var.L1;
                mVar142.e(h177, kz0Var);
            }
        }
        zArr143 = wy0Var.V1;
        if (zArr143.length > 142) {
            zArr160 = wy0Var.V1;
            if (zArr160[142]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar143 = this.f43846p;
                um.c h178 = cVar.h("username");
                str3 = wy0Var.M1;
                mVar143.e(h178, str3);
            }
        }
        zArr144 = wy0Var.V1;
        if (zArr144.length > 143) {
            zArr159 = wy0Var.V1;
            if (zArr159[143]) {
                if (this.f43839i == null) {
                    this.f43839i = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.User$UserTypeAdapter$10
                    }).b();
                }
                nm.m mVar144 = this.f43839i;
                um.c h179 = cVar.h("verified_domains");
                list2 = wy0Var.N1;
                mVar144.e(h179, list2);
            }
        }
        zArr145 = wy0Var.V1;
        if (zArr145.length > 144) {
            zArr158 = wy0Var.V1;
            if (zArr158[144]) {
                if (this.f43850t == null) {
                    this.f43850t = oVar.h(tz0.class).b();
                }
                nm.m mVar145 = this.f43850t;
                um.c h180 = cVar.h("verified_identity");
                tz0Var = wy0Var.O1;
                mVar145.e(h180, tz0Var);
            }
        }
        zArr146 = wy0Var.V1;
        if (zArr146.length > 145) {
            zArr157 = wy0Var.V1;
            if (zArr157[145]) {
                if (this.f43839i == null) {
                    this.f43839i = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.User$UserTypeAdapter$11
                    }).b();
                }
                nm.m mVar146 = this.f43839i;
                um.c h181 = cVar.h("verified_user_websites");
                list = wy0Var.P1;
                mVar146.e(h181, list);
            }
        }
        zArr147 = wy0Var.V1;
        if (zArr147.length > 146) {
            zArr156 = wy0Var.V1;
            if (zArr156[146]) {
                if (this.f43836f == null) {
                    this.f43836f = oVar.h(Integer.class).b();
                }
                nm.m mVar147 = this.f43836f;
                um.c h182 = cVar.h("video_pin_count");
                num2 = wy0Var.Q1;
                mVar147.e(h182, num2);
            }
        }
        zArr148 = wy0Var.V1;
        if (zArr148.length > 147) {
            zArr155 = wy0Var.V1;
            if (zArr155[147]) {
                if (this.f43836f == null) {
                    this.f43836f = oVar.h(Integer.class).b();
                }
                nm.m mVar148 = this.f43836f;
                um.c h183 = cVar.h("video_views");
                num = wy0Var.R1;
                mVar148.e(h183, num);
            }
        }
        zArr149 = wy0Var.V1;
        if (zArr149.length > 148) {
            zArr154 = wy0Var.V1;
            if (zArr154[148]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar149 = this.f43846p;
                um.c h184 = cVar.h("vto_beauty_access_status");
                str2 = wy0Var.S1;
                mVar149.e(h184, str2);
            }
        }
        zArr150 = wy0Var.V1;
        if (zArr150.length > 149) {
            zArr153 = wy0Var.V1;
            if (zArr153[149]) {
                if (this.f43846p == null) {
                    this.f43846p = oVar.h(String.class).b();
                }
                nm.m mVar150 = this.f43846p;
                um.c h185 = cVar.h("website_url");
                str = wy0Var.T1;
                mVar150.e(h185, str);
            }
        }
        zArr151 = wy0Var.V1;
        if (zArr151.length > 150) {
            zArr152 = wy0Var.V1;
            if (zArr152[150]) {
                if (this.f43832b == null) {
                    this.f43832b = oVar.h(Boolean.class).b();
                }
                nm.m mVar151 = this.f43832b;
                um.c h186 = cVar.h("weight_loss_ads_opted_out");
                bool = wy0Var.U1;
                mVar151.e(h186, bool);
            }
        }
        cVar.g();
    }
}
