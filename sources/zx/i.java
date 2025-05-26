package zx;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class i {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    private final int description;
    public static final i ALL = new i("ALL", 0, gy1.a.analytics_filter_all);
    public static final i STANDARD = new i("STANDARD", 1, gy1.a.analytics_filter_standard);
    public static final i VIDEO = new i("VIDEO", 2, gy1.a.analytics_filter_video);
    public static final i STORY = new i("STORY", 3, gy1.a.analytics_filter_idea);

    private static final /* synthetic */ i[] $values() {
        return new i[]{ALL, STANDARD, VIDEO, STORY};
    }

    static {
        i[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private i(String str, int i13, int i14) {
        this.description = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public final int getDescription() {
        return this.description;
    }
}
