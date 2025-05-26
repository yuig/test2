package p32;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class i {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;

    @NotNull
    public static final g Companion;
    public static final i NONE = new i("NONE", 0);
    public static final i PIN = new i("PIN", 1);
    public static final i BOARD = new i("BOARD", 2);
    public static final i PINNER = new i("PINNER", 3);
    public static final i MESSAGE = new i("MESSAGE", 4);
    public static final i ARTICLE = new i("ARTICLE", 5);
    public static final i DID_IT = new i("DID_IT", 6);
    public static final i COMMUNITY = new i("COMMUNITY", 7);
    public static final i TODAY_ARTICLE = new i("TODAY_ARTICLE", 8);
    public static final i CREATOR_CLASS = new i("CREATOR_CLASS", 9);
    public static final i SHOPPING_SPOTLIGHT = new i("SHOPPING_SPOTLIGHT", 10);
    public static final i SHUFFLE = new i("SHUFFLE", 11);
    public static final i QUIZ = new i("QUIZ", 12);
    public static final i QUIZ_OUTPUT = new i("QUIZ_OUTPUT", 13);
    public static final i PEAR_INSIGHT = new i("PEAR_INSIGHT", 14);
    public static final i MULTI_PIN_SHARE = new i("MULTI_PIN_SHARE", 15);

    private static final /* synthetic */ i[] $values() {
        return new i[]{NONE, PIN, BOARD, PINNER, MESSAGE, ARTICLE, DID_IT, COMMUNITY, TODAY_ARTICLE, CREATOR_CLASS, SHOPPING_SPOTLIGHT, SHUFFLE, QUIZ, QUIZ_OUTPUT, PEAR_INSIGHT, MULTI_PIN_SHARE};
    }

    static {
        i[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new g();
    }

    private i(String str, int i13) {
    }

    public static final i findByValue(int i13) {
        Companion.getClass();
        switch (i13) {
            case 0:
                return NONE;
            case 1:
                return PIN;
            case 2:
                return BOARD;
            case 3:
                return PINNER;
            case 4:
                return MESSAGE;
            case 5:
                return ARTICLE;
            case 6:
                return DID_IT;
            case 7:
                return COMMUNITY;
            case 8:
                return TODAY_ARTICLE;
            case 9:
                return CREATOR_CLASS;
            case 10:
                return SHOPPING_SPOTLIGHT;
            case 11:
                return SHUFFLE;
            case 12:
                return QUIZ;
            case 13:
                return QUIZ_OUTPUT;
            case 14:
                return PEAR_INSIGHT;
            case 15:
                return MULTI_PIN_SHARE;
            default:
                return null;
        }
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (h.f98767a[ordinal()]) {
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
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
