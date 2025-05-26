package lu;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b0[] $VALUES;
    public static final b0 QUESTIONNAIRE = new b0("QUESTIONNAIRE", 0);
    public static final b0 EXPANDED_VIEW = new b0("EXPANDED_VIEW", 1);
    public static final b0 FALLBACK_VIEW = new b0("FALLBACK_VIEW", 2);

    private static final /* synthetic */ b0[] $values() {
        return new b0[]{QUESTIONNAIRE, EXPANDED_VIEW, FALLBACK_VIEW};
    }

    static {
        b0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private b0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) $VALUES.clone();
    }
}
