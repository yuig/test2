package rn2;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    private final String debugText;
    public static final b ERROR_CLASS = new b("ERROR_CLASS", 0, "<Error class: %s>");
    public static final b ERROR_FUNCTION = new b("ERROR_FUNCTION", 1, "<Error function>");
    public static final b ERROR_SCOPE = new b("ERROR_SCOPE", 2, "<Error scope>");
    public static final b ERROR_MODULE = new b("ERROR_MODULE", 3, "<Error module>");
    public static final b ERROR_PROPERTY = new b("ERROR_PROPERTY", 4, "<Error property>");
    public static final b ERROR_TYPE = new b("ERROR_TYPE", 5, "[Error type: %s]");
    public static final b PARENT_OF_ERROR_SCOPE = new b("PARENT_OF_ERROR_SCOPE", 6, "<Fake parent for error lexical scope>");

    private static final /* synthetic */ b[] $values() {
        return new b[]{ERROR_CLASS, ERROR_FUNCTION, ERROR_SCOPE, ERROR_MODULE, ERROR_PROPERTY, ERROR_TYPE, PARENT_OF_ERROR_SCOPE};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private b(String str, int i13, String str2) {
        this.debugText = str2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    @NotNull
    public final String getDebugText() {
        return this.debugText;
    }
}
