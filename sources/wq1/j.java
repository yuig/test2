package wq1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class j {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j PROFILE_NAME_STEP = new j("PROFILE_NAME_STEP", 0);
    public static final j WEBSITE_STEP = new j("WEBSITE_STEP", 1);
    public static final j DESCRIPTION_STEP = new j("DESCRIPTION_STEP", 2);
    public static final j RUN_ADS_STEP = new j("RUN_ADS_STEP", 3);
    public static final j LAUNCH_ADS_STEP = new j("LAUNCH_ADS_STEP", 4);

    private static final /* synthetic */ j[] $values() {
        return new j[]{PROFILE_NAME_STEP, WEBSITE_STEP, DESCRIPTION_STEP, RUN_ADS_STEP, LAUNCH_ADS_STEP};
    }

    static {
        j[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private j(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
