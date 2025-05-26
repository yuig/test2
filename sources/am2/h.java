package am2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class h {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    private final String codeRepresentation;
    public static final h CLASS = new h("CLASS", 0, "class");
    public static final h INTERFACE = new h("INTERFACE", 1, "interface");
    public static final h ENUM_CLASS = new h("ENUM_CLASS", 2, "enum class");
    public static final h ENUM_ENTRY = new h("ENUM_ENTRY", 3, null);
    public static final h ANNOTATION_CLASS = new h("ANNOTATION_CLASS", 4, "annotation class");
    public static final h OBJECT = new h("OBJECT", 5, "object");

    private static final /* synthetic */ h[] $values() {
        return new h[]{CLASS, INTERFACE, ENUM_CLASS, ENUM_ENTRY, ANNOTATION_CLASS, OBJECT};
    }

    static {
        h[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private h(String str, int i13, String str2) {
        this.codeRepresentation = str2;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final boolean isSingleton() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
