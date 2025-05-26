package ew;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;

    @NotNull
    private final String state;
    public static final k FAIL_QUARANTINE_NOT_STARTED = new k("FAIL_QUARANTINE_NOT_STARTED", 0, "fail_quarantine_not_started");
    public static final k FAIL_QUARANTINE_STARTING = new k("FAIL_QUARANTINE_STARTING", 1, "fail_quarantine_starting");
    public static final k FAIL_INVALID_ANDROID_API_VERSION = new k("FAIL_INVALID_ANDROID_API_VERSION", 2, "fail_invalid_android_api_version");
    public static final k PASS_VALID_ANDROID_API_VERSION = new k("PASS_VALID_ANDROID_API_VERSION", 3, "pass_valid_android_api_version");
    public static final k FAIL_NO_WEBVIEW = new k("FAIL_NO_WEBVIEW", 4, "fail_no_webview");
    public static final k PASS_HAS_WEBVIEW = new k("PASS_HAS_WEBVIEW", 5, "pass_has_webview");
    public static final k FAIL_EXPERIMENT_NOT_ENABLED = new k("FAIL_EXPERIMENT_NOT_ENABLED", 6, "fail_experiment_not_enabled");
    public static final k PASS_EXPERIMENT_ENABLED = new k("PASS_EXPERIMENT_ENABLED", 7, "pass_experiment_enabled");
    public static final k FAIL_INVALID_CONFIG = new k("FAIL_INVALID_CONFIG", 8, "fail_invalid_config");
    public static final k PASS_VALID_CONFIG = new k("PASS_VALID_CONFIG", 9, "pass_valid_config");
    public static final k FAIL_INVALID_GEOCODE = new k("FAIL_INVALID_GEOCODE", 10, "fail_invalid_geocode");
    public static final k PASS_VALID_GEOCODE = new k("PASS_VALID_GEOCODE", 11, "pass_valid_geocode");
    public static final k SUCCESSFUL_QUARANTINE = new k("SUCCESSFUL_QUARANTINE", 12, "successful_quarantine");

    private static final /* synthetic */ k[] $values() {
        return new k[]{FAIL_QUARANTINE_NOT_STARTED, FAIL_QUARANTINE_STARTING, FAIL_INVALID_ANDROID_API_VERSION, PASS_VALID_ANDROID_API_VERSION, FAIL_NO_WEBVIEW, PASS_HAS_WEBVIEW, FAIL_EXPERIMENT_NOT_ENABLED, PASS_EXPERIMENT_ENABLED, FAIL_INVALID_CONFIG, PASS_VALID_CONFIG, FAIL_INVALID_GEOCODE, PASS_VALID_GEOCODE, SUCCESSFUL_QUARANTINE};
    }

    static {
        k[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private k(String str, int i13, String str2) {
        this.state = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }

    @NotNull
    public final String getState() {
        return this.state;
    }
}
