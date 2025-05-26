package yi1;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a NotLoaded = new a("NotLoaded", 0);
    public static final a LoadRequested = new a("LoadRequested", 1);
    public static final a SuccessfullyLoaded = new a("SuccessfullyLoaded", 2);
    public static final a FailedToLoad = new a("FailedToLoad", 3);

    private static final /* synthetic */ a[] $values() {
        return new a[]{NotLoaded, LoadRequested, SuccessfullyLoaded, FailedToLoad};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private a(String str, int i13) {
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
}
