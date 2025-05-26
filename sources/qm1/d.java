package qm1;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d DEFAULT = new d("DEFAULT", 0, eo1.a.comp_iconbuttonfloating_icon_color_default, eo1.a.comp_iconbuttonfloating_container_color_default);
    public static final d SELECTED = new d("SELECTED", 1, eo1.a.comp_iconbuttonfloating_icon_color_selected, eo1.a.comp_iconbuttonfloating_container_color_selected);
    private final int backgroundColor;
    private final int iconColor;

    private static final /* synthetic */ d[] $values() {
        return new d[]{DEFAULT, SELECTED};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private d(String str, int i13, int i14, int i15) {
        this.iconColor = i14;
        this.backgroundColor = i15;
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

    public final int getBackgroundColor$iconbuttonfloating_release() {
        return this.backgroundColor;
    }

    public final int getIconColor$iconbuttonfloating_release() {
        return this.iconColor;
    }

    @NotNull
    public final d inverse$iconbuttonfloating_release() {
        int i13 = c.f104387a[ordinal()];
        if (i13 == 1) {
            return SELECTED;
        }
        if (i13 == 2) {
            return DEFAULT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
