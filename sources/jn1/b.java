package jn1;

import hn1.u;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    private final int speed;
    public static final b Slow = new b("Slow", 0, u.anim_speed_slow);
    public static final b Regular = new b("Regular", 1, u.anim_speed);
    public static final b Fast = new b("Fast", 2, u.anim_speed_fast);
    public static final b Fastest = new b("Fastest", 3, u.anim_speed_fastest);
    public static final b SuperFast = new b("SuperFast", 4, u.anim_speed_superfast);

    private static final /* synthetic */ b[] $values() {
        return new b[]{Slow, Regular, Fast, Fastest, SuperFast};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private b(String str, int i13, int i14) {
        this.speed = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final int getSpeed() {
        return this.speed;
    }
}
