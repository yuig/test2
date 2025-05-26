package gk2;

/* loaded from: classes2.dex */
public final class y extends a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f65700c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f65701d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f65702e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(uj2.h hVar, Object obj, Object obj2, int i13) {
        super(hVar);
        this.f65700c = i13;
        this.f65701d = obj;
        this.f65702e = obj2;
    }

    @Override // uj2.h
    public final void m(xp2.b bVar) {
        int i13 = this.f65700c;
        uj2.h hVar = this.f65321b;
        Object obj = this.f65702e;
        Object obj2 = this.f65701d;
        switch (i13) {
            case 0:
                if (!(bVar instanceof dk2.a)) {
                    hVar.l(new x(bVar, (ak2.f) obj2, (re2.h) obj));
                    break;
                } else {
                    hVar.l(new w((dk2.a) bVar, (ak2.f) obj2, (re2.h) obj));
                    break;
                }
            default:
                vk2.a aVar = new vk2.a(bVar);
                e3 e3Var = new e3(aVar, (ak2.c) obj2);
                aVar.d(e3Var);
                ((xp2.a) obj).b(new d3(e3Var));
                hVar.l(e3Var);
                break;
        }
    }
}
