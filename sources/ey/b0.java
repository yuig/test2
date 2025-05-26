package ey;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b0[] $VALUES;
    private final int type;
    public static final b0 TAG_UNDEFINED = new b0("TAG_UNDEFINED", 0, 0);
    public static final b0 TAG_CORE_FEATURE_LOADER_REGISTRY = new b0("TAG_CORE_FEATURE_LOADER_REGISTRY", 1, 1);
    public static final b0 TAG_CRASH_REPORTING = new b0("TAG_CRASH_REPORTING", 2, 2);
    public static final b0 TAG_PROFILE_PREFETCH_MANAGER = new b0("TAG_PROFILE_PREFETCH_MANAGER", 3, 3);
    public static final b0 TAG_DELAYED_BOTTOM_NAV_INFLATION = new b0("TAG_DELAYED_BOTTOM_NAV_INFLATION", 4, 4);
    public static final b0 TAG_LOG_REPORT_FULLY_DRAWN = new b0("TAG_LOG_REPORT_FULLY_DRAWN", 5, 6);
    public static final b0 TAG_WARM_UP_VIDEO_CONNECTION = new b0("TAG_WARM_UP_VIDEO_CONNECTION", 6, 7);
    public static final b0 TAG_SHOPPING_GRID_COLLAGE_STORY = new b0("TAG_SHOPPING_GRID_COLLAGE_STORY", 7, 8);
    public static final b0 TAG_NON_ESSENTIAL_TABS = new b0("TAG_NON_ESSENTIAL_TABS", 8, 9);
    public static final b0 TAG_RUM_REPORTING = new b0("TAG_RUM_REPORTING", 9, 10);
    public static final b0 TAG_CHROME_SESSION = new b0("TAG_CHROME_SESSION", 10, 11);
    public static final b0 TAG_REGISTER_NON_ESSENTIAL_PWT_HANDLERS = new b0("TAG_REGISTER_NON_ESSENTIAL_PWT_HANDLERS", 11, 13);
    public static final b0 TAG_QUERY_FOR_INSTALLED_WEB_VIEW_VERSION = new b0("TAG_QUERY_FOR_INSTALLED_WEB_VIEW_VERSION", 12, 15);
    public static final b0 TAG_CEDEXIS_INIT = new b0("TAG_CEDEXIS_INIT", 13, 16);
    public static final b0 TAG_WORKMANAGER_INIT = new b0("TAG_WORKMANAGER_INIT", 14, 31);
    public static final b0 TAG_ADD_ACCOUNT = new b0("TAG_ADD_ACCOUNT", 15, 32);
    public static final b0 TAG_ACTIVATE_EXPERIMENTS = new b0("TAG_ACTIVATE_EXPERIMENTS", 16, 33);
    public static final b0 TAG_TRACKING_REQUESTS = new b0("TAG_TRACKING_REQUESTS", 17, 34);
    public static final b0 TAG_PINTEREST_ACTIVITY_CREATE_TASKS = new b0("TAG_PINTEREST_ACTIVITY_CREATE_TASKS", 18, 35);
    public static final b0 TAG_MAIN_ACTIVITY_START_SERVICES = new b0("TAG_MAIN_ACTIVITY_START_SERVICES", 19, 36);
    public static final b0 TAG_DELAYED_AUTHED_USER_STARTUP_TASKS = new b0("TAG_DELAYED_AUTHED_USER_STARTUP_TASKS", 20, 37);
    public static final b0 TAG_LOG_LOCATION_PERMISSIONS = new b0("TAG_LOG_LOCATION_PERMISSIONS", 21, 38);
    public static final b0 TAG_LOG_DEVICE_PROFILE = new b0("TAG_LOG_DEVICE_PROFILE", 22, 39);
    public static final b0 TAG_LOG_ENTRY_POINT = new b0("TAG_LOG_ENTRY_POINT", 23, 40);
    public static final b0 TAG_APPSFLYER_INIT = new b0("TAG_APPSFLYER_INIT", 24, 41);
    public static final b0 TAG_SPLIT_INSTALL_MANAGER_INIT = new b0("TAG_SPLIT_INSTALL_MANAGER_INIT", 25, 42);
    public static final b0 TAG_RECAPTCHA_FOR_AUTH = new b0("TAG_RECAPTCHA_FOR_AUTH", 26, 44);
    public static final b0 TAG_ROOM_DB_INIT = new b0("TAG_ROOM_DB_INIT", 27, 45);
    public static final b0 TAG_LOW_PRI_MISC_TASKS = new b0("TAG_LOW_PRI_MISC_TASKS", 28, 46);
    public static final b0 TAG_SET_PREFERRED_SHARE_APP_PACKAGE = new b0("TAG_SET_PREFERRED_SHARE_APP_PACKAGE", 29, 47);
    public static final b0 TAG_SCHEDULE_SUBMIT_NETWORK_METRICS = new b0("TAG_SCHEDULE_SUBMIT_NETWORK_METRICS", 30, 48);
    public static final b0 TAG_COMPOSE_WARMUP = new b0("TAG_COMPOSE_WARMUP", 31, 49);
    public static final b0 TAG_INTEGRITY_CHECK_TASKS = new b0("TAG_INTEGRITY_CHECK_TASKS", 32, 51);
    public static final b0 TAG_SUGGESTED_CONTACTS = new b0("TAG_SUGGESTED_CONTACTS", 33, 52);
    public static final b0 TAG_VIDEO_PREFETCH = new b0("TAG_VIDEO_PREFETCH", 34, 55);
    public static final b0 TAG_GOOGLE_ENGAGE_INIT = new b0("TAG_GOOGLE_ENGAGE_INIT", 35, 56);
    public static final b0 TAG_BOARDS_PREFETCH = new b0("TAG_BOARDS_PREFETCH", 36, 57);
    public static final b0 TAG_ADS_GMA_MANAGER_INIT = new b0("TAG_ADS_GMA_MANAGER_INIT", 37, 58);
    public static final b0 TAG_FIREBASE_ANALYTICS_INIT = new b0("TAG_FIREBASE_ANALYTICS_INIT", 38, 59);
    public static final b0 TAG_SHUFFLES_LIB_INIT = new b0("TAG_SHUFFLES_LIB_INIT", 39, 60);
    public static final b0 TAG_HANDSHAKE_MANAGER_INIT = new b0("TAG_HANDSHAKE_MANAGER_INIT", 40, 61);
    public static final b0 TAG_RELATED_PINS_API_FIELDS_CACHE_INIT = new b0("TAG_RELATED_PINS_API_FIELDS_CACHE_INIT", 41, 62);
    public static final b0 TAG_TARGET_HANDSHAKE_MANAGER_INIT = new b0("TAG_TARGET_HANDSHAKE_MANAGER_INIT", 42, 63);
    public static final b0 TAG_ADS_OPEN_MEASUREMENT_SDK_INIT = new b0("TAG_ADS_OPEN_MEASUREMENT_SDK_INIT", 43, 65);
    public static final b0 TAG_SHARED_PREFS_STORAGE_CLEANUP = new b0("TAG_SHARED_PREFS_STORAGE_CLEANUP", 44, 66);

    private static final /* synthetic */ b0[] $values() {
        return new b0[]{TAG_UNDEFINED, TAG_CORE_FEATURE_LOADER_REGISTRY, TAG_CRASH_REPORTING, TAG_PROFILE_PREFETCH_MANAGER, TAG_DELAYED_BOTTOM_NAV_INFLATION, TAG_LOG_REPORT_FULLY_DRAWN, TAG_WARM_UP_VIDEO_CONNECTION, TAG_SHOPPING_GRID_COLLAGE_STORY, TAG_NON_ESSENTIAL_TABS, TAG_RUM_REPORTING, TAG_CHROME_SESSION, TAG_REGISTER_NON_ESSENTIAL_PWT_HANDLERS, TAG_QUERY_FOR_INSTALLED_WEB_VIEW_VERSION, TAG_CEDEXIS_INIT, TAG_WORKMANAGER_INIT, TAG_ADD_ACCOUNT, TAG_ACTIVATE_EXPERIMENTS, TAG_TRACKING_REQUESTS, TAG_PINTEREST_ACTIVITY_CREATE_TASKS, TAG_MAIN_ACTIVITY_START_SERVICES, TAG_DELAYED_AUTHED_USER_STARTUP_TASKS, TAG_LOG_LOCATION_PERMISSIONS, TAG_LOG_DEVICE_PROFILE, TAG_LOG_ENTRY_POINT, TAG_APPSFLYER_INIT, TAG_SPLIT_INSTALL_MANAGER_INIT, TAG_RECAPTCHA_FOR_AUTH, TAG_ROOM_DB_INIT, TAG_LOW_PRI_MISC_TASKS, TAG_SET_PREFERRED_SHARE_APP_PACKAGE, TAG_SCHEDULE_SUBMIT_NETWORK_METRICS, TAG_COMPOSE_WARMUP, TAG_INTEGRITY_CHECK_TASKS, TAG_SUGGESTED_CONTACTS, TAG_VIDEO_PREFETCH, TAG_GOOGLE_ENGAGE_INIT, TAG_BOARDS_PREFETCH, TAG_ADS_GMA_MANAGER_INIT, TAG_FIREBASE_ANALYTICS_INIT, TAG_SHUFFLES_LIB_INIT, TAG_HANDSHAKE_MANAGER_INIT, TAG_RELATED_PINS_API_FIELDS_CACHE_INIT, TAG_TARGET_HANDSHAKE_MANAGER_INIT, TAG_ADS_OPEN_MEASUREMENT_SDK_INIT, TAG_SHARED_PREFS_STORAGE_CLEANUP};
    }

    static {
        b0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private b0(String str, int i13, int i14) {
        this.type = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}
