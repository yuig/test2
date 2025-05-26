package rw;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;

    @NotNull
    private final String value;
    public static final a SDK_INIT = new a("SDK_INIT", 0, "sdk_init");
    public static final a GENERAL_ERROR = new a("GENERAL_ERROR", 1, "general_error");
    public static final a JS_DOWNLOAD = new a("JS_DOWNLOAD", 2, "js_download");
    public static final a FETCH_PARTNER = new a("FETCH_PARTNER", 3, "fetch_partner");
    public static final a AD_SESSION_CREATE = new a("AD_SESSION_CREATE", 4, "ad_session_create");
    public static final a AD_SESSION_START = new a("AD_SESSION_START", 5, "ad_session_start");
    public static final a AD_SESSION_FINISH = new a("AD_SESSION_FINISH", 6, "ad_session_finish");
    public static final a AD_SESSION_ADD_OBSTRUCTION = new a("AD_SESSION_ADD_OBSTRUCTION", 7, "ad_session_add_obstruction");
    public static final a AD_SESSION_SET_MAIN_AD_VIEW = new a("AD_SESSION_SET_MAIN_AD_VIEW", 8, "ad_session_set_main_ad_view");
    public static final a AD_SESSION_DOES_NOT_EXIST = new a("AD_SESSION_DOES_NOT_EXIST", 9, "ad_session_does_not_exist");
    public static final a AD_LOADED = new a("AD_LOADED", 10, "ad_loaded");
    public static final a AD_IMP_OCCURRED = new a("AD_IMP_OCCURRED", 11, "ad_imp_occurred");
    public static final a AD_USER_INTERACTION_CLICK = new a("AD_USER_INTERACTION_CLICK", 12, "ad_user_interaction_click");
    public static final a VIDEO_START = new a("VIDEO_START", 13, "video_start");
    public static final a VIDEO_FIRST_QUARTILE = new a("VIDEO_FIRST_QUARTILE", 14, "video_first_quartile");
    public static final a VIDEO_MID_POINT = new a("VIDEO_MID_POINT", 15, "video_mid_point");
    public static final a VIDEO_THIRD_QUARTILE = new a("VIDEO_THIRD_QUARTILE", 16, "video_third_quartile");
    public static final a VIDEO_COMPLETE = new a("VIDEO_COMPLETE", 17, "video_complete");
    public static final a VIDEO_UNKNOWN_QUARTILE = new a("VIDEO_UNKNOWN_QUARTILE", 18, "video_unknown_quartile");
    public static final a VIDEO_PAUSE = new a("VIDEO_PAUSE", 19, "video_pause");
    public static final a VIDEO_RESUME = new a("VIDEO_RESUME", 20, "video_resume");
    public static final a VIDEO_SKIP = new a("VIDEO_SKIP", 21, "video_skip");
    public static final a VIDEO_BUFFER_START = new a("VIDEO_BUFFER_START", 22, "video_buffer_start");
    public static final a VIDEO_BUFFER_FINISH = new a("VIDEO_BUFFER_FINISH", 23, "video_buffer_finish");
    public static final a VIDEO_VOLUME_CHANGE = new a("VIDEO_VOLUME_CHANGE", 24, "video_volume_change");
    public static final a QUARANTINE_ERROR = new a("QUARANTINE_ERROR", 25, "quarantine_error");
    public static final a VERIFICATION_RESOURCE_CREATE = new a("VERIFICATION_RESOURCE_CREATE", 26, "verification_resource_create");

    private static final /* synthetic */ a[] $values() {
        return new a[]{SDK_INIT, GENERAL_ERROR, JS_DOWNLOAD, FETCH_PARTNER, AD_SESSION_CREATE, AD_SESSION_START, AD_SESSION_FINISH, AD_SESSION_ADD_OBSTRUCTION, AD_SESSION_SET_MAIN_AD_VIEW, AD_SESSION_DOES_NOT_EXIST, AD_LOADED, AD_IMP_OCCURRED, AD_USER_INTERACTION_CLICK, VIDEO_START, VIDEO_FIRST_QUARTILE, VIDEO_MID_POINT, VIDEO_THIRD_QUARTILE, VIDEO_COMPLETE, VIDEO_UNKNOWN_QUARTILE, VIDEO_PAUSE, VIDEO_RESUME, VIDEO_SKIP, VIDEO_BUFFER_START, VIDEO_BUFFER_FINISH, VIDEO_VOLUME_CHANGE, QUARANTINE_ERROR, VERIFICATION_RESOURCE_CREATE};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13, String str2) {
        this.value = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
