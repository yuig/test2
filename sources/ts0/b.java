package ts0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import lb.l0;
import org.jetbrains.annotations.NotNull;
import xp1.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b All = new b("All", 0, d.homefeed_tuner_filter_selection_all, null, 2, null);

    @NotNull
    public static final a Companion;
    public static final b Saved = new b("Saved", 1, d.homefeed_tuner_filter_selection_saved, "saved");
    public static final b Viewed = new b("Viewed", 2, d.homefeed_tuner_filter_selection_viewed, "viewed");
    private final String filterParam;
    private final int title;

    private static final /* synthetic */ b[] $values() {
        return new b[]{All, Saved, Viewed};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
    }

    public /* synthetic */ b(String str, int i13, int i14, String str2, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, i14, (i15 & 2) != 0 ? null : str2);
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

    public final String getFilterParam() {
        return this.filterParam;
    }

    public final int getTitle() {
        return this.title;
    }

    private b(String str, int i13, int i14, String str2) {
        this.title = i14;
        this.filterParam = str2;
    }
}
