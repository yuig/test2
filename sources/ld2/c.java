package ld2;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c AlphaGradient = new c("AlphaGradient", 0);
    public static final c Opacity = new c("Opacity", 1);
    public static final c TransparentShadows = new c("TransparentShadows", 2);
    public static final c TransparentHighlights = new c("TransparentHighlights", 3);
    public static final c Fade = new c("Fade", 4);
    public static final c Chrome = new c("Chrome", 5);
    public static final c Instant = new c("Instant", 6);
    public static final c Invert = new c("Invert", 7);
    public static final c Linear = new c("Linear", 8);
    public static final c Mono = new c("Mono", 9);
    public static final c Noir = new c("Noir", 10);
    public static final c Process = new c("Process", 11);
    public static final c Sepia = new c("Sepia", 12);
    public static final c Tonal = new c("Tonal", 13);
    public static final c Tone = new c("Tone", 14);
    public static final c Transfer = new c("Transfer", 15);
    public static final c Washed = new c("Washed", 16);
    public static final c Colorize = new c("Colorize", 17);

    private static final /* synthetic */ c[] $values() {
        return new c[]{AlphaGradient, Opacity, TransparentShadows, TransparentHighlights, Fade, Chrome, Instant, Invert, Linear, Mono, Noir, Process, Sepia, Tonal, Tone, Transfer, Washed, Colorize};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private c(String str, int i13) {
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
}
