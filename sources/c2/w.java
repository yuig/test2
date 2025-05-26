package c2;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f25325a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f25326b;

    /* renamed from: c, reason: collision with root package name */
    public final j1.n f25327c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f25328d;

    /* renamed from: e, reason: collision with root package name */
    public final z2 f25329e = new z2();

    /* renamed from: f, reason: collision with root package name */
    public final t f25330f = new t(this);

    /* renamed from: g, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f25331g;

    /* renamed from: h, reason: collision with root package name */
    public final i2.o0 f25332h;

    /* renamed from: i, reason: collision with root package name */
    public final i2.o0 f25333i;

    /* renamed from: j, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f25334j;

    /* renamed from: k, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f25335k;

    /* renamed from: l, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f25336l;

    /* renamed from: m, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f25337m;

    /* renamed from: n, reason: collision with root package name */
    public final q f25338n;

    public w(Object obj, Function1 function1, Function0 function0, j1.o2 o2Var, Function1 function12) {
        this.f25325a = function1;
        this.f25326b = function0;
        this.f25327c = o2Var;
        this.f25328d = function12;
        i2.y3 y3Var = i2.y3.f71400a;
        this.f25331g = bs1.c.u1(obj, y3Var);
        this.f25332h = bs1.c.S(new u(this, 4));
        this.f25333i = bs1.c.S(new u(this, 3));
        this.f25334j = b7.c.J(Float.NaN);
        bs1.c.R(y3Var, new u(this, 0));
        this.f25335k = b7.c.J(0.0f);
        this.f25336l = bs1.c.u1(null, y3Var);
        this.f25337m = bs1.c.u1(new a3(kotlin.collections.z0.d()), y3Var);
        this.f25338n = new q(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, k1.v1 r8, c2.d r9, bl2.c r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof c2.n
            if (r0 == 0) goto L13
            r0 = r10
            c2.n r0 = (c2.n) r0
            int r1 = r0.f24990u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24990u = r1
            goto L18
        L13:
            c2.n r0 = new c2.n
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f24988s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f24990u
            r3 = 0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 != r5) goto L2f
            c2.w r7 = r0.f24987r
            ue.c.H(r10)     // Catch: java.lang.Throwable -> L2c
            goto L61
        L2c:
            r8 = move-exception
            goto La3
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            ue.c.H(r10)
            c2.a3 r10 = r6.d()
            java.util.Map r10 = r10.f24525a
            boolean r10 = r10.containsKey(r7)
            if (r10 == 0) goto Ldd
            c2.z2 r10 = r6.f25329e     // Catch: java.lang.Throwable -> La1
            c2.p r2 = new c2.p     // Catch: java.lang.Throwable -> La1
            r2.<init>(r6, r7, r9, r3)     // Catch: java.lang.Throwable -> La1
            r0.f24987r = r6     // Catch: java.lang.Throwable -> La1
            r0.f24990u = r5     // Catch: java.lang.Throwable -> La1
            r10.getClass()     // Catch: java.lang.Throwable -> L9d
            c2.y2 r7 = new c2.y2     // Catch: java.lang.Throwable -> L9d
            r7.<init>(r8, r10, r2, r3)     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r7 = dl2.b.O(r7, r0)     // Catch: java.lang.Throwable -> L9d
            if (r7 != r1) goto L60
            return r1
        L60:
            r7 = r6
        L61:
            r7.h(r3)
            c2.a3 r8 = r7.d()
            androidx.compose.runtime.ParcelableSnapshotMutableFloatState r9 = r7.f25334j
            float r10 = r9.h()
            java.lang.Object r8 = r8.a(r10)
            if (r8 == 0) goto Le0
            float r9 = r9.h()
            c2.a3 r10 = r7.d()
            float r10 = r10.c(r8)
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 > 0) goto Le0
            kotlin.jvm.functions.Function1 r9 = r7.f25328d
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Le0
            r7.g(r8)
            goto Le0
        L9b:
            r8 = r7
            goto L9f
        L9d:
            r7 = move-exception
            goto L9b
        L9f:
            r7 = r6
            goto La3
        La1:
            r8 = move-exception
            goto L9f
        La3:
            r7.h(r3)
            c2.a3 r9 = r7.d()
            androidx.compose.runtime.ParcelableSnapshotMutableFloatState r10 = r7.f25334j
            float r0 = r10.h()
            java.lang.Object r9 = r9.a(r0)
            if (r9 == 0) goto Ldc
            float r10 = r10.h()
            c2.a3 r0 = r7.d()
            float r0 = r0.c(r9)
            float r10 = r10 - r0
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 > 0) goto Ldc
            kotlin.jvm.functions.Function1 r10 = r7.f25328d
            java.lang.Object r10 = r10.invoke(r9)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Ldc
            r7.g(r9)
        Ldc:
            throw r8
        Ldd:
            r6.g(r7)
        Le0:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.w.a(java.lang.Object, k1.v1, c2.d, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(k1.v1 r7, c2.r r8, bl2.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof c2.k
            if (r0 == 0) goto L13
            r0 = r9
            c2.k r0 = (c2.k) r0
            int r1 = r0.f24872u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24872u = r1
            goto L18
        L13:
            c2.k r0 = new c2.k
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f24870s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f24872u
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            c2.w r7 = r0.f24869r
            ue.c.H(r9)     // Catch: java.lang.Throwable -> L2b
            goto L54
        L2b:
            r8 = move-exception
            goto L95
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            ue.c.H(r9)
            c2.z2 r9 = r6.f25329e     // Catch: java.lang.Throwable -> L93
            c2.m r2 = new c2.m     // Catch: java.lang.Throwable -> L93
            r5 = 0
            r2.<init>(r6, r5, r8)     // Catch: java.lang.Throwable -> L93
            r0.f24869r = r6     // Catch: java.lang.Throwable -> L93
            r0.f24872u = r4     // Catch: java.lang.Throwable -> L93
            r9.getClass()     // Catch: java.lang.Throwable -> L8f
            c2.y2 r8 = new c2.y2     // Catch: java.lang.Throwable -> L8f
            r8.<init>(r7, r9, r2, r5)     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r7 = dl2.b.O(r8, r0)     // Catch: java.lang.Throwable -> L8f
            if (r7 != r1) goto L53
            return r1
        L53:
            r7 = r6
        L54:
            c2.a3 r8 = r7.d()
            androidx.compose.runtime.ParcelableSnapshotMutableFloatState r9 = r7.f25334j
            float r0 = r9.h()
            java.lang.Object r8 = r8.a(r0)
            if (r8 == 0) goto L8a
            float r9 = r9.h()
            c2.a3 r0 = r7.d()
            float r0 = r0.c(r8)
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L8a
            kotlin.jvm.functions.Function1 r9 = r7.f25328d
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8a
            r7.g(r8)
        L8a:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        L8d:
            r8 = r7
            goto L91
        L8f:
            r7 = move-exception
            goto L8d
        L91:
            r7 = r6
            goto L95
        L93:
            r8 = move-exception
            goto L91
        L95:
            c2.a3 r9 = r7.d()
            androidx.compose.runtime.ParcelableSnapshotMutableFloatState r0 = r7.f25334j
            float r1 = r0.h()
            java.lang.Object r9 = r9.a(r1)
            if (r9 == 0) goto Lcb
            float r0 = r0.h()
            c2.a3 r1 = r7.d()
            float r1 = r1.c(r9)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto Lcb
            kotlin.jvm.functions.Function1 r0 = r7.f25328d
            java.lang.Object r0 = r0.invoke(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lcb
            r7.g(r9)
        Lcb:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.w.b(k1.v1, c2.r, bl2.c):java.lang.Object");
    }

    public final Object c(float f13, float f14, Object obj) {
        Object b13;
        a3 d2 = d();
        float c13 = d2.c(obj);
        float floatValue = ((Number) this.f25326b.invoke()).floatValue();
        if (c13 == f13 || Float.isNaN(c13)) {
            return obj;
        }
        Function1 function1 = this.f25325a;
        if (c13 < f13) {
            if (f14 >= floatValue) {
                Object b14 = d2.b(f13, true);
                Intrinsics.f(b14);
                return b14;
            }
            b13 = d2.b(f13, true);
            Intrinsics.f(b13);
            if (f13 < Math.abs(Math.abs(((Number) function1.invoke(Float.valueOf(Math.abs(d2.c(b13) - c13)))).floatValue()) + c13)) {
                return obj;
            }
        } else {
            if (f14 <= (-floatValue)) {
                Object b15 = d2.b(f13, false);
                Intrinsics.f(b15);
                return b15;
            }
            b13 = d2.b(f13, false);
            Intrinsics.f(b13);
            float abs = Math.abs(c13 - Math.abs(((Number) function1.invoke(Float.valueOf(Math.abs(c13 - d2.c(b13))))).floatValue()));
            if (f13 < 0.0f) {
                if (Math.abs(f13) < abs) {
                    return obj;
                }
            } else if (f13 > abs) {
                return obj;
            }
        }
        return b13;
    }

    public final a3 d() {
        return (a3) this.f25337m.getValue();
    }

    public final float e() {
        return this.f25334j.h();
    }

    public final float f() {
        if (!Float.isNaN(e())) {
            return e();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
    }

    public final void g(Object obj) {
        this.f25331g.setValue(obj);
    }

    public final void h(Object obj) {
        this.f25336l.setValue(obj);
    }

    public final boolean i(Object obj) {
        v vVar = new v(0, this, obj);
        mo2.c cVar = this.f25329e.f25464b;
        boolean h10 = cVar.h(null);
        if (h10) {
            try {
                vVar.invoke();
            } finally {
                cVar.i(null);
            }
        }
        return h10;
    }
}
