package im2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public class q0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ q0[] $VALUES;
    public static final q0 MAP_GET_OR_DEFAULT;
    private final Object defaultValue;
    public static final q0 NULL = new q0("NULL", 0, null);
    public static final q0 INDEX = new q0("INDEX", 1, -1);
    public static final q0 FALSE = new q0("FALSE", 2, Boolean.FALSE);

    private static final /* synthetic */ q0[] $values() {
        return new q0[]{NULL, INDEX, FALSE, MAP_GET_OR_DEFAULT};
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        MAP_GET_OR_DEFAULT = new p0("MAP_GET_OR_DEFAULT", 3, defaultConstructorMarker, defaultConstructorMarker);
        q0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    public /* synthetic */ q0(String str, int i13, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, obj);
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) $VALUES.clone();
    }

    private q0(String str, int i13, Object obj) {
        this.defaultValue = obj;
    }
}
