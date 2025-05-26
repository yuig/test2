package y0;

import android.media.MediaCodec;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import zp.d1;

/* loaded from: classes2.dex */
public final class t implements g0.c, aq.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136363a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f136364b;

    public /* synthetic */ t(Object obj, int i13) {
        this.f136363a = i13;
        this.f136364b = obj;
    }

    @Override // aq.h
    public void a(String id3) {
        int i13 = this.f136363a;
        Object obj = this.f136364b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(id3, "id");
                d1 d1Var = (d1) obj;
                d1Var.getEventManager().d(new of0.b());
                d1Var.r0().m(d1Var.getResources().getString(ry1.f.edit_pin_success));
                d1Var.getEventManager().d(new hv0.a(hv0.b.UPDATED, id3));
                break;
            case 1:
                Intrinsics.checkNotNullParameter(id3, "id");
                kv0.j jVar = (kv0.j) obj;
                ((mv0.y) jVar.f80976b).U8();
                boolean z13 = jVar.f80988n;
                m60.w wVar = jVar.f80981g;
                if (!z13) {
                    List list = jVar.f80985k;
                    if (list != null) {
                        wVar.d(new mt0.b(list));
                        break;
                    }
                } else {
                    wVar.d(new mt0.b(jVar.f80986l));
                    if (jVar.f80978d instanceof aq.m) {
                        wVar.d(new hv0.a(hv0.b.UPDATED, id3));
                        break;
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(id3, "id");
                t11.f fVar = (t11.f) obj;
                fVar.f115802b.d(new of0.b());
                if (fVar.isBound()) {
                    ((u11.c) ((q11.d) fVar.getView())).T8(ry1.f.edit_pin_success);
                }
                fVar.f115802b.d(new hv0.a(hv0.b.UPDATED, id3));
                if (fVar.isBound()) {
                    ((nl1.d) ((q11.d) fVar.getView())).D5();
                    break;
                }
                break;
        }
    }

    @Override // aq.h
    public void onError(Throwable throwable) {
        int i13 = this.f136363a;
        Object obj = this.f136364b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                d1 d1Var = (d1) obj;
                d1Var.getEventManager().d(new of0.b());
                d1Var.r0().h(x0.generic_error);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                kv0.j jVar = (kv0.j) obj;
                ((mv0.y) jVar.f80976b).U8();
                jVar.f80982h.k(x0.generic_error);
                break;
            default:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                t11.f fVar = (t11.f) obj;
                fVar.f115802b.d(new of0.b());
                if (fVar.isBound()) {
                    ((u11.c) ((q11.d) fVar.getView())).T8(x0.generic_error);
                    break;
                }
                break;
        }
    }

    @Override // g0.c
    public void onFailure(Throwable th3) {
        int i13 = this.f136363a;
        Object obj = this.f136364b;
        switch (i13) {
            case 0:
                ((c0) obj).b(0, "Unable to acquire InputBuffer.", th3);
                break;
            default:
                if (!(th3 instanceof MediaCodec.CodecException)) {
                    ((c0) ((t) obj).f136364b).b(0, th3.getMessage(), th3);
                    break;
                } else {
                    c0 c0Var = (c0) ((t) obj).f136364b;
                    MediaCodec.CodecException codecException = (MediaCodec.CodecException) th3;
                    c0Var.getClass();
                    c0Var.b(1, codecException.getMessage(), codecException);
                    break;
                }
        }
    }

    @Override // g0.c
    public void onSuccess(Object obj) {
        switch (this.f136363a) {
            case 0:
                d0 d0Var = (d0) obj;
                c0 c0Var = (c0) this.f136364b;
                c0Var.f136293q.getClass();
                long j13 = d0.o.j();
                if (d0Var.f136317f.get()) {
                    throw new IllegalStateException("The buffer is submitted or canceled.");
                }
                int i13 = 1;
                com.bumptech.glide.d.h(j13 >= 0);
                d0Var.f136318g = j13;
                if (d0Var.f136317f.get()) {
                    throw new IllegalStateException("The buffer is submitted or canceled.");
                }
                d0Var.f136319h = true;
                d0Var.b();
                g0.m.a(g0.m.f(d0Var.f136315d), new t(this, i13), c0Var.f136284h);
                return;
            default:
                return;
        }
    }
}
