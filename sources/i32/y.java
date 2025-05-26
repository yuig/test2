package i32;

/* loaded from: classes4.dex */
public final class y {
    public static a0 a(int i13) {
        if (i13 == 0) {
            return a0.NOOP;
        }
        if (i13 == 1) {
            return a0.DEFAULT;
        }
        if (i13 == 2) {
            return a0.NAG;
        }
        if (i13 == 3) {
            return a0.GUIDE;
        }
        if (i13 == 5) {
            return a0.SURVEY;
        }
        if (i13 == 14) {
            return a0.ACTION_PROMPT;
        }
        if (i13 == 17) {
            return a0.BANNER;
        }
        if (i13 == 20) {
            return a0.FLASHLIGHT;
        }
        if (i13 == 22) {
            return a0.LENS;
        }
        if (i13 == 8) {
            return a0.TOOLTIP;
        }
        if (i13 == 9) {
            return a0.NUX;
        }
        switch (i13) {
            case 25:
                return a0.ANNOUNCEMENT_MODAL;
            case 26:
                return a0.MODAL_WINDOW;
            case 27:
                return a0.CALLOUT;
            case 28:
                return a0.UPSELL;
            case 29:
                return a0.POPOVER;
            case 30:
                return a0.HIGHLIGHT_NOTIFICATION;
            case 31:
                return a0.MOTIF_UPSELL_BANNER;
            default:
                return null;
        }
    }
}
