package z22;

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
    public static final c SHOP = new c("SHOP", 0);
    public static final c MORE_IDEAS = new c("MORE_IDEAS", 1);
    public static final c ORGANIZE = new c("ORGANIZE", 2);
    public static final c NOTES = new c("NOTES", 3);
    public static final c MESSAGE_GROUP = new c("MESSAGE_GROUP", 4);
    public static final c COLLAGES = new c("COLLAGES", 5);
    public static final c SHUFFLES_COLLAGES = new c("SHUFFLES_COLLAGES", 6);
    public static final c CANVAS = new c("CANVAS", 7);
    public static final c SHOWREEL = new c("SHOWREEL", 8);
    public static final c INSIGHTS = new c("INSIGHTS", 9);
    public static final c ROOM_REPAINT = new c("ROOM_REPAINT", 10);
    public static final c CREATE_SECTION = new c("CREATE_SECTION", 11);
    public static final c CREATE_PIN = new c("CREATE_PIN", 12);
    public static final c INVITE_COLLABORATORS = new c("INVITE_COLLABORATORS", 13);
    public static final c CALENDAR = new c("CALENDAR", 14);
    public static final c LOOKBOOK = new c("LOOKBOOK", 15);

    private static final /* synthetic */ c[] $values() {
        return new c[]{SHOP, MORE_IDEAS, ORGANIZE, NOTES, MESSAGE_GROUP, COLLAGES, SHUFFLES_COLLAGES, CANVAS, SHOWREEL, INSIGHTS, ROOM_REPAINT, CREATE_SECTION, CREATE_PIN, INVITE_COLLABORATORS, CALENDAR, LOOKBOOK};
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
            case 0:
                return SHOP;
            case 1:
                return MORE_IDEAS;
            case 2:
                return ORGANIZE;
            case 3:
                return NOTES;
            case 4:
                return MESSAGE_GROUP;
            case 5:
                return COLLAGES;
            case 6:
                return SHUFFLES_COLLAGES;
            case 7:
                return CANVAS;
            case 8:
                return SHOWREEL;
            case 9:
                return INSIGHTS;
            case 10:
                return ROOM_REPAINT;
            case 11:
                return CREATE_SECTION;
            case 12:
                return CREATE_PIN;
            case 13:
                return INVITE_COLLABORATORS;
            case 14:
                return CALENDAR;
            case 15:
                return LOOKBOOK;
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
        switch (b.f140657a[ordinal()]) {
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
