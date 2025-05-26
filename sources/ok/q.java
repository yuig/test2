package ok;

/* loaded from: classes3.dex */
public abstract class q implements t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f95442a = true;

    @Override // ok.t
    public final Object apply(Object obj) {
        if (!this.f95442a) {
            h hVar = (h) this;
            return hVar.f95424b.to(hVar.f95425c, (String) obj);
        }
        if (obj == null) {
            return null;
        }
        h hVar2 = (h) this;
        String str = hVar2.f95424b.to(hVar2.f95425c, (String) obj);
        str.getClass();
        return str;
    }
}
