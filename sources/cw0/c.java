package cw0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.y0;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final b Companion;
    public static final c Creation = new c("Creation", 0, 1);
    public static final c Display = new c("Display", 1, 2);
    public static final c Tag = new c("Tag", 2, 3);
    public static final c UNKNOWN = new c("UNKNOWN", 3, 4);

    @NotNull
    private static final Map<Integer, c> map;
    private final int key;

    private static final /* synthetic */ c[] $values() {
        return new c[]{Creation, Display, Tag, UNKNOWN};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new b();
        c[] values = values();
        int a13 = y0.a(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13 < 16 ? 16 : a13);
        for (c cVar : values) {
            linkedHashMap.put(Integer.valueOf(cVar.key), cVar);
        }
        map = linkedHashMap;
    }

    private c(String str, int i13, int i14) {
        this.key = i14;
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

    public final int getKey() {
        return this.key;
    }
}
