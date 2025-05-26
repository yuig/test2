package h0;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.video.internal.encoder.EncodeException;
import c0.f1;
import kotlin.jvm.internal.Intrinsics;
import l0.l;
import r0.b0;
import r0.j0;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements p5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66376a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f66377b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f66378c;

    public /* synthetic */ d(int i13, Object obj, Object obj2) {
        this.f66376a = i13;
        this.f66377b = obj;
        this.f66378c = obj2;
    }

    @Override // p5.a
    public final void accept(Object obj) {
        int i13 = this.f66376a;
        Object obj2 = this.f66378c;
        Object obj3 = this.f66377b;
        switch (i13) {
            case 0:
                ((Surface) obj3).release();
                ((SurfaceTexture) obj2).release();
                break;
            case 1:
                l0.i iVar = (l0.i) obj3;
                f1 f1Var = (f1) obj2;
                iVar.getClass();
                f1Var.close();
                Surface surface = (Surface) iVar.f81228h.remove(f1Var);
                if (surface != null) {
                    l lVar = iVar.f81221a;
                    n0.j.d(lVar.f81237a, true);
                    n0.j.c(lVar.f81239c);
                    lVar.i(surface, true);
                    break;
                }
                break;
            case 2:
                m0.e eVar = (m0.e) obj3;
                f1 f1Var2 = (f1) obj2;
                eVar.getClass();
                f1Var2.close();
                Surface surface2 = (Surface) eVar.f85267h.remove(f1Var2);
                if (surface2 != null) {
                    m0.c cVar = eVar.f85260a;
                    n0.j.d(cVar.f81237a, true);
                    n0.j.c(cVar.f81239c);
                    cVar.i(surface2, true);
                    break;
                }
                break;
            case 3:
                j0 j0Var = (j0) obj3;
                r4.i iVar2 = (r4.i) obj2;
                Throwable th3 = (Throwable) obj;
                if (j0Var.W == null) {
                    if (th3 instanceof EncodeException) {
                        j0Var.z(b0.ERROR_ENCODER);
                    } else {
                        j0Var.z(b0.ERROR_SOURCE);
                    }
                    j0Var.W = th3;
                    j0Var.J();
                    iVar2.b(null);
                    break;
                }
                break;
            default:
                hb.k this$0 = (hb.k) obj3;
                Activity activity = (Activity) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(activity, "$activity");
                hb.j jVar = this$0.f68501e;
                if (jVar != null) {
                    jVar.a(activity, this$0.e(activity));
                    break;
                }
                break;
        }
    }
}
