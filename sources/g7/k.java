package g7;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import d7.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class k implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f63798a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f63799b;

    /* renamed from: c, reason: collision with root package name */
    public final f f63800c;

    /* renamed from: d, reason: collision with root package name */
    public q f63801d;

    /* renamed from: e, reason: collision with root package name */
    public a f63802e;

    /* renamed from: f, reason: collision with root package name */
    public c f63803f;

    /* renamed from: g, reason: collision with root package name */
    public f f63804g;

    /* renamed from: h, reason: collision with root package name */
    public b0 f63805h;

    /* renamed from: i, reason: collision with root package name */
    public d f63806i;

    /* renamed from: j, reason: collision with root package name */
    public v f63807j;

    /* renamed from: k, reason: collision with root package name */
    public f f63808k;

    public k(Context context, f fVar) {
        this.f63798a = context.getApplicationContext();
        fVar.getClass();
        this.f63800c = fVar;
        this.f63799b = new ArrayList();
    }

    public static void B(f fVar, a0 a0Var) {
        if (fVar != null) {
            fVar.f(a0Var);
        }
    }

    public final f A() {
        if (this.f63805h == null) {
            b0 b0Var = new b0();
            this.f63805h = b0Var;
            t(b0Var);
        }
        return this.f63805h;
    }

    @Override // g7.f
    public final void close() {
        f fVar = this.f63808k;
        if (fVar != null) {
            try {
                fVar.close();
            } finally {
                this.f63808k = null;
            }
        }
    }

    @Override // g7.f
    public final long d(i iVar) {
        bf.b.t(this.f63808k == null);
        String scheme = iVar.f63786a.getScheme();
        int i13 = n0.f53866a;
        Uri uri = iVar.f63786a;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f63808k = x();
            } else {
                this.f63808k = u();
            }
        } else if ("asset".equals(scheme)) {
            this.f63808k = u();
        } else if ("content".equals(scheme)) {
            this.f63808k = v();
        } else if ("rtmp".equals(scheme)) {
            this.f63808k = z();
        } else if ("udp".equals(scheme)) {
            this.f63808k = A();
        } else if ("data".equals(scheme)) {
            this.f63808k = w();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f63808k = y();
        } else {
            this.f63808k = this.f63800c;
        }
        return this.f63808k.d(iVar);
    }

    @Override // g7.f
    public final Map e() {
        f fVar = this.f63808k;
        return fVar == null ? Collections.emptyMap() : fVar.e();
    }

    @Override // g7.f
    public final void f(a0 a0Var) {
        a0Var.getClass();
        this.f63800c.f(a0Var);
        this.f63799b.add(a0Var);
        B(this.f63801d, a0Var);
        B(this.f63802e, a0Var);
        B(this.f63803f, a0Var);
        B(this.f63804g, a0Var);
        B(this.f63805h, a0Var);
        B(this.f63806i, a0Var);
        B(this.f63807j, a0Var);
    }

    @Override // g7.f
    public final Uri r() {
        f fVar = this.f63808k;
        if (fVar == null) {
            return null;
        }
        return fVar.r();
    }

    @Override // a7.k
    public final int read(byte[] bArr, int i13, int i14) {
        f fVar = this.f63808k;
        fVar.getClass();
        return fVar.read(bArr, i13, i14);
    }

    public final void t(f fVar) {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f63799b;
            if (i13 >= arrayList.size()) {
                return;
            }
            fVar.f((a0) arrayList.get(i13));
            i13++;
        }
    }

    public final f u() {
        if (this.f63802e == null) {
            a aVar = new a(this.f63798a);
            this.f63802e = aVar;
            t(aVar);
        }
        return this.f63802e;
    }

    public final f v() {
        if (this.f63803f == null) {
            c cVar = new c(this.f63798a);
            this.f63803f = cVar;
            t(cVar);
        }
        return this.f63803f;
    }

    public final f w() {
        if (this.f63806i == null) {
            d dVar = new d();
            this.f63806i = dVar;
            t(dVar);
        }
        return this.f63806i;
    }

    public final f x() {
        if (this.f63801d == null) {
            q qVar = new q(false);
            this.f63801d = qVar;
            t(qVar);
        }
        return this.f63801d;
    }

    public final f y() {
        if (this.f63807j == null) {
            v vVar = new v(this.f63798a);
            this.f63807j = vVar;
            t(vVar);
        }
        return this.f63807j;
    }

    public final f z() {
        if (this.f63804g == null) {
            try {
                f fVar = (f) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f63804g = fVar;
                t(fVar);
            } catch (ClassNotFoundException unused) {
                d7.u.g("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e13) {
                throw new RuntimeException("Error instantiating RTMP extension", e13);
            }
            if (this.f63804g == null) {
                this.f63804g = this.f63800c;
            }
        }
        return this.f63804g;
    }
}
