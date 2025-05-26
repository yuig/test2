package im2;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    private final String javaTarget;
    public static final b METHOD_RETURN_TYPE = new b("METHOD_RETURN_TYPE", 0, "METHOD");
    public static final b VALUE_PARAMETER = new b("VALUE_PARAMETER", 1, "PARAMETER");
    public static final b FIELD = new b("FIELD", 2, "FIELD");
    public static final b TYPE_USE = new b("TYPE_USE", 3, "TYPE_USE");
    public static final b TYPE_PARAMETER_BOUNDS = new b("TYPE_PARAMETER_BOUNDS", 4, "TYPE_USE");
    public static final b TYPE_PARAMETER = new b("TYPE_PARAMETER", 5, "TYPE_PARAMETER");

    private static final /* synthetic */ b[] $values() {
        return new b[]{METHOD_RETURN_TYPE, VALUE_PARAMETER, FIELD, TYPE_USE, TYPE_PARAMETER_BOUNDS, TYPE_PARAMETER};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private b(String str, int i13, String str2) {
        this.javaTarget = str2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    @NotNull
    public final String getJavaTarget() {
        return this.javaTarget;
    }
}
