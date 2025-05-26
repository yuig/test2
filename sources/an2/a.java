package an2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    private final boolean includeAnnotationArguments;
    private final boolean includeEmptyAnnotationArguments;
    public static final a NO_ARGUMENTS = new a("NO_ARGUMENTS", 0, false, false, 3, null);
    public static final a UNLESS_EMPTY = new a("UNLESS_EMPTY", 1, true, false, 2, null);
    public static final a ALWAYS_PARENTHESIZED = new a("ALWAYS_PARENTHESIZED", 2, true, true);

    private static final /* synthetic */ a[] $values() {
        return new a[]{NO_ARGUMENTS, UNLESS_EMPTY, ALWAYS_PARENTHESIZED};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    public /* synthetic */ a(String str, int i13, boolean z13, boolean z14, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, (i14 & 1) != 0 ? false : z13, (i14 & 2) != 0 ? false : z14);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final boolean getIncludeAnnotationArguments() {
        return this.includeAnnotationArguments;
    }

    public final boolean getIncludeEmptyAnnotationArguments() {
        return this.includeEmptyAnnotationArguments;
    }

    private a(String str, int i13, boolean z13, boolean z14) {
        this.includeAnnotationArguments = z13;
        this.includeEmptyAnnotationArguments = z14;
    }
}
