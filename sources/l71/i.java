package l71;

/* loaded from: classes5.dex */
public final class i implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f81952b;

    public /* synthetic */ i(s sVar, int i13) {
        this.f81951a = i13;
        this.f81952b = sVar;
    }

    public final boolean a(int i13) {
        int i14 = this.f81951a;
        s sVar = this.f81952b;
        switch (i14) {
            case 0:
                for (int i15 = i13 - 1; -1 < i15; i15--) {
                    dl1.s sVar2 = (dl1.s) ((k) sVar).getItem(i15);
                    if ((sVar2 instanceof br.d) && ((br.d) sVar2).f23707e == br.c.PIN_LOCAL_CACHE) {
                        break;
                    }
                }
                break;
            default:
                for (int i16 = i13 - 1; -1 < i16; i16--) {
                    dl1.s sVar3 = (dl1.s) ((m) sVar).getItem(i16);
                    if ((sVar3 instanceof br.d) && ((br.d) sVar3).f23707e == br.c.PIN_LOCAL_CACHE) {
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
