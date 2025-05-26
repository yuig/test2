package mw1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    private final int color;
    private final int description;
    public static final b MOBILE = new b("MOBILE", 0, com.pinterest.partnerAnalytics.g.content_type_split_mobile_label, com.pinterest.partnerAnalytics.b.dynamic_red);
    public static final b WEB = new b("WEB", 1, com.pinterest.partnerAnalytics.g.content_type_split_web_label, eo1.b.color_themed_text_shopping);
    public static final b TABLET = new b("TABLET", 2, com.pinterest.partnerAnalytics.g.content_type_split_tablet_label, com.pinterest.partnerAnalytics.b.purple);

    private static final /* synthetic */ b[] $values() {
        return new b[]{MOBILE, WEB, TABLET};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private b(String str, int i13, int i14, int i15) {
        this.description = i14;
        this.color = i15;
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

    public final int getColor() {
        return this.color;
    }

    public final int getDescription() {
        return this.description;
    }
}
