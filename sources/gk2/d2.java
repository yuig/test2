package gk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class d2 extends AtomicReference implements Runnable, ak2.e {

    /* renamed from: a */
    public final /* synthetic */ int f65375a;

    /* renamed from: b */
    public long f65376b;

    /* renamed from: c */
    public boolean f65377c;

    /* renamed from: d */
    public boolean f65378d;

    /* renamed from: e */
    public final Object f65379e;

    public /* synthetic */ d2(Object obj, int i13) {
        this.f65375a = i13;
        this.f65379e = obj;
    }

    public final void a(xj2.c cVar) {
        switch (this.f65375a) {
            case 0:
                bk2.c.replace(this, cVar);
                synchronized (((f2) this.f65379e)) {
                    try {
                        if (this.f65378d) {
                            ((bk2.f) ((f2) this.f65379e).f65405b).e(cVar);
                        }
                    } finally {
                    }
                }
                return;
            default:
                bk2.c.replace(this, cVar);
                synchronized (((jk2.v1) this.f65379e)) {
                    try {
                        if (this.f65378d) {
                            ((bk2.f) ((jk2.v1) this.f65379e).f76725a).e(cVar);
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    @Override // ak2.e
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f65375a) {
            case 0:
                a((xj2.c) obj);
                break;
            default:
                a((xj2.c) obj);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f65375a;
        Object obj = this.f65379e;
        switch (i13) {
            case 0:
                ((f2) obj).p(this);
                break;
            default:
                ((jk2.v1) obj).R(this);
                break;
        }
    }
}
