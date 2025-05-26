package ot1;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class i {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;

    @NotNull
    public static final h Companion;
    public static final i LEVEL_1_0 = new i("LEVEL_1_0", 0);
    public static final i LEVEL_1B = new i("LEVEL_1B", 1);
    public static final i LEVEL_1_1 = new i("LEVEL_1_1", 2);
    public static final i LEVEL_1_2 = new i("LEVEL_1_2", 3);
    public static final i LEVEL_1_3 = new i("LEVEL_1_3", 4);
    public static final i LEVEL_2_0 = new i("LEVEL_2_0", 5);
    public static final i LEVEL_2_1 = new i("LEVEL_2_1", 6);
    public static final i LEVEL_2_2 = new i("LEVEL_2_2", 7);
    public static final i LEVEL_3_0 = new i("LEVEL_3_0", 8);
    public static final i LEVEL_3_1 = new i("LEVEL_3_1", 9);
    public static final i LEVEL_3_2 = new i("LEVEL_3_2", 10);
    public static final i LEVEL_4_0 = new i("LEVEL_4_0", 11);
    public static final i LEVEL_4_1 = new i("LEVEL_4_1", 12);
    public static final i LEVEL_4_2 = new i("LEVEL_4_2", 13);
    public static final i LEVEL_5_0 = new i("LEVEL_5_0", 14);
    public static final i LEVEL_5_1 = new i("LEVEL_5_1", 15);
    public static final i LEVEL_5_2 = new i("LEVEL_5_2", 16);
    public static final i LEVEL_6_0 = new i("LEVEL_6_0", 17);
    public static final i LEVEL_6_1 = new i("LEVEL_6_1", 18);
    public static final i LEVEL_6_2 = new i("LEVEL_6_2", 19);

    private static final /* synthetic */ i[] $values() {
        return new i[]{LEVEL_1_0, LEVEL_1B, LEVEL_1_1, LEVEL_1_2, LEVEL_1_3, LEVEL_2_0, LEVEL_2_1, LEVEL_2_2, LEVEL_3_0, LEVEL_3_1, LEVEL_3_2, LEVEL_4_0, LEVEL_4_1, LEVEL_4_2, LEVEL_5_0, LEVEL_5_1, LEVEL_5_2, LEVEL_6_0, LEVEL_6_1, LEVEL_6_2};
    }

    static {
        i[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new h();
    }

    private i(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
