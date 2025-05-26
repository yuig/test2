package f72;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@no2.g
/* loaded from: classes4.dex */
public final class t0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ t0[] $VALUES;

    @NotNull
    private static final xk2.k $cachedSerializer$delegate;

    @NotNull
    public static final s0 Companion;
    public static final t0 None = new t0("None", 0);
    public static final t0 TimeLapse = new t0("TimeLapse", 1);
    public static final t0 FairyDust = new t0("FairyDust", 2);
    public static final t0 Sparkler = new t0("Sparkler", 3);
    public static final t0 Fireworks = new t0("Fireworks", 4);
    public static final t0 LightFrame = new t0("LightFrame", 5);
    public static final t0 Parallax = new t0("Parallax", 6);
    public static final t0 AnalogGrit = new t0("AnalogGrit", 7);
    public static final t0 BitCrush = new t0("BitCrush", 8);
    public static final t0 Butterflies = new t0("Butterflies", 9);
    public static final t0 CityLights = new t0("CityLights", 10);
    public static final t0 EuphoriaGlitch = new t0("EuphoriaGlitch", 11);
    public static final t0 GlitterShower = new t0("GlitterShower", 12);
    public static final t0 HeavyRain = new t0("HeavyRain", 13);
    public static final t0 LightLeakColor = new t0("LightLeakColor", 14);
    public static final t0 LightLeakMono = new t0("LightLeakMono", 15);
    public static final t0 Snowglobe = new t0("Snowglobe", 16);
    public static final t0 Speed = new t0("Speed", 17);
    public static final t0 Spotlights = new t0("Spotlights", 18);
    public static final t0 Vhs = new t0("Vhs", 19);

    private static final /* synthetic */ t0[] $values() {
        return new t0[]{None, TimeLapse, FairyDust, Sparkler, Fireworks, LightFrame, Parallax, AnalogGrit, BitCrush, Butterflies, CityLights, EuphoriaGlitch, GlitterShower, HeavyRain, LightLeakColor, LightLeakMono, Snowglobe, Speed, Spotlights, Vhs};
    }

    static {
        t0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new s0();
        $cachedSerializer$delegate = xk2.m.a(xk2.n.PUBLICATION, r0.f61358i);
    }

    private t0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) $VALUES.clone();
    }
}
