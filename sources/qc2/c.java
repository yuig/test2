package qc2;

import kotlin.ranges.IntRange;
import lb.l0;
import org.jetbrains.annotations.NotNull;
import ql2.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    private final IntRange range;
    private final double trackingEvent;
    public static final c InvalidVisibility = new c("InvalidVisibility", 0, new IntRange(-2, -2, 1), -2.0d);
    public static final c NotVisible = new c("NotVisible", 1, s.q(0, 1), 0.0d);
    public static final c Below25 = new c("Below25", 2, s.q(1, 25), 0.01d);
    public static final c Between25And50 = new c("Between25And50", 3, s.q(25, 50), 0.25d);
    public static final c Below80 = new c("Below80", 4, s.q(0, 80), 0.0d);
    public static final c Below50 = new c("Below50", 5, s.q(0, 50), 0.0d);
    public static final c Between50And80 = new c("Between50And80", 6, s.q(50, 80), 0.5d);
    public static final c Between80And100 = new c("Between80And100", 7, s.q(80, 100), 0.8d);
    public static final c FullyVisible = new c("FullyVisible", 8, new IntRange(100, 100, 1), 1.0d);

    private static final /* synthetic */ c[] $values() {
        return new c[]{InvalidVisibility, NotVisible, Below25, Between25And50, Below80, Below50, Between50And80, Between80And100, FullyVisible};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private c(String str, int i13, IntRange intRange, double d2) {
        this.range = intRange;
        this.trackingEvent = d2;
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

    @NotNull
    public final IntRange getRange() {
        return this.range;
    }

    public final double getTrackingEvent() {
        return this.trackingEvent;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return name();
    }
}
