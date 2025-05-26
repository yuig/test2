package p32;

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
    public static final c NONE = new c("NONE", 0);
    public static final c INVITE = new c("INVITE", 1);
    public static final c BULK_INVITE = new c("BULK_INVITE", 2);
    public static final c MESSAGE = new c("MESSAGE", 3);
    public static final c GROUP_BOARD = new c("GROUP_BOARD", 4);
    public static final c COMMERCE = new c("COMMERCE", 5);
    public static final c PUBLISH = new c("PUBLISH", 6);
    public static final c PLACE_RECOMMENDATIONS = new c("PLACE_RECOMMENDATIONS", 7);
    public static final c STORY_PIN_CREATE = new c("STORY_PIN_CREATE", 8);
    public static final c BUSINESS_REFERRAL = new c("BUSINESS_REFERRAL", 9);
    public static final c SEARCH = new c("SEARCH", 10);
    public static final c CREATOR_CLASS = new c("CREATOR_CLASS", 11);
    public static final c SHUFFLE = new c("SHUFFLE", 12);
    public static final c FOLLOW = new c("FOLLOW", 13);

    private static final /* synthetic */ c[] $values() {
        return new c[]{NONE, INVITE, BULK_INVITE, MESSAGE, GROUP_BOARD, COMMERCE, PUBLISH, PLACE_RECOMMENDATIONS, STORY_PIN_CREATE, BUSINESS_REFERRAL, SEARCH, CREATOR_CLASS, SHUFFLE, FOLLOW};
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
        return a.a(i13);
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
        switch (b.f98765a[ordinal()]) {
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
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
