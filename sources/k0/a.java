package k0;

import a.sc;
import a8.i0;
import a8.j0;
import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import androidx.media3.common.ParserException;
import c0.n0;
import com.pinterest.error.ServerError;
import df.b0;
import hq2.f;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kv0.p;
import lb.l0;
import q7.w;
import v5.x;

/* loaded from: classes2.dex */
public class a implements uj2.d {

    /* renamed from: a */
    public int f77777a;

    /* renamed from: b */
    public Object f77778b;

    /* renamed from: c */
    public Object f77779c;

    /* renamed from: d */
    public Object f77780d;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i13) {
        this.f77778b = obj;
        this.f77779c = obj2;
        this.f77780d = obj3;
        this.f77777a = i13;
    }

    @Override // uj2.d
    public void a() {
        int i13 = this.f77777a;
        Object obj = this.f77778b;
        switch (i13) {
            case 0:
                ((Function0) obj).invoke();
                break;
            default:
                if (((AtomicBoolean) this.f77779c).compareAndSet(false, true)) {
                    ((xj2.b) obj).dispose();
                    ((uj2.d) this.f77780d).a();
                    break;
                }
                break;
        }
    }

    @Override // uj2.d
    public void b(xj2.c d2) {
        switch (this.f77777a) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                break;
            default:
                ((xj2.b) this.f77778b).a(d2);
                break;
        }
    }

    public f c() {
        if (!((f) this.f77780d).l(this.f77777a)) {
            throw new IllegalStateException("unsupported coordinate system");
        }
        f a13 = ((f) this.f77780d).a();
        if (a13 == ((f) this.f77780d)) {
            throw new IllegalStateException("implementation returned current curve");
        }
        synchronized (a13) {
            a13.f69949f = this.f77777a;
            a13.f69950g = (p) this.f77778b;
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(this.f77779c);
        }
        return a13;
    }

    public void d(String str, Object... objArr) {
        if (this.f77777a <= 3) {
            String str2 = (String) this.f77778b;
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(str2, ((String) this.f77779c).concat(str));
        }
    }

    public Object e() {
        Object removeLast;
        synchronized (this.f77779c) {
            removeLast = ((ArrayDeque) this.f77778b).removeLast();
        }
        return removeLast;
    }

    public void f(Object obj) {
        Object e13;
        synchronized (this.f77779c) {
            try {
                e13 = ((ArrayDeque) this.f77778b).size() >= this.f77777a ? e() : null;
                ((ArrayDeque) this.f77778b).addFirst(obj);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        sc scVar = (sc) this.f77780d;
        if (scVar == null || e13 == null) {
            return;
        }
        scVar.getClass();
        ((n0) e13).close();
    }

    public String g(w wVar, Uri uri, int i13) {
        int i14 = this.f77777a;
        if (i14 == 1) {
            String str = wVar.f102691b + ":" + wVar.f102692c;
            Pattern pattern = j0.f1371a;
            String encodeToString = Base64.encodeToString(str.getBytes(i0.f1362g), 0);
            int i15 = d7.n0.f53866a;
            Locale locale = Locale.US;
            return a.a.j("Basic ", encodeToString);
        }
        if (i14 != 2) {
            throw new ParserException(null, new UnsupportedOperationException(), false, 4);
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            String j13 = j0.j(i13);
            String str2 = wVar.f102691b + ":" + ((String) this.f77778b) + ":" + wVar.f102692c;
            Charset charset = i0.f1362g;
            String n03 = d7.n0.n0(messageDigest.digest((d7.n0.n0(messageDigest.digest(str2.getBytes(charset))) + ":" + ((String) this.f77779c) + ":" + d7.n0.n0(messageDigest.digest((j13 + ":" + uri).getBytes(charset)))).getBytes(charset)));
            boolean isEmpty = ((String) this.f77780d).isEmpty();
            String str3 = wVar.f102691b;
            return isEmpty ? String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", str3, (String) this.f77778b, (String) this.f77779c, uri, n03) : String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", str3, (String) this.f77778b, (String) this.f77779c, uri, n03, (String) this.f77780d);
        } catch (NoSuchAlgorithmException e13) {
            throw new ParserException(null, e13, false, 4);
        }
    }

    public boolean h() {
        boolean isEmpty;
        synchronized (this.f77779c) {
            isEmpty = ((ArrayDeque) this.f77778b).isEmpty();
        }
        return isEmpty;
    }

    @Override // uj2.d
    public void onError(Throwable e13) {
        int i13 = this.f77777a;
        Object obj = this.f77780d;
        Object obj2 = this.f77779c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(e13, "e");
                if (e13 instanceof ServerError) {
                    ServerError serverError = (ServerError) e13;
                    String str = (String) serverError.f45048e.getValue();
                    if (str != null && str.length() != 0) {
                        ((ll0.f) obj2).f83809h.i((String) serverError.f45048e.getValue());
                        ((Function1) obj).invoke(e13);
                        break;
                    }
                }
                ((ll0.f) obj2).f83809h.i(e13.getMessage());
                ((Function1) obj).invoke(e13);
                break;
            default:
                if (!((AtomicBoolean) obj2).compareAndSet(false, true)) {
                    l0.R0(e13);
                    break;
                } else {
                    ((xj2.b) this.f77778b).dispose();
                    ((uj2.d) obj).onError(e13);
                    break;
                }
        }
    }

    public a(String str, String... strArr) {
        String sb3;
        if (strArr.length == 0) {
            sb3 = "";
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append('[');
            for (String str2 : strArr) {
                if (sb4.length() > 1) {
                    sb4.append(",");
                }
                sb4.append(str2);
            }
            sb4.append("] ");
            sb3 = sb4.toString();
        }
        this.f77779c = sb3;
        this.f77778b = str;
        b0 b0Var = new b0();
        Object[] objArr = {str, 23};
        if (!(str.length() <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        b0Var.f54715a = str;
        b0Var.f54716b = null;
        this.f77780d = b0Var;
        int i13 = 2;
        while (i13 <= 7 && !Log.isLoggable((String) this.f77778b, i13)) {
            i13++;
        }
        this.f77777a = i13;
    }

    public a(int i13, sc scVar) {
        this.f77779c = new Object();
        this.f77777a = i13;
        this.f77778b = new ArrayDeque(this.f77777a);
        this.f77780d = scVar;
    }

    public a(String str, int i13, String str2, String str3) {
        this.f77777a = i13;
        this.f77778b = str;
        this.f77779c = str2;
        this.f77780d = str3;
    }

    public a(String str, String str2, x xVar) {
        boolean z13 = true;
        bf.b.i(str == null || str.length() <= 64);
        if (str2 != null && str2.length() > 64) {
            z13 = false;
        }
        bf.b.i(z13);
        this.f77778b = str;
        this.f77779c = str2;
        this.f77780d = xVar;
        this.f77777a = 0;
    }
}
