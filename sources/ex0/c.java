package ex0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.y0;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class c extends Enum {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final b Companion;

    @NotNull
    private static final Map<String, c> map;

    @NotNull
    private final String key;
    public static final c NONE = new c("NONE", 0, "none");
    public static final c WIFI = new c("WIFI", 1, "wifi");
    public static final c MOBILE = new c("MOBILE", 2, "mobile");
    public static final c BOTH = new c("BOTH", 3, "both");

    private static final /* synthetic */ c[] $values() {
        return new c[]{NONE, WIFI, MOBILE, BOTH};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new b();
        c[] values = values();
        int a13 = y0.a(values.length);
        if (a13 < 16) {
            a13 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
        for (c cVar : values) {
            linkedHashMap.put(cVar.key, cVar);
        }
        map = linkedHashMap;
    }

    private c(String str, int i13, String str2) {
        super(str, i13);
        this.key = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }
}
