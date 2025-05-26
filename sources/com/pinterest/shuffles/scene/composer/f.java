package com.pinterest.shuffles.scene.composer;

import android.util.Size;
import kh2.g3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r72.u1;
import r72.y1;
import r72.z1;

/* loaded from: classes4.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public z0 f52036a = new kp.n(2);

    public static ke2.d c(f fVar, z1 item, ke2.i renderable) {
        ke2.b layout = fVar.a(item, 0.0f);
        fVar.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(renderable, "renderable");
        Intrinsics.checkNotNullParameter(layout, "layout");
        ke2.d dVar = new ke2.d(renderable, layout);
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.f79321c.put(Integer.MAX_VALUE, item);
        g3.v(renderable, item.a());
        return dVar;
    }

    public ke2.b a(z1 item, float f13) {
        Intrinsics.checkNotNullParameter(item, "item");
        int i13 = z.f52181a;
        return new ke2.b(z.d(d(), item.c().f106535a, item.c().f106536b), f13, new hd2.a((-item.d()) / 6.283185307179586d), pp2.a.s(item.a()), 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(r72.z1 r7, bl2.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.pinterest.shuffles.scene.composer.d
            if (r0 == 0) goto L13
            r0 = r8
            com.pinterest.shuffles.scene.composer.d r0 = (com.pinterest.shuffles.scene.composer.d) r0
            int r1 = r0.f52028v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f52028v = r1
            goto L18
        L13:
            com.pinterest.shuffles.scene.composer.d r0 = new com.pinterest.shuffles.scene.composer.d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f52026t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f52028v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            r72.z1 r7 = r0.f52025s
            com.pinterest.shuffles.scene.composer.f r0 = r0.f52024r
            ue.c.H(r8)
            goto L7d
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            r72.z1 r7 = r0.f52025s
            com.pinterest.shuffles.scene.composer.f r0 = r0.f52024r
            ue.c.H(r8)
            goto L5e
        L3e:
            ue.c.H(r8)
            boolean r8 = r7 instanceof r72.u1
            if (r8 == 0) goto L61
            com.pinterest.shuffles.scene.composer.z0 r8 = r6.f52036a
            r2 = r7
            r72.u1 r2 = (r72.u1) r2
            com.pinterest.shuffles.scene.composer.e r3 = new com.pinterest.shuffles.scene.composer.e
            r5 = 0
            r3.<init>(r6, r5)
            r0.f52024r = r6
            r0.f52025s = r7
            r0.f52028v = r4
            java.lang.Object r8 = kh2.b0.i0(r8, r2, r3, r0)
            if (r8 != r1) goto L5d
            return r1
        L5d:
            r0 = r6
        L5e:
            ke2.i r8 = (ke2.i) r8
            goto L7f
        L61:
            boolean r8 = r7 instanceof r72.y1
            if (r8 == 0) goto L84
            com.pinterest.shuffles.scene.composer.z0 r8 = r6.f52036a
            r2 = r7
            r72.y1 r2 = (r72.y1) r2
            com.pinterest.shuffles.scene.composer.e r5 = new com.pinterest.shuffles.scene.composer.e
            r5.<init>(r6, r4)
            r0.f52024r = r6
            r0.f52025s = r7
            r0.f52028v = r3
            java.lang.Object r8 = kh2.b0.j0(r8, r2, r5, r0)
            if (r8 != r1) goto L7c
            return r1
        L7c:
            r0 = r6
        L7d:
            ke2.i r8 = (ke2.i) r8
        L7f:
            ke2.d r7 = c(r0, r7, r8)
            return r7
        L84:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.shuffles.scene.composer.f.b(r72.z1, bl2.c):java.lang.Object");
    }

    public abstract Size d();

    public final void e(z0 z0Var) {
        Intrinsics.checkNotNullParameter(z0Var, "<set-?>");
        this.f52036a = z0Var;
    }

    public final Object f(z1 z1Var, ke2.i iVar, Function0 function0, bl2.c cVar) {
        Object p13;
        if (!(z1Var instanceof u1)) {
            return ((z1Var instanceof y1) && (p13 = this.f52036a.p((y1) z1Var, new e(this, 3), (c1) iVar, function0, cVar)) == cl2.a.COROUTINE_SUSPENDED) ? p13 : Unit.f80348a;
        }
        Object t13 = this.f52036a.t((u1) z1Var, new e(this, 2), (h) iVar, function0, cVar);
        return t13 == cl2.a.COROUTINE_SUSPENDED ? t13 : Unit.f80348a;
    }
}
