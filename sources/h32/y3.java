package h32;

import ads_mobile_sdk.wb;
import com.google.android.gms.ads.AdSize;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes2.dex */
public final class y3 {
    public static a4 a(int i13) {
        if (i13 == 0) {
            return a4.FEED_FOLLOWING;
        }
        if (i13 == 1) {
            return a4.FEED_FRIENDS;
        }
        if (i13 == 2) {
            return a4.FEED_EVERYTHING;
        }
        if (i13 == 3) {
            return a4.FEED_POPULAR;
        }
        if (i13 == 4) {
            return a4.FEED_SOURCE;
        }
        if (i13 == 5) {
            return a4.FEED_CATEGORY_ANIMALS;
        }
        if (i13 == 6) {
            return a4.FEED_CATEGORY_ARCHITECTURE;
        }
        if (i13 != 7) {
            if (i13 == 400) {
                return a4.FEED_CATEGORY;
            }
            if (i13 == 401) {
                return a4.FEED_CATEGORY_TOPIC;
            }
            if (i13 == 2101) {
                return a4.SERVICE_ENTRY_SOCIAL_FACEBOOK;
            }
            if (i13 == 2102) {
                return a4.SERVICE_ENTRY_SOCIAL_TWITTER;
            }
            switch (i13) {
                case 7:
                    break;
                case 8:
                    return a4.FEED_CATEGORY_CARS_MOTORCYCLES;
                case 9:
                    return a4.FEED_CATEGORY_CELEBRITIES;
                case 10:
                    return a4.FEED_CATEGORY_DESIGN;
                case 11:
                    return a4.FEED_CATEGORY_DIY_CRAFTS;
                case 12:
                    return a4.FEED_CATEGORY_EDUCATION;
                case 13:
                    return a4.FEED_CATEGORY_FILM_MUSIC_BOOKS;
                case 14:
                    return a4.FEED_CATEGORY_FOOD_DRINK;
                case 15:
                    return a4.FEED_CATEGORY_GARDENING;
                case 16:
                    return a4.FEED_CATEGORY_GEEK;
                case 17:
                    return a4.FEED_CATEGORY_HAIR_BEAUTY;
                case 18:
                    return a4.FEED_CATEGORY_HEALTH_FITNESS;
                case 19:
                    return a4.FEED_CATEGORY_HISTORY;
                case 20:
                    return a4.FEED_CATEGORY_HOLIDAYS_EVENTS;
                case 21:
                    return a4.FEED_CATEGORY_HOME_DECOR;
                case 22:
                    return a4.FEED_CATEGORY_HUMOR;
                case 23:
                    return a4.FEED_CATEGORY_ILLUSTRATIONS_POSTERS;
                case 24:
                    return a4.FEED_CATEGORY_KIDS;
                case 25:
                    return a4.FEED_CATEGORY_MENS_FASHION;
                case 26:
                    return a4.FEED_CATEGORY_OUTDOORS;
                case 27:
                    return a4.FEED_CATEGORY_PHOTOGRAPHY;
                case 28:
                    return a4.FEED_CATEGORY_PRODUCTS;
                case 29:
                    return a4.FEED_CATEGORY_QUOTES;
                case 30:
                    return a4.FEED_CATEGORY_SCIENCE_NATURE;
                case 31:
                    return a4.FEED_CATEGORY_SPORTS;
                case 32:
                    return a4.FEED_CATEGORY_TATTOOS;
                case 33:
                    return a4.FEED_CATEGORY_TECHNOLOGY;
                case 34:
                    return a4.FEED_CATEGORY_TRAVEL;
                case 35:
                    return a4.FEED_CATEGORY_WEDDINGS;
                case 36:
                    return a4.FEED_CATEGORY_WOMENS_FASHION;
                case 37:
                    return a4.FEED_GIFTS_20;
                case 38:
                    return a4.FEED_GIFTS_20_50;
                case 39:
                    return a4.FEED_GIFTS_50_100;
                case 40:
                    return a4.FEED_GIFTS_100_200;
                case 41:
                    return a4.FEED_GIFTS_200_500;
                case 42:
                    return a4.FEED_GIFTS_500;
                case 43:
                    return a4.SEARCH_PINS;
                case 44:
                    return a4.SEARCH_BOARDS;
                case 45:
                    return a4.SEARCH_USERS;
                case 46:
                    return a4.REGISTRATION_LANDING;
                case 47:
                    return a4.REGISTRATION_SIGNUP;
                case 48:
                    return a4.REGISTRATION_BOARDS;
                case 49:
                    return a4.USER_BOARDS;
                case 50:
                    return a4.USER_FOLLOWERS;
                case 51:
                    return a4.USER_FOLLOWING;
                case 52:
                    return a4.USER_LIKES;
                case 53:
                    return a4.USER_ACTIVITY;
                case 54:
                    return a4.BOARD_FOLLOWERS;
                case 55:
                    return a4.BOARD_SETTINGS;
                case 56:
                    return a4.FRIEND_INVITER_EMAIL;
                case 57:
                    return a4.FRIEND_INVITER_FACEBOOK;
                case 58:
                    return a4.FRIEND_INVITER_GMAIL;
                case 59:
                    return a4.FRIEND_INVITER_YAHOO;
                case 60:
                    return a4.ABOUT_TERMS;
                case 61:
                    return a4.ABOUT_SUPPORT;
                case 62:
                    return a4.ABOUT_BOOKMARKLET;
                case 63:
                    return a4.LOGIN_EMAIL;
                case 64:
                    return a4.LOGIN_FACEBOOK;
                case 65:
                    return a4.LOGIN_TWITTER;
                case 66:
                    return a4.ERROR_NO_INTERNET;
                case 67:
                    return a4.ERROR_NO_PIN;
                case 68:
                    return a4.ERROR_NO_BOARD;
                case 69:
                    return a4.ERROR_NO_USER;
                case 70:
                    return a4.ERROR_NO_ACTIVITY;
                case 71:
                    return a4.REPORT_PIN;
                case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE /* 172 */:
                    return a4.ORIENTATION_INTEREST_PICKER;
                case RecyclerViewTypes.VIEW_TYPE_USER /* 195 */:
                    return a4.BROWSER;
                case 1900:
                    return a4.EXTERNAL_SOURCE_OTHER;
                case 2120:
                    return a4.SERVICE_ENTRY_EXTERNAL_SHARE;
                case 2121:
                    return a4.SERVICE_ENTRY_BOARD_INVITE;
                case 2122:
                    return a4.SERVICE_ENTRY_COMMUNITY_INVITE;
                case 2150:
                    return a4.SERVICE_ENTRY_WEB_UNKNOWN;
                case 2167:
                    return a4.SERVICE_ENTRY_PAID_OTHER;
                case 2168:
                    return a4.SERVICE_ENTRY_PAID_INSTALL;
                case 2169:
                    return a4.SERVICE_ENTRY_PAID_PRELOAD;
                case 2170:
                    return a4.SERVICE_ENTRY_PAID_WEB;
                case 2171:
                    return a4.SERVICE_ENTRY_PAID_DEEPLINK_DIRECT;
                case 2172:
                    return a4.SERVICE_ENTRY_PAID_DEEPLINK_MMP;
                case 2173:
                    return a4.SERVICE_ENTRY_PAID_DEFERRED_DEEPLINK;
                case 2401:
                    return a4.PINVITATIONAL_UNAUTH_EMAIL;
                case 2402:
                    return a4.PINVITATIONAL_UNAUTH_CONFIRM;
                case 2403:
                    return a4.PINVITATIONAL_AUTH_CONFIRM;
                case 2404:
                    return a4.PINVITATIONAL_SIGNUP_REDEMPTION;
                case 2405:
                    return a4.PINVITATIONAL_HOME_FEED_MODAL;
                case 2406:
                    return a4.PINVITATIONAL_PIN_SUMMARY;
                case 2500:
                    return a4.SHARE_EXTENSION;
                case 2510:
                    return a4.EXTENSION_UPSELL_TOAST;
                case 2511:
                    return a4.EXTENSION_UPSELL_MODAL;
                case 2512:
                    return a4.EXTENSION_UPSELL_NUX;
                case 2513:
                    return a4.EXTENSION_INSTALLED;
                case 2514:
                    return a4.EXTENSION_NOT_INSTALLED;
                case 2515:
                    return a4.EXTENSION_UPSELL_NAG;
                case 2516:
                    return a4.EXTENSION_UPSELL_NAG_PIN_CREATE;
                case 2601:
                    return a4.FIND_FRIENDS_ADDRESS_BOOK;
                case 2602:
                    return a4.FIND_FRIENDS_FACEBOOK;
                case 2603:
                    return a4.FIND_FRIENDS_TWITTER;
                case 2604:
                    return a4.FIND_FRIENDS_MORE;
                case 2605:
                    return a4.FIND_FRIENDS_INVITE_ALL;
                case 2701:
                    return a4.HOMEFEED_BUILDER;
                case 2702:
                    return a4.HOMEFEED_BUILDER_SPLASH;
                case 2703:
                    return a4.HOMEFEED_BUILDER_MY_TOPICS;
                case 2704:
                    return a4.HOMEFEED_BUILDER_MY_BOARDS;
                case 2705:
                    return a4.HOMEFEED_BUILDER_MY_USERS;
                case 2706:
                    return a4.HOMEFEED_BUILDER_REC_TOPICS;
                case 2707:
                    return a4.HOMEFEED_BUILDER_REC_BOARDS;
                case 2708:
                    return a4.HOMEFEED_BUILDER_REC_USERS;
                case 2900:
                    return a4.PUSH_NOTIFICATION_CONVERSATION;
                case 2901:
                    return a4.PUSH_NOTIFICATION_ACTION;
                case 2902:
                    return a4.PUSH_NOTIFICATION_SYSTEM_NEWS;
                case 2903:
                    return a4.PUSH_NOTIFICATION_INTERACTION;
                case 2904:
                    return a4.PUSH_NOTIFICATION_FRIEND_NEWS;
                case 2905:
                    return a4.PUSH_NOTIFICATION_EDITORIAL;
                case 2906:
                    return a4.PUSH_NOTIFICATION_UNKNOWN;
                case 2907:
                    return a4.NOTIFICATION_PERMISSIONS_CHANGE;
                case 3050:
                    return a4.PIN_FLASHLIGHT_RESULTS;
                case 3051:
                    return a4.FEED_SHOP_SPACE;
                case 3052:
                    return a4.FEED_TODAYS_PICKS;
                case 3053:
                    return a4.FEED_BUYABLE_CATEGORY;
                case 3054:
                    return a4.FEED_TOP_SHOPS;
                case 3055:
                    return a4.CONFIRM_WEBSITE_BY_NAG;
                case 3056:
                    return a4.BUYABLE_SELECT_QUANTITY;
                case 3057:
                    return a4.FEED_ALL_SHOPS;
                case 3058:
                    return a4.BOARD_ADD_COLLABORATORS_TRAY;
                case 3059:
                    return a4.BOARD_ADD_COLLABORATORS;
                case 3060:
                    return a4.FEED_COMMERCE_MERCHANT_PAGE;
                case 3061:
                    return a4.FEED_COMMERCE_MERCHANT_SEARCH;
                case 3062:
                    return a4.EXPLORE_STORY;
                case 3063:
                    return a4.FEED_RELATED_PIN;
                case 3064:
                    return a4.FLASHLIGHT_CAMERA_RESULTS;
                case 3065:
                    return a4.BUYABLE_BAG_LIST;
                case 3066:
                    return a4.BUYABLE_BAG_DETAIL;
                case 3067:
                    return a4.BUYABLE_CHECKOUT_MULTI_SUMMARY;
                case 3068:
                    return a4.BUYABLE_SIMPLIFIED_CLOSEUP;
                case 3069:
                    return a4.BOARD_SELF;
                case 3070:
                    return a4.BOARD_OTHERS;
                case 3071:
                    return a4.USER_DID_IT;
                case 3072:
                    return a4.HOMEFEED_BUILDER_MY_PINS;
                case 3073:
                    return a4.EXPLORE;
                case 3074:
                    return a4.EXPLORE_SECTION_PICKER;
                case 3075:
                    return a4.EXPLORE_ARTICLE;
                case 3076:
                    return a4.BOARD_PLUS_MODAL_HALF;
                case 3077:
                    return a4.BOARD_PLUS_MODAL_FULL;
                case 3078:
                    return a4.BOARD_BOTTOM_OF_BOARD_FULL;
                case 3079:
                    return a4.BOARD_BOTTOM_OF_BOARD_PEEK;
                case 3080:
                    return a4.USER_FOLLOWED_USERS;
                case 3081:
                    return a4.NEWS_HUB_FEED;
                case 3082:
                    return a4.NEWS_HUB_DETAIL;
                case 3083:
                    return a4.NEWS_HUB_EMPTY_STATE;
                case 3084:
                    return a4.CONVERSATION_CONTACT_REQUEST_INBOX;
                case 3085:
                    return a4.FEED_KLP;
                case 3086:
                    return a4.MODAL_CREATE_CAMPAIGN;
                case 3088:
                    return a4.ADVERTISING_TOS;
                case 3089:
                    return a4.BUYABLE_PRODUCT_VIEW;
                case 3090:
                    return a4.EXPLORE_VIDEO_ARTICLE;
                case 3091:
                    return a4.BUYABLE_EXPRESS_CHECKOUT_SHEET;
                case 3092:
                    return a4.BUYABLE_QUANTITY_SELECTION_SHEET;
                case 3093:
                    return a4.BUYABLE_SHOP_THE_LOOK;
                case 3094:
                    return a4.FLASHLIGHT_CAMERA_CAPTURE_READY;
                case 3095:
                    return a4.FLASHLIGHT_CAMERA_SEARCH_RESULTS;
                case 3096:
                    return a4.FLASHLIGHT_CAMERA_ANALYZING;
                case 3097:
                    return a4.INSTANT_ARTICLE;
                case 3098:
                    return a4.EXPLORE_KLP;
                case 3105:
                    return a4.FEED_PLP;
                case 3106:
                    return a4.USER_SELF;
                case 3107:
                    return a4.USER_OTHERS;
                case 3108:
                    return a4.FEED_BLP;
                case 3109:
                    return a4.INSTANT_CONTENT;
                case 3110:
                    return a4.DID_IT_CREATE;
                case 3111:
                    return a4.DID_IT_EDIT;
                case 3112:
                    return a4.EMAIL_SEND_DID_IT;
                case 3114:
                    return a4.SHOPPING_LIST_AGGREGATE;
                case 3115:
                    return a4.SHOPPING_LIST_BY_PIN;
                case 3116:
                    return a4.QUIZZES_RESULT_OUTPUT;
                case 3117:
                    return a4.QUIZZES_QUESTION;
                case 3118:
                    return a4.PIN_CLOSEUP_VISUAL_LINK_PRODUCT_LIST;
                case 3119:
                    return a4.PIN_CLOSEUP_VISUAL_LINK_FEED;
                case 3120:
                    return a4.ORIENTATION_GENDER_STEP;
                case 3122:
                    return a4.INSTANT_CONTENT_IN_APP_BROWSER;
                case 3123:
                    return a4.INSTANT_CONTENT_COOKING_LESSON;
                case 3124:
                    return a4.PIN_REMINDER_ADD_NEW;
                case 3125:
                    return a4.PIN_REMINDER_VIEW_EXISTING;
                case 3128:
                    return a4.PARTNER_CONVERT;
                case 3129:
                    return a4.PARTNER_SIGNUP;
                case 3130:
                    return a4.BOARD_SECTION_EDIT;
                case 3131:
                    return a4.BOARD_SECTION_SELECT_PINS;
                case 3132:
                    return a4.BOARD_SECTION_CREATE;
                case 3133:
                    return a4.BOARD_SECTION_PICKER;
                case 3135:
                    return a4.STORY_PIN_GAME;
                case 3136:
                    return a4.STORY_TOPIC_GAME;
                case 3137:
                    return a4.BUBBLE_HEADER;
                case 3138:
                    return a4.ORIENTATION_NOTIF_UPSELL;
                case 3139:
                    return a4.ORIENTATION_LOCALE_COUNTRY_STEP;
                case 3140:
                    return a4.ORIENTATION_COUNTRY_STEP;
                case 3141:
                    return a4.ORIENTATION_COUNTRY_PICKER_STEP;
                case 3143:
                    return a4.ORIENTATION_SINGLE_USE_CASE_SIGNAL_STATE;
                case 3144:
                    return a4.ORIENTATION_SINGLE_USE_CASE_SIGNAL_STEP;
                case 3145:
                    return a4.ORIENTATION_IS_MOBILE_NUX_PICKER;
                case 3146:
                    return a4.SIGNUP_EMAIL_STEP;
                case 3147:
                    return a4.SIGNUP_PASSWORD_STEP;
                case 3148:
                    return a4.SIGNUP_NAME_STEP;
                case 3149:
                    return a4.SIGNUP_AGE_STEP;
                case 3150:
                    return a4.SIGNUP_GENDER_STEP;
                case 3151:
                    return a4.SEARCH_HASHTAGS;
                case 3152:
                    return a4.SEARCH_BUBBLES;
                case 3153:
                    return a4.VISUAL_TAGS_CREATE;
                case 3154:
                    return a4.VISUAL_TAGS_EDIT;
                case 3155:
                    return a4.BOARD_SECTION_REORDER_SECTIONS;
                case 3156:
                    return a4.BOARD_SECTION_RECOMMENDED_PINS;
                case 3157:
                    return a4.CREATOR_RECOMMENDATIONS;
                case 3158:
                    return a4.ORIENTATION_EDUCATION_STEP;
                case 3159:
                    return a4.AMP_KLP_FEED;
                case 3160:
                    return a4.AMP_PIN_FEED;
                case 3161:
                    return a4.AMP_BOARD_FEED;
                case 3162:
                    return a4.COMMUNITY_POST_REPLIES;
                case 3163:
                    return a4.COMMUNITY_DETAIL;
                case 3164:
                    return a4.ORIENTATION_AGE_STEP;
                case 3166:
                    return a4.FEED_RELATED_PRODUCTS;
                case 3168:
                    return a4.OFF_PINTEREST;
                case 3169:
                    return a4.TASTE_REFINEMENT_INTRO;
                case 3170:
                    return a4.TASTE_REFINEMENT_INTERESTS_PICKER;
                case 3171:
                    return a4.TASTE_REFINEMENT_L1_L2_INTERESTS_PICKER;
                case 3172:
                    return a4.AMP_VIEWER;
                case 3173:
                    return a4.BOARD_IDEAS;
                case 3174:
                    return a4.BOARD_SECTION_IDEAS;
                case 3175:
                    return a4.GDPR_AGE_COLLECTION_STEP;
                case 3176:
                    return a4.GDPR_PARENTAL_EMAIL_COLLECTION_STEP;
                case 3177:
                    return a4.FEED_RELATED_PINS;
                case 3178:
                    return a4.AMP_PROFILE_FEED;
                case 3179:
                    return a4.BOARD_ACTIVITIES;
                case 3180:
                    return a4.SIGNUP_EMAIL_OR_PHONE_NUMBER_STEP;
                case 3181:
                    return a4.SIGNUP_EMAIL_SENT_FOR_LOGIN_STEP;
                case 3182:
                    return a4.COMMUNITY_INVITE;
                case 3183:
                    return a4.BOARD_IDEAS_DISCOVERY_FEED;
                case 3184:
                    return a4.REDISCOVERY_FEED;
                case 3185:
                    return a4.AMP_TOPIC_PAGE;
                case 3186:
                    return a4.WEB_TOPIC_PAGE;
                case 3187:
                    return a4.WEB_TOPIC_FEED;
                case 3188:
                    return a4.FLASHLIGHT_PINCH_TO_ZOOM;
                case 3189:
                    return a4.BOARD_ACTIVITIES_COMPOSER;
                case 3190:
                    return a4.COMMUNITY_COMPOSER;
                case 3191:
                    return a4.COMMUNITY_PEOPLE;
                case 3192:
                    return a4.COMMUNITY_BANNED;
                case 3193:
                    return a4.COMMUNITY_CREATE;
                case 3194:
                    return a4.COMMUNITY_EDIT;
                case 3197:
                    return a4.TOPIC_EDUCATION;
                case 3201:
                    return a4.SIGNUP_GOOGLE_ONE_TAP_MODAL;
                case 3202:
                    return a4.SIGNUP_GOOGLE_ONE_TAP_CONFIRMATION_DIALOG;
                case 3203:
                    return a4.SIGNUP_EMAIL_PASSWORD;
                case 3204:
                    return a4.SIGNUP_GPLUS;
                case 3205:
                    return a4.SIGNUP_FACEBOOK;
                case 3206:
                    return a4.BOARD_IDEAS_SHOPPING_FEED;
                case 3207:
                    return a4.LOGIN_PASSWORD_STEP;
                case 3208:
                    return a4.BOARD_IDEAS_SIMILAR_BOARDS_FEED;
                case 3209:
                    return a4.BOARD_IDEAS_PROFESSIONAL_SERVICES_FEED;
                case 3210:
                    return a4.USER_DECIDER;
                case 3211:
                    return a4.USER_OVERVIEW;
                case 3212:
                    return a4.BUSINESS_PROFILE;
                case 3213:
                    return a4.REORDER_BOARDS;
                case 3214:
                    return a4.REORDER_PINS;
                case 3215:
                    return a4.REORDER_SECTIONS;
                case 3216:
                    return a4.ORIENTATION_INTENT_TO_ADVERTISE;
                case 3217:
                    return a4.BOARD_IDEAS_BIRTHDAY_FEED;
                case 3218:
                    return a4.SOCIAL_MANAGER_UNREAD;
                case 3219:
                    return a4.SOCIAL_MANAGER_READ;
                case 3220:
                    return a4.USER_SCHEDULED_PINS;
                case 3221:
                    return a4.FEED_RELATED_SHOPPABLE_CONTENTS;
                case 3222:
                    return a4.GRID_EDUCATION_STORY;
                case 3223:
                    return a4.SIGNUP_NAME_AGE_STEP;
                case 3226:
                    return a4.EXTENSION_UPSELL_CLOSEUP;
                case 3227:
                    return a4.BOARD_MERGE;
                case 3228:
                    return a4.STORY_PIN_CREATE;
                case 3229:
                    return a4.STORY_PIN_AD_PAGE_CREATE;
                case 3230:
                    return a4.STORY_PIN_COVER_PAGE_CREATE;
                case 3231:
                    return a4.STORY_PIN_MEDIA_PAGE_CREATE;
                case 3232:
                    return a4.STORY_PIN_TEXT_PAGE_CREATE;
                case 3233:
                    return a4.BOARD_SELECT_PINS;
                case 3234:
                    return a4.COMMUNITY_AGGREGATED;
                case 3235:
                    return a4.COMMUNITY_DIRECTORY;
                case 3236:
                    return a4.FEED_RELATED_RECIPES;
                case 3237:
                    return a4.SOMETHING_WENT_WRONG;
                case 3238:
                    return a4.ORIENTATION_CREATOR_PICKER;
                case 3239:
                    return a4.SIMILAR_PINS_GRID;
                case 3240:
                    return a4.USER_STORY_PINS;
                case 3242:
                    return a4.FIRST_AD_CREATE_PAGE;
                case 3243:
                    return a4.FEED_RELATED_VIDEOS;
                case 3244:
                    return a4.FEED_BRAND_CATALOG;
                case 3245:
                    return a4.CAMERA_MEDIA_CREATE;
                case 3253:
                    return a4.CREATOR_RELATED_PINS_GRID;
                case 3254:
                    return a4.FEED_VIDEO_STORY;
                case 3255:
                    return a4.PINTEREST_CREATE_CAMERA;
                case 3256:
                    return a4.PINTEREST_CREATE_TEXT;
                case 3257:
                    return a4.ADS_AGE_AND_GENDER;
                case 3258:
                    return a4.ADS_BILLING_INFO;
                case 3259:
                    return a4.ADS_BUSINESS_SETTINGS;
                case 3260:
                    return a4.ADS_CHOOSE_PIN_TO_PROMOTE;
                case 3261:
                    return a4.ADS_CREATE_AD_SUCCESS;
                case 3262:
                    return a4.ADS_DURATION_AND_BUDGET;
                case 3263:
                    return a4.ADS_INTERESTS;
                case 3264:
                    return a4.ADS_LOCATIONS;
                case 3265:
                    return a4.ADS_NOTIFICATIONS;
                case 3266:
                    return a4.ADS_REVIEW_YOUR_AD;
                case 3267:
                    return a4.ADS_TARGETING;
                case 3268:
                    return a4.ADS_UPDATE_BILLING;
                case 3269:
                    return a4.ADS_TERMS_OF_SERVICES;
                case 3270:
                    return a4.FIRST_PIN_CREATE_PAGE;
                case 3271:
                    return a4.SIGNUP_EMAIL_PASSWORD_STEP;
                case 3272:
                    return a4.USER_VIDEO_PINS;
                case 3273:
                    return a4.FEED_COMPLETE_THIS_LOOK;
                case 3276:
                    return a4.ADS_KEYWORDS;
                case 3277:
                    return a4.FEED_PRODUCT_GROUP;
                case 3278:
                    return a4.FEED_BUSINESS_PROFILE_PICKS_FOR_YOU;
                case 3279:
                    return a4.STORY_PIN_EDIT;
                case 3280:
                    return a4.SIGNUP_WEBSITE_STEP;
                case 3281:
                    return a4.FEED_BOARD_SHOPPING_PACKAGE;
                case 3282:
                    return a4.FEED_BUBBLE_SHOPPING_PACKAGE;
                case 3283:
                    return a4.FEED_BRAND_SHOPPING_PACKAGE;
                case 3289:
                    return a4.ORIENTATION_FIRST_AD_UPSELL_STEP;
                case 3290:
                    return a4.HOMEFEED_CONTROL_ACTIVITY;
                case 3291:
                    return a4.HOMEFEED_CONTROL_BOARDS;
                case 3292:
                    return a4.HOMEFEED_CONTROL_INTERESTS;
                case 3293:
                    return a4.HOMEFEED_CONTROL_TOPICS;
                case 3294:
                    return a4.STORY_PIN_MULTI_PHOTO_PICKER;
                case 3295:
                    return a4.NAVIGATION_UNAUTH_FOLLOWING;
                case 3296:
                    return a4.NAVIGATION_UNAUTH_NOTIFICATION;
                case 3297:
                    return a4.NAVIGATION_UNAUTH_SAVED;
                case 3298:
                    return a4.MWEB_NUX_CHECKLIST_CLOSEUP;
                case 3299:
                    return a4.MWEB_NUX_CHECKLIST_SAVE;
                case 3300:
                    return a4.ORIENTATION_BUSINESS_NAME;
                case 3301:
                    return a4.ORIENTATION_BUSINESS_TYPE;
                case 3303:
                    return a4.SHOPPING_BRAND_FILTER_MODAL;
                case 3304:
                    return a4.SHOPPING_PRICE_FILTER_MODAL;
                case 3305:
                    return a4.ORIENTATION_LOCALE_STEP;
                case 3306:
                    return a4.SEARCH_VIDEOS;
                case 3307:
                    return a4.WINDOWS_PWA_UPSELL;
                case 3308:
                    return a4.FEED_RELATED_DIY;
                case 3309:
                    return a4.BRAND_SURVEY_LEGACY;
                case 3310:
                    return a4.BRAND_SURVEY_EXPRESS;
                case 3311:
                    return a4.AD_CREDITS_OFFER;
                case 3312:
                    return a4.PIN_REACTION_USERS;
                case 3313:
                    return a4.USER_STOREFRONT;
                case 3314:
                    return a4.USER_COMMUNITY;
                case 3315:
                    return a4.ONBOARDING_SHARE_IDEAS;
                case 3316:
                    return a4.ONBOARDING_GROW_AUDIENCE;
                case 3317:
                    return a4.ONBOARDING_BUILD_PROFILE;
                case 3318:
                    return a4.ONBOARDING_COMPLETE_SCREEN;
                case 3319:
                    return a4.NEW_USE_CASE_FEED;
                case 3320:
                    return a4.AD_PREVIEW_FEED;
                case 3321:
                    return a4.HOMEFEED_RELEVANCE_MULTIPIN;
                case 3322:
                    return a4.BOARD_SEARCH_CREATE_UPSELL_PIN_PICKER;
                case 3331:
                    return a4.BUSINESS_ACCOUNT_LOGIN;
                case 3332:
                    return a4.BUSINESS_ACCOUNT_SWITCHER;
                case 3333:
                    return a4.LINKED_BUSINESS_ACCOUNT_CREATE;
                case 3334:
                    return a4.VISUAL_SEARCH_PRODUCT_FEED;
                case 3335:
                    return a4.HOMEFEED_PIN_QUIZ_SELECTION;
                case 3336:
                    return a4.HOMEFEED_PIN_QUIZ_RATING;
                case 3337:
                    return a4.HOMEFEED_NUX_MULTIPIN;
                case 3338:
                    return a4.FEED_PB_RECOMMENDED_SEARCH;
                case 3339:
                    return a4.FEED_PB_SALE;
                case 3340:
                    return a4.FEED_PB_NEW_ARRIVALS;
                case 3341:
                    return a4.FEED_PB_BUBBLE;
                case 3342:
                    return a4.FEED_PB_BOARD;
                case 3343:
                    return a4.FEED_PB_BRAND;
                case 3344:
                    return a4.PERSONAL_BOUTIQUE;
                case 3345:
                    return a4.PERSONAL_BOUTIQUE_BRAND_DISCOVERY;
                case 3346:
                    return a4.PERSONAL_BOUTIQUE_BRAND_INSPO_GROUPS;
                case 3347:
                    return a4.FEED_PB_INSPO;
                case 3348:
                    return a4.FEED_STL_MODULE;
                case 3349:
                    return a4.FEED_CREATOR_SPOTLIGHT;
                case 3351:
                    return a4.PWA_CHROME;
                case 3352:
                    return a4.PWA_SAFARI;
                case 3353:
                    return a4.PWA_UNKNOWN;
                case 3354:
                    return a4.PWA_TWA_TWA;
                case 3355:
                    return a4.PWA_TWA_CCT;
                case 3356:
                    return a4.PWA_TWA_BROWSER;
                case 3357:
                    return a4.PWA_TWA_WEBVIEW;
                case 3358:
                    return a4.HOMEFEED_CONTROL_QUIZ;
                case 3359:
                    return a4.LITE_TWA_UPSELL;
                case 3360:
                    return a4.STORY_PIN_INGREDIENTS_PAGE_CREATE;
                case 3361:
                    return a4.STORY_PIN_SUPPLIES_PAGE_CREATE;
                case 3362:
                    return a4.SHOPPING_BRAND_AFFINITY_DISCOVERY;
                case 3363:
                    return a4.ONBOARDING_COPY_BOARD;
                case 3364:
                    return a4.SIGNUP_AGE_GENDER_STEP;
                case 3366:
                    return a4.EXPLORE_TAB;
                case 3369:
                    return a4.FEED_REVERSE_STELA;
                case 3370:
                    return a4.ORIENTATION_SALES_CONTACT;
                case 3372:
                    return a4.TODAY_TAB;
                case 3373:
                    return a4.PIN_SHOPPING_RESULTS;
                case 3374:
                    return a4.FEED_MORE_FROM_CREATOR;
                case 3375:
                    return a4.TODAY_ARTICLE_FEED;
                case 3376:
                    return a4.SIGNUP_BUSINESS_WEBSITE;
                case 3377:
                    return a4.SIGNUP_BUSINESS_INTENT_TO_ADVERTISE;
                case 3378:
                    return a4.SIGNUP_BUSINESS_SALES_CONTACT;
                case 3380:
                    return a4.FEED_BOARD_SHOP;
                case 3381:
                    return a4.FEED_BOARD_SHOP_SAVED_ITEMS;
                case 3382:
                    return a4.FEED_BOARD_SHOP_TAB;
                case 3383:
                    return a4.PINTEREST_TAG_INSTALL_GTM;
                case 3384:
                    return a4.PINTEREST_TAG_INSTALL_SHOPIFY;
                case 3385:
                    return a4.PINTEREST_TAG_INSTALL_WOOCOMMERCE;
                case 3386:
                    return a4.PINTEREST_TAG_INSTALL_PIXELYOURSITE_WOOCOMMERCE;
                case 3387:
                    return a4.PINTEREST_TAG_INSTALL_PIXELYOURSITE_WORDPRESS;
                case 3388:
                    return a4.PINTEREST_TAG_INSTALL_WEEBLY;
                case 3389:
                    return a4.PINTEREST_TAG_INSTALL_ECWID;
                case 3390:
                    return a4.PINTEREST_TAG_INSTALL_APPTRAIN_MAGENTO;
                case 3391:
                    return a4.PINTEREST_TAG_INSTALL_PREMMERCE;
                case 3392:
                    return a4.PINTEREST_TAG_INSTALL_BIGCOMMERCE;
                case 3393:
                    return a4.PINTEREST_TAG_INSTALL_TEALIUM;
                case 3394:
                    return a4.PINTEREST_TAG_INSTALL_SQUARESPACE;
                case 3395:
                    return a4.USECASE_QUIZ;
                case 3396:
                    return a4.SHOPPING_PRODUCT_FILTER;
                case 3406:
                    return a4.SIGNUP_BUSINESS_TYPE;
                case 3407:
                    return a4.ORIENTATION_INTEREST_REFINEMENT_CATEGORIES;
                case 3408:
                    return a4.ORIENTATION_INTEREST_REFINEMENT_TOPICS;
                case 3409:
                    return a4.DATE_SELECTOR_ADD;
                case 3410:
                    return a4.DATE_SELECTOR_UPDATE;
                case 3414:
                    return a4.SEARCH_STYLE_CONTENT;
                case 3415:
                    return a4.FEED_ALL_STYLES;
                case 3450:
                    return a4.FEED_IDEA_STREAMS;
                case 3451:
                    return a4.STORY_PIN_RESPONSES_GALLERY_SELF;
                case 3452:
                    return a4.STORY_PIN_RESPONSES_GALLERY_OTHERS;
                case 3453:
                    return a4.STORY_PIN_RESPONSE_SELF;
                case 3454:
                    return a4.STORY_PIN_RESPONSE_OTHERS;
                case 3455:
                    return a4.SHOPPING_RELATED_PRODUCTS_FEED;
                case 3456:
                    return a4.SHOPPING_STELA_PRODUCTS_FEED;
                case 3457:
                    return a4.BOARD_NOTE_SELECT_PINS;
                case 3458:
                    return a4.PINTEREST_TAG_VERIFY;
                case 3459:
                    return a4.PINTEREST_TAG_INSTALL_GTM_EVENTS;
                case 3460:
                    return a4.BOARD_SECTION_TEMPLATE_PICKER;
                case 3461:
                    return a4.BOARD_SECTION_TEMPLATE_PIN_PICKER;
                case 3462:
                    return a4.SHOPPING_DOT_FEED;
                case 3463:
                    return a4.ADS_GUIDANCE_RECOMMENDATIONS_FEED;
                case 3464:
                    return a4.ADS_GUIDANCE_RECOMMENDATIONS_DETAIL;
                case 3465:
                    return a4.ADS_GUIDANCE_NOTIFICATIONS_FEED;
                case 3466:
                    return a4.ACTION_EXTENSION;
                case 3467:
                    return a4.SEARCH_TAB;
                case 3468:
                    return a4.FEED_BOARD_SHOP_CATEGORY;
                case 3469:
                    return a4.LINKED_BUSINESS_ACCOUNT_CONFIRMATION_MODAL;
                case 3470:
                    return a4.PRODUCT_DETAIL_PAGE_FEED;
                case 3472:
                    return a4.BOARD_PERMISSION_SETTINGS;
                case 3473:
                    return a4.MESSAGE_EXTENSION;
                case 3474:
                    return a4.FEED_VIDEO;
                case 3475:
                    return a4.IDEAS_HUB_PAGE;
                case 3480:
                    return a4.PUSH_NOTIFICATION_AGGREGATED_COMMENT;
                case 3481:
                    return a4.FEED_CREATOR_BUBBLE;
                case 3482:
                    return a4.FEED_POPULAR_TAB;
                case 3483:
                    return a4.GROUP_YOUR_PINS_PIN_PICKER;
                case 3508:
                    return a4.BOARD_NOTE_FEED;
                case 3509:
                    return a4.PINTEREST_TAG_INSTALL_MANUAL;
                case 3510:
                    return a4.AGGREGATED_COMMENTS;
                case 3511:
                    return a4.FEED_RELATED_USE_CASES;
                case 3517:
                    return a4.TODAY_INTEREST_FEED;
                case 3518:
                    return a4.FEED_RELATED_BROAD_INTEREST;
                case 3521:
                    return a4.SIGNUP_ACCOUNT_TYPE_STEP;
                case 3526:
                    return a4.ACCOUNT_CLOSE;
                case 3527:
                    return a4.ACCOUNT_DEACTIVATE;
                case 3531:
                    return a4.FEED_CREATOR_CLASSES;
                case 3532:
                    return a4.FEED_MY_CREATOR_CLASSES;
                case 3533:
                    return a4.FEED_UPCOMING_CREATOR_CLASSES;
                case 3535:
                    return a4.SIGNAL_COLLECTION_HOMEFEED_INTERESTS;
                case 3539:
                    return a4.FEED_RELATED_STORIES;
                case 3540:
                    return a4.PRODUCT_TAGGING_SEARCH_PRODUCT_FEED;
                case 3541:
                    return a4.BOARD_ORGANIZE_FEED;
                case 3542:
                    return a4.ORIENTATION_APP_UPSELL_STEP;
                case 3543:
                    return a4.WIDGET_EXTENSION_SELECT_BOARD;
                case 3544:
                    return a4.WIDGET_EXTENSION_SELECT_USER;
                case 3549:
                    return a4.STORY_PIN_LIST;
                case 3550:
                    return a4.FEED_WHATS_NEW;
                case 3553:
                    return a4.PIN_FAVORITE_USER_LIST;
                case 3554:
                    return a4.FEED_DISCOVER_CREATORS_PORTAL;
                case 3555:
                    return a4.HOMEFEED_CONTROL_PROFILES;
                case 3556:
                    return a4.SIGNUP_LINE;
                case 3557:
                    return a4.PRODUCT_TAGGING_URL;
                case 3558:
                    return a4.PRODUCT_TAGGING_IMAGE_PICKER;
                case 3559:
                    return a4.ADD_SECONDARY_ACCOUNT;
                case 3560:
                    return a4.ADD_PERSONAL_ACCOUNT;
                case 3561:
                    return a4.ADD_BUSINESS_ACCOUNT;
                case 3562:
                    return a4.FEED_DISCOVER_CREATORS_BUBBLE;
                case 3563:
                    return a4.FEED_WISHLIST;
                case 3564:
                    return a4.FEED_WISHLIST_RECENTLY_VIEWED;
                case 3565:
                    return a4.FEED_WISHLIST_CATEGORY;
                case 3566:
                    return a4.FEED_USER_PROFILE_STORY_PINS;
                case 3567:
                    return a4.DISCOVER_CREATORS_PICKER;
                case 3568:
                    return a4.CREATOR_BUBBLE_EDUCATION;
                case 3569:
                    return a4.FEED_RELATED_PRODUCTS_MOST_CONSIDERED;
                case 3570:
                    return a4.FEED_RELATED_PRODUCTS_PRICE_LIMIT;
                case 3571:
                    return a4.FEED_RELATED_PRODUCTS_COLLABORATIVE_FILTERING;
                case 3572:
                    return a4.FEED_CALL_TO_CREATE_PAGE;
                case 3573:
                    return a4.FEED_CALL_TO_CREATE_STREAM;
                case 3574:
                    return a4.LINE_EMAIL_COLLECT_STEP;
                case 3575:
                    return a4.SEARCH_STORY_LANDING_STRUCTURED_SECTION_MOST_POPULAR;
                case 3576:
                    return a4.SEARCH_STORY_LANDING_STRUCTURED_BUBBLE_Q2X;
                case 3577:
                    return a4.SEARCH_STORY_LANDING_PERSONALIZATION_USER_BRAND;
                case 3578:
                    return a4.SEARCH_STORY_LANDING_PERSONALIZATION_USER_COLOR;
                case 3579:
                    return a4.PROFILE_PINS_ORGANIZE;
                case 3581:
                    return a4.LIVE_SESSION_PIN_LIVE_PAGE;
                case 3582:
                    return a4.FEED_LIVE_SESSIONS;
                case 3583:
                    return a4.FEED_MY_LIVE_SESSIONS;
                case 3584:
                    return a4.LIVE_SESSION_PIN_CLOSEUP;
                case 3585:
                    return a4.USER_RECENTLY_VIEWED_PINS;
                case 3586:
                    return a4.USER_RECENTLY_SAVED_PINS;
                case 3587:
                    return a4.FEED_RELATED_PRODUCTS_COLLABORATIVE_FILTERING_CLICK;
                case 3588:
                    return a4.FEED_RELATED_PRODUCTS_COLLABORATIVE_FILTERING_PURCHASE;
                case 3589:
                    return a4.FEED_BOTTOM_NAV_BAR_IDEA_STREAM;
                case 3590:
                    return a4.FEED_STORY_PIN_CREATION_INSPIRATION;
                case 3591:
                    return a4.FEED_LIVE_SESSION_LIVESTREAM_PRODUCTS;
                case 3592:
                    return a4.FEED_LIVE_SESSION_LIVESTREAM_PARTICIPANTS;
                case 3593:
                    return a4.FEED_RELATED_PRODUCTS_SIMILAR_MERCHANT;
                case 3595:
                    return a4.REPORT_COMMENT;
                case 3596:
                    return a4.ORIENTATION_QR_CODE_APP_UPSELL;
                case 3597:
                    return a4.FEED_HOMEFEED_TAB_IDEA_STREAM;
                case 3598:
                    return a4.SEARCH_STORY_LANDING_PERSONALIZATION_USER_STYLE;
                case 3599:
                    return a4.PB_SUB_CATEOGIRES;
                case 3600:
                    return a4.PB_CATEGORIES_FEED;
                case 3601:
                    return a4.PB_BRANDS_STORY_FEED;
                case 3602:
                    return a4.PB_BROWSING_HISTORY_FEED;
                case 3603:
                    return a4.PB_BRANDS;
                case 3604:
                    return a4.PB_CATEGORIES;
                case 3605:
                    return a4.COMMUNITY_CREATION_PAGE;
                case 3606:
                    return a4.TRENDING_CTC_STREAM;
                case 3607:
                    return a4.FEATURED_PLUS_TRENDING_CTC_STREAM;
                case 3608:
                    return a4.RECENT_CTC_STREAM;
                case 3609:
                    return a4.FEED_RELATED_PRODUCTS_SIMILAR_DOMAIN;
                case 3610:
                    return a4.FEED_NOTIFICATION_CREATOR_BUBBLE;
                case 3611:
                    return a4.LIVE_SESSION_PIN_DETAILS_DRAWER;
                case 3612:
                    return a4.VTO_PRODUCT_TAGGING_PRODUCT_FEED;
                case 3613:
                    return a4.VTO_PRODUCT_TAGGING_PREVIEW_CAMERA_PERMISSIONS_REQUESTED;
                case 3614:
                    return a4.PINTEREST_TAG_MANUAL_MODAL;
                case 3615:
                    return a4.PINTEREST_TAG_PARTNER_MODAL;
                case 3616:
                    return a4.UNLINK_ACCOUNT_SEND_EMAIL;
                case 3617:
                    return a4.SEARCH_STORY_LANDING_PERSONALIZATION_USER_STYLE_IDEA_PIN_STREAM;
                case 3618:
                    return a4.SEARCH_IDEA_PIN_STREAM;
                case 3619:
                    return a4.VTO_PRODUCT_TAGGING_PREVIEW_CAMERA_PERMISSIONS_GRANTED;
                case 3620:
                    return a4.CREATOR_ACTIVATION_IDEA_PIN_UPSELL_SWIPE_MODAL;
                case 3621:
                    return a4.CREATOR_ACTIVATION_IDEA_PIN_UPSELL_ALERT;
                case 3622:
                    return a4.CREATOR_ACTIVATION_IDEA_PIN_UPSELL_HALF_SHEET;
                case 3623:
                    return a4.FEED_IDEA_STREAM_WATCH;
                case 3624:
                    return a4.FEED_IDEA_STREAM_WATCH_CLOSEUP;
                case 3625:
                    return a4.FEED_RELATED_PRODUCTS_COLLABORATIVE_FILTERING_FREQUENTLY_BOUGHT_TOGETHER;
                case 3626:
                    return a4.FEED_RELATED_PIVOT_CREATOR_STORIES;
                case 3627:
                    return a4.FEED_RELATED_PIVOT_STORIES;
                case 3632:
                    return a4.PIN_FEEDBACK_MODAL;
                case 3633:
                    return a4.FEED_IDEA_PIN_STELA_PRODUCTS;
                case 3639:
                    return a4.CREATOR_HUB_TOOLS;
                case 3640:
                    return a4.CREATOR_HUB_PERFORMANCE;
                case 3641:
                    return a4.CREATOR_HUB_NEWS;
                case 3642:
                    return a4.CREATOR_HUB_PINS;
                case 3643:
                    return a4.FEED_RELATED_PIVOTS;
                case 3644:
                    return a4.FEED_HIGHLIGHTED_TAKES_STREAM;
                case 3645:
                    return a4.LIVE_SESSION_PIN_PRE_LIVE;
                case 3646:
                    return a4.LIVE_SESSION_PIN_LIVE;
                case 3647:
                    return a4.LIVE_SESSION_PIN_POST_LIVE;
                case 3649:
                    return a4.CREATION_INSPIRATION_INTEREST_LIST;
                case 3650:
                    return a4.CREATION_INSPIRATION_INTEREST_DETAIL_PAGE;
                case 3651:
                    return a4.CREATION_INSPIRATION_IDEA_PAGE;
                case 3652:
                    return a4.FEED_CALL_TO_CREATE_PREVIEW;
                case 3669:
                    return a4.ACCOUNT_SETTINGS;
                case 3671:
                    return a4.LIVE_SESSION_PIN_UNKNOWN;
                case 3683:
                    return a4.ITEM_REP_SECTION_DEFAULT_VIEW_PARAMETER_TYPE;
                case 3684:
                    return a4.STRUCTURED_FEED_DEFAULT_VIEW_PARAMETER_TYPE;
                case 3685:
                    return a4.AR_SCENE_TRY_ON;
                case 3686:
                    return a4.PERSONAL_BOUTIQUE_SEARCH;
                case 3687:
                    return a4.FEED_RELATED_PIVOT_TOPIC_STORIES;
                case 3688:
                    return a4.PERSONAL_BOUTIQUE_SEARCH_AUTOCOMPLETE;
                case 3689:
                    return a4.BOARDS_CONTROLS;
                case 3690:
                    return a4.PROFILE_HIGHLIGHT_SELECT_PINS;
                case 3691:
                    return a4.PROFILE_HIGHLIGHT_EDIT_TITLE;
                case 3692:
                    return a4.USER_SIGNAL_NAME;
                case 3693:
                    return a4.USER_SIGNAL_AGE;
                case 3694:
                    return a4.USER_SIGNAL_GENDER;
                case 3695:
                    return a4.FEED_USER_PROFILE_HIGHLIGHT_PINS;
                case 3696:
                    return a4.CHALLENGE_STREAM;
                case 3698:
                    return a4.USER_SIGNAL_PROMPT;
                case 3701:
                    return a4.PERSONAL_BOUTIQUE_MERCHANT_TUNER;
                case 3702:
                    return a4.PERSONAL_BOUTIQUE_ONBOARDING_INTERESTS;
                case 3703:
                    return a4.PERSONAL_BOUTIQUE_ONBOARDING_MERCHANTS;
                case 3705:
                    return a4.PERSONAL_INFORMATION_SETTINGS;
                case 3706:
                    return a4.CLAIMED_ACCOUNTS_SETTINGS;
                case 3707:
                    return a4.PRIVACY_AND_DATA_SETTINGS;
                case 3708:
                    return a4.SECURITY_AND_LOGINS_SETTINGS;
                case 3709:
                    return a4.PERMISSIONS_SETTINGS;
                case 3710:
                    return a4.IDEA_PIN_OOTD_CREATION;
                case 3711:
                    return a4.PB_MERCHANT_FOLLOWING_HISTORY_FEED;
                case 3712:
                    return a4.PINTEREST_TAG_INSTALL_SETUP_FLOW;
                case 3713:
                    return a4.INTEREST_BREADCRUMBS;
                case 3715:
                    return a4.LIVE_SESSION_LIVESTREAM_PRODUCT_BROWSER;
                case 3716:
                    return a4.LIVE_SESSION_REPLAY_PRODUCT_BROWSER;
                case 3717:
                    return a4.LIVE_SESSION_PRE_LIVE_CREATOR_PROFILE;
                case 3718:
                    return a4.LIVE_SESSION_LIVESTREAM_CREATOR_PROFILE;
                case 3719:
                    return a4.LIVE_SESSION_REPLAY_CREATOR_PROFILE;
                case 3720:
                    return a4.FEED_LIVE_SESSION_PIN_DRAWER;
                case 3721:
                    return a4.FEED_LIVE_SESSION_PLANNED_ATTENDEES;
                case 3722:
                    return a4.FEED_RELATED_PORTAL_CREATOR_STORIES;
                case 3723:
                    return a4.FEED_LIVE_SESSION_LIVESTREAM_COMMENTS;
                case 3724:
                    return a4.FEED_LIVE_SESSION_REPLAY_PRODUCTS;
                case 3725:
                    return a4.PINTEREST_TAG_INSTALL_MODAL;
                case 3726:
                    return a4.PINTEREST_TAG_INSTALL_GET_STARTED_SETUP_FLOW;
                case 3727:
                    return a4.PINTEREST_TAG_INSTALL_GET_STARTED_MODAL;
                case 3728:
                    return a4.FEED_LIVE_SESSION_PAST_SESSION_VIEWERS;
                case 3729:
                    return a4.CONFIRM_PASSWORD;
                case 3730:
                    return a4.PHONE_NUMBER;
                case 3731:
                    return a4.VERIFICATION_CODE;
                case 3732:
                    return a4.BACKUP_CODE;
                case 3733:
                    return a4.PERSONAL_BOUTIQUE_HEADER;
                case 3735:
                    return a4.FEED_LOCATION_TAGGED_PINS;
                case 3736:
                    return a4.LOCATION_TAGGED_PIN_STREAM;
                case 3737:
                    return a4.SIGNUP_BIRTHDAY_STEP;
                case 3739:
                    return a4.FEED_NFT_WALLET;
                case 3740:
                    return a4.FEED_NFT_COLLECTION;
                case 3741:
                    return a4.IDEA_PIN_EDUCATION;
                case 3742:
                    return a4.IDEA_PINEDUCATION_VIEW_PAGER;
                case 3743:
                    return a4.FEED_TV_CATEGORY_PINS;
                case 3744:
                    return a4.ONE_TAP_RECOMMENDATIONS_WIDGET;
                case 3745:
                    return a4.USER_SIGNAL_BIRTHDAY;
                case 3746:
                    return a4.PINTEREST_TAG_PARTNER_INTEGRATION_LED_PARTNER_MODAL;
                case 3747:
                    return a4.YOUR_SHOP_ANCHOR_PRODUCT_FEED;
                case 3748:
                    return a4.PINTEREST_TAG_PARTNER_INTEGRATION_LED_PARTNER_CARD;
                case 3749:
                    return a4.PINTEREST_TAG_PARTNER_INTEGRATION_LED_MANUAL_SETUP;
                case 3750:
                    return a4.PINTEREST_TAG_PARTNER_INTEGRATION_LED_EMAIL_INSTRUCTIONS;
                case 3751:
                    return a4.PINTEREST_TAG_PARTNER_INTEGRATION_LED_NOT_ELIGIBLE;
                case 3752:
                    return a4.SEARCH_STORY_LANDING_SEARCH_FOR_YOU;
                case 3753:
                    return a4.CLOSEUP_GUIDED_SEARCH_MODULE;
                case 3754:
                    return a4.CLOSEUP_GUIDED_SEARCH_STORY;
                case 3756:
                    return a4.ADS_GUIDANCE_CONTEXTUAL_RECOMMENDATION;
                case 3757:
                    return a4.BRANDED_CONTENT_SETTINGS;
                case 3758:
                    return a4.YOUR_SHOP_STELA_FEED;
                case 3759:
                    return a4.YOUR_SHOP_MOST_POPULAR_FROM_FOLLOWED_MERCHANTS_FEED;
                case 3760:
                    return a4.YOUR_SHOP_MOST_POPULAR_FROM_POPULAR_MERCHANTS_FEED;
                case 3761:
                    return a4.TOPIC_PORTAL_FULL_FEED;
                case 3764:
                    return a4.STOREFRONT_SEARCH_AUTOCOMPLETE;
                case 3768:
                    return a4.VIDEOS_HUB_PAGE;
                case 3778:
                    return a4.AR_3D_PREVIEW;
                case 3779:
                    return a4.YOUR_SHOP_ON_SALE_FROM_BRANDS_YOU_FOLLOW;
                case 3780:
                    return a4.YOUR_SHOP_NEW_ARRIVALS_FROM_BRANDS_YOU_FOLLOW;
                case 3781:
                    return a4.SEARCH_BUYABLE_STOREFRONT;
                case 3782:
                    return a4.TOP_ADS_PAGE;
                case 3784:
                    return a4.BRANDED_CONTENT_PIN_FEED;
                case 3802:
                    return a4.ENFORCEMENT_MESSAGE;
                case 3806:
                    return a4.CONFIRM_EMAIL;
                case 3810:
                    return a4.HOMEFEED_CONTROL_FOLLOWING;
                case 3813:
                    return a4.FEED_LIVE_SESSION_REPLAY_COMMENTS;
                case 3814:
                    return a4.ENFORCEMENT_DISABLE_MESSAGE;
                case 3815:
                    return a4.DISABLE_MFA_EMPLOYER_MESSAGE;
                case 3816:
                    return a4.DISABLE_MFA_EMPLOYEE_MESSAGE;
                case 3827:
                    return a4.SEND_SHARE_SEARCH;
                case 3831:
                    return a4.FILTER_PANEL;
                case 3833:
                    return a4.SAVE_EDUCATION;
                case 3834:
                    return a4.PROFILE_EDUCATION;
                case 3835:
                    return a4.SEARCH_EDUCATION;
                case 3840:
                    return a4.LIVE_SHOPPING_BAG;
                case 3841:
                    return a4.LIVE_SHOPPING_CHECKOUT_BROWSER;
                case 3842:
                    return a4.FEED_HOMEFEED_TAB_INTEREST;
                case 3843:
                    return a4.BOARD_CANVAS;
                case 3844:
                    return a4.DEEP_LINKING;
                case 3846:
                    return a4.REPORT_BOARD;
                case 3847:
                    return a4.AUTO_ORGANIZE;
                case 3851:
                    return a4.STORY_PIN_PRODUCT_TAGS_LIST;
                case 3856:
                    return a4.SIGNAL_COLLECTION_HUB_PERSONAL_INFORMATION;
                case 3858:
                    return a4.RVC_YOUR_ACCOUNT_TAB;
                case 3859:
                    return a4.RVC_YOUR_REPORTS_TAB;
                case 3860:
                    return a4.PARENTAL_PASSCODE_SETTINGS;
                case 3863:
                    return a4.MULTI_TOPIC_PORTAL_FULL_FEED;
                case 3868:
                    return a4.MUSIC_PLAYLIST;
                case 3869:
                    return a4.SHOWREEL_ACTION_SHEET;
                case 3870:
                    return a4.PEAR_INSIGHT_SELF;
                case 3871:
                    return a4.PEAR_INSIGHT_OTHERS;
                case 3877:
                    return a4.SHOPPING_MODULE_BEST_SELLING_FOLLOWING_BRAND;
                case 3899:
                    return a4.INTERESTS_TAB_FEED;
                case 3903:
                    return a4.MULTI_SEARCH_PORTAL_FULL_FEED;
                case 3904:
                    return a4.MULTI_BOARD_PORTAL_FULL_FEED;
                case 3906:
                    return a4.PROFILE_SELECT_BOARDLESS_PINS;
                case 3907:
                    return a4.PROFILE_VISIBILITY_SETTINGS;
                case 3912:
                    return a4.VIDEOS_HUB_INTEREST_MODULE;
                case 3913:
                    return a4.VIDEOS_CATEGORY_INTEREST_MODULE;
                case 3916:
                    return a4.BOARD_NAME_INPUT;
                case 3922:
                    return a4.ENGAGED_TOPIC_TAB;
                case 3925:
                    return a4.AUTO_ORGANIZE_REFINE_BOARD;
                case 3926:
                    return a4.PEAR_STYLE_EXPLORER;
                case 3927:
                    return a4.SEARCH_GUIDED;
                case 3928:
                    return a4.SEARCH_GUIDED_RESULTS;
                case 3929:
                    return a4.PEAR_STYLE_SUMMARY;
                case 3930:
                    return a4.PEAR_STYLE_SUMMARY_SEARCH_PINS;
                case 3931:
                    return a4.UNIFIED_SHOP_MODULE;
                case 3932:
                    return a4.UNIFIED_SHOP_FEED;
                case 3933:
                    return a4.COLLAGES_FEED;
                case 3936:
                    return a4.ANDROID_CUBES_CLUSTER;
                case 3938:
                    return a4.ANDROID_CUBES_HOME_FEED;
                case 3940:
                    return a4.ANDROID_CUBES_LEARNED_RETRIEVAL;
                case 3941:
                    return a4.PREVIEW_PICKER;
                case 3942:
                    return a4.COLLAGES_PICKER;
                case 3943:
                    return a4.ANDROID_CUBES_SIGN_IN;
                case 3944:
                    return a4.STORY_PIN_BULK_ACTIONS;
                case 3945:
                    return a4.PRIVACY_BLOCKER_ALERT;
                case 3951:
                    return a4.BASED_ON_REPIN_MODULE;
                case 3952:
                    return a4.HF_USER_PIN_CLUSTERS;
                case 3954:
                    return a4.LONG_PRESS_CONTEXTUAL_MENU;
                case 3962:
                    return a4.AUTO_PUBLISH;
                case 3963:
                    return a4.POSTNUX_MODAL;
                case 3964:
                    return a4.FEED_COLLAGE_ITEM_RELATED_ITEMS;
                case 3968:
                    return a4.PROFILE_PINS_INTEREST_FILTER;
                case 3971:
                    return a4.GEN_AI_PROJECT_MODULE_FEED;
                case 3972:
                    return a4.GEN_AI_PROJECT_SUBMODULE_FEED;
                case 3981:
                    return a4.REPORT_CONVERSATION;
                case 3988:
                    return a4.BOARD_PICKER_TOP_CHOICES;
                case 3989:
                    return a4.BOARD_PICKER_ALL_BOARDS;
                case 3990:
                    return a4.BOARD_PICKER_PROFILE_BOARD;
                case 3991:
                    return a4.BOARD_PICKER_COLLAGE;
                case 3992:
                    return a4.BOARD_PICKER_BOARD_TITLE_SUGGESTION;
                case 3993:
                    return a4.PEAR_QUIZ_QUESTIONS;
                case 3994:
                    return a4.PEAR_QUIZ_RESULTS;
                case 3996:
                    return a4.PEAR_QUIZ_SEARCH_PINS;
                case 3998:
                    return a4.ONEBAR_DRAWER;
                case 3999:
                    return a4.ONE_TAP_SAVE_TOAST;
                case 4001:
                    return a4.FLOATING_BOARD_PICKER;
                case 4002:
                    return a4.FLOATING_BOARD_PICKER_EDIT;
                case 4003:
                    return a4.SERVICE_ENTRY_PAID_SAMSUNG_MAPS;
                case 4004:
                    return a4.UNIDIRECTIONAL_ACKNOWLEDGEMENT_ALERT;
                case 4005:
                    return a4.USER_VIBES_EDUCATION;
                case 4006:
                    return a4.USER_VIBE_CLOSEUP;
                case 4011:
                    return a4.FEATURED_COLLAGE;
                case 4012:
                    return a4.COLLAGE;
                case 4013:
                    return a4.FEED_COLLAGE_REMIX_UPSELL;
                case 4014:
                    return a4.SSO_BUSINESS_DISCLAIMER;
                case 4016:
                    return a4.SEARCH_MY_PINS_AND_BOARDS;
                case 4017:
                    return a4.ROOM_REPAINT_VIEW;
                case 4019:
                    return a4.FOLLOWED_TOPIC_TAB;
                case 4024:
                    return a4.BOARD_TOOLS_ALL;
                case 4025:
                    return a4.PARENTAL_PASSCODE_INSTRUCTIONS;
                case 4026:
                    return a4.PARENTAL_PASSCODE_CODE;
                case 4027:
                    return a4.PARENTAL_PASSCODE_BACKUP_EMAIL;
                case 4028:
                    return a4.PARENTAL_PASSCODE_CONFIRMATION;
                case 4029:
                    return a4.USER_VIBES_FEED;
                case 4036:
                    return a4.SEARCH_HYBRID;
                case 4037:
                    return a4.BOARD_CHOOSE_HEADER;
                case 4038:
                    return a4.SIGNUP_PRIVACY_CONSENT_STEP;
                case 4047:
                    return a4.RETRIEVAL_HUB;
                case 4050:
                    return a4.CONNECTED_DEVICES;
                case 4051:
                    return a4.CONFIRM_REVOKE_SESSION;
                case 4052:
                    return a4.ORIENTATION_USE_CASE_PICKER_STEP;
                case 4053:
                    return a4.ORIENTATION_PIN_PICKER_STEP;
                case 4054:
                    return a4.LENS_HISTORY_RESULTS;
                case 4055:
                    return a4.PINTEREST_PICKS_TAB;
                case 4056:
                    return a4.CONVERSATIONAL_CLOSEUP;
                case 4057:
                    return a4.CONVERSATIONAL_SEARCH;
                case 4058:
                    return a4.FEED_BOARD_SHOP_SHOP_THE_LOOK;
                case 4059:
                    return a4.CONVERSATION_THREAD_CLOSEUP;
                case 4060:
                    return a4.CONVERSATION_SETTINGS_VIEW;
                case 4072:
                    return a4.ONE_TAP_DELETE_TOAST;
                case 4075:
                    return a4.FEED_BOARD_SAVED_PRODUCTS;
                case 4076:
                    return a4.ACCOUNT_ALREADY_LINKED;
                case 4077:
                    return a4.CONFIRM_MOVE_GOOGLE_LOGIN;
                case 4079:
                    return a4.USE_CASE_FEED;
                case 4080:
                    return a4.PEAR_QUIZ_INTRO;
                case 4081:
                    return a4.CLAIMED_ACCOUNTS_SETTINGS_MOBILE;
                case 4082:
                    return a4.CLAIMED_ACCOUNTS_SETTINGS_TABLET;
                case 4083:
                    return a4.COLLAGE_TOOLS_ALL;
                case 4086:
                    return a4.COLLAGE_COMPOSER_DISCOVER_FEED;
                case 4087:
                    return a4.COLLAGE_COMPOSER_YOUR_SAVES_FEED;
                case 4088:
                    return a4.COLLAGE_COMPOSER_CUTOUTS_FOR_YOU_FEED;
                case 4089:
                    return a4.FEATURED_HOLIDAY_BOARD_PREVIEW;
                case 4090:
                    return a4.FEED_BOARD_SHOP_PRODUCT_CATEGORY;
                case 4092:
                    return a4.FEATURED_BOARDS_HOLIDAY_SHOPPING;
                case 4094:
                    return a4.SETTINGS_EMAIL;
                case 4095:
                    return a4.EMAIL_VERIFICATION_OTP;
                case 4096:
                    return a4.BUSINESS_ACCESS_BUSINESS_SETTINGS;
                case 4097:
                    return a4.SETTINGS_CONFIRM_EMAIL_CHANGE_MODAL;
                case 4098:
                    return a4.NRT_AUTO_ORGANIZE_REFINE_BOARD;
                case 4099:
                    return a4.COLLAGE_COMPOSER_TRENDING_FEED;
                case 4102:
                    return a4.PIN_CLOSEUP_AMAZON_SHOPPING_MODULE;
                case 4103:
                    return a4.UNBLOCKING_SETTINGS;
                case 4105:
                    return a4.PRODUCT_FILTERED_HOMEFEED;
                case 4110:
                    return a4.BOARD_FOR_ME;
                case 4111:
                    return a4.LINK_TO_PINTEREST_SETTINGS;
                case 4113:
                    return a4.FEED_BOARD_ALL_SAVES_PINS;
                case 4114:
                    return a4.BUSINESS_ACCESS_SYSTEM_USERS;
                case 4115:
                    return a4.CONVERSATION_MESSAGES_AND_CONTACTS_INBOX;
                case 4116:
                    return a4.AD_CLOSEUP_RP;
                case 4118:
                    return a4.BUSINESS_ACCESS_APPS;
                case 4120:
                    return a4.PINNACLE_BASECAMP_BOOK_OF_BUSINESS;
                case 4121:
                    return a4.PINNACLE_ADVERTISER_DETAIL;
                case 4122:
                    return a4.PINNACLE_CAMPAIGN_PACING;
                case 4124:
                    return a4.PINNACLE_ADVERTISER_PACING;
                case 4132:
                    return a4.AI_COMPANION_CHAT_WINDOW_CONVERSATION;
                case 4133:
                    return a4.AI_COMPANION_CHAT_WINDOW_PROMPT_TEMPLATE;
                case 4134:
                    return a4.BUSINESS_SITE_CARD_CAROUSEL;
                case 4135:
                    return a4.ACCOUNT_CLAIMING_AUTO_ORGANIZE_PIN;
                case 4136:
                    return a4.COLLAGE_DRAFTS;
                case 4137:
                    return a4.BUSINESS_ACCESS_CONVERSIONS;
                case 4138:
                    return a4.CONTENT_PERMISSIONS_SETTINGS;
                case 8535:
                    return a4.SEARCH_GUIDE;
                case 8537:
                    return a4.SEARCH_TRENDING_TEXT;
                case 10677:
                    return a4.ORIENTATION_WEBSITE;
                default:
                    switch (i13) {
                        case RecyclerViewTypes.VIEW_TYPE_BUBBLE_IMAGE_WITH_TITLE_OVERLAY /* 189 */:
                            return a4.USER_FYP;
                        case RecyclerViewTypes.VIEW_TYPE_ICON_AND_TEXT_INLINE_BUBBLE /* 190 */:
                            return a4.STORIES_RELATED_PINS;
                        case RecyclerViewTypes.VIEW_TYPE_LENS_PHOTO /* 191 */:
                            return a4.STORIES_RELATED_USERS;
                        case RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY /* 192 */:
                            return a4.STORIES_RELATED_BOARDS;
                        case RecyclerViewTypes.VIEW_TYPE_LENS_HISTORY /* 193 */:
                            return a4.STORIES_RELATED_INTERESTS;
                        default:
                            switch (i13) {
                                case 200:
                                    return a4.FEED_PLACES;
                                case 201:
                                    return a4.CONVERSATION_CREATE;
                                case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_STORY_PIN /* 202 */:
                                    return a4.CONVERSATION_THREAD;
                                case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_CUSTOM_COVER /* 203 */:
                                    return a4.CONVERSATION_INBOX;
                                case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_CREATOR /* 204 */:
                                    return a4.CONVERSATION_ADD_PIN;
                                case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_HEADER /* 205 */:
                                    return a4.CONVERSATION_USERS;
                                default:
                                    switch (i13) {
                                        case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_FEED_FOOTER /* 207 */:
                                            return a4.FEED_DIGEST;
                                        case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_SECTION /* 208 */:
                                            return a4.FEED_DIGEST_STORY;
                                        case RecyclerViewTypes.VIEW_TYPE_TODAY_ARTICLE_BOARD_SECTION_HEADER /* 209 */:
                                            return a4.FEED_DYNAMIC_GRID;
                                        case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_RELATED_ARTICLES_HEADER /* 210 */:
                                            return a4.NEWS_NETWORK_STORY;
                                        case RecyclerViewTypes.VIEW_TYPE_GO_TO_HOME_FEED_FOOTER /* 211 */:
                                            return a4.NEWS_YOUR_STORY;
                                        case RecyclerViewTypes.VIEW_TYPE_SIMPLE_ACTION_STORY /* 212 */:
                                            return a4.FEED_MULTIVISIT;
                                        default:
                                            switch (i13) {
                                                case RecyclerViewTypes.VIEW_TYPE_STORY_TODAY_TAB_UPSELL_DOUBLE /* 221 */:
                                                    return a4.EDUCATION_FLYOUT;
                                                case RecyclerViewTypes.VIEW_TYPE_STORY_TODAY_TAB_UPSELL_SINGLE /* 222 */:
                                                    return a4.REBUILD_FEED_INTEREST_PICKER;
                                                case RecyclerViewTypes.VIEW_TYPE_COUNTRY_CODE /* 223 */:
                                                    return a4.REBUILD_FEED_END;
                                                case RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL /* 224 */:
                                                    return a4.PIN_TWINS;
                                                case RecyclerViewTypes.VIEW_TYPE_STORY_SELECT_OR_REORDER_PINS /* 225 */:
                                                    return a4.ACTIVITY_V2;
                                                case RecyclerViewTypes.VIEW_TYPE_STORY_GROUP_MY_PINS /* 226 */:
                                                    return a4.FEED_COMMERCE;
                                                case RecyclerViewTypes.VIEW_TYPE_VTO_BUBBLE_CONTAINER /* 227 */:
                                                    return a4.SETTINGS_SEARCH_PRIVACY;
                                                case RecyclerViewTypes.VIEW_TYPE_PROFILE_BOARDLESS_PINS_HEADER /* 228 */:
                                                    return a4.BOARD_CHOOSE_COVER;
                                                case RecyclerViewTypes.VIEW_TYPE_IN_LINE_VTO /* 229 */:
                                                    return a4.BOARD_CROP_COVER;
                                                case RecyclerViewTypes.VIEW_TYPE_AFFILIATE_LINK_IMAGE /* 230 */:
                                                    return a4.BOARD_EMPTY;
                                                case RecyclerViewTypes.VIEW_TYPE_RECENTLY_SAVED_PRODUCT_HEADER /* 231 */:
                                                    return a4.EDUCATION_SAVE;
                                                case RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_LIST_FILTER_ITEM /* 232 */:
                                                    return a4.BUYABLE_MERCHANT_RETURN_POLICY;
                                                case RecyclerViewTypes.VIEW_TYPE_SEARCH_BOARD_CELL /* 233 */:
                                                    return a4.BUYABLE_VARIANT_OPTIONS;
                                                case RecyclerViewTypes.VIEW_TYPE_SHARESHEET_APP /* 234 */:
                                                    return a4.BUYABLE_CHECKOUT_APPLE_PAY_OPTION;
                                                case RecyclerViewTypes.VIEW_TYPE_SHARESHEET_CONTACT /* 235 */:
                                                    return a4.BUYABLE_CHECKOUT_SUMMARY;
                                                case RecyclerViewTypes.VIEW_TYPE_BOARD_MORE_IDEAS_UPSELL_CARD /* 236 */:
                                                    return a4.BUYABLE_SELECT_SHIPPING_ADDRESS;
                                                case RecyclerViewTypes.VIEW_TYPE_BOARD_MORE_IDEAS_UPSELL_LIST_ITEM /* 237 */:
                                                    return a4.BUYABLE_SHIPPING_ADDRESS_FORM;
                                                case RecyclerViewTypes.VIEW_TYPE_MORE_IDEAS_BOARD_NAME_HEADER /* 238 */:
                                                    return a4.BUYABLE_SELECT_SHIPPING_METHOD;
                                                case RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL /* 239 */:
                                                    return a4.BUYABLE_SELECT_PAYMENT;
                                                case RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM /* 240 */:
                                                    return a4.BUYABLE_PAYMENT_FORM;
                                                case RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPAGE_ITEM /* 241 */:
                                                    return a4.BUYABLE_CONFIRMATION;
                                                case RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPIN_ITEM /* 242 */:
                                                    return a4.BUYABLE_ORDER_HISTORY;
                                                case RecyclerViewTypes.VIEW_TYPE_BRAND_MULTI_IMAGE_REP_ITEM /* 243 */:
                                                    return a4.BUYABLE_ORDER_DETAILS;
                                                case RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION /* 244 */:
                                                    return a4.BUYABLE_ADDRESS_CONTACTS;
                                                case RecyclerViewTypes.VIEW_TYPE_BUBBLE_TRIPLE_PREVIEW_DISPLAY_CARD_REP /* 245 */:
                                                    return a4.BUYABLE_ADDRESS_RECENTS;
                                                case RecyclerViewTypes.VIEW_TYPE_BUBBLE_STACKED_COLLAGE_DISPLAY_CARD_REP /* 246 */:
                                                    return a4.SETTINGS_OFFLINE_BOARD;
                                                case RecyclerViewTypes.VIEW_TYPE_PEAR_INSIGHT_HEADER /* 247 */:
                                                    return a4.FEED_COMMERCE_BUYABLE;
                                                case RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER /* 248 */:
                                                    return a4.PLACE_VIEW_HEADER;
                                                case RecyclerViewTypes.VIEW_TYPE_CUTOUT_COLLAGE_PILL_REP /* 249 */:
                                                    return a4.PLACE_VIEW_RELATED_PINS;
                                                case 250:
                                                    return a4.FEED_COMMERCE_PICKS;
                                                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NON_CREATOR_ANALYTICS_MODULE /* 251 */:
                                                    return a4.CAMERA_PHOTO_PICKER;
                                                case RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN /* 252 */:
                                                    return a4.CAMERA_ALBUM_PICKER;
                                                case RecyclerViewTypes.VIEW_TYPE_PIN_CLUSTER /* 253 */:
                                                    return a4.API_ENVIRONMENTS;
                                                case RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN /* 254 */:
                                                    return a4.SEARCH_BUYABLE;
                                                case 255:
                                                    return a4.FPE_CREATE_FIRST_BOARD;
                                                case RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER /* 256 */:
                                                    return a4.SEND_SHARE_MAIN;
                                                case RecyclerViewTypes.VIEW_TYPE_COMMENT_STICKER /* 257 */:
                                                    return a4.SEARCH_PRICE_FILTER;
                                                case RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW /* 258 */:
                                                    return a4.FEED_FRESH;
                                                case RecyclerViewTypes.VIEW_TYPE_SPOTLIGHT_COLLECTIONS /* 259 */:
                                                    return a4.ORIENTATION_WELCOME;
                                                case RecyclerViewTypes.VIEW_TYPE_PROTECTED_BOARD_HEADER /* 260 */:
                                                    return a4.ORIENTATION_EXTENSION_UPSELL;
                                                case RecyclerViewTypes.VIEW_TYPE_MORE_IDEAS_ON_ENDLESS_SCROLL_HEADER /* 261 */:
                                                    return a4.ORIENTATION_LOADING_HOME_FEED;
                                                case RecyclerViewTypes.VIEW_TYPE_PRODUCT_FILTER_DIVIDER /* 262 */:
                                                    return a4.ORIENTATION_TAG_PICKER;
                                                case RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_BOARDS /* 263 */:
                                                    return a4.ORIENTATION_BOARD_PICKER;
                                                case RecyclerViewTypes.VIEW_TYPE_ATG_VISUALIZATION_BANNER /* 264 */:
                                                    return a4.ORIENTATION_PIN_PICKER;
                                                case RecyclerViewTypes.VIEW_TYPE_PROMOTED_PIN_VIDEO /* 265 */:
                                                    return a4.ORIENTATION_AFFINITY_COMPLETION_INFO;
                                                default:
                                                    switch (i13) {
                                                        case AdSize.MEDIUM_RECTANGLE_WIDTH /* 300 */:
                                                            return a4.REGISTRATION_SIGNUP_BUSINESS;
                                                        case wb.W0 /* 301 */:
                                                            return a4.REGISTRATION_LOCAL_INFO;
                                                        case wb.X0 /* 302 */:
                                                            return a4.REGISTRATION_AGE_GENDER;
                                                        default:
                                                            switch (i13) {
                                                                case 2000:
                                                                    return a4.EMAIL_UNKNOWN;
                                                                case 2001:
                                                                    return a4.EMAIL_TRANSACTIONAL;
                                                                case 2002:
                                                                    return a4.EMAIL_EDITORIAL;
                                                                case 2003:
                                                                    return a4.EMAIL_ACTIVITY_AGGREGATION;
                                                                case 2004:
                                                                    return a4.EMAIL_RECOMMENDATIONS_DIGEST;
                                                                case 2005:
                                                                    return a4.EMAIL_SOCIAL_DIGEST;
                                                                case 2006:
                                                                    return a4.EMAIL_SEND_PIN;
                                                                case 2007:
                                                                    return a4.EMAIL_SEND_BOARD;
                                                                case 2008:
                                                                    return a4.EMAIL_SEND_PINNER;
                                                                case 2009:
                                                                    return a4.EMAIL_FRIEND_JOINED;
                                                                case 2010:
                                                                    return a4.EMAIL_WELCOME;
                                                                case 2011:
                                                                    return a4.EMAIL_BOARD_RECOMMENDATIONS;
                                                                case 2012:
                                                                    return a4.EMAIL_PIN_RECOMMENDATIONS;
                                                                case 2013:
                                                                    return a4.EMAIL_COMMENT_AND_MENTION;
                                                                case 2014:
                                                                    return a4.EMAIL_USECASES;
                                                                case 2015:
                                                                    return a4.EMAIL_FIREHOSE_QUESTION_CREATE;
                                                                case 2016:
                                                                    return a4.EMAIL_FIREHOSE_ANSWER_CREATE;
                                                                case 2017:
                                                                    return a4.EMAIL_FIREHOSE_REPLY_CREATE;
                                                                case 2018:
                                                                    return a4.EMAIL_QUESTION_CREATE;
                                                                case 2019:
                                                                    return a4.EMAIL_ANSWER_CREATE;
                                                                case 2020:
                                                                    return a4.EMAIL_QUESTION_LIKE;
                                                                case 2021:
                                                                    return a4.EMAIL_ANSWER_LIKE;
                                                                case 2022:
                                                                    return a4.EMAIL_REPLY_CREATE;
                                                                case 2023:
                                                                    return a4.EMAIL_PARTNER;
                                                                case 2024:
                                                                    return a4.EMAIL_INTEREST_RECOMMENDATIONS;
                                                                case 2025:
                                                                    return a4.EMAIL_HOMEFEED_NEW_PINS;
                                                                case 2026:
                                                                    return a4.EMAIL_NETWORK_STORY_DIGEST;
                                                                case 2027:
                                                                    return a4.EMAIL_PINVITATIONAL_ACCESS;
                                                                case 2028:
                                                                    return a4.EMAIL_RESTART_FEED;
                                                                case 2029:
                                                                    return a4.EMAIL_PINVITATIONAL_RALLYING_CALL;
                                                                case 2030:
                                                                    return a4.EMAIL_WEEK_IN_REVIEW;
                                                                case 2031:
                                                                    return a4.EMAIL_NO_SIGNAL;
                                                                case 2032:
                                                                    return a4.EMAIL_USER_RECOMMENDATIONS;
                                                                case 2033:
                                                                    return a4.EMAIL_BOARD_COLLABORATION;
                                                                case 2034:
                                                                    return a4.EMAIL_CONVERSATIONS;
                                                                case 2035:
                                                                    return a4.EMAIL_LEGAL;
                                                                case 2036:
                                                                    return a4.EMAIL_SECURITY;
                                                                default:
                                                                    switch (i13) {
                                                                        case 2110:
                                                                            return a4.SERVICE_ENTRY_SEO_GOOGLE;
                                                                        case 2111:
                                                                            return a4.SERVICE_ENTRY_SEO_YAHOO;
                                                                        case 2112:
                                                                            return a4.SERVICE_ENTRY_SEO_BING;
                                                                        default:
                                                                            switch (i13) {
                                                                                case 74:
                                                                                    return a4.USER_PINS;
                                                                                case 75:
                                                                                    return a4.USER_ABOUT;
                                                                                case 76:
                                                                                    return a4.ABOUT_ETIQUETTE;
                                                                                case 77:
                                                                                    return a4.ABOUT_ABOUT;
                                                                                case 78:
                                                                                    return a4.ABOUT_GOODIES;
                                                                                case 79:
                                                                                    return a4.ABOUT_CAREERS;
                                                                                case 80:
                                                                                    return a4.ABOUT_TEAM;
                                                                                case 81:
                                                                                    return a4.ABOUT_PRESS;
                                                                                case 82:
                                                                                    return a4.ABOUT_PRIVACY;
                                                                                case 83:
                                                                                    return a4.ABOUT_USE;
                                                                                case 84:
                                                                                    return a4.ABOUT_COPYRIGHT;
                                                                                case 85:
                                                                                    return a4.FEED_GIFTS;
                                                                                case 86:
                                                                                    return a4.REPORT_USER;
                                                                                case 87:
                                                                                    return a4.BOARD_CREATE;
                                                                                case 88:
                                                                                    return a4.BOARD_EDIT;
                                                                                default:
                                                                                    switch (i13) {
                                                                                        case 90:
                                                                                            return a4.BOARD_COLLABORATORS;
                                                                                        case 91:
                                                                                            return a4.CATEGORY_DISCOVER;
                                                                                        case 92:
                                                                                            return a4.FEED_HOME;
                                                                                        case 93:
                                                                                            return a4.USER_EDIT;
                                                                                        case 94:
                                                                                            return a4.EDUCATION_LONGPRESS;
                                                                                        case 95:
                                                                                            return a4.EDUCATION_SECRET_BOARD;
                                                                                        case 96:
                                                                                            return a4.MOBILE_ORIENTATION_DISCOVER;
                                                                                        case 97:
                                                                                            return a4.MOBILE_ORIENTATION_COLLECT;
                                                                                        case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_VIDEO_CREATOR_ANALYTICS_MODULE /* 98 */:
                                                                                            return a4.MOBILE_ORIENTATION_FUNCTIONAL;
                                                                                        case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NOTE_AND_FAVORITE_MODULE /* 99 */:
                                                                                            return a4.MOBILE_ORIENTATION_STORY;
                                                                                        default:
                                                                                            switch (i13) {
                                                                                                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE /* 101 */:
                                                                                                    return a4.EDUCATION_RELATED_PINS;
                                                                                                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE /* 102 */:
                                                                                                    return a4.ORIENTATION_FAST_FOLLOW;
                                                                                                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE /* 103 */:
                                                                                                    return a4.SEARCH_AUTOCOMPLETE;
                                                                                                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE /* 104 */:
                                                                                                    return a4.BOARD_EDIT_COLLABORATORS;
                                                                                                default:
                                                                                                    switch (i13) {
                                                                                                        case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID /* 106 */:
                                                                                                            return a4.PICKED_FOR_YOU_FEED;
                                                                                                        case RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER /* 107 */:
                                                                                                            return a4.SEARCH_MY_PINS;
                                                                                                        case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE /* 108 */:
                                                                                                            return a4.EDUCATION_CONTEXTUAL_MENU;
                                                                                                        case RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL /* 109 */:
                                                                                                            return a4.FEED_EDITOR_FOLLOW_BOARDS;
                                                                                                        case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL /* 110 */:
                                                                                                            return a4.FEED_EDITOR_UNFOLLOW_BOARDS;
                                                                                                        case RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE /* 111 */:
                                                                                                            return a4.FEED_TOP_PICKS;
                                                                                                        case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER /* 112 */:
                                                                                                            return a4.DEPRECATED_DEEP_LINKING_EMAIL;
                                                                                                        case RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL /* 113 */:
                                                                                                            return a4.DEPRECATED_DEEP_LINKING_WEB;
                                                                                                        case RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER /* 114 */:
                                                                                                            return a4.DEEP_LINKING_FACEBOOK;
                                                                                                        case RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE /* 115 */:
                                                                                                            return a4.DEEP_LINKING_APP;
                                                                                                        case RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW /* 116 */:
                                                                                                            return a4.FEED_RELATED_BOARD;
                                                                                                        case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN /* 117 */:
                                                                                                            return a4.FEED_RELATED_INTEREST;
                                                                                                        case RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL /* 118 */:
                                                                                                            return a4.FEED_WELCOME;
                                                                                                        default:
                                                                                                            switch (i13) {
                                                                                                                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL /* 120 */:
                                                                                                                    return a4.FEED_SUBCATEGORY;
                                                                                                                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL /* 121 */:
                                                                                                                    return a4.BOARD_PLACE;
                                                                                                                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN /* 122 */:
                                                                                                                    return a4.BOARD_MAP;
                                                                                                                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL /* 123 */:
                                                                                                                    return a4.SEARCH_PLACES;
                                                                                                                case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER /* 124 */:
                                                                                                                    return a4.FEED_CATEGORY_HOLIDAY_FOR_HIM;
                                                                                                                case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED /* 125 */:
                                                                                                                    return a4.FEED_CATEGORY_HOLIDAY_FOR_HER;
                                                                                                                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL /* 126 */:
                                                                                                                    return a4.FEED_CATEGORY_HOLIDAY_FOR_KIDS;
                                                                                                                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK /* 127 */:
                                                                                                                    return a4.FEED_CATEGORY_HOLIDAY_FOR_ALL;
                                                                                                                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN /* 128 */:
                                                                                                                    return a4.FEED_VIDEOS;
                                                                                                                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS /* 129 */:
                                                                                                                    return a4.FEED_DOMAIN;
                                                                                                                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN /* 130 */:
                                                                                                                    return a4.FEED_CATEGORY_CHRISTMAS_SWEATER;
                                                                                                                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL /* 131 */:
                                                                                                                    return a4.FRIEND_INVITER_FIND_FRIENDS;
                                                                                                                case RecyclerViewTypes.VIEW_TYPE_FEED_SECTION_TITLE /* 132 */:
                                                                                                                    return a4.FRIEND_INVITER_INVITE;
                                                                                                                case RecyclerViewTypes.VIEW_TYPE_PIN_CAROUSEL /* 133 */:
                                                                                                                    return a4.FRIEND_INVITER_TWITTER;
                                                                                                                default:
                                                                                                                    switch (i13) {
                                                                                                                        case RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL /* 135 */:
                                                                                                                            return a4.FIND_FRIENDS;
                                                                                                                        case RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL /* 136 */:
                                                                                                                            return a4.FEED_INTEREST;
                                                                                                                        case RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_IMAGE /* 137 */:
                                                                                                                            return a4.DISCOVER_CATEGORY;
                                                                                                                        case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL /* 138 */:
                                                                                                                            return a4.DISCOVER_INTEREST;
                                                                                                                        case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM /* 139 */:
                                                                                                                            return a4.PIN_OTHER;
                                                                                                                        case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ACTION_ITEM /* 140 */:
                                                                                                                            return a4.PIN_REGULAR;
                                                                                                                        case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM_HIDDEN /* 141 */:
                                                                                                                            return a4.PIN_ARTICLE;
                                                                                                                        case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL /* 142 */:
                                                                                                                            return a4.PIN_MOVIE;
                                                                                                                        case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_IMAGE /* 143 */:
                                                                                                                            return a4.PIN_PLACE;
                                                                                                                        case RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM /* 144 */:
                                                                                                                            return a4.PIN_PRODUCT;
                                                                                                                        case RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM_TINTED /* 145 */:
                                                                                                                            return a4.PIN_RECIPE;
                                                                                                                        case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_VIDEO /* 146 */:
                                                                                                                            return a4.PIN_LOOKBOOK;
                                                                                                                        case RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY /* 147 */:
                                                                                                                            return a4.PIN_PRODUCT_MERCHANT;
                                                                                                                        case RecyclerViewTypes.VIEW_TYPE_SHOPPING_BUBBLES_PACKAGE_GRID_MODULE /* 148 */:
                                                                                                                            return a4.PIN_MAKE_TUTORIAL;
                                                                                                                        case RecyclerViewTypes.VIEW_TYPE_SHOPPING_BRAND_PACKAGE_GRID_MODULE /* 149 */:
                                                                                                                            return a4.PIN_SHUFFLE_CUTOUT;
                                                                                                                        default:
                                                                                                                            switch (i13) {
                                                                                                                                case RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY_FILTER_ITEM /* 156 */:
                                                                                                                                    return a4.PIN_CLOSEUP;
                                                                                                                                case RecyclerViewTypes.VIEW_TYPE_SHOPPING_SORT_FILTER /* 157 */:
                                                                                                                                    return a4.PIN_STORY_PIN;
                                                                                                                                case RecyclerViewTypes.VIEW_TYPE_STELA_IN_FLASHLIGHT_ONE_COLUMN /* 158 */:
                                                                                                                                    return a4.PIN_PDPPLUS;
                                                                                                                                default:
                                                                                                                                    switch (i13) {
                                                                                                                                        case 160:
                                                                                                                                            return a4.SPLASH_LOADING;
                                                                                                                                        case RecyclerViewTypes.VIEW_TYPE_PLACEHOLDER /* 161 */:
                                                                                                                                            return a4.SPLASH_INSPIRED_WALL;
                                                                                                                                        case RecyclerViewTypes.VIEW_TYPE_FULL_SPAN_PLACEHOLDER /* 162 */:
                                                                                                                                            return a4.SPLASH_BRIO_WALL;
                                                                                                                                        case RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM /* 163 */:
                                                                                                                                            return a4.SPLASH_CONTINUE_EMAIL;
                                                                                                                                        case RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_LOADING /* 164 */:
                                                                                                                                            return a4.SPLASH_MULTISTEP;
                                                                                                                                        default:
                                                                                                                                            switch (i13) {
                                                                                                                                                case RecyclerViewTypes.VIEW_TYPE_BUBBLE_NAVIGATION_REP /* 181 */:
                                                                                                                                                    return a4.SEARCH_PLACE_BOARDS;
                                                                                                                                                case RecyclerViewTypes.VIEW_TYPE_BUBBLE_DEFAULT_REP /* 182 */:
                                                                                                                                                    return a4.SEARCH_INTERESTS;
                                                                                                                                                case RecyclerViewTypes.VIEW_TYPE_BUBBLE_STYLE_REP /* 183 */:
                                                                                                                                                    return a4.USER_INTERESTS;
                                                                                                                                                case RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_IMAGE_REP /* 184 */:
                                                                                                                                                    return a4.EDUCATION_GUIDED_SEARCH;
                                                                                                                                                case RecyclerViewTypes.VIEW_TYPE_BUBBLE_IMAGE_GRID_REP /* 185 */:
                                                                                                                                                    return a4.DISCOVER_SEARCH_INTERESTS;
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
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
        return a4.FEED_CATEGORY_ART;
    }
}
