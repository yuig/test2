package t80;

import ao2.i1;
import ao2.j0;
import ao2.k2;
import ao2.p2;
import ao2.v0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import so.qb;
import zy.f0;

/* loaded from: classes5.dex */
public final class s implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final o12.a f116731a;

    /* renamed from: b, reason: collision with root package name */
    public final wk2.a f116732b;

    /* renamed from: c, reason: collision with root package name */
    public final ll.j f116733c;

    /* renamed from: d, reason: collision with root package name */
    public final zy.d0 f116734d;

    /* renamed from: e, reason: collision with root package name */
    public final i1 f116735e;

    /* renamed from: f, reason: collision with root package name */
    public k2 f116736f;

    public s(o12.a collageService, qb offscreenRendererFactory, ll.j navigator, zy.d0 pinalyticsSEP) {
        Intrinsics.checkNotNullParameter(collageService, "collageService");
        Intrinsics.checkNotNullParameter(offscreenRendererFactory, "offscreenRendererFactory");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        this.f116731a = collageService;
        this.f116732b = offscreenRendererFactory;
        this.f116733c = navigator;
        this.f116734d = pinalyticsSEP;
        this.f116735e = new i1(Executors.newScheduledThreadPool(1, new p2("OffscreenRenderer", new AtomicInteger())));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(t80.s r7, a82.b r8, boolean r9, boolean r10, u50.r r11, bl2.c r12) {
        /*
            r7.getClass()
            boolean r0 = r12 instanceof t80.o
            if (r0 == 0) goto L16
            r0 = r12
            t80.o r0 = (t80.o) r0
            int r1 = r0.f116713x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f116713x = r1
            goto L1b
        L16:
            t80.o r0 = new t80.o
            r0.<init>(r7, r12)
        L1b:
            java.lang.Object r12 = r0.f116711v
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f116713x
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L4f
            if (r2 == r5) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r7 = r0.f116708s
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r0.f116707r
            u50.r r8 = (u50.r) r8
            ue.c.H(r12)
            goto L91
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            boolean r10 = r0.f116710u
            u50.r r11 = r0.f116709t
            java.lang.Object r7 = r0.f116708s
            r8 = r7
            a82.b r8 = (a82.b) r8
            java.lang.Object r7 = r0.f116707r
            t80.s r7 = (t80.s) r7
            ue.c.H(r12)
            goto L6c
        L4f:
            ue.c.H(r12)
            if (r9 == 0) goto L72
            r0.f116707r = r7
            r0.f116708s = r8
            r0.f116709t = r11
            r0.f116710u = r10
            r0.f116713x = r5
            t80.p r9 = new t80.p
            r9.<init>(r7, r8, r4)
            ao2.i1 r12 = r7.f116735e
            java.lang.Object r12 = kotlin.jvm.internal.j.M(r0, r12, r9)
            if (r12 != r1) goto L6c
            goto La9
        L6c:
            java.util.List r12 = (java.util.List) r12
            r9 = r8
            r8 = r7
            r7 = r12
            goto L78
        L72:
            kotlin.collections.q0 r9 = kotlin.collections.q0.f80391a
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L78:
            if (r10 == 0) goto L95
            r0.f116707r = r11
            r0.f116708s = r7
            r0.f116709t = r4
            r0.f116713x = r3
            ao2.i1 r10 = r8.f116735e
            t80.q r12 = new t80.q
            r12.<init>(r8, r9, r4)
            java.lang.Object r12 = kotlin.jvm.internal.j.M(r0, r10, r12)
            if (r12 != r1) goto L90
            goto La9
        L90:
            r8 = r11
        L91:
            java.util.List r12 = (java.util.List) r12
            r11 = r8
            goto L97
        L95:
            kotlin.collections.q0 r12 = kotlin.collections.q0.f80391a
        L97:
            t80.f r8 = new t80.f
            r9 = r7
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            r9 = r9 ^ r5
            r8.<init>(r7, r12, r9)
            r11.a(r8)
            kotlin.Unit r1 = kotlin.Unit.f80348a
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t80.s.j(t80.s, a82.b, boolean, boolean, u50.r, bl2.c):java.lang.Object");
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, u50.r eventIntake) {
        z request = (z) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof u) {
            eventIntake.a(g.f116693a);
            k2 k2Var = this.f116736f;
            if (k2Var != null) {
                k2Var.cancel((CancellationException) null);
            }
            this.f116736f = kotlin.jvm.internal.j.z(scope, null, null, new k(this, request, eventIntake, null), 3);
            return;
        }
        if (request instanceof w) {
            ko2.f fVar = v0.f20219a;
            kotlin.jvm.internal.j.z(scope, ho2.q.f69782a, null, new l(this, null), 2);
            return;
        }
        if (request instanceof y) {
            ko2.f fVar2 = v0.f20219a;
            kotlin.jvm.internal.j.z(scope, ho2.q.f69782a, null, new m(this, null), 2);
        } else if (request instanceof x) {
            ko2.f fVar3 = v0.f20219a;
            kotlin.jvm.internal.j.z(scope, ho2.q.f69782a, null, new n(this, request, null), 2);
        } else {
            if (!(request instanceof v)) {
                Intrinsics.d(request, a.f116677a);
                return;
            }
            v vVar = (v) request;
            this.f116734d.e(scope, new f0(new zy.a(com.bumptech.glide.d.z0(vVar.f116744b, new r(0, this, vVar)), f1.TAP, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN)), eventIntake);
        }
    }
}
