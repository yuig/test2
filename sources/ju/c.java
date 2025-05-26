package ju;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final b Companion;

    @NotNull
    private static final c[] VALUES;
    private final int value;
    public static final c TEXT_FIELD = new c("TEXT_FIELD", 0, 1);
    public static final c TEXT_AREA = new c("TEXT_AREA", 1, 2);
    public static final c RADIO_LIST = new c("RADIO_LIST", 2, 3);
    public static final c CHECKBOX = new c("CHECKBOX", 3, 4);
    public static final c DROPDOWN = new c("DROPDOWN", 4, 5);

    private static final /* synthetic */ c[] $values() {
        return new c[]{TEXT_FIELD, TEXT_AREA, RADIO_LIST, CHECKBOX, DROPDOWN};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new b();
        VALUES = values();
    }

    private c(String str, int i13, int i14) {
        this.value = i14;
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

    public final int getValue() {
        return this.value;
    }
}
