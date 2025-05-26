package im2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class o0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ o0[] $VALUES;
    private final boolean isObjectReplacedWithTypeParameter;
    private final String valueParametersSignature;
    public static final o0 ONE_COLLECTION_PARAMETER = new o0("ONE_COLLECTION_PARAMETER", 0, "Ljava/util/Collection<+Ljava/lang/Object;>;", false);
    public static final o0 OBJECT_PARAMETER_NON_GENERIC = new o0("OBJECT_PARAMETER_NON_GENERIC", 1, null, true);
    public static final o0 OBJECT_PARAMETER_GENERIC = new o0("OBJECT_PARAMETER_GENERIC", 2, "Ljava/lang/Object;", true);

    private static final /* synthetic */ o0[] $values() {
        return new o0[]{ONE_COLLECTION_PARAMETER, OBJECT_PARAMETER_NON_GENERIC, OBJECT_PARAMETER_GENERIC};
    }

    static {
        o0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private o0(String str, int i13, String str2, boolean z13) {
        this.valueParametersSignature = str2;
        this.isObjectReplacedWithTypeParameter = z13;
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) $VALUES.clone();
    }
}
