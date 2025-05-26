package ft1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public abstract class i extends Enum {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i UnsignedByte = new h("UnsignedByte", 0, null);
    public static final i Short = new g("Short", 1, null);
    public static final i Int24 = new e("Int24", 2, null);
    public static final i Int32 = new f("Int32", 3, null);
    public static final i Float = new d("Float", 4, null);

    private static final /* synthetic */ i[] $values() {
        return new i[]{UnsignedByte, Short, Int24, Int32, Float};
    }

    static {
        i[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    public /* synthetic */ i(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
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

    public abstract int getSize();

    private i(String str, int i13) {
        super(str, i13);
    }
}
