package bf2;

/* loaded from: classes2.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public d f22746a;

    public static void a(d dVar, d dVar2) {
        a aVar = (a) dVar;
        dVar2.getClass();
        if (aVar.f22746a != null) {
            throw new IllegalStateException();
        }
        aVar.f22746a = dVar2;
    }

    @Override // wk2.a
    public final Object get() {
        d dVar = this.f22746a;
        if (dVar != null) {
            return dVar.get();
        }
        throw new IllegalStateException();
    }
}
