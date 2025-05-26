package t3;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class f5 {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f115998a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final t3.d5 a(androidx.compose.ui.platform.AbstractComposeView r6, i2.w r7, q2.h r8) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = t3.o2.f116108a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L43
            r0 = 6
            co2.m r0 = lb.l0.b(r2, r3, r0)
            xk2.v r2 = t3.p1.f116127m
            java.lang.Object r2 = r2.getValue()
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
            ho2.c r2 = dl2.b.b(r2)
            t3.n2 r4 = new t3.n2
            r4.<init>(r0, r3)
            r5 = 3
            kotlin.jvm.internal.j.z(r2, r3, r3, r4, r5)
            k1.s2 r2 = new k1.s2
            r4 = 16
            r2.<init>(r0, r4)
            java.lang.Object r0 = s2.p.f110667b
            monitor-enter(r0)
            java.util.List r4 = s2.p.f110673h     // Catch: java.lang.Throwable -> L40
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L40
            java.util.ArrayList r2 = kotlin.collections.CollectionsKt.m0(r2, r4)     // Catch: java.lang.Throwable -> L40
            s2.p.f110673h = r2     // Catch: java.lang.Throwable -> L40
            kotlin.Unit r2 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L40
            monitor-exit(r0)
            s2.p.a()
            goto L43
        L40:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L43:
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L56
            android.view.View r0 = r6.getChildAt(r1)
            boolean r1 = r0 instanceof t3.c0
            if (r1 == 0) goto L54
            t3.c0 r0 = (t3.c0) r0
            goto L5a
        L54:
            r0 = r3
            goto L5a
        L56:
            r6.removeAllViews()
            goto L54
        L5a:
            if (r0 != 0) goto L6e
            t3.c0 r0 = new t3.c0
            android.content.Context r1 = r6.getContext()
            kotlin.coroutines.CoroutineContext r2 = r7.h()
            r0.<init>(r1, r2)
            android.view.ViewGroup$LayoutParams r1 = t3.f5.f115998a
            r6.addView(r0, r1)
        L6e:
            s3.l2 r6 = new s3.l2
            s3.k0 r1 = r0.f115887j
            r6.<init>(r1)
            java.lang.Object r1 = i2.a0.f71069a
            i2.z r1 = new i2.z
            r1.<init>(r7, r6)
            int r6 = u2.s.wrapped_composition_tag
            java.lang.Object r6 = r0.getTag(r6)
            boolean r2 = r6 instanceof t3.d5
            if (r2 == 0) goto L89
            r3 = r6
            t3.d5 r3 = (t3.d5) r3
        L89:
            if (r3 != 0) goto L95
            t3.d5 r3 = new t3.d5
            r3.<init>(r0, r1)
            int r6 = u2.s.wrapped_composition_tag
            r0.setTag(r6, r3)
        L95:
            r3.d(r8)
            kotlin.coroutines.CoroutineContext r6 = r0.f115879f
            kotlin.coroutines.CoroutineContext r8 = r7.h()
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r8)
            if (r6 != 0) goto Lab
            kotlin.coroutines.CoroutineContext r6 = r7.h()
            r0.J(r6)
        Lab:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.f5.a(androidx.compose.ui.platform.AbstractComposeView, i2.w, q2.h):t3.d5");
    }
}
