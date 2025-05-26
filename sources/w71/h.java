package w71;

import ja.d0;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class h implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x71.c f128186b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f128187c;

    public /* synthetic */ h(i iVar, x71.c cVar, int i13) {
        this.f128185a = i13;
        this.f128187c = iVar;
        this.f128186b = cVar;
    }

    public final void a() {
        d0 d0Var;
        int i13 = this.f128185a;
        x71.c cVar = this.f128186b;
        i iVar = this.f128187c;
        switch (i13) {
            case 0:
                d0Var = iVar.f128188a;
                d0Var.c();
                try {
                    iVar.f128189b.n(cVar);
                    d0Var.r();
                    return;
                } finally {
                }
            default:
                d0Var = iVar.f128188a;
                d0Var.c();
                try {
                    iVar.f128191d.m(cVar);
                    d0Var.r();
                    return;
                } finally {
                }
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        switch (this.f128185a) {
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
