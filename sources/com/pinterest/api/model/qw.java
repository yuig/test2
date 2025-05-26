package com.pinterest.api.model;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qw extends Enum {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ qw[] $VALUES;
    public static final qw AGGREGATED_COMMENT;
    public static final qw BOARD;
    public static final qw BOARD_NOTE;
    public static final qw BOARD_NOTE_LIST;
    public static final qw BOARD_NOTE_LIST_ITEM_FEED_WRAPPER;
    public static final qw BOARD_NOTE_PIN_COLLECTION;
    public static final qw BOARD_SECTION;
    public static final qw BOARD_SECTION_NAME_RECOMMENDATION;
    public static final qw BOARD_SELECT_PINS_EMPTY_VIEW;
    public static final qw COMMENT_STICKER;
    public static final qw COMMUNITY_INSIGHT_HEADER_ITEM;
    public static final qw CONVERSATION;
    public static final qw CONVERSATION_CONTACT_REQUEST;
    public static final qw CONVERSATION_MESSAGE;
    public static final qw CREATOR_RECOMMENDATION_ITEM;

    @NotNull
    public static final pw Companion;
    public static final qw EXPLORE_ARTICLE;
    public static final qw FEED_SECTION_TITLE;
    public static final qw GOLD_STANDARD_CONTENT;
    public static final qw IDEA_PIN_MUSIC_ARTIST;
    public static final qw IDEA_PIN_MUSIC_BROWSE_TITLE_MODEL;
    public static final qw IDEA_PIN_MUSIC_METADATA;
    public static final qw IDEA_PIN_MUSIC_TAGS;
    public static final qw IDEA_PIN_NO_MUSIC_SEARCH_RESULT;
    public static final qw IDEA_PIN_NO_STICKER_SEARCH_RESULT;
    public static final qw IDEA_PIN_STICKER;
    public static final qw INTEREST;
    public static final qw NEWS_HUB_ITEM;
    public static final qw NEWS_HUB_ITEM_WRAPPER;
    public static final qw ORDER;
    public static final qw PARTNER;
    public static final qw PIN;
    public static final qw PIN_IMAGE;
    public static final qw PLACE;
    public static final qw PLANK_STORY;
    public static final qw PRODUCT_GROUP;
    public static final qw PRODUCT_REVIEW;
    public static final qw REPORT_REASON;
    public static final qw SCHEDULED_PIN;
    public static final qw SCHEDULED_PIN_SECTION_HEADER;
    public static final qw STORY;
    public static final qw STRUCTURED_FEED_EOF_EMPTY_STATE;
    public static final qw TEST_MODEL;
    public static final qw TODAY_ARTICLE;
    public static final qw TRACKED_COMMENT;
    public static final qw UNIFIED_COMMENTS_COUNT_HEADER_ITEM;
    public static final qw USECASE;
    public static final qw USER;
    public static final qw USER_DID_IT_DATA;
    public static final qw USER_REACTION;

    @NotNull
    private static final Map<rl2.d, qw> lookupByClass;

    @NotNull
    private static final Map<String, qw> lookupByName;

    @NotNull
    private final String type;

    private static final /* synthetic */ qw[] $values() {
        return new qw[]{PIN, BOARD, USER, INTEREST, BOARD_SECTION, PARTNER, STORY, PLANK_STORY, USER_REACTION, CONVERSATION_MESSAGE, CONVERSATION, CONVERSATION_CONTACT_REQUEST, PLACE, FEED_SECTION_TITLE, BOARD_NOTE, BOARD_NOTE_LIST, BOARD_NOTE_LIST_ITEM_FEED_WRAPPER, BOARD_NOTE_PIN_COLLECTION, BOARD_SELECT_PINS_EMPTY_VIEW, USECASE, TODAY_ARTICLE, PRODUCT_GROUP, EXPLORE_ARTICLE, AGGREGATED_COMMENT, USER_DID_IT_DATA, UNIFIED_COMMENTS_COUNT_HEADER_ITEM, COMMUNITY_INSIGHT_HEADER_ITEM, BOARD_SECTION_NAME_RECOMMENDATION, NEWS_HUB_ITEM, REPORT_REASON, CREATOR_RECOMMENDATION_ITEM, TRACKED_COMMENT, IDEA_PIN_STICKER, IDEA_PIN_NO_STICKER_SEARCH_RESULT, IDEA_PIN_MUSIC_TAGS, IDEA_PIN_MUSIC_METADATA, IDEA_PIN_MUSIC_ARTIST, IDEA_PIN_MUSIC_BROWSE_TITLE_MODEL, IDEA_PIN_NO_MUSIC_SEARCH_RESULT, ORDER, PRODUCT_REVIEW, GOLD_STANDARD_CONTENT, SCHEDULED_PIN, SCHEDULED_PIN_SECTION_HEADER, STRUCTURED_FEED_EOF_EMPTY_STATE, COMMENT_STICKER, PIN_IMAGE, NEWS_HUB_ITEM_WRAPPER, TEST_MODEL};
    }

    static {
        qw qwVar = new qw("PIN", 0, "pin");
        PIN = qwVar;
        qw qwVar2 = new qw("BOARD", 1, "board");
        BOARD = qwVar2;
        qw qwVar3 = new qw("USER", 2, "user");
        USER = qwVar3;
        qw qwVar4 = new qw("INTEREST", 3, "interest");
        INTEREST = qwVar4;
        qw qwVar5 = new qw("BOARD_SECTION", 4, "board_section");
        BOARD_SECTION = qwVar5;
        qw qwVar6 = new qw("PARTNER", 5, "partner");
        PARTNER = qwVar6;
        qw qwVar7 = new qw("STORY", 6, "story");
        STORY = qwVar7;
        qw qwVar8 = new qw("PLANK_STORY", 7, "story");
        PLANK_STORY = qwVar8;
        qw qwVar9 = new qw("USER_REACTION", 8, "userreaction");
        USER_REACTION = qwVar9;
        qw qwVar10 = new qw("CONVERSATION_MESSAGE", 9, "message");
        CONVERSATION_MESSAGE = qwVar10;
        qw qwVar11 = new qw("CONVERSATION", 10, "conversation");
        CONVERSATION = qwVar11;
        qw qwVar12 = new qw("CONVERSATION_CONTACT_REQUEST", 11, "contactrequest");
        CONVERSATION_CONTACT_REQUEST = qwVar12;
        qw qwVar13 = new qw("PLACE", 12, "place");
        PLACE = qwVar13;
        qw qwVar14 = new qw("FEED_SECTION_TITLE", 13, "feed_section_title");
        FEED_SECTION_TITLE = qwVar14;
        qw qwVar15 = new qw("BOARD_NOTE", 14, "boardnote");
        BOARD_NOTE = qwVar15;
        qw qwVar16 = new qw("BOARD_NOTE_LIST", 15, "boardnotelist");
        BOARD_NOTE_LIST = qwVar16;
        qw qwVar17 = new qw("BOARD_NOTE_LIST_ITEM_FEED_WRAPPER", 16, "board_note_list_item_feed_wrapper");
        BOARD_NOTE_LIST_ITEM_FEED_WRAPPER = qwVar17;
        qw qwVar18 = new qw("BOARD_NOTE_PIN_COLLECTION", 17, "boardnotepincollection");
        BOARD_NOTE_PIN_COLLECTION = qwVar18;
        qw qwVar19 = new qw("BOARD_SELECT_PINS_EMPTY_VIEW", 18, "board_select_pins_empty_internal");
        BOARD_SELECT_PINS_EMPTY_VIEW = qwVar19;
        qw qwVar20 = new qw("USECASE", 19, "usecase");
        USECASE = qwVar20;
        qw qwVar21 = new qw("TODAY_ARTICLE", 20, "todayarticle");
        TODAY_ARTICLE = qwVar21;
        qw qwVar22 = new qw("PRODUCT_GROUP", 21, "productgroup");
        PRODUCT_GROUP = qwVar22;
        qw qwVar23 = new qw("EXPLORE_ARTICLE", 22, "explorearticle");
        EXPLORE_ARTICLE = qwVar23;
        qw qwVar24 = new qw("AGGREGATED_COMMENT", 23, "aggregatedcomment");
        AGGREGATED_COMMENT = qwVar24;
        qw qwVar25 = new qw("USER_DID_IT_DATA", 24, "userdiditdata");
        USER_DID_IT_DATA = qwVar25;
        qw qwVar26 = new qw("UNIFIED_COMMENTS_COUNT_HEADER_ITEM", 25, "unified_comments_count_header_item");
        UNIFIED_COMMENTS_COUNT_HEADER_ITEM = qwVar26;
        qw qwVar27 = new qw("COMMUNITY_INSIGHT_HEADER_ITEM", 26, "community_insight_header_item");
        COMMUNITY_INSIGHT_HEADER_ITEM = qwVar27;
        qw qwVar28 = new qw("BOARD_SECTION_NAME_RECOMMENDATION", 27, "board_section_name_recommendation");
        BOARD_SECTION_NAME_RECOMMENDATION = qwVar28;
        qw qwVar29 = new qw("NEWS_HUB_ITEM", 28, "news");
        NEWS_HUB_ITEM = qwVar29;
        qw qwVar30 = new qw("REPORT_REASON", 29, "report_reason");
        REPORT_REASON = qwVar30;
        qw qwVar31 = new qw("CREATOR_RECOMMENDATION_ITEM", 30, "creatorrecommendationitem");
        CREATOR_RECOMMENDATION_ITEM = qwVar31;
        qw qwVar32 = new qw("TRACKED_COMMENT", 31, "trackedcomment");
        TRACKED_COMMENT = qwVar32;
        qw qwVar33 = new qw("IDEA_PIN_STICKER", 32, "storypinsticker");
        IDEA_PIN_STICKER = qwVar33;
        qw qwVar34 = new qw("IDEA_PIN_NO_STICKER_SEARCH_RESULT", 33, "no_sticker_search_results");
        IDEA_PIN_NO_STICKER_SEARCH_RESULT = qwVar34;
        qw qwVar35 = new qw("IDEA_PIN_MUSIC_TAGS", 34, "audiotag");
        IDEA_PIN_MUSIC_TAGS = qwVar35;
        qw qwVar36 = new qw("IDEA_PIN_MUSIC_METADATA", 35, "audio");
        IDEA_PIN_MUSIC_METADATA = qwVar36;
        qw qwVar37 = new qw("IDEA_PIN_MUSIC_ARTIST", 36, "audioartist");
        IDEA_PIN_MUSIC_ARTIST = qwVar37;
        qw qwVar38 = new qw("IDEA_PIN_MUSIC_BROWSE_TITLE_MODEL", 37, "idea_pin_music_browse_title_model");
        IDEA_PIN_MUSIC_BROWSE_TITLE_MODEL = qwVar38;
        qw qwVar39 = new qw("IDEA_PIN_NO_MUSIC_SEARCH_RESULT", 38, "no_music_search_results");
        IDEA_PIN_NO_MUSIC_SEARCH_RESULT = qwVar39;
        qw qwVar40 = new qw("ORDER", 39, "order");
        ORDER = qwVar40;
        qw qwVar41 = new qw("PRODUCT_REVIEW", 40, "product_review");
        PRODUCT_REVIEW = qwVar41;
        qw qwVar42 = new qw("GOLD_STANDARD_CONTENT", 41, "safetyroot");
        GOLD_STANDARD_CONTENT = qwVar42;
        qw qwVar43 = new qw("SCHEDULED_PIN", 42, "scheduledpin");
        SCHEDULED_PIN = qwVar43;
        qw qwVar44 = new qw("SCHEDULED_PIN_SECTION_HEADER", 43, "scheduled_pin_section_header");
        SCHEDULED_PIN_SECTION_HEADER = qwVar44;
        qw qwVar45 = new qw("STRUCTURED_FEED_EOF_EMPTY_STATE", 44, "structured_feed_eof_empty_state_model");
        STRUCTURED_FEED_EOF_EMPTY_STATE = qwVar45;
        qw qwVar46 = new qw("COMMENT_STICKER", 45, "commentsticker");
        COMMENT_STICKER = qwVar46;
        qw qwVar47 = new qw("PIN_IMAGE", 46, "pin_image");
        PIN_IMAGE = qwVar47;
        qw qwVar48 = new qw("NEWS_HUB_ITEM_WRAPPER", 47, "news_hub_item_wrapper");
        NEWS_HUB_ITEM_WRAPPER = qwVar48;
        TEST_MODEL = new qw("TEST_MODEL", 48, "test_model");
        qw[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new pw(null);
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        lookupByClass = kotlin.collections.z0.f(new Pair(l0Var.b(f30.class), qwVar), new Pair(l0Var.b(v7.class), qwVar2), new Pair(l0Var.b(wy0.class), qwVar3), new Pair(l0Var.b(zs.class), qwVar4), new Pair(l0Var.b(ba.class), qwVar5), new Pair(l0Var.b(v10.class), qwVar6), new Pair(l0Var.b(vh.class), qwVar7), new Pair(l0Var.b(zj0.class), qwVar8), new Pair(l0Var.b(e40.class), qwVar47), new Pair(l0Var.b(gz0.class), qwVar9), new Pair(l0Var.b(mv.class), qwVar10), new Pair(l0Var.b(ue.class), qwVar11), new Pair(l0Var.b(ve.class), qwVar12), new Pair(l0Var.b(k60.class), qwVar13), new Pair(l0Var.b(hl.class), qwVar14), new Pair(l0Var.b(qy0.class), qwVar20), new Pair(l0Var.b(zv0.class), qwVar21), new Pair(l0Var.b(g9.class), qwVar15), new Pair(l0Var.b(s9.class), qwVar17), new Pair(l0Var.b(k9.class), qwVar16), new Pair(l0Var.b(w9.class), qwVar18), new Pair(l0Var.b(ga.class), qwVar28), new Pair(l0Var.b(hh0.class), qwVar19), new Pair(l0Var.b(x80.class), qwVar22), new Pair(l0Var.b(z2.class), qwVar24), new Pair(l0Var.b(az0.class), qwVar25), new Pair(l0Var.b(hx0.class), qwVar26), new Pair(l0Var.b(ge.class), qwVar27), new Pair(l0Var.b(xk.class), qwVar23), new Pair(l0Var.b(qx.class), qwVar29), new Pair(l0Var.b(kx0.u.class), qwVar48), new Pair(l0Var.b(cd0.class), qwVar30), new Pair(l0Var.b(jg.class), qwVar31), new Pair(l0Var.b(fw0.class), qwVar32), new Pair(l0Var.b(zq.class), qwVar33), new Pair(l0Var.b(vx.class), qwVar34), new Pair(l0Var.b(iq.class), qwVar35), new Pair(l0Var.b(eq.class), qwVar36), new Pair(l0Var.b(yp.class), qwVar37), new Pair(l0Var.b(aq.class), qwVar38), new Pair(l0Var.b(jx.class), qwVar39), new Pair(l0Var.b(w00.class), qwVar40), new Pair(l0Var.b(d80.class), qwVar41), new Pair(l0Var.b(yy.class), qwVar42), new Pair(l0Var.b(kg0.class), qwVar43), new Pair(l0Var.b(tg0.class), qwVar44), new Pair(l0Var.b(br0.class), qwVar45), new Pair(l0Var.b(wd.class), qwVar46));
        qw[] values = values();
        int a13 = kotlin.collections.y0.a(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13 < 16 ? 16 : a13);
        for (qw qwVar49 : values) {
            linkedHashMap.put(qwVar49.type, qwVar49);
        }
        lookupByName = linkedHashMap;
    }

    private qw(String str, int i13, String str2) {
        super(str, i13);
        this.type = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static qw valueOf(String str) {
        return (qw) Enum.valueOf(qw.class, str);
    }

    public static qw[] values() {
        return (qw[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
