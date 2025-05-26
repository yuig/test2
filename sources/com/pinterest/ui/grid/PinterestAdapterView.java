package com.pinterest.ui.grid;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.animation.Animator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.widget.q1;
import com.pinterest.api.model.Feed;
import com.pinterest.ui.scrollview.ObservableScrollView;
import h32.e3;
import h32.e4;
import h32.h2;
import h32.h4;
import h32.n2;
import h32.r;
import h32.t;
import h32.v2;
import h32.z1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import m60.y0;
import nx.c0;
import nx.d0;
import nx.o0;
import nx.v;
import os.j;
import os.l;
import pk.a0;
import py.e;
import qa2.f0;
import qa2.h0;
import qa2.n1;
import ra2.b;
import rq.n0;
import sh.f;

@Deprecated
/* loaded from: classes4.dex */
public final class PinterestAdapterView extends AdapterView<ListAdapter> {
    public static final b M = new b();
    public static final ra2.a N = new ra2.a();
    public int A;
    public float B;
    public float C;
    public int D;
    public int E;
    public int F;
    public final o0 G;
    public int H;
    public final h2 I;

    /* renamed from: J, reason: collision with root package name */
    public final int[] f52497J;
    public boolean K;
    public final q1 L;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f52498a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f52499b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f52500c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f52501d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f52502e;

    /* renamed from: f, reason: collision with root package name */
    public ObservableScrollView f52503f;

    /* renamed from: g, reason: collision with root package name */
    public l f52504g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f52505h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f52506i;

    /* renamed from: j, reason: collision with root package name */
    public int f52507j;

    /* renamed from: k, reason: collision with root package name */
    public WeakReference f52508k;

    /* renamed from: l, reason: collision with root package name */
    public final GestureDetector f52509l;

    /* renamed from: m, reason: collision with root package name */
    public AdapterView.OnItemClickListener f52510m;

    /* renamed from: n, reason: collision with root package name */
    public AdapterView.OnItemLongClickListener f52511n;

    /* renamed from: o, reason: collision with root package name */
    public final b f52512o;

    /* renamed from: p, reason: collision with root package name */
    public final ra2.a f52513p;

    /* renamed from: q, reason: collision with root package name */
    public Rect f52514q;

    /* renamed from: r, reason: collision with root package name */
    public final SparseArray f52515r;

    /* renamed from: s, reason: collision with root package name */
    public final a f52516s;

    /* renamed from: t, reason: collision with root package name */
    public int f52517t;

    /* renamed from: u, reason: collision with root package name */
    public int f52518u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f52519v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f52520w;

    /* renamed from: x, reason: collision with root package name */
    public int f52521x;

    /* renamed from: y, reason: collision with root package name */
    public int f52522y;

    /* renamed from: z, reason: collision with root package name */
    public int f52523z;

    public PinterestAdapterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52498a = new ArrayList();
        this.f52499b = new ArrayList();
        this.f52500c = new ArrayList();
        this.f52501d = new ArrayList();
        this.f52502e = new ArrayList();
        this.f52505h = false;
        this.f52506i = false;
        this.f52507j = -1;
        this.f52516s = new a();
        this.f52517t = 10;
        this.f52518u = 0;
        this.f52519v = new ArrayList();
        this.f52521x = 0;
        this.f52523z = xb2.b.pin_grid_cols;
        this.C = 0.0f;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.I = h2.GRID_CELL;
        this.f52497J = new int[2];
        this.K = false;
        this.L = new q1(this, 2);
        c1.a aVar = new c1.a(this, 7);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y0.BasePinterestView);
            this.f52517t = obtainStyledAttributes.getDimensionPixelSize(y0.BasePinterestView_brickPadding, this.f52517t);
            this.f52518u = 0;
            this.f52523z = obtainStyledAttributes.getResourceId(y0.BasePinterestView_numColumns, this.f52523z);
            this.f52522y = getResources().getInteger(this.f52523z);
            obtainStyledAttributes.recycle();
        }
        this.f52515r = new SparseArray();
        this.f52509l = new GestureDetector(context, aVar);
        n();
        this.f52512o = M;
        this.f52513p = N;
        this.G = o0.f92437i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z13) {
        SparseArray sparseArray;
        l lVar;
        Feed feed;
        int i13;
        Rect rect;
        LinkedList linkedList;
        l lVar2 = this.f52504g;
        if (lVar2 == null || lVar2.f97490a == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f52519v;
        int size = arrayList3.size();
        int i14 = 0;
        while (true) {
            sparseArray = this.f52515r;
            if (i14 >= size) {
                break;
            }
            List list = (List) arrayList3.get(i14);
            int size2 = list.size();
            boolean z14 = false;
            for (int i15 = 0; i15 < size2; i15++) {
                n1 n1Var = (n1) list.get(i15);
                if (sparseArray.get(n1Var.f103325b) == null && (rect = this.f52514q) != null) {
                    Rect rect2 = n1Var.f103324a;
                    if (rect2.top < rect.bottom && rect.top < rect2.bottom) {
                        l lVar3 = this.f52504g;
                        int i16 = n1Var.f103325b;
                        int itemViewType = lVar3.getItemViewType(i16);
                        LinkedList[] linkedListArr = this.f52516s.f52546a;
                        View view = (linkedListArr == null || itemViewType < 0 || itemViewType >= linkedListArr.length || (linkedList = linkedListArr[itemViewType]) == null || linkedList.size() <= 0) ? null : (View) linkedList.poll();
                        l lVar4 = this.f52504g;
                        lVar4.getClass();
                        Intrinsics.checkNotNullParameter(this, "viewGroup");
                        arrayList.add(lVar4.c(i16, view, this, false));
                        arrayList2.add(n1Var);
                        z14 = true;
                    }
                }
                if (z14) {
                    break;
                }
            }
            i14++;
        }
        int size3 = arrayList.size();
        ArrayList<View> arrayList4 = null;
        for (int i17 = 0; i17 < size3; i17++) {
            if (i17 >= arrayList2.size()) {
                return;
            }
            View view2 = (View) arrayList.get(i17);
            n1 n1Var2 = (n1) arrayList2.get(i17);
            int i18 = n1Var2.f103325b;
            if (view2 != 0) {
                LayoutParams layoutParams = (LayoutParams) view2.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new LayoutParams(-2);
                }
                l lVar5 = this.f52504g;
                if (lVar5 != null) {
                    layoutParams.f52524a = lVar5.getItemViewType(i18);
                }
                if (this.f52510m != null) {
                    view2.setOnClickListener(new wq1.a(this, 24));
                }
                if (this.f52511n != null) {
                    view2.setOnLongClickListener(new n0(this, 12));
                }
                Rect rect3 = n1Var2.f103324a;
                view2.measure(View.MeasureSpec.makeMeasureSpec(rect3.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(rect3.height(), 1073741824));
                view2.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
                view2.setTag(x0.TAG_INDEX, Integer.valueOf(i18));
                view2.setTag(x0.TAG_BRICK, n1Var2);
                addViewInLayout(view2, -1, layoutParams, true);
                sparseArray.put(i18, view2);
            }
            if (view2 instanceof v) {
                Object markImpressionStart = ((v) view2).markImpressionStart();
                boolean z15 = markImpressionStart instanceof z1;
                o0 o0Var = this.G;
                if (z15) {
                    z1 pinImpression = (z1) markImpressionStart;
                    o0Var.getClass();
                    Intrinsics.checkNotNullParameter(pinImpression, "pinImpression");
                    o0Var.a(pinImpression);
                } else if (markImpressionStart instanceof c0) {
                    z1 pinImpression2 = ((c0) markImpressionStart).f92383a;
                    o0Var.getClass();
                    Intrinsics.checkNotNullParameter(pinImpression2, "pinImpression");
                    o0Var.a(pinImpression2);
                }
            }
            if (view2 instanceof qa2.c0) {
                if (z13) {
                    ((qa2.c0) view2).onInitialized();
                } else {
                    ((qa2.c0) view2).onAttached();
                }
            }
            if (this.f52506i && (i13 = this.f52507j) > -1 && n1Var2.f103325b >= i13) {
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                arrayList4.add(view2);
            }
        }
        if (arrayList4 == null || !qb0.b.p(arrayList4) || (lVar = this.f52504g) == null || (feed = lVar.f97490a) == null) {
            return;
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        for (View view3 : arrayList4) {
            if (((n1) view3.getTag(x0.TAG_BRICK)).f103325b >= feed.n()) {
                return;
            } else {
                arrayList5.add(view3);
            }
        }
        Resources resources = getResources();
        if (!arrayList5.isEmpty()) {
            N.a(arrayList5, resources);
        }
        if (arrayList6.isEmpty()) {
            return;
        }
        this.f52513p.a(arrayList6, resources);
    }

    public final void b() {
        ra2.a aVar = this.f52513p;
        ArrayList arrayList = aVar.f107053a;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) it.next();
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
            }
            aVar.f107053a = null;
        }
        b bVar = this.f52512o;
        ArrayList arrayList2 = bVar.f107054a;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Animator animator = (Animator) it2.next();
                if (animator != null) {
                    animator.cancel();
                }
            }
            bVar.f107054a = null;
        }
        ra2.a aVar2 = N;
        ArrayList arrayList3 = aVar2.f107053a;
        if (arrayList3 != null) {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                ViewPropertyAnimator viewPropertyAnimator2 = (ViewPropertyAnimator) it3.next();
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.cancel();
                }
            }
            aVar2.f107053a = null;
        }
        b bVar2 = M;
        ArrayList arrayList4 = bVar2.f107054a;
        if (arrayList4 == null) {
            return;
        }
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            Animator animator2 = (Animator) it4.next();
            if (animator2 != null) {
                animator2.cancel();
            }
        }
        bVar2.f107054a = null;
    }

    public final int c(int i13, int i14) {
        ArrayList arrayList = this.f52520w;
        if (arrayList != null) {
            int intValue = ((Integer) arrayList.get(i13)).intValue();
            int size = this.f52520w.size();
            int i15 = i13;
            int i16 = 1;
            for (int i17 = i13 + 1; i17 < size; i17++) {
                if (((Integer) this.f52520w.get(i17)).intValue() == intValue) {
                    i16++;
                } else {
                    intValue = ((Integer) this.f52520w.get(i17)).intValue();
                    i15 = i17;
                    i16 = 1;
                }
                if (i16 >= i14) {
                    return i15;
                }
            }
        }
        return i13 != 0 ? c(0, i14) : i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList d() {
        int i13;
        int i14;
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        int i15 = 0;
        while (i15 < childCount) {
            if (getChildAt(i15) instanceof f0) {
                h0 internalCell = ((f0) getChildAt(i15)).getInternalCell();
                View view = (View) internalCell;
                double viewHeight = internalCell.getViewHeight();
                int i16 = this.H;
                if (i16 < 0.0f) {
                    i16 = (int) 0.0f;
                }
                int[] iArr = this.f52497J;
                view.getLocationOnScreen(iArr);
                double d2 = iArr[1];
                double d13 = d2 + viewHeight;
                double b13 = hf0.b.f69003c - r70.b.c().b();
                i13 = childCount;
                i14 = i15;
                double d14 = i16;
                if (d2 <= d14 || d13 >= b13) {
                    if (((int) Math.round(((d2 > d14 ? b13 - d2 : d13 < b13 ? d13 - d14 : b13 - d14) / viewHeight) * 100.0d)) < 10) {
                    }
                }
                arrayList.add(internalCell);
            } else {
                i13 = childCount;
                i14 = i15;
            }
            i15 = i14 + 1;
            childCount = i13;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String pinUid = ((h0) it.next()).getPinUid();
            if (!a0.x0(pinUid)) {
                arrayList2.add(pinUid);
            }
        }
        return arrayList2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f52509l.onTouchEvent(motionEvent) | super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(View view) {
        LayoutParams layoutParams;
        if (view instanceof qa2.c0) {
            ((qa2.c0) view).onDetached();
        }
        removeViewInLayout(view);
        this.f52515r.remove(((Integer) view.getTag(x0.TAG_INDEX)).intValue());
        a aVar = this.f52516s;
        if (aVar.f52546a != null && (layoutParams = (LayoutParams) view.getLayoutParams()) != null && layoutParams.f52524a >= 0) {
            view.setLayoutParams(layoutParams);
            aVar.f52546a[layoutParams.f52524a].offer(view);
        }
        if (view instanceof v) {
            d0 a13 = f.a();
            Object markImpressionEnd = ((v) view).markImpressionEnd();
            if (markImpressionEnd != null) {
                boolean z13 = markImpressionEnd instanceof z1;
                o0 o0Var = this.G;
                if (z13) {
                    z1 impression = (z1) markImpressionEnd;
                    Intrinsics.checkNotNullParameter(impression, "impression");
                    c0 pinImpressionContextWrapper = l(new c0(impression));
                    o0Var.getClass();
                    Intrinsics.checkNotNullParameter(pinImpressionContextWrapper, "pinImpressionContextWrapper");
                    o0Var.h(pinImpressionContextWrapper.f92383a);
                } else if (markImpressionEnd instanceof c0) {
                    c0 pinImpressionContextWrapper2 = l((c0) markImpressionEnd);
                    o0Var.getClass();
                    Intrinsics.checkNotNullParameter(pinImpressionContextWrapper2, "pinImpressionContextWrapper");
                    o0Var.h(pinImpressionContextWrapper2.f92383a);
                } else {
                    if (markImpressionEnd instanceof v2) {
                        a13.S((v2) markImpressionEnd);
                    } else if (markImpressionEnd instanceof nx.y0) {
                        a13.s((nx.y0) markImpressionEnd);
                    }
                    if (markImpressionEnd instanceof t) {
                        this.f52498a.add((t) markImpressionEnd);
                    } else if (markImpressionEnd instanceof e3) {
                        this.f52499b.add((e3) markImpressionEnd);
                    } else if (markImpressionEnd instanceof n2) {
                        this.f52500c.add((n2) markImpressionEnd);
                    } else if (markImpressionEnd instanceof r) {
                        this.f52501d.add((r) markImpressionEnd);
                    }
                }
            }
            if (view instanceof h0) {
                h0 h0Var = (h0) view;
                wa2.a pinDrawable = h0Var.getPinDrawable();
                String pinUid = h0Var.getPinUid();
                if (pinDrawable == null || pinUid == null || pinDrawable.h()) {
                    return;
                }
                Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                new e(pinUid).i();
            }
        }
    }

    public final void f() {
        this.K = true;
    }

    public final void g() {
        this.K = false;
    }

    @Override // android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return this.f52504g;
    }

    @Override // android.widget.AdapterView
    public final int getCount() {
        l lVar = this.f52504g;
        if (lVar == null) {
            return 0;
        }
        return lVar.getCount();
    }

    @Override // android.widget.AdapterView
    public final int getSelectedItemPosition() {
        return this.E;
    }

    @Override // android.widget.AdapterView
    public final View getSelectedView() {
        int i13;
        if (getChildCount() <= 0 || (i13 = this.E) < 0) {
            return null;
        }
        return (View) this.f52515r.get(i13);
    }

    public final void h() {
        ObservableScrollView observableScrollView;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            getChildAt(i13).setPressed(false);
        }
        if (getHeight() > 0 && (observableScrollView = this.f52503f) != null) {
            this.B = Math.max(observableScrollView.getScrollY() - this.A, 0) / (r0 - this.f52503f.getHeight());
        }
        o();
        i();
        a(false);
        invalidate();
    }

    public final synchronized void i() {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null) {
                ((LayoutParams) childAt.getLayoutParams()).getClass();
                n1 n1Var = (n1) childAt.getTag(x0.TAG_BRICK);
                Rect rect = this.f52514q;
                if (rect != null) {
                    Rect rect2 = n1Var.f103324a;
                    if (rect2.top >= rect.bottom || rect.top >= rect2.bottom) {
                        e(childAt);
                    }
                }
            }
        }
    }

    public final synchronized void j() {
        try {
            n();
            k();
            removeAllViewsInLayout();
            LinkedList[] linkedListArr = this.f52516s.f52546a;
            if (linkedListArr != null) {
                for (LinkedList linkedList : linkedListArr) {
                    linkedList.clear();
                }
            }
            l lVar = this.f52504g;
            if (lVar != null) {
                lVar.d();
            }
            b();
            this.f52505h = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void k() {
        try {
            this.f52520w = new ArrayList();
            for (int i13 = 0; i13 < this.f52522y; i13++) {
                this.f52520w.add(Integer.valueOf(getPaddingTop()));
            }
            this.f52519v.clear();
            for (int i14 = 0; i14 < this.f52522y; i14++) {
                this.f52519v.add(new ArrayList());
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final c0 l(c0 c0Var) {
        z1 source = c0Var.f92383a;
        h2 h2Var = source.f67496j;
        Intrinsics.checkNotNullParameter(source, "source");
        if (h2Var == null) {
            h2Var = this.I;
        }
        h2 h2Var2 = h2Var;
        c0 c0Var2 = new c0(new z1(source.f67478a, source.f67480b, source.f67482c, source.f67484d, source.f67486e, source.f67488f, source.f67490g, source.f67492h, source.f67494i, h2Var2, source.f67498k, source.f67500l, source.f67502m, source.f67503n, source.f67504o, source.f67505p, source.f67506q, source.f67507r, source.f67508s, source.f67509t, source.f67510u, source.f67511v, source.f67512w, source.f67513x, source.f67514y, source.f67515z, source.A, source.B, source.C, source.D, source.E, source.F, source.G, source.H, source.I, source.f67477J, source.K, source.L, source.M, source.N, source.O, source.P, source.Q, source.R, source.S, source.T, source.U, source.V, source.W, source.X, source.Y, source.Z, source.f67479a0, source.f67481b0, source.f67483c0, source.f67485d0, source.f67487e0, source.f67489f0, source.f67491g0, source.f67493h0, source.f67495i0, source.f67497j0, source.f67499k0, source.f67501l0), c0Var.f92384b);
        this.f52502e.add(c0Var2);
        return c0Var2;
    }

    @Override // android.widget.AdapterView
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void setAdapter(ListAdapter listAdapter) {
        l lVar = this.f52504g;
        q1 q1Var = this.L;
        if (lVar != null) {
            lVar.unregisterDataSetObserver(q1Var);
        }
        l lVar2 = (l) listAdapter;
        this.f52504g = lVar2;
        if (lVar2 != null) {
            lVar2.registerDataSetObserver(q1Var);
            l lVar3 = this.f52504g;
            j jVar = new j();
            lVar3.getClass();
            new j(jVar);
            int viewTypeCount = this.f52504g.getViewTypeCount();
            a aVar = this.f52516s;
            aVar.getClass();
            aVar.f52546a = new LinkedList[viewTypeCount];
            for (int i13 = 0; i13 < viewTypeCount; i13++) {
                aVar.f52546a[i13] = new LinkedList();
            }
        }
        j();
    }

    public final void n() {
        this.f52522y = Math.max(1, this.f52522y);
        int j13 = hf0.b.j(getContext());
        int applyDimension = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        int i13 = (this.f52518u + applyDimension) * 2;
        int i14 = this.f52522y;
        this.f52521x = ((j13 - i13) - ((i14 - 1) * applyDimension)) / i14;
    }

    public final void o() {
        if (this.f52503f == null) {
            return;
        }
        if (this.f52514q == null) {
            this.f52514q = new Rect();
        }
        this.f52514q.left = getLeft();
        Rect rect = this.f52514q;
        rect.top = this.f52503f.G - this.A;
        rect.right = getRight();
        Rect rect2 = this.f52514q;
        rect2.bottom = (this.f52503f.getMeasuredHeight() + rect2.top) - ((int) r70.b.c().b());
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.C = this.B;
        this.f52522y = getResources().getInteger(this.f52523z);
        this.f52521x = 0;
        j();
        requestLayout();
        WeakReference weakReference = this.f52508k;
        if (weakReference != null) {
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(weakReference.get());
        }
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        b();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int i17;
        ObservableScrollView observableScrollView;
        this.A = i14;
        ObservableScrollView observableScrollView2 = this.f52503f;
        if (observableScrollView2 != null) {
            this.A = observableScrollView2.getPaddingTop() + i14;
        }
        ObservableScrollView observableScrollView3 = this.f52503f;
        if (observableScrollView3 != null) {
            float f13 = this.C;
            if (f13 > 0.0f) {
                observableScrollView3.scrollTo(0, Math.round((f13 * (getHeight() - this.f52503f.getHeight())) + this.A));
                this.C = 0.0f;
            } else {
                int i18 = this.D;
                if (i18 != -1) {
                    Iterator it = this.f52519v.iterator();
                    loop0: while (true) {
                        if (!it.hasNext()) {
                            i17 = -1;
                            break;
                        }
                        for (n1 n1Var : (List) it.next()) {
                            if (n1Var.f103325b == i18 && (observableScrollView = this.f52503f) != null) {
                                i17 = (n1Var.f103324a.top + this.A) - observableScrollView.G;
                                break loop0;
                            }
                        }
                    }
                    this.f52503f.scrollBy(0, i17);
                    this.D = -1;
                }
            }
        }
        o();
        if (this.f52505h) {
            this.f52505h = false;
            if (!this.f52506i) {
                removeAllViewsInLayout();
            }
            if (this.f52504g != null) {
                q0.f80391a.getClass();
            }
            a(true);
            if (this.f52506i) {
                this.f52506i = false;
                this.f52507j = -1;
            }
        } else {
            i();
            a(false);
        }
        super.onLayout(z13, i13, i14, i15, i16);
        WeakReference weakReference = this.f52508k;
        if (weakReference != null) {
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(weakReference.get());
        }
        int[] iArr = new int[2];
        ObservableScrollView observableScrollView4 = this.f52503f;
        if (observableScrollView4 != null) {
            observableScrollView4.getLocationInWindow(iArr);
        }
        this.H = iArr[1];
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6 A[EDGE_INSN: B:44:0x00c6->B:45:0x00c6 BREAK  A[LOOP:2: B:33:0x00ab->B:41:0x00c3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0284 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0204  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r23, int r24) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.ui.grid.PinterestAdapterView.onMeasure(int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z13) {
        if (this.f52504g == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if ((childAt instanceof h0) || (childAt instanceof ab2.a)) {
                long currentTimeMillis = System.currentTimeMillis() * 1000000;
                h0 internalCell = ((f0) childAt).getInternalCell();
                if (internalCell.getE0() != null) {
                    internalCell.addVisibilityEvent(new e4(h4.V_APP_ACTIVE, Boolean.valueOf(z13), Long.valueOf(currentTimeMillis)));
                }
            }
            if (this.K && (childAt instanceof ab2.a)) {
                childAt.onWindowFocusChanged(z13);
            }
        }
        super.onWindowFocusChanged(z13);
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        SparseArray sparseArray = this.f52515r;
        if (sparseArray != null) {
            sparseArray.clear();
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.widget.AdapterView
    public final void setEmptyView(View view) {
        throw new RuntimeException("Not supported!");
    }

    @Override // android.widget.AdapterView
    public final void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.f52510m = onItemClickListener;
    }

    @Override // android.widget.AdapterView
    public final void setOnItemLongClickListener(AdapterView.OnItemLongClickListener onItemLongClickListener) {
        this.f52511n = onItemLongClickListener;
    }

    @Override // android.widget.AdapterView
    public final void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
    }

    @Override // android.widget.AdapterView
    public final void setSelection(int i13) {
        if (i13 == this.E) {
            return;
        }
        View selectedView = getSelectedView();
        this.E = i13;
        View selectedView2 = getSelectedView();
        if (selectedView != null) {
            selectedView.setSelected(false);
        }
        if (selectedView2 != null) {
            selectedView2.setSelected(true);
        }
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f52524a;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f52524a = 0;
        }

        public LayoutParams(int i13) {
            super(i13, -2);
            this.f52524a = 0;
        }
    }
}
