package a41;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class f {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f FadeIn = new f("FadeIn", 0, 0.0f, 1.0f);
    public static final f FadeOut = new f("FadeOut", 1, 1.0f, 0.0f);
    private final float endAlpha;
    private final float startAlpha;

    private static final /* synthetic */ f[] $values() {
        return new f[]{FadeIn, FadeOut};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private f(String str, int i13, float f13, float f14) {
        this.startAlpha = f13;
        this.endAlpha = f14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final float getEndAlpha() {
        return this.endAlpha;
    }

    public final float getStartAlpha() {
        return this.startAlpha;
    }
}
