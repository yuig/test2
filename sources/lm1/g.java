package lm1;

import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class g {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g BOLD;
    public static final g BOLD_ITALIC;
    public static final g MEDIUM;
    public static final g MEDIUM_ITALIC;
    public static final g REGULAR;
    public static final g REGULAR_ITALIC;

    @NotNull
    private final Map<g92.d, Integer> fontVariants;

    private static final /* synthetic */ g[] $values() {
        return new g[]{REGULAR, REGULAR_ITALIC, MEDIUM, MEDIUM_ITALIC, BOLD, BOLD_ITALIC};
    }

    static {
        g92.d dVar = g92.d.CLASSIC;
        Pair pair = new Pair(dVar, Integer.valueOf(e.roboto));
        g92.d dVar2 = g92.d.VR;
        REGULAR = new g("REGULAR", 0, z0.g(pair, new Pair(dVar2, Integer.valueOf(e.pin_sans_regular))));
        REGULAR_ITALIC = new g("REGULAR_ITALIC", 1, z0.g(new Pair(dVar, Integer.valueOf(e.roboto_italic)), new Pair(dVar2, Integer.valueOf(e.pin_sans_regular_italic))));
        MEDIUM = new g("MEDIUM", 2, z0.g(new Pair(dVar, Integer.valueOf(e.roboto_semi_bold)), new Pair(dVar2, Integer.valueOf(e.pin_sans_medium))));
        MEDIUM_ITALIC = new g("MEDIUM_ITALIC", 3, z0.g(new Pair(dVar, Integer.valueOf(e.roboto_semi_bold_italic)), new Pair(dVar2, Integer.valueOf(e.pin_sans_medium_italic))));
        BOLD = new g("BOLD", 4, z0.g(new Pair(dVar, Integer.valueOf(e.roboto_bold)), new Pair(dVar2, Integer.valueOf(e.pin_sans_bold))));
        BOLD_ITALIC = new g("BOLD_ITALIC", 5, z0.g(new Pair(dVar, Integer.valueOf(e.roboto_bold_italic)), new Pair(dVar2, Integer.valueOf(e.pin_sans_bold_italic))));
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private g(String str, int i13, Map map) {
        this.fontVariants = map;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public final int getFont(@NotNull g92.d theme) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Integer num = this.fontVariants.get(theme);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Unknown theme");
    }

    @NotNull
    public final Map<g92.d, Integer> getFontVariants() {
        return this.fontVariants;
    }

    @NotNull
    public final b getGestaltFont() {
        switch (f.f83930a[ordinal()]) {
            case 1:
                return c.c();
            case 2:
                return c.d();
            case 3:
                return c.a();
            case 4:
                return c.b();
            case 5:
                return c.a();
            case 6:
                return c.b();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
