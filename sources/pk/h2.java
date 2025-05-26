package pk;

import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'KEY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public abstract class h2 implements ok.t {
    private static final /* synthetic */ h2[] $VALUES = $values();
    public static final h2 KEY;
    public static final h2 VALUE;

    private static /* synthetic */ h2[] $values() {
        return new h2[]{KEY, VALUE};
    }

    static {
        final String str = "KEY";
        final int i13 = 0;
        KEY = new h2(str, i13) { // from class: pk.f2
            {
                d2 d2Var = null;
            }

            @Override // pk.h2, ok.t
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        };
        final String str2 = "VALUE";
        final int i14 = 1;
        VALUE = new h2(str2, i14) { // from class: pk.g2
            {
                d2 d2Var = null;
            }

            @Override // pk.h2, ok.t
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        };
    }

    private h2(String str, int i13) {
    }

    public static h2 valueOf(String str) {
        return (h2) Enum.valueOf(h2.class, str);
    }

    public static h2[] values() {
        return (h2[]) $VALUES.clone();
    }

    public abstract /* synthetic */ Object apply(Object obj);

    public /* synthetic */ h2(String str, int i13, d2 d2Var) {
        this(str, i13);
    }
}
