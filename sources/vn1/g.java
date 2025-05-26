package vn1;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import org.jetbrains.annotations.NotNull;
import rn1.n;

/* loaded from: classes2.dex */
public final class g extends Enum {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;

    @xk2.d
    public static final g HEADING_XL = new g("HEADING_XL", 0);
    public static final g HEADING_700 = new g("HEADING_700", 1);
    public static final g HEADING_600 = new g("HEADING_600", 2);
    public static final g HEADING_500 = new g("HEADING_500", 3);
    public static final g HEADING_400 = new g("HEADING_400", 4);
    public static final g HEADING_300 = new g("HEADING_300", 5);
    public static final g HEADING_200 = new g("HEADING_200", 6);
    public static final g BODY_400 = new g("BODY_400", 7);
    public static final g BODY_300 = new g("BODY_300", 8);
    public static final g BODY_200 = new g("BODY_200", 9);
    public static final g BODY_100 = new g("BODY_100", 10);
    public static final g UI_400 = new g("UI_400", 11);
    public static final g UI_300 = new g("UI_300", 12);
    public static final g UI_200 = new g("UI_200", 13);
    public static final g UI_100 = new g("UI_100", 14);
    public static final g COMPACT_100 = new g("COMPACT_100", 15);

    private static final /* synthetic */ g[] $values() {
        return new g[]{HEADING_XL, HEADING_700, HEADING_600, HEADING_500, HEADING_400, HEADING_300, HEADING_200, BODY_400, BODY_300, BODY_200, BODY_100, UI_400, UI_300, UI_200, UI_100, COMPACT_100};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private g(String str, int i13) {
        super(str, i13);
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

    @NotNull
    public final lm1.g getFont(@NotNull List<? extends e> style) {
        Intrinsics.checkNotNullParameter(style, "style");
        switch (f.f126274a[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return style.contains(e.ITALIC) ? lm1.g.BOLD_ITALIC : lm1.g.BOLD;
            case 5:
            case 6:
            case 7:
                return style.contains(e.ITALIC) ? lm1.g.MEDIUM_ITALIC : lm1.g.MEDIUM;
            case 8:
            case 9:
            case 10:
            case 11:
            case 16:
                e eVar = e.BOLD;
                boolean contains = style.contains(eVar);
                e eVar2 = e.ITALIC;
                return contains & style.contains(eVar2) ? lm1.g.BOLD_ITALIC : style.contains(eVar) ? lm1.g.BOLD : style.contains(eVar2) ? lm1.g.REGULAR_ITALIC : lm1.g.REGULAR;
            case 12:
            case 13:
            case 14:
            case 15:
                return style.contains(e.ITALIC) ? lm1.g.MEDIUM_ITALIC : lm1.g.MEDIUM;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int getFontSize() {
        switch (f.f126274a[ordinal()]) {
            case 1:
                return eo1.a.comp_text_heading_xl_font_size;
            case 2:
                return eo1.a.comp_text_heading_700_font_size;
            case 3:
                return eo1.a.comp_text_heading_600_font_size;
            case 4:
                return eo1.a.comp_text_heading_500_font_size;
            case 5:
                return eo1.a.comp_text_heading_400_font_size;
            case 6:
                return eo1.a.comp_text_heading_300_font_size;
            case 7:
                return eo1.a.comp_text_heading_200_font_size;
            case 8:
                return eo1.a.comp_text_body_400_font_size;
            case 9:
                return eo1.a.comp_text_body_300_font_size;
            case 10:
                return eo1.a.comp_text_body_200_font_size;
            case 11:
                return eo1.a.comp_text_body_100_font_size;
            case 12:
                return eo1.a.comp_text_ui_400_font_size;
            case 13:
                return eo1.a.comp_text_ui_300_font_size;
            case 14:
                return eo1.a.comp_text_ui_200_font_size;
            case 15:
                return eo1.a.comp_text_ui_100_font_size;
            case 16:
                return eo1.a.comp_text_compact_100_font_size;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int style$text_release(@NotNull List<? extends e> style) {
        Intrinsics.checkNotNullParameter(style, "style");
        switch (f.f126274a[ordinal()]) {
            case 1:
                return n.GestaltTextHeading_XL;
            case 2:
                return n.GestaltTextHeading_700;
            case 3:
                return n.GestaltTextHeading_600;
            case 4:
                return n.GestaltTextHeading_500;
            case 5:
                return n.GestaltTextHeading_400;
            case 6:
                return n.GestaltTextHeading_300;
            case 7:
                return n.GestaltTextHeading_200;
            case 8:
                return n.GestaltTextBody_400;
            case 9:
                return n.GestaltTextBody_300;
            case 10:
                return n.GestaltTextBody_200;
            case 11:
                return n.GestaltTextBody_100;
            case 12:
                return n.GestaltTextUI_400;
            case 13:
                return n.GestaltTextUI_300;
            case 14:
                return n.GestaltTextUI_200;
            case 15:
                return n.GestaltTextUI_100;
            case 16:
                return n.GestaltTextCompact_100;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
