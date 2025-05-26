package h32;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f66962a;

    static {
        int[] iArr = new int[f1.values().length];
        try {
            iArr[f1.VIEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f1.PIN_CREATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f1.PIN_CREATE_FAILURE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[f1.PIN_CREATE_ATTEMPTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[f1.PIN_EDIT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[f1.PIN_DELETE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[f1.PIN_REPIN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[f1.PIN_CLICKTHROUGH.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[f1.PIN_CLICK.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[f1.PIN_ZOOM.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[f1.PIN_SEND.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[f1.PIN_CLOSEUP.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[f1.PIN_IMPRESSION_ONE_PIXEL.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[f1.PIN_CLOSEUP_NUDGE.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[f1.STORY_IMPRESSION_ONE_PIXEL.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[f1.PRODUCT_TAG_VISIT.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[f1.IDEA_PIN_PRODUCT_TAG_REPIN.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[f1.COMMENT_REPLY_TAG_VISIT.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[f1.BOARD_CREATE.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[f1.BOARD_DELETE.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[f1.BOARD_FOLLOW.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[f1.BOARD_UNFOLLOW.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[f1.BOARD_REMOVE_COLLABORATOR.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[f1.BOARD_INVITE_COLLABORATOR.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[f1.BOARD_REQUEST_APPROVAL_INVITE_COLLABORATOR.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[f1.BOARD_SEND.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[f1.BOARD_MERGE.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[f1.BOARD_REPORT.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr[f1.BOARD_END.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr[f1.USER_CREATE.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr[f1.USER_EDIT.ordinal()] = 31;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr[f1.USER_DELETE.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr[f1.USER_REORDER_BOARDS.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr[f1.USER_FOLLOW.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr[f1.USER_UNFOLLOW.ordinal()] = 35;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr[f1.USER_DEACTIVATED.ordinal()] = 36;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr[f1.USER_DELETE_REQUEST.ordinal()] = 37;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr[f1.USER_LOGIN_ATTEMPT.ordinal()] = 38;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr[f1.USER_PASSWORD_RESET_REQUEST.ordinal()] = 39;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr[f1.USER_PASSWORD_RESET_COMPLETED.ordinal()] = 40;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr[f1.USER_BLOCK.ordinal()] = 41;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr[f1.USER_UNBLOCK.ordinal()] = 42;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr[f1.USER_REPORT.ordinal()] = 43;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr[f1.USER_PROFILE_REMOVE.ordinal()] = 44;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr[f1.USER_PROFILE_OVERFLOW_ACTIONS.ordinal()] = 45;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr[f1.USER_PROFILE_OVERFLOW_ACTIONS_REPORT_SPAM.ordinal()] = 46;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr[f1.USER_PROFILE_OVERFLOW_ACTIONS_REPORT_SPAM_CONFIRM.ordinal()] = 47;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr[f1.USER_SET_DSA_OPT_OUT.ordinal()] = 48;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr[f1.START_TYPING.ordinal()] = 49;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr[f1.PIN_REPORT.ordinal()] = 50;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr[f1.PIN_LINK_REPORT.ordinal()] = 51;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr[f1.SEARCH_PINS.ordinal()] = 52;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr[f1.SEARCH_BOARDS.ordinal()] = 53;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr[f1.SEARCH_USERS.ordinal()] = 54;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr[f1.SEARCH_MY_PINS.ordinal()] = 55;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr[f1.SEARCH_VIDEOS.ordinal()] = 56;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr[f1.SEARCH_IDEA_PIN_STICKERS.ordinal()] = 57;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr[f1.SEARCH_IDEA_PIN_MUSIC.ordinal()] = 58;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            iArr[f1.LOGIN_OPTION_ENABLED_SUCCESS.ordinal()] = 59;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            iArr[f1.LOGIN_OPTION_ENABLED_FAILURE.ordinal()] = 60;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            iArr[f1.REFRESH.ordinal()] = 61;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            iArr[f1.PIN_SAVE_TO_DEVICE.ordinal()] = 62;
        } catch (NoSuchFieldError unused62) {
        }
        try {
            iArr[f1.USER_DISABLE_FACBOOK.ordinal()] = 63;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            iArr[f1.USER_DISABLE_GPLUS.ordinal()] = 64;
        } catch (NoSuchFieldError unused64) {
        }
        try {
            iArr[f1.USER_ENABLE_INSTAGRAM.ordinal()] = 65;
        } catch (NoSuchFieldError unused65) {
        }
        try {
            iArr[f1.USER_DISABLE_INSTAGRAM.ordinal()] = 66;
        } catch (NoSuchFieldError unused66) {
        }
        try {
            iArr[f1.USER_ENABLE_ETSY.ordinal()] = 67;
        } catch (NoSuchFieldError unused67) {
        }
        try {
            iArr[f1.USER_DISABLE_ETSY.ordinal()] = 68;
        } catch (NoSuchFieldError unused68) {
        }
        try {
            iArr[f1.CLICK.ordinal()] = 69;
        } catch (NoSuchFieldError unused69) {
        }
        try {
            iArr[f1.TAP.ordinal()] = 70;
        } catch (NoSuchFieldError unused70) {
        }
        try {
            iArr[f1.TAP_LEFT.ordinal()] = 71;
        } catch (NoSuchFieldError unused71) {
        }
        try {
            iArr[f1.TAP_RIGHT.ordinal()] = 72;
        } catch (NoSuchFieldError unused72) {
        }
        try {
            iArr[f1.LONG_PRESS.ordinal()] = 73;
        } catch (NoSuchFieldError unused73) {
        }
        try {
            iArr[f1.DRAG.ordinal()] = 74;
        } catch (NoSuchFieldError unused74) {
        }
        try {
            iArr[f1.HOVER.ordinal()] = 75;
        } catch (NoSuchFieldError unused75) {
        }
        try {
            iArr[f1.TOGGLE_ON.ordinal()] = 76;
        } catch (NoSuchFieldError unused76) {
        }
        try {
            iArr[f1.TOGGLE_OFF.ordinal()] = 77;
        } catch (NoSuchFieldError unused77) {
        }
        try {
            iArr[f1.SWIPE.ordinal()] = 78;
        } catch (NoSuchFieldError unused78) {
        }
        try {
            iArr[f1.SCROLL.ordinal()] = 79;
        } catch (NoSuchFieldError unused79) {
        }
        try {
            iArr[f1.DROPDOWN_CHANGE.ordinal()] = 80;
        } catch (NoSuchFieldError unused80) {
        }
        try {
            iArr[f1.SCROLL_UP_FROM_RELATED_PINS.ordinal()] = 81;
        } catch (NoSuchFieldError unused81) {
        }
        try {
            iArr[f1.SWIPE_UP.ordinal()] = 82;
        } catch (NoSuchFieldError unused82) {
        }
        try {
            iArr[f1.SWIPE_DOWN.ordinal()] = 83;
        } catch (NoSuchFieldError unused83) {
        }
        try {
            iArr[f1.SWIPE_LEFT.ordinal()] = 84;
        } catch (NoSuchFieldError unused84) {
        }
        try {
            iArr[f1.SWIPE_RIGHT.ordinal()] = 85;
        } catch (NoSuchFieldError unused85) {
        }
        try {
            iArr[f1.INPUT_CHANGE.ordinal()] = 86;
        } catch (NoSuchFieldError unused86) {
        }
        try {
            iArr[f1.SELECT.ordinal()] = 87;
        } catch (NoSuchFieldError unused87) {
        }
        try {
            iArr[f1.UNSELECT.ordinal()] = 88;
        } catch (NoSuchFieldError unused88) {
        }
        try {
            iArr[f1.IDEA_PIN_VIDEO_CONTROLS_IN.ordinal()] = 89;
        } catch (NoSuchFieldError unused89) {
        }
        try {
            iArr[f1.IDEA_PIN_VIDEO_CONTROLS_OUT.ordinal()] = 90;
        } catch (NoSuchFieldError unused90) {
        }
        try {
            iArr[f1.PUSH_NOTIFICATION_RECEIVED_BY.ordinal()] = 91;
        } catch (NoSuchFieldError unused91) {
        }
        try {
            iArr[f1.PUSH_NOTIFICATION_OPENED_BY.ordinal()] = 92;
        } catch (NoSuchFieldError unused92) {
        }
        try {
            iArr[f1.PUSH_NOTIFICATION_SOURCE_MISMATCH.ordinal()] = 93;
        } catch (NoSuchFieldError unused93) {
        }
        try {
            iArr[f1.PUSH_NOTIFICATION_BOARD_INVITE_TO_BE_CREATED.ordinal()] = 94;
        } catch (NoSuchFieldError unused94) {
        }
        try {
            iArr[f1.PUSH_NOTIFICATION_BOARD_INVITE_CREATED.ordinal()] = 95;
        } catch (NoSuchFieldError unused95) {
        }
        try {
            iArr[f1.CONTEXTUAL_MENU_OPEN.ordinal()] = 96;
        } catch (NoSuchFieldError unused96) {
        }
        try {
            iArr[f1.CONTEXTUAL_MENU_CLOSE.ordinal()] = 97;
        } catch (NoSuchFieldError unused97) {
        }
        try {
            iArr[f1.RENDER.ordinal()] = 98;
        } catch (NoSuchFieldError unused98) {
        }
        try {
            iArr[f1.DISMISS.ordinal()] = 99;
        } catch (NoSuchFieldError unused99) {
        }
        try {
            iArr[f1.PIN_SCREENSHOT.ordinal()] = 100;
        } catch (NoSuchFieldError unused100) {
        }
        try {
            iArr[f1.BOARD_SCREENSHOT.ordinal()] = 101;
        } catch (NoSuchFieldError unused101) {
        }
        try {
            iArr[f1.USER_SEND.ordinal()] = 102;
        } catch (NoSuchFieldError unused102) {
        }
        try {
            iArr[f1.USER_SEARCH_PRIVACY_CHANGED.ordinal()] = 103;
        } catch (NoSuchFieldError unused103) {
        }
        try {
            iArr[f1.USER_PERSONALIZED_RECOMMENDATIONS_CHANGED.ordinal()] = 104;
        } catch (NoSuchFieldError unused104) {
        }
        try {
            iArr[f1.PULL_TO_REFRESH.ordinal()] = 105;
        } catch (NoSuchFieldError unused105) {
        }
        try {
            iArr[f1.USER_LOGOUT_ATTEMPT.ordinal()] = 106;
        } catch (NoSuchFieldError unused106) {
        }
        try {
            iArr[f1.INITIAL_FEED_LOAD_ABORT.ordinal()] = 107;
        } catch (NoSuchFieldError unused107) {
        }
        try {
            iArr[f1.CONVERSATION_MESSAGE_SEND.ordinal()] = 108;
        } catch (NoSuchFieldError unused108) {
        }
        try {
            iArr[f1.CONVERSATION_HIDE.ordinal()] = 109;
        } catch (NoSuchFieldError unused109) {
        }
        try {
            iArr[f1.CONVERSATION_REPORT.ordinal()] = 110;
        } catch (NoSuchFieldError unused110) {
        }
        try {
            iArr[f1.CONVERSATION_VIEWED.ordinal()] = 111;
        } catch (NoSuchFieldError unused111) {
        }
        try {
            iArr[f1.CONVERSATION_INBOX_VIEWED.ordinal()] = 112;
        } catch (NoSuchFieldError unused112) {
        }
        try {
            iArr[f1.CONVERSATION_THREAD_CLOSEUP_VIEWED.ordinal()] = 113;
        } catch (NoSuchFieldError unused113) {
        }
        try {
            iArr[f1.CONVERSATION_PIN_QUICK_REPLIES_VIEWED.ordinal()] = 114;
        } catch (NoSuchFieldError unused114) {
        }
        try {
            iArr[f1.CONVERSATION_PIN_QUICK_REPLY_SEND.ordinal()] = 115;
        } catch (NoSuchFieldError unused115) {
        }
        try {
            iArr[f1.CONVERSATION_PIN_REPLY.ordinal()] = 116;
        } catch (NoSuchFieldError unused116) {
        }
        try {
            iArr[f1.CONVERSATION_EMPTY_INBOX_SEARCH_BAR_TAP_TARGET.ordinal()] = 117;
        } catch (NoSuchFieldError unused117) {
        }
        try {
            iArr[f1.APP_START.ordinal()] = 118;
        } catch (NoSuchFieldError unused118) {
        }
        try {
            iArr[f1.APP_BACKGROUND.ordinal()] = 119;
        } catch (NoSuchFieldError unused119) {
        }
        try {
            iArr[f1.PULL_NOTIFICATION_OPENED_BY.ordinal()] = 120;
        } catch (NoSuchFieldError unused120) {
        }
        try {
            iArr[f1.INTEREST_FOLLOW.ordinal()] = 121;
        } catch (NoSuchFieldError unused121) {
        }
        try {
            iArr[f1.INTEREST_UNFOLLOW.ordinal()] = 122;
        } catch (NoSuchFieldError unused122) {
        }
        try {
            iArr[f1.DEEP_LINK_PINTEREST.ordinal()] = 123;
        } catch (NoSuchFieldError unused123) {
        }
        try {
            iArr[f1.DEEP_LINK_HTTP.ordinal()] = 124;
        } catch (NoSuchFieldError unused124) {
        }
        try {
            iArr[f1.DEEP_LINK_OTHER.ordinal()] = 125;
        } catch (NoSuchFieldError unused125) {
        }
        try {
            iArr[f1.SERVICE_ENTRY.ordinal()] = 126;
        } catch (NoSuchFieldError unused126) {
        }
        try {
            iArr[f1.BULK_PIN_DELETE.ordinal()] = 127;
        } catch (NoSuchFieldError unused127) {
        }
        try {
            iArr[f1.BULK_PIN_MOVE.ordinal()] = 128;
        } catch (NoSuchFieldError unused128) {
        }
        try {
            iArr[f1.REFERRER_APP_LOGIN.ordinal()] = 129;
        } catch (NoSuchFieldError unused129) {
        }
        try {
            iArr[f1.REFERRER_APP_SIGNUP.ordinal()] = 130;
        } catch (NoSuchFieldError unused130) {
        }
        try {
            iArr[f1.APP_START_ATTRIBUTED.ordinal()] = 131;
        } catch (NoSuchFieldError unused131) {
        }
        try {
            iArr[f1.ADDRESS_BOOK_SYNC_ALLOWED.ordinal()] = 132;
        } catch (NoSuchFieldError unused132) {
        }
        try {
            iArr[f1.ADDRESS_BOOK_SYNC_DECLINED.ordinal()] = 133;
        } catch (NoSuchFieldError unused133) {
        }
        try {
            iArr[f1.ADDRESS_BOOK_SYNC_DECLINED_PERMANENTLY.ordinal()] = 134;
        } catch (NoSuchFieldError unused134) {
        }
        try {
            iArr[f1.APP_CRASH_DETECTED.ordinal()] = 135;
        } catch (NoSuchFieldError unused135) {
        }
        try {
            iArr[f1.APP_CRASH_OOM_DETECTED.ordinal()] = 136;
        } catch (NoSuchFieldError unused136) {
        }
        try {
            iArr[f1.APP_DEADLOCK_CRASH_DETECTED.ordinal()] = 137;
        } catch (NoSuchFieldError unused137) {
        }
        try {
            iArr[f1.SAVE_BROWSER_PIN_IMAGES_FOUND.ordinal()] = 138;
        } catch (NoSuchFieldError unused138) {
        }
        try {
            iArr[f1.SAVE_BROWSER_PIN_IMAGES_NOT_FOUND.ordinal()] = 139;
        } catch (NoSuchFieldError unused139) {
        }
        try {
            iArr[f1.SAVE_BROWSER_URL_NAVIGATE.ordinal()] = 140;
        } catch (NoSuchFieldError unused140) {
        }
        try {
            iArr[f1.SAVE_BROWSER_PIN_IMAGES_REQUESTED.ordinal()] = 141;
        } catch (NoSuchFieldError unused141) {
        }
        try {
            iArr[f1.PIN_CARD_VIEW.ordinal()] = 142;
        } catch (NoSuchFieldError unused142) {
        }
        try {
            iArr[f1.DID_IT_SHARE.ordinal()] = 143;
        } catch (NoSuchFieldError unused143) {
        }
        try {
            iArr[f1.AGGREGATED_PIN_COMMENT_LINK_TAP.ordinal()] = 144;
        } catch (NoSuchFieldError unused144) {
        }
        try {
            iArr[f1.AGGREGATED_COMMENT_COMMUNITY_GUIDELINE_BANNER_CLICK.ordinal()] = 145;
        } catch (NoSuchFieldError unused145) {
        }
        try {
            iArr[f1.COMMENT_CODE_VIEWED.ordinal()] = 146;
        } catch (NoSuchFieldError unused146) {
        }
        try {
            iArr[f1.COMMENT_CODE_DISMISSED.ordinal()] = 147;
        } catch (NoSuchFieldError unused147) {
        }
        try {
            iArr[f1.COMMENT_CODE_ACCEPTED.ordinal()] = 148;
        } catch (NoSuchFieldError unused148) {
        }
        try {
            iArr[f1.COMMENT_PUSH_NOTIFICATION_NUDGE_VIEWED.ordinal()] = 149;
        } catch (NoSuchFieldError unused149) {
        }
        try {
            iArr[f1.COMMENT_PUSH_NOTIFICATION_NUDGE_DISMISSED.ordinal()] = 150;
        } catch (NoSuchFieldError unused150) {
        }
        try {
            iArr[f1.COMMENT_PUSH_NOTIFICATION_NUDGE_ACCEPTED.ordinal()] = 151;
        } catch (NoSuchFieldError unused151) {
        }
        try {
            iArr[f1.COMMENT_OVERFLOW_BLOCK_USER_TAP.ordinal()] = 152;
        } catch (NoSuchFieldError unused152) {
        }
        try {
            iArr[f1.COMMENT_BLOCK_USER_CONFIRMATION_CANCEL_TAP.ordinal()] = 153;
        } catch (NoSuchFieldError unused153) {
        }
        try {
            iArr[f1.COMMENT_BLOCK_USER_TOAST_UNDO_TAP.ordinal()] = 154;
        } catch (NoSuchFieldError unused154) {
        }
        try {
            iArr[f1.COMMENT_HELPER_VIEWED.ordinal()] = 155;
        } catch (NoSuchFieldError unused155) {
        }
        try {
            iArr[f1.COMMENT_HELPER_SELECTED.ordinal()] = 156;
        } catch (NoSuchFieldError unused156) {
        }
        try {
            iArr[f1.COMMENT_HELPER_SENT.ordinal()] = 157;
        } catch (NoSuchFieldError unused157) {
        }
        try {
            iArr[f1.SOCIAL_PERMISSION_SETTINGS_VISIT.ordinal()] = 158;
        } catch (NoSuchFieldError unused158) {
        }
        try {
            iArr[f1.MANUAL_FILTERS_VISIT.ordinal()] = 159;
        } catch (NoSuchFieldError unused159) {
        }
        try {
            iArr[f1.MENTION_SETTINGS_TOGGLE.ordinal()] = 160;
        } catch (NoSuchFieldError unused160) {
        }
        try {
            iArr[f1.MENTION_SETTINGS_VISIT.ordinal()] = 161;
        } catch (NoSuchFieldError unused161) {
        }
        try {
            iArr[f1.SEE_TRANSLATION_VIEWED.ordinal()] = 162;
        } catch (NoSuchFieldError unused162) {
        }
        try {
            iArr[f1.SEE_TRANSLATION_TAP.ordinal()] = 163;
        } catch (NoSuchFieldError unused163) {
        }
        try {
            iArr[f1.SEE_ORIGINAL_TAP.ordinal()] = 164;
        } catch (NoSuchFieldError unused164) {
        }
        try {
            iArr[f1.COMMENT_USER_REACTIONS_VIEWED.ordinal()] = 165;
        } catch (NoSuchFieldError unused165) {
        }
        try {
            iArr[f1.PHOTO_COMMENT_PICKER_VIEWED.ordinal()] = 166;
        } catch (NoSuchFieldError unused166) {
        }
        try {
            iArr[f1.PHOTO_COMMENT_PICKER_PHOTO_SELECTED.ordinal()] = 167;
        } catch (NoSuchFieldError unused167) {
        }
        try {
            iArr[f1.PHOTO_COMMENT_PICKER_PHOTO_SELECTION_FAILED.ordinal()] = 168;
        } catch (NoSuchFieldError unused168) {
        }
        try {
            iArr[f1.PHOTO_COMMENT_PICKER_CANCELED.ordinal()] = 169;
        } catch (NoSuchFieldError unused169) {
        }
        try {
            iArr[f1.COMMUNITY_VIEW_INTENT.ordinal()] = 170;
        } catch (NoSuchFieldError unused170) {
        }
        try {
            iArr[f1.COMMUNITY_CONTENT_MODULE_VIEWED.ordinal()] = 171;
        } catch (NoSuchFieldError unused171) {
        }
        try {
            iArr[f1.COMMENT_FEED_CLOSED.ordinal()] = 172;
        } catch (NoSuchFieldError unused172) {
        }
        try {
            iArr[f1.PIN_OR_SPIN_VIEW_INTENT.ordinal()] = 173;
        } catch (NoSuchFieldError unused173) {
        }
        try {
            iArr[f1.PIN_OR_SPIN_EXIT.ordinal()] = 174;
        } catch (NoSuchFieldError unused174) {
        }
        try {
            iArr[f1.PIN_OR_SPIN_REFRESH.ordinal()] = 175;
        } catch (NoSuchFieldError unused175) {
        }
        try {
            iArr[f1.PIN_OR_SPIN_PIN_SELECTED.ordinal()] = 176;
        } catch (NoSuchFieldError unused176) {
        }
        try {
            iArr[f1.PIN_OR_SPIN_CHOSEN_PIN_SELECTED.ordinal()] = 177;
        } catch (NoSuchFieldError unused177) {
        }
        try {
            iArr[f1.PIN_OR_SPIN_EXIT_REVEAL_REWARD_PAGE.ordinal()] = 178;
        } catch (NoSuchFieldError unused178) {
        }
        try {
            iArr[f1.PIN_OR_SPIN_REVEAL_REWARD_VIEW_INTENT.ordinal()] = 179;
        } catch (NoSuchFieldError unused179) {
        }
        try {
            iArr[f1.PIN_OR_SPIN_REVEAL_REWARD.ordinal()] = 180;
        } catch (NoSuchFieldError unused180) {
        }
        try {
            iArr[f1.PIN_OR_SPIN_REWARD_VIEW_INTENT.ordinal()] = 181;
        } catch (NoSuchFieldError unused181) {
        }
        try {
            iArr[f1.PIN_OR_SPIN_RESTART.ordinal()] = 182;
        } catch (NoSuchFieldError unused182) {
        }
        try {
            iArr[f1.PIN_OR_SPIN_REWARD_SAVE_BOARD.ordinal()] = 183;
        } catch (NoSuchFieldError unused183) {
        }
        try {
            iArr[f1.PIN_OR_SPIN_INSTAGRAM_SHARE.ordinal()] = 184;
        } catch (NoSuchFieldError unused184) {
        }
        try {
            iArr[f1.PIN_OR_SPIN_SHARE_SHEET_CLICKED.ordinal()] = 185;
        } catch (NoSuchFieldError unused185) {
        }
        try {
            iArr[f1.PIN_OR_SPIN_DOWNLOAD.ordinal()] = 186;
        } catch (NoSuchFieldError unused186) {
        }
        try {
            iArr[f1.FLASHLIGHT_CAMERA_TAP_SNAP.ordinal()] = 187;
        } catch (NoSuchFieldError unused187) {
        }
        try {
            iArr[f1.FLASHLIGHT_LENS_UNIVERSE_SEARCH.ordinal()] = 188;
        } catch (NoSuchFieldError unused188) {
        }
        try {
            iArr[f1.FLASHLIGHT_LENS_GALLERY_SEARCH.ordinal()] = 189;
        } catch (NoSuchFieldError unused189) {
        }
        try {
            iArr[f1.FLASHLIGHT_CROPPER_MOVE.ordinal()] = 190;
        } catch (NoSuchFieldError unused190) {
        }
        try {
            iArr[f1.FLASHLIGHT_CROPPER_RESIZE.ordinal()] = 191;
        } catch (NoSuchFieldError unused191) {
        }
        try {
            iArr[f1.FLASHLIGHT_CROPPER_NON_OBJECT_CROP.ordinal()] = 192;
        } catch (NoSuchFieldError unused192) {
        }
        try {
            iArr[f1.FLASHLIGHT_CROPPER_PIN_LEVEL_CROP.ordinal()] = 193;
        } catch (NoSuchFieldError unused193) {
        }
        try {
            iArr[f1.FLASHLIGHT_CROPPER_DISMISS.ordinal()] = 194;
        } catch (NoSuchFieldError unused194) {
        }
        try {
            iArr[f1.VISUAL_SEARCH_IMAGE_ZOOM.ordinal()] = 195;
        } catch (NoSuchFieldError unused195) {
        }
        try {
            iArr[f1.VISUAL_SEARCH_IMAGE_PAN.ordinal()] = 196;
        } catch (NoSuchFieldError unused196) {
        }
        try {
            iArr[f1.BOTTOM_SHEET_SNAP_FULLY_OPEN.ordinal()] = 197;
        } catch (NoSuchFieldError unused197) {
        }
        try {
            iArr[f1.BOTTOM_SHEET_SNAP_DEFAULT.ordinal()] = 198;
        } catch (NoSuchFieldError unused198) {
        }
        try {
            iArr[f1.BOTTOM_SHEET_SNAP_MINIMIZED.ordinal()] = 199;
        } catch (NoSuchFieldError unused199) {
        }
        try {
            iArr[f1.BOTTOM_SHEET_SNAP_UNKNOWN.ordinal()] = 200;
        } catch (NoSuchFieldError unused200) {
        }
        try {
            iArr[f1.VIDEO_PLAYBACK.ordinal()] = 201;
        } catch (NoSuchFieldError unused201) {
        }
        try {
            iArr[f1.VIDEO_PREFETCH_START.ordinal()] = 202;
        } catch (NoSuchFieldError unused202) {
        }
        try {
            iArr[f1.VIDEO_PREFETCH_END.ordinal()] = 203;
        } catch (NoSuchFieldError unused203) {
        }
        try {
            iArr[f1.VIDEO_PLAYBACK_PERFORMANCE.ordinal()] = 204;
        } catch (NoSuchFieldError unused204) {
        }
        try {
            iArr[f1.VIDEO_MANAGER_SETUP.ordinal()] = 205;
        } catch (NoSuchFieldError unused205) {
        }
        try {
            iArr[f1.VIDEO_START.ordinal()] = 206;
        } catch (NoSuchFieldError unused206) {
        }
        try {
            iArr[f1.VIDEO_PLAYBACK_COMPLETION.ordinal()] = 207;
        } catch (NoSuchFieldError unused207) {
        }
        try {
            iArr[f1.VIDEO_PLAYBACK_INTERVAL.ordinal()] = 208;
        } catch (NoSuchFieldError unused208) {
        }
        try {
            iArr[f1.VIDEO_SINGLE_QUARTILE.ordinal()] = 209;
        } catch (NoSuchFieldError unused209) {
        }
        try {
            iArr[f1.VIDEO_UPLOAD_ATTEMPTED.ordinal()] = 210;
        } catch (NoSuchFieldError unused210) {
        }
        try {
            iArr[f1.VIDEO_UPLOAD_UPLOADED.ordinal()] = 211;
        } catch (NoSuchFieldError unused211) {
        }
        try {
            iArr[f1.VIDEO_UPLOAD_PROCESSED.ordinal()] = 212;
        } catch (NoSuchFieldError unused212) {
        }
        try {
            iArr[f1.VIDEO_UPLOAD_SUCCEEDED.ordinal()] = 213;
        } catch (NoSuchFieldError unused213) {
        }
        try {
            iArr[f1.VIDEO_UPLOAD_FAILED.ordinal()] = 214;
        } catch (NoSuchFieldError unused214) {
        }
        try {
            iArr[f1.VIDEO_UPLOAD_CANCELLED.ordinal()] = 215;
        } catch (NoSuchFieldError unused215) {
        }
        try {
            iArr[f1.BOARD_IMPRESSION_ONE_PIXEL.ordinal()] = 216;
        } catch (NoSuchFieldError unused216) {
        }
        try {
            iArr[f1.TOPIC_IMPRESSION_ONE_PIXEL.ordinal()] = 217;
        } catch (NoSuchFieldError unused217) {
        }
        try {
            iArr[f1.USER_IMPRESSION_ONE_PIXEL.ordinal()] = 218;
        } catch (NoSuchFieldError unused218) {
        }
        try {
            iArr[f1.PIN_CLOSEUP_IMPRESSION_ONE_PIXEL.ordinal()] = 219;
        } catch (NoSuchFieldError unused219) {
        }
        try {
            iArr[f1.SEARCH_IMPRESSION_ONE_PIXEL.ordinal()] = 220;
        } catch (NoSuchFieldError unused220) {
        }
        try {
            iArr[f1.GUIDE_IMPRESSION_ONE_PIXEL.ordinal()] = 221;
        } catch (NoSuchFieldError unused221) {
        }
        try {
            iArr[f1.TODAY_ARTICLE_IMPRESSION_ONE_PIXEL.ordinal()] = 222;
        } catch (NoSuchFieldError unused222) {
        }
        try {
            iArr[f1.COMMENT_IMPRESSION_ONE_PIXEL.ordinal()] = 223;
        } catch (NoSuchFieldError unused223) {
        }
        try {
            iArr[f1.MORE_IDEAS_FEED_UPSELL_IMPRESSION_ONE_PIXEL.ordinal()] = 224;
        } catch (NoSuchFieldError unused224) {
        }
        try {
            iArr[f1.RELATED_PINS_FILTER_IMPRESSION_ONE_PIXEL.ordinal()] = 225;
        } catch (NoSuchFieldError unused225) {
        }
        try {
            iArr[f1.USE_CASE_IMPRESSION_ONE_PIXEL.ordinal()] = 226;
        } catch (NoSuchFieldError unused226) {
        }
        try {
            iArr[f1.SEARCH_PINS_BUYABLE.ordinal()] = 227;
        } catch (NoSuchFieldError unused227) {
        }
        try {
            iArr[f1.LOAD_URL.ordinal()] = 228;
        } catch (NoSuchFieldError unused228) {
        }
        try {
            iArr[f1.ARTICLE_IMPRESSION_ONE_PIXEL.ordinal()] = 229;
        } catch (NoSuchFieldError unused229) {
        }
        try {
            iArr[f1.ARTICLE_SEND.ordinal()] = 230;
        } catch (NoSuchFieldError unused230) {
        }
        try {
            iArr[f1.BUBBLE_OPEN.ordinal()] = 231;
        } catch (NoSuchFieldError unused231) {
        }
        try {
            iArr[f1.ACCEPT_CONTACT_REQUEST_CLICK.ordinal()] = 232;
        } catch (NoSuchFieldError unused232) {
        }
        try {
            iArr[f1.DECLINE_CONTACT_REQUEST_CLICK.ordinal()] = 233;
        } catch (NoSuchFieldError unused233) {
        }
        try {
            iArr[f1.PREVIEW_CONTACT_REQUEST_CLICK.ordinal()] = 234;
        } catch (NoSuchFieldError unused234) {
        }
        try {
            iArr[f1.REPORT_CONTACT_REQUEST_CLICK.ordinal()] = 235;
        } catch (NoSuchFieldError unused235) {
        }
        try {
            iArr[f1.BLOCK_CONTACT_REQUEST_CLICK.ordinal()] = 236;
        } catch (NoSuchFieldError unused236) {
        }
        try {
            iArr[f1.UNBLOCK_CONTACT_REQUEST_CLICK.ordinal()] = 237;
        } catch (NoSuchFieldError unused237) {
        }
        try {
            iArr[f1.REPORT_CONTACT_REQUEST_MESSAGE_CONFIRM_CLICK.ordinal()] = 238;
        } catch (NoSuchFieldError unused238) {
        }
        try {
            iArr[f1.REPORT_AND_BLOCK_CONTACT_REQUEST_MESSAGE_CONFIRM_CLICK.ordinal()] = 239;
        } catch (NoSuchFieldError unused239) {
        }
        try {
            iArr[f1.DECLINE_CONTACT_REQUEST_UNDO_CLICK.ordinal()] = 240;
        } catch (NoSuchFieldError unused240) {
        }
        try {
            iArr[f1.BLOCK_CONTACT_REQUEST_CONFIRM_CLICK.ordinal()] = 241;
        } catch (NoSuchFieldError unused241) {
        }
        try {
            iArr[f1.DID_IT_ACTIVITY_REPORT.ordinal()] = 242;
        } catch (NoSuchFieldError unused242) {
        }
        try {
            iArr[f1.PIN_CLICKTHROUGH_END.ordinal()] = 243;
        } catch (NoSuchFieldError unused243) {
        }
        try {
            iArr[f1.PIN_IAB_DURATION.ordinal()] = 244;
        } catch (NoSuchFieldError unused244) {
        }
        try {
            iArr[f1.PIN_IAB_START.ordinal()] = 245;
        } catch (NoSuchFieldError unused245) {
        }
        try {
            iArr[f1.NUX_START.ordinal()] = 246;
        } catch (NoSuchFieldError unused246) {
        }
        try {
            iArr[f1.NUX_END.ordinal()] = 247;
        } catch (NoSuchFieldError unused247) {
        }
        try {
            iArr[f1.NUX_STEP_END.ordinal()] = 248;
        } catch (NoSuchFieldError unused248) {
        }
        try {
            iArr[f1.REGULAR_NUX_START.ordinal()] = 249;
        } catch (NoSuchFieldError unused249) {
        }
        try {
            iArr[f1.REGULAR_NUX_END.ordinal()] = 250;
        } catch (NoSuchFieldError unused250) {
        }
        try {
            iArr[f1.NUX_DROP_OFF.ordinal()] = 251;
        } catch (NoSuchFieldError unused251) {
        }
        try {
            iArr[f1.NUX_VIEW_GENDER.ordinal()] = 252;
        } catch (NoSuchFieldError unused252) {
        }
        try {
            iArr[f1.NUX_DONE_GENDER.ordinal()] = 253;
        } catch (NoSuchFieldError unused253) {
        }
        try {
            iArr[f1.NUX_VIEW_LOCALE.ordinal()] = 254;
        } catch (NoSuchFieldError unused254) {
        }
        try {
            iArr[f1.NUX_DONE_LOCALE.ordinal()] = 255;
        } catch (NoSuchFieldError unused255) {
        }
        try {
            iArr[f1.NUX_VIEW_TOPIC_PICKER.ordinal()] = 256;
        } catch (NoSuchFieldError unused256) {
        }
        try {
            iArr[f1.NUX_DONE_TOPIC_PICKER.ordinal()] = 257;
        } catch (NoSuchFieldError unused257) {
        }
        try {
            iArr[f1.NEWS_HUB_FEED_IMPRESSION_ONE_PIXEL.ordinal()] = 258;
        } catch (NoSuchFieldError unused258) {
        }
        try {
            iArr[f1.NEWS_HUB_DETAIL_IMPRESSION_ONE_PIXEL.ordinal()] = 259;
        } catch (NoSuchFieldError unused259) {
        }
        try {
            iArr[f1.SEARCH_SOCIAL_TYPEAHEAD.ordinal()] = 260;
        } catch (NoSuchFieldError unused260) {
        }
        try {
            iArr[f1.EXPERIENCE_VIEWED.ordinal()] = 261;
        } catch (NoSuchFieldError unused261) {
        }
        try {
            iArr[f1.TIMED_APP_FOREGROUND.ordinal()] = 262;
        } catch (NoSuchFieldError unused262) {
        }
        try {
            iArr[f1.TIMED_APP_BACKGROUND.ordinal()] = 263;
        } catch (NoSuchFieldError unused263) {
        }
        try {
            iArr[f1.TIMED_PAIR_BEGIN.ordinal()] = 264;
        } catch (NoSuchFieldError unused264) {
        }
        try {
            iArr[f1.TIMED_PAIR_END.ordinal()] = 265;
        } catch (NoSuchFieldError unused265) {
        }
        try {
            iArr[f1.GRID_PIN_LEVELING_APPLIED.ordinal()] = 266;
        } catch (NoSuchFieldError unused266) {
        }
        try {
            iArr[f1.EXPERIENCE_COMPLETED.ordinal()] = 267;
        } catch (NoSuchFieldError unused267) {
        }
        try {
            iArr[f1.EXPERIENCE_DISMISSED.ordinal()] = 268;
        } catch (NoSuchFieldError unused268) {
        }
        try {
            iArr[f1.FPE_START.ordinal()] = 269;
        } catch (NoSuchFieldError unused269) {
        }
        try {
            iArr[f1.FPE_END.ordinal()] = 270;
        } catch (NoSuchFieldError unused270) {
        }
        try {
            iArr[f1.PINCODE_URL_NAVIGATE.ordinal()] = 271;
        } catch (NoSuchFieldError unused271) {
        }
        try {
            iArr[f1.PINCODE_CREATE.ordinal()] = 272;
        } catch (NoSuchFieldError unused272) {
        }
        try {
            iArr[f1.IMAGE_ERROR.ordinal()] = 273;
        } catch (NoSuchFieldError unused273) {
        }
        try {
            iArr[f1.SEO_LANDING_PAGE_VIEW.ordinal()] = 274;
        } catch (NoSuchFieldError unused274) {
        }
        try {
            iArr[f1.DEFERRED_DEEP_LINK_FACEBOOK.ordinal()] = 275;
        } catch (NoSuchFieldError unused275) {
        }
        try {
            iArr[f1.URL_LOAD_STARTED.ordinal()] = 276;
        } catch (NoSuchFieldError unused276) {
        }
        try {
            iArr[f1.URL_LOAD_FINISHED.ordinal()] = 277;
        } catch (NoSuchFieldError unused277) {
        }
        try {
            iArr[f1.URL_LOAD_ERROR.ordinal()] = 278;
        } catch (NoSuchFieldError unused278) {
        }
        try {
            iArr[f1.URL_LOAD_PERCENT.ordinal()] = 279;
        } catch (NoSuchFieldError unused279) {
        }
        try {
            iArr[f1.BOARD_SECTION_CREATE.ordinal()] = 280;
        } catch (NoSuchFieldError unused280) {
        }
        try {
            iArr[f1.BOARD_SECTION_EDIT.ordinal()] = 281;
        } catch (NoSuchFieldError unused281) {
        }
        try {
            iArr[f1.BOARD_SECTION_DELETE.ordinal()] = 282;
        } catch (NoSuchFieldError unused282) {
        }
        try {
            iArr[f1.BOARD_SECTION_REMOVE_PINS.ordinal()] = 283;
        } catch (NoSuchFieldError unused283) {
        }
        try {
            iArr[f1.BOARD_SECTION_MERGE.ordinal()] = 284;
        } catch (NoSuchFieldError unused284) {
        }
        try {
            iArr[f1.BOARD_SECTION_SUGGESTION_COMPLETED.ordinal()] = 285;
        } catch (NoSuchFieldError unused285) {
        }
        try {
            iArr[f1.PIN_REORDER.ordinal()] = 286;
        } catch (NoSuchFieldError unused286) {
        }
        try {
            iArr[f1.SECTION_REORDER.ordinal()] = 287;
        } catch (NoSuchFieldError unused287) {
        }
        try {
            iArr[f1.PIN_SELECTION.ordinal()] = 288;
        } catch (NoSuchFieldError unused288) {
        }
        try {
            iArr[f1.PIN_DESELECTION.ordinal()] = 289;
        } catch (NoSuchFieldError unused289) {
        }
        try {
            iArr[f1.BULK_SELECT_ALL_PIN_MOVE.ordinal()] = 290;
        } catch (NoSuchFieldError unused290) {
        }
        try {
            iArr[f1.BULK_SELECT_ALL_PIN_DELETE.ordinal()] = 291;
        } catch (NoSuchFieldError unused291) {
        }
        try {
            iArr[f1.VIEW_WEBSITE_ONE_PIXEL.ordinal()] = 292;
        } catch (NoSuchFieldError unused292) {
        }
        try {
            iArr[f1.VIEW_WEBSITE_100.ordinal()] = 293;
        } catch (NoSuchFieldError unused293) {
        }
        try {
            iArr[f1.DESTINATION_VIEW.ordinal()] = 294;
        } catch (NoSuchFieldError unused294) {
        }
        try {
            iArr[f1.SEND_SHARE_OPEN.ordinal()] = 295;
        } catch (NoSuchFieldError unused295) {
        }
        try {
            iArr[f1.USER_ACTIVE.ordinal()] = 296;
        } catch (NoSuchFieldError unused296) {
        }
        try {
            iArr[f1.PIN_TAGS_LOAD.ordinal()] = 297;
        } catch (NoSuchFieldError unused297) {
        }
        try {
            iArr[f1.BOARD_IDEAS_VIEW.ordinal()] = 298;
        } catch (NoSuchFieldError unused298) {
        }
        try {
            iArr[f1.PIN_CAROUSEL_SLOT_IMPRESSION_ONE_PIXEL.ordinal()] = 299;
        } catch (NoSuchFieldError unused299) {
        }
        try {
            iArr[f1.PIN_CAROUSEL_SLOT_CLICKTHROUGH.ordinal()] = 300;
        } catch (NoSuchFieldError unused300) {
        }
        try {
            iArr[f1.INVITE_APP_LAND.ordinal()] = 301;
        } catch (NoSuchFieldError unused301) {
        }
        try {
            iArr[f1.LOCATION_PERMISSIONS_PROMPT.ordinal()] = 302;
        } catch (NoSuchFieldError unused302) {
        }
        try {
            iArr[f1.LOCATION_PERMISSIONS_DENY.ordinal()] = 303;
        } catch (NoSuchFieldError unused303) {
        }
        try {
            iArr[f1.LOCATION_PERMISSIONS_ACCEPT_WHILE_IN_USE.ordinal()] = 304;
        } catch (NoSuchFieldError unused304) {
        }
        try {
            iArr[f1.LOCATION_PERMISSIONS_CURRENT_STATUS.ordinal()] = 305;
        } catch (NoSuchFieldError unused305) {
        }
        try {
            iArr[f1.SHARE_SHEET_DISMISS_NO_SEND.ordinal()] = 306;
        } catch (NoSuchFieldError unused306) {
        }
        try {
            iArr[f1.SHARE_SHEET_DISMISS_WITH_SEND.ordinal()] = 307;
        } catch (NoSuchFieldError unused307) {
        }
        try {
            iArr[f1.SHARE_SHEET_VIEW_WITH_CONTACTS.ordinal()] = 308;
        } catch (NoSuchFieldError unused308) {
        }
        try {
            iArr[f1.SHARE_SHEET_VIEW_WITH_NO_CONTACTS.ordinal()] = 309;
        } catch (NoSuchFieldError unused309) {
        }
        try {
            iArr[f1.SHARE_SHEET_IG_STORIES_EXPORT_SUCCESS.ordinal()] = 310;
        } catch (NoSuchFieldError unused310) {
        }
        try {
            iArr[f1.SHARE_SHEET_IG_STORIES_EXPORT_FAILED.ordinal()] = 311;
        } catch (NoSuchFieldError unused311) {
        }
        try {
            iArr[f1.SHARE_SHEET_IG_STORIES_EXPORT_CANCELLED.ordinal()] = 312;
        } catch (NoSuchFieldError unused312) {
        }
        try {
            iArr[f1.SHARE_SHEET_FB_STORIES_EXPORT_SUCCESS.ordinal()] = 313;
        } catch (NoSuchFieldError unused313) {
        }
        try {
            iArr[f1.SHARE_SHEET_FB_STORIES_EXPORT_FAILED.ordinal()] = 314;
        } catch (NoSuchFieldError unused314) {
        }
        try {
            iArr[f1.SHARE_SHEET_FB_STORIES_EXPORT_CANCELLED.ordinal()] = 315;
        } catch (NoSuchFieldError unused315) {
        }
        try {
            iArr[f1.SHARE_SHEET_DOWNLOAD_EXPORT_SUCCESS.ordinal()] = 316;
        } catch (NoSuchFieldError unused316) {
        }
        try {
            iArr[f1.SHARE_SHEET_DOWNLOAD_EXPORT_FAILED.ordinal()] = 317;
        } catch (NoSuchFieldError unused317) {
        }
        try {
            iArr[f1.SHARE_SHEET_DOWNLOAD_EXPORT_CANCELLED.ordinal()] = 318;
        } catch (NoSuchFieldError unused318) {
        }
        try {
            iArr[f1.SHARE_SHEET_CONTACT_SEND.ordinal()] = 319;
        } catch (NoSuchFieldError unused319) {
        }
        try {
            iArr[f1.SHARE_SHEET_SENDING_CANCEL.ordinal()] = 320;
        } catch (NoSuchFieldError unused320) {
        }
        try {
            iArr[f1.SHARE_SHEET_SENDING_ERROR.ordinal()] = 321;
        } catch (NoSuchFieldError unused321) {
        }
        try {
            iArr[f1.BACKGROUND_REFRESH_WARM_START.ordinal()] = 322;
        } catch (NoSuchFieldError unused322) {
        }
        try {
            iArr[f1.STORY_PIN_BEGIN.ordinal()] = 323;
        } catch (NoSuchFieldError unused323) {
        }
        try {
            iArr[f1.STORY_PIN_CREATE.ordinal()] = 324;
        } catch (NoSuchFieldError unused324) {
        }
        try {
            iArr[f1.STORY_PIN_CREATE_ATTEMPTED.ordinal()] = 325;
        } catch (NoSuchFieldError unused325) {
        }
        try {
            iArr[f1.STORY_PIN_CREATE_CANCELLED.ordinal()] = 326;
        } catch (NoSuchFieldError unused326) {
        }
        try {
            iArr[f1.STORY_PIN_CREATE_FAILURE.ordinal()] = 327;
        } catch (NoSuchFieldError unused327) {
        }
        try {
            iArr[f1.STORY_PIN_CREATE_USER_FAILURE.ordinal()] = 328;
        } catch (NoSuchFieldError unused328) {
        }
        try {
            iArr[f1.IDEA_PIN_CREATE_WARN.ordinal()] = 329;
        } catch (NoSuchFieldError unused329) {
        }
        try {
            iArr[f1.STORY_PIN_EDIT.ordinal()] = 330;
        } catch (NoSuchFieldError unused330) {
        }
        try {
            iArr[f1.STORY_PIN_EDIT_CANCELLED.ordinal()] = 331;
        } catch (NoSuchFieldError unused331) {
        }
        try {
            iArr[f1.STORY_PIN_EDIT_FAILURE.ordinal()] = 332;
        } catch (NoSuchFieldError unused332) {
        }
        try {
            iArr[f1.STORY_PIN_CREATION_BEGIN.ordinal()] = 333;
        } catch (NoSuchFieldError unused333) {
        }
        try {
            iArr[f1.STORY_PIN_LOGGING_ERROR.ordinal()] = 334;
        } catch (NoSuchFieldError unused334) {
        }
        try {
            iArr[f1.STORY_PIN_FONT_LIST_DOWNLOAD_FAILED.ordinal()] = 335;
        } catch (NoSuchFieldError unused335) {
        }
        try {
            iArr[f1.STORY_PIN_FONT_DOWNLOAD_FAILED.ordinal()] = 336;
        } catch (NoSuchFieldError unused336) {
        }
        try {
            iArr[f1.STORY_PIN_VIDEO_EXPORT_ATTEMPTED.ordinal()] = 337;
        } catch (NoSuchFieldError unused337) {
        }
        try {
            iArr[f1.STORY_PIN_VIDEO_EXPORT_SUCCEEDED.ordinal()] = 338;
        } catch (NoSuchFieldError unused338) {
        }
        try {
            iArr[f1.STORY_PIN_VIDEO_EXPORT_FAILED.ordinal()] = 339;
        } catch (NoSuchFieldError unused339) {
        }
        try {
            iArr[f1.STORY_PIN_VIDEO_EXPORT_CANCELLED.ordinal()] = 340;
        } catch (NoSuchFieldError unused340) {
        }
        try {
            iArr[f1.STORY_PIN_VIDEO_EXPORT_INCOMPATIBLE_MEDIA.ordinal()] = 341;
        } catch (NoSuchFieldError unused341) {
        }
        try {
            iArr[f1.STORY_PIN_IMAGE_TO_VIDEO_CONVERSION_ATTEMPTED.ordinal()] = 342;
        } catch (NoSuchFieldError unused342) {
        }
        try {
            iArr[f1.STORY_PIN_IMAGE_TO_VIDEO_CONVERSION_SUCCEEDED.ordinal()] = 343;
        } catch (NoSuchFieldError unused343) {
        }
        try {
            iArr[f1.STORY_PIN_IMAGE_TO_VIDEO_CONVERSION_FAILED.ordinal()] = 344;
        } catch (NoSuchFieldError unused344) {
        }
        try {
            iArr[f1.STORY_PIN_IMAGE_TO_VIDEO_CONVERSION_CANCELLED.ordinal()] = 345;
        } catch (NoSuchFieldError unused345) {
        }
        try {
            iArr[f1.IDEA_PIN_VIDEO_STILL_PROCESSING_DISPLAYED.ordinal()] = 346;
        } catch (NoSuchFieldError unused346) {
        }
        try {
            iArr[f1.IDEA_PIN_METADATA_EXTRACTION_ATTEMPTED.ordinal()] = 347;
        } catch (NoSuchFieldError unused347) {
        }
        try {
            iArr[f1.IDEA_PIN_METADATA_EXTRACTION_SUCCESS.ordinal()] = 348;
        } catch (NoSuchFieldError unused348) {
        }
        try {
            iArr[f1.IDEA_PIN_METADATA_EXTRACTION_FAILURE.ordinal()] = 349;
        } catch (NoSuchFieldError unused349) {
        }
        try {
            iArr[f1.STORY_PIN_ELEMENT_MOVE.ordinal()] = 350;
        } catch (NoSuchFieldError unused350) {
        }
        try {
            iArr[f1.STORY_PIN_ELEMENT_SCALE.ordinal()] = 351;
        } catch (NoSuchFieldError unused351) {
        }
        try {
            iArr[f1.STORY_PIN_ELEMENT_ROTATE.ordinal()] = 352;
        } catch (NoSuchFieldError unused352) {
        }
        try {
            iArr[f1.STORY_PIN_ELEMENT_DELETE_ATTEMPT.ordinal()] = 353;
        } catch (NoSuchFieldError unused353) {
        }
        try {
            iArr[f1.STORY_PIN_ELEMENT_DELETED.ordinal()] = 354;
        } catch (NoSuchFieldError unused354) {
        }
        try {
            iArr[f1.STORY_PIN_FONT_SIZE_CHANGE.ordinal()] = 355;
        } catch (NoSuchFieldError unused355) {
        }
        try {
            iArr[f1.STORY_PIN_START_TIME_CHANGE.ordinal()] = 356;
        } catch (NoSuchFieldError unused356) {
        }
        try {
            iArr[f1.STORY_PIN_END_TIME_CHANGE.ordinal()] = 357;
        } catch (NoSuchFieldError unused357) {
        }
        try {
            iArr[f1.BACKEND_STORY_PIN_DELETE.ordinal()] = 358;
        } catch (NoSuchFieldError unused358) {
        }
        try {
            iArr[f1.RAW_IPD_LOG_SUCCESS.ordinal()] = 359;
        } catch (NoSuchFieldError unused359) {
        }
        try {
            iArr[f1.RAW_IPD_LOG_FAILURE.ordinal()] = 360;
        } catch (NoSuchFieldError unused360) {
        }
        try {
            iArr[f1.USER_SWITCH_INTENT.ordinal()] = 361;
        } catch (NoSuchFieldError unused361) {
        }
        try {
            iArr[f1.USER_SWITCH_ATTEMPT.ordinal()] = 362;
        } catch (NoSuchFieldError unused362) {
        }
        try {
            iArr[f1.USER_SWITCH_SUCCESS.ordinal()] = 363;
        } catch (NoSuchFieldError unused363) {
        }
        try {
            iArr[f1.COLLECTION_ITEM_IMPRESSION_ONE_PIXEL.ordinal()] = 364;
        } catch (NoSuchFieldError unused364) {
        }
        try {
            iArr[f1.COLLECTION_ITEM_CLICKTHROUGH.ordinal()] = 365;
        } catch (NoSuchFieldError unused365) {
        }
        try {
            iArr[f1.COLLECTION_PIN_CLICKTHROUGH.ordinal()] = 366;
        } catch (NoSuchFieldError unused366) {
        }
        try {
            iArr[f1.COLLECTION_ITEM_CLICKTHROUGH_END.ordinal()] = 367;
        } catch (NoSuchFieldError unused367) {
        }
        try {
            iArr[f1.COLLECTION_PIN_CLICKTHROUGH_END.ordinal()] = 368;
        } catch (NoSuchFieldError unused368) {
        }
        try {
            iArr[f1.COLLECTION_ITEM_REPIN.ordinal()] = 369;
        } catch (NoSuchFieldError unused369) {
        }
        try {
            iArr[f1.COLLECTION_ITEM_CLOSEUP.ordinal()] = 370;
        } catch (NoSuchFieldError unused370) {
        }
        try {
            iArr[f1.SCENE_3D_ROTATE.ordinal()] = 371;
        } catch (NoSuchFieldError unused371) {
        }
        try {
            iArr[f1.SCENE_3D_TRANSLATE.ordinal()] = 372;
        } catch (NoSuchFieldError unused372) {
        }
        try {
            iArr[f1.LEAD_FORM_OPEN.ordinal()] = 373;
        } catch (NoSuchFieldError unused373) {
        }
        try {
            iArr[f1.LEAD_FORM_TYPING.ordinal()] = 374;
        } catch (NoSuchFieldError unused374) {
        }
        try {
            iArr[f1.LEAD_FORM_SUBMIT.ordinal()] = 375;
        } catch (NoSuchFieldError unused375) {
        }
        try {
            iArr[f1.LEAD_FORM_CLOSE.ordinal()] = 376;
        } catch (NoSuchFieldError unused376) {
        }
        try {
            iArr[f1.LEAD_FORM_SUBMIT_ERROR.ordinal()] = 377;
        } catch (NoSuchFieldError unused377) {
        }
        try {
            iArr[f1.LEAD_FORM_CACHE_SAVE.ordinal()] = 378;
        } catch (NoSuchFieldError unused378) {
        }
        try {
            iArr[f1.LEAD_FORM_CACHE_LOAD_SUCCESS.ordinal()] = 379;
        } catch (NoSuchFieldError unused379) {
        }
        try {
            iArr[f1.LEAD_FORM_CACHE_LOAD_EXPIRED.ordinal()] = 380;
        } catch (NoSuchFieldError unused380) {
        }
        try {
            iArr[f1.LEAD_FORM_AUTOFILL.ordinal()] = 381;
        } catch (NoSuchFieldError unused381) {
        }
        try {
            iArr[f1.BUSINESS_ACCOUNT_CREATE_COMPLETE.ordinal()] = 382;
        } catch (NoSuchFieldError unused382) {
        }
        try {
            iArr[f1.USER_LOGOUT_SUCCESS.ordinal()] = 383;
        } catch (NoSuchFieldError unused383) {
        }
        try {
            iArr[f1.BRAND_SURVEY_FALLBACK_TO_LEGACY.ordinal()] = 384;
        } catch (NoSuchFieldError unused384) {
        }
        try {
            iArr[f1.UPDATE.ordinal()] = 385;
        } catch (NoSuchFieldError unused385) {
        }
        try {
            iArr[f1.GROUP_BOARDS_REACTION_BAR_OPEN.ordinal()] = 386;
        } catch (NoSuchFieldError unused386) {
        }
        try {
            iArr[f1.GROUP_BOARDS_REACTION_SET.ordinal()] = 387;
        } catch (NoSuchFieldError unused387) {
        }
        try {
            iArr[f1.APP_THEME_CHANGED.ordinal()] = 388;
        } catch (NoSuchFieldError unused388) {
        }
        try {
            iArr[f1.APP_SOUND_SETTING_CHANGED.ordinal()] = 389;
        } catch (NoSuchFieldError unused389) {
        }
        try {
            iArr[f1.VIRTUAL_TRY_ON_RENDERER_INITIALIZED_SUCCESS.ordinal()] = 390;
        } catch (NoSuchFieldError unused390) {
        }
        try {
            iArr[f1.VIRTUAL_TRY_ON_RENDERER_INITIALIZED_FAILURE.ordinal()] = 391;
        } catch (NoSuchFieldError unused391) {
        }
        try {
            iArr[f1.VIRTUAL_TRY_ON_PIN_APPLY.ordinal()] = 392;
        } catch (NoSuchFieldError unused392) {
        }
        try {
            iArr[f1.VIRTUAL_TRY_ON_CHANGE_SWATCH.ordinal()] = 393;
        } catch (NoSuchFieldError unused393) {
        }
        try {
            iArr[f1.AR_MODEL_LOAD_REQUESTED.ordinal()] = 394;
        } catch (NoSuchFieldError unused394) {
        }
        try {
            iArr[f1.AR_MODEL_LOAD_COMPLETE.ordinal()] = 395;
        } catch (NoSuchFieldError unused395) {
        }
        try {
            iArr[f1.AR_MODEL_LOAD_FAILED.ordinal()] = 396;
        } catch (NoSuchFieldError unused396) {
        }
        try {
            iArr[f1.AR_OBJECT_PLACED.ordinal()] = 397;
        } catch (NoSuchFieldError unused397) {
        }
        try {
            iArr[f1.ANDROID_ARCORE_DOWNLOAD_REQUESTED.ordinal()] = 398;
        } catch (NoSuchFieldError unused398) {
        }
        try {
            iArr[f1.ANDROID_ARCORE_DOWNLOAD_REJECTED.ordinal()] = 399;
        } catch (NoSuchFieldError unused399) {
        }
        try {
            iArr[f1.ANDROID_ARCORE_DOWNLOAD_COMPLETE.ordinal()] = 400;
        } catch (NoSuchFieldError unused400) {
        }
        try {
            iArr[f1.PIN_INTEREST_TAG_SELECT.ordinal()] = 401;
        } catch (NoSuchFieldError unused401) {
        }
        try {
            iArr[f1.PIN_INTEREST_TAG_DESELECT.ordinal()] = 402;
        } catch (NoSuchFieldError unused402) {
        }
        try {
            iArr[f1.TAG_PIN_INTERESTS_SUCCESS.ordinal()] = 403;
        } catch (NoSuchFieldError unused403) {
        }
        try {
            iArr[f1.TAG_PIN_INTERESTS_FAILURE.ordinal()] = 404;
        } catch (NoSuchFieldError unused404) {
        }
        try {
            iArr[f1.APPSFLYER_INIT.ordinal()] = 405;
        } catch (NoSuchFieldError unused405) {
        }
        try {
            iArr[f1.APPSFLYER_FIRST_LAUNCH.ordinal()] = 406;
        } catch (NoSuchFieldError unused406) {
        }
        try {
            iArr[f1.APPSFLYER_COLD_START_TASK.ordinal()] = 407;
        } catch (NoSuchFieldError unused407) {
        }
        try {
            iArr[f1.APPSFLYER_RUNNABLE_START.ordinal()] = 408;
        } catch (NoSuchFieldError unused408) {
        }
        try {
            iArr[f1.APPSFLYER_INIT_IMMEDIATE.ordinal()] = 409;
        } catch (NoSuchFieldError unused409) {
        }
        try {
            iArr[f1.IMAGE_UPLOAD_ATTEMPTED.ordinal()] = 410;
        } catch (NoSuchFieldError unused410) {
        }
        try {
            iArr[f1.IMAGE_UPLOAD_UPLOADED.ordinal()] = 411;
        } catch (NoSuchFieldError unused411) {
        }
        try {
            iArr[f1.IMAGE_UPLOAD_CANCELLED.ordinal()] = 412;
        } catch (NoSuchFieldError unused412) {
        }
        try {
            iArr[f1.IMAGE_UPLOAD_FAILED.ordinal()] = 413;
        } catch (NoSuchFieldError unused413) {
        }
        try {
            iArr[f1.USE_CASES_SELECTED.ordinal()] = 414;
        } catch (NoSuchFieldError unused414) {
        }
        try {
            iArr[f1.BOARD_PERMISSION_SETTING_UPDATE.ordinal()] = 415;
        } catch (NoSuchFieldError unused415) {
        }
        try {
            iArr[f1.MENTION_SELECT.ordinal()] = 416;
        } catch (NoSuchFieldError unused416) {
        }
        try {
            iArr[f1.MENTION_REMOVE.ordinal()] = 417;
        } catch (NoSuchFieldError unused417) {
        }
        try {
            iArr[f1.MENTION_SEARCH_BEGIN.ordinal()] = 418;
        } catch (NoSuchFieldError unused418) {
        }
        try {
            iArr[f1.MENTION_SEARCH_CANCEL.ordinal()] = 419;
        } catch (NoSuchFieldError unused419) {
        }
        try {
            iArr[f1.MENTION_UNLINK.ordinal()] = 420;
        } catch (NoSuchFieldError unused420) {
        }
        try {
            iArr[f1.STORY_PIN_MUSIC_PLAY.ordinal()] = 421;
        } catch (NoSuchFieldError unused421) {
        }
        try {
            iArr[f1.COMMENTS_COMPOSER_OPENED.ordinal()] = 422;
        } catch (NoSuchFieldError unused422) {
        }
        try {
            iArr[f1.COMMENTS_COMPOSER_CLOSED_WITH_POST.ordinal()] = 423;
        } catch (NoSuchFieldError unused423) {
        }
        try {
            iArr[f1.COMMENTS_COMPOSER_CLOSED_WITHOUT_POST.ordinal()] = 424;
        } catch (NoSuchFieldError unused424) {
        }
        try {
            iArr[f1.GENERIC_STAT_LOG_EVENT.ordinal()] = 425;
        } catch (NoSuchFieldError unused425) {
        }
        try {
            iArr[f1.VIDEO_INVALID_INTERVAL.ordinal()] = 426;
        } catch (NoSuchFieldError unused426) {
        }
        try {
            iArr[f1.VIDEO_INVALID_QUARTILE.ordinal()] = 427;
        } catch (NoSuchFieldError unused427) {
        }
        try {
            iArr[f1.STORY_PIN_MULTI_DRAFTS_APPROACH_LIMIT.ordinal()] = 428;
        } catch (NoSuchFieldError unused428) {
        }
        try {
            iArr[f1.STORY_PIN_MULTI_DRAFTS_REACH_LIMIT.ordinal()] = 429;
        } catch (NoSuchFieldError unused429) {
        }
        try {
            iArr[f1.STORY_PIN_MULTI_DRAFTS_MISSING_COVER.ordinal()] = 430;
        } catch (NoSuchFieldError unused430) {
        }
        try {
            iArr[f1.STORY_PIN_MULTI_DRAFTS_SAVE_COVER.ordinal()] = 431;
        } catch (NoSuchFieldError unused431) {
        }
        try {
            iArr[f1.IDEA_PIN_DRAFT_COMPATIBILITY_CONVERSION.ordinal()] = 432;
        } catch (NoSuchFieldError unused432) {
        }
        try {
            iArr[f1.IDEA_PIN_MULTI_DRAFT_EXPIRATION.ordinal()] = 433;
        } catch (NoSuchFieldError unused433) {
        }
        try {
            iArr[f1.LENS_PERMISSIONS_REQUEST.ordinal()] = 434;
        } catch (NoSuchFieldError unused434) {
        }
        try {
            iArr[f1.FULL_SCREEN_VIEW.ordinal()] = 435;
        } catch (NoSuchFieldError unused435) {
        }
        try {
            iArr[f1.STORY_PIN_RESUME.ordinal()] = 436;
        } catch (NoSuchFieldError unused436) {
        }
        try {
            iArr[f1.STORY_PIN_PAUSE.ordinal()] = 437;
        } catch (NoSuchFieldError unused437) {
        }
        try {
            iArr[f1.SEEK.ordinal()] = 438;
        } catch (NoSuchFieldError unused438) {
        }
        try {
            iArr[f1.STORY_PIN_MUTE.ordinal()] = 439;
        } catch (NoSuchFieldError unused439) {
        }
        try {
            iArr[f1.STORY_PIN_UNMUTE.ordinal()] = 440;
        } catch (NoSuchFieldError unused440) {
        }
        try {
            iArr[f1.MEDIA_GALLERY_PERFORMANCE_STATS.ordinal()] = 441;
        } catch (NoSuchFieldError unused441) {
        }
        try {
            iArr[f1.NAVIGATION.ordinal()] = 442;
        } catch (NoSuchFieldError unused442) {
        }
        try {
            iArr[f1.STORY_PIN_VIDEO_PLAY.ordinal()] = 443;
        } catch (NoSuchFieldError unused443) {
        }
        try {
            iArr[f1.STORY_PIN_VIDEO_PAUSE.ordinal()] = 444;
        } catch (NoSuchFieldError unused444) {
        }
        try {
            iArr[f1.STORY_PIN_REORDER.ordinal()] = 445;
        } catch (NoSuchFieldError unused445) {
        }
        try {
            iArr[f1.STORY_PIN_DELETE.ordinal()] = 446;
        } catch (NoSuchFieldError unused446) {
        }
        try {
            iArr[f1.STORY_PIN_LOAD_DRAFT_FAILED.ordinal()] = 447;
        } catch (NoSuchFieldError unused447) {
        }
        try {
            iArr[f1.PIN_OPEN_IN_NATIVE_WEB_BROWSER.ordinal()] = 448;
        } catch (NoSuchFieldError unused448) {
        }
        try {
            iArr[f1.IDEA_PIN_CAMERA_VIEW_APPEAR.ordinal()] = 449;
        } catch (NoSuchFieldError unused449) {
        }
        try {
            iArr[f1.UNLINK_ACCOUNT.ordinal()] = 450;
        } catch (NoSuchFieldError unused450) {
        }
        try {
            iArr[f1.UNLINK_ACCOUNT_FAILED.ordinal()] = 451;
        } catch (NoSuchFieldError unused451) {
        }
        try {
            iArr[f1.LOGIN_ATTEMPT_LIMIT_REACHED.ordinal()] = 452;
        } catch (NoSuchFieldError unused452) {
        }
        try {
            iArr[f1.MAGIC_LINK_LOGIN_SUCCESS.ordinal()] = 453;
        } catch (NoSuchFieldError unused453) {
        }
        try {
            iArr[f1.MAGIC_LINK_LOGIN_FAILURE.ordinal()] = 454;
        } catch (NoSuchFieldError unused454) {
        }
        try {
            iArr[f1.PORTAL_IMPRESSION_ONE_PIXEL.ordinal()] = 455;
        } catch (NoSuchFieldError unused455) {
        }
        try {
            iArr[f1.STORY_PIN_CREATE_EXTERNAL_DEEP_LINK_SUCCESS.ordinal()] = 456;
        } catch (NoSuchFieldError unused456) {
        }
        try {
            iArr[f1.STORY_PIN_CREATE_EXTERNAL_DEEP_LINK_FAILED.ordinal()] = 457;
        } catch (NoSuchFieldError unused457) {
        }
        try {
            iArr[f1.OFFSITE_SAVE_ENTER.ordinal()] = 458;
        } catch (NoSuchFieldError unused458) {
        }
        try {
            iArr[f1.PAID_SEARCH_LAND.ordinal()] = 459;
        } catch (NoSuchFieldError unused459) {
        }
        try {
            iArr[f1.LIVE_SESSION_PRODUCT_IMPRESSION_ONE_PIXEL.ordinal()] = 460;
        } catch (NoSuchFieldError unused460) {
        }
        try {
            iArr[f1.LIVE_SESSION_COMMENT_IMPRESSION_ONE_PIXEL.ordinal()] = 461;
        } catch (NoSuchFieldError unused461) {
        }
        try {
            iArr[f1.ONEBAR_IMPRESSION_ONE_PIXEL.ordinal()] = 462;
        } catch (NoSuchFieldError unused462) {
        }
        try {
            iArr[f1.MFA_ENABLE_SUCCESS.ordinal()] = 463;
        } catch (NoSuchFieldError unused463) {
        }
        try {
            iArr[f1.MFA_DISABLE_SUCCESS.ordinal()] = 464;
        } catch (NoSuchFieldError unused464) {
        }
        try {
            iArr[f1.MFA_LOGIN_SUCCESS.ordinal()] = 465;
        } catch (NoSuchFieldError unused465) {
        }
        try {
            iArr[f1.MFA_SUCCESS_EMAIL_VERIFICATION.ordinal()] = 466;
        } catch (NoSuchFieldError unused466) {
        }
        try {
            iArr[f1.SHUFFLE_IMPRESSION_ONE_PIXEL.ordinal()] = 467;
        } catch (NoSuchFieldError unused467) {
        }
        try {
            iArr[f1.ANDROID_DFM_DOWNLOAD_STATUS.ordinal()] = 468;
        } catch (NoSuchFieldError unused468) {
        }
        try {
            iArr[f1.ANDROID_DFM_TOAST_SHOWN.ordinal()] = 469;
        } catch (NoSuchFieldError unused469) {
        }
        try {
            iArr[f1.CREATOR_ONBOARDING_LANDING_DEEPLINK.ordinal()] = 470;
        } catch (NoSuchFieldError unused470) {
        }
        try {
            iArr[f1.CREATOR_ONBOARDING_LANDING_DEEPLINK_SUCCESS.ordinal()] = 471;
        } catch (NoSuchFieldError unused471) {
        }
        try {
            iArr[f1.CREATOR_ONBOARDING_LANDING_DEEPLINK_FAILURE.ordinal()] = 472;
        } catch (NoSuchFieldError unused472) {
        }
        try {
            iArr[f1.PERMISSIONS_REQUEST.ordinal()] = 473;
        } catch (NoSuchFieldError unused473) {
        }
        try {
            iArr[f1.PERMISSIONS_RESULT.ordinal()] = 474;
        } catch (NoSuchFieldError unused474) {
        }
        try {
            iArr[f1.IDEA_PIN_CREATION_PERFORMANCE.ordinal()] = 475;
        } catch (NoSuchFieldError unused475) {
        }
        try {
            iArr[f1.IDEA_PIN_PRODUCT_TAG_ADDED.ordinal()] = 476;
        } catch (NoSuchFieldError unused476) {
        }
        try {
            iArr[f1.IDEA_PIN_PRODUCT_TAG_DELETED.ordinal()] = 477;
        } catch (NoSuchFieldError unused477) {
        }
        try {
            iArr[f1.CONVERSION_UPSELL_ACTIVE.ordinal()] = 478;
        } catch (NoSuchFieldError unused478) {
        }
        try {
            iArr[f1.CONVERSATION_INBOX_EMPTY_STATE_VIEW_DISPLAYED.ordinal()] = 479;
        } catch (NoSuchFieldError unused479) {
        }
        try {
            iArr[f1.CONVERSATION_EMPTY_INBOX_NEW_MESSAGE_BTN_DISPLAYED.ordinal()] = 480;
        } catch (NoSuchFieldError unused480) {
        }
        try {
            iArr[f1.CONVERSATION_INBOX_CONTACT_SYNC_BTN_DISPLAYED.ordinal()] = 481;
        } catch (NoSuchFieldError unused481) {
        }
        try {
            iArr[f1.CONTACT_SEARCH_MODAL_DISPLAYED.ordinal()] = 482;
        } catch (NoSuchFieldError unused482) {
        }
        try {
            iArr[f1.SHOWCASE_SUBPAGE_CLICKTHROUGH.ordinal()] = 483;
        } catch (NoSuchFieldError unused483) {
        }
        try {
            iArr[f1.SHOWCASE_SUBPAGE_CLICKTHROUGH_END.ordinal()] = 484;
        } catch (NoSuchFieldError unused484) {
        }
        try {
            iArr[f1.SHOWCASE_SUBPAGE_IMPRESSION_ONE_PIXEL.ordinal()] = 485;
        } catch (NoSuchFieldError unused485) {
        }
        try {
            iArr[f1.SHOWCASE_SUBPAGE_CLOSEUP.ordinal()] = 486;
        } catch (NoSuchFieldError unused486) {
        }
        try {
            iArr[f1.SHOWCASE_SUBPAGE_REPIN.ordinal()] = 487;
        } catch (NoSuchFieldError unused487) {
        }
        try {
            iArr[f1.SHOWCASE_SUBPAGE_SWIPE_LEFT.ordinal()] = 488;
        } catch (NoSuchFieldError unused488) {
        }
        try {
            iArr[f1.SHOWCASE_SUBPAGE_SWIPE_RIGHT.ordinal()] = 489;
        } catch (NoSuchFieldError unused489) {
        }
        try {
            iArr[f1.SHOWCASE_SUBPIN_CLICKTHROUGH.ordinal()] = 490;
        } catch (NoSuchFieldError unused490) {
        }
        try {
            iArr[f1.SHOWCASE_SUBPIN_CLICKTHROUGH_END.ordinal()] = 491;
        } catch (NoSuchFieldError unused491) {
        }
        try {
            iArr[f1.SHOWCASE_SUBPIN_IMPRESSION_ONE_PIXEL.ordinal()] = 492;
        } catch (NoSuchFieldError unused492) {
        }
        try {
            iArr[f1.SHOWCASE_SUBPIN_REPIN.ordinal()] = 493;
        } catch (NoSuchFieldError unused493) {
        }
        try {
            iArr[f1.SHOWCASE_SUBPIN_SWIPE_LEFT.ordinal()] = 494;
        } catch (NoSuchFieldError unused494) {
        }
        try {
            iArr[f1.SHOWCASE_SUBPIN_SWIPE_RIGHT.ordinal()] = 495;
        } catch (NoSuchFieldError unused495) {
        }
        try {
            iArr[f1.SHOWCASE_PIN_CLICKTHROUGH.ordinal()] = 496;
        } catch (NoSuchFieldError unused496) {
        }
        try {
            iArr[f1.SHOWCASE_PIN_CLICKTHROUGH_END.ordinal()] = 497;
        } catch (NoSuchFieldError unused497) {
        }
        try {
            iArr[f1.SHOWCASE_SUBPAGE_THUMBNAIL_SWIPE_LEFT.ordinal()] = 498;
        } catch (NoSuchFieldError unused498) {
        }
        try {
            iArr[f1.SHOWCASE_SUBPAGE_THUMBNAIL_SWIPE_RIGHT.ordinal()] = 499;
        } catch (NoSuchFieldError unused499) {
        }
        try {
            iArr[f1.SHOWCASE_SUBPAGE_NUDGE.ordinal()] = 500;
        } catch (NoSuchFieldError unused500) {
        }
        try {
            iArr[f1.QUIZ_PIN_RESPONSE.ordinal()] = 501;
        } catch (NoSuchFieldError unused501) {
        }
        try {
            iArr[f1.QUIZ_PIN_COMPLETION.ordinal()] = 502;
        } catch (NoSuchFieldError unused502) {
        }
        try {
            iArr[f1.QUIZ_PIN_RESULT_OPEN.ordinal()] = 503;
        } catch (NoSuchFieldError unused503) {
        }
        try {
            iArr[f1.QUIZ_PIN_RESULT_CLOSE.ordinal()] = 504;
        } catch (NoSuchFieldError unused504) {
        }
        try {
            iArr[f1.QUIZ_PIN_BACK.ordinal()] = 505;
        } catch (NoSuchFieldError unused505) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_PIN_IMPRESSIONS.ordinal()] = 506;
        } catch (NoSuchFieldError unused506) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_PIN_REPINS.ordinal()] = 507;
        } catch (NoSuchFieldError unused507) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_PIN_5S_OUTBOUND_CLICKS.ordinal()] = 508;
        } catch (NoSuchFieldError unused508) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_PIN_OUTBOUND_CLICKS.ordinal()] = 509;
        } catch (NoSuchFieldError unused509) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_PIN_CLICKS.ordinal()] = 510;
        } catch (NoSuchFieldError unused510) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_PIN_GRID_CLICKS.ordinal()] = 511;
        } catch (NoSuchFieldError unused511) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_PIN_SAVES.ordinal()] = 512;
        } catch (NoSuchFieldError unused512) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_PIN_SHARES_COMPLETED.ordinal()] = 513;
        } catch (NoSuchFieldError unused513) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_TP_PIN_IMPRESSIONS.ordinal()] = 514;
        } catch (NoSuchFieldError unused514) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_TP_PIN_REPINS.ordinal()] = 515;
        } catch (NoSuchFieldError unused515) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_TP_PIN_5S_OUTBOUND_CLICKS.ordinal()] = 516;
        } catch (NoSuchFieldError unused516) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_TP_PIN_OUTBOUND_CLICKS.ordinal()] = 517;
        } catch (NoSuchFieldError unused517) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_TP_PIN_CLICKS.ordinal()] = 518;
        } catch (NoSuchFieldError unused518) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_TP_PIN_GRID_CLICKS.ordinal()] = 519;
        } catch (NoSuchFieldError unused519) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_TP_PIN_SAVES.ordinal()] = 520;
        } catch (NoSuchFieldError unused520) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_TP_PIN_SHARES_COMPLETED.ordinal()] = 521;
        } catch (NoSuchFieldError unused521) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_SESSIONS.ordinal()] = 522;
        } catch (NoSuchFieldError unused522) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_SESSIONS_REPIN.ordinal()] = 523;
        } catch (NoSuchFieldError unused523) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_SESSIONS_PIN_CLICK.ordinal()] = 524;
        } catch (NoSuchFieldError unused524) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_SESSIONS_PIN_SAVES.ordinal()] = 525;
        } catch (NoSuchFieldError unused525) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_SESSIONS_PIN_SHARES_COMPLETED.ordinal()] = 526;
        } catch (NoSuchFieldError unused526) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_BOARDS_VISITED.ordinal()] = 527;
        } catch (NoSuchFieldError unused527) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_BOARDS_PIN_REPIN.ordinal()] = 528;
        } catch (NoSuchFieldError unused528) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_BOARDS_PIN_CLICK.ordinal()] = 529;
        } catch (NoSuchFieldError unused529) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_BOARDS_PIN_5S_OUTBOUND_CLICKS.ordinal()] = 530;
        } catch (NoSuchFieldError unused530) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_BOARDS_PIN_OUTBOUND_CLICKS.ordinal()] = 531;
        } catch (NoSuchFieldError unused531) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_BOARDS_PIN_SAVES.ordinal()] = 532;
        } catch (NoSuchFieldError unused532) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_BOARDS_PIN_SHARES_COMPLETED.ordinal()] = 533;
        } catch (NoSuchFieldError unused533) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_BOARDS_TP_PIN_REPIN.ordinal()] = 534;
        } catch (NoSuchFieldError unused534) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_BOARDS_TP_PIN_CLICKS.ordinal()] = 535;
        } catch (NoSuchFieldError unused535) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_BOARDS_TP_PIN_5S_OUTBOUND_CLICKS.ordinal()] = 536;
        } catch (NoSuchFieldError unused536) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_BOARDS_TP_PIN_OUTBOUND_CLICKS.ordinal()] = 537;
        } catch (NoSuchFieldError unused537) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_BOARDS_TP_PIN_SAVES.ordinal()] = 538;
        } catch (NoSuchFieldError unused538) {
        }
        try {
            iArr[f1.AUTOMAGICAL_BOARD_BOARDS_TP_PIN_SHARES_COMPLETED.ordinal()] = 539;
        } catch (NoSuchFieldError unused539) {
        }
        try {
            iArr[f1.AUTO_ORGANIZE_BUTTON_TAPPED.ordinal()] = 540;
        } catch (NoSuchFieldError unused540) {
        }
        try {
            iArr[f1.AUTO_CLUSTER_SELECTED.ordinal()] = 541;
        } catch (NoSuchFieldError unused541) {
        }
        try {
            iArr[f1.AUTO_CLUSTERS_IMPRESSION.ordinal()] = 542;
        } catch (NoSuchFieldError unused542) {
        }
        try {
            iArr[f1.AUTO_REFINE_BOARD_VIEW_BEGIN.ordinal()] = 543;
        } catch (NoSuchFieldError unused543) {
        }
        try {
            iArr[f1.AUTO_REFINE_BOARD_PIN_SELECTED.ordinal()] = 544;
        } catch (NoSuchFieldError unused544) {
        }
        try {
            iArr[f1.AUTO_REFINE_BOARD_PIN_DESELECTED.ordinal()] = 545;
        } catch (NoSuchFieldError unused545) {
        }
        try {
            iArr[f1.AUTO_BOARD_NAME_INPUT_VIEW_BEGIN.ordinal()] = 546;
        } catch (NoSuchFieldError unused546) {
        }
        try {
            iArr[f1.AUTO_BOARD_NAME_INPUTTED.ordinal()] = 547;
        } catch (NoSuchFieldError unused547) {
        }
        try {
            iArr[f1.AUTO_BOARD_CREATED.ordinal()] = 548;
        } catch (NoSuchFieldError unused548) {
        }
        try {
            iArr[f1.AUTO_SPARKLE_ORGANIZE_VIEW_BEGIN.ordinal()] = 549;
        } catch (NoSuchFieldError unused549) {
        }
        try {
            iArr[f1.AUTO_BOARD_PINS_ADD_TO_EXISTING_BOARD.ordinal()] = 550;
        } catch (NoSuchFieldError unused550) {
        }
        try {
            iArr[f1.PASSCODE_BACKUP_EMAIL_EQUAL_TO_CURRENT.ordinal()] = 551;
        } catch (NoSuchFieldError unused551) {
        }
        try {
            iArr[f1.SAVE_PASSCODE_SUCCESS.ordinal()] = 552;
        } catch (NoSuchFieldError unused552) {
        }
        try {
            iArr[f1.SAVE_SETTING_WITH_PASSCODE_ERROR.ordinal()] = 553;
        } catch (NoSuchFieldError unused553) {
        }
        try {
            iArr[f1.SAVE_SETTING_WITH_PASSCODE_SUCCESS.ordinal()] = 554;
        } catch (NoSuchFieldError unused554) {
        }
        try {
            iArr[f1.DISABLE_PASSCODE_SUCCESS.ordinal()] = 555;
        } catch (NoSuchFieldError unused555) {
        }
        try {
            iArr[f1.DISABLE_PASSCODE_FAILURE.ordinal()] = 556;
        } catch (NoSuchFieldError unused556) {
        }
        try {
            iArr[f1.UNIDIRECTIONAL_PASSCODE_ACKNOWLEDGED.ordinal()] = 557;
        } catch (NoSuchFieldError unused557) {
        }
        try {
            iArr[f1.UNIDIRECTIONAL_PASSCODE_CANCELED.ordinal()] = 558;
        } catch (NoSuchFieldError unused558) {
        }
        try {
            iArr[f1.MUSIC_PLAYLIST_OPEN.ordinal()] = 559;
        } catch (NoSuchFieldError unused559) {
        }
        try {
            iArr[f1.MUSIC_PLAYLIST_DISMISS.ordinal()] = 560;
        } catch (NoSuchFieldError unused560) {
        }
        try {
            iArr[f1.STORY_PIN_EMBEDDED_MUSIC_PLAY.ordinal()] = 561;
        } catch (NoSuchFieldError unused561) {
        }
        try {
            iArr[f1.PIN_EMBEDDED_MUSIC_PLAY.ordinal()] = 562;
        } catch (NoSuchFieldError unused562) {
        }
        try {
            iArr[f1.VIDEO_MUTE.ordinal()] = 563;
        } catch (NoSuchFieldError unused563) {
        }
        try {
            iArr[f1.VIDEO_NO_MUTE.ordinal()] = 564;
        } catch (NoSuchFieldError unused564) {
        }
        try {
            iArr[f1.PIN_CLOSEUP_MT_TRANSLATE.ordinal()] = 565;
        } catch (NoSuchFieldError unused565) {
        }
        try {
            iArr[f1.PIN_CLOSEUP_MT_RESTORE.ordinal()] = 566;
        } catch (NoSuchFieldError unused566) {
        }
        try {
            iArr[f1.PIN_CLOSEUP_RICH_MT_TRANSLATE.ordinal()] = 567;
        } catch (NoSuchFieldError unused567) {
        }
        try {
            iArr[f1.PIN_CLOSEUP_RICH_MT_RESTORE.ordinal()] = 568;
        } catch (NoSuchFieldError unused568) {
        }
        try {
            iArr[f1.PRODUCT_SEARCH_BACK_BUTTON_EXIT.ordinal()] = 569;
        } catch (NoSuchFieldError unused569) {
        }
        try {
            iArr[f1.VOICE_PERMISSIONS_PROMPT.ordinal()] = 570;
        } catch (NoSuchFieldError unused570) {
        }
        try {
            iArr[f1.INSTAGRAM_ACCT_CLAIMING_RETRY.ordinal()] = 571;
        } catch (NoSuchFieldError unused571) {
        }
        try {
            iArr[f1.INSTAGRAM_ACCT_CLAIMING_SUCCESS.ordinal()] = 572;
        } catch (NoSuchFieldError unused572) {
        }
        try {
            iArr[f1.INSTAGRAM_ACCT_CLAIMING_FAILURE.ordinal()] = 573;
        } catch (NoSuchFieldError unused573) {
        }
        try {
            iArr[f1.INSTAGRAM_ACCT_RECLAIMING_SUCCESS.ordinal()] = 574;
        } catch (NoSuchFieldError unused574) {
        }
        try {
            iArr[f1.INSTAGRAM_ACCT_RECLAIMING_FAILURE.ordinal()] = 575;
        } catch (NoSuchFieldError unused575) {
        }
        try {
            iArr[f1.INSTAGRAM_ACCT_UNCLAIMING_SUCCESS.ordinal()] = 576;
        } catch (NoSuchFieldError unused576) {
        }
        try {
            iArr[f1.INSTAGRAM_ACCT_UNCLAIMING_FAILURE.ordinal()] = 577;
        } catch (NoSuchFieldError unused577) {
        }
        try {
            iArr[f1.INSTAGRAM_ACCT_CLAIMING_AUTOPUBLISH_SUCCESS.ordinal()] = 578;
        } catch (NoSuchFieldError unused578) {
        }
        try {
            iArr[f1.INSTAGRAM_ACCT_CLAIMING_AUTOPUBLISH_FAILURE.ordinal()] = 579;
        } catch (NoSuchFieldError unused579) {
        }
        try {
            iArr[f1.HEADER_ACCOUNTS_CLAIM_BANNER_DISMISS.ordinal()] = 580;
        } catch (NoSuchFieldError unused580) {
        }
        try {
            iArr[f1.INSTAGRAM_ACCT_AUTO_ORG_PIN_SUCCESS.ordinal()] = 581;
        } catch (NoSuchFieldError unused581) {
        }
        try {
            iArr[f1.INSTAGRAM_ACCT_AUTO_ORG_PIN_FAILURE.ordinal()] = 582;
        } catch (NoSuchFieldError unused582) {
        }
        try {
            iArr[f1.AMAZON_ACCT_CLAIMING_SEEN.ordinal()] = 583;
        } catch (NoSuchFieldError unused583) {
        }
        try {
            iArr[f1.AMAZON_ACCT_LINK_BUTTON.ordinal()] = 584;
        } catch (NoSuchFieldError unused584) {
        }
        try {
            iArr[f1.AMAZON_ACCT_CLAIMING_SUCCESS.ordinal()] = 585;
        } catch (NoSuchFieldError unused585) {
        }
        try {
            iArr[f1.AMAZON_ACCT_CLAIMING_FAILURE.ordinal()] = 586;
        } catch (NoSuchFieldError unused586) {
        }
        try {
            iArr[f1.AMAZON_ACCT_UNCLAIMING_SEEN.ordinal()] = 587;
        } catch (NoSuchFieldError unused587) {
        }
        try {
            iArr[f1.AMAZON_ACCT_UNLINK_BUTTON.ordinal()] = 588;
        } catch (NoSuchFieldError unused588) {
        }
        try {
            iArr[f1.AMAZON_ACCT_UNCLAIMING_SUCCESS.ordinal()] = 589;
        } catch (NoSuchFieldError unused589) {
        }
        try {
            iArr[f1.AMAZON_ACCT_UNCLAIMING_FAILURE.ordinal()] = 590;
        } catch (NoSuchFieldError unused590) {
        }
        try {
            iArr[f1.PIN_HANDSHAKE_WEBVIEW_ERROR.ordinal()] = 591;
        } catch (NoSuchFieldError unused591) {
        }
        try {
            iArr[f1.PIN_HANDSHAKE_ERROR.ordinal()] = 592;
        } catch (NoSuchFieldError unused592) {
        }
        try {
            iArr[f1.PIN_HANDSHAKE_STEP.ordinal()] = 593;
        } catch (NoSuchFieldError unused593) {
        }
        try {
            iArr[f1.PIN_CARTING_SHEET_LOAD.ordinal()] = 594;
        } catch (NoSuchFieldError unused594) {
        }
        try {
            iArr[f1.PIN_CARTING_API_FAILURE.ordinal()] = 595;
        } catch (NoSuchFieldError unused595) {
        }
        try {
            iArr[f1.PIN_CARTING_RETAILER_CLICK.ordinal()] = 596;
        } catch (NoSuchFieldError unused596) {
        }
        try {
            iArr[f1.PIN_CARTING_MDL_SUCCEEDED.ordinal()] = 597;
        } catch (NoSuchFieldError unused597) {
        }
        try {
            iArr[f1.ADS_STL_ERROR.ordinal()] = 598;
        } catch (NoSuchFieldError unused598) {
        }
        try {
            iArr[f1.FILTER_NO_DATA.ordinal()] = 599;
        } catch (NoSuchFieldError unused599) {
        }
        try {
            iArr[f1.SEARCH_ONE_BAR_FILTER_NO_DATA.ordinal()] = 600;
        } catch (NoSuchFieldError unused600) {
        }
        try {
            iArr[f1.SEARCH_ONE_BAR_FILTER_MODULE_NO_DATA.ordinal()] = 601;
        } catch (NoSuchFieldError unused601) {
        }
        try {
            iArr[f1.DATA_REQUEST_SUCCESS.ordinal()] = 602;
        } catch (NoSuchFieldError unused602) {
        }
        try {
            iArr[f1.DATA_REQUEST_FAILURE.ordinal()] = 603;
        } catch (NoSuchFieldError unused603) {
        }
        try {
            iArr[f1.INVITE_CODE_FOLLOW_SUCCESSFUL.ordinal()] = 604;
        } catch (NoSuchFieldError unused604) {
        }
        try {
            iArr[f1.CLIENT_AUTH_INITIATED.ordinal()] = 605;
        } catch (NoSuchFieldError unused605) {
        }
        try {
            iArr[f1.CLIENT_REGISTER_ATTEMPT.ordinal()] = 606;
        } catch (NoSuchFieldError unused606) {
        }
        try {
            iArr[f1.CLIENT_REGISTER_SUCCESS.ordinal()] = 607;
        } catch (NoSuchFieldError unused607) {
        }
        try {
            iArr[f1.CLIENT_REGISTER_FAILED.ordinal()] = 608;
        } catch (NoSuchFieldError unused608) {
        }
        try {
            iArr[f1.CLIENT_SIGN_IN_ATTEMPT.ordinal()] = 609;
        } catch (NoSuchFieldError unused609) {
        }
        try {
            iArr[f1.CLIENT_SIGN_IN_SUCCESS.ordinal()] = 610;
        } catch (NoSuchFieldError unused610) {
        }
        try {
            iArr[f1.CLIENT_SIGN_IN_FAILED.ordinal()] = 611;
        } catch (NoSuchFieldError unused611) {
        }
        try {
            iArr[f1.PEAR_SCREENSHOT.ordinal()] = 612;
        } catch (NoSuchFieldError unused612) {
        }
        try {
            iArr[f1.ONE_BAR_MODULE_CLICK.ordinal()] = 613;
        } catch (NoSuchFieldError unused613) {
        }
        try {
            iArr[f1.ONE_BAR_MODULE_DESELECT.ordinal()] = 614;
        } catch (NoSuchFieldError unused614) {
        }
        try {
            iArr[f1.JOURNEY_BACK_BUTTON_CLICK.ordinal()] = 615;
        } catch (NoSuchFieldError unused615) {
        }
        try {
            iArr[f1.COLLAGE_COMPOSER_LAYER_REORDER.ordinal()] = 616;
        } catch (NoSuchFieldError unused616) {
        }
        try {
            iArr[f1.COLLAGE_COMPOSER_CUTOUT_ADDED.ordinal()] = 617;
        } catch (NoSuchFieldError unused617) {
        }
        try {
            iArr[f1.COLLAGE_COMPOSER_TEXT_ADDED.ordinal()] = 618;
        } catch (NoSuchFieldError unused618) {
        }
        try {
            iArr[f1.COLLAGE_COMPOSER_DRAWING_ADDED.ordinal()] = 619;
        } catch (NoSuchFieldError unused619) {
        }
        try {
            iArr[f1.COLLAGE_COMPOSER_DRAFT_FIRST_SAVE.ordinal()] = 620;
        } catch (NoSuchFieldError unused620) {
        }
        try {
            iArr[f1.COLLAGE_COMPOSER_ITEM_SWAPPED.ordinal()] = 621;
        } catch (NoSuchFieldError unused621) {
        }
        try {
            iArr[f1.COLLAGE_COMPOSER_COLLAGE_REMIXED.ordinal()] = 622;
        } catch (NoSuchFieldError unused622) {
        }
        try {
            iArr[f1.COLLAGE_COMPOSER_CAMERA_ADDED.ordinal()] = 623;
        } catch (NoSuchFieldError unused623) {
        }
        try {
            iArr[f1.COLLAGE_COMPOSER_USER_PHOTO_ADDED.ordinal()] = 624;
        } catch (NoSuchFieldError unused624) {
        }
        try {
            iArr[f1.ARA_VIEW.ordinal()] = 625;
        } catch (NoSuchFieldError unused625) {
        }
        try {
            iArr[f1.ARA_CLICK.ordinal()] = 626;
        } catch (NoSuchFieldError unused626) {
        }
        try {
            iArr[f1.WIDGET_UPSELL_DISMISS.ordinal()] = 627;
        } catch (NoSuchFieldError unused627) {
        }
        try {
            iArr[f1.WIDGET_UPSELL_STEPS_SHOWN.ordinal()] = 628;
        } catch (NoSuchFieldError unused628) {
        }
        try {
            iArr[f1.WIDGET_PRE_UPSELL_SHOWN.ordinal()] = 629;
        } catch (NoSuchFieldError unused629) {
        }
        try {
            iArr[f1.WIDGET_UPSELL_TRY_IT_CLICK.ordinal()] = 630;
        } catch (NoSuchFieldError unused630) {
        }
        try {
            iArr[f1.WIDGET_UPSELL_WIDGET_PINNED.ordinal()] = 631;
        } catch (NoSuchFieldError unused631) {
        }
        try {
            iArr[f1.GMA_SDK_LOAD.ordinal()] = 632;
        } catch (NoSuchFieldError unused632) {
        }
        try {
            iArr[f1.GMA_QUERY_INFO_FETCHED.ordinal()] = 633;
        } catch (NoSuchFieldError unused633) {
        }
        try {
            iArr[f1.GMA_QUERY_INFO_SENT.ordinal()] = 634;
        } catch (NoSuchFieldError unused634) {
        }
        try {
            iArr[f1.GMA_AD_LOADED.ordinal()] = 635;
        } catch (NoSuchFieldError unused635) {
        }
        try {
            iArr[f1.GMA_AD_RENDERED.ordinal()] = 636;
        } catch (NoSuchFieldError unused636) {
        }
        try {
            iArr[f1.GMA_AD_LOAD_FAILED.ordinal()] = 637;
        } catch (NoSuchFieldError unused637) {
        }
        try {
            iArr[f1.GMA_SDK_QUARANTINE_FAILED.ordinal()] = 638;
        } catch (NoSuchFieldError unused638) {
        }
        try {
            iArr[f1.GMA_QUERY_INFO_FAILED.ordinal()] = 639;
        } catch (NoSuchFieldError unused639) {
        }
        try {
            iArr[f1.GMA_REQUEST_HEADER_MISSING.ordinal()] = 640;
        } catch (NoSuchFieldError unused640) {
        }
        try {
            iArr[f1.GMA_SDK_MOBILE_CRASH.ordinal()] = 641;
        } catch (NoSuchFieldError unused641) {
        }
        try {
            iArr[f1.GMA_IMP_AD_VALUES_RECEIVED.ordinal()] = 642;
        } catch (NoSuchFieldError unused642) {
        }
        try {
            iArr[f1.GMA_IMP_DATA_RECEIVED.ordinal()] = 643;
        } catch (NoSuchFieldError unused643) {
        }
        try {
            iArr[f1.GMA_AD_STEP.ordinal()] = 644;
        } catch (NoSuchFieldError unused644) {
        }
        try {
            iArr[f1.PIN_IAB_END.ordinal()] = 645;
        } catch (NoSuchFieldError unused645) {
        }
        try {
            iArr[f1.BROWSER_SCREENSHOT.ordinal()] = 646;
        } catch (NoSuchFieldError unused646) {
        }
        try {
            iArr[f1.URL_TIME_SPENT.ordinal()] = 647;
        } catch (NoSuchFieldError unused647) {
        }
        try {
            iArr[f1.OM_SDK_FUNNEL_STEP.ordinal()] = 648;
        } catch (NoSuchFieldError unused648) {
        }
        try {
            iArr[f1.OM_SDK_FUNNEL_ERROR.ordinal()] = 649;
        } catch (NoSuchFieldError unused649) {
        }
        try {
            iArr[f1.PIN_AD_DELIVERED.ordinal()] = 650;
        } catch (NoSuchFieldError unused650) {
        }
        try {
            iArr[f1.PIN_AD_RENDERED.ordinal()] = 651;
        } catch (NoSuchFieldError unused651) {
        }
        try {
            iArr[f1.PIN_IAB_INITIAL_URL_LOAD.ordinal()] = 652;
        } catch (NoSuchFieldError unused652) {
        }
        try {
            iArr[f1.VOICE_SEARCH_FAILURE.ordinal()] = 653;
        } catch (NoSuchFieldError unused653) {
        }
        try {
            iArr[f1.HOME_FEED_INITIAL_LOAD_ERROR.ordinal()] = 654;
        } catch (NoSuchFieldError unused654) {
        }
        try {
            iArr[f1.SAMSUNG_PRELOAD_METADATA_SUCCESS.ordinal()] = 655;
        } catch (NoSuchFieldError unused655) {
        }
        try {
            iArr[f1.SAMSUNG_PRELOAD_FAILED.ordinal()] = 656;
        } catch (NoSuchFieldError unused656) {
        }
        try {
            iArr[f1.SAMSUNG_PRELOAD_METADATA_ATTEMPT.ordinal()] = 657;
        } catch (NoSuchFieldError unused657) {
        }
        try {
            iArr[f1.AUTH_COLLECTION_CLICK.ordinal()] = 658;
        } catch (NoSuchFieldError unused658) {
        }
        try {
            iArr[f1.AUTH_COLLECTION_VIEW.ordinal()] = 659;
        } catch (NoSuchFieldError unused659) {
        }
        try {
            iArr[f1.AUTH_COLLECTION_DISMISS.ordinal()] = 660;
        } catch (NoSuchFieldError unused660) {
        }
        try {
            iArr[f1.AUTH_COLLECTION_SUCCESS.ordinal()] = 661;
        } catch (NoSuchFieldError unused661) {
        }
        try {
            iArr[f1.AUTH_COLLECTION_REQUEST.ordinal()] = 662;
        } catch (NoSuchFieldError unused662) {
        }
        try {
            iArr[f1.AUTH_COLLECTION_FAIL.ordinal()] = 663;
        } catch (NoSuchFieldError unused663) {
        }
        try {
            iArr[f1.AUTH_COLLECTION_EDIT.ordinal()] = 664;
        } catch (NoSuchFieldError unused664) {
        }
        try {
            iArr[f1.UNAUTH_ACCOUNT_RECOVERY_SUCCESS.ordinal()] = 665;
        } catch (NoSuchFieldError unused665) {
        }
        try {
            iArr[f1.UNAUTH_ACCOUNT_RECOVERY_FAILURE.ordinal()] = 666;
        } catch (NoSuchFieldError unused666) {
        }
        try {
            iArr[f1.UNAUTH_ACCOUNT_RECOVERY_FIND_USER_BY_EMAIL_REQUEST.ordinal()] = 667;
        } catch (NoSuchFieldError unused667) {
        }
        try {
            iArr[f1.UNAUTH_ACCOUNT_RECOVERY_FIND_USER_BY_EMAIL_SUCCESS.ordinal()] = 668;
        } catch (NoSuchFieldError unused668) {
        }
        try {
            iArr[f1.UNAUTH_ACCOUNT_RECOVERY_FIND_USER_BY_NAME_REQUEST.ordinal()] = 669;
        } catch (NoSuchFieldError unused669) {
        }
        try {
            iArr[f1.UNAUTH_ACCOUNT_RECOVERY_FIND_USER_BY_NAME_SUCCESS.ordinal()] = 670;
        } catch (NoSuchFieldError unused670) {
        }
        try {
            iArr[f1.UNAUTH_ACCOUNT_RECOVERY_FB_ACCOUNT_RETRIEVAL.ordinal()] = 671;
        } catch (NoSuchFieldError unused671) {
        }
        try {
            iArr[f1.UNAUTH_ACCOUNT_RECOVERY_FB_BANNER_CLICK.ordinal()] = 672;
        } catch (NoSuchFieldError unused672) {
        }
        try {
            iArr[f1.BOARD_VIEW_UPSELL_MODAL_INVITE_COLLABORATORS_DISMISS.ordinal()] = 673;
        } catch (NoSuchFieldError unused673) {
        }
        try {
            iArr[f1.BOARD_VIEW_UPSELL_MODAL_INVITE_COLLABORATORS_DISMISS_WITH_INVITE.ordinal()] = 674;
        } catch (NoSuchFieldError unused674) {
        }
        try {
            iArr[f1.POST_SAVE_UPSELL_INVITE_COLLABORATORS_DISMISS_WITH_INVITE.ordinal()] = 675;
        } catch (NoSuchFieldError unused675) {
        }
        try {
            iArr[f1.POST_SAVE_IMAGE_UPSELL_INVITE_COLLABORATORS_DISMISS_WITH_INVITE.ordinal()] = 676;
        } catch (NoSuchFieldError unused676) {
        }
        try {
            iArr[f1.GRID_PIN_LEVELING_GAP.ordinal()] = 677;
        } catch (NoSuchFieldError unused677) {
        }
        try {
            iArr[f1.GRID_PIN_LEVELING_GAP_150.ordinal()] = 678;
        } catch (NoSuchFieldError unused678) {
        }
        try {
            iArr[f1.GRID_PIN_LEVELING_GAP_FILLED.ordinal()] = 679;
        } catch (NoSuchFieldError unused679) {
        }
        try {
            iArr[f1.PIN_SUPPORTS_CLICKTHROUGH.ordinal()] = 680;
        } catch (NoSuchFieldError unused680) {
        }
        try {
            iArr[f1.SH_BOARD_ADVISORY_VIEW.ordinal()] = 681;
        } catch (NoSuchFieldError unused681) {
        }
        try {
            iArr[f1.SH_BOARD_SECTION_ADVISORY_VIEW.ordinal()] = 682;
        } catch (NoSuchFieldError unused682) {
        }
        try {
            iArr[f1.ALL_FILTERS_DESELECTED.ordinal()] = 683;
        } catch (NoSuchFieldError unused683) {
        }
        try {
            iArr[f1.PIN_REPIN_SUCCESS.ordinal()] = 684;
        } catch (NoSuchFieldError unused684) {
        }
        try {
            iArr[f1.BOARD_SHARE_VIDEO_EXPORT_ATTEMPTED.ordinal()] = 685;
        } catch (NoSuchFieldError unused685) {
        }
        try {
            iArr[f1.BOARD_SHARE_VIDEO_EXPORT_CODEC_CREATED.ordinal()] = 686;
        } catch (NoSuchFieldError unused686) {
        }
        try {
            iArr[f1.BOARD_SHARE_VIDEO_EXPORT_CODEC_FAILED.ordinal()] = 687;
        } catch (NoSuchFieldError unused687) {
        }
        try {
            iArr[f1.BOARD_SHARE_VIDEO_EXPORT_SUCCEEDED.ordinal()] = 688;
        } catch (NoSuchFieldError unused688) {
        }
        try {
            iArr[f1.END_SESSION_SUCCESS.ordinal()] = 689;
        } catch (NoSuchFieldError unused689) {
        }
        try {
            iArr[f1.END_SESSION_FAILURE.ordinal()] = 690;
        } catch (NoSuchFieldError unused690) {
        }
        try {
            iArr[f1.CONVERSATION_SETTINGS_VIEWED.ordinal()] = 691;
        } catch (NoSuchFieldError unused691) {
        }
        try {
            iArr[f1.CONVERSATION_NOTIFICATIONS_SET_ALWAYS_ON.ordinal()] = 692;
        } catch (NoSuchFieldError unused692) {
        }
        try {
            iArr[f1.CONVERSATION_NOTIFICATIONS_SET_MUTE_ONE_HOUR.ordinal()] = 693;
        } catch (NoSuchFieldError unused693) {
        }
        try {
            iArr[f1.CONVERSATION_NOTIFICATIONS_SET_MUTE_EIGHT_HOURS.ordinal()] = 694;
        } catch (NoSuchFieldError unused694) {
        }
        try {
            iArr[f1.CONVERSATION_NOTIFICATIONS_SET_MUTE_ONE_WEEK.ordinal()] = 695;
        } catch (NoSuchFieldError unused695) {
        }
        try {
            iArr[f1.CONVERSATION_NOTIFICATIONS_SET_MUTE_INDEFINITELY.ordinal()] = 696;
        } catch (NoSuchFieldError unused696) {
        }
        try {
            iArr[f1.UNAUTH_EX_PRELOAD_CONTROL.ordinal()] = 697;
        } catch (NoSuchFieldError unused697) {
        }
        try {
            iArr[f1.UNAUTH_EX_PRELOAD_ENABLED.ordinal()] = 698;
        } catch (NoSuchFieldError unused698) {
        }
        try {
            iArr[f1.MOVE_GOOGLE_LINK_SUCCESS.ordinal()] = 699;
        } catch (NoSuchFieldError unused699) {
        }
        try {
            iArr[f1.MOVE_GOOGLE_LINK_FAILURE.ordinal()] = 700;
        } catch (NoSuchFieldError unused700) {
        }
        try {
            iArr[f1.AD_DISCLOSURE_CLICKTHROUGH.ordinal()] = 701;
        } catch (NoSuchFieldError unused701) {
        }
        try {
            iArr[f1.EMAIL_OTP_VERIFICIATION_SUCCESS.ordinal()] = 702;
        } catch (NoSuchFieldError unused702) {
        }
        try {
            iArr[f1.EMAIL_OTP_VERIFICIATION_FAILURE.ordinal()] = 703;
        } catch (NoSuchFieldError unused703) {
        }
        try {
            iArr[f1.EMAIL_OTP_VERIFICATION_SUCCESS.ordinal()] = 704;
        } catch (NoSuchFieldError unused704) {
        }
        try {
            iArr[f1.EMAIL_OTP_VERIFICATION_FAILURE.ordinal()] = 705;
        } catch (NoSuchFieldError unused705) {
        }
        try {
            iArr[f1.PIN_CLOSEUP_BOARD_CONVERSATION_THREAD_MODULE.ordinal()] = 706;
        } catch (NoSuchFieldError unused706) {
        }
        try {
            iArr[f1.COMPLETE_EU_PROMPT.ordinal()] = 707;
        } catch (NoSuchFieldError unused707) {
        }
        try {
            iArr[f1.DISMISS_EU_PROMPT.ordinal()] = 708;
        } catch (NoSuchFieldError unused708) {
        }
        try {
            iArr[f1.PIN_SEE_MORE.ordinal()] = 709;
        } catch (NoSuchFieldError unused709) {
        }
        try {
            iArr[f1.PIN_SEE_MORE_UNDO.ordinal()] = 710;
        } catch (NoSuchFieldError unused710) {
        }
        try {
            iArr[f1.PIN_SEE_LESS.ordinal()] = 711;
        } catch (NoSuchFieldError unused711) {
        }
        try {
            iArr[f1.PIN_SEE_LESS_UNDO.ordinal()] = 712;
        } catch (NoSuchFieldError unused712) {
        }
        try {
            iArr[f1.STORY_SEE_MORE.ordinal()] = 713;
        } catch (NoSuchFieldError unused713) {
        }
        try {
            iArr[f1.STORY_SEE_MORE_UNDO.ordinal()] = 714;
        } catch (NoSuchFieldError unused714) {
        }
        try {
            iArr[f1.STORY_SEE_LESS.ordinal()] = 715;
        } catch (NoSuchFieldError unused715) {
        }
        try {
            iArr[f1.STORY_SEE_LESS_UNDO.ordinal()] = 716;
        } catch (NoSuchFieldError unused716) {
        }
        try {
            iArr[f1.WL_SUBMIT.ordinal()] = 717;
        } catch (NoSuchFieldError unused717) {
        }
        try {
            iArr[f1.NRT_AUTO_ORG_VIEW.ordinal()] = 718;
        } catch (NoSuchFieldError unused718) {
        }
        try {
            iArr[f1.NRT_AUTO_ORG_DISMISS.ordinal()] = 719;
        } catch (NoSuchFieldError unused719) {
        }
        try {
            iArr[f1.NRT_AUTO_ORG_TIMEOUT.ordinal()] = 720;
        } catch (NoSuchFieldError unused720) {
        }
        try {
            iArr[f1.NRT_AUTO_ORG_FAILURE.ordinal()] = 721;
        } catch (NoSuchFieldError unused721) {
        }
        try {
            iArr[f1.COLLAGE_CUTOUT_ITEM_CLICK.ordinal()] = 722;
        } catch (NoSuchFieldError unused722) {
        }
        try {
            iArr[f1.COLLAGE_CUTOUT_ITEM_CLICKTHROUGH.ordinal()] = 723;
        } catch (NoSuchFieldError unused723) {
        }
        try {
            iArr[f1.COLLAGE_CUTOUT_ITEM_CLICKTHROUGH_END.ordinal()] = 724;
        } catch (NoSuchFieldError unused724) {
        }
        try {
            iArr[f1.COLLAGE_CUTOUT_ITEM_SWIPE_LEFT.ordinal()] = 725;
        } catch (NoSuchFieldError unused725) {
        }
        try {
            iArr[f1.COLLAGE_CUTOUT_ITEM_SWIPE_RIGHT.ordinal()] = 726;
        } catch (NoSuchFieldError unused726) {
        }
        try {
            iArr[f1.COLLAGE_CUTOUT_DRAWER_OPEN.ordinal()] = 727;
        } catch (NoSuchFieldError unused727) {
        }
        try {
            iArr[f1.COLLAGE_CUTOUT_DRAWER_CLOSE.ordinal()] = 728;
        } catch (NoSuchFieldError unused728) {
        }
        try {
            iArr[f1.COLLAGE_CUTOUT_ITEM_VIEW.ordinal()] = 729;
        } catch (NoSuchFieldError unused729) {
        }
        try {
            iArr[f1.END_OF_FEED.ordinal()] = 730;
        } catch (NoSuchFieldError unused730) {
        }
        try {
            iArr[f1.COMPLIANCE_REQUIREMENTS_SUCCESS.ordinal()] = 731;
        } catch (NoSuchFieldError unused731) {
        }
        try {
            iArr[f1.COMPLIANCE_REQUIREMENTS_FAILURE.ordinal()] = 732;
        } catch (NoSuchFieldError unused732) {
        }
        try {
            iArr[f1.COMPLIANCE_REQUIREMENTS_TIMEOUT.ordinal()] = 733;
        } catch (NoSuchFieldError unused733) {
        }
        try {
            iArr[f1.COMPLIANCE_FEATURE_CHECK_NOT_LOADED.ordinal()] = 734;
        } catch (NoSuchFieldError unused734) {
        }
        try {
            iArr[f1.SHOPPING_SKELETON_FALSE_POSITIVE.ordinal()] = 735;
        } catch (NoSuchFieldError unused735) {
        }
        try {
            iArr[f1.SHOPPING_SKELETON_FALSE_NEGATIVE.ordinal()] = 736;
        } catch (NoSuchFieldError unused736) {
        }
        try {
            iArr[f1.FACEBOOK_HELP_CENTER_LINK.ordinal()] = 737;
        } catch (NoSuchFieldError unused737) {
        }
        try {
            iArr[f1.COLLAGE_QUICK_SWAP_CAROUSEL_SWAP.ordinal()] = 738;
        } catch (NoSuchFieldError unused738) {
        }
        try {
            iArr[f1.COLLAGE_QUICK_SWAP_CUTOUT_CAROUSEL_SWAP.ordinal()] = 739;
        } catch (NoSuchFieldError unused739) {
        }
        try {
            iArr[f1.AD_CLOSEUP_RP_VIEW.ordinal()] = 740;
        } catch (NoSuchFieldError unused740) {
        }
        try {
            iArr[f1.DL_AD_CLOSEUP_OVERLAY_IMPRESSION.ordinal()] = 741;
        } catch (NoSuchFieldError unused741) {
        }
        try {
            iArr[f1.DL_AD_CLOSEUP_OVERLAY_CLICKTHROUGH.ordinal()] = 742;
        } catch (NoSuchFieldError unused742) {
        }
        try {
            iArr[f1.DL_AD_CLOSEUP_OVERLAY_CLICKTHROUGH_END.ordinal()] = 743;
        } catch (NoSuchFieldError unused743) {
        }
        try {
            iArr[f1.SUBMIT_NEW_PASSWORD.ordinal()] = 744;
        } catch (NoSuchFieldError unused744) {
        }
        try {
            iArr[f1.REMOTE_PASSWORD_VALIDATION_SUCCESS.ordinal()] = 745;
        } catch (NoSuchFieldError unused745) {
        }
        try {
            iArr[f1.REMOTE_PASSWORD_VALIDATION_FAILURE.ordinal()] = 746;
        } catch (NoSuchFieldError unused746) {
        }
        try {
            iArr[f1.HANDSHAKE_ACCT_LINKING_SUCCESS.ordinal()] = 747;
        } catch (NoSuchFieldError unused747) {
        }
        try {
            iArr[f1.HANDSHAKE_ACCT_LINKING_FAILURE.ordinal()] = 748;
        } catch (NoSuchFieldError unused748) {
        }
        try {
            iArr[f1.HANDSHAKE_ACCT_UNLINKING_SUCCESS.ordinal()] = 749;
        } catch (NoSuchFieldError unused749) {
        }
        try {
            iArr[f1.HANDSHAKE_ACCT_UNLINKING_FAILURE.ordinal()] = 750;
        } catch (NoSuchFieldError unused750) {
        }
        try {
            iArr[f1.FULFILLED_BY_SEARCH_FEATURES.ordinal()] = 751;
        } catch (NoSuchFieldError unused751) {
        }
        try {
            iArr[f1.USER_SEARCH_ADVISORY.ordinal()] = 752;
        } catch (NoSuchFieldError unused752) {
        }
        try {
            iArr[f1.CLOSEUP_PIN_LOAD_CACHE_HIT.ordinal()] = 753;
        } catch (NoSuchFieldError unused753) {
        }
        try {
            iArr[f1.CLOSEUP_PIN_LOAD_CACHE_MISS.ordinal()] = 754;
        } catch (NoSuchFieldError unused754) {
        }
        try {
            iArr[f1.MQTT_CONNECTED_SUCCESS.ordinal()] = 755;
        } catch (NoSuchFieldError unused755) {
        }
        try {
            iArr[f1.MQTT_CONNECTED_FAILURE.ordinal()] = 756;
        } catch (NoSuchFieldError unused756) {
        }
        try {
            iArr[f1.MQTT_DISCONNECTED.ordinal()] = 757;
        } catch (NoSuchFieldError unused757) {
        }
        try {
            iArr[f1.MQTT_RECONNECTED.ordinal()] = 758;
        } catch (NoSuchFieldError unused758) {
        }
        try {
            iArr[f1.MQTT_MESSAGE_SENT.ordinal()] = 759;
        } catch (NoSuchFieldError unused759) {
        }
        try {
            iArr[f1.QR_AUTH_VERIFY_TOKEN.ordinal()] = 760;
        } catch (NoSuchFieldError unused760) {
        }
        try {
            iArr[f1.QR_AUTH_APPROVE.ordinal()] = 761;
        } catch (NoSuchFieldError unused761) {
        }
        try {
            iArr[f1.PIN_REP_EVENT_QUEUE_FALLBACK.ordinal()] = 762;
        } catch (NoSuchFieldError unused762) {
        }
        try {
            iArr[f1.PIN_REP_EVENT_QUEUE_INTERRUPTED.ordinal()] = 763;
        } catch (NoSuchFieldError unused763) {
        }
        try {
            iArr[f1.PIN_REP_EVENT_QUEUE_FULL.ordinal()] = 764;
        } catch (NoSuchFieldError unused764) {
        }
        try {
            iArr[f1.PIN_REP_EVENT_QUEUE_NULL.ordinal()] = 765;
        } catch (NoSuchFieldError unused765) {
        }
        try {
            iArr[f1.NETWORK_OFFLINE.ordinal()] = 766;
        } catch (NoSuchFieldError unused766) {
        }
        try {
            iArr[f1.NETWORK_ONLINE.ordinal()] = 767;
        } catch (NoSuchFieldError unused767) {
        }
        try {
            iArr[f1.QCM_PIN_IMPRESSION_ONE_PIEXAL.ordinal()] = 768;
        } catch (NoSuchFieldError unused768) {
        }
        try {
            iArr[f1.QCM_PIN_IMPRESSION_ONE_PIXEL.ordinal()] = 769;
        } catch (NoSuchFieldError unused769) {
        }
        try {
            iArr[f1.QCM_METADATA_CLICK.ordinal()] = 770;
        } catch (NoSuchFieldError unused770) {
        }
        try {
            iArr[f1.QCM_CTA_CLICK.ordinal()] = 771;
        } catch (NoSuchFieldError unused771) {
        }
        try {
            iArr[f1.CUSTOM_CHROME_TAB_ENGAGEMENT_SIGNAL.ordinal()] = 772;
        } catch (NoSuchFieldError unused772) {
        }
        try {
            iArr[f1.LOCAL_NOTIFICATION_SCHEDULE.ordinal()] = 773;
        } catch (NoSuchFieldError unused773) {
        }
        try {
            iArr[f1.LOCAL_NOTIFICATION_DELETE.ordinal()] = 774;
        } catch (NoSuchFieldError unused774) {
        }
        try {
            iArr[f1.LOCAL_NOTIFICATION_OPEN.ordinal()] = 775;
        } catch (NoSuchFieldError unused775) {
        }
        f66962a = iArr;
    }
}
