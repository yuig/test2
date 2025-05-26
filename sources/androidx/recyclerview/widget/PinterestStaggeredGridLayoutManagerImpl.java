package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.recylerview.pinleveling.PinLevelerSavedState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Landroidx/recyclerview/widget/PinterestStaggeredGridLayoutManagerImpl;", "Landroidx/recyclerview/widget/PinterestStaggeredGridLayoutManager;", "androidx/recyclerview/widget/q1", "bk/f", "ItemSizeSpec", "LayoutParams", "androidx/recyclerview/widget/s1", "SavedState", "androidx/recyclerview/widget/u1", "framework-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PinterestStaggeredGridLayoutManagerImpl extends PinterestStaggeredGridLayoutManager {
    public final w0 A;
    public boolean B;
    public boolean C;
    public BitSet D;
    public int E;
    public int F;
    public final s1 G;
    public int H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f19171J;
    public SavedState K;
    public int L;
    public final Rect M;
    public final q1 N;
    public boolean O;
    public final boolean P;
    public int[] Q;
    public final androidx.activity.d R;
    public p1 S;
    public final float T;
    public final com.pinterest.recylerview.pinleveling.c U;

    /* renamed from: p, reason: collision with root package name */
    public final t0 f19172p;

    /* renamed from: q, reason: collision with root package name */
    public final nx.d0 f19173q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f19174r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f19175s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f19176t;

    /* renamed from: u, reason: collision with root package name */
    public int f19177u;

    /* renamed from: v, reason: collision with root package name */
    public u1[] f19178v;

    /* renamed from: w, reason: collision with root package name */
    public final l1 f19179w;

    /* renamed from: x, reason: collision with root package name */
    public final l1 f19180x;

    /* renamed from: y, reason: collision with root package name */
    public final int f19181y;

    /* renamed from: z, reason: collision with root package name */
    public int f19182z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/recyclerview/widget/PinterestStaggeredGridLayoutManagerImpl$ItemSizeSpec;", "Landroid/os/Parcelable;", "CREATOR", "androidx/recyclerview/widget/r1", "framework-ui_release"}, k = 1, mv = {1, 9, 0})
    @SuppressLint({"BanParcelableUsage"})
    public static final class ItemSizeSpec implements Parcelable {

        @NotNull
        public static final r1 CREATOR = new r1();

        /* renamed from: b, reason: collision with root package name */
        public int f19184b;

        /* renamed from: c, reason: collision with root package name */
        public int f19185c;

        /* renamed from: d, reason: collision with root package name */
        public int f19186d;

        /* renamed from: e, reason: collision with root package name */
        public int f19187e;

        /* renamed from: f, reason: collision with root package name */
        public int f19188f;

        /* renamed from: g, reason: collision with root package name */
        public int f19189g;

        /* renamed from: a, reason: collision with root package name */
        public String f19183a = "";

        /* renamed from: h, reason: collision with root package name */
        public int f19190h = -1;

        public final void a() {
            this.f19190h = -1;
            this.f19185c = 0;
            this.f19184b = 0;
            this.f19187e = 0;
            this.f19186d = 0;
            this.f19189g = 0;
            this.f19188f = 0;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i13) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f19183a);
            dest.writeInt(this.f19184b);
            dest.writeInt(this.f19185c);
            dest.writeInt(this.f19186d);
            dest.writeInt(this.f19187e);
            dest.writeInt(this.f19188f);
            dest.writeInt(this.f19189g);
            dest.writeInt(this.f19190h);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/recyclerview/widget/PinterestStaggeredGridLayoutManagerImpl$SavedState;", "Landroid/os/Parcelable;", "framework-ui_release"}, k = 1, mv = {1, 9, 0})
    @SuppressLint({"BanParcelableUsage"})
    public static final class SavedState implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SavedState> CREATOR = new t1();

        /* renamed from: a, reason: collision with root package name */
        public int f19204a;

        /* renamed from: b, reason: collision with root package name */
        public int f19205b;

        /* renamed from: c, reason: collision with root package name */
        public int f19206c;

        /* renamed from: d, reason: collision with root package name */
        public int[] f19207d;

        /* renamed from: e, reason: collision with root package name */
        public int f19208e;

        /* renamed from: f, reason: collision with root package name */
        public int[] f19209f;

        /* renamed from: g, reason: collision with root package name */
        public List f19210g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f19211h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f19212i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f19213j;

        /* renamed from: k, reason: collision with root package name */
        public PinLevelerSavedState f19214k;

        public SavedState(SavedState other) {
            Intrinsics.checkNotNullParameter(other, "other");
            this.f19214k = new PinLevelerSavedState();
            this.f19206c = other.f19206c;
            this.f19204a = other.f19204a;
            this.f19205b = other.f19205b;
            this.f19207d = other.f19207d;
            this.f19208e = other.f19208e;
            this.f19209f = other.f19209f;
            this.f19211h = other.f19211h;
            this.f19212i = other.f19212i;
            this.f19213j = other.f19213j;
            this.f19210g = other.f19210g;
            PinLevelerSavedState other2 = other.f19214k;
            Intrinsics.checkNotNullParameter(other2, "other");
            PinLevelerSavedState pinLevelerSavedState = new PinLevelerSavedState();
            pinLevelerSavedState.f50376a = other2.f50376a;
            pinLevelerSavedState.f50377b = other2.f50377b;
            pinLevelerSavedState.f50378c = other2.f50378c;
            pinLevelerSavedState.f50379d = other2.f50379d;
            this.f19214k = pinLevelerSavedState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i13) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f19204a);
            dest.writeInt(this.f19205b);
            dest.writeInt(this.f19206c);
            if (this.f19206c > 0) {
                dest.writeIntArray(this.f19207d);
            }
            dest.writeInt(this.f19208e);
            if (this.f19208e > 0) {
                dest.writeIntArray(this.f19209f);
            }
            dest.writeInt(this.f19211h ? 1 : 0);
            dest.writeInt(this.f19212i ? 1 : 0);
            dest.writeInt(this.f19213j ? 1 : 0);
            dest.writeList(this.f19210g);
            dest.writeParcelable(this.f19214k, i13);
        }
    }

    public PinterestStaggeredGridLayoutManagerImpl(t0 rvInfo, int i13, nx.d0 pinalytics, qq2.c pinLevelingPreferences) {
        Intrinsics.checkNotNullParameter(rvInfo, "rvInfo");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(pinLevelingPreferences, "pinLevelingPreferences");
        this.f19174r = true;
        this.f19175s = true;
        this.f19176t = true;
        this.f19177u = -1;
        this.f19178v = new u1[0];
        this.E = -1;
        this.F = Integer.MIN_VALUE;
        this.G = new s1();
        this.H = 2;
        this.M = new Rect();
        this.N = new q1(this);
        this.P = true;
        this.R = new androidx.activity.d(this, 12);
        this.f19181y = 1;
        h1(i13);
        this.A = new w0();
        l1 a13 = l1.a(this, 1);
        Intrinsics.checkNotNullExpressionValue(a13, "createOrientationHelper(...)");
        Intrinsics.checkNotNullParameter(a13, "<set-?>");
        this.f19179w = a13;
        l1 a14 = l1.a(this, 0);
        Intrinsics.checkNotNullExpressionValue(a14, "createOrientationHelper(...)");
        Intrinsics.checkNotNullParameter(a14, "<set-?>");
        this.f19180x = a14;
        this.f19172p = rvInfo;
        this.f19173q = pinalytics;
        this.T = 1.0f;
        this.U = new com.pinterest.recylerview.pinleveling.c(pinLevelingPreferences);
    }

    public static int R1(int i13, int i14, int i15) {
        if (i14 == 0 && i15 == 0) {
            return i13;
        }
        int mode = View.MeasureSpec.getMode(i13);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i13) - i14) - i15), mode) : i13;
    }

    @Override // androidx.recyclerview.widget.l2
    public final RecyclerView.LayoutParams A() {
        return this.f19181y == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.l2
    public final Parcelable A0() {
        int k13;
        int k14;
        int[] iArr;
        SavedState savedState = this.K;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState state = new SavedState();
        state.f19214k = new PinLevelerSavedState();
        state.f19211h = this.B;
        state.f19212i = this.I;
        state.f19213j = this.f19171J;
        s1 s1Var = this.G;
        if (s1Var == null || (iArr = s1Var.f19630a) == null) {
            state.f19208e = 0;
        } else {
            state.f19209f = iArr;
            Intrinsics.f(iArr);
            state.f19208e = iArr.length;
            state.f19210g = s1Var.f19631b;
        }
        if (E() > 0) {
            state.f19204a = this.I ? s1() : r1();
            View n13 = this.C ? n1(true) : o1(true);
            state.f19205b = n13 != null ? l2.Z(n13) : -1;
            int i13 = this.f19177u;
            state.f19206c = i13;
            state.f19207d = new int[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                if (this.I) {
                    u1 u1Var = this.f19178v[i14];
                    Intrinsics.f(u1Var);
                    k13 = u1Var.h(Integer.MIN_VALUE);
                    if (k13 != Integer.MIN_VALUE) {
                        k14 = t1().g();
                        k13 -= k14;
                        int[] iArr2 = state.f19207d;
                        Intrinsics.f(iArr2);
                        iArr2[i14] = k13;
                    } else {
                        int[] iArr22 = state.f19207d;
                        Intrinsics.f(iArr22);
                        iArr22[i14] = k13;
                    }
                } else {
                    u1 u1Var2 = this.f19178v[i14];
                    Intrinsics.f(u1Var2);
                    k13 = u1Var2.k(Integer.MIN_VALUE);
                    if (k13 != Integer.MIN_VALUE) {
                        k14 = t1().k();
                        k13 -= k14;
                        int[] iArr222 = state.f19207d;
                        Intrinsics.f(iArr222);
                        iArr222[i14] = k13;
                    } else {
                        int[] iArr2222 = state.f19207d;
                        Intrinsics.f(iArr2222);
                        iArr2222[i14] = k13;
                    }
                }
            }
        } else {
            state.f19204a = -1;
            state.f19205b = -1;
            state.f19206c = 0;
        }
        p1 p1Var = this.S;
        if (p1Var != null) {
            Intrinsics.checkNotNullParameter(state, "state");
            PinLevelerSavedState pinLevelerSavedState = state.f19214k;
            pinLevelerSavedState.f50377b = p1Var.f19553f;
            pinLevelerSavedState.f50376a = p1Var.f19554g;
            pinLevelerSavedState.f50378c = p1Var.f19557j;
            pinLevelerSavedState.f50379d = p1Var.f19558k;
        }
        return state;
    }

    public final boolean A1() {
        return Q() == 1;
    }

    @Override // androidx.recyclerview.widget.l2
    public final RecyclerView.LayoutParams B(Context c13, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(c13, "c");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        return new LayoutParams(c13, attrs);
    }

    @Override // androidx.recyclerview.widget.l2
    public final void B0(int i13) {
        if (i13 == 0) {
            i1();
        }
    }

    public final void B1(View view, int i13, int i14) {
        Rect rect = this.M;
        j(rect, view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl.LayoutParams");
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int R1 = R1(i13, ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + rect.right);
        int R12 = R1(i14, ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + rect.bottom);
        if (T0(view, R1, R12, layoutParams2)) {
            view.measure(R1, R12);
        }
    }

    @Override // androidx.recyclerview.widget.l2
    public final RecyclerView.LayoutParams C(ViewGroup.LayoutParams lp3) {
        Intrinsics.checkNotNullParameter(lp3, "lp");
        LayoutParams layoutParams = new LayoutParams(lp3);
        layoutParams.f19195i = 1;
        return layoutParams;
    }

    public final void C1(View child, LayoutParams lp3, boolean z13, String str) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(lp3, "lp");
        boolean z14 = lp3.f19192f;
        int i13 = this.f19181y;
        if (z14) {
            if (i13 == 1) {
                B1(child, this.L, l2.F(true, this.f19507o, this.f19505m, T() + Y(), ((ViewGroup.MarginLayoutParams) lp3).height));
            } else {
                B1(child, l2.F(true, this.f19506n, this.f19504l, U() + X(), ((ViewGroup.MarginLayoutParams) lp3).width), this.L);
            }
        } else if (i13 == 1) {
            B1(child, l2.F(false, this.f19182z * lp3.f19195i, this.f19504l, 0, ((ViewGroup.MarginLayoutParams) lp3).width), l2.F(true, this.f19507o, this.f19505m, T() + Y(), ((ViewGroup.MarginLayoutParams) lp3).height));
        } else {
            B1(child, l2.F(true, this.f19506n, this.f19504l, U() + X(), ((ViewGroup.MarginLayoutParams) lp3).width), l2.F(false, this.f19182z * lp3.f19195i, this.f19505m, 0, ((ViewGroup.MarginLayoutParams) lp3).height));
        }
        p1 p1Var = this.S;
        if (p1Var != null) {
            Intrinsics.checkNotNullParameter(child, "child");
            Intrinsics.checkNotNullParameter(lp3, "lp");
            if (str != null) {
                HashMap hashMap = p1Var.f19553f;
                ItemSizeSpec itemSizeSpec = (ItemSizeSpec) hashMap.get(str);
                if (itemSizeSpec == null || !Intrinsics.d(itemSizeSpec.f19183a, str)) {
                    itemSizeSpec = new ItemSizeSpec();
                    Intrinsics.checkNotNullParameter(str, "<set-?>");
                    itemSizeSpec.f19183a = str;
                }
                PinterestStaggeredGridLayoutManagerImpl pinterestStaggeredGridLayoutManagerImpl = p1Var.f19549b;
                if (z13) {
                    itemSizeSpec.a();
                    itemSizeSpec.f19184b = pinterestStaggeredGridLayoutManagerImpl.t1().c(child);
                    itemSizeSpec.f19185c = pinterestStaggeredGridLayoutManagerImpl.u1().c(child);
                } else {
                    itemSizeSpec.f19188f = pinterestStaggeredGridLayoutManagerImpl.t1().c(child);
                    int c13 = pinterestStaggeredGridLayoutManagerImpl.u1().c(child);
                    itemSizeSpec.f19189g = c13;
                    int i14 = itemSizeSpec.f19188f;
                    lp3.f19196j = c13;
                    lp3.f19197k = i14;
                }
                hashMap.put(itemSizeSpec.f19183a, itemSizeSpec);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0274, code lost:
    
        if (r16.C != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0284, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0286, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0282, code lost:
    
        if ((r12 < r1()) != r16.C) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:313:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D1(androidx.recyclerview.widget.q2 r17, androidx.recyclerview.widget.w2 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl.D1(androidx.recyclerview.widget.q2, androidx.recyclerview.widget.w2, boolean):void");
    }

    public final boolean E1(int i13) {
        if (this.f19181y == 0) {
            if ((i13 == -1) == this.C) {
                return false;
            }
        } else {
            if (((i13 == -1) == this.C) != A1()) {
                return false;
            }
        }
        return true;
    }

    public final void F1(int i13, w2 state) {
        int r13;
        int i14;
        Intrinsics.checkNotNullParameter(state, "state");
        if (i13 > 0) {
            r13 = s1();
            i14 = 1;
        } else {
            r13 = r1();
            i14 = -1;
        }
        w0 w0Var = this.A;
        w0Var.f19666a = true;
        P1(r13, state);
        N1(i14);
        w0Var.f19668c = r13 + w0Var.f19669d;
        w0Var.f19667b = Math.abs(i13);
    }

    public final void G1(q2 q2Var, w0 w0Var) {
        if (!w0Var.f19666a || w0Var.f19674i) {
            return;
        }
        if (w0Var.f19667b == 0) {
            if (w0Var.f19670e == -1) {
                H1(w0Var.f19672g, q2Var);
                return;
            } else {
                I1(w0Var.f19671f, q2Var);
                return;
            }
        }
        int i13 = 1;
        if (w0Var.f19670e == -1) {
            int i14 = w0Var.f19671f;
            u1 u1Var = this.f19178v[0];
            Intrinsics.f(u1Var);
            int k13 = u1Var.k(i14);
            int i15 = this.f19177u;
            while (i13 < i15) {
                u1 u1Var2 = this.f19178v[i13];
                Intrinsics.f(u1Var2);
                int k14 = u1Var2.k(i14);
                if (k14 > k13) {
                    k13 = k14;
                }
                i13++;
            }
            int i16 = i14 - k13;
            H1(i16 < 0 ? w0Var.f19672g : w0Var.f19672g - Math.min(i16, w0Var.f19667b), q2Var);
            return;
        }
        int i17 = w0Var.f19672g;
        u1 u1Var3 = this.f19178v[0];
        Intrinsics.f(u1Var3);
        int h10 = u1Var3.h(i17);
        int i18 = this.f19177u;
        while (i13 < i18) {
            u1 u1Var4 = this.f19178v[i13];
            Intrinsics.f(u1Var4);
            int h13 = u1Var4.h(i17);
            if (h13 < h10) {
                h10 = h13;
            }
            i13++;
        }
        int i19 = h10 - w0Var.f19672g;
        I1(i19 < 0 ? w0Var.f19671f : Math.min(i19, w0Var.f19667b) + w0Var.f19671f, q2Var);
    }

    public final void H1(int i13, q2 q2Var) {
        for (int E = E() - 1; E >= 0; E--) {
            View D = D(E);
            if (t1().e(D) < i13 || t1().o(D) < i13) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = D.getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl.LayoutParams");
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (layoutParams2.f19192f) {
                int i14 = this.f19177u;
                for (int i15 = 0; i15 < i14; i15++) {
                    u1 u1Var = this.f19178v[i15];
                    Intrinsics.f(u1Var);
                    if (u1Var.f19642b.size() == 1) {
                        return;
                    }
                }
                int i16 = this.f19177u;
                for (int i17 = 0; i17 < i16; i17++) {
                    u1 u1Var2 = this.f19178v[i17];
                    Intrinsics.f(u1Var2);
                    u1Var2.l();
                }
            } else {
                u1 u1Var3 = layoutParams2.f19191e;
                Intrinsics.f(u1Var3);
                int i18 = layoutParams2.f19195i;
                int i19 = u1Var3.f19641a;
                int i23 = i18 + i19;
                for (int i24 = i19; i24 < i23; i24++) {
                    u1 u1Var4 = this.f19178v[i24];
                    Intrinsics.f(u1Var4);
                    if (u1Var4.f19642b.size() == 1) {
                        return;
                    }
                }
                int i25 = layoutParams2.f19195i + i19;
                while (i19 < i25) {
                    u1 u1Var5 = this.f19178v[i19];
                    Intrinsics.f(u1Var5);
                    u1Var5.l();
                    i19++;
                }
            }
            F0(D, q2Var);
        }
    }

    public final void I1(int i13, q2 q2Var) {
        while (E() > 0) {
            View D = D(0);
            if (t1().b(D) > i13 || t1().n(D) > i13) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = D.getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl.LayoutParams");
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (layoutParams2.f19192f) {
                int i14 = this.f19177u;
                for (int i15 = 0; i15 < i14; i15++) {
                    u1 u1Var = this.f19178v[i15];
                    Intrinsics.f(u1Var);
                    if (u1Var.f19642b.size() == 1) {
                        return;
                    }
                }
                int i16 = this.f19177u;
                for (int i17 = 0; i17 < i16; i17++) {
                    u1 u1Var2 = this.f19178v[i17];
                    Intrinsics.f(u1Var2);
                    u1Var2.m();
                }
            } else {
                u1 u1Var3 = layoutParams2.f19191e;
                Intrinsics.f(u1Var3);
                int i18 = layoutParams2.f19195i;
                int i19 = u1Var3.f19641a;
                int i23 = i18 + i19;
                for (int i24 = i19; i24 < i23; i24++) {
                    u1 u1Var4 = this.f19178v[i24];
                    Intrinsics.f(u1Var4);
                    if (u1Var4.f19642b.size() == 1) {
                        return;
                    }
                }
                int i25 = layoutParams2.f19195i + i19;
                while (i19 < i25) {
                    u1 u1Var5 = this.f19178v[i19];
                    Intrinsics.f(u1Var5);
                    u1Var5.m();
                    i19++;
                }
            }
            F0(D, q2Var);
        }
    }

    public final void J1() {
        boolean z13 = true;
        if (this.f19181y == 1 || !A1()) {
            z13 = this.B;
        } else if (this.B) {
            z13 = false;
        }
        this.C = z13;
    }

    public final int K1(int i13, q2 recycler, w2 state) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        try {
            return L1(i13, recycler, state);
        } catch (Exception e13) {
            b(e13);
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.l2
    public final int L0(int i13, q2 recycler, w2 state) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        return K1(i13, recycler, state);
    }

    public final int L1(int i13, q2 recycler, w2 state) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        if (E() == 0 || i13 == 0) {
            return 0;
        }
        F1(i13, state);
        w0 w0Var = this.A;
        int m13 = m1(w0Var, recycler, state);
        if (w0Var.f19667b >= m13) {
            i13 = i13 < 0 ? -m13 : m13;
        }
        t1().p(-i13);
        this.I = this.C;
        w0Var.f19667b = 0;
        G1(recycler, w0Var);
        return i13;
    }

    @Override // androidx.recyclerview.widget.l2
    public final void M0(int i13) {
        SavedState savedState = this.K;
        if (savedState != null && savedState.f19204a != i13) {
            Intrinsics.f(savedState);
            savedState.f19207d = null;
            savedState.f19206c = 0;
            savedState.f19204a = -1;
            savedState.f19205b = -1;
        }
        this.E = i13;
        this.F = Integer.MIN_VALUE;
        J0();
    }

    public final void M1(List types) {
        Intrinsics.checkNotNullParameter(types, "types");
        p1 p1Var = this.S;
        if (p1Var != null) {
            Intrinsics.checkNotNullParameter(types, "types");
            p1Var.f19552e = new HashSet(types);
        }
    }

    @Override // androidx.recyclerview.widget.l2
    public final int N0(int i13, q2 recycler, w2 state) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        return K1(i13, recycler, state);
    }

    public final void N1(int i13) {
        w0 w0Var = this.A;
        w0Var.f19670e = i13;
        w0Var.f19669d = this.C != (i13 == -1) ? -1 : 1;
    }

    public final void O1(int i13, int i14) {
        int i15 = this.f19177u;
        for (int i16 = 0; i16 < i15; i16++) {
            u1 u1Var = this.f19178v[i16];
            Intrinsics.f(u1Var);
            if (!u1Var.f19642b.isEmpty()) {
                Q1(this.f19178v[i16], i13, i14);
            }
        }
    }

    public final void P1(int i13, w2 state) {
        int i14;
        int i15;
        int i16;
        Intrinsics.checkNotNullParameter(state, "state");
        w0 w0Var = this.A;
        boolean z13 = false;
        w0Var.f19667b = 0;
        w0Var.f19668c = i13;
        v2 v2Var = this.f19497e;
        if (!(v2Var != null && v2Var.d()) || (i16 = state.f19677a) == -1) {
            i14 = 0;
            i15 = 0;
        } else {
            if (this.C == (i16 < i13)) {
                i14 = t1().l();
                i15 = 0;
            } else {
                i15 = t1().l();
                i14 = 0;
            }
        }
        if (G()) {
            w0Var.f19671f = t1().k() - i15;
            w0Var.f19672g = t1().g() + i14;
        } else {
            w0Var.f19672g = t1().f() + i14;
            w0Var.f19671f = -i15;
        }
        w0Var.f19673h = false;
        w0Var.f19666a = true;
        if (t1().i() == 0 && t1().f() == 0) {
            z13 = true;
        }
        w0Var.f19674i = z13;
    }

    @Override // androidx.recyclerview.widget.l2
    public final void Q0(Rect childrenBounds, int i13, int i14) {
        int n13;
        int n14;
        Intrinsics.checkNotNullParameter(childrenBounds, "childrenBounds");
        int W = W() + V();
        int T = T() + Y();
        if (this.f19181y == 1) {
            n14 = l2.n(i14, childrenBounds.height() + T, R());
            n13 = l2.n(i13, (this.f19182z * this.f19177u) + W, S());
        } else {
            n13 = l2.n(i13, childrenBounds.width() + W, S());
            n14 = l2.n(i14, (this.f19182z * this.f19177u) + T, R());
        }
        this.f19494b.setMeasuredDimension(n13, n14);
    }

    public final void Q1(u1 u1Var, int i13, int i14) {
        Intrinsics.f(u1Var);
        int i15 = u1Var.f19645e;
        int i16 = u1Var.f19641a;
        if (i13 == -1) {
            int i17 = u1Var.f19643c;
            if (i17 == Integer.MIN_VALUE) {
                u1Var.c();
                i17 = u1Var.f19643c;
            }
            if (i17 + i15 <= i14) {
                BitSet bitSet = this.D;
                Intrinsics.f(bitSet);
                bitSet.set(i16, false);
                return;
            }
            return;
        }
        int i18 = u1Var.f19644d;
        if (i18 == Integer.MIN_VALUE) {
            u1Var.b();
            i18 = u1Var.f19644d;
        }
        if (i18 - i15 >= i14) {
            BitSet bitSet2 = this.D;
            Intrinsics.f(bitSet2);
            bitSet2.set(i16, false);
        }
    }

    @Override // androidx.recyclerview.widget.l2
    public final void S0(RecyclerView recyclerView) {
        super.S0(recyclerView);
        p1 p1Var = this.S;
        if (p1Var == null) {
            return;
        }
        p1Var.f19551d = recyclerView;
    }

    @Override // androidx.recyclerview.widget.l2
    public final void W0(RecyclerView recyclerView, w2 state, int i13) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(state, "state");
        m1 m1Var = new m1(1, recyclerView.getContext(), this);
        m1Var.h(i13);
        X0(m1Var);
    }

    @Override // androidx.recyclerview.widget.l2
    public final boolean Y0() {
        return this.K == null;
    }

    @Override // androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager
    public final void Z0() {
        int i13 = this.f19177u;
        for (int i14 = 0; i14 < i13; i14++) {
            u1 u1Var = this.f19178v[i14];
            Intrinsics.f(u1Var);
            u1Var.d();
            u1 u1Var2 = this.f19178v[i14];
            Intrinsics.f(u1Var2);
            u1Var2.f19643c = 0;
            u1Var2.f19644d = 0;
        }
        s1 s1Var = this.G;
        Intrinsics.f(s1Var);
        int[] iArr = s1Var.f19630a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        s1Var.f19631b = null;
        p1 p1Var = this.S;
        if (p1Var != null) {
            p1Var.g();
        }
        J0();
    }

    @Override // androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager
    public final void a1() {
        com.pinterest.recylerview.pinleveling.c cVar = this.U;
        cVar.f50382b = true;
        cVar.f50383c = 6;
    }

    @Override // androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager
    public final int[] b1(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f19177u];
        } else {
            int length = iArr.length;
            int i13 = this.f19177u;
            if (length < i13) {
                throw new IllegalArgumentException(a.a.f("Provided int[]'s size must be more than or equal to span count. Expected:", i13, ", array size:", iArr.length).toString());
            }
        }
        int i14 = this.f19177u;
        for (int i15 = 0; i15 < i14; i15++) {
            u1 u1Var = this.f19178v[i15];
            Intrinsics.f(u1Var);
            boolean z13 = u1Var.f19646f.B;
            ArrayList arrayList = u1Var.f19642b;
            iArr[i15] = z13 ? u1Var.g(arrayList.size() - 1, -1, true, false) : u1Var.g(0, arrayList.size(), true, false);
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.u0
    /* renamed from: c, reason: from getter */
    public final t0 getF19172p() {
        return this.f19172p;
    }

    @Override // androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager
    public final int[] c1(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f19177u];
        } else {
            int length = iArr.length;
            int i13 = this.f19177u;
            if (length < i13) {
                throw new IllegalArgumentException(a.a.f("Provided int[]'s size must be more than or equal to span count. Expected:", i13, ", array size:", iArr.length).toString());
            }
        }
        int i14 = this.f19177u;
        for (int i15 = 0; i15 < i14; i15++) {
            u1 u1Var = this.f19178v[i15];
            Intrinsics.f(u1Var);
            boolean z13 = u1Var.f19646f.B;
            ArrayList arrayList = u1Var.f19642b;
            iArr[i15] = z13 ? u1Var.g(0, arrayList.size(), true, false) : u1Var.g(arrayList.size() - 1, -1, true, false);
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.l2
    public final boolean d0() {
        return this.H != 0;
    }

    @Override // androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager
    /* renamed from: d1, reason: from getter */
    public final int getF19177u() {
        return this.f19177u;
    }

    @Override // androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager
    public final void e1(int i13, int i14) {
        SavedState savedState = this.K;
        if (savedState != null) {
            savedState.f19207d = null;
            savedState.f19206c = 0;
            savedState.f19204a = -1;
            savedState.f19205b = -1;
        }
        this.E = i13;
        this.F = i14;
        J0();
    }

    @Override // androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager
    public final void f1(int i13) {
        h(null);
        if (i13 == this.H) {
            return;
        }
        if (i13 != 0 && i13 != 2 && i13 != 10) {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS".toString());
        }
        if (i13 != 10) {
            this.S = null;
        } else if (this.f19177u != 2) {
            i13 = 0;
            Object[] args = new Object[0];
            Intrinsics.checkNotNullParameter("Pin leveling currently only supported in 2-column grids.", "message");
            Intrinsics.checkNotNullParameter(args, "args");
        } else {
            nx.d0 d0Var = this.f19173q;
            Intrinsics.f(d0Var);
            this.S = new p1(this.U, this, d0Var);
        }
        this.H = i13;
        J0();
    }

    @Override // androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager
    public final void g1() {
        this.f19176t = false;
    }

    @Override // androidx.recyclerview.widget.l2
    public final void h(String str) {
        if (this.K == null) {
            super.h(str);
        }
    }

    @Override // androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager
    public final void h1(int i13) {
        h(null);
        if (i13 != this.f19177u) {
            s1 s1Var = this.G;
            Intrinsics.f(s1Var);
            int[] iArr = s1Var.f19630a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            s1Var.f19631b = null;
            p1 p1Var = this.S;
            if (p1Var != null) {
                p1Var.g();
            }
            J0();
            this.f19177u = i13;
            this.D = new BitSet(this.f19177u);
            int i14 = this.f19177u;
            this.f19178v = new u1[i14];
            for (int i15 = 0; i15 < i14; i15++) {
                this.f19178v[i15] = new u1(this, i15);
            }
            if (this.f19177u != 2) {
                this.S = null;
            }
            J0();
        }
    }

    @Override // androidx.recyclerview.widget.l2
    public final void i0(int i13) {
        super.i0(i13);
        int i14 = this.f19177u;
        for (int i15 = 0; i15 < i14; i15++) {
            u1 u1Var = this.f19178v[i15];
            Intrinsics.f(u1Var);
            int i16 = u1Var.f19643c;
            if (i16 != Integer.MIN_VALUE) {
                u1Var.f19643c = i16 + i13;
            }
            int i17 = u1Var.f19644d;
            if (i17 != Integer.MIN_VALUE) {
                u1Var.f19644d = i17 + i13;
            }
        }
    }

    public final boolean i1() {
        int i13;
        int r13;
        int s13;
        if (E() == 0 || (i13 = this.H) == 0 || i13 == 10 || !this.f19499g) {
            return false;
        }
        if (this.C) {
            r13 = s1();
            s13 = r1();
        } else {
            r13 = r1();
            s13 = s1();
        }
        s1 s1Var = this.G;
        if (r13 == 0 && z1() != null) {
            p1 p1Var = this.S;
            if (p1Var != null) {
                p1Var.g();
            }
            Intrinsics.f(s1Var);
            int[] iArr = s1Var.f19630a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            s1Var.f19631b = null;
            this.f19498f = true;
            J0();
            return true;
        }
        if (!this.O) {
            return false;
        }
        int i14 = this.C ? -1 : 1;
        Intrinsics.f(s1Var);
        int i15 = s13 + 1;
        PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem d2 = s1Var.d(r13, i15, i14);
        if (d2 == null) {
            this.O = false;
            s1Var.c(i15);
            return false;
        }
        PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem d13 = s1Var.d(r13, d2.f19200a, i14 * (-1));
        if (d13 == null) {
            s1Var.c(d2.f19200a);
        } else {
            s1Var.c(d13.f19200a + 1);
        }
        this.f19498f = true;
        J0();
        return true;
    }

    @Override // androidx.recyclerview.widget.l2
    public final void j0(int i13) {
        super.j0(i13);
        int i14 = this.f19177u;
        for (int i15 = 0; i15 < i14; i15++) {
            u1 u1Var = this.f19178v[i15];
            Intrinsics.f(u1Var);
            int i16 = u1Var.f19643c;
            if (i16 != Integer.MIN_VALUE) {
                u1Var.f19643c = i16 + i13;
            }
            int i17 = u1Var.f19644d;
            if (i17 != Integer.MIN_VALUE) {
                u1Var.f19644d = i17 + i13;
            }
        }
    }

    public final int j1(w2 w2Var) {
        if (E() == 0) {
            return 0;
        }
        l1 t13 = t1();
        boolean z13 = this.P;
        return bs1.c.D(w2Var, t13, o1(!z13), n1(!z13), this, this.P);
    }

    @Override // androidx.recyclerview.widget.l2
    public final boolean k() {
        return this.f19175s && this.f19181y == 0;
    }

    public final int k1(w2 w2Var) {
        if (E() == 0) {
            return 0;
        }
        l1 t13 = t1();
        boolean z13 = this.P;
        return bs1.c.E(w2Var, t13, o1(!z13), n1(!z13), this, this.P, this.C);
    }

    @Override // androidx.recyclerview.widget.l2
    public final boolean l() {
        return this.f19174r && this.f19181y == 1;
    }

    public final int l1(w2 w2Var) {
        if (E() == 0) {
            return 0;
        }
        l1 t13 = t1();
        boolean z13 = this.P;
        return bs1.c.F(w2Var, t13, o1(!z13), n1(!z13), this, this.P);
    }

    @Override // androidx.recyclerview.widget.l2
    public final boolean m(RecyclerView.LayoutParams lp3) {
        Intrinsics.checkNotNullParameter(lp3, "lp");
        return lp3 instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.l2
    public final void m0(RecyclerView view, q2 recycler) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        RecyclerView recyclerView = this.f19494b;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(this.R);
        }
        int i13 = this.f19177u;
        for (int i14 = 0; i14 < i13; i14++) {
            u1 u1Var = this.f19178v[i14];
            Intrinsics.f(u1Var);
            u1Var.d();
        }
        view.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:285:0x09db, code lost:
    
        if (r10.f19195i > 1) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x016b, code lost:
    
        if (r25.intValue() != r14) goto L504;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0344 A[LOOP:4: B:121:0x0302->B:134:0x0344, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x035f A[EDGE_INSN: B:135:0x035f->B:136:0x035f BREAK  A[LOOP:4: B:121:0x0302->B:134:0x0344], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0450 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0a42  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m1(androidx.recyclerview.widget.w0 r50, androidx.recyclerview.widget.q2 r51, androidx.recyclerview.widget.w2 r52) {
        /*
            Method dump skipped, instructions count: 3050
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl.m1(androidx.recyclerview.widget.w0, androidx.recyclerview.widget.q2, androidx.recyclerview.widget.w2):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0045, code lost:
    
        if (r0 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0049, code lost:
    
        if (r0 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0053, code lost:
    
        if (A1() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x005d, code lost:
    
        if (A1() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
    
        if (java.lang.Thread.currentThread() == dl2.b.f55295d) goto L52;
     */
    @Override // androidx.recyclerview.widget.l2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View n0(android.view.View r11, int r12, androidx.recyclerview.widget.q2 r13, androidx.recyclerview.widget.w2 r14) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl.n0(android.view.View, int, androidx.recyclerview.widget.q2, androidx.recyclerview.widget.w2):android.view.View");
    }

    public final View n1(boolean z13) {
        int k13 = t1().k();
        int g13 = t1().g();
        View view = null;
        for (int E = E() - 1; -1 < E; E--) {
            View D = D(E);
            int e13 = t1().e(D);
            int b13 = t1().b(D);
            if (b13 > k13 && e13 < g13) {
                if (b13 <= g13 || !z13) {
                    return D;
                }
                if (view == null) {
                    view = D;
                }
            }
        }
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r6.length < r5.f19177u) goto L14;
     */
    @Override // androidx.recyclerview.widget.l2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(int r6, int r7, androidx.recyclerview.widget.w2 r8, g1.i r9) {
        /*
            r5 = this;
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "layoutPrefetchRegistry"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            int r0 = r5.f19181y
            if (r0 != 0) goto Lf
            goto L10
        Lf:
            r6 = r7
        L10:
            int r7 = r5.E()
            if (r7 == 0) goto L8f
            if (r6 != 0) goto L1a
            goto L8f
        L1a:
            r5.F1(r6, r8)
            int[] r6 = r5.Q
            if (r6 == 0) goto L29
            kotlin.jvm.internal.Intrinsics.f(r6)
            int r6 = r6.length
            int r7 = r5.f19177u
            if (r6 >= r7) goto L2f
        L29:
            int r6 = r5.f19177u
            int[] r6 = new int[r6]
            r5.Q = r6
        L2f:
            int r6 = r5.f19177u
            r7 = 0
            r0 = r7
            r1 = r0
        L34:
            androidx.recyclerview.widget.w0 r2 = r5.A
            if (r0 >= r6) goto L6c
            int r3 = r2.f19669d
            r4 = -1
            if (r3 != r4) goto L4e
            int r3 = r2.f19671f
            androidx.recyclerview.widget.u1[] r4 = r5.f19178v
            r4 = r4[r0]
            kotlin.jvm.internal.Intrinsics.f(r4)
            int r2 = r2.f19671f
            int r2 = r4.k(r2)
        L4c:
            int r3 = r3 - r2
            goto L5e
        L4e:
            androidx.recyclerview.widget.u1[] r3 = r5.f19178v
            r3 = r3[r0]
            kotlin.jvm.internal.Intrinsics.f(r3)
            int r4 = r2.f19672g
            int r3 = r3.h(r4)
            int r2 = r2.f19672g
            goto L4c
        L5e:
            if (r3 < 0) goto L69
            int[] r2 = r5.Q
            kotlin.jvm.internal.Intrinsics.f(r2)
            r2[r1] = r3
            int r1 = r1 + 1
        L69:
            int r0 = r0 + 1
            goto L34
        L6c:
            int[] r6 = r5.Q
            java.util.Arrays.sort(r6, r7, r1)
        L71:
            if (r7 >= r1) goto L8f
            boolean r6 = r2.a(r8)
            if (r6 == 0) goto L8f
            int r6 = r2.f19668c
            int[] r0 = r5.Q
            kotlin.jvm.internal.Intrinsics.f(r0)
            r0 = r0[r7]
            r9.b(r6, r0)
            int r6 = r2.f19668c
            int r0 = r2.f19669d
            int r6 = r6 + r0
            r2.f19668c = r6
            int r7 = r7 + 1
            goto L71
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl.o(int, int, androidx.recyclerview.widget.w2, g1.i):void");
    }

    @Override // androidx.recyclerview.widget.l2
    public final void o0(AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.o0(event);
        if (E() > 0) {
            View o13 = o1(false);
            View n13 = n1(false);
            if (o13 == null || n13 == null) {
                return;
            }
            int Z = l2.Z(o13);
            int Z2 = l2.Z(n13);
            if (Z < Z2) {
                event.setFromIndex(Z);
                event.setToIndex(Z2);
            } else {
                event.setFromIndex(Z2);
                event.setToIndex(Z);
            }
        }
    }

    public final View o1(boolean z13) {
        int k13 = t1().k();
        int g13 = t1().g();
        int E = E();
        View view = null;
        for (int i13 = 0; i13 < E; i13++) {
            View D = D(i13);
            int e13 = t1().e(D);
            if (t1().b(D) > k13 && e13 < g13) {
                if (e13 >= k13 || !z13) {
                    return D;
                }
                if (view == null) {
                    view = D;
                }
            }
        }
        return view;
    }

    public final void p1(q2 recycler, w2 state, boolean z13) {
        int g13;
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        int v13 = v1(Integer.MIN_VALUE);
        if (v13 != Integer.MIN_VALUE && (g13 = t1().g() - v13) > 0) {
            int i13 = g13 - (-K1(-g13, recycler, state));
            if (!z13 || i13 <= 0) {
                return;
            }
            t1().p(i13);
        }
    }

    @Override // androidx.recyclerview.widget.l2
    public final int q(w2 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return j1(state);
    }

    public final void q1(q2 recycler, w2 state, boolean z13) {
        int k13;
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        int w13 = w1(Integer.MAX_VALUE);
        if (w13 != Integer.MAX_VALUE && (k13 = w13 - t1().k()) > 0) {
            int K1 = k13 - K1(k13, recycler, state);
            if (!z13 || K1 <= 0) {
                return;
            }
            t1().p(-K1);
        }
    }

    @Override // androidx.recyclerview.widget.l2
    public final int r(w2 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return k1(state);
    }

    public final int r1() {
        if (E() == 0) {
            return 0;
        }
        View D = D(0);
        Intrinsics.f(D);
        return l2.Z(D);
    }

    @Override // androidx.recyclerview.widget.l2
    public final int s(w2 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return l1(state);
    }

    @Override // androidx.recyclerview.widget.l2
    public final void s0(RecyclerView recyclerView, int i13, int i14) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        y1(i13, i14, 1);
    }

    public final int s1() {
        int E = E();
        if (E == 0) {
            return 0;
        }
        View D = D(E - 1);
        Intrinsics.f(D);
        return l2.Z(D);
    }

    @Override // androidx.recyclerview.widget.l2
    public final int t(w2 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return j1(state);
    }

    @Override // androidx.recyclerview.widget.l2
    public final void t0(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        q2 q2Var = recyclerView.f19220c;
        if (q2Var != null) {
            q2Var.f19602a.clear();
            q2Var.j();
        }
        recyclerView.f19220c.c().b();
        p1 p1Var = this.S;
        if (p1Var != null) {
            p1Var.g();
        }
        s1 s1Var = this.G;
        Intrinsics.f(s1Var);
        int[] iArr = s1Var.f19630a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        s1Var.f19631b = null;
        J0();
    }

    public final l1 t1() {
        l1 l1Var = this.f19179w;
        if (l1Var != null) {
            return l1Var;
        }
        Intrinsics.r("mPrimaryOrientation");
        throw null;
    }

    @Override // androidx.recyclerview.widget.l2
    public final int u(w2 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return k1(state);
    }

    @Override // androidx.recyclerview.widget.l2
    public final void u0(RecyclerView recyclerView, int i13, int i14) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        y1(i13, i14, 8);
    }

    public final l1 u1() {
        l1 l1Var = this.f19180x;
        if (l1Var != null) {
            return l1Var;
        }
        Intrinsics.r("mSecondaryOrientation");
        throw null;
    }

    @Override // androidx.recyclerview.widget.l2
    public final int v(w2 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return l1(state);
    }

    @Override // androidx.recyclerview.widget.l2
    public final void v0(RecyclerView recyclerView, int i13, int i14) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        y1(i13, i14, 2);
    }

    public final int v1(int i13) {
        u1 u1Var = this.f19178v[0];
        Intrinsics.f(u1Var);
        int h10 = u1Var.h(i13);
        int i14 = this.f19177u;
        for (int i15 = 1; i15 < i14; i15++) {
            u1 u1Var2 = this.f19178v[i15];
            Intrinsics.f(u1Var2);
            int h13 = u1Var2.h(i13);
            if (h13 > h10) {
                h10 = h13;
            }
        }
        return h10;
    }

    @Override // androidx.recyclerview.widget.l2
    public final void w0(RecyclerView recyclerView, int i13, int i14) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        y1(i13, i14, 4);
    }

    public final int w1(int i13) {
        u1 u1Var = this.f19178v[0];
        Intrinsics.f(u1Var);
        int k13 = u1Var.k(i13);
        int i14 = this.f19177u;
        for (int i15 = 1; i15 < i14; i15++) {
            u1 u1Var2 = this.f19178v[i15];
            Intrinsics.f(u1Var2);
            int k14 = u1Var2.k(i13);
            if (k14 < k13) {
                k13 = k14;
            }
        }
        return k13;
    }

    @Override // androidx.recyclerview.widget.l2
    public final void x0(q2 recycler, w2 state) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        try {
            D1(recycler, state, true);
        } catch (Exception e13) {
            b(e13);
        }
    }

    public final u1 x1(w0 layoutState, LayoutParams layoutParams) {
        int i13;
        int i14;
        int i15;
        Intrinsics.checkNotNullParameter(layoutState, "layoutState");
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        boolean E1 = E1(layoutState.f19670e);
        int i16 = layoutParams.f19195i;
        int i17 = i16 > 1 ? (this.f19177u - i16) + 1 : this.f19177u;
        if (E1) {
            i14 = i17 - 1;
            i15 = -1;
            i13 = -1;
        } else {
            i13 = i17;
            i14 = 0;
            i15 = 1;
        }
        u1 u1Var = null;
        if (layoutState.f19670e == 1) {
            int k13 = t1().k();
            int i18 = Integer.MAX_VALUE;
            while (i14 != i13) {
                u1 u1Var2 = this.f19178v[i14];
                Intrinsics.f(u1Var2);
                int h10 = u1Var2.h(k13);
                if (h10 < i18) {
                    u1Var = u1Var2;
                    i18 = h10;
                }
                i14 += i15;
            }
        } else {
            int g13 = t1().g();
            int i19 = Integer.MIN_VALUE;
            while (i14 != i13) {
                u1 u1Var3 = this.f19178v[i14];
                Intrinsics.f(u1Var3);
                int k14 = u1Var3.k(g13);
                if (k14 > i19) {
                    u1Var = u1Var3;
                    i19 = k14;
                }
                i14 += i15;
            }
        }
        return u1Var;
    }

    @Override // androidx.recyclerview.widget.l2
    public final void y0(w2 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.E = -1;
        this.F = Integer.MIN_VALUE;
        this.K = null;
        this.N.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y1(int r8, int r9, int r10) {
        /*
            r7 = this;
            r0 = 4
            if (r10 != r0) goto L8
            boolean r0 = r7.f19176t
            if (r0 != 0) goto L8
            return
        L8:
            boolean r0 = r7.C
            if (r0 == 0) goto L11
            int r0 = r7.s1()
            goto L15
        L11:
            int r0 = r7.r1()
        L15:
            r1 = 8
            if (r10 != r1) goto L23
            if (r8 >= r9) goto L1f
            int r2 = r9 + 1
        L1d:
            r3 = r8
            goto L26
        L1f:
            int r2 = r8 + 1
            r3 = r9
            goto L26
        L23:
            int r2 = r8 + r9
            goto L1d
        L26:
            androidx.recyclerview.widget.s1 r4 = r7.G
            kotlin.jvm.internal.Intrinsics.f(r4)
            r4.g(r3)
            r5 = 1
            if (r10 == r5) goto L42
            r6 = 2
            if (r10 == r6) goto L3e
            if (r10 == r1) goto L37
            goto L45
        L37:
            r4.i(r8, r5)
            r4.h(r9, r5)
            goto L45
        L3e:
            r4.i(r8, r9)
            goto L45
        L42:
            r4.h(r8, r9)
        L45:
            if (r2 > r0) goto L48
            return
        L48:
            boolean r8 = r7.C
            if (r8 == 0) goto L51
            int r8 = r7.r1()
            goto L55
        L51:
            int r8 = r7.s1()
        L55:
            if (r3 > r8) goto L5a
            r7.J0()
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl.y1(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.l2
    public final void z0(Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof SavedState) {
            SavedState savedState = (SavedState) state;
            this.K = savedState;
            if (this.E != -1) {
                Intrinsics.f(savedState);
                savedState.f19207d = null;
                savedState.f19206c = 0;
                savedState.f19204a = -1;
                savedState.f19205b = -1;
                SavedState savedState2 = this.K;
                Intrinsics.f(savedState2);
                savedState2.f19207d = null;
                savedState2.f19206c = 0;
                savedState2.f19208e = 0;
                savedState2.f19209f = null;
                savedState2.f19210g = null;
            }
            J0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View z1() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl.z1():android.view.View");
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/recyclerview/widget/PinterestStaggeredGridLayoutManagerImpl$LayoutParams;", "Landroidx/recyclerview/widget/PinterestStaggeredGridLayoutManager$LayoutParams;", "Landroid/content/Context;", "c", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "framework-ui_release"}, k = 1, mv = {1, 9, 0})
    public static final class LayoutParams extends PinterestStaggeredGridLayoutManager.LayoutParams {

        /* renamed from: e, reason: collision with root package name */
        public u1 f19191e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f19192f;

        /* renamed from: g, reason: collision with root package name */
        public int f19193g;

        /* renamed from: h, reason: collision with root package name */
        public int f19194h;

        /* renamed from: i, reason: collision with root package name */
        public int f19195i;

        /* renamed from: j, reason: collision with root package name */
        public int f19196j;

        /* renamed from: k, reason: collision with root package name */
        public int f19197k;

        /* renamed from: l, reason: collision with root package name */
        public int f19198l;

        /* renamed from: m, reason: collision with root package name */
        public int f19199m;

        public LayoutParams(int i13, int i14) {
            super(i13, i14);
            this.f19195i = 1;
        }

        @Override // androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager.LayoutParams
        public final int b() {
            Rect rect = this.f19269b;
            if (rect != null) {
                return rect.bottom;
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager.LayoutParams
        public final int c() {
            Rect rect = this.f19269b;
            if (rect != null) {
                return rect.top;
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager.LayoutParams
        /* renamed from: d, reason: from getter */
        public final int getF19199m() {
            return this.f19199m;
        }

        @Override // androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager.LayoutParams
        public final int e() {
            int i13 = this.f19199m;
            if (i13 > 0 && this.f19198l > 0) {
                return i13;
            }
            int i14 = this.f19197k;
            if (i14 <= 0 || this.f19196j <= 0) {
                return 0;
            }
            return i14;
        }

        @Override // androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager.LayoutParams
        public final View f() {
            ArrayList arrayList;
            u1 u1Var = this.f19191e;
            if (u1Var == null || (arrayList = u1Var.f19642b) == null) {
                return null;
            }
            return (View) CollectionsKt.d0(arrayList);
        }

        @Override // androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager.LayoutParams
        /* renamed from: g, reason: from getter */
        public final int getF19194h() {
            return this.f19194h;
        }

        @Override // androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager.LayoutParams
        /* renamed from: h, reason: from getter */
        public final int getF19193g() {
            return this.f19193g;
        }

        @Override // androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager.LayoutParams
        public final int i() {
            u1 u1Var = this.f19191e;
            if (u1Var == null) {
                return -1;
            }
            Intrinsics.f(u1Var);
            return u1Var.f19641a;
        }

        @Override // androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager.LayoutParams
        /* renamed from: j, reason: from getter */
        public final boolean getF19192f() {
            return this.f19192f;
        }

        @Override // androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager.LayoutParams
        public final void k() {
            this.f19192f = true;
            this.f19195i = -1;
        }

        @Override // androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager.LayoutParams
        public final void l(int i13) {
            this.f19195i = i13;
        }

        public final void m(ItemSizeSpec itemSizeSpec) {
            if (itemSizeSpec == null) {
                this.f19193g = 0;
                this.f19194h = 0;
                this.f19198l = 0;
                this.f19199m = 0;
                this.f19196j = 0;
                this.f19197k = 0;
                return;
            }
            this.f19194h = itemSizeSpec.f19184b;
            this.f19193g = itemSizeSpec.f19185c;
            this.f19199m = itemSizeSpec.f19186d;
            this.f19198l = itemSizeSpec.f19187e;
            this.f19197k = itemSizeSpec.f19188f;
            this.f19196j = itemSizeSpec.f19189g;
        }

        public final String toString() {
            return df.j1.U("w %d, h %d, ew %d, eh %d, aw %d, ah %d", new Object[]{Integer.valueOf(this.f19193g), Integer.valueOf(this.f19194h), Integer.valueOf(this.f19198l), Integer.valueOf(this.f19199m), Integer.valueOf(this.f19196j), Integer.valueOf(this.f19197k)});
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f19195i = 1;
        }
    }
}
