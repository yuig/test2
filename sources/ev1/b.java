package ev1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b GENERIC_FEEDBACK_RESPONSE = new b("GENERIC_FEEDBACK_RESPONSE", 0);
    public static final b USEFULNESS_SURVEY_RESPONSE = new b("USEFULNESS_SURVEY_RESPONSE", 1);
    public static final b INTEREST_FEEDBACK_RESPONSE = new b("INTEREST_FEEDBACK_RESPONSE", 2);

    private static final /* synthetic */ b[] $values() {
        return new b[]{GENERIC_FEEDBACK_RESPONSE, USEFULNESS_SURVEY_RESPONSE, INTEREST_FEEDBACK_RESPONSE};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private b(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
