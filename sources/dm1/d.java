package dm1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d NEUTRAL = new d("NEUTRAL", 0);
    public static final d WARNING = new d("WARNING", 1);
    public static final d INFO = new d("INFO", 2);
    public static final d RECOMMENDATION = new d("RECOMMENDATION", 3);
    public static final d SUCCESS = new d("SUCCESS", 4);
    public static final d ERROR = new d("ERROR", 5);

    private static final /* synthetic */ d[] $values() {
        return new d[]{NEUTRAL, WARNING, INFO, RECOMMENDATION, SUCCESS, ERROR};
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
