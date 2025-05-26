package oi;

import J.N;
import android.os.Handler;
import androidx.viewpager.widget.ViewPager;
import kotlin.collections.CollectionsKt;
import org.chromium.base.JavaHandlerThread;

/* loaded from: classes3.dex */
public final class j0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94871a;

    /* renamed from: b, reason: collision with root package name */
    public final long f94872b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f94873c;

    public /* synthetic */ j0(Object obj, long j13, int i13) {
        this.f94871a = i13;
        this.f94873c = obj;
        this.f94872b = j13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int b13;
        int i13 = this.f94871a;
        long j13 = this.f94872b;
        Object obj = this.f94873c;
        switch (i13) {
            case 0:
                ((o) obj).A(j13);
                break;
            case 1:
                a6 a6Var = (a6) obj;
                ((u4) a6Var.f24333a).i().w(j13);
                a6Var.f94647e = null;
                break;
            case 2:
                wg1.j jVar = (wg1.j) obj;
                xa.a aVar = jVar.f129795q.f19892e;
                b13 = aVar != null ? aVar.b() : 0;
                ViewPager viewPager = jVar.f129795q;
                int i14 = (viewPager.f19893f + 1) % b13;
                if (((Boolean) jVar.f129782d.invoke()).booleanValue()) {
                    viewPager.B(i14, true);
                }
                xa.a aVar2 = viewPager.f19892e;
                wg1.p pVar = aVar2 instanceof wg1.p ? (wg1.p) aVar2 : null;
                if (pVar == null || pVar.l(i14) || (CollectionsKt.U(i14, pVar.f129822m) instanceof ug1.m)) {
                    if (pVar != null) {
                        yk1.m mVar = (yk1.m) CollectionsKt.U(i14, pVar.f129822m);
                        if (!(mVar instanceof ug1.k) || ((ug1.k) mVar).q3()) {
                        }
                    }
                }
                Handler handler = jVar.getHandler();
                if (handler != null) {
                    handler.postDelayed(this, j13);
                    break;
                }
                break;
            case 3:
                wg1.r rVar = (wg1.r) obj;
                xa.a aVar3 = rVar.f129841n.f19892e;
                b13 = aVar3 != null ? aVar3.b() : 0;
                ViewPager viewPager2 = rVar.f129841n;
                int i15 = (viewPager2.f19893f + 1) % b13;
                if (((Boolean) rVar.f129831d.invoke()).booleanValue()) {
                    viewPager2.B(i15, true);
                }
                Handler handler2 = rVar.getHandler();
                if (handler2 != null) {
                    handler2.postDelayed(this, j13);
                    break;
                }
                break;
            case 4:
                ((xp2.c) obj).request(j13);
                break;
            default:
                ((JavaHandlerThread) obj).f97306a.quit();
                N.MYwg$x8E(j13);
                break;
        }
    }
}
