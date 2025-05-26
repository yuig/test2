package nm;

import a.cb;
import com.google.gson.JsonParseException;
import com.google.gson.stream.MalformedJsonException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class g0 implements h0 {
    private static final /* synthetic */ g0[] $VALUES;
    public static final g0 BIG_DECIMAL;
    public static final g0 DOUBLE;
    public static final g0 LAZILY_PARSED_NUMBER;
    public static final g0 LONG_OR_DOUBLE;

    static {
        c0 c0Var = new c0("DOUBLE", 0);
        DOUBLE = c0Var;
        final String str = "LAZILY_PARSED_NUMBER";
        final int i13 = 1;
        g0 g0Var = new g0(str, i13) { // from class: nm.d0
            {
                c0 c0Var2 = null;
            }

            @Override // nm.g0, nm.h0
            public Number readNumber(um.a aVar) {
                return new pm.j(aVar.Y0());
            }
        };
        LAZILY_PARSED_NUMBER = g0Var;
        final String str2 = "LONG_OR_DOUBLE";
        final int i14 = 2;
        g0 g0Var2 = new g0(str2, i14) { // from class: nm.e0
            {
                c0 c0Var2 = null;
            }

            private Number parseAsDouble(String str3, um.a aVar) {
                try {
                    Double valueOf = Double.valueOf(str3);
                    if (!valueOf.isInfinite()) {
                        if (valueOf.isNaN()) {
                        }
                        return valueOf;
                    }
                    if (aVar.f122652b != b0.LENIENT) {
                        throw new MalformedJsonException("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar.o());
                    }
                    return valueOf;
                } catch (NumberFormatException e13) {
                    StringBuilder o13 = cb.o("Cannot parse ", str3, "; at path ");
                    o13.append(aVar.o());
                    throw new JsonParseException(o13.toString(), e13);
                }
            }

            @Override // nm.g0, nm.h0
            public Number readNumber(um.a aVar) {
                String Y0 = aVar.Y0();
                if (Y0.indexOf(46) >= 0) {
                    return parseAsDouble(Y0, aVar);
                }
                try {
                    return Long.valueOf(Long.parseLong(Y0));
                } catch (NumberFormatException unused) {
                    return parseAsDouble(Y0, aVar);
                }
            }
        };
        LONG_OR_DOUBLE = g0Var2;
        final String str3 = "BIG_DECIMAL";
        final int i15 = 3;
        g0 g0Var3 = new g0(str3, i15) { // from class: nm.f0
            {
                c0 c0Var2 = null;
            }

            @Override // nm.g0, nm.h0
            public BigDecimal readNumber(um.a aVar) {
                String Y0 = aVar.Y0();
                try {
                    return bs1.c.x1(Y0);
                } catch (NumberFormatException e13) {
                    StringBuilder o13 = cb.o("Cannot parse ", Y0, "; at path ");
                    o13.append(aVar.o());
                    throw new JsonParseException(o13.toString(), e13);
                }
            }
        };
        BIG_DECIMAL = g0Var3;
        $VALUES = new g0[]{c0Var, g0Var, g0Var2, g0Var3};
    }

    private g0(String str, int i13) {
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) $VALUES.clone();
    }

    public abstract /* synthetic */ Number readNumber(um.a aVar);

    public /* synthetic */ g0(String str, int i13, c0 c0Var) {
        this(str, i13);
    }
}
