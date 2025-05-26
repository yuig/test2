package hg1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;

    @NotNull
    public static final c Companion;
    public static final d HOW_TO_CREATE_PINS = new d("HOW_TO_CREATE_PINS", 0);
    public static final d BEST_PRACTICES = new d("BEST_PRACTICES", 1);
    public static final d ANALYTICS_HELP_CENTER = new d("ANALYTICS_HELP_CENTER", 2);
    public static final d EXAMPLES = new d("EXAMPLES", 3);
    public static final d RESOURCES = new d("RESOURCES", 4);
    public static final d CREATOR_CODE = new d("CREATOR_CODE", 5);
    public static final d IDEA_PIN_TIPS = new d("IDEA_PIN_TIPS", 6);

    private static final /* synthetic */ d[] $values() {
        return new d[]{HOW_TO_CREATE_PINS, BEST_PRACTICES, ANALYTICS_HELP_CENTER, EXAMPLES, RESOURCES, CREATOR_CODE, IDEA_PIN_TIPS};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new c();
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
