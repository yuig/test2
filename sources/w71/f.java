package w71;

import ja.d0;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128176a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x71.b f128177b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f128178c;

    public /* synthetic */ f(g gVar, x71.b bVar, int i13) {
        this.f128176a = i13;
        this.f128178c = gVar;
        this.f128177b = bVar;
    }

    public final void a() {
        d0 d0Var;
        int i13 = this.f128176a;
        x71.b bVar = this.f128177b;
        g gVar = this.f128178c;
        switch (i13) {
            case 0:
                d0Var = gVar.f128179a;
                d0Var.c();
                try {
                    gVar.f128182d.n(bVar);
                    d0Var.r();
                    return;
                } finally {
                }
            default:
                d0Var = gVar.f128179a;
                d0Var.c();
                try {
                    gVar.f128183e.m(bVar);
                    d0Var.r();
                    return;
                } finally {
                }
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        switch (this.f128176a) {
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
