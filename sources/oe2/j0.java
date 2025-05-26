package oe2;

import com.squareup.moshi.JsonDataException;
import java.math.BigDecimal;
import kotlin.text.Charsets;
import t3.s1;

/* loaded from: classes4.dex */
public final class j0 extends r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94349a;

    public j0(int i13) {
        this.f94349a = i13;
    }

    @Override // oe2.r
    public final Object a(v vVar) {
        long j13;
        boolean z13 = true;
        switch (this.f94349a) {
            case 0:
                return vVar.Y0();
            case 1:
                w wVar = (w) vVar;
                int i13 = wVar.f94390g;
                if (i13 == 0) {
                    i13 = wVar.w();
                }
                if (i13 == 5) {
                    wVar.f94390g = 0;
                    int[] iArr = wVar.f94384d;
                    int i14 = wVar.f94381a - 1;
                    iArr[i14] = iArr[i14] + 1;
                } else {
                    if (i13 != 6) {
                        throw new JsonDataException("Expected a boolean but was " + wVar.g() + " at path " + wVar.f());
                    }
                    wVar.f94390g = 0;
                    int[] iArr2 = wVar.f94384d;
                    int i15 = wVar.f94381a - 1;
                    iArr2[i15] = iArr2[i15] + 1;
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            case 2:
                return Byte.valueOf((byte) n0.a(vVar, "a byte", -128, 255));
            case 3:
                String Y0 = vVar.Y0();
                if (Y0.length() <= 1) {
                    return Character.valueOf(Y0.charAt(0));
                }
                throw new JsonDataException(s1.c("Expected a char but was ", s1.b("\"", Y0, '\"'), " at path ", vVar.f()));
            case 4:
                return Double.valueOf(vVar.s1());
            case 5:
                float s13 = (float) vVar.s1();
                if (!Float.isInfinite(s13)) {
                    return Float.valueOf(s13);
                }
                throw new JsonDataException("JSON forbids NaN and infinities: " + s13 + " at path " + vVar.f());
            case 6:
                return Integer.valueOf(vVar.o0());
            case 7:
                w wVar2 = (w) vVar;
                int i16 = wVar2.f94390g;
                if (i16 == 0) {
                    i16 = wVar2.w();
                }
                if (i16 == 16) {
                    wVar2.f94390g = 0;
                    int[] iArr3 = wVar2.f94384d;
                    int i17 = wVar2.f94381a - 1;
                    iArr3[i17] = iArr3[i17] + 1;
                    j13 = wVar2.f94391h;
                } else {
                    if (i16 == 17) {
                        long j14 = wVar2.f94392i;
                        wo2.j jVar = wVar2.f94389f;
                        jVar.getClass();
                        wVar2.f94393j = jVar.L(j14, Charsets.UTF_8);
                    } else if (i16 == 9 || i16 == 8) {
                        String L = i16 == 9 ? wVar2.L(w.f94386l) : wVar2.L(w.f94385k);
                        wVar2.f94393j = L;
                        try {
                            long parseLong = Long.parseLong(L);
                            wVar2.f94390g = 0;
                            int[] iArr4 = wVar2.f94384d;
                            int i18 = wVar2.f94381a - 1;
                            iArr4[i18] = iArr4[i18] + 1;
                            j13 = parseLong;
                        } catch (NumberFormatException unused) {
                        }
                    } else if (i16 != 11) {
                        throw new JsonDataException("Expected a long but was " + wVar2.g() + " at path " + wVar2.f());
                    }
                    wVar2.f94390g = 11;
                    try {
                        long longValueExact = new BigDecimal(wVar2.f94393j).longValueExact();
                        wVar2.f94393j = null;
                        wVar2.f94390g = 0;
                        int[] iArr5 = wVar2.f94384d;
                        int i19 = wVar2.f94381a - 1;
                        iArr5[i19] = iArr5[i19] + 1;
                        j13 = longValueExact;
                    } catch (ArithmeticException | NumberFormatException unused2) {
                        throw new JsonDataException("Expected a long but was " + wVar2.f94393j + " at path " + wVar2.f());
                    }
                }
                return Long.valueOf(j13);
            default:
                return Short.valueOf((short) n0.a(vVar, "a short", -32768, 32767));
        }
    }

    @Override // oe2.r
    public final void d(y yVar, Object obj) {
        switch (this.f94349a) {
            case 0:
                yVar.m((String) obj);
                return;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                x xVar = (x) yVar;
                if (xVar.f94401e) {
                    throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + xVar.e());
                }
                xVar.A();
                xVar.o();
                xVar.f94395g.l0(booleanValue ? "true" : "false");
                int[] iArr = xVar.f94400d;
                int i13 = xVar.f94397a - 1;
                iArr[i13] = iArr[i13] + 1;
                return;
            case 2:
                yVar.k(((Byte) obj).intValue() & 255);
                return;
            case 3:
                yVar.m(((Character) obj).toString());
                return;
            case 4:
                double doubleValue = ((Double) obj).doubleValue();
                x xVar2 = (x) yVar;
                xVar2.getClass();
                if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was " + doubleValue);
                }
                if (xVar2.f94401e) {
                    xVar2.f94401e = false;
                    xVar2.f(Double.toString(doubleValue));
                    return;
                }
                xVar2.A();
                xVar2.o();
                xVar2.f94395g.l0(Double.toString(doubleValue));
                int[] iArr2 = xVar2.f94400d;
                int i14 = xVar2.f94397a - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return;
            case 5:
                Float f13 = (Float) obj;
                f13.getClass();
                x xVar3 = (x) yVar;
                xVar3.getClass();
                String obj2 = f13.toString();
                if (obj2.equals("-Infinity") || obj2.equals("Infinity") || obj2.equals("NaN")) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was " + f13);
                }
                if (xVar3.f94401e) {
                    xVar3.f94401e = false;
                    xVar3.f(obj2);
                    return;
                }
                xVar3.A();
                xVar3.o();
                xVar3.f94395g.l0(obj2);
                int[] iArr3 = xVar3.f94400d;
                int i15 = xVar3.f94397a - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return;
            case 6:
                yVar.k(((Integer) obj).intValue());
                return;
            case 7:
                yVar.k(((Long) obj).longValue());
                return;
            default:
                yVar.k(((Short) obj).intValue());
                return;
        }
    }

    public final String toString() {
        switch (this.f94349a) {
            case 0:
                return "JsonAdapter(String)";
            case 1:
                return "JsonAdapter(Boolean)";
            case 2:
                return "JsonAdapter(Byte)";
            case 3:
                return "JsonAdapter(Character)";
            case 4:
                return "JsonAdapter(Double)";
            case 5:
                return "JsonAdapter(Float)";
            case 6:
                return "JsonAdapter(Integer)";
            case 7:
                return "JsonAdapter(Long)";
            default:
                return "JsonAdapter(Short)";
        }
    }
}
