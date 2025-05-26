package g1;

/* loaded from: classes.dex */
public final class f extends k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f63260d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f63261e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar) {
        super(gVar.f63294c);
        this.f63261e = gVar;
    }

    @Override // g1.k
    public final Object b(int i13) {
        int i14 = this.f63260d;
        Object obj = this.f63261e;
        switch (i14) {
            case 0:
                return ((g) obj).j(i13);
            default:
                return ((h) obj).f63268b[i13];
        }
    }

    @Override // g1.k
    public final void c(int i13) {
        int i14 = this.f63260d;
        Object obj = this.f63261e;
        switch (i14) {
            case 0:
                ((g) obj).h(i13);
                break;
            default:
                ((h) obj).b(i13);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar) {
        super(hVar.f63269c);
        this.f63261e = hVar;
    }
}
