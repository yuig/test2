package rn2;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class i {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;

    @NotNull
    private final String debugMessage;
    public static final i CAPTURED_TYPE_SCOPE = new i("CAPTURED_TYPE_SCOPE", 0, "No member resolution should be done on captured type, it used only during constraint system resolution");
    public static final i INTEGER_LITERAL_TYPE_SCOPE = new i("INTEGER_LITERAL_TYPE_SCOPE", 1, "Scope for integer literal type (%s)");
    public static final i ERASED_RECEIVER_TYPE_SCOPE = new i("ERASED_RECEIVER_TYPE_SCOPE", 2, "Error scope for erased receiver type");
    public static final i SCOPE_FOR_ABBREVIATION_TYPE = new i("SCOPE_FOR_ABBREVIATION_TYPE", 3, "Scope for abbreviation %s");
    public static final i STUB_TYPE_SCOPE = new i("STUB_TYPE_SCOPE", 4, "Scope for stub type %s");
    public static final i NON_CLASSIFIER_SUPER_TYPE_SCOPE = new i("NON_CLASSIFIER_SUPER_TYPE_SCOPE", 5, "A scope for common supertype which is not a normal classifier");
    public static final i ERROR_TYPE_SCOPE = new i("ERROR_TYPE_SCOPE", 6, "Scope for error type %s");
    public static final i UNSUPPORTED_TYPE_SCOPE = new i("UNSUPPORTED_TYPE_SCOPE", 7, "Scope for unsupported type %s");
    public static final i SCOPE_FOR_ERROR_CLASS = new i("SCOPE_FOR_ERROR_CLASS", 8, "Error scope for class %s with arguments: %s");
    public static final i SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE = new i("SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE", 9, "Error resolution candidate for call %s");

    private static final /* synthetic */ i[] $values() {
        return new i[]{CAPTURED_TYPE_SCOPE, INTEGER_LITERAL_TYPE_SCOPE, ERASED_RECEIVER_TYPE_SCOPE, SCOPE_FOR_ABBREVIATION_TYPE, STUB_TYPE_SCOPE, NON_CLASSIFIER_SUPER_TYPE_SCOPE, ERROR_TYPE_SCOPE, UNSUPPORTED_TYPE_SCOPE, SCOPE_FOR_ERROR_CLASS, SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE};
    }

    static {
        i[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private i(String str, int i13, String str2) {
        this.debugMessage = str2;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    @NotNull
    public final String getDebugMessage() {
        return this.debugMessage;
    }
}
