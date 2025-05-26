package c3;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final g1.u f25520a;

    static {
        s sVar = f.f25494c;
        int i13 = sVar.f25490c;
        g gVar = new g(sVar, sVar, 1);
        n nVar = f.f25511t;
        int i14 = nVar.f25490c << 6;
        int i15 = sVar.f25490c;
        int i16 = i14 | i15;
        i iVar = new i(sVar, nVar, 0);
        int i17 = (i15 << 6) | nVar.f25490c;
        i iVar2 = new i(nVar, sVar, 0);
        g1.u uVar = g1.m.f63284a;
        g1.u uVar2 = new g1.u();
        uVar2.l(i13 | (i13 << 6), gVar);
        uVar2.l(i16, iVar);
        uVar2.l(i17, iVar2);
        f25520a = uVar2;
    }
}
