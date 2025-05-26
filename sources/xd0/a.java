package xd0;

import ja.d0;
import java.util.concurrent.Callable;
import oa.i;

/* loaded from: classes5.dex */
public final class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134596a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f134597b;

    public /* synthetic */ a(f fVar, int i13) {
        this.f134596a = i13;
        this.f134597b = fVar;
    }

    public final void a() {
        d0 d0Var;
        int i13 = this.f134596a;
        f fVar = this.f134597b;
        switch (i13) {
            case 0:
                d dVar = fVar.f134613f;
                d0Var = fVar.f134608a;
                i a13 = dVar.a();
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
                d dVar2 = fVar.f134615h;
                d0Var = fVar.f134608a;
                i a14 = dVar2.a();
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
        switch (this.f134596a) {
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
