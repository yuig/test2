package l7;

import J.N;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import io.embrace.android.embracesdk.internal.comms.delivery.PendingApiCall;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import oi.b4;

/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81733a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f81734b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f81735c;

    public /* synthetic */ b0(long j13, Object obj, int i13) {
        this.f81733a = i13;
        this.f81734b = j13;
        this.f81735c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Function2 function2;
        ArrayList arrayList;
        kotlin.jvm.internal.f0 f0Var;
        switch (this.f81733a) {
            case 0:
                c0.x0 x0Var = (c0.x0) ((c0) this.f81735c).f81749j;
                long j13 = this.f81734b;
                Object obj = x0Var.f24392b;
                if (j13 == 0) {
                    ((s0) obj).getClass();
                }
                x0Var.f24391a = j13;
                ((s0) obj).f81861f.execute(new b0(x0Var, j13, 1));
                return;
            case 1:
                n8.s sVar = (n8.s) ((s0) ((c0.x0) this.f81735c).f24392b).f81859d;
                if (sVar.f89887p > 0) {
                    return;
                }
                m7.p0 p0Var = sVar.f89889r;
                if (p0Var != null) {
                    p0Var.a();
                }
                long j14 = sVar.f89893v;
                long j15 = this.f81734b;
                long j16 = j15 - j14;
                sVar.f89890s = j16;
                Long l13 = (Long) sVar.f89873b.i(j16);
                n8.c cVar = sVar.f89878g;
                if (l13 != null && l13.longValue() != sVar.f89885n) {
                    cVar.i(l13.longValue(), sVar.f89893v);
                    sVar.f89885n = l13.longValue();
                }
                long j17 = sVar.f89891t;
                boolean z13 = j17 != -9223372036854775807L && j16 >= j17;
                cVar.f89751d.add(sVar.f89879h);
                long j18 = j15 - cVar.f89755h;
                n8.c0 c0Var = cVar.f89750c;
                c0Var.f89764f.d(j18);
                c0Var.f89765g = j18;
                c0Var.f89767i = -9223372036854775807L;
                if (z13) {
                    cVar.j();
                    sVar.f89892u = true;
                    return;
                }
                return;
            case 2:
                m7.i0 i0Var = (m7.i0) ((qq2.c) this.f81735c).f104884c;
                int i13 = d7.n0.f53866a;
                n7.c0 c0Var2 = (n7.c0) i0Var.f86205a.f86285t;
                n7.b w13 = c0Var2.w();
                c0Var2.x(w13, 1010, new v.e(this.f81734b, w13));
                return;
            case 3:
                com.google.android.material.datepicker.g gVar = (com.google.android.material.datepicker.g) this.f81735c;
                gVar.getClass();
                gVar.f32521a.G(String.format(gVar.f32525e, ph.a.G(this.f81734b).replace(' ', (char) 160)));
                gVar.a();
                return;
            case 4:
                View view = (View) this.f81735c;
                Intrinsics.checkNotNullParameter(view, "$view");
                view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(this.f81734b).start();
                return;
            case 5:
                b4 this$0 = (b4) this.f81735c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((Function1) this$0.f94691c).invoke(Long.valueOf(SystemClock.uptimeMillis() - this.f81734b));
                Long l14 = (Long) this$0.f94692d;
                if (l14 != null) {
                    ((Handler) ((xk2.k) this$0.f94693e).getValue()).postDelayed(new b0(l14.longValue(), this$0, 5), this$0.f94690b);
                    return;
                }
                return;
            case 6:
                Function1 function1 = ((pf2.e) this.f81735c).f100029c;
                if (function1 != null) {
                    function1.invoke(Long.valueOf(this.f81734b));
                    return;
                } else {
                    Intrinsics.r("action");
                    throw null;
                }
            case 7:
                qg2.j jVar = (qg2.j) this.f81735c;
                long j19 = this.f81734b;
                if (!jVar.f103876f.isReachable() || (function2 = (Function2) jVar.f103877g.get()) == null) {
                    return;
                }
                try {
                    xk2.q qVar = xk2.s.f135225b;
                    arrayList = new ArrayList();
                    f0Var = new kotlin.jvm.internal.f0();
                } catch (Throwable th3) {
                    xk2.q qVar2 = xk2.s.f135225b;
                    ue.c.m(th3);
                }
                while (true) {
                    PendingApiCall d2 = jVar.a().d();
                    if (d2 == null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            jVar.a().a((PendingApiCall) it.next());
                        }
                        if (jVar.a().b()) {
                            jVar.f103871a.b(new j(jVar, f0Var, j19, 6));
                        }
                        Unit unit = Unit.f80348a;
                        xk2.q qVar3 = xk2.s.f135225b;
                        return;
                    }
                    String name = d2.f72954b;
                    qg2.g gVar2 = (qg2.g) jVar.f103872b;
                    gVar2.getClass();
                    Intrinsics.checkNotNullParameter(name, "name");
                    qg2.e eVar = (qg2.e) gVar2.f103862a;
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(name, "name");
                    pg2.i iVar = (pg2.i) function2.invoke(d2.f72953a, new ha2.i(24, eVar, name));
                    String url = d2.f72953a.f72930h.f72939a;
                    Intrinsics.checkNotNullParameter(url, "url");
                    URL url2 = new URL(url);
                    Intrinsics.checkNotNullParameter(url2, "url");
                    pg2.s[] values = pg2.s.values();
                    int a13 = kotlin.collections.y0.a(values.length);
                    if (a13 < 16) {
                        a13 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
                    for (pg2.s sVar2 : values) {
                        linkedHashMap.put(sVar2.getPath(), sVar2);
                    }
                    String path = url2.getPath();
                    Intrinsics.checkNotNullExpressionValue(path, "url.path");
                    pg2.s sVar3 = (pg2.s) linkedHashMap.get(StringsKt.c0(path, "/"));
                    if (sVar3 == null) {
                        sVar3 = pg2.s.UNKNOWN;
                    }
                    if (!(iVar instanceof pg2.h)) {
                        pg2.u a14 = pg2.t.a(sVar3);
                        synchronized (a14) {
                            a14.f100151b = false;
                            a14.f100150a.set(0);
                            Unit unit2 = Unit.f80348a;
                        }
                    }
                    if (iVar.a()) {
                        if (iVar instanceof pg2.h) {
                            pg2.u a15 = pg2.t.a(((pg2.h) iVar).f100129a);
                            synchronized (a15) {
                                a15.f100151b = true;
                                a15.f100150a.incrementAndGet();
                            }
                            a15.a(jVar.f103871a, ((pg2.h) iVar).f100130b, new qa2.v(jVar, 1));
                        } else if (iVar instanceof pg2.d) {
                            f0Var.f80424a = true;
                        }
                        arrayList.add(d2);
                    } else {
                        qg2.c cVar2 = jVar.f103872b;
                        String name2 = d2.f72954b;
                        qg2.g gVar3 = (qg2.g) cVar2;
                        gVar3.getClass();
                        Intrinsics.checkNotNullParameter(name2, "name");
                        gVar3.f103863b.a(new qg2.f(1, gVar3, name2), ki2.f.NORMAL);
                        ((qg2.g) jVar.f103872b).c(jVar.a(), false);
                    }
                }
                break;
            default:
                N.Ml5G_GLY(this.f81734b, (ArrayList) this.f81735c);
                return;
        }
    }

    public /* synthetic */ b0(Object obj, long j13, int i13) {
        this.f81733a = i13;
        this.f81735c = obj;
        this.f81734b = j13;
    }
}
