package fd1;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class f1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f1[] $VALUES;
    public static final f1 NONE = new f1("NONE", 0);
    public static final f1 DOWNLOAD = new f1("DOWNLOAD", 1);
    public static final f1 SCREENSHOT = new f1("SCREENSHOT", 2);
    public static final f1 SHARE = new f1("SHARE", 3);

    private static final /* synthetic */ f1[] $values() {
        return new f1[]{NONE, DOWNLOAD, SCREENSHOT, SHARE};
    }

    static {
        f1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private f1(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static f1 valueOf(String str) {
        return (f1) Enum.valueOf(f1.class, str);
    }

    public static f1[] values() {
        return (f1[]) $VALUES.clone();
    }

    public final boolean isDownloadOrScreenshot() {
        return this == DOWNLOAD || this == SCREENSHOT;
    }
}
