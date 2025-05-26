package bl;

import com.google.crypto.tink.internal.TinkBugException;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public final class f extends v {

    /* renamed from: g, reason: collision with root package name */
    public static final Set f23420g = (Set) TinkBugException.a(new mj.m(14));

    /* renamed from: a, reason: collision with root package name */
    public final b f23421a;

    /* renamed from: b, reason: collision with root package name */
    public final c f23422b;

    /* renamed from: c, reason: collision with root package name */
    public final d f23423c;

    /* renamed from: d, reason: collision with root package name */
    public final e f23424d;

    /* renamed from: e, reason: collision with root package name */
    public final uk.q f23425e;

    /* renamed from: f, reason: collision with root package name */
    public final ml.a f23426f;

    public f(b bVar, c cVar, d dVar, uk.q qVar, e eVar, ml.a aVar) {
        this.f23421a = bVar;
        this.f23422b = cVar;
        this.f23423c = dVar;
        this.f23425e = qVar;
        this.f23424d = eVar;
        this.f23426f = aVar;
    }

    @Override // uk.q
    public final boolean a() {
        return this.f23424d != e.f23418d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Objects.equals(fVar.f23421a, this.f23421a) && Objects.equals(fVar.f23422b, this.f23422b) && Objects.equals(fVar.f23423c, this.f23423c) && Objects.equals(fVar.f23425e, this.f23425e) && Objects.equals(fVar.f23424d, this.f23424d) && Objects.equals(fVar.f23426f, this.f23426f);
    }

    public final int hashCode() {
        return Objects.hash(f.class, this.f23421a, this.f23422b, this.f23423c, this.f23425e, this.f23424d, this.f23426f);
    }

    public final String toString() {
        return String.format("EciesParameters(curveType=%s, hashType=%s, pointFormat=%s, demParameters=%s, variant=%s, salt=%s)", this.f23421a, this.f23422b, this.f23423c, this.f23425e, this.f23424d, this.f23426f);
    }
}
