package tm1;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    private final Integer calicoDrawableRes1_1;
    private final Integer calicoDrawableRes3_2;
    private final Integer calicoDrawableSpotRes;
    private final Integer vrDrawableRes1_1;
    private final Integer vrDrawableRes3_2;
    private final Integer vrDrawableSpotRes;
    public static final d TEST = new d("TEST", 0, null, Integer.valueOf(f.vr_hero_test_1_1), Integer.valueOf(f.vr_hero_test_3_2), null, Integer.valueOf(f.calico_hero_test_1_1), Integer.valueOf(f.calico_hero_test_3_2));
    public static final d CATERPILLAR = new d("CATERPILLAR", 1, null, null, null, Integer.valueOf(f.ill_caterpillar_spot), null, null);
    public static final d COLLAGE = new d("COLLAGE", 2, null, null, null, Integer.valueOf(f.ill_collage_spot), null, null);
    public static final d DRINK = new d("DRINK", 3, null, null, null, Integer.valueOf(f.ill_drink_spot), null, null);
    public static final d FAVORITE = new d("FAVORITE", 4, null, null, null, Integer.valueOf(f.ill_favorite_spot), null, null);
    public static final d FISH = new d("FISH", 5, null, null, null, Integer.valueOf(f.ill_fish_spot), null, null);
    public static final d GUMBALL = new d("GUMBALL", 6, null, null, null, Integer.valueOf(f.ill_gumball_spot), null, null);
    public static final d MESSAGE_BOTTLE = new d("MESSAGE_BOTTLE", 7, null, null, null, Integer.valueOf(f.ill_message_bottle_spot), null, null);
    public static final d PALETTE = new d("PALETTE", 8, null, null, null, Integer.valueOf(f.ill_palette_spot), null, null);
    public static final d PIN_BOARD = new d("PIN_BOARD", 9, null, null, null, Integer.valueOf(f.ill_pinboard_spot), null, null);
    public static final d PIN_JAR = new d("PIN_JAR", 10, null, null, null, Integer.valueOf(f.ill_pin_jar_spot), null, null);
    public static final d POPSICLE = new d("POPSICLE", 11, null, null, null, Integer.valueOf(f.ill_popsicle_spot), null, null);
    public static final d SUNGLASSES = new d("SUNGLASSES", 12, null, null, null, Integer.valueOf(f.ill_sunglasses_spot), null, null);

    private static final /* synthetic */ d[] $values() {
        return new d[]{TEST, CATERPILLAR, COLLAGE, DRINK, FAVORITE, FISH, GUMBALL, MESSAGE_BOTTLE, PALETTE, PIN_BOARD, PIN_JAR, POPSICLE, SUNGLASSES};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private d(String str, int i13, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.vrDrawableSpotRes = num;
        this.vrDrawableRes1_1 = num2;
        this.vrDrawableRes3_2 = num3;
        this.calicoDrawableSpotRes = num4;
        this.calicoDrawableRes1_1 = num5;
        this.calicoDrawableRes3_2 = num6;
    }

    public static /* synthetic */ Integer drawableRes$default(d dVar, Context context, b bVar, a aVar, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawableRes");
        }
        if ((i13 & 4) != 0) {
            aVar = a.RATIO_1_1;
        }
        return dVar.drawableRes(context, bVar, aVar);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final Integer drawableRes(@NotNull Context context, @NotNull b variant, @NotNull a ratio) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        return drawableRes(dl2.b.w0(context, eo1.a.comp_illustration_is_calico) ? g92.d.CALICO : g92.d.VR, variant, ratio);
    }

    public static /* synthetic */ Integer drawableRes$default(d dVar, b bVar, a aVar, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawableRes");
        }
        if ((i13 & 2) != 0) {
            aVar = a.RATIO_1_1;
        }
        return dVar.drawableRes(bVar, aVar);
    }

    public final Integer drawableRes(@NotNull g92.d theme, @NotNull b variant, @NotNull a ratio) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        int i13 = c.f118139c[variant.ordinal()];
        if (i13 == 1) {
            if (c.f118137a[theme.ordinal()] == 1) {
                return this.calicoDrawableSpotRes;
            }
            return this.vrDrawableSpotRes;
        }
        if (i13 == 2) {
            int i14 = c.f118138b[ratio.ordinal()];
            if (i14 == 1) {
                if (c.f118137a[theme.ordinal()] == 1) {
                    return this.calicoDrawableRes1_1;
                }
                return this.vrDrawableRes1_1;
            }
            if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (c.f118137a[theme.ordinal()] == 1) {
                return this.calicoDrawableRes3_2;
            }
            return this.vrDrawableRes3_2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @xk2.d
    public final Integer drawableRes(@NotNull b variant, @NotNull a ratio) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        return drawableRes(g92.d.VR, variant, ratio);
    }
}
