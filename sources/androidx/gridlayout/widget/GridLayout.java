package androidx.gridlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Arrays;
import java.util.WeakHashMap;
import n6.b;
import o6.d;
import o6.h;
import o6.i;
import o6.k;
import q5.v0;

/* loaded from: classes3.dex */
public class GridLayout extends ViewGroup {

    /* renamed from: i, reason: collision with root package name */
    public static final LogPrinter f18515i = new LogPrinter(3, GridLayout.class.getName());

    /* renamed from: j, reason: collision with root package name */
    public static final int f18516j = b.GridLayout_orientation;

    /* renamed from: k, reason: collision with root package name */
    public static final int f18517k = b.GridLayout_rowCount;

    /* renamed from: l, reason: collision with root package name */
    public static final int f18518l = b.GridLayout_columnCount;

    /* renamed from: m, reason: collision with root package name */
    public static final int f18519m = b.GridLayout_useDefaultMargins;

    /* renamed from: n, reason: collision with root package name */
    public static final int f18520n = b.GridLayout_alignmentMode;

    /* renamed from: o, reason: collision with root package name */
    public static final int f18521o = b.GridLayout_rowOrderPreserved;

    /* renamed from: p, reason: collision with root package name */
    public static final int f18522p = b.GridLayout_columnOrderPreserved;

    /* renamed from: q, reason: collision with root package name */
    public static final o6.a f18523q = new o6.a(0);

    /* renamed from: r, reason: collision with root package name */
    public static final o6.a f18524r;

    /* renamed from: s, reason: collision with root package name */
    public static final o6.a f18525s;

    /* renamed from: t, reason: collision with root package name */
    public static final o6.a f18526t;

    /* renamed from: u, reason: collision with root package name */
    public static final o6.a f18527u;

    /* renamed from: v, reason: collision with root package name */
    public static final o6.b f18528v;

    /* renamed from: w, reason: collision with root package name */
    public static final o6.b f18529w;

    /* renamed from: x, reason: collision with root package name */
    public static final o6.a f18530x;

    /* renamed from: y, reason: collision with root package name */
    public static final o6.a f18531y;

    /* renamed from: z, reason: collision with root package name */
    public static final o6.a f18532z;

    /* renamed from: a, reason: collision with root package name */
    public final a f18533a;

    /* renamed from: b, reason: collision with root package name */
    public final a f18534b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18535c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18536d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18537e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18538f;

    /* renamed from: g, reason: collision with root package name */
    public int f18539g;

    /* renamed from: h, reason: collision with root package name */
    public final LogPrinter f18540h;

    static {
        o6.a aVar = new o6.a(1);
        o6.a aVar2 = new o6.a(2);
        f18524r = aVar;
        f18525s = aVar2;
        f18526t = aVar;
        f18527u = aVar2;
        f18528v = new o6.b(aVar, aVar2);
        f18529w = new o6.b(aVar2, aVar);
        f18530x = new o6.a(3);
        f18531y = new o6.a(4);
        f18532z = new o6.a(5);
    }

    public GridLayout(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        a aVar = new a(this, true);
        this.f18533a = aVar;
        a aVar2 = new a(this, false);
        this.f18534b = aVar2;
        this.f18535c = 0;
        this.f18536d = false;
        this.f18537e = 1;
        this.f18539g = 0;
        this.f18540h = f18515i;
        this.f18538f = context.getResources().getDimensionPixelOffset(n6.a.default_gap);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.GridLayout);
        try {
            aVar2.p(obtainStyledAttributes.getInt(f18517k, Integer.MIN_VALUE));
            l();
            requestLayout();
            aVar.p(obtainStyledAttributes.getInt(f18518l, Integer.MIN_VALUE));
            l();
            requestLayout();
            int i14 = obtainStyledAttributes.getInt(f18516j, 0);
            if (this.f18535c != i14) {
                this.f18535c = i14;
                l();
                requestLayout();
            }
            this.f18536d = obtainStyledAttributes.getBoolean(f18519m, false);
            requestLayout();
            this.f18537e = obtainStyledAttributes.getInt(f18520n, 1);
            requestLayout();
            aVar2.f18576u = obtainStyledAttributes.getBoolean(f18521o, true);
            aVar2.m();
            l();
            requestLayout();
            aVar.f18576u = obtainStyledAttributes.getBoolean(f18522p, true);
            aVar.m();
            l();
            requestLayout();
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static d g(int i13, boolean z13) {
        int i14 = (i13 & (z13 ? 7 : RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER)) >> (z13 ? 0 : 4);
        return i14 != 1 ? i14 != 3 ? i14 != 5 ? i14 != 7 ? i14 != 8388611 ? i14 != 8388613 ? f18523q : f18527u : f18526t : f18532z : z13 ? f18529w : f18525s : z13 ? f18528v : f18524r : f18530x;
    }

    public static void k(String str) {
        throw new IllegalArgumentException(a.a.C(str, ". "));
    }

    public static void o(LayoutParams layoutParams, int i13, int i14, int i15, int i16) {
        i iVar = new i(i13, i14 + i13);
        k kVar = layoutParams.f18554a;
        layoutParams.f18554a = new k(kVar.f92936a, iVar, kVar.f92938c, kVar.f92939d);
        i iVar2 = new i(i15, i16 + i15);
        k kVar2 = layoutParams.f18555b;
        layoutParams.f18555b = new k(kVar2.f92936a, iVar2, kVar2.f92938c, kVar2.f92939d);
    }

    public static k q(int i13, int i14, d dVar, float f13) {
        return new k(i13 != Integer.MIN_VALUE, new i(i13, i14 + i13), dVar, f13);
    }

    public final void a(LayoutParams layoutParams, boolean z13) {
        String str = z13 ? "column" : "row";
        i iVar = (z13 ? layoutParams.f18555b : layoutParams.f18554a).f92937b;
        int i13 = iVar.f92932a;
        if (i13 != Integer.MIN_VALUE && i13 < 0) {
            k(str.concat(" indices must be positive"));
            throw null;
        }
        int i14 = (z13 ? this.f18533a : this.f18534b).f18557b;
        if (i14 != Integer.MIN_VALUE) {
            if (iVar.f92933b > i14) {
                k(str + " indices (start + span) mustn't exceed the " + str + " count");
                throw null;
            }
            if (iVar.a() <= i14) {
                return;
            }
            k(str + " span mustn't exceed the " + str + " count");
            throw null;
        }
    }

    public final int b() {
        int childCount = getChildCount();
        int i13 = 1;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                i13 = ((LayoutParams) childAt.getLayoutParams()).hashCode() + (i13 * 31);
            }
        }
        return i13;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams)) {
            return false;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        a(layoutParams2, true);
        a(layoutParams2, false);
        return true;
    }

    public final void e() {
        int i13 = this.f18539g;
        if (i13 != 0) {
            if (i13 != b()) {
                this.f18540h.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
                l();
                e();
                return;
            }
            return;
        }
        boolean z13 = this.f18535c == 0;
        int i14 = (z13 ? this.f18533a : this.f18534b).f18557b;
        if (i14 == Integer.MIN_VALUE) {
            i14 = 0;
        }
        int[] iArr = new int[i14];
        int childCount = getChildCount();
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i17).getLayoutParams();
            k kVar = z13 ? layoutParams.f18554a : layoutParams.f18555b;
            i iVar = kVar.f92937b;
            int a13 = iVar.a();
            boolean z14 = kVar.f92936a;
            if (z14) {
                i15 = iVar.f92932a;
            }
            k kVar2 = z13 ? layoutParams.f18555b : layoutParams.f18554a;
            i iVar2 = kVar2.f92937b;
            int a14 = iVar2.a();
            boolean z15 = kVar2.f92936a;
            int i18 = iVar2.f92932a;
            if (i14 != 0) {
                a14 = Math.min(a14, i14 - (z15 ? Math.min(i18, i14) : 0));
            }
            if (z15) {
                i16 = i18;
            }
            if (i14 != 0) {
                if (!z14 || !z15) {
                    while (true) {
                        int i19 = i16 + a14;
                        if (i19 <= i14) {
                            for (int i23 = i16; i23 < i19; i23++) {
                                if (iArr[i23] <= i15) {
                                }
                            }
                            break;
                        }
                        if (z15) {
                            i15++;
                        } else if (i19 <= i14) {
                            i16++;
                        } else {
                            i15++;
                            i16 = 0;
                        }
                    }
                }
                Arrays.fill(iArr, Math.min(i16, i14), Math.min(i16 + a14, i14), i15 + a13);
            }
            if (z13) {
                o(layoutParams, i15, a13, i16, a14);
            } else {
                o(layoutParams, i16, a14, i15, a13);
            }
            i16 += a14;
        }
        this.f18539g = b();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public final int i(View view, boolean z13, boolean z14) {
        int[] iArr;
        if (this.f18537e == 1) {
            return j(view, z13, z14);
        }
        a aVar = z13 ? this.f18533a : this.f18534b;
        if (z14) {
            if (aVar.f18565j == null) {
                aVar.f18565j = new int[aVar.g() + 1];
            }
            if (!aVar.f18566k) {
                aVar.d(true);
                aVar.f18566k = true;
            }
            iArr = aVar.f18565j;
        } else {
            if (aVar.f18567l == null) {
                aVar.f18567l = new int[aVar.g() + 1];
            }
            if (!aVar.f18568m) {
                aVar.d(false);
                aVar.f18568m = true;
            }
            iArr = aVar.f18567l;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        i iVar = (z13 ? layoutParams.f18555b : layoutParams.f18554a).f92937b;
        return iArr[z14 ? iVar.f92932a : iVar.f92933b];
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (r7 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        r6 = r0.f92933b;
        r1.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if (r5.getClass() == androidx.legacy.widget.Space.class) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r5.getClass() != android.widget.Space.class) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        r2 = r4.f18538f / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0042, code lost:
    
        r6 = r0.f92932a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
    
        if (r7 != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int j(android.view.View r5, boolean r6, boolean r7) {
        /*
            r4 = this;
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.gridlayout.widget.GridLayout$LayoutParams r0 = (androidx.gridlayout.widget.GridLayout.LayoutParams) r0
            if (r6 == 0) goto L10
            if (r7 == 0) goto Ld
            int r1 = r0.leftMargin
            goto L17
        Ld:
            int r1 = r0.rightMargin
            goto L17
        L10:
            if (r7 == 0) goto L15
            int r1 = r0.topMargin
            goto L17
        L15:
            int r1 = r0.bottomMargin
        L17:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L60
            boolean r1 = r4.f18536d
            r2 = 0
            if (r1 != 0) goto L22
        L20:
            r1 = r2
            goto L60
        L22:
            if (r6 == 0) goto L27
            o6.k r0 = r0.f18555b
            goto L29
        L27:
            o6.k r0 = r0.f18554a
        L29:
            if (r6 == 0) goto L2e
            androidx.gridlayout.widget.a r1 = r4.f18533a
            goto L30
        L2e:
            androidx.gridlayout.widget.a r1 = r4.f18534b
        L30:
            o6.i r0 = r0.f92937b
            if (r6 == 0) goto L40
            java.util.WeakHashMap r6 = q5.v0.f102521a
            int r6 = r4.getLayoutDirection()
            r3 = 1
            if (r6 != r3) goto L40
            if (r7 != 0) goto L45
            goto L42
        L40:
            if (r7 == 0) goto L45
        L42:
            int r6 = r0.f92932a
            goto L4a
        L45:
            int r6 = r0.f92933b
            r1.g()
        L4a:
            java.lang.Class r6 = r5.getClass()
            java.lang.Class<androidx.legacy.widget.Space> r7 = androidx.legacy.widget.Space.class
            if (r6 == r7) goto L20
            java.lang.Class r5 = r5.getClass()
            java.lang.Class<android.widget.Space> r6 = android.widget.Space.class
            if (r5 != r6) goto L5b
            goto L20
        L5b:
            int r5 = r4.f18538f
            int r2 = r5 / 2
            goto L20
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.gridlayout.widget.GridLayout.j(android.view.View, boolean, boolean):int");
    }

    public final void l() {
        this.f18539g = 0;
        a aVar = this.f18533a;
        if (aVar != null) {
            aVar.m();
        }
        a aVar2 = this.f18534b;
        if (aVar2 != null) {
            aVar2.m();
        }
        if (aVar == null || aVar2 == null) {
            return;
        }
        aVar.n();
        aVar2.n();
    }

    public final void m(View view, int i13, int i14, int i15, int i16) {
        view.measure(ViewGroup.getChildMeasureSpec(i13, i(view, true, false) + i(view, true, true), i15), ViewGroup.getChildMeasureSpec(i14, i(view, false, false) + i(view, false, true), i16));
    }

    public final void n(int i13, int i14, boolean z13) {
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z13) {
                    m(childAt, i13, i14, ((ViewGroup.MarginLayoutParams) layoutParams).width, ((ViewGroup.MarginLayoutParams) layoutParams).height);
                } else {
                    boolean z14 = this.f18535c == 0;
                    k kVar = z14 ? layoutParams.f18555b : layoutParams.f18554a;
                    if (kVar.a(z14) == f18532z) {
                        int[] i16 = (z14 ? this.f18533a : this.f18534b).i();
                        i iVar = kVar.f92937b;
                        int i17 = (i16[iVar.f92933b] - i16[iVar.f92932a]) - (i(childAt, z14, false) + i(childAt, z14, true));
                        if (z14) {
                            m(childAt, i13, i14, i17, ((ViewGroup.MarginLayoutParams) layoutParams).height);
                        } else {
                            m(childAt, i13, i14, ((ViewGroup.MarginLayoutParams) layoutParams).width, i17);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int[] iArr;
        int i17;
        a aVar;
        int i18;
        View view;
        GridLayout gridLayout = this;
        e();
        int i19 = i15 - i13;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int i23 = (i19 - paddingLeft) - paddingRight;
        a aVar2 = gridLayout.f18533a;
        aVar2.f18577v.f92934a = i23;
        aVar2.f18578w.f92934a = -i23;
        aVar2.f18572q = false;
        aVar2.i();
        int i24 = ((i16 - i14) - paddingTop) - paddingBottom;
        a aVar3 = gridLayout.f18534b;
        aVar3.f18577v.f92934a = i24;
        aVar3.f18578w.f92934a = -i24;
        aVar3.f18572q = false;
        aVar3.i();
        int[] i25 = aVar2.i();
        int[] i26 = aVar3.i();
        int childCount = getChildCount();
        int i27 = 0;
        while (i27 < childCount) {
            View childAt = gridLayout.getChildAt(i27);
            if (childAt.getVisibility() == 8) {
                i17 = i27;
                i18 = childCount;
                aVar = aVar2;
                iArr = i25;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                k kVar = layoutParams.f18555b;
                k kVar2 = layoutParams.f18554a;
                i iVar = kVar.f92937b;
                i iVar2 = kVar2.f92937b;
                int i28 = childCount;
                int i29 = i25[iVar.f92932a];
                int i33 = i26[iVar2.f92932a];
                int i34 = i25[iVar.f92933b];
                int i35 = i26[iVar2.f92933b];
                int i36 = i34 - i29;
                int i37 = i35 - i33;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                iArr = i25;
                d a13 = kVar.a(true);
                d a14 = kVar2.a(false);
                h hVar = (h) aVar2.h().z(i27);
                h hVar2 = (h) aVar3.h().z(i27);
                i17 = i27;
                aVar = aVar2;
                int i38 = a13.i(childAt, i36 - hVar.d(true));
                int i39 = a14.i(childAt, i37 - hVar2.d(true));
                int i43 = gridLayout.i(childAt, true, true);
                int i44 = gridLayout.i(childAt, false, true);
                int i45 = gridLayout.i(childAt, true, false);
                int i46 = i43 + i45;
                int i47 = i44 + gridLayout.i(childAt, false, false);
                i18 = i28;
                int a15 = hVar.a(this, childAt, a13, measuredWidth + i46, true);
                int a16 = hVar2.a(this, childAt, a14, measuredHeight + i47, false);
                int j13 = a13.j(measuredWidth, i36 - i46);
                int j14 = a14.j(measuredHeight, i37 - i47);
                int i48 = i29 + i38 + a15;
                WeakHashMap weakHashMap = v0.f102521a;
                int i49 = getLayoutDirection() == 1 ? (((i19 - j13) - paddingRight) - i45) - i48 : paddingLeft + i43 + i48;
                int i53 = paddingTop + i33 + i39 + a16 + i44;
                if (j13 == childAt.getMeasuredWidth() && j14 == childAt.getMeasuredHeight()) {
                    view = childAt;
                } else {
                    view = childAt;
                    view.measure(View.MeasureSpec.makeMeasureSpec(j13, 1073741824), View.MeasureSpec.makeMeasureSpec(j14, 1073741824));
                }
                view.layout(i49, i53, j13 + i49, j14 + i53);
            }
            i27 = i17 + 1;
            gridLayout = this;
            i25 = iArr;
            aVar2 = aVar;
            childCount = i18;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        int k13;
        int k14;
        e();
        a aVar = this.f18534b;
        a aVar2 = this.f18533a;
        if (aVar2 != null && aVar != null) {
            aVar2.n();
            aVar.n();
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingRight) + i13), View.MeasureSpec.getMode(i13));
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingBottom) + i14), View.MeasureSpec.getMode(i14));
        n(makeMeasureSpec, makeMeasureSpec2, true);
        if (this.f18535c == 0) {
            k14 = aVar2.k(makeMeasureSpec);
            n(makeMeasureSpec, makeMeasureSpec2, false);
            k13 = aVar.k(makeMeasureSpec2);
        } else {
            k13 = aVar.k(makeMeasureSpec2);
            n(makeMeasureSpec, makeMeasureSpec2, false);
            k14 = aVar2.k(makeMeasureSpec);
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(k14 + paddingRight, getSuggestedMinimumWidth()), i13, 0), View.resolveSizeAndState(Math.max(k13 + paddingBottom, getSuggestedMinimumHeight()), i14, 0));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        l();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
            k kVar = k.f92935e;
            layoutParams3.f18554a = kVar;
            layoutParams3.f18555b = kVar;
            layoutParams3.f18554a = layoutParams2.f18554a;
            layoutParams3.f18555b = layoutParams2.f18555b;
            return layoutParams3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            k kVar2 = k.f92935e;
            layoutParams4.f18554a = kVar2;
            layoutParams4.f18555b = kVar2;
            return layoutParams4;
        }
        LayoutParams layoutParams5 = new LayoutParams(layoutParams);
        k kVar3 = k.f92935e;
        layoutParams5.f18554a = kVar3;
        layoutParams5.f18555b = kVar3;
        return layoutParams5;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: c, reason: collision with root package name */
        public static final int f18541c = (-2147483647) - Integer.MIN_VALUE;

        /* renamed from: d, reason: collision with root package name */
        public static final int f18542d = b.GridLayout_Layout_android_layout_margin;

        /* renamed from: e, reason: collision with root package name */
        public static final int f18543e = b.GridLayout_Layout_android_layout_marginLeft;

        /* renamed from: f, reason: collision with root package name */
        public static final int f18544f = b.GridLayout_Layout_android_layout_marginTop;

        /* renamed from: g, reason: collision with root package name */
        public static final int f18545g = b.GridLayout_Layout_android_layout_marginRight;

        /* renamed from: h, reason: collision with root package name */
        public static final int f18546h = b.GridLayout_Layout_android_layout_marginBottom;

        /* renamed from: i, reason: collision with root package name */
        public static final int f18547i = b.GridLayout_Layout_layout_column;

        /* renamed from: j, reason: collision with root package name */
        public static final int f18548j = b.GridLayout_Layout_layout_columnSpan;

        /* renamed from: k, reason: collision with root package name */
        public static final int f18549k = b.GridLayout_Layout_layout_columnWeight;

        /* renamed from: l, reason: collision with root package name */
        public static final int f18550l = b.GridLayout_Layout_layout_row;

        /* renamed from: m, reason: collision with root package name */
        public static final int f18551m = b.GridLayout_Layout_layout_rowSpan;

        /* renamed from: n, reason: collision with root package name */
        public static final int f18552n = b.GridLayout_Layout_layout_rowWeight;

        /* renamed from: o, reason: collision with root package name */
        public static final int f18553o = b.GridLayout_Layout_layout_gravity;

        /* renamed from: a, reason: collision with root package name */
        public k f18554a;

        /* renamed from: b, reason: collision with root package name */
        public k f18555b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayoutParams() {
            super(-2, -2);
            k kVar = k.f92935e;
            this.f18554a = kVar;
            this.f18555b = kVar;
            setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
            this.f18554a = kVar;
            this.f18555b = kVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            LayoutParams layoutParams = (LayoutParams) obj;
            return this.f18555b.equals(layoutParams.f18555b) && this.f18554a.equals(layoutParams.f18554a);
        }

        public final int hashCode() {
            return this.f18555b.hashCode() + (this.f18554a.hashCode() * 31);
        }

        @Override // android.view.ViewGroup.LayoutParams
        public final void setBaseAttributes(TypedArray typedArray, int i13, int i14) {
            ((ViewGroup.MarginLayoutParams) this).width = typedArray.getLayoutDimension(i13, -2);
            ((ViewGroup.MarginLayoutParams) this).height = typedArray.getLayoutDimension(i14, -2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            k kVar = k.f92935e;
            this.f18554a = kVar;
            this.f18555b = kVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.GridLayout_Layout);
            try {
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(f18542d, Integer.MIN_VALUE);
                ((ViewGroup.MarginLayoutParams) this).leftMargin = obtainStyledAttributes.getDimensionPixelSize(f18543e, dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) this).topMargin = obtainStyledAttributes.getDimensionPixelSize(f18544f, dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) this).rightMargin = obtainStyledAttributes.getDimensionPixelSize(f18545g, dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = obtainStyledAttributes.getDimensionPixelSize(f18546h, dimensionPixelSize);
                obtainStyledAttributes.recycle();
                obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.GridLayout_Layout);
                try {
                    int i13 = obtainStyledAttributes.getInt(f18553o, 0);
                    int i14 = obtainStyledAttributes.getInt(f18547i, Integer.MIN_VALUE);
                    int i15 = f18548j;
                    int i16 = f18541c;
                    this.f18555b = GridLayout.q(i14, obtainStyledAttributes.getInt(i15, i16), GridLayout.g(i13, true), obtainStyledAttributes.getFloat(f18549k, 0.0f));
                    this.f18554a = GridLayout.q(obtainStyledAttributes.getInt(f18550l, Integer.MIN_VALUE), obtainStyledAttributes.getInt(f18551m, i16), GridLayout.g(i13, false), obtainStyledAttributes.getFloat(f18552n, 0.0f));
                } finally {
                }
            } finally {
            }
        }
    }

    public GridLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
