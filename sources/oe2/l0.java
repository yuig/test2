package oe2;

import com.squareup.moshi.JsonDataException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Set;

/* loaded from: classes4.dex */
public final class l0 extends r {

    /* renamed from: a, reason: collision with root package name */
    public final Class f94358a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f94359b;

    /* renamed from: c, reason: collision with root package name */
    public final Enum[] f94360c;

    /* renamed from: d, reason: collision with root package name */
    public final mc2.k f94361d;

    public l0(Class cls) {
        this.f94358a = cls;
        try {
            Enum[] enumArr = (Enum[]) cls.getEnumConstants();
            this.f94360c = enumArr;
            this.f94359b = new String[enumArr.length];
            int i13 = 0;
            while (true) {
                Enum[] enumArr2 = this.f94360c;
                if (i13 >= enumArr2.length) {
                    this.f94361d = mc2.k.b(this.f94359b);
                    return;
                }
                String name = enumArr2[i13].name();
                String[] strArr = this.f94359b;
                Field field = cls.getField(name);
                Set set = pe2.b.f99998a;
                p pVar = (p) field.getAnnotation(p.class);
                if (pVar != null) {
                    String name2 = pVar.name();
                    if (!"\u0000".equals(name2)) {
                        name = name2;
                    }
                }
                strArr[i13] = name;
                i13++;
            }
        } catch (NoSuchFieldException e13) {
            throw new AssertionError("Missing field in ".concat(cls.getName()), e13);
        }
    }

    @Override // oe2.r
    public final Object a(v vVar) {
        int i13;
        w wVar = (w) vVar;
        int i14 = wVar.f94390g;
        if (i14 == 0) {
            i14 = wVar.w();
        }
        if (i14 < 8 || i14 > 11) {
            i13 = -1;
        } else {
            mc2.k kVar = this.f94361d;
            if (i14 == 11) {
                i13 = wVar.A(wVar.f94393j, kVar);
            } else {
                int j03 = wVar.f94388e.j0((wo2.v) kVar.f86945b);
                if (j03 != -1) {
                    wVar.f94390g = 0;
                    int[] iArr = wVar.f94384d;
                    int i15 = wVar.f94381a - 1;
                    iArr[i15] = iArr[i15] + 1;
                    i13 = j03;
                } else {
                    String Y0 = wVar.Y0();
                    int A = wVar.A(Y0, kVar);
                    if (A == -1) {
                        wVar.f94390g = 11;
                        wVar.f94393j = Y0;
                        wVar.f94384d[wVar.f94381a - 1] = r1[r0] - 1;
                    }
                    i13 = A;
                }
            }
        }
        if (i13 != -1) {
            return this.f94360c[i13];
        }
        String f13 = vVar.f();
        throw new JsonDataException("Expected one of " + Arrays.asList(this.f94359b) + " but was " + vVar.Y0() + " at path " + f13);
    }

    @Override // oe2.r
    public final void d(y yVar, Object obj) {
        yVar.m(this.f94359b[((Enum) obj).ordinal()]);
    }

    public final String toString() {
        return "JsonAdapter(" + this.f94358a.getName() + ")";
    }
}
