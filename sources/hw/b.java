package hw;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    private final String stateValue;
    public static final b NONE = new b("NONE", 0, "none");
    public static final b WEBVIEW_USER_AGENT_FETCHING = new b("WEBVIEW_USER_AGENT_FETCHING", 1, "webview_user_agent_fetching");
    public static final b SDK_INITIALIZING = new b("SDK_INITIALIZING", 2, "sdk_initializing");
    public static final b SDK_INITIALIZED = new b("SDK_INITIALIZED", 3, "sdk_initialized");
    public static final b SDK_GENERATING_QUERY_INFO = new b("SDK_GENERATING_QUERY_INFO", 4, "sdk_generating_query_info");
    public static final b SDK_GENERATE_QUERY_INFO_SUCCESS = new b("SDK_GENERATE_QUERY_INFO_SUCCESS", 5, "sdk_generate_query_info_success");
    public static final b SDK_GENERATE_QUERY_INFO_FAILED = new b("SDK_GENERATE_QUERY_INFO_FAILED", 6, "sdk_generate_query_info_failed");

    private static final /* synthetic */ b[] $values() {
        return new b[]{NONE, WEBVIEW_USER_AGENT_FETCHING, SDK_INITIALIZING, SDK_INITIALIZED, SDK_GENERATING_QUERY_INFO, SDK_GENERATE_QUERY_INFO_SUCCESS, SDK_GENERATE_QUERY_INFO_FAILED};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private b(String str, int i13, String str2) {
        this.stateValue = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    @NotNull
    public final String getStateValue() {
        return this.stateValue;
    }
}
