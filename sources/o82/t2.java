package o82;

import android.view.View;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t2 extends eb2.a {

    /* renamed from: e, reason: collision with root package name */
    public final int f93717e;

    /* renamed from: f, reason: collision with root package name */
    public final int f93718f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v2 f93719g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(v2 v2Var, int i13, int i14, int i15, int i16, int i17, int i18) {
        super(i13, i14, i15, i16);
        this.f93719g = v2Var;
        this.f93717e = i17;
        this.f93718f = i18;
    }

    @Override // eb2.a
    public final int a(View view, int i13) {
        Intrinsics.checkNotNullParameter(view, "view");
        v2 v2Var = this.f93719g;
        if (v2Var.A4(i13)) {
            return 0;
        }
        ArrayList arrayList = v2Var.B0;
        if (v2.Y8(v2Var, arrayList) == 0) {
            return 0;
        }
        Pair f93 = v2.f9(i13, arrayList);
        if (((r2) f93.f80346a).e(((Number) f93.f80347b).intValue())) {
            return super.a(view, i13);
        }
        return 0;
    }

    @Override // eb2.a
    public final int b(View view, int i13) {
        Intrinsics.checkNotNullParameter(view, "view");
        v2 v2Var = this.f93719g;
        if (v2Var.A4(i13)) {
            return 0;
        }
        ArrayList arrayList = v2Var.B0;
        if (v2.Y8(v2Var, arrayList) == 0) {
            return 0;
        }
        Pair f93 = v2.f9(i13, arrayList);
        if (((r2) f93.f80346a).c3(((Number) f93.f80347b).intValue())) {
            return -this.f93717e;
        }
        Pair f94 = v2.f9(i13, arrayList);
        if (((r2) f94.f80346a).k2(((Number) f94.f80347b).intValue())) {
            return super.b(view, i13);
        }
        return 0;
    }

    @Override // eb2.a
    public final int c(View view, int i13) {
        Intrinsics.checkNotNullParameter(view, "view");
        v2 v2Var = this.f93719g;
        if (v2Var.A4(i13)) {
            return 0;
        }
        ArrayList arrayList = v2Var.B0;
        if (v2.Y8(v2Var, arrayList) == 0) {
            return 0;
        }
        Pair f93 = v2.f9(i13, arrayList);
        if (((r2) f93.f80346a).c3(((Number) f93.f80347b).intValue())) {
            return -this.f93718f;
        }
        Pair f94 = v2.f9(i13, arrayList);
        if (((r2) f94.f80346a).f3(((Number) f94.f80347b).intValue())) {
            return super.c(view, i13);
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
    
        if (((androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager.LayoutParams) r4).getF19192f() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (((androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r4).f19156f == ((androidx.recyclerview.widget.GridLayoutManager) r5).F) goto L17;
     */
    @Override // eb2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(android.view.View r9, int r10) {
        /*
            r8 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            o82.v2 r1 = r8.f93719g
            boolean r2 = r1.A4(r10)
            r3 = 0
            if (r2 != 0) goto L8f
            java.util.ArrayList r2 = r1.B0
            int r4 = o82.v2.Y8(r1, r2)
            if (r4 != 0) goto L18
            goto L8f
        L18:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            android.view.ViewGroup$LayoutParams r4 = r9.getLayoutParams()
            boolean r5 = r4 instanceof androidx.recyclerview.widget.GridLayoutManager.LayoutParams
            r6 = 1
            if (r5 == 0) goto L3c
            androidx.recyclerview.widget.v0 r5 = r1.n8()
            java.lang.String r7 = "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager"
            androidx.recyclerview.widget.l2 r5 = r5.f19650a
            kotlin.jvm.internal.Intrinsics.g(r5, r7)
            androidx.recyclerview.widget.GridLayoutManager r5 = (androidx.recyclerview.widget.GridLayoutManager) r5
            int r5 = r5.F
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r4 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r4
            int r4 = r4.f19156f
            if (r4 != r5) goto L3a
            goto L48
        L3a:
            r6 = r3
            goto L48
        L3c:
            boolean r5 = r4 instanceof androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager.LayoutParams
            if (r5 == 0) goto L3a
            androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager$LayoutParams r4 = (androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager.LayoutParams) r4
            boolean r4 = r4.getF19192f()
            if (r4 == 0) goto L3a
        L48:
            if (r6 == 0) goto L4c
            if (r10 == 0) goto L74
        L4c:
            if (r6 != 0) goto L8f
            int r4 = r1.p8()
            if (r10 >= r4) goto L55
            goto L8f
        L55:
            int r1 = r1.getZ0()
            if (r10 <= r1) goto L5c
            goto L8f
        L5c:
            if (r10 < r1) goto L74
            kotlin.Pair r1 = o82.v2.f9(r3, r2)
            java.lang.Object r4 = r1.f80346a
            o82.r2 r4 = (o82.r2) r4
            java.lang.Object r1 = r1.f80347b
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            boolean r1 = r4.n0(r1)
            if (r1 == 0) goto L8f
        L74:
            kotlin.Pair r10 = o82.v2.f9(r10, r2)
            java.lang.Object r1 = r10.f80346a
            o82.r2 r1 = (o82.r2) r1
            java.lang.Object r10 = r10.f80347b
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            boolean r10 = r1.h(r10)
            if (r10 == 0) goto L8f
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            int r3 = r8.f58247b
        L8f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o82.t2.d(android.view.View, int):int");
    }
}
