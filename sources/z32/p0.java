package z32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class p0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ p0[] $VALUES;

    @NotNull
    public static final n0 Companion;
    public static final p0 PIN = new p0("PIN", 0);
    public static final p0 USER = new p0("USER", 1);
    public static final p0 BOARD = new p0("BOARD", 2);
    public static final p0 EXPLORE_ARTICLE = new p0("EXPLORE_ARTICLE", 3);
    public static final p0 PRODUCT_GROUP = new p0("PRODUCT_GROUP", 4);
    public static final p0 STORY_PIN = new p0("STORY_PIN", 5);
    public static final p0 BOARD_MORE_IDEAS_UPSELL = new p0("BOARD_MORE_IDEAS_UPSELL", 6);
    public static final p0 PIN_CLUSTER = new p0("PIN_CLUSTER", 7);
    public static final p0 SHUFFLE = new p0("SHUFFLE", 8);
    public static final p0 STORY = new p0("STORY", 9);

    private static final /* synthetic */ p0[] $values() {
        return new p0[]{PIN, USER, BOARD, EXPLORE_ARTICLE, PRODUCT_GROUP, STORY_PIN, BOARD_MORE_IDEAS_UPSELL, PIN_CLUSTER, SHUFFLE, STORY};
    }

    static {
        p0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new n0();
    }

    private p0(String str, int i13) {
    }

    public static final p0 findByValue(int i13) {
        Companion.getClass();
        return n0.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (o0.f140827a[ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
