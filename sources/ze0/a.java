package ze0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    private final int imageCount;
    public static final a ContentList = new a("ContentList", 0, 4);
    public static final a ContentListCard = new a("ContentListCard", 1, 4);
    public static final a Wide = new a("Wide", 2, 3);
    public static final a Default = new a("Default", 3, 2);
    public static final a Compact = new a("Compact", 4, 1);
    public static final a List = new a("List", 5, 0);
    public static final a NoPreview = new a("NoPreview", 6, 0);
    public static final a ContentListWide = new a("ContentListWide", 7, 3);

    private static final /* synthetic */ a[] $values() {
        return new a[]{ContentList, ContentListCard, Wide, Default, Compact, List, NoPreview, ContentListWide};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13, int i14) {
        this.imageCount = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final int getImageCount() {
        return this.imageCount;
    }
}
