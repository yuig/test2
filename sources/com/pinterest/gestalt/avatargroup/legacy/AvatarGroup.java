package com.pinterest.gestalt.avatargroup.legacy;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.avatar.LegacyGestaltAvatar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import rl1.k0;
import sl1.w;
import tl1.a;
import tl1.b;
import tl1.c;
import tl1.f;
import tl1.g;
import tl1.h;
import tl1.i;
import tl1.j;
import tl1.k;
import we1.a2;
import xk2.d;
import xk2.m;
import xk2.n;
import yn2.c0;

@d
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/gestalt/avatargroup/legacy/AvatarGroup;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "avatarGroup_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AvatarGroup extends ViewGroup {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f49259w = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f49260a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f49261b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f49262c;

    /* renamed from: d, reason: collision with root package name */
    public k f49263d;

    /* renamed from: e, reason: collision with root package name */
    public int f49264e;

    /* renamed from: f, reason: collision with root package name */
    public int f49265f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f49266g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f49267h;

    /* renamed from: i, reason: collision with root package name */
    public int f49268i;

    /* renamed from: j, reason: collision with root package name */
    public int f49269j;

    /* renamed from: k, reason: collision with root package name */
    public int f49270k;

    /* renamed from: l, reason: collision with root package name */
    public int f49271l;

    /* renamed from: m, reason: collision with root package name */
    public Function2 f49272m;

    /* renamed from: n, reason: collision with root package name */
    public int f49273n;

    /* renamed from: o, reason: collision with root package name */
    public float f49274o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f49275p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f49276q;

    /* renamed from: r, reason: collision with root package name */
    public int f49277r;

    /* renamed from: s, reason: collision with root package name */
    public i f49278s;

    /* renamed from: t, reason: collision with root package name */
    public int f49279t;

    /* renamed from: u, reason: collision with root package name */
    public final xk2.k f49280u;

    /* renamed from: v, reason: collision with root package name */
    public final xk2.k f49281v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarGroup(Context context, tl1.d viewModel) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.f49260a = new ArrayList();
        this.f49263d = k.StartBelow;
        this.f49265f = 6;
        this.f49268i = -1;
        this.f49269j = -1;
        this.f49270k = -1;
        int i13 = g.f118090a;
        this.f49272m = f.f118089i;
        this.f49273n = -1;
        this.f49274o = 0.33f;
        this.f49275p = true;
        this.f49278s = h.f118094b;
        this.f49279t = -1;
        n nVar = n.NONE;
        this.f49280u = m.a(nVar, new c(this, 1));
        this.f49281v = m.a(nVar, new c(this, 0));
        a(this.f49265f);
        this.f49261b = c(d());
        this.f49262c = b(d());
        l(new tl1.d(null, null, null, 0, 0.0f, null, false, false, false, 1023), false);
        l(viewModel, true);
    }

    public final void a(int i13) {
        ArrayList arrayList = this.f49260a;
        if (arrayList.size() >= i13) {
            return;
        }
        int i14 = this.f49273n;
        if (i14 == -1) {
            i14 = d();
        }
        IntRange intRange = new IntRange(arrayList.size(), i13 - 1, 1);
        ArrayList arrayList2 = new ArrayList(g0.q(intRange, 10));
        ql2.k it = intRange.iterator();
        while (it.f104109c) {
            it.b();
            int i15 = LegacyGestaltAvatar.K;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Intrinsics.checkNotNullParameter(context, "context");
            List list = rl1.n.f108641a;
            Intrinsics.checkNotNullParameter(context, "context");
            LegacyGestaltAvatar legacyGestaltAvatar = new LegacyGestaltAvatar(context, rl1.n.b(context, k0.LegoAvatar));
            legacyGestaltAvatar.setLayoutParams(new ViewGroup.MarginLayoutParams(i14, i14));
            legacyGestaltAvatar.f49250J.r(i14);
            legacyGestaltAvatar.setScaleType(ImageView.ScaleType.CENTER_CROP);
            legacyGestaltAvatar.setImportantForAccessibility(2);
            legacyGestaltAvatar.setFocusable(false);
            addView(legacyGestaltAvatar);
            arrayList2.add(legacyGestaltAvatar);
        }
        arrayList.addAll(arrayList2);
    }

    public final ImageView b(int i13) {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.MarginLayoutParams(i13, i13));
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        if (this.f49275p && bs1.c.l1(this)) {
            addView(imageView, 0);
        } else {
            addView(imageView);
        }
        return imageView;
    }

    public final TextView c(int i13) {
        TextView textView = new TextView(getContext());
        textView.setLayoutParams(new ViewGroup.MarginLayoutParams(i13, i13));
        textView.setMaxLines(1);
        textView.setGravity(17);
        addView(textView);
        return textView;
    }

    public final int d() {
        return (((Number) this.f49281v.getValue()).intValue() * 2) + ((Number) this.f49280u.getValue()).intValue();
    }

    public final void e(Context context, AttributeSet attributeSet) {
        k kVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.AvatarGroup);
            Intrinsics.f(obtainStyledAttributes);
            a aVar = new a(obtainStyledAttributes.getDimensionPixelSize(w.AvatarGroup_avatar_chip_size, ((Number) this.f49280u.getValue()).intValue()), obtainStyledAttributes.getResourceId(w.AvatarGroup_avatar_chip_border_color, g.f118090a), obtainStyledAttributes.getDimensionPixelSize(w.AvatarGroup_avatar_chip_border_width, ((Number) this.f49281v.getValue()).intValue()));
            int integer = obtainStyledAttributes.getInteger(w.AvatarGroup_max_num_chips, 6);
            float f13 = obtainStyledAttributes.getFloat(w.AvatarGroup_chip_overlap_percentage, 0.33f);
            j jVar = k.Companion;
            int i13 = w.AvatarGroup_chip_overlap_style;
            k kVar2 = k.StartBelow;
            int integer2 = obtainStyledAttributes.getInteger(i13, kVar2.ordinal());
            jVar.getClass();
            Intrinsics.checkNotNullParameter(kVar2, "default");
            k[] values = k.values();
            int length = values.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    kVar = null;
                    break;
                }
                kVar = values[i14];
                if (kVar.ordinal() == integer2) {
                    break;
                } else {
                    i14++;
                }
            }
            l(new tl1.d(aVar, null, null, integer, f13, kVar == null ? kVar2 : kVar, obtainStyledAttributes.getBoolean(w.AvatarGroup_show_overflow_chip, false), obtainStyledAttributes.getBoolean(w.AvatarGroup_show_icon_chip, false), obtainStyledAttributes.getBoolean(w.AvatarGroup_avatar_supports_rtl, true), RecyclerViewTypes.VIEW_TYPE_PRODUCT_FILTER_DIVIDER), false);
            obtainStyledAttributes.recycle();
        }
    }

    public final boolean f() {
        return this.f49267h && bs1.c.o1(this.f49262c);
    }

    public final boolean g() {
        return this.f49266g && bs1.c.o1(this.f49261b);
    }

    @Override // android.view.View
    public final int getBaseline() {
        return getMeasuredHeight() - this.f49269j;
    }

    public final void h(int i13, int i14) {
        boolean z13 = false;
        int i15 = 0;
        for (Object obj : this.f49260a) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                f0.p();
                throw null;
            }
            LegacyGestaltAvatar legacyGestaltAvatar = (LegacyGestaltAvatar) obj;
            if (i15 < i13) {
                bs1.c.U1(legacyGestaltAvatar);
            } else {
                bs1.c.b1(legacyGestaltAvatar);
            }
            i15 = i16;
        }
        int i17 = i14 - i13;
        Function2 function2 = this.f49272m;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        CharSequence charSequence = (CharSequence) function2.invoke(resources, Integer.valueOf(i17));
        TextView textView = this.f49261b;
        textView.setText(charSequence);
        if (this.f49266g && i17 > 0) {
            z13 = true;
        }
        bs1.c.R1(textView, z13);
    }

    public final void i(int i13, int i14, List imageUrls) {
        Object obj;
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        boolean isEmpty = imageUrls.isEmpty();
        ArrayList arrayList = this.f49260a;
        if (isEmpty) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                bs1.c.b1((LegacyGestaltAvatar) it.next());
            }
            bs1.c.b1(this.f49261b);
            bs1.c.b1(this.f49262c);
            return;
        }
        this.f49264e = i13;
        Iterator it2 = CollectionsKt.N0(CollectionsKt.y0(arrayList, i14), imageUrls).iterator();
        int i15 = 0;
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            LegacyGestaltAvatar legacyGestaltAvatar = (LegacyGestaltAvatar) pair.f80346a;
            String imageUrl = (String) pair.f80347b;
            i15++;
            legacyGestaltAvatar.setId(i15);
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            legacyGestaltAvatar.f49250J.q(imageUrl);
        }
        h(i15, this.f49264e);
        if (f()) {
            int i16 = this.f49279t;
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            } else {
                obj = listIterator.previous();
                if (bs1.c.o1((LegacyGestaltAvatar) obj)) {
                    break;
                }
            }
        }
        LegacyGestaltAvatar legacyGestaltAvatar2 = (LegacyGestaltAvatar) obj;
        if (legacyGestaltAvatar2 != null) {
            legacyGestaltAvatar2.setId(this.f49278s.f118095a);
        }
        requestLayout();
    }

    public final void j(int i13, List imageUrls) {
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        i(i13, this.f49265f, imageUrls);
    }

    public final void k() {
        int i13 = this.f49268i;
        this.f49273n = (this.f49269j * 2) + i13;
        this.f49277r = (int) (this.f49274o * i13);
        Iterator it = this.f49260a.iterator();
        while (it.hasNext()) {
            LegacyGestaltAvatar legacyGestaltAvatar = (LegacyGestaltAvatar) it.next();
            legacyGestaltAvatar.f49250J.r(this.f49273n);
            legacyGestaltAvatar.f49250J.p(this.f49269j);
        }
        TextView textView = this.f49261b;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i14 = this.f49273n;
        layoutParams.width = i14;
        layoutParams.height = i14;
        textView.setLayoutParams(layoutParams);
        ImageView imageView = this.f49262c;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i15 = this.f49273n;
        layoutParams2.width = i15;
        layoutParams2.height = i15;
        imageView.setLayoutParams(layoutParams2);
    }

    public final void l(tl1.d viewModel, boolean z13) {
        Drawable drawable;
        List q03;
        k kVar;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.f49278s = viewModel.f118086i;
        this.f49275p = viewModel.f118087j;
        int i13 = this.f49265f;
        int i14 = viewModel.f118081d;
        if (i13 != i14) {
            this.f49265f = i14;
            a(i14);
            h(this.f49265f, this.f49264e);
        }
        a aVar = viewModel.f118078a;
        int i15 = aVar.f118071a;
        if (i15 == -1) {
            i15 = ((Number) this.f49280u.getValue()).intValue();
        }
        if (this.f49268i != i15) {
            this.f49268i = i15;
            k();
        }
        int i16 = aVar.f118073c;
        if (i16 == -1) {
            i16 = ((Number) this.f49281v.getValue()).intValue();
        }
        if (this.f49269j != i16) {
            this.f49269j = i16;
            k();
        }
        int i17 = aVar.f118072b;
        if (i17 == -1) {
            i17 = g.f118090a;
        }
        if (this.f49270k != i17) {
            this.f49270k = i17;
            int B = bs1.c.B(this, i17);
            if (this.f49271l != B) {
                this.f49271l = B;
                Iterator it = this.f49260a.iterator();
                while (it.hasNext()) {
                    ((LegacyGestaltAvatar) it.next()).f49250J.o(this.f49271l);
                }
            }
        }
        tl1.n viewModel2 = viewModel.f118079b;
        Intrinsics.checkNotNullParameter(viewModel2, "viewModel");
        this.f49272m = viewModel2.f118106a;
        TextView textView = this.f49261b;
        textView.setBackgroundResource(viewModel2.f118109d);
        textView.setTextColor(bs1.c.B(textView, viewModel2.f118108c));
        boolean z14 = false;
        textView.setTextSize(0, textView.getResources().getDimension(viewModel2.f118110e));
        int i18 = b.f118075b[viewModel2.f118107b.ordinal()];
        if (i18 == 1) {
            dl2.b.A2(textView);
        } else if (i18 == 2) {
            dl2.b.C2(textView);
        }
        textView.setOnClickListener(new a2(viewModel2, 22));
        tl1.m mVar = viewModel.f118080c;
        int i19 = mVar.f118102d;
        ImageView imageView = this.f49262c;
        int W = bs1.c.W(imageView, i19);
        imageView.setPadding(W, W, W, W);
        imageView.setBackgroundResource(mVar.f118099a);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        Object obj = d5.a.f53679a;
        Drawable drawable2 = context.getDrawable(mVar.f118100b);
        Intrinsics.checkNotNullParameter(context, "context");
        if (drawable2 != null) {
            int i23 = mVar.f118101c;
            int color = i23 == 0 ? context.getColor(df0.a.f54892a) : context.getColor(i23);
            Intrinsics.checkNotNullParameter(context, "context");
            if (color == 0) {
                color = context.getColor(df0.a.f54892a);
            }
            drawable = drawable2.mutate();
            drawable.setTint(color);
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        imageView.setOnClickListener(new a2(mVar, 23));
        Resources resources = imageView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        imageView.setContentDescription((CharSequence) mVar.f118104f.invoke(resources));
        this.f49279t = (this.f49275p && bs1.c.l1(this)) ? 0 : mVar.f118103e;
        float f13 = this.f49274o;
        float f14 = viewModel.f118082e;
        if (f13 != f14) {
            this.f49274o = f14;
            k();
        }
        boolean z15 = viewModel.f118084g;
        this.f49266g = z15;
        bs1.c.R1(textView, z15);
        boolean z16 = viewModel.f118085h;
        this.f49267h = z16;
        bs1.c.R1(imageView, z16);
        if (this.f49275p && bs1.c.l1(this)) {
            z14 = true;
        }
        k kVar2 = viewModel.f118083f;
        if (!z14 || this.f49276q) {
            this.f49263d = kVar2;
        } else {
            this.f49276q = true;
            int i24 = b.f118074a[kVar2.ordinal()];
            if (i24 == 1) {
                kVar = k.StartAbove;
            } else {
                if (i24 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                kVar = k.StartBelow;
            }
            this.f49263d = kVar;
        }
        int i25 = b.f118074a[this.f49263d.ordinal()];
        if (i25 == 1) {
            q03 = CollectionsKt.q0(c0.t(d7.b.O(this)));
        } else {
            if (i25 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            q03 = c0.t(d7.b.O(this));
        }
        removeAllViews();
        Iterator it2 = q03.iterator();
        while (it2.hasNext()) {
            addView((View) it2.next());
        }
        if (z13) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int paddingTop = getPaddingTop();
        int paddingStart = getPaddingStart() + this.f49277r;
        ArrayList arrayList = this.f49260a;
        LegacyGestaltAvatar legacyGestaltAvatar = (LegacyGestaltAvatar) CollectionsKt.U(0, arrayList);
        int H0 = legacyGestaltAvatar != null ? bs1.c.H0(legacyGestaltAvatar) : 0;
        boolean g13 = g();
        TextView textView = this.f49261b;
        int I0 = g13 ? bs1.c.I0(textView) : 0;
        boolean z14 = f() && this.f49279t == -1;
        ImageView imageView = this.f49262c;
        int I02 = z14 ? bs1.c.I0(imageView) : 0;
        int i17 = ((H0 + I0) + I02) - ((I0 > 0 ? this.f49277r : 0) + (I02 > 0 ? this.f49277r : 0));
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            if (f() && this.f49279t == i18) {
                int i19 = paddingStart - this.f49277r;
                bs1.c.p1(imageView, i19, paddingTop);
                paddingStart = i19 + bs1.c.I0(imageView);
            }
            LegacyGestaltAvatar legacyGestaltAvatar2 = (LegacyGestaltAvatar) arrayList.get(i18);
            if (bs1.c.o1(legacyGestaltAvatar2)) {
                paddingStart -= this.f49277r;
            }
            if (paddingStart + i17 > i15) {
                break;
            }
            bs1.c.p1(legacyGestaltAvatar2, paddingStart, paddingTop);
            paddingStart += bs1.c.I0(legacyGestaltAvatar2);
        }
        if (g()) {
            int i23 = paddingStart - this.f49277r;
            bs1.c.p1(textView, i23, paddingTop);
            paddingStart = i23 + bs1.c.I0(textView);
        }
        if (f() && this.f49279t == -1) {
            bs1.c.p1(imageView, paddingStart - this.f49277r, paddingTop);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (Object obj : this.f49260a) {
            int i18 = i15 + 1;
            if (i15 < 0) {
                f0.p();
                throw null;
            }
            LegacyGestaltAvatar legacyGestaltAvatar = (LegacyGestaltAvatar) obj;
            if (bs1.c.o1(legacyGestaltAvatar)) {
                if (i15 > 0) {
                    i16 -= this.f49277r;
                }
                measureChildWithMargins(legacyGestaltAvatar, i13, 0, i14, 0);
                int H0 = bs1.c.H0(legacyGestaltAvatar) + i16;
                i17 = Math.max(i17, bs1.c.F0(legacyGestaltAvatar));
                i16 = H0;
            }
            i15 = i18;
        }
        if (g()) {
            int i19 = i16 - this.f49277r;
            TextView textView = this.f49261b;
            measureChildWithMargins(textView, i13, 0, i14, 0);
            i16 = i19 + bs1.c.I0(textView);
            i17 = Math.max(i17, bs1.c.G0(textView));
        }
        if (f()) {
            int i23 = i16 - this.f49277r;
            ImageView imageView = this.f49262c;
            measureChildWithMargins(imageView, i13, 0, i14, 0);
            i16 = i23 + bs1.c.I0(imageView);
            i17 = Math.max(i17, bs1.c.I0(imageView));
        }
        setMeasuredDimension(i16, i17);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        Iterator it = this.f49260a.iterator();
        while (it.hasNext()) {
            ((LegacyGestaltAvatar) it.next()).setOnClickListener(onClickListener);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarGroup(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49260a = new ArrayList();
        this.f49263d = k.StartBelow;
        this.f49265f = 6;
        this.f49268i = -1;
        this.f49269j = -1;
        this.f49270k = -1;
        int i13 = g.f118090a;
        this.f49272m = f.f118089i;
        this.f49273n = -1;
        this.f49274o = 0.33f;
        this.f49275p = true;
        this.f49278s = h.f118094b;
        this.f49279t = -1;
        n nVar = n.NONE;
        this.f49280u = m.a(nVar, new c(this, 1));
        this.f49281v = m.a(nVar, new c(this, 0));
        a(this.f49265f);
        this.f49261b = c(d());
        this.f49262c = b(d());
        l(new tl1.d(null, null, null, 0, 0.0f, null, false, false, false, 1023), false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarGroup(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49260a = new ArrayList();
        this.f49263d = k.StartBelow;
        this.f49265f = 6;
        this.f49268i = -1;
        this.f49269j = -1;
        this.f49270k = -1;
        int i13 = g.f118090a;
        this.f49272m = f.f118089i;
        this.f49273n = -1;
        this.f49274o = 0.33f;
        this.f49275p = true;
        this.f49278s = h.f118094b;
        this.f49279t = -1;
        n nVar = n.NONE;
        this.f49280u = m.a(nVar, new c(this, 1));
        this.f49281v = m.a(nVar, new c(this, 0));
        a(this.f49265f);
        this.f49261b = c(d());
        this.f49262c = b(d());
        l(new tl1.d(null, null, null, 0, 0.0f, null, false, false, false, 1023), false);
        e(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarGroup(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49260a = new ArrayList();
        this.f49263d = k.StartBelow;
        this.f49265f = 6;
        this.f49268i = -1;
        this.f49269j = -1;
        this.f49270k = -1;
        int i14 = g.f118090a;
        this.f49272m = f.f118089i;
        this.f49273n = -1;
        this.f49274o = 0.33f;
        this.f49275p = true;
        this.f49278s = h.f118094b;
        this.f49279t = -1;
        n nVar = n.NONE;
        this.f49280u = m.a(nVar, new c(this, 1));
        this.f49281v = m.a(nVar, new c(this, 0));
        a(this.f49265f);
        this.f49261b = c(d());
        this.f49262c = b(d());
        l(new tl1.d(null, null, null, 0, 0.0f, null, false, false, false, 1023), false);
        e(context, attributeSet);
    }
}
