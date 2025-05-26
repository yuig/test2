package l32;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class f {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;

    @NotNull
    public static final d Companion;
    public static final f OTHER_REASON = new f("OTHER_REASON", 0);
    public static final f NOT_INTERESTED = new f("NOT_INTERESTED", 1);
    public static final f NOT_MY_TASTE_OR_STYLE = new f("NOT_MY_TASTE_OR_STYLE", 2);
    public static final f NOT_INTERESTING = new f("NOT_INTERESTING", 3);
    public static final f NO_LONGER_RELEVANT = new f("NO_LONGER_RELEVANT", 4);
    public static final f OFFENSIVE = new f("OFFENSIVE", 5);
    public static final f SEEN_IT_BEFORE = new f("SEEN_IT_BEFORE", 6);
    public static final f TOO_MANY_RECOMMENDATIONS = new f("TOO_MANY_RECOMMENDATIONS", 7);
    public static final f DO_NOT_WANT_RECOMMENDATIONS = new f("DO_NOT_WANT_RECOMMENDATIONS", 8);
    public static final f DO_NOT_LIKE_ADS = new f("DO_NOT_LIKE_ADS", 9);
    public static final f DO_NOT_WANT_ALCOHOL_ADS = new f("DO_NOT_WANT_ALCOHOL_ADS", 10);
    public static final f MISSING_REASON = new f("MISSING_REASON", 11);
    public static final f LOW_QUALITY = new f("LOW_QUALITY", 12);
    public static final f NOT_FOR_ME = new f("NOT_FOR_ME", 13);
    public static final f NOT_MY_LANGUAGE = new f("NOT_MY_LANGUAGE", 14);
    public static final f AD_LOW_QUALITY = new f("AD_LOW_QUALITY", 15);
    public static final f AD_NOT_MY_TASTE = new f("AD_NOT_MY_TASTE", 16);
    public static final f AD_SEE_TOO_MANY_TIMES = new f("AD_SEE_TOO_MANY_TIMES", 17);
    public static final f REPETITIVE = new f("REPETITIVE", 18);
    public static final f BLURRY_OR_HARD_TO_READ = new f("BLURRY_OR_HARD_TO_READ", 19);
    public static final f NOT_RELEVANT_TO_SKIN_TONE = new f("NOT_RELEVANT_TO_SKIN_TONE", 20);
    public static final f NOT_RELEVANT_TO_HAIR_PATTERN = new f("NOT_RELEVANT_TO_HAIR_PATTERN", 21);
    public static final f NOT_RELEVANT_TO_BODY_TYPE = new f("NOT_RELEVANT_TO_BODY_TYPE", 22);

    private static final /* synthetic */ f[] $values() {
        return new f[]{OTHER_REASON, NOT_INTERESTED, NOT_MY_TASTE_OR_STYLE, NOT_INTERESTING, NO_LONGER_RELEVANT, OFFENSIVE, SEEN_IT_BEFORE, TOO_MANY_RECOMMENDATIONS, DO_NOT_WANT_RECOMMENDATIONS, DO_NOT_LIKE_ADS, DO_NOT_WANT_ALCOHOL_ADS, MISSING_REASON, LOW_QUALITY, NOT_FOR_ME, NOT_MY_LANGUAGE, AD_LOW_QUALITY, AD_NOT_MY_TASTE, AD_SEE_TOO_MANY_TIMES, REPETITIVE, BLURRY_OR_HARD_TO_READ, NOT_RELEVANT_TO_SKIN_TONE, NOT_RELEVANT_TO_HAIR_PATTERN, NOT_RELEVANT_TO_BODY_TYPE};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new d();
    }

    private f(String str, int i13) {
    }

    public static final f findByValue(int i13) {
        Companion.getClass();
        switch (i13) {
            case 0:
                return OTHER_REASON;
            case 1:
                return NOT_INTERESTED;
            case 2:
                return OFFENSIVE;
            case 3:
                return SEEN_IT_BEFORE;
            case 4:
                return TOO_MANY_RECOMMENDATIONS;
            case 5:
                return DO_NOT_WANT_RECOMMENDATIONS;
            case 6:
                return DO_NOT_LIKE_ADS;
            case 7:
                return DO_NOT_WANT_ALCOHOL_ADS;
            case 8:
                return MISSING_REASON;
            case 9:
            default:
                return null;
            case 10:
                return NOT_MY_TASTE_OR_STYLE;
            case 11:
                return NOT_INTERESTING;
            case 12:
                return NO_LONGER_RELEVANT;
            case 13:
                return LOW_QUALITY;
            case 14:
                return NOT_FOR_ME;
            case 15:
                return NOT_MY_LANGUAGE;
            case 16:
                return AD_LOW_QUALITY;
            case 17:
                return AD_NOT_MY_TASTE;
            case 18:
                return AD_SEE_TOO_MANY_TIMES;
            case 19:
                return REPETITIVE;
            case 20:
                return BLURRY_OR_HARD_TO_READ;
            case 21:
                return NOT_RELEVANT_TO_SKIN_TONE;
            case 22:
                return NOT_RELEVANT_TO_HAIR_PATTERN;
            case 23:
                return NOT_RELEVANT_TO_BODY_TYPE;
        }
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (e.f81526a[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 10;
            case 4:
                return 11;
            case 5:
                return 12;
            case 6:
                return 2;
            case 7:
                return 3;
            case 8:
                return 4;
            case 9:
                return 5;
            case 10:
                return 6;
            case 11:
                return 7;
            case 12:
                return 8;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            case 16:
                return 16;
            case 17:
                return 17;
            case 18:
                return 18;
            case 19:
                return 19;
            case 20:
                return 20;
            case 21:
                return 21;
            case 22:
                return 22;
            case 23:
                return 23;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
