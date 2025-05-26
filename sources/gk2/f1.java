package gk2;

/* loaded from: classes2.dex */
public final class f1 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f65403c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f65404d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(uj2.h hVar, Object obj, int i13) {
        super(hVar);
        this.f65403c = i13;
        this.f65404d = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [sk2.d] */
    /* JADX WARN: Type inference failed for: r7v0, types: [xp2.b] */
    @Override // uj2.h
    public final void m(xp2.b bVar) {
        int i13 = this.f65403c;
        int i14 = 0;
        uj2.h hVar = this.f65321b;
        Object obj = this.f65404d;
        switch (i13) {
            case 0:
                if (!(bVar instanceof dk2.a)) {
                    hVar.l(new e1(bVar, (ak2.f) obj));
                    break;
                } else {
                    hVar.l(new i0((dk2.a) bVar, (ak2.f) obj, 1));
                    break;
                }
            case 1:
                vk2.a aVar = new vk2.a(bVar);
                sk2.f fVar = new sk2.f();
                if (!(fVar instanceof sk2.d)) {
                    fVar = new sk2.d(fVar);
                }
                try {
                    Object apply = ((ak2.f) obj).apply(fVar);
                    ck2.i.b(apply, "handler returned a null Publisher");
                    xp2.a aVar2 = (xp2.a) apply;
                    g2 g2Var = new g2(hVar);
                    j2 j2Var = new j2(aVar, fVar, g2Var);
                    g2Var.f65421d = j2Var;
                    bVar.d(j2Var);
                    aVar2.b(g2Var);
                    g2Var.c(0);
                    break;
                } catch (Throwable th3) {
                    bp1.h.H(th3);
                    ok2.d.error(th3, bVar);
                    return;
                }
            default:
                if (!(bVar instanceof dk2.a)) {
                    hVar.l(new j0(bVar, (ak2.g) obj));
                    break;
                } else {
                    hVar.l(new i0((dk2.a) bVar, (ak2.g) obj, i14));
                    break;
                }
        }
    }
}
