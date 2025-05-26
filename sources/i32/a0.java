package i32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a0[] $VALUES;

    @NotNull
    public static final y Companion;
    public static final a0 NOOP = new a0("NOOP", 0);
    public static final a0 DEFAULT = new a0("DEFAULT", 1);
    public static final a0 NAG = new a0("NAG", 2);
    public static final a0 GUIDE = new a0("GUIDE", 3);
    public static final a0 SURVEY = new a0("SURVEY", 4);
    public static final a0 TOOLTIP = new a0("TOOLTIP", 5);
    public static final a0 NUX = new a0("NUX", 6);
    public static final a0 ACTION_PROMPT = new a0("ACTION_PROMPT", 7);
    public static final a0 BANNER = new a0("BANNER", 8);
    public static final a0 FLASHLIGHT = new a0("FLASHLIGHT", 9);
    public static final a0 LENS = new a0("LENS", 10);
    public static final a0 ANNOUNCEMENT_MODAL = new a0("ANNOUNCEMENT_MODAL", 11);
    public static final a0 MODAL_WINDOW = new a0("MODAL_WINDOW", 12);
    public static final a0 CALLOUT = new a0("CALLOUT", 13);
    public static final a0 UPSELL = new a0("UPSELL", 14);
    public static final a0 POPOVER = new a0("POPOVER", 15);
    public static final a0 HIGHLIGHT_NOTIFICATION = new a0("HIGHLIGHT_NOTIFICATION", 16);
    public static final a0 MOTIF_UPSELL_BANNER = new a0("MOTIF_UPSELL_BANNER", 17);

    private static final /* synthetic */ a0[] $values() {
        return new a0[]{NOOP, DEFAULT, NAG, GUIDE, SURVEY, TOOLTIP, NUX, ACTION_PROMPT, BANNER, FLASHLIGHT, LENS, ANNOUNCEMENT_MODAL, MODAL_WINDOW, CALLOUT, UPSELL, POPOVER, HIGHLIGHT_NOTIFICATION, MOTIF_UPSELL_BANNER};
    }

    static {
        a0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new y();
    }

    private a0(String str, int i13) {
    }

    public static final a0 findByValue(int i13) {
        Companion.getClass();
        return y.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (z.f71498a[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 5;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 14;
            case 9:
                return 17;
            case 10:
                return 20;
            case 11:
                return 22;
            case 12:
                return 25;
            case 13:
                return 26;
            case 14:
                return 27;
            case 15:
                return 28;
            case 16:
                return 29;
            case 17:
                return 30;
            case 18:
                return 31;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
