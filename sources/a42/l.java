package a42;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class l {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;

    @NotNull
    public static final j Companion;
    public static final l MENTION = new l("MENTION", 0);
    public static final l PRODUCT_TAG = new l("PRODUCT_TAG", 1);
    public static final l COMMENT_REPLY = new l("COMMENT_REPLY", 2);
    public static final l VIRTUAL_TRY_ON = new l("VIRTUAL_TRY_ON", 3);
    public static final l IMAGE_STICKER = new l("IMAGE_STICKER", 4);
    public static final l BOARD_STICKER = new l("BOARD_STICKER", 5);
    public static final l LOCATION_STICKER = new l("LOCATION_STICKER", 6);
    public static final l QUESTION_STICKER = new l("QUESTION_STICKER", 7);

    private static final /* synthetic */ l[] $values() {
        return new l[]{MENTION, PRODUCT_TAG, COMMENT_REPLY, VIRTUAL_TRY_ON, IMAGE_STICKER, BOARD_STICKER, LOCATION_STICKER, QUESTION_STICKER};
    }

    static {
        l[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new j();
    }

    private l(String str, int i13) {
    }

    public static final l findByValue(int i13) {
        Companion.getClass();
        switch (i13) {
            case 0:
                return MENTION;
            case 1:
                return PRODUCT_TAG;
            case 2:
                return COMMENT_REPLY;
            case 3:
                return VIRTUAL_TRY_ON;
            case 4:
                return IMAGE_STICKER;
            case 5:
                return BOARD_STICKER;
            case 6:
                return LOCATION_STICKER;
            case 7:
                return QUESTION_STICKER;
            default:
                return null;
        }
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (k.f704a[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
