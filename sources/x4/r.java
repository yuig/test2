package x4;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kh2.n3;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public u4.i f131821a = new u4.i();

    /* renamed from: b, reason: collision with root package name */
    public u4.i f131822b = new u4.i();

    /* renamed from: c, reason: collision with root package name */
    public androidx.constraintlayout.widget.p f131823c = null;

    /* renamed from: d, reason: collision with root package name */
    public androidx.constraintlayout.widget.p f131824d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f131825e;

    /* renamed from: f, reason: collision with root package name */
    public int f131826f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MotionLayout f131827g;

    public r(MotionLayout motionLayout) {
        this.f131827g = motionLayout;
    }

    public static void c(u4.i iVar, u4.i iVar2) {
        ArrayList arrayList = iVar.f120284v0;
        HashMap hashMap = new HashMap();
        hashMap.put(iVar, iVar2);
        iVar2.f120284v0.clear();
        iVar2.i(iVar, hashMap);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u4.h hVar = (u4.h) it.next();
            u4.h aVar = hVar instanceof u4.a ? new u4.a() : hVar instanceof u4.m ? new u4.m() : hVar instanceof u4.k ? new u4.k() : hVar instanceof u4.q ? new u4.q() : hVar instanceof u4.n ? new u4.o() : new u4.h();
            iVar2.f120284v0.add(aVar);
            u4.h hVar2 = aVar.V;
            if (hVar2 != null) {
                ((u4.s) hVar2).g0(aVar);
            }
            aVar.V = iVar2;
            hashMap.put(hVar, aVar);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            u4.h hVar3 = (u4.h) it2.next();
            ((u4.h) hashMap.get(hVar3)).i(hVar3, hashMap);
        }
    }

    public static u4.h d(u4.i iVar, View view) {
        if (iVar.f120211h0 == view) {
            return iVar;
        }
        ArrayList arrayList = iVar.f120284v0;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            u4.h hVar = (u4.h) arrayList.get(i13);
            if (hVar.f120211h0 == view) {
                return hVar;
            }
        }
        return null;
    }

    public final void a() {
        int i13;
        SparseArray sparseArray;
        int[] iArr;
        int i14;
        MotionLayout motionLayout = this.f131827g;
        int childCount = motionLayout.getChildCount();
        motionLayout.f17545k.clear();
        SparseArray sparseArray2 = new SparseArray();
        int[] iArr2 = new int[childCount];
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = motionLayout.getChildAt(i15);
            m mVar = new m(childAt);
            int id3 = childAt.getId();
            iArr2[i15] = id3;
            sparseArray2.put(id3, mVar);
            motionLayout.f17545k.put(childAt, mVar);
        }
        int i16 = 0;
        while (i16 < childCount) {
            View childAt2 = motionLayout.getChildAt(i16);
            m mVar2 = (m) motionLayout.f17545k.get(childAt2);
            if (mVar2 == null) {
                i13 = childCount;
                sparseArray = sparseArray2;
                iArr = iArr2;
                i14 = i16;
            } else {
                androidx.constraintlayout.widget.p pVar = this.f131823c;
                w wVar = mVar2.f131781f;
                if (pVar != null) {
                    u4.h d2 = d(this.f131821a, childAt2);
                    if (d2 != null) {
                        Rect L = MotionLayout.L(motionLayout, d2);
                        androidx.constraintlayout.widget.p pVar2 = this.f131823c;
                        int width = motionLayout.getWidth();
                        sparseArray = sparseArray2;
                        int height = motionLayout.getHeight();
                        iArr = iArr2;
                        int i17 = pVar2.f17854c;
                        i13 = childCount;
                        if (i17 != 0) {
                            m.g(i17, width, height, L, mVar2.f131776a);
                        }
                        wVar.f131838c = 0.0f;
                        wVar.f131839d = 0.0f;
                        mVar2.f(wVar);
                        i14 = i16;
                        wVar.f(L.left, L.top, L.width(), L.height());
                        androidx.constraintlayout.widget.k w13 = pVar2.w(mVar2.f131778c);
                        wVar.a(w13);
                        androidx.constraintlayout.widget.m mVar3 = w13.f17766d;
                        mVar2.f131787l = mVar3.f17822g;
                        mVar2.f131783h.c(L, pVar2, i17, mVar2.f131778c);
                        mVar2.B = w13.f17768f.f17843i;
                        mVar2.D = mVar3.f17825j;
                        mVar2.E = mVar3.f17824i;
                        Context context = mVar2.f131777b.getContext();
                        int i18 = mVar3.f17827l;
                        mVar2.F = i18 != -2 ? i18 != -1 ? i18 != 0 ? i18 != 1 ? i18 != 2 ? i18 != 4 ? i18 != 5 ? null : new OvershootInterpolator() : new BounceInterpolator() : new DecelerateInterpolator() : new AccelerateInterpolator() : new AccelerateDecelerateInterpolator() : new l(t4.e.c(mVar3.f17826k)) : AnimationUtils.loadInterpolator(context, mVar3.f17828m);
                    } else {
                        i13 = childCount;
                        sparseArray = sparseArray2;
                        iArr = iArr2;
                        i14 = i16;
                        if (motionLayout.f17556t != 0) {
                            Log.e("MotionLayout", n3.v() + "no widget for  " + n3.x(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                } else {
                    i13 = childCount;
                    sparseArray = sparseArray2;
                    iArr = iArr2;
                    i14 = i16;
                }
                if (this.f131824d != null) {
                    u4.h d13 = d(this.f131822b, childAt2);
                    if (d13 != null) {
                        Rect L2 = MotionLayout.L(motionLayout, d13);
                        androidx.constraintlayout.widget.p pVar3 = this.f131824d;
                        int width2 = motionLayout.getWidth();
                        int height2 = motionLayout.getHeight();
                        int i19 = pVar3.f17854c;
                        if (i19 != 0) {
                            m.g(i19, width2, height2, L2, mVar2.f131776a);
                            L2 = mVar2.f131776a;
                        }
                        w wVar2 = mVar2.f131782g;
                        wVar2.f131838c = 1.0f;
                        wVar2.f131839d = 1.0f;
                        mVar2.f(wVar2);
                        wVar2.f(L2.left, L2.top, L2.width(), L2.height());
                        wVar2.a(pVar3.w(mVar2.f131778c));
                        mVar2.f131784i.c(L2, pVar3, i19, mVar2.f131778c);
                    } else if (motionLayout.f17556t != 0) {
                        Log.e("MotionLayout", n3.v() + "no widget for  " + n3.x(childAt2) + " (" + childAt2.getClass().getName() + ")");
                    }
                }
            }
            i16 = i14 + 1;
            sparseArray2 = sparseArray;
            iArr2 = iArr;
            childCount = i13;
        }
        SparseArray sparseArray3 = sparseArray2;
        int[] iArr3 = iArr2;
        int i23 = childCount;
        int i24 = 0;
        while (i24 < i23) {
            SparseArray sparseArray4 = sparseArray3;
            m mVar4 = (m) sparseArray4.get(iArr3[i24]);
            int i25 = mVar4.f131781f.f131846k;
            if (i25 != -1) {
                m mVar5 = (m) sparseArray4.get(i25);
                mVar4.f131781f.h(mVar5, mVar5.f131781f);
                mVar4.f131782g.h(mVar5, mVar5.f131782g);
            }
            i24++;
            sparseArray3 = sparseArray4;
        }
    }

    public final void b(int i13, int i14) {
        MotionLayout motionLayout = this.f131827g;
        int optimizationLevel = motionLayout.getOptimizationLevel();
        if (motionLayout.f17535f == motionLayout.f17533e) {
            u4.i iVar = this.f131822b;
            androidx.constraintlayout.widget.p pVar = this.f131824d;
            motionLayout.resolveSystem(iVar, optimizationLevel, (pVar == null || pVar.f17854c == 0) ? i13 : i14, (pVar == null || pVar.f17854c == 0) ? i14 : i13);
            androidx.constraintlayout.widget.p pVar2 = this.f131823c;
            if (pVar2 != null) {
                u4.i iVar2 = this.f131821a;
                int i15 = pVar2.f17854c;
                int i16 = i15 == 0 ? i13 : i14;
                if (i15 == 0) {
                    i13 = i14;
                }
                motionLayout.resolveSystem(iVar2, optimizationLevel, i16, i13);
                return;
            }
            return;
        }
        androidx.constraintlayout.widget.p pVar3 = this.f131823c;
        if (pVar3 != null) {
            u4.i iVar3 = this.f131821a;
            int i17 = pVar3.f17854c;
            motionLayout.resolveSystem(iVar3, optimizationLevel, i17 == 0 ? i13 : i14, i17 == 0 ? i14 : i13);
        }
        u4.i iVar4 = this.f131822b;
        androidx.constraintlayout.widget.p pVar4 = this.f131824d;
        int i18 = (pVar4 == null || pVar4.f17854c == 0) ? i13 : i14;
        if (pVar4 == null || pVar4.f17854c == 0) {
            i13 = i14;
        }
        motionLayout.resolveSystem(iVar4, optimizationLevel, i18, i13);
    }

    public final void e(androidx.constraintlayout.widget.p pVar, androidx.constraintlayout.widget.p pVar2) {
        u4.i iVar;
        u4.i iVar2;
        u4.i iVar3;
        u4.i iVar4;
        this.f131823c = pVar;
        this.f131824d = pVar2;
        this.f131821a = new u4.i();
        this.f131822b = new u4.i();
        u4.i iVar5 = this.f131821a;
        MotionLayout motionLayout = this.f131827g;
        iVar = ((ConstraintLayout) motionLayout).mLayoutWidget;
        v4.c cVar = iVar.f120246z0;
        iVar5.f120246z0 = cVar;
        iVar5.f120244x0.f123988h = cVar;
        u4.i iVar6 = this.f131822b;
        iVar2 = ((ConstraintLayout) motionLayout).mLayoutWidget;
        v4.c cVar2 = iVar2.f120246z0;
        iVar6.f120246z0 = cVar2;
        iVar6.f120244x0.f123988h = cVar2;
        this.f131821a.f120284v0.clear();
        this.f131822b.f120284v0.clear();
        iVar3 = ((ConstraintLayout) motionLayout).mLayoutWidget;
        c(iVar3, this.f131821a);
        iVar4 = ((ConstraintLayout) motionLayout).mLayoutWidget;
        c(iVar4, this.f131822b);
        if (motionLayout.f17551o > 0.5d) {
            if (pVar != null) {
                g(this.f131821a, pVar);
            }
            g(this.f131822b, pVar2);
        } else {
            g(this.f131822b, pVar2);
            if (pVar != null) {
                g(this.f131821a, pVar);
            }
        }
        this.f131821a.A0 = motionLayout.isRtl();
        u4.i iVar7 = this.f131821a;
        iVar7.f120243w0.U(iVar7);
        this.f131822b.A0 = motionLayout.isRtl();
        u4.i iVar8 = this.f131822b;
        iVar8.f120243w0.U(iVar8);
        ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams.width == -2) {
                u4.i iVar9 = this.f131821a;
                u4.g gVar = u4.g.WRAP_CONTENT;
                iVar9.X(gVar);
                this.f131822b.X(gVar);
            }
            if (layoutParams.height == -2) {
                u4.i iVar10 = this.f131821a;
                u4.g gVar2 = u4.g.WRAP_CONTENT;
                iVar10.a0(gVar2);
                this.f131822b.a0(gVar2);
            }
        }
    }

    public final void f() {
        HashMap hashMap;
        MotionLayout motionLayout = this.f131827g;
        int i13 = motionLayout.f17539h;
        int i14 = motionLayout.f17541i;
        int mode = View.MeasureSpec.getMode(i13);
        int mode2 = View.MeasureSpec.getMode(i14);
        motionLayout.U = mode;
        motionLayout.V = mode2;
        motionLayout.getOptimizationLevel();
        b(i13, i14);
        int i15 = 0;
        if (!(motionLayout.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
            b(i13, i14);
            motionLayout.Q = this.f131821a.y();
            motionLayout.R = this.f131821a.o();
            motionLayout.S = this.f131822b.y();
            int o13 = this.f131822b.o();
            motionLayout.T = o13;
            motionLayout.P = (motionLayout.Q == motionLayout.S && motionLayout.R == o13) ? false : true;
        }
        int i16 = motionLayout.Q;
        int i17 = motionLayout.R;
        int i18 = motionLayout.U;
        if (i18 == Integer.MIN_VALUE || i18 == 0) {
            i16 = (int) ((motionLayout.W * (motionLayout.S - i16)) + i16);
        }
        int i19 = i16;
        int i23 = motionLayout.V;
        int i24 = (i23 == Integer.MIN_VALUE || i23 == 0) ? (int) ((motionLayout.W * (motionLayout.T - i17)) + i17) : i17;
        u4.i iVar = this.f131821a;
        motionLayout.resolveMeasuredDimension(i13, i14, i19, i24, iVar.J0 || this.f131822b.J0, iVar.K0 || this.f131822b.K0);
        int childCount = motionLayout.getChildCount();
        motionLayout.f17538g0.a();
        motionLayout.f17555s = true;
        SparseArray sparseArray = new SparseArray();
        int i25 = 0;
        while (true) {
            hashMap = motionLayout.f17545k;
            if (i25 >= childCount) {
                break;
            }
            View childAt = motionLayout.getChildAt(i25);
            sparseArray.put(childAt.getId(), (m) hashMap.get(childAt));
            i25++;
        }
        int width = motionLayout.getWidth();
        int height = motionLayout.getHeight();
        y yVar = motionLayout.f17525a.f131876c;
        int i26 = yVar != null ? yVar.f131871p : -1;
        if (i26 != -1) {
            for (int i27 = 0; i27 < childCount; i27++) {
                m mVar = (m) hashMap.get(motionLayout.getChildAt(i27));
                if (mVar != null) {
                    mVar.A = i26;
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[hashMap.size()];
        int i28 = 0;
        for (int i29 = 0; i29 < childCount; i29++) {
            m mVar2 = (m) hashMap.get(motionLayout.getChildAt(i29));
            int i33 = mVar2.f131781f.f131846k;
            if (i33 != -1) {
                sparseBooleanArray.put(i33, true);
                iArr[i28] = mVar2.f131781f.f131846k;
                i28++;
            }
        }
        if (motionLayout.I != null) {
            for (int i34 = 0; i34 < i28; i34++) {
                m mVar3 = (m) hashMap.get(motionLayout.findViewById(iArr[i34]));
                if (mVar3 != null) {
                    motionLayout.f17525a.d(mVar3);
                }
            }
            Iterator it = motionLayout.I.iterator();
            while (it.hasNext()) {
                ((MotionHelper) it.next()).y(motionLayout, hashMap);
            }
            for (int i35 = 0; i35 < i28; i35++) {
                m mVar4 = (m) hashMap.get(motionLayout.findViewById(iArr[i35]));
                if (mVar4 != null) {
                    mVar4.h(width, height, System.nanoTime());
                }
            }
        } else {
            for (int i36 = 0; i36 < i28; i36++) {
                m mVar5 = (m) hashMap.get(motionLayout.findViewById(iArr[i36]));
                if (mVar5 != null) {
                    motionLayout.f17525a.d(mVar5);
                    mVar5.h(width, height, System.nanoTime());
                }
            }
        }
        for (int i37 = 0; i37 < childCount; i37++) {
            View childAt2 = motionLayout.getChildAt(i37);
            m mVar6 = (m) hashMap.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && mVar6 != null) {
                motionLayout.f17525a.d(mVar6);
                mVar6.h(width, height, System.nanoTime());
            }
        }
        y yVar2 = motionLayout.f17525a.f131876c;
        float f13 = yVar2 != null ? yVar2.f131864i : 0.0f;
        if (f13 != 0.0f) {
            boolean z13 = ((double) f13) < 0.0d;
            float abs = Math.abs(f13);
            float f14 = -3.4028235E38f;
            float f15 = Float.MAX_VALUE;
            float f16 = -3.4028235E38f;
            float f17 = Float.MAX_VALUE;
            for (int i38 = 0; i38 < childCount; i38++) {
                m mVar7 = (m) hashMap.get(motionLayout.getChildAt(i38));
                if (!Float.isNaN(mVar7.f131787l)) {
                    for (int i39 = 0; i39 < childCount; i39++) {
                        m mVar8 = (m) hashMap.get(motionLayout.getChildAt(i39));
                        if (!Float.isNaN(mVar8.f131787l)) {
                            f15 = Math.min(f15, mVar8.f131787l);
                            f14 = Math.max(f14, mVar8.f131787l);
                        }
                    }
                    while (i15 < childCount) {
                        m mVar9 = (m) hashMap.get(motionLayout.getChildAt(i15));
                        if (!Float.isNaN(mVar9.f131787l)) {
                            mVar9.f131789n = 1.0f / (1.0f - abs);
                            if (z13) {
                                mVar9.f131788m = abs - (((f14 - mVar9.f131787l) / (f14 - f15)) * abs);
                            } else {
                                mVar9.f131788m = abs - (((mVar9.f131787l - f15) * abs) / (f14 - f15));
                            }
                        }
                        i15++;
                    }
                    return;
                }
                w wVar = mVar7.f131782g;
                float f18 = wVar.f131840e;
                float f19 = wVar.f131841f;
                float f23 = z13 ? f19 - f18 : f19 + f18;
                f17 = Math.min(f17, f23);
                f16 = Math.max(f16, f23);
            }
            while (i15 < childCount) {
                m mVar10 = (m) hashMap.get(motionLayout.getChildAt(i15));
                w wVar2 = mVar10.f131782g;
                float f24 = wVar2.f131840e;
                float f25 = wVar2.f131841f;
                float f26 = z13 ? f25 - f24 : f25 + f24;
                mVar10.f131789n = 1.0f / (1.0f - abs);
                mVar10.f131788m = abs - (((f26 - f17) * abs) / (f16 - f17));
                i15++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(u4.i iVar, androidx.constraintlayout.widget.p pVar) {
        androidx.constraintlayout.widget.k kVar;
        androidx.constraintlayout.widget.k kVar2;
        SparseArray<u4.h> sparseArray = new SparseArray<>();
        Constraints.LayoutParams layoutParams = new Constraints.LayoutParams();
        sparseArray.clear();
        sparseArray.put(0, iVar);
        MotionLayout motionLayout = this.f131827g;
        sparseArray.put(motionLayout.getId(), iVar);
        if (pVar != null && pVar.f17854c != 0) {
            u4.i iVar2 = this.f131822b;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(motionLayout.getHeight(), 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(motionLayout.getWidth(), 1073741824);
            boolean z13 = MotionLayout.f17523m0;
            motionLayout.resolveSystem(iVar2, optimizationLevel, makeMeasureSpec, makeMeasureSpec2);
        }
        Iterator it = iVar.f120284v0.iterator();
        while (it.hasNext()) {
            u4.h hVar = (u4.h) it.next();
            hVar.f120215j0 = true;
            sparseArray.put(((View) hVar.f120211h0).getId(), hVar);
        }
        Iterator it2 = iVar.f120284v0.iterator();
        while (it2.hasNext()) {
            u4.h hVar2 = (u4.h) it2.next();
            View view = (View) hVar2.f120211h0;
            int id3 = view.getId();
            HashMap hashMap = pVar.f17857f;
            if (hashMap.containsKey(Integer.valueOf(id3)) && (kVar2 = (androidx.constraintlayout.widget.k) hashMap.get(Integer.valueOf(id3))) != null) {
                kVar2.d(layoutParams);
            }
            hVar2.b0(pVar.w(view.getId()).f17767e.f17777c);
            hVar2.W(pVar.w(view.getId()).f17767e.f17779d);
            if (view instanceof ConstraintHelper) {
                ConstraintHelper constraintHelper = (ConstraintHelper) view;
                int id4 = constraintHelper.getId();
                HashMap hashMap2 = pVar.f17857f;
                if (hashMap2.containsKey(Integer.valueOf(id4)) && (kVar = (androidx.constraintlayout.widget.k) hashMap2.get(Integer.valueOf(id4))) != null && (hVar2 instanceof u4.o)) {
                    constraintHelper.n(kVar, (u4.o) hVar2, layoutParams, sparseArray);
                }
                if (view instanceof Barrier) {
                    ((Barrier) view).x();
                }
            }
            layoutParams.resolveLayoutDirection(motionLayout.getLayoutDirection());
            boolean z14 = MotionLayout.f17523m0;
            this.f131827g.applyConstraintsFromLayoutParams(false, view, hVar2, layoutParams, sparseArray);
            if (pVar.w(view.getId()).f17765c.f17831c == 1) {
                hVar2.f120213i0 = view.getVisibility();
            } else {
                hVar2.f120213i0 = pVar.w(view.getId()).f17765c.f17830b;
            }
        }
        Iterator it3 = iVar.f120284v0.iterator();
        while (it3.hasNext()) {
            u4.h hVar3 = (u4.h) it3.next();
            if (hVar3 instanceof u4.r) {
                ConstraintHelper constraintHelper2 = (ConstraintHelper) hVar3.f120211h0;
                u4.n nVar = (u4.n) hVar3;
                constraintHelper2.w(nVar, sparseArray);
                u4.r rVar = (u4.r) nVar;
                for (int i13 = 0; i13 < rVar.f120279w0; i13++) {
                    u4.h hVar4 = rVar.f120278v0[i13];
                    if (hVar4 != null) {
                        hVar4.G = true;
                    }
                }
            }
        }
    }
}
