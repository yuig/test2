package fk2;

import io.reactivex.exceptions.CompositeException;
import kh2.m0;
import lb.l0;
import pq2.a1;
import r0.j0;

/* loaded from: classes4.dex */
public final class o implements uj2.v, g0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62462a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f62463b;

    public /* synthetic */ o(Object obj, int i13) {
        this.f62462a = i13;
        this.f62463b = obj;
    }

    @Override // uj2.v
    public void a() {
        int i13 = this.f62462a;
        Object obj = this.f62463b;
        switch (i13) {
            case 0:
                ((uj2.d) obj).a();
                break;
            case 1:
                ((jk2.s) obj).f76685b.a();
                break;
            default:
                ((uj2.v) obj).a();
                break;
        }
    }

    @Override // uj2.v
    public void b(xj2.c cVar) {
        int i13 = this.f62462a;
        Object obj = this.f62463b;
        switch (i13) {
            case 0:
                ((uj2.d) obj).b(cVar);
                break;
            case 1:
                bk2.a aVar = ((jk2.s) obj).f76684a;
                aVar.getClass();
                bk2.c.set(aVar, cVar);
                break;
            default:
                ((uj2.v) obj).b(cVar);
                break;
        }
    }

    @Override // uj2.v
    public void c(Object obj) {
        int i13 = this.f62462a;
        Object obj2 = this.f62463b;
        switch (i13) {
            case 0:
                return;
            case 1:
                ((jk2.s) obj2).f76685b.c(obj);
                return;
            default:
                a1 a1Var = (a1) obj;
                uj2.v vVar = (uj2.v) obj2;
                if (a1Var == null) {
                    throw new NullPointerException("response == null");
                }
                vVar.c(new qq2.c(0, a1Var, null));
                return;
        }
    }

    @Override // uj2.v
    public void onError(Throwable th3) {
        int i13 = this.f62462a;
        Object obj = this.f62463b;
        switch (i13) {
            case 0:
                ((uj2.d) obj).onError(th3);
                return;
            case 1:
                ((jk2.s) obj).f76685b.onError(th3);
                return;
            default:
                try {
                    uj2.v vVar = (uj2.v) obj;
                    if (th3 == null) {
                        throw new NullPointerException("error == null");
                    }
                    vVar.c(new qq2.c(0, null, th3));
                    ((uj2.v) obj).a();
                    return;
                } catch (Throwable th4) {
                    try {
                        ((uj2.v) obj).onError(th4);
                        return;
                    } catch (Throwable th5) {
                        bp1.h.H(th5);
                        l0.R0(new CompositeException(th4, th5));
                        return;
                    }
                }
        }
    }

    @Override // g0.c
    public void onFailure(Throwable th3) {
        int i13 = this.f62462a;
        Object obj = this.f62463b;
        switch (i13) {
            case 0:
                j0 j0Var = (j0) obj;
                com.bumptech.glide.d.v("In-progress recording shouldn't be null", j0Var.f105575p != null);
                if (!j0Var.f105575p.f105539l) {
                    m0.p("Recorder", "Encodings end with error: " + th3);
                    j0Var.i(j0Var.B == null ? 8 : 6, th3);
                    break;
                }
                break;
            default:
                m0.Y0("VideoEncoderSession", "VideoEncoder configuration failed.", th3);
                ((r0.a1) obj).b();
                break;
        }
    }

    @Override // g0.c
    public void onSuccess(Object obj) {
        switch (this.f62462a) {
            case 0:
                m0.p("Recorder", "Encodings end successfully.");
                j0 j0Var = (j0) this.f62463b;
                j0Var.i(j0Var.S, j0Var.T);
                break;
            default:
                break;
        }
    }
}
