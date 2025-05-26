package xd0;

import ja.d0;
import java.util.concurrent.Callable;
import oa.i;

/* loaded from: classes5.dex */
public final class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134598a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f134599b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f134600c;

    public /* synthetic */ b(f fVar, long j13, int i13) {
        this.f134598a = i13;
        this.f134600c = fVar;
        this.f134599b = j13;
    }

    public final void a() {
        d0 d0Var;
        int i13 = this.f134598a;
        long j13 = this.f134599b;
        f fVar = this.f134600c;
        switch (i13) {
            case 0:
                d dVar = fVar.f134614g;
                d0Var = fVar.f134608a;
                i a13 = dVar.a();
                a13.u1(1, j13);
                try {
                    d0Var.c();
                    try {
                        a13.G();
                        d0Var.r();
                        return;
                    } finally {
                    }
                } finally {
                    dVar.j(a13);
                }
            default:
                d dVar2 = fVar.f134616i;
                d0Var = fVar.f134608a;
                i a14 = dVar2.a();
                a14.u1(1, j13);
                try {
                    d0Var.c();
                    try {
                        a14.G();
                        d0Var.r();
                        return;
                    } finally {
                    }
                } finally {
                    dVar2.j(a14);
                }
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        switch (this.f134598a) {
            case 0:
                a();
                break;
            default:
                a();
                break;
        }
        return null;
    }
}
