package tl;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118035a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f118036b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f118037c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ll.j f118038d;

    public /* synthetic */ d(f fVar, Runnable runnable, ll.j jVar, int i13) {
        this.f118035a = i13;
        this.f118036b = fVar;
        this.f118037c = runnable;
        this.f118038d = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f118035a;
        final ll.j jVar = this.f118038d;
        final Runnable runnable = this.f118037c;
        f fVar = this.f118036b;
        fVar.getClass();
        switch (i13) {
            case 0:
                final int i14 = 1;
                fVar.f118042a.execute(new Runnable() { // from class: tl.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i15 = i14;
                        ll.j jVar2 = jVar;
                        Runnable runnable2 = runnable;
                        switch (i15) {
                            case 0:
                                try {
                                    runnable2.run();
                                    h hVar = (h) jVar2.f83754b;
                                    int i16 = h.f118044i;
                                    hVar.j(null);
                                    return;
                                } catch (Exception e13) {
                                    h hVar2 = (h) jVar2.f83754b;
                                    int i17 = h.f118044i;
                                    hVar2.k(e13);
                                    return;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e14) {
                                    h hVar3 = (h) jVar2.f83754b;
                                    int i18 = h.f118044i;
                                    hVar3.k(e14);
                                    throw e14;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e15) {
                                    h hVar4 = (h) jVar2.f83754b;
                                    int i19 = h.f118044i;
                                    hVar4.k(e15);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                final int i15 = 0;
                fVar.f118042a.execute(new Runnable() { // from class: tl.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i152 = i15;
                        ll.j jVar2 = jVar;
                        Runnable runnable2 = runnable;
                        switch (i152) {
                            case 0:
                                try {
                                    runnable2.run();
                                    h hVar = (h) jVar2.f83754b;
                                    int i16 = h.f118044i;
                                    hVar.j(null);
                                    return;
                                } catch (Exception e13) {
                                    h hVar2 = (h) jVar2.f83754b;
                                    int i17 = h.f118044i;
                                    hVar2.k(e13);
                                    return;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e14) {
                                    h hVar3 = (h) jVar2.f83754b;
                                    int i18 = h.f118044i;
                                    hVar3.k(e14);
                                    throw e14;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e15) {
                                    h hVar4 = (h) jVar2.f83754b;
                                    int i19 = h.f118044i;
                                    hVar4.k(e15);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                final int i16 = 2;
                fVar.f118042a.execute(new Runnable() { // from class: tl.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i152 = i16;
                        ll.j jVar2 = jVar;
                        Runnable runnable2 = runnable;
                        switch (i152) {
                            case 0:
                                try {
                                    runnable2.run();
                                    h hVar = (h) jVar2.f83754b;
                                    int i162 = h.f118044i;
                                    hVar.j(null);
                                    return;
                                } catch (Exception e13) {
                                    h hVar2 = (h) jVar2.f83754b;
                                    int i17 = h.f118044i;
                                    hVar2.k(e13);
                                    return;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e14) {
                                    h hVar3 = (h) jVar2.f83754b;
                                    int i18 = h.f118044i;
                                    hVar3.k(e14);
                                    throw e14;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e15) {
                                    h hVar4 = (h) jVar2.f83754b;
                                    int i19 = h.f118044i;
                                    hVar4.k(e15);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
