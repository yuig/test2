package zn2;

import java.util.concurrent.TimeUnit;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;

    @NotNull
    private final TimeUnit timeUnit;
    public static final d NANOSECONDS = new d("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
    public static final d MICROSECONDS = new d("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    public static final d MILLISECONDS = new d("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    public static final d SECONDS = new d("SECONDS", 3, TimeUnit.SECONDS);
    public static final d MINUTES = new d("MINUTES", 4, TimeUnit.MINUTES);
    public static final d HOURS = new d("HOURS", 5, TimeUnit.HOURS);
    public static final d DAYS = new d("DAYS", 6, TimeUnit.DAYS);

    private static final /* synthetic */ d[] $values() {
        return new d[]{NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private d(String str, int i13, TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    @NotNull
    public final TimeUnit getTimeUnit$kotlin_stdlib() {
        return this.timeUnit;
    }
}
