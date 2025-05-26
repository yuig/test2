package l32;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final c BLOCK_SINGLE_PFY_PIN = new c("BLOCK_SINGLE_PFY_PIN", 0);
    public static final c BLOCK_PFY_THROUGH_BOARD = new c("BLOCK_PFY_THROUGH_BOARD", 1);
    public static final c BLOCK_ALL_PFY_PINS = new c("BLOCK_ALL_PFY_PINS", 2);
    public static final c BLOCK_PFY_THROUGH_PIN = new c("BLOCK_PFY_THROUGH_PIN", 3);
    public static final c BLOCK_PFY_THROUGH_INTEREST = new c("BLOCK_PFY_THROUGH_INTEREST", 4);
    public static final c BLOCK_THROUGH_OBJECT = new c("BLOCK_THROUGH_OBJECT", 5);
    public static final c BLOCK_RECOMMENDED_OBJECT = new c("BLOCK_RECOMMENDED_OBJECT", 6);
    public static final c BLOCK_ARCHIVED_BOARD = new c("BLOCK_ARCHIVED_BOARD", 7);
    public static final c UNBLOCK_ARCHIVED_BOARD = new c("UNBLOCK_ARCHIVED_BOARD", 8);
    public static final c BLOCK_ONLY_THIS_PIN = new c("BLOCK_ONLY_THIS_PIN", 9);
    public static final c BLOCK_PRIVATE_BOARD = new c("BLOCK_PRIVATE_BOARD", 10);
    public static final c UNBLOCK_PRIVATE_BOARD = new c("UNBLOCK_PRIVATE_BOARD", 11);
    public static final c BLOCK_ORIGINAL_CREATOR = new c("BLOCK_ORIGINAL_CREATOR", 12);
    public static final c CONTEXTUAL = new c("CONTEXTUAL", 13);

    private static final /* synthetic */ c[] $values() {
        return new c[]{BLOCK_SINGLE_PFY_PIN, BLOCK_PFY_THROUGH_BOARD, BLOCK_ALL_PFY_PINS, BLOCK_PFY_THROUGH_PIN, BLOCK_PFY_THROUGH_INTEREST, BLOCK_THROUGH_OBJECT, BLOCK_RECOMMENDED_OBJECT, BLOCK_ARCHIVED_BOARD, UNBLOCK_ARCHIVED_BOARD, BLOCK_ONLY_THIS_PIN, BLOCK_PRIVATE_BOARD, UNBLOCK_PRIVATE_BOARD, BLOCK_ORIGINAL_CREATOR, CONTEXTUAL};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
    }

    private c(String str, int i13) {
    }

    public static final c findByValue(int i13) {
        Companion.getClass();
        switch (i13) {
            case 1:
                return BLOCK_SINGLE_PFY_PIN;
            case 2:
                return BLOCK_PFY_THROUGH_BOARD;
            case 3:
                return BLOCK_ALL_PFY_PINS;
            case 4:
                return BLOCK_PFY_THROUGH_PIN;
            case 5:
                return BLOCK_PFY_THROUGH_INTEREST;
            case 6:
                return BLOCK_THROUGH_OBJECT;
            case 7:
                return BLOCK_RECOMMENDED_OBJECT;
            case 8:
                return BLOCK_ARCHIVED_BOARD;
            case 9:
                return UNBLOCK_ARCHIVED_BOARD;
            case 10:
                return BLOCK_ONLY_THIS_PIN;
            case 11:
                return BLOCK_PRIVATE_BOARD;
            case 12:
                return UNBLOCK_PRIVATE_BOARD;
            case 13:
                return BLOCK_ORIGINAL_CREATOR;
            case 14:
                return CONTEXTUAL;
            default:
                return null;
        }
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (b.f81525a[ordinal()]) {
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
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
