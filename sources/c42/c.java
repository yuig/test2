package c42;

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
    public static final c HERO = new c("HERO", 0);
    public static final c THREE_PIN_COLLECTION = new c("THREE_PIN_COLLECTION", 1);
    public static final c SINGLE_VIDEO = new c("SINGLE_VIDEO", 2);
    public static final c SINGLE_PIN = new c("SINGLE_PIN", 3);
    public static final c IDEA_STREAM = new c("IDEA_STREAM", 4);
    public static final c RESPONSE_PIN = new c("RESPONSE_PIN", 5);
    public static final c STORY_PIN = new c("STORY_PIN", 6);
    public static final c CUSTOM_COVER = new c("CUSTOM_COVER", 7);
    public static final c SINGLE_CREATOR = new c("SINGLE_CREATOR", 8);
    public static final c EVERGREEN = new c("EVERGREEN", 9);
    public static final c TRENDING = new c("TRENDING", 10);
    public static final c CREATOR = new c("CREATOR", 11);

    private static final /* synthetic */ c[] $values() {
        return new c[]{HERO, THREE_PIN_COLLECTION, SINGLE_VIDEO, SINGLE_PIN, IDEA_STREAM, RESPONSE_PIN, STORY_PIN, CUSTOM_COVER, SINGLE_CREATOR, EVERGREEN, TRENDING, CREATOR};
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
        switch (b.f25765a[ordinal()]) {
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
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
