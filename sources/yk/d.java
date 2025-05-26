package yk;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ALGORITHM_NOT_FIPS' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public abstract class d {
    private static final /* synthetic */ d[] $VALUES;
    public static final d ALGORITHM_NOT_FIPS;
    public static final d ALGORITHM_REQUIRES_BORINGCRYPTO;

    static {
        final String str = "ALGORITHM_NOT_FIPS";
        final int i13 = 0;
        d dVar = new d(str, i13) { // from class: yk.b
            @Override // yk.d
            public boolean isCompatible() {
                return !e.f139223b.get();
            }
        };
        ALGORITHM_NOT_FIPS = dVar;
        final String str2 = "ALGORITHM_REQUIRES_BORINGCRYPTO";
        final int i14 = 1;
        d dVar2 = new d(str2, i14) { // from class: yk.c
            @Override // yk.d
            public boolean isCompatible() {
                return !e.f139223b.get() || e.a();
            }
        };
        ALGORITHM_REQUIRES_BORINGCRYPTO = dVar2;
        $VALUES = new d[]{dVar, dVar2};
    }

    private d(String str, int i13) {
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public abstract boolean isCompatible();
}
