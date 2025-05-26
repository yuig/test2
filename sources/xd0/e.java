package xd0;

import ja.d0;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yd0.a f134606b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f134607c;

    public /* synthetic */ e(f fVar, yd0.a aVar, int i13) {
        this.f134605a = i13;
        this.f134607c = fVar;
        this.f134606b = aVar;
    }

    public final void a() {
        d0 d0Var;
        int i13 = this.f134605a;
        yd0.a aVar = this.f134606b;
        f fVar = this.f134607c;
        switch (i13) {
            case 0:
                d0Var = fVar.f134608a;
                d0Var.c();
                try {
                    fVar.f134609b.n(aVar);
                    d0Var.r();
                    return;
                } finally {
                }
            default:
                d0Var = fVar.f134608a;
                d0Var.c();
                try {
                    fVar.f134611d.m(aVar);
                    d0Var.r();
                    return;
                } finally {
                }
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        switch (this.f134605a) {
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
