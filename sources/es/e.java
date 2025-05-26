package es;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    private final boolean openWebBrowser;
    public static final e HeroView = new e("HeroView", 0, false);
    public static final e DirectToSite = new e("DirectToSite", 1, true);
    public static final e DrawerView = new e("DrawerView", 2, false);
    public static final e DirectToCollageSite = new e("DirectToCollageSite", 3, true);

    private static final /* synthetic */ e[] $values() {
        return new e[]{HeroView, DirectToSite, DrawerView, DirectToCollageSite};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private e(String str, int i13, boolean z13) {
        this.openWebBrowser = z13;
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

    public final boolean getOpenWebBrowser() {
        return this.openWebBrowser;
    }
}
