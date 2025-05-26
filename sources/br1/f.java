package br1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class f {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    private final boolean logoTriggered;
    private final boolean pinsTriggered;
    private final boolean staticLogoAndPins;
    private final boolean textTriggered;
    public static final f Simple = new f("Simple", 0, true, false, false, true);
    public static final f PhaseOne = new f("PhaseOne", 1, true, false, false, false);
    public static final f PhaseTwo = new f("PhaseTwo", 2, true, true, true, false);

    private static final /* synthetic */ f[] $values() {
        return new f[]{Simple, PhaseOne, PhaseTwo};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private f(String str, int i13, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.textTriggered = z13;
        this.logoTriggered = z14;
        this.pinsTriggered = z15;
        this.staticLogoAndPins = z16;
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

    public final boolean getLogoTriggered() {
        return this.logoTriggered;
    }

    public final boolean getPinsTriggered() {
        return this.pinsTriggered;
    }

    public final boolean getStaticLogoAndPins() {
        return this.staticLogoAndPins;
    }

    public final boolean getTextTriggered() {
        return this.textTriggered;
    }
}
