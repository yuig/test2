package z;

import android.text.TextUtils;
import bg.k;
import com.google.gson.JsonIOException;
import h6.g0;
import h6.u;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.Intrinsics;
import ll.s;
import pm.p;

/* loaded from: classes2.dex */
public final class a implements u, k, p, yn.c {

    /* renamed from: a */
    public final /* synthetic */ int f140497a;

    /* renamed from: b */
    public String f140498b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(int i13) {
        this("UTF-8", 10, 0);
        this.f140497a = i13;
        if (i13 == 3) {
            this.f140498b = null;
        } else {
            if (i13 != 10) {
                return;
            }
        }
    }

    public static a m() {
        return new a(String.valueOf(','), 6);
    }

    public static a n(String str) {
        return new a(str, 6);
    }

    public static final CharSequence o(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // h6.u
    public final boolean a(CharSequence charSequence, int i13, int i14, g0 g0Var) {
        if (!TextUtils.equals(charSequence.subSequence(i13, i14), this.f140498b)) {
            return true;
        }
        g0Var.f67718c = (g0Var.f67718c & 3) | 4;
        return false;
    }

    @Override // h6.u
    public final Object b() {
        return this;
    }

    @Override // bg.k
    public final Reader d(String str) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (this.f140498b != null && str != null) {
            if (str.startsWith("/") && this.f140498b.endsWith("/")) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f140498b.substring(0, r2.length() - 1));
                sb3.append(str);
                str = sb3.toString();
            } else if ((!str.startsWith("/") || this.f140498b.endsWith("/")) && (str.startsWith("/") || !this.f140498b.endsWith("/"))) {
                str = this.f140498b + "/" + str;
            } else {
                str = a.a.p(new StringBuilder(), this.f140498b, str);
            }
        }
        String path = URI.create(str).normalize().getPath();
        InputStream resourceAsStream = contextClassLoader.getResourceAsStream(path);
        if (resourceAsStream == null) {
            resourceAsStream = a.class.getClassLoader().getResourceAsStream(path);
        }
        if (resourceAsStream != null) {
            return new BufferedReader(new InputStreamReader(resourceAsStream, StandardCharsets.UTF_8));
        }
        return null;
    }

    public final void e(StringBuilder sb3, Iterable iterable) {
        f(sb3, iterable.iterator());
    }

    public final void f(StringBuilder sb3, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb3.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb3.append((CharSequence) this.f140498b);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb3.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e13) {
            throw new AssertionError(e13);
        }
    }

    public final byte[] g(int i13, byte[] bArr, byte[] bArr2) {
        Mac mac = (Mac) s.f83769c.a(this.f140498b);
        if (i13 > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        byte[] bArr3 = new byte[i13];
        mac.init(new SecretKeySpec(bArr, this.f140498b));
        byte[] bArr4 = new byte[0];
        int i14 = 1;
        int i15 = 0;
        while (true) {
            mac.update(bArr4);
            mac.update(bArr2);
            mac.update((byte) i14);
            bArr4 = mac.doFinal();
            if (bArr4.length + i15 >= i13) {
                System.arraycopy(bArr4, 0, bArr3, i15, i13 - i15);
                return bArr3;
            }
            System.arraycopy(bArr4, 0, bArr3, i15, bArr4.length);
            i15 += bArr4.length;
            i14++;
        }
    }

    public final byte[] h(byte[] bArr, byte[] bArr2) {
        Mac mac = (Mac) s.f83769c.a(this.f140498b);
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], this.f140498b));
        } else {
            mac.init(new SecretKeySpec(bArr2, this.f140498b));
        }
        return mac.doFinal(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
    
        if (r0 != null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002c, code lost:
    
        if (r1 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x001a, code lost:
    
        if (r3 != null) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.InputStream i() {
        /*
            r4 = this;
            java.lang.String r0 = r4.f140498b
            java.lang.Class<z.a> r1 = z.a.class
            java.io.InputStream r2 = r1.getResourceAsStream(r0)
            if (r2 == 0) goto Lb
            goto L45
        Lb:
            r2 = 0
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L22
            java.lang.ClassLoader r3 = r3.getContextClassLoader()     // Catch: java.lang.Throwable -> L22
            if (r3 == 0) goto L1d
            java.io.InputStream r3 = r3.getResourceAsStream(r0)     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L1d
            goto L1e
        L1d:
            r3 = r2
        L1e:
            if (r3 == 0) goto L22
            r2 = r3
            goto L45
        L22:
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L2f
            java.io.InputStream r1 = r1.getResourceAsStream(r0)     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L2f
            goto L30
        L2f:
            r1 = r2
        L30:
            if (r1 == 0) goto L34
            r2 = r1
            goto L45
        L34:
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L41
            java.io.InputStream r0 = r1.getResourceAsStream(r0)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L41
            goto L42
        L41:
            r0 = r2
        L42:
            if (r0 == 0) goto L45
            r2 = r0
        L45:
            if (r2 == 0) goto L48
            return r2
        L48:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r1 = "Could not get resource as stream"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z.a.i():java.io.InputStream");
    }

    public final byte[] j() {
        String str = this.f140498b;
        str.getClass();
        switch (str) {
            case "HmacSha256":
                return cl.k.f27961f;
            case "HmacSha384":
                return cl.k.f27962g;
            case "HmacSha512":
                return cl.k.f27963h;
            default:
                throw new GeneralSecurityException("Could not determine HPKE KDF ID");
        }
    }

    @Override // yn.c
    /* renamed from: k */
    public final String c(InputStream inputStream) {
        StringBuilder sb3 = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream, this.f140498b));
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        bufferedReader2.close();
                        return sb3.toString();
                    }
                    sb3.append(readLine);
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final String l(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb3 = new StringBuilder();
        f(sb3, it);
        return sb3.toString();
    }

    public final String toString() {
        switch (this.f140497a) {
            case 15:
                return this.f140498b;
            default:
                return super.toString();
        }
    }

    @Override // pm.p
    public final Object u() {
        switch (this.f140497a) {
            case 8:
                throw new JsonIOException(this.f140498b);
            default:
                throw new JsonIOException(this.f140498b);
        }
    }

    public a(String logMsg, int i13) {
        this.f140497a = i13;
        if (i13 == 6) {
            logMsg.getClass();
            this.f140498b = logMsg;
        } else if (i13 != 12) {
            this.f140498b = ",\n  ";
        } else {
            Intrinsics.checkNotNullParameter(logMsg, "logMsg");
            this.f140498b = logMsg;
        }
    }

    public /* synthetic */ a(String str, int i13, int i14) {
        this.f140497a = i13;
        this.f140498b = str;
    }
}
