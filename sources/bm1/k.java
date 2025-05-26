package bm1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class k implements l {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    private final int bottomLeftColor;
    private final int bottomRightColor;
    private final int topLeftColor;
    private final int topRightColor;
    public static final k SKIN_TONE_ONE = new k("SKIN_TONE_ONE", 0, w.skin_tone_one_top_left, w.skin_tone_one_top_right, w.skin_tone_one_bottom_left, w.skin_tone_one_bottom_right);
    public static final k SKIN_TONE_TWO = new k("SKIN_TONE_TWO", 1, w.skin_tone_two_top_left, w.skin_tone_two_top_right, w.skin_tone_two_bottom_left, w.skin_tone_two_bottom_right);
    public static final k SKIN_TONE_THREE = new k("SKIN_TONE_THREE", 2, w.skin_tone_three_top_left, w.skin_tone_three_top_right, w.skin_tone_three_bottom_left, w.skin_tone_three_bottom_right);
    public static final k SKIN_TONE_FOUR = new k("SKIN_TONE_FOUR", 3, w.skin_tone_four_top_left, w.skin_tone_four_top_right, w.skin_tone_four_bottom_left, w.skin_tone_four_bottom_right);

    private static final /* synthetic */ k[] $values() {
        return new k[]{SKIN_TONE_ONE, SKIN_TONE_TWO, SKIN_TONE_THREE, SKIN_TONE_FOUR};
    }

    static {
        k[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private k(String str, int i13, int i14, int i15, int i16, int i17) {
        this.topLeftColor = i14;
        this.topRightColor = i15;
        this.bottomLeftColor = i16;
        this.bottomRightColor = i17;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }

    public final int getBottomLeftColor() {
        return this.bottomLeftColor;
    }

    public final int getBottomRightColor() {
        return this.bottomRightColor;
    }

    public final int getTopLeftColor() {
        return this.topLeftColor;
    }

    public final int getTopRightColor() {
        return this.topRightColor;
    }
}
