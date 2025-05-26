package cw0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.y0;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class e {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @NotNull
    public static final d Companion;

    @NotNull
    private static final Map<String, e> map;

    @NotNull
    private final String key;
    public static final e STICKERS = new e("STICKERS", 0, "stickers");
    public static final e MUSIC = new e("MUSIC", 1, "music");
    public static final e UNKNOWN = new e("UNKNOWN", 2, "unknown");

    private static final /* synthetic */ e[] $values() {
        return new e[]{STICKERS, MUSIC, UNKNOWN};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new d();
        e[] values = values();
        int a13 = y0.a(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13 < 16 ? 16 : a13);
        for (e eVar : values) {
            linkedHashMap.put(eVar.key, eVar);
        }
        map = linkedHashMap;
    }

    private e(String str, int i13, String str2) {
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
