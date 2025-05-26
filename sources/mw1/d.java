package mw1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    private final int color;
    private final int description;
    public static final d STANDARD = new d("STANDARD", 0, com.pinterest.partnerAnalytics.g.content_type_split_standard_label, com.pinterest.partnerAnalytics.b.purple);
    public static final d PRODUCT = new d("PRODUCT", 1, com.pinterest.partnerAnalytics.g.content_type_split_product_label, com.pinterest.partnerAnalytics.b.green);
    public static final d VIDEO = new d("VIDEO", 2, com.pinterest.partnerAnalytics.g.content_type_split_video_label, com.pinterest.partnerAnalytics.b.dynamic_red);
    public static final d STORY = new d("STORY", 3, com.pinterest.partnerAnalytics.g.content_type_split_idea_label, eo1.b.color_themed_text_shopping);
    public static final d STL = new d("STL", 4, com.pinterest.partnerAnalytics.g.content_type_split_stl_label, com.pinterest.partnerAnalytics.b.orange);

    private static final /* synthetic */ d[] $values() {
        return new d[]{STANDARD, PRODUCT, VIDEO, STORY, STL};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private d(String str, int i13, int i14, int i15) {
        this.description = i14;
        this.color = i15;
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

    public final int getColor() {
        return this.color;
    }

    public final int getDescription() {
        return this.description;
    }
}
