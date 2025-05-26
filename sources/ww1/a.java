package ww1;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    private final float defaultMaxYAxis;
    public static final a NUMBER = new a("NUMBER", 0, 0.0f, 1, null);
    public static final a PERCENTAGE = new a("PERCENTAGE", 1, 0.0f, 1, null);
    public static final a MINUTES = new a("MINUTES", 2, TimeUnit.MINUTES.toMillis(4));
    public static final a TIME = new a("TIME", 3, TimeUnit.SECONDS.toMillis(4));

    private static final /* synthetic */ a[] $values() {
        return new a[]{NUMBER, PERCENTAGE, MINUTES, TIME};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    public /* synthetic */ a(String str, int i13, float f13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, (i14 & 1) != 0 ? 4.0f : f13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final float getDefaultMaxYAxis() {
        return this.defaultMaxYAxis;
    }

    private a(String str, int i13, float f13) {
        this.defaultMaxYAxis = f13;
    }
}
