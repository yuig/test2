package l62;

import ao2.k2;
import com.pinterest.shuffles.composer.ui.ComposerView;
import i1.f1;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final ao2.j0 f81615a;

    /* renamed from: b, reason: collision with root package name */
    public final ComposerView f81616b;

    /* renamed from: c, reason: collision with root package name */
    public final com.pinterest.shuffles.scene.composer.y f81617c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f81618d;

    /* renamed from: e, reason: collision with root package name */
    public k2 f81619e;

    public a0(ao2.j0 coroutineScope, ComposerView canvasView, com.pinterest.shuffles.scene.composer.y adapter, f1 onEvent, t62.b rendererUtility) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(canvasView, "canvasView");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(onEvent, "onEvent");
        Intrinsics.checkNotNullParameter(rendererUtility, "rendererUtility");
        this.f81615a = coroutineScope;
        this.f81616b = canvasView;
        this.f81617c = adapter;
        this.f81618d = onEvent;
        x xVar = new x(this);
        b listener = new b(this);
        Intrinsics.checkNotNullParameter(xVar, "<set-?>");
        canvasView.f51858p = xVar;
        Intrinsics.checkNotNullParameter(listener, "listener");
        b bVar = canvasView.f51864v;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        ((List) bVar.f81621b).add(listener);
        Intrinsics.checkNotNullParameter(adapter, "<set-?>");
        canvasView.f51860r = adapter;
        x72.j a03 = canvasView.a0();
        s12.a callback = new s12.a(this, 17);
        ((g62.d) rendererUtility).getClass();
        Intrinsics.checkNotNullParameter(callback, "callback");
        a03.g(new uv.d(callback, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(l62.a0 r8, l62.a r9, bl2.c r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof l62.y
            if (r0 == 0) goto L16
            r0 = r10
            l62.y r0 = (l62.y) r0
            int r1 = r0.f81698v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f81698v = r1
            goto L1b
        L16:
            l62.y r0 = new l62.y
            r0.<init>(r8, r10)
        L1b:
            java.lang.Object r10 = r0.f81696t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f81698v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            l62.a r9 = r0.f81695s
            l62.a0 r8 = r0.f81694r
            ue.c.H(r10)
            goto L8d
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            ue.c.H(r10)
            com.pinterest.shuffles.composer.ui.ComposerView r10 = r8.f81616b
            x72.j r2 = r10.a0()
            r10.f51859q = r4
            java.lang.String r5 = r9.f81612d
            java.lang.String r6 = "#E5E5E5"
            int r6 = android.graphics.Color.parseColor(r6)
            if (r5 == 0) goto L76
            int r7 = r5.length()
            if (r7 <= 0) goto L54
            r7 = r5
            goto L55
        L54:
            r7 = r3
        L55:
            if (r7 == 0) goto L76
            xk2.q r7 = xk2.s.f135225b     // Catch: java.lang.Throwable -> L62
            int r5 = android.graphics.Color.parseColor(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L62
            goto L69
        L62:
            r5 = move-exception
            xk2.q r7 = xk2.s.f135225b
            xk2.r r5 = ue.c.m(r5)
        L69:
            boolean r7 = r5 instanceof xk2.r
            if (r7 == 0) goto L6e
            r5 = r3
        L6e:
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L76
            int r6 = r5.intValue()
        L76:
            r10.d0(r6)
            r0.f81694r = r8
            r0.f81695s = r9
            r0.f81698v = r4
            z72.a r10 = new z72.a
            r10.<init>(r2, r3)
            r4 = 600(0x258, double:2.964E-321)
            java.lang.Object r10 = bs1.c.y2(r4, r10, r0)
            if (r10 != r1) goto L8d
            goto Lc8
        L8d:
            r0 = r10
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            com.pinterest.shuffles.composer.ui.ComposerView r8 = r8.f81616b
            r0 = 0
            r8.f51859q = r0
            java.lang.String r9 = r9.f81612d
            if (r9 == 0) goto Lc4
            int r1 = r9.length()
            if (r1 <= 0) goto La1
            r1 = r9
            goto La2
        La1:
            r1 = r3
        La2:
            if (r1 == 0) goto Lc4
            xk2.q r1 = xk2.s.f135225b     // Catch: java.lang.Throwable -> Laf
            int r9 = android.graphics.Color.parseColor(r9)     // Catch: java.lang.Throwable -> Laf
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Laf
            goto Lb6
        Laf:
            r9 = move-exception
            xk2.q r1 = xk2.s.f135225b
            xk2.r r9 = ue.c.m(r9)
        Lb6:
            boolean r1 = r9 instanceof xk2.r
            if (r1 == 0) goto Lbb
            goto Lbc
        Lbb:
            r3 = r9
        Lbc:
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto Lc4
            int r0 = r3.intValue()
        Lc4:
            r8.d0(r0)
            r1 = r10
        Lc8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l62.a0.a(l62.a0, l62.a, bl2.c):java.lang.Object");
    }
}
