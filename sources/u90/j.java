package u90;

import android.graphics.RectF;
import ao2.j0;
import ao2.o1;
import do2.r2;
import do2.t2;
import do2.y1;
import dv0.q;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import r72.i1;
import r72.j1;
import u50.r;
import u62.t;
import v.d3;
import v90.a1;
import v90.q0;
import v90.r0;
import v90.s0;
import v90.t0;
import v90.u0;
import v90.v0;
import v90.w0;
import v90.x0;
import v90.y0;
import v90.z0;
import x02.i2;
import x62.l;
import x62.m;
import x62.p;
import x62.s;
import y62.k;
import y62.n;
import y62.o;

/* loaded from: classes5.dex */
public final class j implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final d3 f121202a;

    /* renamed from: b, reason: collision with root package name */
    public final q f121203b;

    /* renamed from: c, reason: collision with root package name */
    public final i2 f121204c;

    public j(d3 selectMaskViewModelDelegate, q refineMaskViewModelDelegate, i2 pinRepository) {
        Intrinsics.checkNotNullParameter(selectMaskViewModelDelegate, "selectMaskViewModelDelegate");
        Intrinsics.checkNotNullParameter(refineMaskViewModelDelegate, "refineMaskViewModelDelegate");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        this.f121202a = selectMaskViewModelDelegate;
        this.f121203b = refineMaskViewModelDelegate;
        this.f121204c = pinRepository;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:20|21))(5:22|(5:24|(1:26)|27|(1:29)(1:31)|30)|32|33|(2:35|36))|11|12|(2:14|15)(2:17|18)))|39|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x002b, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0084, code lost:
    
        r13 = xk2.s.f135225b;
        r14 = ue.c.m(r12);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(u90.j r12, com.pinterest.shuffles.core.ui.model.MaskModel r13, bl2.c r14) {
        /*
            r12.getClass()
            boolean r0 = r14 instanceof u90.d
            if (r0 == 0) goto L16
            r0 = r14
            u90.d r0 = (u90.d) r0
            int r1 = r0.f121178t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f121178t = r1
            goto L1b
        L16:
            u90.d r0 = new u90.d
            r0.<init>(r12, r14)
        L1b:
            java.lang.Object r14 = r0.f121176r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f121178t
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            ue.c.H(r14)     // Catch: java.lang.Throwable -> L2b
            goto L7f
        L2b:
            r12 = move-exception
            goto L84
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            ue.c.H(r14)
            v.d3 r12 = r12.f121202a
            if (r13 != 0) goto L70
            java.lang.Object r13 = r12.f123430f
            do2.r2 r13 = (do2.r2) r13
            java.lang.Object r13 = r13.getValue()
            y62.g r13 = (y62.g) r13
            r72.i1 r13 = r13.f137939f
            java.lang.String r14 = "mask"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r14)
            com.pinterest.shuffles.core.ui.model.MaskModel r14 = new com.pinterest.shuffles.core.ui.model.MaskModel
            java.lang.String r2 = r13.f106498a
            if (r2 != 0) goto L54
            r2 = r3
        L54:
            r72.a r13 = r13.f106499b
            if (r13 != 0) goto L5a
            r11 = r3
            goto L6c
        L5a:
            com.pinterest.shuffles.core.ui.model.BitmapMaskModel r11 = new com.pinterest.shuffles.core.ui.model.BitmapMaskModel
            r72.j1 r5 = r13.f106431a
            float r6 = r5.f106506a
            float r8 = r5.f106508c
            float r9 = r5.f106509d
            float r7 = r5.f106507b
            java.lang.String r10 = r13.f106432b
            r5 = r11
            r5.<init>(r6, r7, r8, r9, r10)
        L6c:
            r14.<init>(r2, r11)
            r13 = r14
        L70:
            java.lang.Object r12 = r12.f123428d
            u62.t r12 = (u62.t) r12
            xk2.q r14 = xk2.s.f135225b     // Catch: java.lang.Throwable -> L2b
            r0.f121178t = r4     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r14 = r12.c(r13, r0)     // Catch: java.lang.Throwable -> L2b
            if (r14 != r1) goto L7f
            goto L91
        L7f:
            com.pinterest.shuffles.core.ui.model.CutoutModel r14 = (com.pinterest.shuffles.core.ui.model.CutoutModel) r14     // Catch: java.lang.Throwable -> L2b
            xk2.q r12 = xk2.s.f135225b     // Catch: java.lang.Throwable -> L2b
            goto L8a
        L84:
            xk2.q r13 = xk2.s.f135225b
            xk2.r r14 = ue.c.m(r12)
        L8a:
            boolean r12 = r14 instanceof xk2.r
            if (r12 == 0) goto L90
            r1 = r3
            goto L91
        L90:
            r1 = r14
        L91:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u90.j.j(u90.j, com.pinterest.shuffles.core.ui.model.MaskModel, bl2.c):java.lang.Object");
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, r eventIntake) {
        t2 t2Var;
        Object value;
        t2 t2Var2;
        Object value2;
        t2 t2Var3;
        Object value3;
        t2 t2Var4;
        Object value4;
        t2 t2Var5;
        Object value5;
        t2 t2Var6;
        Object value6;
        a1 request = (a1) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof u0) {
            kotlin.jvm.internal.j.z(scope, null, null, new g(request, this, scope, eventIntake, null), 3);
            return;
        }
        boolean z13 = request instanceof t0;
        d3 d3Var = this.f121202a;
        if (z13) {
            k event = ((t0) request).f124962a;
            d3Var.getClass();
            Intrinsics.checkNotNullParameter(event, "event");
            if (Intrinsics.d(event, y62.h.f137941a)) {
                o1 o1Var = (o1) d3Var.f123431g;
                if (o1Var != null) {
                    o1Var.cancel((CancellationException) null);
                }
                y1 y1Var = (y1) d3Var.f123429e;
                do {
                    t2Var6 = (t2) y1Var;
                    value6 = t2Var6.getValue();
                } while (!t2Var6.h(value6, y62.g.a((y62.g) value6, null, s62.f.f111253e, null, null, 13)));
                return;
            }
            if (!(event instanceof y62.i)) {
                if (event instanceof y62.j) {
                    y62.j jVar = (y62.j) event;
                    ((t) d3Var.f123428d).e(new u62.i(jVar.f137945c, jVar.f137946d, jVar.f137943a, jVar.f137944b));
                    return;
                }
                return;
            }
            RectF rectF = ((y62.i) event).f137942a;
            y1 y1Var2 = (y1) d3Var.f123429e;
            do {
                t2Var5 = (t2) y1Var2;
                value5 = t2Var5.getValue();
                i1 i1Var = o.f137954a;
            } while (!t2Var5.h(value5, y62.g.a((y62.g) value5, null, null, null, new j1(rectF.left, rectF.top, rectF.width(), rectF.height()), 7)));
            d3Var.f123426b = true;
            ((t) d3Var.f123428d).h();
            o1 o1Var2 = (o1) d3Var.f123431g;
            if (o1Var2 != null) {
                o1Var2.cancel((CancellationException) null);
            }
            j0 j0Var = (j0) d3Var.f123432h;
            if (j0Var != null) {
                d3Var.f123431g = kotlin.jvm.internal.j.z(j0Var, null, null, new n(rectF, d3Var, null), 3);
                return;
            } else {
                Intrinsics.r("coroutineScope");
                throw null;
            }
        }
        boolean z14 = request instanceof s0;
        q qVar = this.f121203b;
        if (z14) {
            s event2 = ((s0) request).f124960a;
            qVar.getClass();
            Intrinsics.checkNotNullParameter(event2, "event");
            if (event2 instanceof x62.q) {
                float f13 = ((x62.q) event2).f133994a;
                y1 y1Var3 = (y1) qVar.f56381b;
                do {
                    t2Var4 = (t2) y1Var3;
                    value4 = t2Var4.getValue();
                } while (!t2Var4.h(value4, p.a((p) value4, null, null, null, f13, null, 23)));
                return;
            }
            if (event2 instanceof x62.r) {
                boolean z15 = ((x62.r) event2).f133997c;
                y1 y1Var4 = (y1) qVar.f56381b;
                do {
                    t2Var3 = (t2) y1Var4;
                    value3 = t2Var3.getValue();
                } while (!t2Var3.h(value3, p.a((p) value3, null, null, null, 0.0f, z15 ? x62.o.INVERTED : x62.o.NORMAL, 15)));
                return;
            }
            return;
        }
        if (request instanceof x0) {
            i1 mask = ((y62.g) ((r2) d3Var.f123430f).getValue()).f137939f;
            qVar.getClass();
            Intrinsics.checkNotNullParameter(mask, "mask");
            y1 y1Var5 = (y1) qVar.f56381b;
            do {
                t2Var2 = (t2) y1Var5;
                value2 = t2Var2.getValue();
            } while (!t2Var2.h(value2, p.a((p) value2, null, mask, null, 0.0f, null, 29)));
            return;
        }
        if (request instanceof w0) {
            ((s62.a) qVar.f56383d).a(m.f133988c);
            return;
        }
        if (request instanceof v0) {
            ((s62.a) qVar.f56383d).a(l.f133987c);
            return;
        }
        if (request instanceof y0) {
            x62.n brushMode = ((y0) request).f124971a;
            qVar.getClass();
            Intrinsics.checkNotNullParameter(brushMode, "brushMode");
            y1 y1Var6 = (y1) qVar.f56381b;
            do {
                t2Var = (t2) y1Var6;
                value = t2Var.getValue();
            } while (!t2Var.h(value, p.a((p) value, null, null, brushMode, 0.0f, null, 27)));
            return;
        }
        if (request instanceof z0) {
            i1 i1Var2 = ((z0) request).f124972a;
            t tVar = (t) d3Var.f123428d;
            if (i1Var2 == null) {
                i1Var2 = o.f137954a;
            } else {
                i1 i1Var3 = o.f137954a;
            }
            tVar.i(i1Var2, false);
            return;
        }
        if (request instanceof r0) {
            kotlin.jvm.internal.j.z(scope, null, null, new h(this, request, eventIntake, null), 3);
        } else if (request instanceof q0) {
            kotlin.jvm.internal.j.z(scope, null, null, new i(this, request, eventIntake, null), 3);
        }
    }
}
