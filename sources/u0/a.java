package u0;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119724a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f119725b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f119726c;

    public /* synthetic */ a(e eVar, boolean z13, int i13) {
        this.f119724a = i13;
        this.f119725b = eVar;
        this.f119726c = z13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f119724a;
        boolean z13 = this.f119726c;
        int i14 = 1;
        e eVar = this.f119725b;
        switch (i13) {
            case 0:
                int ordinal = eVar.f119738g.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 2) {
                        throw new AssertionError("AudioSource is released");
                    }
                    return;
                }
                eVar.f119733b.set(null);
                eVar.f119734c.set(false);
                eVar.d(d.STARTED);
                eVar.f119732a.execute(new a(eVar, z13, i14));
                eVar.f();
                return;
            default:
                int ordinal2 = eVar.f119738g.ordinal();
                if (ordinal2 != 0 && ordinal2 != 1) {
                    if (ordinal2 == 2) {
                        throw new AssertionError("AudioSource is released");
                    }
                    return;
                } else {
                    if (eVar.f119749r == z13) {
                        return;
                    }
                    eVar.f119749r = z13;
                    if (eVar.f119738g == d.STARTED) {
                        eVar.a();
                        return;
                    }
                    return;
                }
        }
    }
}
