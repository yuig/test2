package g7;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class y implements f {

    /* renamed from: a, reason: collision with root package name */
    public final f f63851a;

    /* renamed from: b, reason: collision with root package name */
    public long f63852b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f63853c;

    /* renamed from: d, reason: collision with root package name */
    public Map f63854d;

    public y(f fVar) {
        fVar.getClass();
        this.f63851a = fVar;
        this.f63853c = Uri.EMPTY;
        this.f63854d = Collections.emptyMap();
    }

    @Override // g7.f
    public final void close() {
        this.f63851a.close();
    }

    @Override // g7.f
    public final long d(i iVar) {
        f fVar = this.f63851a;
        this.f63853c = iVar.f63786a;
        this.f63854d = Collections.emptyMap();
        try {
            return fVar.d(iVar);
        } finally {
            Uri r13 = fVar.r();
            if (r13 != null) {
                this.f63853c = r13;
            }
            this.f63854d = fVar.e();
        }
    }

    @Override // g7.f
    public final Map e() {
        return this.f63851a.e();
    }

    @Override // g7.f
    public final void f(a0 a0Var) {
        a0Var.getClass();
        this.f63851a.f(a0Var);
    }

    @Override // g7.f
    public final Uri r() {
        return this.f63851a.r();
    }

    @Override // a7.k
    public final int read(byte[] bArr, int i13, int i14) {
        int read = this.f63851a.read(bArr, i13, i14);
        if (read != -1) {
            this.f63852b += read;
        }
        return read;
    }
}
