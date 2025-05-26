package kp;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class o {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    private final int snoozeTime;
    public static final o SET_NOTIFICATIONS_ALWAYS_ON = new o("SET_NOTIFICATIONS_ALWAYS_ON", 0, 0);
    public static final o SET_NOTIFICATIONS_MUTE_ONE_HOUR = new o("SET_NOTIFICATIONS_MUTE_ONE_HOUR", 1, 3600);
    public static final o SET_NOTIFICATIONS_MUTE_EIGHT_HOURS = new o("SET_NOTIFICATIONS_MUTE_EIGHT_HOURS", 2, 28800);
    public static final o SET_NOTIFICATIONS_MUTE_ONE_WEEK = new o("SET_NOTIFICATIONS_MUTE_ONE_WEEK", 3, 604800);
    public static final o SET_NOTIFICATIONS_MUTE_UNTIL_TURNED_ON = new o("SET_NOTIFICATIONS_MUTE_UNTIL_TURNED_ON", 4, -1);

    private static final /* synthetic */ o[] $values() {
        return new o[]{SET_NOTIFICATIONS_ALWAYS_ON, SET_NOTIFICATIONS_MUTE_ONE_HOUR, SET_NOTIFICATIONS_MUTE_EIGHT_HOURS, SET_NOTIFICATIONS_MUTE_ONE_WEEK, SET_NOTIFICATIONS_MUTE_UNTIL_TURNED_ON};
    }

    static {
        o[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private o(String str, int i13, int i14) {
        this.snoozeTime = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }

    public final int getSnoozeTime() {
        return this.snoozeTime;
    }
}
