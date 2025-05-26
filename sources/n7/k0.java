package n7;

/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final b f89470a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.media3.common.b f89471b;

    public k0(b bVar, androidx.media3.common.b bVar2) {
        this.f89470a = bVar;
        this.f89471b = bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (!this.f89470a.equals(k0Var.f89470a)) {
            return false;
        }
        androidx.media3.common.b bVar = k0Var.f89471b;
        androidx.media3.common.b bVar2 = this.f89471b;
        return bVar2 != null ? bVar2.equals(bVar) : bVar == null;
    }

    public final int hashCode() {
        int hashCode = this.f89470a.hashCode() * 31;
        androidx.media3.common.b bVar = this.f89471b;
        return hashCode + (bVar != null ? bVar.hashCode() : 0);
    }
}
