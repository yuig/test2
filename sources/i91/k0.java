package i91;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class k0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ k0[] $VALUES;
    public static final k0 SCREENSHOT = new k0("SCREENSHOT", 0);
    public static final k0 DOWNLOAD = new k0("DOWNLOAD", 1);
    public static final k0 POST_IDEA_PIN_CREATE = new k0("POST_IDEA_PIN_CREATE", 2);

    private static final /* synthetic */ k0[] $values() {
        return new k0[]{SCREENSHOT, DOWNLOAD, POST_IDEA_PIN_CREATE};
    }

    static {
        k0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private k0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) $VALUES.clone();
    }
}
