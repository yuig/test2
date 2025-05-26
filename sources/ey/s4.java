package ey;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class s4 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ s4[] $VALUES;
    public static final s4 PAGES_PREVIEW = new s4("PAGES_PREVIEW", 0);
    public static final s4 PAGES_ALREADY_EXISTED_IN_PIN = new s4("PAGES_ALREADY_EXISTED_IN_PIN", 1);
    public static final s4 PLACEHOLDER_PAGE = new s4("PLACEHOLDER_PAGE", 2);
    public static final s4 PAGES_FROM_PIN_API_FETCH = new s4("PAGES_FROM_PIN_API_FETCH", 3);

    private static final /* synthetic */ s4[] $values() {
        return new s4[]{PAGES_PREVIEW, PAGES_ALREADY_EXISTED_IN_PIN, PLACEHOLDER_PAGE, PAGES_FROM_PIN_API_FETCH};
    }

    static {
        s4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private s4(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static s4 valueOf(String str) {
        return (s4) Enum.valueOf(s4.class, str);
    }

    public static s4[] values() {
        return (s4[]) $VALUES.clone();
    }
}
