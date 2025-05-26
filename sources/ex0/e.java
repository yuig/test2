package ex0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.y0;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class e extends Enum {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @NotNull
    public static final d Companion;

    @NotNull
    private static final Map<String, e> map;

    @NotNull
    private final String key;
    public static final e BUCKET_0_1 = new e("BUCKET_0_1", 0, "0-1");
    public static final e BUCKET_1_5 = new e("BUCKET_1_5", 1, "1-5");
    public static final e BUCKET_5_10 = new e("BUCKET_5_10", 2, "5-10");
    public static final e BUCKET_10_20 = new e("BUCKET_10_20", 3, "10-20");
    public static final e BUCKET_20_40 = new e("BUCKET_20_40", 4, "20-40");
    public static final e BUCKET_40_80 = new e("BUCKET_40_80", 5, "40-80");
    public static final e BUCKET_80_OR_ABOVE = new e("BUCKET_80_OR_ABOVE", 6, "80_or_above");
    public static final e UNKNOWN = new e("UNKNOWN", 7, "unknown");

    private static final /* synthetic */ e[] $values() {
        return new e[]{BUCKET_0_1, BUCKET_1_5, BUCKET_5_10, BUCKET_10_20, BUCKET_20_40, BUCKET_40_80, BUCKET_80_OR_ABOVE, UNKNOWN};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new d();
        e[] values = values();
        int a13 = y0.a(values.length);
        if (a13 < 16) {
            a13 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
        for (e eVar : values) {
            linkedHashMap.put(eVar.key, eVar);
        }
        map = linkedHashMap;
    }

    private e(String str, int i13, String str2) {
        super(str, i13);
        this.key = str2;
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
    public final String getKey() {
        return this.key;
    }
}
