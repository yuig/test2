package uk;

import com.google.gson.JsonParseException;
import il.l4;
import il.o5;
import il.v4;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f122358b = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f122359a;

    public g(ByteArrayInputStream byteArrayInputStream) {
        this.f122359a = byteArrayInputStream;
    }

    public static int a(nm.s sVar) {
        sVar.getClass();
        if (!(sVar instanceof nm.v)) {
            throw new IOException("invalid key id: not a JSON primitive");
        }
        if (!(sVar.j().f91367a instanceof Number)) {
            throw new IOException("invalid key id: not a JSON number");
        }
        Number n13 = sVar.j().n();
        try {
            el.h hVar = el.j.f59495a;
            if (!(n13 instanceof el.i)) {
                throw new IllegalArgumentException("does not contain a parsed number.");
            }
            long parseLong = Long.parseLong(n13.toString());
            if (parseLong > 4294967295L || parseLong < -2147483648L) {
                throw new IOException("invalid key id");
            }
            return (int) parseLong;
        } catch (NumberFormatException e13) {
            throw new IOException(e13);
        }
    }

    public static o5 b(String str) {
        str.getClass();
        switch (str) {
            case "LEGACY":
                return o5.LEGACY;
            case "RAW":
                return o5.RAW;
            case "TINK":
                return o5.TINK;
            case "CRUNCHY":
                return o5.CRUNCHY;
            default:
                throw new JsonParseException("unknown output prefix type: ".concat(str));
        }
    }

    public static l4 c(String str) {
        str.getClass();
        switch (str) {
            case "ENABLED":
                return l4.ENABLED;
            case "DESTROYED":
                return l4.DESTROYED;
            case "DISABLED":
                return l4.DISABLED;
            default:
                throw new JsonParseException("unknown status: ".concat(str));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0126, code lost:
    
        if (r4.equals("ASYMMETRIC_PRIVATE") == false) goto L32;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static il.v4 d(nm.u r11) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: uk.g.d(nm.u):il.v4");
    }

    public static g f(String str) {
        return new g(new ByteArrayInputStream(str.getBytes(f122358b)));
    }

    public final v4 e() {
        InputStream inputStream = this.f122359a;
        try {
            try {
                int i13 = v.f122377a;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        v4 d2 = d(el.j.b(new String(byteArrayOutputStream.toByteArray(), f122358b)).i());
                        inputStream.close();
                        return d2;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } catch (JsonParseException | IllegalStateException e13) {
                throw new IOException(e13);
            }
        } catch (Throwable th3) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th3;
        }
    }
}
