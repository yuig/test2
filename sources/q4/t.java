package q4;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t extends androidx.activity.p {

    /* renamed from: d, reason: collision with root package name */
    public Function0 f102356d;

    /* renamed from: e, reason: collision with root package name */
    public r f102357e;

    /* renamed from: f, reason: collision with root package name */
    public final View f102358f;

    /* renamed from: g, reason: collision with root package name */
    public final q f102359g;

    /* renamed from: h, reason: collision with root package name */
    public final int f102360h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t(kotlin.jvm.functions.Function0 r7, q4.r r8, android.view.View r9, n4.k r10, n4.b r11, java.util.UUID r12) {
        /*
            r6 = this;
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r9.getContext()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 >= r3) goto Lf
            r8.getClass()
        Lf:
            int r2 = u2.u.DialogWindowTheme
            r0.<init>(r1, r2)
            r1 = 0
            r6.<init>(r0, r1)
            r6.f102356d = r7
            r6.f102357e = r8
            r6.f102358f = r9
            r7 = 8
            float r7 = (float) r7
            android.view.Window r8 = r6.getWindow()
            if (r8 == 0) goto Lbd
            android.view.WindowManager$LayoutParams r0 = r8.getAttributes()
            int r0 = r0.softInputMode
            r0 = r0 & 240(0xf0, float:3.36E-43)
            r6.f102360h = r0
            r0 = 1
            r8.requestFeature(r0)
            r2 = 17170445(0x106000d, float:2.461195E-38)
            r8.setBackgroundDrawableResource(r2)
            q4.r r2 = r6.f102357e
            r2.getClass()
            lb.l0.j1(r8, r0)
            q4.q r2 = new q4.q
            android.content.Context r3 = r6.getContext()
            r2.<init>(r3, r8)
            int r3 = u2.s.compose_view_saveable_id_tag
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Dialog:"
            r4.<init>(r5)
            r4.append(r12)
            java.lang.String r12 = r4.toString()
            r2.setTag(r3, r12)
            r2.setClipChildren(r1)
            float r7 = r11.l0(r7)
            r2.setElevation(r7)
            e3.p r7 = new e3.p
            r7.<init>(r0)
            r2.setOutlineProvider(r7)
            r6.f102359g = r2
            android.view.View r7 = r8.getDecorView()
            boolean r8 = r7 instanceof android.view.ViewGroup
            if (r8 == 0) goto L7e
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L7f
        L7e:
            r7 = 0
        L7f:
            if (r7 == 0) goto L84
            d(r7)
        L84:
            r6.setContentView(r2)
            androidx.lifecycle.z r7 = b7.c.r(r9)
            b7.c.Q(r2, r7)
            androidx.lifecycle.u1 r7 = d7.b.J(r9)
            d7.b.t0(r2, r7)
            ma.i r7 = lb.l0.l0(r9)
            lb.l0.i1(r2, r7)
            kotlin.jvm.functions.Function0 r7 = r6.f102356d
            q4.r r8 = r6.f102357e
            r6.e(r7, r8, r10)
            androidx.activity.i0 r7 = r6.f15928c
            q4.b r8 = new q4.b
            r8.<init>(r6, r0)
            java.lang.String r9 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r9)
            java.lang.String r9 = "onBackPressed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r9)
            androidx.activity.j0 r9 = new androidx.activity.j0
            r9.<init>(r8, r0)
            r7.a(r6, r9)
            return
        Lbd:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Dialog has no window"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.t.<init>(kotlin.jvm.functions.Function0, q4.r, android.view.View, n4.k, n4.b, java.util.UUID):void");
    }

    public static final void d(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof q) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = viewGroup.getChildAt(i13);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                d(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    public final void e(Function0 function0, r rVar, n4.k kVar) {
        Window window;
        Window window2;
        this.f102356d = function0;
        this.f102357e = rVar;
        a0 a0Var = rVar.f102354a;
        boolean c13 = l.c(this.f102358f);
        int i13 = b0.f102309a[a0Var.ordinal()];
        int i14 = 0;
        if (i13 == 1) {
            c13 = false;
        } else if (i13 == 2) {
            c13 = true;
        } else if (i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Window window3 = getWindow();
        Intrinsics.f(window3);
        window3.setFlags(c13 ? 8192 : -8193, 8192);
        int i15 = s.f102355a[kVar.ordinal()];
        if (i15 != 1) {
            if (i15 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i14 = 1;
        }
        q qVar = this.f102359g;
        qVar.setLayoutDirection(i14);
        if (!qVar.f102352j && (window2 = getWindow()) != null) {
            window2.setLayout(-2, -2);
        }
        qVar.f102352j = true;
        if (Build.VERSION.SDK_INT >= 31 || (window = getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(this.f102360h);
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent) {
            this.f102357e.getClass();
            this.f102356d.invoke();
        }
        return onTouchEvent;
    }
}
