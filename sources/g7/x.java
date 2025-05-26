package g7;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x implements f {

    /* renamed from: a, reason: collision with root package name */
    public final f f63848a;

    /* renamed from: b, reason: collision with root package name */
    public final dc2.i f63849b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f63850c;

    public x(f fVar, dc2.i iVar) {
        this.f63848a = fVar;
        this.f63849b = iVar;
    }

    @Override // g7.f
    public final void close() {
        if (this.f63850c) {
            this.f63850c = false;
            this.f63848a.close();
        }
    }

    @Override // g7.f
    public final long d(i dataSpec) {
        dc2.i iVar = this.f63849b;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(dataSpec, "dataSpec");
        LinkedHashMap h10 = z0.h(new Pair("X-Pinterest-Unauth-ID", iVar.f54415b));
        String str = iVar.f54414a;
        if (str != null) {
        }
        i f13 = dataSpec.f(h10);
        Intrinsics.checkNotNullExpressionValue(f13, "withAdditionalHeaders(...)");
        this.f63850c = true;
        return this.f63848a.d(f13);
    }

    @Override // g7.f
    public final Map e() {
        return this.f63848a.e();
    }

    @Override // g7.f
    public final void f(a0 a0Var) {
        a0Var.getClass();
        this.f63848a.f(a0Var);
    }

    @Override // g7.f
    public final Uri r() {
        Uri r13 = this.f63848a.r();
        if (r13 == null) {
            return null;
        }
        this.f63849b.getClass();
        return r13;
    }

    @Override // a7.k
    public final int read(byte[] bArr, int i13, int i14) {
        return this.f63848a.read(bArr, i13, i14);
    }
}
