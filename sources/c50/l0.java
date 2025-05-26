package c50;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class l0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ l0[] $VALUES;

    @NotNull
    public static final k0 Companion;
    public static final l0 HARASSMENT = new l0("HARASSMENT", 0, "HARASSMENT");
    public static final l0 NOT_INTERESTED = new l0("NOT_INTERESTED", 1, "NOT_INTERESTED");
    public static final l0 NOT_KNOWING_THIS_PERSON = new l0("NOT_KNOWING_THIS_PERSON", 2, "NOT_KNOWING_THIS_PERSON");
    public static final l0 OTHER = new l0("OTHER", 3, "OTHER");
    public static final l0 SELF_HARM = new l0("SELF_HARM", 4, "SELF_HARM");
    public static final l0 SPAM = new l0("SPAM", 5, "SPAM");
    public static final l0 UNKNOWN = new l0("UNKNOWN", 6, "UNKNOWN");
    public static final l0 UNKNOWN__ = new l0("UNKNOWN__", 7, "UNKNOWN__");

    @NotNull
    private static final pc.z type;

    @NotNull
    private final String rawValue;

    private static final /* synthetic */ l0[] $values() {
        return new l0[]{HARASSMENT, NOT_INTERESTED, NOT_KNOWING_THIS_PERSON, OTHER, SELF_HARM, SPAM, UNKNOWN, UNKNOWN__};
    }

    static {
        l0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new k0();
        type = new pc.z(kotlin.collections.f0.j("HARASSMENT", "NOT_INTERESTED", "NOT_KNOWING_THIS_PERSON", "OTHER", "SELF_HARM", "SPAM", "UNKNOWN"));
    }

    private l0(String str, int i13, String str2) {
        this.rawValue = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) $VALUES.clone();
    }

    @NotNull
    public final String getRawValue() {
        return this.rawValue;
    }
}
