package g7;

import a7.j0;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f63786a;

    /* renamed from: b, reason: collision with root package name */
    public final long f63787b;

    /* renamed from: c, reason: collision with root package name */
    public final int f63788c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f63789d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f63790e;

    /* renamed from: f, reason: collision with root package name */
    public final long f63791f;

    /* renamed from: g, reason: collision with root package name */
    public final long f63792g;

    /* renamed from: h, reason: collision with root package name */
    public final String f63793h;

    /* renamed from: i, reason: collision with root package name */
    public final int f63794i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f63795j;

    static {
        j0.a("media3.datasource");
    }

    public i(Uri uri) {
        this(uri, 0L, -1L);
    }

    public static String b(int i13) {
        if (i13 == 1) {
            return "GET";
        }
        if (i13 == 2) {
            return "POST";
        }
        if (i13 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public final h a() {
        h hVar = new h();
        hVar.f63776a = this.f63786a;
        hVar.f63777b = this.f63787b;
        hVar.f63778c = this.f63788c;
        hVar.f63779d = this.f63789d;
        hVar.f63780e = this.f63790e;
        hVar.f63781f = this.f63791f;
        hVar.f63782g = this.f63792g;
        hVar.f63783h = this.f63793h;
        hVar.f63784i = this.f63794i;
        hVar.f63785j = this.f63795j;
        return hVar;
    }

    public final boolean c(int i13) {
        return (this.f63794i & i13) == i13;
    }

    public final i d(long j13) {
        long j14 = this.f63792g;
        return e(j13, j14 != -1 ? j14 - j13 : -1L);
    }

    public final i e(long j13, long j14) {
        if (j13 == 0 && this.f63792g == j14) {
            return this;
        }
        return new i(this.f63786a, this.f63787b, this.f63788c, this.f63789d, this.f63790e, this.f63791f + j13, j14, this.f63793h, this.f63794i, this.f63795j);
    }

    public final i f(Map map) {
        HashMap hashMap = new HashMap(this.f63790e);
        hashMap.putAll(map);
        return new i(this.f63786a, this.f63787b, this.f63788c, this.f63789d, hashMap, this.f63791f, this.f63792g, this.f63793h, this.f63794i, this.f63795j);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DataSpec[");
        sb3.append(b(this.f63788c));
        sb3.append(" ");
        sb3.append(this.f63786a);
        sb3.append(", ");
        sb3.append(this.f63791f);
        sb3.append(", ");
        sb3.append(this.f63792g);
        sb3.append(", ");
        sb3.append(this.f63793h);
        sb3.append(", ");
        return a.a.n(sb3, this.f63794i, "]");
    }

    public i(Uri uri, long j13, int i13, byte[] bArr, Map map, long j14, long j15, String str, int i14, Object obj) {
        byte[] bArr2 = bArr;
        boolean z13 = true;
        bf.b.i(j13 + j14 >= 0);
        bf.b.i(j14 >= 0);
        if (j15 <= 0 && j15 != -1) {
            z13 = false;
        }
        bf.b.i(z13);
        uri.getClass();
        this.f63786a = uri;
        this.f63787b = j13;
        this.f63788c = i13;
        this.f63789d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f63790e = Collections.unmodifiableMap(new HashMap(map));
        this.f63791f = j14;
        this.f63792g = j15;
        this.f63793h = str;
        this.f63794i = i14;
        this.f63795j = obj;
    }

    public i(Uri uri, long j13, long j14) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j13, j14, null, 0, null);
    }
}
