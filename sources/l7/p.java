package l7;

import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
public final /* synthetic */ class p implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81845a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f81846b;

    public /* synthetic */ p(Object obj, int i13) {
        this.f81845a = i13;
        this.f81846b = obj;
    }

    @Override // l7.y0
    public final void run() {
        int i13;
        int i14 = this.f81845a;
        Object obj = this.f81846b;
        switch (i14) {
            case 0:
                ((CountDownLatch) obj).countDown();
                return;
            case 1:
                ((c0) obj).flush();
                return;
            case 2:
                w wVar = (w) obj;
                EGLDisplay eGLDisplay = wVar.f81896d;
                sp2.i iVar = wVar.f81894b;
                boolean z13 = wVar.f81895c;
                int i15 = 0;
                try {
                    try {
                        wVar.f81897e.a();
                        i13 = 0;
                    } catch (Exception e13) {
                        d7.u.d("DefaultFrameProcessor", "Error releasing shader program", e13);
                    }
                    while (true) {
                        ArrayList arrayList = wVar.f81903k;
                        if (i13 >= arrayList.size()) {
                            wVar.f81902j.a();
                            if (z13) {
                                while (i15 < ((List) iVar.f114929c).size()) {
                                    try {
                                        d7.n.l((EGLContext) ((List) iVar.f114929c).get(i15), eGLDisplay);
                                        i15++;
                                    } catch (GlUtil$GlException e14) {
                                        d7.u.d("DefaultFrameProcessor", "Error releasing GL objects", e14);
                                        return;
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        ((i0) arrayList.get(i13)).a();
                        i13++;
                    }
                } catch (Throwable th3) {
                    if (z13) {
                        while (i15 < ((List) iVar.f114929c).size()) {
                            try {
                                d7.n.l((EGLContext) ((List) iVar.f114929c).get(i15), eGLDisplay);
                                i15++;
                            } catch (GlUtil$GlException e15) {
                                d7.u.d("DefaultFrameProcessor", "Error releasing GL objects", e15);
                            }
                        }
                    }
                    throw th3;
                }
            case 3:
                d0 d0Var = ((t0) obj).f81876d;
                d0Var.getClass();
                d0Var.b();
                g.a();
                return;
            case 4:
                ((d0) obj).D();
                return;
            default:
                ((u0) obj).b();
                return;
        }
    }
}
