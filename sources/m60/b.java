package m60;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    private final String apiHeader;

    @NotNull
    private final h32.z0 contextEnum;
    public static final b FOREGROUND = new b("FOREGROUND", 0, "active", h32.z0.ACTIVE);
    public static final b BACKGROUND = new b("BACKGROUND", 1, "background", h32.z0.BACKGROUND);
    public static final b FOREGROUND_OFFLINE = new b("FOREGROUND_OFFLINE", 2, "active_offline", h32.z0.ACTIVE_OFFLINE);
    public static final b BACKGROUND_OFFLINE = new b("BACKGROUND_OFFLINE", 3, "background_offline", h32.z0.BACKGROUND_OFFLINE);

    private static final /* synthetic */ b[] $values() {
        return new b[]{FOREGROUND, BACKGROUND, FOREGROUND_OFFLINE, BACKGROUND_OFFLINE};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private b(String str, int i13, String str2, h32.z0 z0Var) {
        this.apiHeader = str2;
        this.contextEnum = z0Var;
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
    public final String getApiHeader() {
        return this.apiHeader;
    }

    @NotNull
    public final h32.z0 getContextEnum() {
        return this.contextEnum;
    }

    public final boolean isBackgroundState() {
        return this == BACKGROUND || this == BACKGROUND_OFFLINE;
    }
}
