package fh0;

import i32.a0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import org.jetbrains.annotations.NotNull;
import xk2.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class e {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e EMPTY_DISPLAY_DATA = new e("EMPTY_DISPLAY_DATA", 0, d.f62155k, hh0.c.f69136k);
    public static final e STANDARD_CALLOUT;
    public static final e STANDARD_UPSELL;

    @NotNull
    private final Function1<hh0.f, s> deserializer;

    @NotNull
    private final Function1<hh0.f, Boolean> matcher;

    private static final /* synthetic */ e[] $values() {
        return new e[]{EMPTY_DISPLAY_DATA, STANDARD_CALLOUT, STANDARD_UPSELL};
    }

    static {
        int i13 = 0;
        a0 experienceType = a0.CALLOUT;
        Intrinsics.checkNotNullParameter(experienceType, "experienceType");
        STANDARD_CALLOUT = new e("STANDARD_CALLOUT", 1, new hh0.a(experienceType, i13), d.f62154j);
        a0 experienceType2 = a0.UPSELL;
        Intrinsics.checkNotNullParameter(experienceType2, "experienceType");
        STANDARD_UPSELL = new e("STANDARD_UPSELL", 2, new hh0.a(experienceType2, i13), d.f62156l);
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private e(String str, int i13, Function1 function1, Function1 function12) {
        this.matcher = function1;
        this.deserializer = function12;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    @NotNull
    public final Function1<hh0.f, s> getDeserializer() {
        return this.deserializer;
    }

    @NotNull
    public final Function1<hh0.f, Boolean> getMatcher() {
        return this.matcher;
    }
}
