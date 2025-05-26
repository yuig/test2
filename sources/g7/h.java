package g7;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import pk.a3;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a */
    public Uri f63776a;

    /* renamed from: b */
    public long f63777b;

    /* renamed from: d */
    public byte[] f63779d;

    /* renamed from: f */
    public long f63781f;

    /* renamed from: h */
    public String f63783h;

    /* renamed from: i */
    public int f63784i;

    /* renamed from: j */
    public Object f63785j;

    /* renamed from: c */
    public int f63778c = 1;

    /* renamed from: e */
    public Map f63780e = Collections.emptyMap();

    /* renamed from: g */
    public long f63782g = -1;

    public final i a() {
        bf.b.x(this.f63776a, "The uri must be set.");
        return new i(this.f63776a, this.f63777b, this.f63778c, this.f63779d, this.f63780e, this.f63781f, this.f63782g, this.f63783h, this.f63784i, this.f63785j);
    }

    public final void b(int i13) {
        this.f63784i = i13;
    }

    public final void c() {
        this.f63780e = a3.f100350g;
    }

    public final void d(String str) {
        this.f63783h = str;
    }
}
