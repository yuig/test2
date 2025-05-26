package ok;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class h extends q implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final i f95424b;

    /* renamed from: c, reason: collision with root package name */
    public final i f95425c;

    public h(i iVar, i iVar2) {
        iVar.getClass();
        this.f95424b = iVar;
        iVar2.getClass();
        this.f95425c = iVar2;
    }

    @Override // ok.t
    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f95424b.equals(hVar.f95424b) && this.f95425c.equals(hVar.f95425c);
    }

    public final int hashCode() {
        return this.f95424b.hashCode() ^ this.f95425c.hashCode();
    }

    public final String toString() {
        return this.f95424b + ".converterTo(" + this.f95425c + ")";
    }
}
