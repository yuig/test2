package yc;

import a.cb;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import pc.c0;
import pc.f0;
import pc.j0;
import pc.o0;
import pc.u0;
import vc.a0;

/* loaded from: classes.dex */
public final class l implements ad.a {

    /* renamed from: a, reason: collision with root package name */
    public final vc.a f138642a;

    public l(u00.p store) {
        Intrinsics.checkNotNullParameter(store, "store");
        this.f138642a = store;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(yc.l r19, pc.f r20, pc.v r21, bl2.c r22) {
        /*
            r0 = r19
            r1 = r20
            r2 = r22
            r19.getClass()
            boolean r3 = r2 instanceof yc.g
            if (r3 == 0) goto L1c
            r3 = r2
            yc.g r3 = (yc.g) r3
            int r4 = r3.f138629w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1c
            int r4 = r4 - r5
            r3.f138629w = r4
            goto L21
        L1c:
            yc.g r3 = new yc.g
            r3.<init>(r0, r2)
        L21:
            java.lang.Object r2 = r3.f138627u
            cl2.a r4 = cl2.a.COROUTINE_SUSPENDED
            int r5 = r3.f138629w
            java.lang.String r6 = "<this>"
            r7 = 1
            if (r5 == 0) goto L45
            if (r5 != r7) goto L3d
            long r0 = r3.f138626t
            pc.o0 r4 = r3.f138625s
            pc.f r3 = r3.f138624r
            ue.c.H(r2)     // Catch: com.apollographql.apollo3.exception.CacheMissException -> L3a
            r9 = r0
            r1 = r3
            goto L76
        L3a:
            r0 = move-exception
            r1 = r3
            goto La3
        L3d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L45:
            ue.c.H(r2)
            pc.o0 r2 = r1.f99541a
            int r5 = cd.b.f27547a
            long r8 = java.lang.System.currentTimeMillis()
            vc.a r0 = r0.f138642a     // Catch: com.apollographql.apollo3.exception.CacheMissException -> La2
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r6)     // Catch: com.apollographql.apollo3.exception.CacheMissException -> La2
            pc.f0 r5 = r1.f99543c     // Catch: com.apollographql.apollo3.exception.CacheMissException -> La2
            m60.f0 r10 = vc.b.f125501b     // Catch: com.apollographql.apollo3.exception.CacheMissException -> La2
            pc.c0 r5 = r5.a(r10)     // Catch: com.apollographql.apollo3.exception.CacheMissException -> La2
            a.cb.w(r5)     // Catch: com.apollographql.apollo3.exception.CacheMissException -> La2
            wc.a r5 = wc.a.f129075b     // Catch: com.apollographql.apollo3.exception.CacheMissException -> La2
            r3.f138624r = r1     // Catch: com.apollographql.apollo3.exception.CacheMissException -> La2
            r3.f138625s = r2     // Catch: com.apollographql.apollo3.exception.CacheMissException -> La2
            r3.f138626t = r8     // Catch: com.apollographql.apollo3.exception.CacheMissException -> La2
            r3.f138629w = r7     // Catch: com.apollographql.apollo3.exception.CacheMissException -> La2
            r10 = r21
            java.lang.Object r0 = r0.d(r2, r10, r5, r3)     // Catch: com.apollographql.apollo3.exception.CacheMissException -> La2
            if (r0 != r4) goto L73
            goto La1
        L73:
            r4 = r2
            r9 = r8
            r2 = r0
        L76:
            pc.t0 r2 = (pc.t0) r2     // Catch: com.apollographql.apollo3.exception.CacheMissException -> La2
            java.util.UUID r0 = r1.f99542b
            pc.g r3 = new pc.g
            r3.<init>(r4, r0, r2)
            pc.f0 r0 = r1.f99543c
            r3.a(r0)
            int r0 = cd.b.f27547a
            long r11 = java.lang.System.currentTimeMillis()
            vc.d r0 = new vc.d
            r15 = 0
            r17 = 1
            r13 = 0
            r18 = 0
            r8 = r0
            r8.<init>(r9, r11, r13, r15, r17, r18)
            d7.b.l(r3, r0)
            r3.f99557g = r7
            pc.h r4 = r3.b()
        La1:
            return r4
        La2:
            r0 = move-exception
        La3:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r6)
            pc.f0 r1 = r1.f99543c
            m60.f0 r2 = vc.b.f125503d
            pc.c0 r1 = r1.a(r2)
            a.cb.w(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yc.l.b(yc.l, pc.f, pc.v, bl2.c):java.lang.Object");
    }

    @Override // ad.a
    public final do2.i a(pc.f request, ad.b chain) {
        pb.k kVar;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(chain, "chain");
        o0 o0Var = request.f99541a;
        boolean z13 = o0Var instanceof j0;
        f0 f0Var = request.f99543c;
        if (z13) {
            Intrinsics.checkNotNullParameter(request, "<this>");
            c0 a13 = f0Var.a(pc.v.f99606d);
            Intrinsics.f(a13);
            kVar = new pb.k(new c(request, (pc.v) a13, this, chain, null));
        } else {
            if (!(o0Var instanceof u0)) {
                throw new IllegalStateException(("Unknown operation " + request.f99541a).toString());
            }
            Intrinsics.checkNotNullParameter(request, "<this>");
            c0 a14 = f0Var.a(pc.v.f99606d);
            Intrinsics.f(a14);
            pc.v vVar = (pc.v) a14;
            Intrinsics.checkNotNullParameter(request, "<this>");
            vc.e eVar = (vc.e) f0Var.a(vc.e.f125524c);
            kVar = new pb.k(new d(eVar != null ? eVar.f125525b : false, this, request, vVar, chain, null));
        }
        c0 a15 = f0Var.a(oc.d.f94029d);
        Intrinsics.f(a15);
        return l0.j0(kVar, ((oc.d) a15).f94030b);
    }

    public final Object c(pc.f fVar, pc.h hVar, pc.v vVar, Set set, bl2.c cVar) {
        Object invoke;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        cb.w(fVar.f99543c.a(vc.b.f125502c));
        List list = hVar.f99564d;
        boolean z13 = !(list == null || list.isEmpty());
        f0 f0Var = fVar.f99543c;
        if (z13) {
            Intrinsics.checkNotNullParameter(fVar, "<this>");
            a0 a0Var = (a0) f0Var.a(a0.f125499c);
            if (a0Var == null || !a0Var.f125500b) {
                return Unit.f80348a;
            }
        }
        f fVar2 = new f(fVar, hVar, vVar, this, set, null);
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        vc.c0 c0Var = (vc.c0) f0Var.a(vc.c0.f125515c);
        if (c0Var == null || !c0Var.f125516b) {
            invoke = fVar2.invoke(cVar);
            if (invoke != cl2.a.COROUTINE_SUSPENDED) {
                invoke = Unit.f80348a;
            }
        } else {
            c0 a13 = f0Var.a(oc.d.f94029d);
            Intrinsics.f(a13);
            kotlin.jvm.internal.j.z(((oc.d) a13).f94031c, null, null, new e(fVar2, null), 3);
            invoke = Unit.f80348a;
        }
        return invoke == cl2.a.COROUTINE_SUSPENDED ? invoke : Unit.f80348a;
    }
}
