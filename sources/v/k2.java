package v;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class k2 implements g0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123526a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f123527b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f123528c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f123529d;

    public /* synthetic */ k2(Object obj, Object obj2, Object obj3, int i13) {
        this.f123526a = i13;
        this.f123529d = obj;
        this.f123527b = obj2;
        this.f123528c = obj3;
    }

    public final void a() {
        int i13 = this.f123526a;
        Object obj = this.f123528c;
        Object obj2 = this.f123527b;
        switch (i13) {
            case 0:
                ((Surface) obj2).release();
                ((SurfaceTexture) obj).release();
                break;
            case 1:
                com.bumptech.glide.d.v(null, ((r4.i) obj2).b(null));
                break;
            case 2:
                ((p5.a) obj).accept(new c0.j(0, (Surface) obj2));
                break;
            default:
                ((b1.d) this.f123529d).f20795e = null;
                break;
        }
    }

    @Override // g0.c
    public final void onFailure(Throwable th3) {
        int i13 = this.f123526a;
        Object obj = this.f123528c;
        Object obj2 = this.f123527b;
        switch (i13) {
            case 0:
                throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th3);
            case 1:
                if (th3 instanceof c0.n1) {
                    com.bumptech.glide.d.v(null, ((com.google.common.util.concurrent.c0) obj).cancel(false));
                    return;
                } else {
                    com.bumptech.glide.d.v(null, ((r4.i) obj2).b(null));
                    return;
                }
            case 2:
                com.bumptech.glide.d.v("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th3, th3 instanceof c0.n1);
                ((p5.a) obj).accept(new c0.j(1, (Surface) obj2));
                return;
            default:
                ((b1.d) this.f123529d).f20795e = null;
                List list = (List) obj2;
                if (list.isEmpty()) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((androidx.camera.core.impl.h0) ((c0.r) obj)).i((androidx.camera.core.impl.n) it.next());
                }
                list.clear();
                return;
        }
    }

    @Override // g0.c
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.f123526a) {
            case 0:
                a();
                break;
            case 1:
                a();
                break;
            case 2:
                a();
                break;
            default:
                a();
                break;
        }
    }

    public k2(c0.p1 p1Var, p5.a aVar, Surface surface) {
        this.f123526a = 2;
        this.f123529d = p1Var;
        this.f123528c = aVar;
        this.f123527b = surface;
    }
}
