package xe1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class h {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h BACKGROUND = new h("BACKGROUND", 0);
    public static final h AVATAR_STACK = new h("AVATAR_STACK", 1);
    public static final h TITLE = new h("TITLE", 2);
    public static final h BUTTON = new h("BUTTON", 3);
    public static final h ICON = new h("ICON", 4);

    private static final /* synthetic */ h[] $values() {
        return new h[]{BACKGROUND, AVATAR_STACK, TITLE, BUTTON, ICON};
    }

    static {
        h[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private h(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
