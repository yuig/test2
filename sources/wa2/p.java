package wa2;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class p {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p STATE_NO_FEEDBACK = new p("STATE_NO_FEEDBACK", 0);
    public static final p STATE_REPORTED = new p("STATE_REPORTED", 1);
    public static final p STATE_UNLIKED_BOARD = new p("STATE_UNLIKED_BOARD", 2);
    public static final p STATE_UNFOLLOWED_BOARD = new p("STATE_UNFOLLOWED_BOARD", 3);
    public static final p STATE_UNLIKED_USER = new p("STATE_UNLIKED_USER", 4);
    public static final p STATE_UNFOLLOWED_USER = new p("STATE_UNFOLLOWED_USER", 5);
    public static final p STATE_UNLIKED_INTEREST = new p("STATE_UNLIKED_INTEREST", 6);
    public static final p STATE_UNFOLLOWED_INTEREST = new p("STATE_UNFOLLOWED_INTEREST", 7);
    public static final p STATE_NOT_RELEVANT = new p("STATE_NOT_RELEVANT", 8);
    public static final p STATE_NOT_INTO = new p("STATE_NOT_INTO", 9);
    public static final p STATE_HIDDEN = new p("STATE_HIDDEN", 10);
    public static final p STATE_DOESNT_BELONG = new p("STATE_DOESNT_BELONG", 11);
    public static final p STATE_UNDO_UNFOLLOWED_BOARD = new p("STATE_UNDO_UNFOLLOWED_BOARD", 12);
    public static final p STATE_UNDO_UNFOLLOWED_USER = new p("STATE_UNDO_UNFOLLOWED_USER", 13);
    public static final p STATE_UNDO_UNFOLLOWED_INTEREST = new p("STATE_UNDO_UNFOLLOWED_INTEREST", 14);
    public static final p STATE_LOW_QUALITY = new p("STATE_LOW_QUALITY", 15);
    public static final p STATE_TOPIC_NOT_FOR_ME = new p("STATE_TOPIC_NOT_FOR_ME", 16);
    public static final p STATE_REPETITIVE_AD = new p("STATE_REPETITIVE_AD", 17);
    public static final p STATE_LOW_QUALITY_AD = new p("STATE_LOW_QUALITY_AD", 18);
    public static final p STATE_TOPIC_NOT_FOR_ME_AD = new p("STATE_TOPIC_NOT_FOR_ME_AD", 19);
    public static final p STATE_FILTER_PIN = new p("STATE_FILTER_PIN", 20);
    public static final p STATE_FILTER_BOARD_PINS = new p("STATE_FILTER_BOARD_PINS", 21);
    public static final p STATE_UNDO_FILTER_PIN = new p("STATE_UNDO_FILTER_PIN", 22);
    public static final p STATE_UNDO_FILTER_BOARD_PINS = new p("STATE_UNDO_FILTER_BOARD_PINS", 23);
    public static final p STATE_HIDDEN_CREATOR = new p("STATE_HIDDEN_CREATOR", 24);
    public static final p STATE_HIDDEN_WEIGHT_LOSS_AD = new p("STATE_HIDDEN_WEIGHT_LOSS_AD", 25);
    public static final p STATE_GEN_AI_TOPIC_OPT_OUT = new p("STATE_GEN_AI_TOPIC_OPT_OUT", 26);

    private static final /* synthetic */ p[] $values() {
        return new p[]{STATE_NO_FEEDBACK, STATE_REPORTED, STATE_UNLIKED_BOARD, STATE_UNFOLLOWED_BOARD, STATE_UNLIKED_USER, STATE_UNFOLLOWED_USER, STATE_UNLIKED_INTEREST, STATE_UNFOLLOWED_INTEREST, STATE_NOT_RELEVANT, STATE_NOT_INTO, STATE_HIDDEN, STATE_DOESNT_BELONG, STATE_UNDO_UNFOLLOWED_BOARD, STATE_UNDO_UNFOLLOWED_USER, STATE_UNDO_UNFOLLOWED_INTEREST, STATE_LOW_QUALITY, STATE_TOPIC_NOT_FOR_ME, STATE_REPETITIVE_AD, STATE_LOW_QUALITY_AD, STATE_TOPIC_NOT_FOR_ME_AD, STATE_FILTER_PIN, STATE_FILTER_BOARD_PINS, STATE_UNDO_FILTER_PIN, STATE_UNDO_FILTER_BOARD_PINS, STATE_HIDDEN_CREATOR, STATE_HIDDEN_WEIGHT_LOSS_AD, STATE_GEN_AI_TOPIC_OPT_OUT};
    }

    static {
        p[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private p(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
