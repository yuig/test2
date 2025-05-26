package h32;

import com.google.android.gms.ads.AdSize;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes2.dex */
public final class b4 {
    public static d4 a(int i13) {
        if (i13 == 1) {
            return d4.FEED;
        }
        if (i13 == 2) {
            return d4.SEARCH;
        }
        if (i13 == 3) {
            return d4.PIN;
        }
        if (i13 == 4) {
            return d4.USER;
        }
        if (i13 == 5) {
            return d4.BOARD;
        }
        if (i13 != 7) {
            if (i13 == 31) {
                return d4.EMAIL;
            }
            if (i13 == 32) {
                return d4.OTHER_EXTERNAL;
            }
            if (i13 == 50) {
                return d4.SHARE_EXTENSION;
            }
            if (i13 == 51) {
                return d4.EMPTY_STATE;
            }
            if (i13 == 140) {
                return d4.SERVICE_ENTRY_WEB;
            }
            if (i13 == 141) {
                return d4.BUBBLE_ARTICLE;
            }
            if (i13 == 164) {
                return d4.BOARD_SECTION;
            }
            if (i13 == 165) {
                return d4.PIN_CREATE_INFO;
            }
            if (i13 == 186) {
                return d4.OFF_PINTEREST;
            }
            if (i13 == 187) {
                return d4.SERVICE_ENTRY_PAID;
            }
            if (i13 == 202) {
                return d4.UNKNOWN_VIEW;
            }
            if (i13 == 203) {
                return d4.PIN_ANALYTICS_SAVED_BOARDS;
            }
            if (i13 == 478) {
                return d4.PIN_NOTE;
            }
            if (i13 == 479) {
                return d4.PRODUCT_TAGGING;
            }
            if (i13 == 544) {
                return d4.AR_SCENE;
            }
            if (i13 == 545) {
                return d4.CREATOR_PATHWAYS;
            }
            if (i13 == 553) {
                return d4.USER_SIGNALS_COLLECTION;
            }
            if (i13 == 554) {
                return d4.EDIT_ABOUT_PAGE;
            }
            switch (i13) {
                case 7:
                    break;
                case 20:
                    return d4.DEEP_LINKING;
                case 24:
                    return d4.ORIENTATION;
                case 42:
                    return d4.CONVERSATION;
                case 48:
                    return d4.ACTION_SHEET;
                case 61:
                    return d4.SHARE_EXTENSION_IMAGE_PICKER;
                case 63:
                    return d4.SHARE_EXTENSION_SELECT_BOARD;
                case 67:
                    return d4.PUSH_NOTIFICATION;
                case 70:
                    return d4.SEND_SHARE;
                case 72:
                    return d4.FLASHLIGHT;
                case 74:
                    return d4.CONTACT_UPLOAD;
                case 78:
                    return d4.ARTICLE;
                case 80:
                    return d4.HOMEFEED_TUNER;
                case 82:
                    return d4.AGGREGATED_DID_IT_FEED;
                case 94:
                    return d4.PIN_EDIT;
                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_VIDEO_CREATOR_ANALYTICS_MODULE /* 98 */:
                    return d4.PIN_COMMENTS;
                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE /* 101 */:
                    return d4.PIN_DID_IT;
                case RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER /* 107 */:
                    return d4.NEWS_HUB;
                case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL /* 110 */:
                    return d4.PIN_CLOSEUP_FULL_SCREEN_VIDEO;
                case RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW /* 116 */:
                    return d4.EXT_VOICE_SEARCH;
                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL /* 126 */:
                    return d4.APPLICATION;
                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS /* 129 */:
                    return d4.APP_SHORTCUT;
                case RecyclerViewTypes.VIEW_TYPE_FEED_SECTION_TITLE /* 132 */:
                    return d4.MODAL;
                case RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_FILTER /* 155 */:
                    return d4.ABOUT_ADS;
                case RecyclerViewTypes.VIEW_TYPE_FULL_SPAN_PLACEHOLDER /* 162 */:
                    return d4.PIN_VISUAL_LINKS;
                case RecyclerViewTypes.VIEW_TYPE_SHOPPING_SPOTLIGHT /* 169 */:
                    return d4.PINCODE;
                case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO_FULL_SPAN /* 175 */:
                    return d4.ONE_TAP_V3_BROWSER;
                case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_THREE_PINS_COLLECTION /* 198 */:
                    return d4.PIN_ANALYTICS;
                case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_HEADER /* 205 */:
                    return d4.GDPR_FLOW;
                case RecyclerViewTypes.VIEW_TYPE_MESSAGES_HEADER /* 216 */:
                    return d4.SERVICE_ENTRY_INVITE_CODE;
                case RecyclerViewTypes.VIEW_TYPE_STORY_GROUP_MY_PINS /* 226 */:
                    return d4.STORY_PIN;
                case RecyclerViewTypes.VIEW_TYPE_PROFILE_BOARDLESS_PINS_HEADER /* 228 */:
                    return d4.STORY_PIN_MULTI_PHOTO_PICKER;
                case RecyclerViewTypes.VIEW_TYPE_AFFILIATE_LINK_IMAGE /* 230 */:
                    return d4.CONVERT_TO_PERSONAL;
                case RecyclerViewTypes.VIEW_TYPE_SHARESHEET_APP /* 234 */:
                    return d4.ACCOUNT_SWITCHER;
                case RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL /* 239 */:
                    return d4.LIL_ADS_MANAGER_CREATE;
                case RecyclerViewTypes.VIEW_TYPE_PEAR_INSIGHT_HEADER /* 247 */:
                    return d4.BUSINESS_ACCOUNT_COVER_PHOTO_PICKER;
                case 255:
                    return d4.HOMEFEED_CONTROL;
                case RecyclerViewTypes.VIEW_TYPE_PROTECTED_BOARD_HEADER /* 260 */:
                    return d4.BIZ_ORIENTATION;
                case RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_BOARDS /* 263 */:
                    return d4.IN_APP_SURVEY;
                case 370:
                    return d4.HOMEFEED_RELEVANCE;
                case 380:
                    return d4.VIRTUAL_TRY_ON;
                case 386:
                    return d4.PIN_INTEREST_TAGGING;
                case 419:
                    return d4.STORY_PIN_CREATE_RESPONSE;
                case 427:
                    return d4.CLOSEUP_SCENE_SHOP;
                case 432:
                    return d4.STORY_PIN_METADATA;
                case 437:
                    return d4.STORY_PIN_DETAILS;
                case 441:
                    return d4.PIN_TEMPLATE_PICKER_MODAL;
                case 444:
                    return d4.STORY_PIN_CAMERA;
                case 445:
                    return d4.STORY_PIN_GALLERY;
                case 446:
                    return d4.STORY_PIN_PAGE_EDIT;
                case 447:
                    return d4.STORY_PIN_PAGE_TRIMMER_TOOL;
                case 448:
                    return d4.STORY_PIN_PAGE_TEXT_DURATION_TOOL;
                case 449:
                    return d4.STORY_PIN_PAGE_MUSIC_SELECTION_TOOL;
                case 450:
                    return d4.STORY_PIN_PAGE_MUSIC_ADJUST_TOOL;
                case 451:
                    return d4.STORY_PIN_PAGE_VOICEOVER_TOOL;
                case 473:
                    return d4.PHONE_COUNTRY;
                case 476:
                    return d4.CONVERT_TO_BUSINESS;
                case 483:
                    return d4.STORY_PIN_MULTI_DRAFTS;
                case 485:
                    return d4.STORY_PIN_STICKER_PICKER;
                case 487:
                    return d4.ADD_ACCOUNT;
                case 492:
                    return d4.STORY_PIN_SUPPORT_MODAL;
                case 494:
                    return d4.LIVE_SESSION_PIN;
                case 501:
                    return d4.STORY_PIN_PAGE_TEXT_EDITOR_TOOL;
                case 510:
                    return d4.VTO_PRODUCT_TAGGING_PREVIEW;
                case 531:
                    return d4.CREATOR_HUB;
                case 536:
                    return d4.STORY_PIN_STICKER_BY_CATEGORY_PICKER;
                case 541:
                    return d4.COMMENT_COMPOSER;
                case 548:
                    return d4.ABOUT_DRAWER;
                case 567:
                    return d4.ALERT_SHEET;
                case 570:
                    return d4.IDEA_PIN_EDUCATION;
                case 571:
                    return d4.IDEA_PINEDUCATION_VIEW_PAGER;
                case 573:
                    return d4.BRANDED_CONTENT_TERMS;
                case 574:
                    return d4.BRANDED_CONTENT_ENROLLED;
                case 582:
                    return d4.IDEA_PIN_PAID_PARTNERSHIP_EDIT;
                case 592:
                    return d4.PIN_SCHEDULING_DATE_TIME_PICKER;
                case 595:
                    return d4.LIVESTREAM_APPLICATION;
                case 597:
                    return d4.IDEA_PIN_CANVAS_ASPECT_RATIO_TOOL;
                case 609:
                    return d4.PIN_CLOSEUP_FULL_SCREEN_IDEA_PIN_VIDEO;
                case 610:
                    return d4.SHUFFLE_CUTOUT;
                case 613:
                    return d4.REPORTS_AND_VIOLATION_CENTER;
                case 624:
                    return d4.PEAR_INSIGHT;
                case 630:
                    return d4.CUTOUT_TOOL;
                case 631:
                    return d4.ORGANIZE_BOARDLESS_PINS;
                case 633:
                    return d4.IDEA_PIN_IMAGE_STICKER_PHOTO_PICKER;
                case 635:
                    return d4.COLLAGE_COMPOSER;
                case 637:
                    return d4.COLLAGE_COMPOSER_CREATE_PIN;
                case 638:
                    return d4.COLLAGE_COMPOSER_ITEM_PICKER;
                case 639:
                    return d4.ANDROID_CUBES;
                case 643:
                    return d4.STORY_PIN_DETAILS_HASHTAGS_TYPEAHEAD;
                case 644:
                    return d4.STORY_PIN_DETAILS_HASHTAGS_TYPEAHEAD_SELECTED;
                case 645:
                    return d4.COLLAGE_COMPOSER_EFFECT_PICKER;
                case 651:
                    return d4.USER_BOARD_RESTORATION;
                case 652:
                    return d4.WIDGET_UPSELL;
                case 654:
                    return d4.PEAR_QUIZ;
                case 656:
                    return d4.HALF_MODAL;
                case 657:
                    return d4.FULL_MODAL;
                case 658:
                    return d4.COMMENT_STICKER_PICKER;
                case 659:
                    return d4.FLOATING_BOARD_PICKER;
                case 661:
                    return d4.SERVICE_ENTRY_DIRECT;
                case 662:
                    return d4.COLLAGE;
                case 663:
                    return d4.COLLAGE_PREVIEW;
                case 664:
                    return d4.SSO;
                case 666:
                    return d4.PARENTAL_PASSCODE;
                case 667:
                    return d4.RELATED_PINS_FILTER_OPTIONS_DRAWER;
                case 678:
                    return d4.ACCOUNT_RECOVERY_RESILIENCE;
                case 679:
                    return d4.POST_CREATE_UPSELL_MODAL;
                case 698:
                    return d4.COLLAGE_COMPOSER_LAYERING_CONTROL;
                case 699:
                    return d4.PROFILE_PHOTO_PICKER;
                case 702:
                    return d4.EMAIL_VERIFICATON;
                case 703:
                    return d4.EMAIL_VERIFICATION;
                case 704:
                    return d4.UNIFIED_INBOX;
                case 707:
                    return d4.EU_PROMPT_MODAL_IMPRESSION;
                case 708:
                    return d4.UNBLOCK_SHEET;
                case 709:
                    return d4.IMAGE_VISUALIZATION;
                case 713:
                    return d4.COLLAGE_QUICK_SWAP;
                case 715:
                    return d4.BOARD_LANDING_PAGE;
                case 716:
                    return d4.BOARD_ALL_SAVES;
                case 717:
                    return d4.PIN_OR_SPIN_SELECTION;
                case 718:
                    return d4.PIN_OR_SPIN_REVEAL_REWARD;
                case 719:
                    return d4.PIN_OR_SPIN_REWARD;
                case 721:
                    return d4.INSTAGRAM_BACKFILL_MIGRATION;
                case 727:
                    return d4.VISUAL_ANSWERS_FEED;
                case AdSize.LEADERBOARD_WIDTH /* 728 */:
                    return d4.VISUAL_ANSWERS_FEED_QUESTION;
                default:
                    switch (i13) {
                        case RecyclerViewTypes.VIEW_TYPE_STYLE_HEADER /* 218 */:
                            return d4.REORDER;
                        case RecyclerViewTypes.VIEW_TYPE_STYLE_DESCRIPTION /* 219 */:
                            return d4.ANALYTICS_OVERVIEW;
                        case RecyclerViewTypes.VIEW_TYPE_STORY_EDUCATION_BANNER /* 220 */:
                            return d4.SOCIAL_MANAGER;
                        default:
                            switch (i13) {
                                case 504:
                                    return d4.STORY_PIN_ADVANCED_SETTINGS;
                                case 505:
                                    return d4.REPORT_FLOW;
                                case 506:
                                    return d4.STORY_PIN_PAGE_DRAWING_TOOL;
                                case 507:
                                    return d4.UNLINK_ACCOUNT;
                                case 508:
                                    return d4.VTO_PRODUCT_TAGGING;
                                default:
                                    switch (i13) {
                                        case 527:
                                            return d4.MODAL_SEND;
                                        case 528:
                                            return d4.MODAL_MORE_DETAILS;
                                        case 529:
                                            return d4.MODAL_MORE_OPTIONS;
                                        default:
                                            switch (i13) {
                                                case 559:
                                                    return d4.COLLAGE_CONTENT_SHEET;
                                                case 560:
                                                    return d4.COLLAGE_EDITOR_CANVAS;
                                                case 561:
                                                    return d4.COLLAGE_CUTOUT_SELECTOR;
                                                case 562:
                                                    return d4.MULTI_FACTOR_AUTH_ENABLE;
                                                case 563:
                                                    return d4.MULTI_FACTOR_AUTH_DISABLE;
                                                case 564:
                                                    return d4.MULTI_FACTOR_AUTH_BACKUP;
                                                case 565:
                                                    return d4.MULTI_FACTOR_AUTH_LOGIN;
                                                default:
                                                    switch (i13) {
                                                        case 9:
                                                            return d4.LOGIN;
                                                        case 10:
                                                            return d4.REGISTRATION;
                                                        case 11:
                                                            return d4.BROWSER;
                                                        default:
                                                            switch (i13) {
                                                                case 13:
                                                                    return d4.ANDROID_WIDGET;
                                                                case 14:
                                                                    return d4.SPLASH;
                                                                case 15:
                                                                    return d4.CAMERA;
                                                                case 16:
                                                                    return d4.REPORT;
                                                                case 17:
                                                                    return d4.ERROR;
                                                                default:
                                                                    switch (i13) {
                                                                        case 90:
                                                                            return d4.PIN_CREATE_PINMARKLET;
                                                                        case 91:
                                                                            return d4.PIN_CREATE_REPIN;
                                                                        case 92:
                                                                            return d4.PIN_CREATE;
                                                                        default:
                                                                            switch (i13) {
                                                                                case RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL /* 118 */:
                                                                                    return d4.ACTION_PROMPT;
                                                                                case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL /* 119 */:
                                                                                    return d4.FLASHLIGHT_CAMERA;
                                                                                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL /* 120 */:
                                                                                    return d4.FLASHLIGHT_CAMERA_ROLL;
                                                                                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL /* 121 */:
                                                                                    return d4.FLASHLIGHT_CAMERA_ROLL_CLOSEUP;
                                                                                default:
                                                                                    switch (i13) {
                                                                                        case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO /* 171 */:
                                                                                            return d4.PIN_SWIPE_CONTAINER;
                                                                                        case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE /* 172 */:
                                                                                            return d4.INSIGHTS_AUDIENCE;
                                                                                        case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO /* 173 */:
                                                                                            return d4.PINCH_TO_ZOOM;
                                                                                        default:
                                                                                            return null;
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
        return d4.SETTINGS;
    }
}
