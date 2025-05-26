package an2;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a0[] $VALUES;

    @NotNull
    public static final Set<a0> ALL;

    @NotNull
    public static final Set<a0> ALL_EXCEPT_ANNOTATIONS;

    @NotNull
    public static final z Companion;
    private final boolean includeByDefault;
    public static final a0 VISIBILITY = new a0("VISIBILITY", 0, true);
    public static final a0 MODALITY = new a0("MODALITY", 1, true);
    public static final a0 OVERRIDE = new a0("OVERRIDE", 2, true);
    public static final a0 ANNOTATIONS = new a0("ANNOTATIONS", 3, false);
    public static final a0 INNER = new a0("INNER", 4, true);
    public static final a0 MEMBER_KIND = new a0("MEMBER_KIND", 5, true);
    public static final a0 DATA = new a0("DATA", 6, true);
    public static final a0 INLINE = new a0("INLINE", 7, true);
    public static final a0 EXPECT = new a0("EXPECT", 8, true);
    public static final a0 ACTUAL = new a0("ACTUAL", 9, true);
    public static final a0 CONST = new a0("CONST", 10, true);
    public static final a0 LATEINIT = new a0("LATEINIT", 11, true);
    public static final a0 FUN = new a0("FUN", 12, true);
    public static final a0 VALUE = new a0("VALUE", 13, true);

    private static final /* synthetic */ a0[] $values() {
        return new a0[]{VISIBILITY, MODALITY, OVERRIDE, ANNOTATIONS, INNER, MEMBER_KIND, DATA, INLINE, EXPECT, ACTUAL, CONST, LATEINIT, FUN, VALUE};
    }

    static {
        a0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new z();
        a0[] values = values();
        ArrayList arrayList = new ArrayList();
        for (a0 a0Var : values) {
            if (a0Var.includeByDefault) {
                arrayList.add(a0Var);
            }
        }
        ALL_EXCEPT_ANNOTATIONS = CollectionsKt.J0(arrayList);
        ALL = kotlin.collections.c0.f0(values());
    }

    private a0(String str, int i13, boolean z13) {
        this.includeByDefault = z13;
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }
}
