package bs;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    private final String errorCode;

    @NotNull
    private final String failureName;
    public static final c API_LEVEL = new c("API_LEVEL", 0, "quarantine_failed_api_level", "");
    public static final c WEBVIEW_DISABLED = new c("WEBVIEW_DISABLED", 1, "quarantine_failed_webview_disabled", "");
    public static final c CHROME_DISABLED = new c("CHROME_DISABLED", 2, "quarantine_failed_chrome_disabled", "");

    private static final /* synthetic */ c[] $values() {
        return new c[]{API_LEVEL, WEBVIEW_DISABLED, CHROME_DISABLED};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private c(String str, int i13, String str2, String str3) {
        this.failureName = str2;
        this.errorCode = str3;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    @NotNull
    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getFailureName() {
        return this.failureName;
    }
}
