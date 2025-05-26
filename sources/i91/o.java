package i91;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class o {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o DOWNLOAD = new o("DOWNLOAD", 0);
    public static final o INSTAGRAM_STORIES_SHARE = new o("INSTAGRAM_STORIES_SHARE", 1);
    public static final o FACEBOOK_STORIES_SHARE = new o("FACEBOOK_STORIES_SHARE", 2);

    private static final /* synthetic */ o[] $values() {
        return new o[]{DOWNLOAD, INSTAGRAM_STORIES_SHARE, FACEBOOK_STORIES_SHARE};
    }

    static {
        o[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private o(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
