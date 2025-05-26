package bl;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class m extends v {

    /* renamed from: a, reason: collision with root package name */
    public final k f23449a;

    /* renamed from: b, reason: collision with root package name */
    public final j f23450b;

    /* renamed from: c, reason: collision with root package name */
    public final i f23451c;

    /* renamed from: d, reason: collision with root package name */
    public final l f23452d;

    public m(k kVar, j jVar, i iVar, l lVar) {
        this.f23449a = kVar;
        this.f23450b = jVar;
        this.f23451c = iVar;
        this.f23452d = lVar;
    }

    public static m.h b() {
        return new m.h((jq.b) null);
    }

    @Override // uk.q
    public final boolean a() {
        return this.f23452d != l.f23447d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f23449a == mVar.f23449a && this.f23450b == mVar.f23450b && this.f23451c == mVar.f23451c && this.f23452d == mVar.f23452d;
    }

    public final int hashCode() {
        return Objects.hash(m.class, this.f23449a, this.f23450b, this.f23451c, this.f23452d);
    }
}
