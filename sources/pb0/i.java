package pb0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i DAYS;
    public static final i HOURS;
    public static final i MINUTES;
    public static final i MONTHS;
    public static final i SECONDS;
    public static final i WEEKS;
    public static final i YEARS;
    private final long seconds;

    private static final /* synthetic */ i[] $values() {
        return new i[]{SECONDS, MINUTES, HOURS, DAYS, WEEKS, MONTHS, YEARS};
    }

    static {
        i iVar = new i("SECONDS", 0, 1L);
        SECONDS = iVar;
        i iVar2 = new i("MINUTES", 1, iVar.seconds * 60);
        MINUTES = iVar2;
        i iVar3 = new i("HOURS", 2, iVar2.seconds * 60);
        HOURS = iVar3;
        i iVar4 = new i("DAYS", 3, iVar3.seconds * 24);
        DAYS = iVar4;
        WEEKS = new i("WEEKS", 4, iVar4.seconds * 7);
        MONTHS = new i("MONTHS", 5, iVar4.seconds * 30);
        YEARS = new i("YEARS", 6, iVar4.seconds * 365);
        i[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private i(String str, int i13, long j13) {
        this.seconds = j13;
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

    public final long getMilliseconds() {
        return this.seconds * 1000;
    }

    public final long getSeconds() {
        return this.seconds;
    }
}
