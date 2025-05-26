package jk2;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class w1 extends AtomicReference implements uj2.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f76733b;

    public /* synthetic */ w1(AtomicInteger atomicInteger, int i13) {
        this.f76732a = i13;
        this.f76733b = atomicInteger;
    }

    @Override // uj2.v
    public final void a() {
        int i13 = this.f76732a;
        AtomicInteger atomicInteger = this.f76733b;
        switch (i13) {
            case 0:
                x1 x1Var = (x1) atomicInteger;
                AtomicReference atomicReference = x1Var.f76750f;
                int i14 = x1Var.f76745a;
                pk2.c cVar = x1Var.f76748d;
                uj2.v vVar = x1Var.f76746b;
                switch (i14) {
                    case 0:
                        bk2.c.dispose(atomicReference);
                        dl2.b.e2(vVar, x1Var, cVar);
                        break;
                    default:
                        bk2.c.dispose(atomicReference);
                        dl2.b.e2(vVar, x1Var, cVar);
                        break;
                }
            default:
                x1 x1Var2 = (x1) atomicInteger;
                AtomicReference atomicReference2 = x1Var2.f76750f;
                int i15 = x1Var2.f76745a;
                pk2.c cVar2 = x1Var2.f76748d;
                uj2.v vVar2 = x1Var2.f76746b;
                switch (i15) {
                    case 0:
                        bk2.c.dispose(atomicReference2);
                        dl2.b.e2(vVar2, x1Var2, cVar2);
                        break;
                    default:
                        bk2.c.dispose(atomicReference2);
                        dl2.b.e2(vVar2, x1Var2, cVar2);
                        break;
                }
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        switch (this.f76732a) {
            case 0:
                bk2.c.setOnce(this, cVar);
                break;
            default:
                bk2.c.setOnce(this, cVar);
                break;
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        int i13 = this.f76732a;
        AtomicInteger atomicInteger = this.f76733b;
        switch (i13) {
            case 0:
                x1 x1Var = (x1) atomicInteger;
                switch (x1Var.f76745a) {
                    case 0:
                        x1Var.d();
                        break;
                    default:
                        x1Var.d();
                        break;
                }
            default:
                x1 x1Var2 = (x1) atomicInteger;
                switch (x1Var2.f76745a) {
                    case 0:
                        x1Var2.d();
                        break;
                    default:
                        x1Var2.d();
                        break;
                }
        }
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        int i13 = this.f76732a;
        AtomicInteger atomicInteger = this.f76733b;
        switch (i13) {
            case 0:
                x1 x1Var = (x1) atomicInteger;
                AtomicReference atomicReference = x1Var.f76750f;
                int i14 = x1Var.f76745a;
                pk2.c cVar = x1Var.f76748d;
                uj2.v vVar = x1Var.f76746b;
                switch (i14) {
                    case 0:
                        bk2.c.dispose(atomicReference);
                        dl2.b.g2(vVar, th3, x1Var, cVar);
                        break;
                    default:
                        bk2.c.dispose(atomicReference);
                        dl2.b.g2(vVar, th3, x1Var, cVar);
                        break;
                }
            default:
                x1 x1Var2 = (x1) atomicInteger;
                AtomicReference atomicReference2 = x1Var2.f76750f;
                int i15 = x1Var2.f76745a;
                pk2.c cVar2 = x1Var2.f76748d;
                uj2.v vVar2 = x1Var2.f76746b;
                switch (i15) {
                    case 0:
                        bk2.c.dispose(atomicReference2);
                        dl2.b.g2(vVar2, th3, x1Var2, cVar2);
                        break;
                    default:
                        bk2.c.dispose(atomicReference2);
                        dl2.b.g2(vVar2, th3, x1Var2, cVar2);
                        break;
                }
        }
    }
}
