package v32;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final c NONE = new c("NONE", 0);
    public static final c LIKE = new c("LIKE", 1);
    public static final c SMILE = new c("SMILE", 2);
    public static final c COOL = new c("COOL", 3);
    public static final c SURPRISE = new c("SURPRISE", 4);
    public static final c LAUGH = new c("LAUGH", 5);
    public static final c CLAP = new c("CLAP", 6);
    public static final c LIGHTBULB = new c("LIGHTBULB", 7);
    public static final c THINKING = new c("THINKING", 8);
    public static final c THUMBS_DOWN = new c("THUMBS_DOWN", 9);
    public static final c HEART = new c("HEART", 10);
    public static final c WOW = new c("WOW", 11);
    public static final c WANT_IT = new c("WANT_IT", 12);
    public static final c THANKS = new c("THANKS", 13);
    public static final c HELPFUL = new c("HELPFUL", 14);

    private static final /* synthetic */ c[] $values() {
        return new c[]{NONE, LIKE, SMILE, COOL, SURPRISE, LAUGH, CLAP, LIGHTBULB, THINKING, THUMBS_DOWN, HEART, WOW, WANT_IT, THANKS, HELPFUL};
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
        switch (b.f123968a[ordinal()]) {
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
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
