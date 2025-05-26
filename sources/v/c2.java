package v;

import com.pinterest.api.model.um;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class c2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123392a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f123393b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f123394c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f123395d;

    public /* synthetic */ c2(Object obj, Object obj2, boolean z13, int i13) {
        this.f123392a = i13;
        this.f123395d = obj;
        this.f123393b = obj2;
        this.f123394c = z13;
    }

    private final void a() {
        l7.y0 y0Var;
        l7.z0 z0Var = (l7.z0) this.f123395d;
        boolean z13 = this.f123394c;
        l7.y0 y0Var2 = (l7.y0) this.f123393b;
        z0Var.getClass();
        try {
            synchronized (z0Var.f81922e) {
                try {
                    if (!z0Var.f81924g || !z13) {
                        while (true) {
                            synchronized (z0Var.f81922e) {
                                y0Var = (l7.y0) z0Var.f81923f.poll();
                            }
                            if (y0Var == null) {
                                break;
                            } else {
                                y0Var.run();
                            }
                        }
                        y0Var2.run();
                    }
                } finally {
                }
            }
        } catch (Exception e13) {
            z0Var.b(e13);
        }
    }

    private final void b() {
        lb.o oVar = (lb.o) this.f123395d;
        tb.j jVar = (tb.j) this.f123393b;
        boolean z13 = this.f123394c;
        synchronized (oVar.f82647k) {
            try {
                Iterator it = oVar.f82646j.iterator();
                while (it.hasNext()) {
                    ((lb.c) it.next()).b(jVar, z13);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009b, code lost:
    
        ((kd2.e) r1).b(r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0404, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [v.d2, v.m] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.c2.run():void");
    }

    public /* synthetic */ c2(Object obj, boolean z13, Object obj2, int i13) {
        this.f123392a = i13;
        this.f123395d = obj;
        this.f123394c = z13;
        this.f123393b = obj2;
    }

    public /* synthetic */ c2(boolean z13, um umVar, oq.j jVar) {
        this.f123392a = 4;
        this.f123394c = z13;
        this.f123395d = umVar;
        this.f123393b = jVar;
    }
}
