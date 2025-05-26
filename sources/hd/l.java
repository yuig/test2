package hd;

import com.bugsnag.android.n1;
import com.bugsnag.android.o1;
import com.bugsnag.android.repackaged.dslplatform.json.t;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.z;
import t3.s1;

/* loaded from: classes3.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final com.bugsnag.android.repackaged.dslplatform.json.k f68841a;

    static {
        com.bugsnag.android.repackaged.dslplatform.json.j jVar = new com.bugsnag.android.repackaged.dslplatform.json.j();
        jVar.f29513a = new f();
        com.bugsnag.android.repackaged.dslplatform.json.k kVar = new com.bugsnag.android.repackaged.dslplatform.json.k(jVar);
        f68841a = kVar;
        kVar.k(Date.class, new k());
    }

    public static Map a(InputStream inputStream) {
        int read;
        com.bugsnag.android.repackaged.dslplatform.json.k kVar = f68841a;
        kVar.getClass();
        t tVar = (t) kVar.f29537k.get();
        tVar.f29570c = 0L;
        int i13 = tVar.f29583p;
        byte[] bArr = tVar.f29582o;
        tVar.f29569b = 0;
        tVar.f29577j = inputStream;
        int i14 = tVar.f29572e;
        int i15 = tVar.f29579l;
        if (i14 >= i15) {
            i14 = i15;
        }
        tVar.f29578k = i14;
        byte[] bArr2 = tVar.f29575h;
        int i16 = 0;
        while (i16 < bArr2.length && (read = inputStream.read(bArr2, i16, bArr2.length - i16)) != -1) {
            i16 += read;
        }
        int i17 = tVar.f29579l;
        if (i16 < i17) {
            i17 = i16;
        }
        tVar.f29578k = i17;
        tVar.f29572e = i16;
        try {
            Object b13 = kVar.b(tVar, inputStream);
            tVar.f29575h = bArr;
            tVar.f29579l = i13;
            tVar.f29569b = 0;
            tVar.f29572e = 0;
            tVar.f29578k = 0;
            tVar.f29577j = null;
            Map map = (Map) b13;
            if (map != null) {
                return dl2.b.u(map);
            }
            throw new IllegalArgumentException("JSON document is invalid".toString());
        } catch (Throwable th3) {
            tVar.f29575h = bArr;
            tVar.f29579l = i13;
            tVar.f29569b = 0;
            tVar.f29572e = 0;
            tVar.f29578k = 0;
            tVar.f29577j = null;
            throw th3;
        }
    }

    public static Long b(Object obj) {
        long longValue;
        Long valueOf;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException("Cannot convert " + obj + " to long");
        }
        String str = (String) obj;
        if (str.length() == 0) {
            return null;
        }
        try {
            valueOf = Long.decode((String) obj);
        } catch (NumberFormatException e13) {
            if (z.p(str, "0x", false)) {
                if (str.length() != 18) {
                    throw e13;
                }
                int length = str.length() - 2;
                String substring = str.substring(0, length);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                long longValue2 = Long.decode(substring).longValue() << 8;
                String substring2 = str.substring(length, str.length());
                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                longValue = Long.parseLong(substring2, CharsKt.checkRadix(16)) | longValue2;
            } else {
                if (str.length() < 19) {
                    throw e13;
                }
                int length2 = str.length() - 3;
                String substring3 = str.substring(0, length2);
                Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                long longValue3 = Long.decode(substring3).longValue() * 1000;
                String substring4 = str.substring(length2, str.length());
                Intrinsics.checkNotNullExpressionValue(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
                longValue = Long.decode(substring4).longValue() + longValue3;
            }
            valueOf = Long.valueOf(longValue);
        }
        return valueOf;
    }

    public static byte[] c(n1 n1Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            o1 o1Var = new o1(new PrintWriter(byteArrayOutputStream));
            try {
                n1Var.toStream(o1Var);
                Unit unit = Unit.f80348a;
                dl2.b.J(o1Var, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dl2.b.J(byteArrayOutputStream, null);
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static String d(Long l13) {
        if (l13 == null) {
            return null;
        }
        return l13.longValue() >= 0 ? s1.d(new Object[]{l13}, 1, "0x%x", "format(this, *args)") : s1.d(new Object[]{Long.valueOf(l13.longValue() >>> 8), Long.valueOf(l13.longValue() & 255)}, 2, "0x%x%02x", "format(this, *args)");
    }
}
