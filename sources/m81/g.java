package m81;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class g {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g RESULTS = new g("RESULTS", 0);
    public static final g RESULTS_STELA = new g("RESULTS_STELA", 1);
    public static final g RESULTS_ERROR = new g("RESULTS_ERROR", 2);
    public static final g HISTORY = new g("HISTORY", 3);
    public static final g GALLERY_PHOTOS = new g("GALLERY_PHOTOS", 4);
    public static final g GALLERY_DIRECTORIES = new g("GALLERY_DIRECTORIES", 5);
    public static final g NONE = new g("NONE", 6);

    private static final /* synthetic */ g[] $values() {
        return new g[]{RESULTS, RESULTS_STELA, RESULTS_ERROR, HISTORY, GALLERY_PHOTOS, GALLERY_DIRECTORIES, NONE};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private g(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
