package androidx.appcompat.app;

import a.a4;
import android.hardware.camera2.CameraCaptureSession;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x0 implements n.z, com.google.android.material.internal.h0 {

    /* renamed from: a */
    public boolean f16147a;

    /* renamed from: b */
    public final Object f16148b;

    public x0(Set changedKeys, boolean z13) {
        Intrinsics.checkNotNullParameter(changedKeys, "changedKeys");
        this.f16148b = changedKeys;
        this.f16147a = z13;
    }

    public final CameraCaptureSession.CaptureCallback a(CameraCaptureSession.CaptureCallback captureCallback) {
        if (!this.f16147a) {
            return captureCallback;
        }
        w.e eVar = new w.e();
        com.google.common.util.concurrent.c0 c0Var = (com.google.common.util.concurrent.c0) eVar.f126919b;
        ((List) this.f16148b).add(c0Var);
        Log.d("RequestMonitor", "RequestListener " + eVar + " monitoring " + this);
        c0Var.d(new a4(this, eVar, c0Var, 5), l3.c.s());
        return new v.i0(Arrays.asList(eVar, captureCallback));
    }

    @Override // n.z
    public final void b(n.o oVar, boolean z13) {
        androidx.appcompat.widget.n nVar;
        if (this.f16147a) {
            return;
        }
        this.f16147a = true;
        y0 y0Var = (y0) this.f16148b;
        ActionMenuView actionMenuView = y0Var.f16151a.f16581a.f16469a;
        if (actionMenuView != null && (nVar = actionMenuView.f16254t) != null) {
            nVar.k();
            androidx.appcompat.widget.h hVar = nVar.f16659s;
            if (hVar != null && hVar.b()) {
                hVar.f88722j.dismiss();
            }
        }
        y0Var.f16152b.onPanelClosed(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE, oVar);
        this.f16147a = false;
    }

    @Override // n.z
    public final boolean c(n.o oVar) {
        ((y0) this.f16148b).f16152b.onMenuOpened(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE, oVar);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x007c, code lost:
    
        if (r7 != false) goto L79;
     */
    @Override // com.google.android.material.internal.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final q5.a2 d(android.view.View r11, q5.a2 r12, l8.p r13) {
        /*
            r10 = this;
            q5.y1 r0 = r12.f102400a
            r1 = 7
            f5.e r1 = r0.f(r1)
            r2 = 32
            f5.e r0 = r0.f(r2)
            java.lang.Object r2 = r10.f16148b
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
            int r3 = r1.f61082b
            r2.f32319w = r3
            boolean r3 = lb.l0.H0(r11)
            int r4 = r11.getPaddingBottom()
            int r5 = r11.getPaddingLeft()
            int r6 = r11.getPaddingRight()
            boolean r7 = r2.f32311o
            if (r7 == 0) goto L32
            int r4 = r12.b()
            r2.f32318v = r4
            int r7 = r13.f82078d
            int r4 = r4 + r7
        L32:
            boolean r7 = r2.f32312p
            int r8 = r1.f61081a
            if (r7 == 0) goto L40
            if (r3 == 0) goto L3d
            int r5 = r13.f82077c
            goto L3f
        L3d:
            int r5 = r13.f82075a
        L3f:
            int r5 = r5 + r8
        L40:
            boolean r7 = r2.f32313q
            int r9 = r1.f61083c
            if (r7 == 0) goto L4f
            if (r3 == 0) goto L4b
            int r13 = r13.f82075a
            goto L4d
        L4b:
            int r13 = r13.f82077c
        L4d:
            int r6 = r13 + r9
        L4f:
            android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
            boolean r3 = r2.f32315s
            r7 = 1
            if (r3 == 0) goto L62
            int r3 = r13.leftMargin
            if (r3 == r8) goto L62
            r13.leftMargin = r8
            r3 = r7
            goto L63
        L62:
            r3 = 0
        L63:
            boolean r8 = r2.f32316t
            if (r8 == 0) goto L6e
            int r8 = r13.rightMargin
            if (r8 == r9) goto L6e
            r13.rightMargin = r9
            goto L6f
        L6e:
            r7 = r3
        L6f:
            boolean r3 = r2.f32317u
            if (r3 == 0) goto L7c
            int r3 = r13.topMargin
            int r1 = r1.f61082b
            if (r3 == r1) goto L7c
            r13.topMargin = r1
            goto L7e
        L7c:
            if (r7 == 0) goto L81
        L7e:
            r11.setLayoutParams(r13)
        L81:
            int r13 = r11.getPaddingTop()
            r11.setPadding(r5, r13, r6, r4)
            boolean r11 = r10.f16147a
            if (r11 == 0) goto L90
            int r13 = r0.f61084d
            r2.f32309m = r13
        L90:
            boolean r13 = r2.f32311o
            if (r13 != 0) goto L96
            if (r11 == 0) goto L99
        L96:
            r2.f0()
        L99:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.x0.d(android.view.View, q5.a2, l8.p):q5.a2");
    }

    public final Exception e() {
        return (Exception) this.f16148b;
    }

    public final int f(LinearLayoutManager llm, int i13, int i14) {
        Intrinsics.checkNotNullParameter(llm, "llm");
        eb2.m mVar = (eb2.m) this.f16148b;
        int o13 = mVar.o(((Math.abs(i13) / i14) + mVar.f58270f) - 1);
        int i15 = mVar.f58270f;
        if (o13 < i15 || o13 > (i15 = mVar.f58271g)) {
            o13 = i15;
        }
        if (i13 < 0) {
            o13 *= -1;
        }
        if (this.f16147a) {
            o13 *= -1;
        }
        x0 x0Var = mVar.f58277m;
        boolean z13 = i13 < 0;
        return ((!x0Var.f16147a ? !z13 : z13) ? mVar.o(llm.l1()) : mVar.o(llm.k1())) + o13;
    }

    public final com.google.common.util.concurrent.c0 g() {
        List list = (List) this.f16148b;
        if (list.isEmpty()) {
            return g0.m.e(null);
        }
        g0.r i13 = g0.m.i(new ArrayList(list));
        v.l0 l0Var = new v.l0(5);
        return g0.m.f(g0.m.j(i13, new g0.l(l0Var), l3.c.s()));
    }

    public final int h(View view) {
        boolean z13 = this.f16147a;
        Object obj = this.f16148b;
        if (!z13) {
            return ((eb2.m) obj).f58276l.e(view);
        }
        eb2.m mVar = (eb2.m) obj;
        return mVar.f58276l.b(view) - mVar.f58269e.getWidth();
    }

    public final void i() {
        LinkedList linkedList = new LinkedList((List) this.f16148b);
        while (!linkedList.isEmpty()) {
            com.google.common.util.concurrent.c0 c0Var = (com.google.common.util.concurrent.c0) linkedList.poll();
            Objects.requireNonNull(c0Var);
            c0Var.cancel(true);
        }
    }

    public /* synthetic */ x0(boolean z13, Serializable serializable) {
        this.f16147a = z13;
        this.f16148b = serializable;
    }

    public x0(boolean z13) {
        this.f16148b = Collections.synchronizedList(new ArrayList());
        this.f16147a = z13;
    }

    public x0(eb2.m mVar, int i13) {
        this.f16148b = mVar;
        this.f16147a = i13 == 1;
    }

    public x0(y0 y0Var) {
        this.f16148b = y0Var;
    }

    public x0(BottomSheetBehavior bottomSheetBehavior, boolean z13) {
        this.f16148b = bottomSheetBehavior;
        this.f16147a = z13;
    }
}
