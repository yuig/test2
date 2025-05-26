package sh0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d MULTI_SELECT = new d("MULTI_SELECT", 0);
    public static final d RATING = new d("RATING", 1);
    public static final d LIKELIHOOD = new d("LIKELIHOOD", 2);
    public static final d AGREEMENT = new d("AGREEMENT", 3);
    public static final d UNKNOWN = new d("UNKNOWN", 4);
    public static final d YES_NO_UNSURE = new d("YES_NO_UNSURE", 5);

    private static final /* synthetic */ d[] $values() {
        return new d[]{MULTI_SELECT, RATING, LIKELIHOOD, AGREEMENT, UNKNOWN, YES_NO_UNSURE};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private d(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
