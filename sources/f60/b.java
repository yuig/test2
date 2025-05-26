package f60;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    public static final a Companion;

    @NotNull
    private final String value;
    public static final b AFTER_DOWNLOAD = new b("AFTER_DOWNLOAD", 0, "after_download");
    public static final b AFTER_PROFILE_SAVE = new b("AFTER_PROFILE_SAVE", 1, "after_profile_save");
    public static final b NEWSHUB = new b("NEWSHUB", 2, "newshub");
    public static final b PROFILE = new b("PROFILE", 3, "profile");
    public static final b UNKNOWN = new b("UNKNOWN", 4, "unknown");

    private static final /* synthetic */ b[] $values() {
        return new b[]{AFTER_DOWNLOAD, AFTER_PROFILE_SAVE, NEWSHUB, PROFILE, UNKNOWN};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
    }

    private b(String str, int i13, String str2) {
        this.value = str2;
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
    public final String getValue() {
        return this.value;
    }

    public final boolean isNRT() {
        return this == AFTER_DOWNLOAD || this == AFTER_PROFILE_SAVE;
    }
}
