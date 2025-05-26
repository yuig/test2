package of2;

/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94426a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f94427b;

    public /* synthetic */ f(h hVar, int i13) {
        this.f94426a = i13;
        this.f94427b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f94426a) {
            case 0:
                pf2.d dVar = this.f94427b.f94437h;
                pf2.f fVar = dVar.f100021c;
                if (fVar.f100031b.get() && dVar.b()) {
                    fVar.f100031b.set(false);
                    break;
                }
                break;
            case 1:
                h hVar = this.f94427b;
                pf2.f fVar2 = hVar.f94433d;
                fVar2.f100034e = false;
                fVar2.f100032c = fVar2.f100030a.now();
                fVar2.f100033d = fVar2.f100030a.now();
                pf2.d dVar2 = hVar.f94437h;
                if (!dVar2.f100021c.f100031b.getAndSet(true)) {
                    dVar2.a();
                    break;
                }
                break;
            case 2:
                pf2.d dVar3 = this.f94427b.f94437h;
                pf2.f fVar3 = dVar3.f100021c;
                if (fVar3.f100031b.get() && dVar3.b()) {
                    fVar3.f100031b.set(false);
                    break;
                }
                break;
            default:
                pf2.d dVar4 = this.f94427b.f94437h;
                if (!dVar4.f100021c.f100031b.getAndSet(true)) {
                    dVar4.a();
                    break;
                }
                break;
        }
    }
}
