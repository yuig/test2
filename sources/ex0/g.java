package ex0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.y0;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class g extends Enum {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;

    @NotNull
    public static final f Companion;

    @NotNull
    private static final Map<String, g> map;

    @NotNull
    private final String key;
    public static final g IN_PROGRESS = new g("IN_PROGRESS", 0, "in_progress");
    public static final g SUCCESS = new g("SUCCESS", 1, "success");
    public static final g FAIL = new g("FAIL", 2, "fail");
    public static final g UNKNOWN = new g("UNKNOWN", 3, "unknown");

    private static final /* synthetic */ g[] $values() {
        return new g[]{IN_PROGRESS, SUCCESS, FAIL, UNKNOWN};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new f();
        g[] values = values();
        int a13 = y0.a(values.length);
        if (a13 < 16) {
            a13 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
        for (g gVar : values) {
            linkedHashMap.put(gVar.key, gVar);
        }
        map = linkedHashMap;
    }

    private g(String str, int i13, String str2) {
        super(str, i13);
        this.key = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }
}
