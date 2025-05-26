package g92;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d CLASSIC = new d("CLASSIC", 0);
    public static final d VR = new d("VR", 1);
    public static final d VR_0_1 = new d("VR_0_1", 2);
    public static final d VR_0_1_EXCLUDE_SPINNER = new d("VR_0_1_EXCLUDE_SPINNER", 3);
    public static final d MAIN_0_0_1_BETA_7 = new d("MAIN_0_0_1_BETA_7", 4);
    public static final d CALICO = new d("CALICO", 5);
    public static final d CALICO_0_0_1_BETA_7 = new d("CALICO_0_0_1_BETA_7", 6);

    private static final /* synthetic */ d[] $values() {
        return new d[]{CLASSIC, VR, VR_0_1, VR_0_1_EXCLUDE_SPINNER, MAIN_0_0_1_BETA_7, CALICO, CALICO_0_0_1_BETA_7};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private d(String str, int i13) {
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
}
