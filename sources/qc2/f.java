package qc2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class f {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;

    @NotNull
    private final Function1<Number, c> calculate;

    @NotNull
    private final c threshold;
    public static final f DEFAULT = new f("DEFAULT", 0, c.Below50, e.f103529j);
    public static final f GRANULAR = new f("GRANULAR", 1, c.NotVisible, e.f103530k);
    public static final f CREATOR_CLASS_FEED = new f("CREATOR_CLASS_FEED", 2, c.Below80, e.f103531l);
    public static final f DISABLED = new f("DISABLED", 3, c.FullyVisible, e.f103532m);

    private static final /* synthetic */ f[] $values() {
        return new f[]{DEFAULT, GRANULAR, CREATOR_CLASS_FEED, DISABLED};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private f(String str, int i13, c cVar, Function1 function1) {
        this.threshold = cVar;
        this.calculate = function1;
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

    @NotNull
    public final Function1<Number, c> getCalculate() {
        return this.calculate;
    }

    @NotNull
    public final c getThreshold() {
        return this.threshold;
    }

    public final boolean isVisible(@NotNull c viewability) {
        Intrinsics.checkNotNullParameter(viewability, "viewability");
        return viewability.compareTo(this.threshold) > 0;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return name();
    }
}
