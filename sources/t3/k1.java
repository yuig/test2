package t3;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public final class k1 implements f3, ao2.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final View f116050a;

    /* renamed from: b, reason: collision with root package name */
    public final h4.g0 f116051b;

    /* renamed from: c, reason: collision with root package name */
    public final ao2.j0 f116052c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f116053d = new AtomicReference(null);

    public k1(c0 c0Var, h4.g0 g0Var, ao2.j0 j0Var) {
        this.f116050a = c0Var;
        this.f116051b = g0Var;
        this.f116052c = j0Var;
    }

    public final h4.v a(EditorInfo editorInfo) {
        u2.v vVar = (u2.v) this.f116053d.get();
        h4.v vVar2 = null;
        t2 t2Var = (t2) (vVar != null ? vVar.f120057b : null);
        if (t2Var != null) {
            synchronized (t2Var.f116197c) {
                if (!t2Var.f116199e) {
                    y1.i0 a13 = ((y1.g0) t2Var.f116195a).a(editorInfo);
                    q0.e eVar = new q0.e(t2Var, 29);
                    vVar2 = Build.VERSION.SDK_INT >= 34 ? new h4.w(a13, eVar) : new h4.v(a13, eVar);
                    t2Var.f116198d.b(new WeakReference(vVar2));
                }
            }
        }
        return vVar2;
    }

    public final boolean b() {
        u2.v vVar = (u2.v) this.f116053d.get();
        t2 t2Var = (t2) (vVar != null ? vVar.f120057b : null);
        return t2Var != null && (t2Var.f116199e ^ true);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final cl2.a c(y1.g0 r6, bl2.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof t3.i1
            if (r0 == 0) goto L13
            r0 = r7
            t3.i1 r0 = (t3.i1) r0
            int r1 = r0.f116036t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f116036t = r1
            goto L18
        L13:
            t3.i1 r0 = new t3.i1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f116034r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f116036t
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            ue.c.H(r7)
            goto L4f
        L2f:
            ue.c.H(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r5.f116053d
            j1.x0 r2 = new j1.x0
            r4 = 22
            r2.<init>(r4, r6, r5)
            t3.j1 r6 = new t3.j1
            r4 = 0
            r6.<init>(r5, r4)
            r0.f116036t = r3
            u2.w r3 = new u2.w
            r3.<init>(r7, r4, r2, r6)
            java.lang.Object r6 = dl2.b.O(r3, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.k1.c(y1.g0, bl2.c):cl2.a");
    }

    @Override // ao2.j0
    public final CoroutineContext getCoroutineContext() {
        return this.f116052c.getCoroutineContext();
    }
}
