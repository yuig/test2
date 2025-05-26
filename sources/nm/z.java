package nm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class z {
    private static final /* synthetic */ z[] $VALUES;
    public static final z DEFAULT;
    public static final z STRING;

    static {
        x xVar = new x("DEFAULT", 0);
        DEFAULT = xVar;
        final String str = "STRING";
        final int i13 = 1;
        z zVar = new z(str, i13) { // from class: nm.y
            {
                x xVar2 = null;
            }

            @Override // nm.z
            public s serialize(Long l13) {
                return l13 == null ? t.f91365a : new v(l13.toString());
            }
        };
        STRING = zVar;
        $VALUES = new z[]{xVar, zVar};
    }

    private z(String str, int i13) {
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }

    public abstract s serialize(Long l13);

    public /* synthetic */ z(String str, int i13, x xVar) {
        this(str, i13);
    }
}
