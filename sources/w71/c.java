package w71;

import ja.d0;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x71.a f128166b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f128167c;

    public /* synthetic */ c(d dVar, x71.a aVar, int i13) {
        this.f128165a = i13;
        this.f128167c = dVar;
        this.f128166b = aVar;
    }

    public final void a() {
        d0 d0Var;
        int i13 = this.f128165a;
        x71.a aVar = this.f128166b;
        d dVar = this.f128167c;
        switch (i13) {
            case 0:
                d0Var = dVar.f128168a;
                d0Var.c();
                try {
                    dVar.f128169b.n(aVar);
                    d0Var.r();
                    return;
                } finally {
                }
            default:
                d0Var = dVar.f128168a;
                d0Var.c();
                try {
                    dVar.f128171d.m(aVar);
                    d0Var.r();
                    return;
                } finally {
                }
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        switch (this.f128165a) {
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
