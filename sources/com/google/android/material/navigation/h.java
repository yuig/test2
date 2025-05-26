package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.y1;
import androidx.transition.AutoTransition;
import com.google.android.material.internal.b0;
import java.util.HashSet;
import java.util.WeakHashMap;
import n.c0;
import n.o;
import n.q;
import q5.v0;

/* loaded from: classes3.dex */
public abstract class h extends ViewGroup implements c0 {
    public static final int[] E = {R.attr.state_checked};
    public static final int[] F = {-16842910};
    public boolean A;
    public ColorStateList B;
    public j C;
    public o D;

    /* renamed from: a, reason: collision with root package name */
    public final AutoTransition f32878a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.appcompat.app.c f32879b;

    /* renamed from: c, reason: collision with root package name */
    public final p5.e f32880c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f32881d;

    /* renamed from: e, reason: collision with root package name */
    public int f32882e;

    /* renamed from: f, reason: collision with root package name */
    public f[] f32883f;

    /* renamed from: g, reason: collision with root package name */
    public int f32884g;

    /* renamed from: h, reason: collision with root package name */
    public int f32885h;

    /* renamed from: i, reason: collision with root package name */
    public ColorStateList f32886i;

    /* renamed from: j, reason: collision with root package name */
    public int f32887j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f32888k;

    /* renamed from: l, reason: collision with root package name */
    public final ColorStateList f32889l;

    /* renamed from: m, reason: collision with root package name */
    public int f32890m;

    /* renamed from: n, reason: collision with root package name */
    public int f32891n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f32892o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f32893p;

    /* renamed from: q, reason: collision with root package name */
    public int f32894q;

    /* renamed from: r, reason: collision with root package name */
    public final SparseArray f32895r;

    /* renamed from: s, reason: collision with root package name */
    public int f32896s;

    /* renamed from: t, reason: collision with root package name */
    public int f32897t;

    /* renamed from: u, reason: collision with root package name */
    public int f32898u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f32899v;

    /* renamed from: w, reason: collision with root package name */
    public int f32900w;

    /* renamed from: x, reason: collision with root package name */
    public int f32901x;

    /* renamed from: y, reason: collision with root package name */
    public int f32902y;

    /* renamed from: z, reason: collision with root package name */
    public bk.o f32903z;

    public h(Context context) {
        super(context);
        this.f32880c = new p5.e(5);
        this.f32881d = new SparseArray(5);
        this.f32884g = 0;
        this.f32885h = 0;
        this.f32895r = new SparseArray(5);
        this.f32896s = -1;
        this.f32897t = -1;
        this.f32898u = -1;
        this.A = false;
        this.f32889l = c();
        if (isInEditMode()) {
            this.f32878a = null;
        } else {
            AutoTransition autoTransition = new AutoTransition();
            this.f32878a = autoTransition;
            autoTransition.X(0);
            autoTransition.M(tb.f.c0(getContext(), fj.c.motionDurationMedium4, getResources().getInteger(fj.h.material_motion_duration_long_1)));
            autoTransition.O(tb.f.d0(getContext(), fj.c.motionEasingStandard, gj.a.f65168b));
            autoTransition.U(new b0());
        }
        this.f32879b = new androidx.appcompat.app.c(this, 7);
        WeakHashMap weakHashMap = v0.f102521a;
        setImportantForAccessibility(1);
    }

    public static boolean f(int i13, int i14) {
        if (i13 == -1) {
            if (i14 <= 3) {
                return false;
            }
        } else if (i13 != 0) {
            return false;
        }
        return true;
    }

    @Override // n.c0
    public final void a(o oVar) {
        this.D = oVar;
    }

    public final void b() {
        SparseArray sparseArray;
        Drawable drawable;
        hj.a aVar;
        Drawable drawable2;
        removeAllViews();
        f[] fVarArr = this.f32883f;
        p5.e eVar = this.f32880c;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                if (fVar != null) {
                    eVar.a(fVar);
                    if (fVar.E != null) {
                        ImageView imageView = fVar.f32864n;
                        if (imageView != null) {
                            fVar.setClipChildren(true);
                            fVar.setClipToPadding(true);
                            hj.a aVar2 = fVar.E;
                            if (aVar2 != null) {
                                if (aVar2.c() != null) {
                                    aVar2.c().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(aVar2);
                                }
                            }
                        }
                        fVar.E = null;
                    }
                    fVar.f32869s = null;
                    fVar.f32875y = 0.0f;
                    fVar.f32851a = false;
                }
            }
        }
        if (this.D.f88653f.size() == 0) {
            this.f32884g = 0;
            this.f32885h = 0;
            this.f32883f = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i13 = 0; i13 < this.D.f88653f.size(); i13++) {
            hashSet.add(Integer.valueOf(this.D.getItem(i13).getItemId()));
        }
        int i14 = 0;
        while (true) {
            sparseArray = this.f32895r;
            if (i14 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i14);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                sparseArray.delete(keyAt);
            }
            i14++;
        }
        this.f32883f = new f[this.D.f88653f.size()];
        boolean f13 = f(this.f32882e, this.D.m().size());
        for (int i15 = 0; i15 < this.D.f88653f.size(); i15++) {
            this.C.f32905b = true;
            this.D.getItem(i15).setCheckable(true);
            this.C.f32905b = false;
            f fVar2 = (f) eVar.b();
            if (fVar2 == null) {
                fVar2 = e(getContext());
            }
            this.f32883f[i15] = fVar2;
            ColorStateList colorStateList = this.f32886i;
            fVar2.f32870t = colorStateList;
            if (fVar2.f32869s != null && (drawable2 = fVar2.f32872v) != null) {
                drawable2.setTintList(colorStateList);
                fVar2.f32872v.invalidateSelf();
            }
            int i16 = this.f32887j;
            ImageView imageView2 = fVar2.f32864n;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView2.getLayoutParams();
            layoutParams.width = i16;
            layoutParams.height = i16;
            imageView2.setLayoutParams(layoutParams);
            fVar2.m(this.f32889l);
            int i17 = this.f32890m;
            TextView textView = fVar2.f32866p;
            f.l(textView, i17);
            float textSize = textView.getTextSize();
            TextView textView2 = fVar2.f32867q;
            fVar2.a(textSize, textView2.getTextSize());
            fVar2.k(this.f32891n);
            boolean z13 = this.f32892o;
            fVar2.k(fVar2.f32868r);
            textView2.setTypeface(textView2.getTypeface(), z13 ? 1 : 0);
            fVar2.m(this.f32888k);
            int i18 = this.f32896s;
            if (i18 != -1 && fVar2.f32854d != i18) {
                fVar2.f32854d = i18;
                fVar2.c();
            }
            int i19 = this.f32897t;
            if (i19 != -1 && fVar2.f32855e != i19) {
                fVar2.f32855e = i19;
                fVar2.c();
            }
            int i23 = this.f32898u;
            if (i23 != -1 && fVar2.f32856f != i23) {
                fVar2.f32856f = i23;
                fVar2.c();
            }
            fVar2.A = this.f32900w;
            fVar2.p(fVar2.getWidth());
            fVar2.B = this.f32901x;
            fVar2.p(fVar2.getWidth());
            fVar2.D = this.f32902y;
            fVar2.p(fVar2.getWidth());
            bk.i d2 = d();
            View view = fVar2.f32863m;
            if (view != null) {
                view.setBackgroundDrawable(d2);
                fVar2.d();
            }
            fVar2.C = this.A;
            boolean z14 = this.f32899v;
            fVar2.f32876z = z14;
            fVar2.d();
            if (view != null) {
                view.setVisibility(z14 ? 0 : 8);
                fVar2.requestLayout();
            }
            int i24 = this.f32894q;
            if (i24 == 0) {
                drawable = null;
            } else {
                Context context = fVar2.getContext();
                Object obj = d5.a.f53679a;
                drawable = context.getDrawable(i24);
            }
            if (drawable != null && drawable.getConstantState() != null) {
                drawable = drawable.getConstantState().newDrawable().mutate();
            }
            fVar2.f32853c = drawable;
            fVar2.d();
            fVar2.f32852b = this.f32893p;
            fVar2.d();
            if (fVar2.f32861k != f13) {
                fVar2.f32861k = f13;
                fVar2.c();
            }
            fVar2.j(this.f32882e);
            q qVar = (q) this.D.getItem(i15);
            fVar2.e(qVar);
            SparseArray sparseArray2 = this.f32881d;
            int i25 = qVar.f88675a;
            fVar2.setOnTouchListener((View.OnTouchListener) sparseArray2.get(i25));
            fVar2.setOnClickListener(this.f32879b);
            int i26 = this.f32884g;
            if (i26 != 0 && i25 == i26) {
                this.f32885h = i15;
            }
            int id3 = fVar2.getId();
            if (id3 != -1 && (aVar = (hj.a) sparseArray.get(id3)) != null) {
                fVar2.h(aVar);
            }
            addView(fVar2);
        }
        int min = Math.min(this.D.f88653f.size() - 1, this.f32885h);
        this.f32885h = min;
        this.D.getItem(min).setChecked(true);
    }

    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList b13 = d5.a.b(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(i.a.colorPrimary, typedValue, true)) {
            return null;
        }
        int i13 = typedValue.data;
        int defaultColor = b13.getDefaultColor();
        int[] iArr = F;
        return new ColorStateList(new int[][]{iArr, E, ViewGroup.EMPTY_STATE_SET}, new int[]{b13.getColorForState(iArr, defaultColor), i13, defaultColor});
    }

    public final bk.i d() {
        if (this.f32903z == null || this.B == null) {
            return null;
        }
        bk.i iVar = new bk.i(this.f32903z);
        iVar.t(this.B);
        return iVar;
    }

    public abstract jj.a e(Context context);

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) y1.i(1, this.D.m().size(), 1).f19715a);
    }
}
