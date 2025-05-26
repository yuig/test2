package ik1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.y0;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final b Companion;

    @NotNull
    private static final Map<Double, c> valueToActionType;
    private final double value;
    public static final c NO_ACTION = new c("NO_ACTION", 0, -1.0d);
    public static final c CLOSEUP = new c("CLOSEUP", 1, 0.0d);
    public static final c SWIPE = new c("SWIPE", 2, 1.0d);

    private static final /* synthetic */ c[] $values() {
        return new c[]{NO_ACTION, CLOSEUP, SWIPE};
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
            linkedHashMap.put(Double.valueOf(cVar.value), cVar);
        }
        valueToActionType = linkedHashMap;
    }

    private c(String str, int i13, double d2) {
        this.value = d2;
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

    public final double getValue() {
        return this.value;
    }
}
