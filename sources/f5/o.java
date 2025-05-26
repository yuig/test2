package f5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a */
    public final ConcurrentHashMap f61105a;

    public o(int i13) {
        if (i13 != 1) {
            this.f61105a = new ConcurrentHashMap();
        } else {
            this.f61105a = new ConcurrentHashMap();
        }
    }

    public static Object f(Object[] objArr, int i13, kp.n nVar) {
        int i14 = (i13 & 1) == 0 ? 400 : 700;
        boolean z13 = (i13 & 2) != 0;
        Object obj = null;
        int i15 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = (Math.abs(nVar.q0(obj2) - i14) * 2) + (nVar.s0(obj2) == z13 ? 0 : 1);
            if (obj == null || i15 > abs) {
                obj = obj2;
                i15 = abs;
            }
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Typeface a(android.content.Context r9, e5.f r10, android.content.res.Resources r11, int r12) {
        /*
            r8 = this;
            kp.n r0 = new kp.n
            r1 = 1
            r0.<init>(r1)
            e5.g[] r2 = r10.f57218a
            java.lang.Object r0 = f(r2, r12, r0)
            e5.g r0 = (e5.g) r0
            if (r0 != 0) goto L12
            r9 = 0
            return r9
        L12:
            int r4 = r0.f57224f
            java.lang.String r5 = r0.f57219a
            r6 = 0
            r2 = r9
            r3 = r11
            r7 = r12
            android.graphics.Typeface r9 = f5.j.c(r2, r3, r4, r5, r6, r7)
            java.lang.String r11 = "Could not retrieve font from family."
            java.lang.String r12 = "TypefaceCompatBaseImpl"
            r2 = 0
            if (r9 != 0) goto L28
        L26:
            r11 = r2
            goto L4a
        L28:
            java.lang.Class<android.graphics.Typeface> r0 = android.graphics.Typeface.class
            java.lang.String r4 = "native_instance"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r4)     // Catch: java.lang.IllegalAccessException -> L3e java.lang.NoSuchFieldException -> L40
            r0.setAccessible(r1)     // Catch: java.lang.IllegalAccessException -> L3e java.lang.NoSuchFieldException -> L40
            java.lang.Object r0 = r0.get(r9)     // Catch: java.lang.IllegalAccessException -> L3e java.lang.NoSuchFieldException -> L40
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.IllegalAccessException -> L3e java.lang.NoSuchFieldException -> L40
            long r11 = r0.longValue()     // Catch: java.lang.IllegalAccessException -> L3e java.lang.NoSuchFieldException -> L40
            goto L4a
        L3e:
            r0 = move-exception
            goto L42
        L40:
            r0 = move-exception
            goto L46
        L42:
            android.util.Log.e(r12, r11, r0)
            goto L26
        L46:
            android.util.Log.e(r12, r11, r0)
            goto L26
        L4a:
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 == 0) goto L57
            java.util.concurrent.ConcurrentHashMap r0 = r8.f61105a
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r0.put(r11, r10)
        L57:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.o.a(android.content.Context, e5.f, android.content.res.Resources, int):android.graphics.Typeface");
    }

    public Typeface b(Context context, m5.g[] gVarArr, int i13) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (gVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(g(i13, gVarArr).f85855a);
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            Typeface d2 = d(context, inputStream);
            b7.c.k(inputStream);
            return d2;
        } catch (IOException unused2) {
            b7.c.k(inputStream);
            return null;
        } catch (Throwable th4) {
            th = th4;
            inputStream2 = inputStream;
            b7.c.k(inputStream2);
            throw th;
        }
    }

    public Typeface c(Context context, List list, int i13) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, InputStream inputStream) {
        File y13 = b7.c.y(context);
        if (y13 == null) {
            return null;
        }
        try {
            if (b7.c.o(y13, inputStream)) {
                return Typeface.createFromFile(y13.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            y13.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i13, String str, int i14) {
        File y13 = b7.c.y(context);
        if (y13 == null) {
            return null;
        }
        try {
            if (b7.c.n(y13, resources, i13)) {
                return Typeface.createFromFile(y13.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            y13.delete();
        }
    }

    public m5.g g(int i13, m5.g[] gVarArr) {
        return (m5.g) f(gVarArr, i13, new kp.n(0));
    }
}
