package zb;

/* loaded from: classes3.dex */
public final class g extends androidx.appcompat.app.d {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.d f141502f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.d dVar) {
        super(23);
        this.f141502f = dVar;
    }

    @Override // androidx.appcompat.app.d
    public final Object A(kc.b bVar) {
        Float f13 = (Float) this.f141502f.A(bVar);
        if (f13 == null) {
            return null;
        }
        return Float.valueOf(f13.floatValue() * 2.55f);
    }
}
