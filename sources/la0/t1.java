package la0;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class t1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ t1[] $VALUES;

    @NotNull
    public static final s1 Companion;
    private final int titleResId;
    public static final t1 Duplicate = new t1("Duplicate", 0, ka0.b0.collages_retrieval_sheet_item_duplicate);
    public static final t1 Delete = new t1("Delete", 1, ka0.b0.collages_retrieval_sheet_item_delete);
    public static final t1 DownloadImage = new t1("DownloadImage", 2, ka0.b0.collages_retrieval_sheet_item_download_image);

    private static final /* synthetic */ t1[] $values() {
        return new t1[]{Duplicate, Delete, DownloadImage};
    }

    static {
        t1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new s1();
    }

    private t1(String str, int i13, int i14) {
        this.titleResId = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static t1 valueOf(String str) {
        return (t1) Enum.valueOf(t1.class, str);
    }

    public static t1[] values() {
        return (t1[]) $VALUES.clone();
    }

    public final int getTitleResId() {
        return this.titleResId;
    }
}
