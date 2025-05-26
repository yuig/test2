package s80;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class r6 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ r6[] $VALUES;

    @NotNull
    public static final q6 Companion;
    private final int titleResId;
    public static final r6 HowItWorks = new r6("HowItWorks", 0, l7.collage_options_sheet_item_how_it_works);
    public static final r6 DownloadImage = new r6("DownloadImage", 1, l7.collage_options_sheet_item_download_image);
    public static final r6 StartNewCollage = new r6("StartNewCollage", 2, l7.collage_options_sheet_item_start_new_collage);
    public static final r6 DuplicateCollage = new r6("DuplicateCollage", 3, l7.collage_options_sheet_item_duplicate_draft);
    public static final r6 SaveAndExit = new r6("SaveAndExit", 4, l7.collage_options_sheet_item_save_draft_and_exit);

    private static final /* synthetic */ r6[] $values() {
        return new r6[]{HowItWorks, DownloadImage, StartNewCollage, DuplicateCollage, SaveAndExit};
    }

    static {
        r6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new q6();
    }

    private r6(String str, int i13, int i14) {
        this.titleResId = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static r6 valueOf(String str) {
        return (r6) Enum.valueOf(r6.class, str);
    }

    public static r6[] values() {
        return (r6[]) $VALUES.clone();
    }

    public final int getTitleResId() {
        return this.titleResId;
    }
}
