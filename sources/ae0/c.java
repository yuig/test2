package ae0;

import ja.d0;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f15039b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f15040c;

    public /* synthetic */ c(e eVar, f fVar, int i13) {
        this.f15038a = i13;
        this.f15040c = eVar;
        this.f15039b = fVar;
    }

    public final void a() {
        d0 d0Var;
        int i13 = this.f15038a;
        f fVar = this.f15039b;
        e eVar = this.f15040c;
        switch (i13) {
            case 0:
                d0Var = eVar.f15044a;
                d0Var.c();
                try {
                    eVar.f15045b.n(fVar);
                    d0Var.r();
                    return;
                } finally {
                }
            default:
                d0Var = eVar.f15044a;
                d0Var.c();
                try {
                    eVar.f15047d.m(fVar);
                    d0Var.r();
                    return;
                } finally {
                }
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        switch (this.f15038a) {
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
