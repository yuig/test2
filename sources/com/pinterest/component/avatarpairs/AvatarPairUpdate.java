package com.pinterest.component.avatarpairs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import bc0.e;
import bc0.f;
import bs1.c;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import e0.t;
import ga2.d;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pe.i;
import rl1.g;
import rl1.h0;
import rl1.l;
import rl1.m0;
import rl1.n;
import t80.r;
import xa0.j;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/pinterest/component/avatarpairs/AvatarPairUpdate;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bc0/e", "bc0/f", "xa0/j", "ui-components_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AvatarPairUpdate extends ConstraintLayout {

    /* renamed from: q, reason: collision with root package name */
    public static final j f44697q = new j(7, 0);

    /* renamed from: a, reason: collision with root package name */
    public final Space f44698a;

    /* renamed from: b, reason: collision with root package name */
    public final Space f44699b;

    /* renamed from: c, reason: collision with root package name */
    public final Space f44700c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltAvatar f44701d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltAvatar f44702e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltAvatar f44703f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltAvatar f44704g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltAvatar f44705h;

    /* renamed from: i, reason: collision with root package name */
    public e f44706i;

    /* renamed from: j, reason: collision with root package name */
    public e f44707j;

    /* renamed from: k, reason: collision with root package name */
    public e f44708k;

    /* renamed from: l, reason: collision with root package name */
    public e f44709l;

    /* renamed from: m, reason: collision with root package name */
    public e f44710m;

    /* renamed from: n, reason: collision with root package name */
    public g f44711n;

    /* renamed from: o, reason: collision with root package name */
    public g f44712o;

    /* renamed from: p, reason: collision with root package name */
    public int f44713p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarPairUpdate(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44706i = new e(null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
        this.f44707j = new e(null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
        this.f44708k = new e(null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
        this.f44709l = new e(null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
        this.f44710m = new e(null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
        View.inflate(getContext(), ga2.e.view_avatar_pair_update, this);
        View findViewById = findViewById(d.avatar_horizontal_space);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f44698a = (Space) findViewById;
        View findViewById2 = findViewById(d.avatar_vertical_space);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f44699b = (Space) findViewById2;
        View findViewById3 = findViewById(d.avatar_left_space);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f44700c = (Space) findViewById3;
        View findViewById4 = findViewById(d.front_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f44701d = (GestaltAvatar) findViewById4;
        View findViewById5 = findViewById(d.back_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f44702e = (GestaltAvatar) findViewById5;
        View findViewById6 = findViewById(d.left_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f44703f = (GestaltAvatar) findViewById6;
        View findViewById7 = findViewById(d.back_left_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f44704g = (GestaltAvatar) findViewById7;
        View findViewById8 = findViewById(d.right_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f44705h = (GestaltAvatar) findViewById8;
        j jVar = f44697q;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f44711n = jVar.d(context2);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        g c13 = jVar.c(context3);
        this.f44712o = c13;
        T(f.Front, c13);
        T(f.Back, this.f44712o);
        T(f.Left, this.f44712o);
        T(f.Right, this.f44712o);
        T(f.BackLeft, this.f44712o);
    }

    public final GestaltAvatar L(f fVar) {
        int i13 = bc0.g.f22633a[fVar.ordinal()];
        if (i13 == 1) {
            return this.f44701d;
        }
        if (i13 == 2) {
            return this.f44702e;
        }
        if (i13 == 3) {
            return this.f44703f;
        }
        if (i13 == 4) {
            return this.f44705h;
        }
        if (i13 == 5) {
            return this.f44704g;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void T(f fVar, g gVar) {
        e eVar;
        int i13;
        int i14 = bc0.g.f22633a[fVar.ordinal()];
        if (i14 == 1) {
            eVar = this.f44706i;
        } else if (i14 == 2) {
            eVar = this.f44707j;
        } else if (i14 == 3) {
            eVar = this.f44708k;
        } else if (i14 == 4) {
            eVar = this.f44709l;
        } else {
            if (i14 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            eVar = this.f44710m;
        }
        e eVar2 = eVar;
        String str = eVar2.f22626a;
        h0 g13 = n.g(gVar, eVar2.f22627b);
        Integer num = eVar2.f22630e;
        if (num != null) {
            i13 = num.intValue();
        } else {
            int i15 = l.f108624a;
            i13 = -1;
        }
        int i16 = i13;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        g a13 = g.a(gVar, 0, str, null, m0.a(gVar.f108579f, eVar2.f22628c, eVar2.f22629d, 0, 0, i16, 1020), g13, null, 3997);
        GestaltAvatar L = L(fVar);
        i.w1(L, a13);
        t.g(L, new r(23, this, eVar2));
    }

    public final void X(g singleAvatarViewModel, g multiAvatarViewModel) {
        Intrinsics.checkNotNullParameter(singleAvatarViewModel, "singleAvatarViewModel");
        Intrinsics.checkNotNullParameter(multiAvatarViewModel, "multiAvatarViewModel");
        int i13 = multiAvatarViewModel.f108574a;
        int i14 = singleAvatarViewModel.f108574a;
        g a13 = g.a(multiAvatarViewModel, Math.min(i13, i14), null, null, null, null, null, 4094);
        this.f44711n = singleAvatarViewModel;
        this.f44712o = a13;
        int i15 = i14 - a13.f108574a;
        Space space = this.f44698a;
        ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = i15;
        space.setLayoutParams(layoutParams);
        Space space2 = this.f44699b;
        ViewGroup.LayoutParams layoutParams2 = space2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.height = i15 + 20;
        space2.setLayoutParams(layoutParams2);
        Space space3 = this.f44700c;
        ViewGroup.LayoutParams layoutParams3 = space3.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams3.width = i15;
        space3.setLayoutParams(layoutParams3);
        a0();
    }

    public final void Z(boolean z13) {
        L(f.Back).H2(new cp.t(z13 && this.f44713p < 4, 26));
        c.R1(this.f44698a, z13);
        c.R1(this.f44699b, z13);
        c.R1(this.f44700c, z13);
    }

    public final void a0() {
        f[] values = f.values();
        ArrayList arrayList = new ArrayList();
        for (f fVar : values) {
            if (c.o1(L(fVar))) {
                arrayList.add(fVar);
            }
        }
        int size = arrayList.size();
        this.f44713p = size;
        if (size == 1) {
            Z(false);
            g gVar = this.f44711n;
            T(f.Front, gVar);
            T(f.Back, gVar);
            T(f.Left, gVar);
            T(f.Right, gVar);
            T(f.BackLeft, gVar);
            return;
        }
        Z(true);
        g gVar2 = this.f44712o;
        T(f.Front, gVar2);
        T(f.Back, gVar2);
        T(f.Left, gVar2);
        T(f.Right, gVar2);
        T(f.BackLeft, gVar2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarPairUpdate(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44706i = new e(null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
        this.f44707j = new e(null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
        this.f44708k = new e(null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
        this.f44709l = new e(null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
        this.f44710m = new e(null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
        View.inflate(getContext(), ga2.e.view_avatar_pair_update, this);
        View findViewById = findViewById(d.avatar_horizontal_space);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f44698a = (Space) findViewById;
        View findViewById2 = findViewById(d.avatar_vertical_space);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f44699b = (Space) findViewById2;
        View findViewById3 = findViewById(d.avatar_left_space);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f44700c = (Space) findViewById3;
        View findViewById4 = findViewById(d.front_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f44701d = (GestaltAvatar) findViewById4;
        View findViewById5 = findViewById(d.back_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f44702e = (GestaltAvatar) findViewById5;
        View findViewById6 = findViewById(d.left_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f44703f = (GestaltAvatar) findViewById6;
        View findViewById7 = findViewById(d.back_left_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f44704g = (GestaltAvatar) findViewById7;
        View findViewById8 = findViewById(d.right_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f44705h = (GestaltAvatar) findViewById8;
        j jVar = f44697q;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f44711n = jVar.d(context2);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        g c13 = jVar.c(context3);
        this.f44712o = c13;
        T(f.Front, c13);
        T(f.Back, this.f44712o);
        T(f.Left, this.f44712o);
        T(f.Right, this.f44712o);
        T(f.BackLeft, this.f44712o);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarPairUpdate(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44706i = new e(null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
        this.f44707j = new e(null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
        this.f44708k = new e(null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
        this.f44709l = new e(null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
        this.f44710m = new e(null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
        View.inflate(getContext(), ga2.e.view_avatar_pair_update, this);
        View findViewById = findViewById(d.avatar_horizontal_space);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f44698a = (Space) findViewById;
        View findViewById2 = findViewById(d.avatar_vertical_space);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f44699b = (Space) findViewById2;
        View findViewById3 = findViewById(d.avatar_left_space);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f44700c = (Space) findViewById3;
        View findViewById4 = findViewById(d.front_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f44701d = (GestaltAvatar) findViewById4;
        View findViewById5 = findViewById(d.back_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f44702e = (GestaltAvatar) findViewById5;
        View findViewById6 = findViewById(d.left_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f44703f = (GestaltAvatar) findViewById6;
        View findViewById7 = findViewById(d.back_left_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f44704g = (GestaltAvatar) findViewById7;
        View findViewById8 = findViewById(d.right_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f44705h = (GestaltAvatar) findViewById8;
        j jVar = f44697q;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f44711n = jVar.d(context2);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        g c13 = jVar.c(context3);
        this.f44712o = c13;
        T(f.Front, c13);
        T(f.Back, this.f44712o);
        T(f.Left, this.f44712o);
        T(f.Right, this.f44712o);
        T(f.BackLeft, this.f44712o);
    }
}
