package ls0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class g {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g FOLLOW_USER = new g("FOLLOW_USER", 0);
    public static final g FOLLOW_BOARD = new g("FOLLOW_BOARD", 1);
    public static final g FOLLOW_BOARD_USER = new g("FOLLOW_BOARD_USER", 2);
    public static final g FOLLOW_INTEREST = new g("FOLLOW_INTEREST", 3);
    public static final g FOLLOW_INTEREST_FEEDBACK_NOT_FOR_ME = new g("FOLLOW_INTEREST_FEEDBACK_NOT_FOR_ME", 4);
    public static final g UNFOLLOW_BOARD = new g("UNFOLLOW_BOARD", 5);
    public static final g UNFOLLOW_BOARD_USER = new g("UNFOLLOW_BOARD_USER", 6);
    public static final g UNFOLLOW_TOPIC = new g("UNFOLLOW_TOPIC", 7);
    public static final g UNFOLLOW_USER = new g("UNFOLLOW_USER", 8);
    public static final g DEFAULT_GRID_HIDE = new g("DEFAULT_GRID_HIDE", 9);
    public static final g PROMOTED = new g("PROMOTED", 10);
    public static final g PFY = new g("PFY", 11);
    public static final g PFY_BOARD = new g("PFY_BOARD", 12);
    public static final g DEMOGRAPHIC_PFY = new g("DEMOGRAPHIC_PFY", 13);
    public static final g REPORTED = new g("REPORTED", 14);
    public static final g DEFAULT_MODAL = new g("DEFAULT_MODAL", 15);
    public static final g FEEDBACK_LOW_QUALITY = new g("FEEDBACK_LOW_QUALITY", 16);
    public static final g FEEDBACK_NOT_FOR_ME = new g("FEEDBACK_NOT_FOR_ME", 17);
    public static final g FEEDBACK_REPETITIVE_AD = new g("FEEDBACK_REPETITIVE_AD", 18);
    public static final g FEEDBACK_LOW_QUALITY_AD = new g("FEEDBACK_LOW_QUALITY_AD", 19);
    public static final g FEEDBACK_NOT_FOR_ME_AD = new g("FEEDBACK_NOT_FOR_ME_AD", 20);
    public static final g FEEDBACK_FILTER_PIN = new g("FEEDBACK_FILTER_PIN", 21);
    public static final g FEEDBACK_FILTER_BOARD_PINS = new g("FEEDBACK_FILTER_BOARD_PINS", 22);
    public static final g THIRD_PARTY_GMA_AD = new g("THIRD_PARTY_GMA_AD", 23);
    public static final g SEE_FEWER_WEIGHT_LOSS_ADS = new g("SEE_FEWER_WEIGHT_LOSS_ADS", 24);
    public static final g GEN_AI_TOPIC_OPT_OUT = new g("GEN_AI_TOPIC_OPT_OUT", 25);

    private static final /* synthetic */ g[] $values() {
        return new g[]{FOLLOW_USER, FOLLOW_BOARD, FOLLOW_BOARD_USER, FOLLOW_INTEREST, FOLLOW_INTEREST_FEEDBACK_NOT_FOR_ME, UNFOLLOW_BOARD, UNFOLLOW_BOARD_USER, UNFOLLOW_TOPIC, UNFOLLOW_USER, DEFAULT_GRID_HIDE, PROMOTED, PFY, PFY_BOARD, DEMOGRAPHIC_PFY, REPORTED, DEFAULT_MODAL, FEEDBACK_LOW_QUALITY, FEEDBACK_NOT_FOR_ME, FEEDBACK_REPETITIVE_AD, FEEDBACK_LOW_QUALITY_AD, FEEDBACK_NOT_FOR_ME_AD, FEEDBACK_FILTER_PIN, FEEDBACK_FILTER_BOARD_PINS, THIRD_PARTY_GMA_AD, SEE_FEWER_WEIGHT_LOSS_ADS, GEN_AI_TOPIC_OPT_OUT};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private g(String str, int i13) {
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
}
