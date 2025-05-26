package sk0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.g0;
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

    @NotNull
    private static final Map<Integer, c> positionMap;
    private final int position;
    public static final c ORGANIZE = new c("ORGANIZE", 0, 0);
    public static final c ADD = new c("ADD", 1, 1);
    public static final c MORE_IDEAS = new c("MORE_IDEAS", 2, 2);
    public static final c ROOM_REPAINT = new c("ROOM_REPAINT", 3, 3);
    public static final c SHOP = new c("SHOP", 4, 4);

    private static final /* synthetic */ c[] $values() {
        return new c[]{ORGANIZE, ADD, MORE_IDEAS, ROOM_REPAINT, SHOP};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new b();
        el2.a entries = getEntries();
        int a13 = y0.a(g0.q(entries, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13 < 16 ? 16 : a13);
        for (Object obj : entries) {
            linkedHashMap.put(Integer.valueOf(((c) obj).position), obj);
        }
        positionMap = linkedHashMap;
    }

    private c(String str, int i13, int i14) {
        this.position = i14;
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

    public final int getPosition() {
        return this.position;
    }
}
