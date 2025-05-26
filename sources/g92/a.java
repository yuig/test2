package g92;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    private final int styleRes;
    public static final a SPLASHSCREEN = new a("SPLASHSCREEN", 0, bo1.b.Theme_Pinterest_SplashScreen_Launch);
    public static final a PINTEREST = new a("PINTEREST", 1, bo1.b.Theme_Pinterest_NoActionbar);
    public static final a LAUNCH = new a("LAUNCH", 2, bo1.b.Theme_Pinterest_NoActionbar);
    public static final a NUX = new a("NUX", 3, bo1.b.Theme_Pinterest_NoActionbar_NUX);
    public static final a DIALOG = new a("DIALOG", 4, bo1.b.Theme_Pinterest_NoActionbar_Dialog);
    public static final a PIN_CREATE = new a("PIN_CREATE", 5, bo1.b.Theme_Pinterest_NoActionbar_Dialog_PinCreate);
    public static final a FULL_SCREEN = new a("FULL_SCREEN", 6, bo1.b.Theme_Pinterest_Fullscreen);
    public static final a MAIN = new a("MAIN", 7, bo1.b.Theme_Pinterest_NoActionbar_Main);

    private static final /* synthetic */ a[] $values() {
        return new a[]{SPLASHSCREEN, PINTEREST, LAUNCH, NUX, DIALOG, PIN_CREATE, FULL_SCREEN, MAIN};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13, int i14) {
        this.styleRes = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final int getStyleRes() {
        return this.styleRes;
    }
}
