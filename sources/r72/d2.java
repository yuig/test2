package r72;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d2 implements e2 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d2[] $VALUES;
    public static final d2 FairyDust = new d2("FairyDust", 0);
    public static final d2 Sparkler = new d2("Sparkler", 1);
    public static final d2 Fireworks = new d2("Fireworks", 2);
    public static final d2 LightFrame = new d2("LightFrame", 3);
    public static final d2 AnalogGrit = new d2("AnalogGrit", 4);
    public static final d2 BitCrush = new d2("BitCrush", 5);
    public static final d2 Butterflies = new d2("Butterflies", 6);
    public static final d2 CityLights = new d2("CityLights", 7);
    public static final d2 EuphoriaGlitch = new d2("EuphoriaGlitch", 8);
    public static final d2 GlitterShower = new d2("GlitterShower", 9);
    public static final d2 HeavyRain = new d2("HeavyRain", 10);
    public static final d2 LightLeakColor = new d2("LightLeakColor", 11);
    public static final d2 LightLeakMono = new d2("LightLeakMono", 12);
    public static final d2 Snowglobe = new d2("Snowglobe", 13);
    public static final d2 Speed = new d2("Speed", 14);
    public static final d2 Spotlights = new d2("Spotlights", 15);
    public static final d2 Vhs = new d2("Vhs", 16);

    private static final /* synthetic */ d2[] $values() {
        return new d2[]{FairyDust, Sparkler, Fireworks, LightFrame, AnalogGrit, BitCrush, Butterflies, CityLights, EuphoriaGlitch, GlitterShower, HeavyRain, LightLeakColor, LightLeakMono, Snowglobe, Speed, Spotlights, Vhs};
    }

    static {
        d2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private d2(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static d2 valueOf(String str) {
        return (d2) Enum.valueOf(d2.class, str);
    }

    public static d2[] values() {
        return (d2[]) $VALUES.clone();
    }
}
