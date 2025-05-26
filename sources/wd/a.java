package wd;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.internal.measurement.q4;
import java.io.InputStream;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class a implements nd.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129150a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f129151b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f129152c;

    public /* synthetic */ a(int i13, Object obj, Object obj2) {
        this.f129150a = i13;
        this.f129151b = obj;
        this.f129152c = obj2;
    }

    @Override // nd.n
    public final boolean a(Object obj, nd.l lVar) {
        int i13 = this.f129150a;
        Object obj2 = this.f129151b;
        switch (i13) {
            case 0:
                return ((nd.n) obj2).a(obj, lVar);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                ((o) obj2).getClass();
                return true;
        }
    }

    @Override // nd.n
    public final pd.g0 b(Object obj, int i13, int i14, nd.l lVar) {
        y yVar;
        boolean z13;
        he.f fVar;
        switch (this.f129150a) {
            case 0:
                return w.e((Resources) this.f129152c, ((nd.n) this.f129151b).b(obj, i13, i14, lVar));
            case 1:
                pd.g0 c13 = ((xd.e) this.f129151b).c((Uri) obj, lVar);
                if (c13 == null) {
                    return null;
                }
                return q.a((qd.d) this.f129152c, (Drawable) ((xd.c) c13).get(), i13, i14);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof y) {
                    yVar = (y) inputStream;
                    z13 = false;
                } else {
                    yVar = new y(inputStream, (qd.i) this.f129152c);
                    z13 = true;
                }
                ArrayDeque arrayDeque = he.f.f68943c;
                synchronized (arrayDeque) {
                    fVar = (he.f) arrayDeque.poll();
                }
                if (fVar == null) {
                    fVar = new he.f();
                }
                he.f fVar2 = fVar;
                fVar2.f68944a = yVar;
                mc.f fVar3 = new mc.f(fVar2, 1);
                q4 q4Var = new q4(24, yVar, fVar2);
                try {
                    o oVar = (o) this.f129151b;
                    c a13 = oVar.a(new androidx.appcompat.app.d(oVar.f129198c, fVar3, oVar.f129199d), i13, i14, lVar, q4Var);
                    fVar2.f68945b = null;
                    fVar2.f68944a = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(fVar2);
                    }
                    if (z13) {
                        yVar.c();
                    }
                    return a13;
                } catch (Throwable th3) {
                    fVar2.f68945b = null;
                    fVar2.f68944a = null;
                    ArrayDeque arrayDeque2 = he.f.f68943c;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(fVar2);
                        if (z13) {
                            yVar.c();
                        }
                        throw th3;
                    }
                }
        }
    }

    public a(Resources resources, nd.n nVar) {
        this.f129150a = 0;
        this.f129152c = resources;
        this.f129151b = nVar;
    }
}
