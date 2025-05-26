package com.pinterest.component.avatarpairs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import bc0.a;
import bc0.b;
import bc0.c;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import cp.t;
import ga2.d;
import ga2.e;
import java.util.ArrayList;
import java.util.List;
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
import xa0.j;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/pinterest/component/avatarpairs/AvatarPair;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bc0/a", "bc0/b", "xa0/j", "ui-components_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AvatarPair extends ConstraintLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final j f44688i = new j(6, 0);

    /* renamed from: a, reason: collision with root package name */
    public final Space f44689a;

    /* renamed from: b, reason: collision with root package name */
    public final Space f44690b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltAvatar f44691c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltAvatar f44692d;

    /* renamed from: e, reason: collision with root package name */
    public a f44693e;

    /* renamed from: f, reason: collision with root package name */
    public a f44694f;

    /* renamed from: g, reason: collision with root package name */
    public g f44695g;

    /* renamed from: h, reason: collision with root package name */
    public g f44696h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarPair(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        String str = null;
        int i13 = 63;
        this.f44693e = new a(str, str, i13);
        this.f44694f = new a(str, str, i13);
        View.inflate(getContext(), e.view_avatar_pair, this);
        View findViewById = findViewById(d.avatar_horizontal_space);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f44689a = (Space) findViewById;
        View findViewById2 = findViewById(d.avatar_vertical_space);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f44690b = (Space) findViewById2;
        View findViewById3 = findViewById(d.front_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f44691c = (GestaltAvatar) findViewById3;
        View findViewById4 = findViewById(d.back_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f44692d = (GestaltAvatar) findViewById4;
        j jVar = f44688i;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f44695g = jVar.d(context2);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        g c13 = jVar.c(context3);
        this.f44696h = c13;
        T(b.Front, c13);
        T(b.Back, this.f44696h);
    }

    public final GestaltAvatar L(b bVar) {
        int i13 = c.f22624a[bVar.ordinal()];
        if (i13 == 1) {
            return this.f44691c;
        }
        if (i13 == 2) {
            return this.f44692d;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void T(b bVar, g gVar) {
        L(bVar).H2(bc0.d.f22625i);
        i.w1(L(bVar), gVar);
    }

    public final void X(List avatarDisplays) {
        Intrinsics.checkNotNullParameter(avatarDisplays, "avatarDisplays");
        int min = Math.min(2, avatarDisplays.size());
        boolean z13 = min >= 1;
        boolean z14 = min >= 2;
        if (z13) {
            this.f44693e = (a) avatarDisplays.get(0);
        }
        if (z14) {
            this.f44694f = (a) avatarDisplays.get(1);
        }
        L(b.Front).H2(new t(z13, 18));
        L(b.Back).H2(new t(z14, 19));
        a0();
    }

    public final void Z(g singleAvatarViewModel, g multiAvatarViewModel) {
        Intrinsics.checkNotNullParameter(singleAvatarViewModel, "singleAvatarViewModel");
        Intrinsics.checkNotNullParameter(multiAvatarViewModel, "multiAvatarViewModel");
        int i13 = multiAvatarViewModel.f108574a;
        int i14 = singleAvatarViewModel.f108574a;
        g a13 = g.a(multiAvatarViewModel, Math.min(i13, i14), null, null, null, null, null, 4094);
        this.f44695g = singleAvatarViewModel;
        this.f44696h = a13;
        int i15 = i14 - a13.f108574a;
        Space space = this.f44689a;
        ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = i15;
        space.setLayoutParams(layoutParams);
        Space space2 = this.f44690b;
        ViewGroup.LayoutParams layoutParams2 = space2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.height = i15;
        space2.setLayoutParams(layoutParams2);
        a0();
    }

    public final void a0() {
        b[] values = b.values();
        ArrayList arrayList = new ArrayList();
        boolean z13 = false;
        for (b bVar : values) {
            if (bs1.c.o1(L(bVar))) {
                arrayList.add(bVar);
            }
        }
        int size = arrayList.size();
        Space space = this.f44690b;
        Space space2 = this.f44689a;
        int i13 = 20;
        boolean z14 = true;
        if (size == 1) {
            b bVar2 = b.Back;
            L(bVar2).H2(new t(z13, i13));
            bs1.c.R1(space2, false);
            bs1.c.R1(space, false);
            g gVar = this.f44695g;
            b bVar3 = b.Front;
            T(bVar3, d0(bVar3, gVar));
            T(bVar2, d0(bVar2, gVar));
            return;
        }
        b bVar4 = b.Back;
        L(bVar4).H2(new t(z14, i13));
        bs1.c.R1(space2, true);
        bs1.c.R1(space, true);
        g gVar2 = this.f44696h;
        b bVar5 = b.Front;
        T(bVar5, d0(bVar5, gVar2));
        T(bVar4, d0(bVar4, gVar2));
    }

    public final g d0(b bVar, g gVar) {
        a aVar;
        int i13;
        int i14 = c.f22624a[bVar.ordinal()];
        if (i14 == 1) {
            aVar = this.f44693e;
        } else {
            if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = this.f44694f;
        }
        String str = aVar.f22618a;
        h0 g13 = n.g(gVar, aVar.f22619b);
        Integer num = aVar.f22622e;
        if (num != null) {
            i13 = num.intValue();
        } else {
            int i15 = l.f108624a;
            i13 = -1;
        }
        int i16 = i13;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return g.a(gVar, 0, str, null, m0.a(gVar.f108579f, aVar.f22620c, aVar.f22621d, 0, 0, i16, 1020), g13, aVar.f22623f, 2973);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarPair(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        String str = null;
        int i13 = 63;
        this.f44693e = new a(str, str, i13);
        this.f44694f = new a(str, str, i13);
        View.inflate(getContext(), e.view_avatar_pair, this);
        View findViewById = findViewById(d.avatar_horizontal_space);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f44689a = (Space) findViewById;
        View findViewById2 = findViewById(d.avatar_vertical_space);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f44690b = (Space) findViewById2;
        View findViewById3 = findViewById(d.front_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f44691c = (GestaltAvatar) findViewById3;
        View findViewById4 = findViewById(d.back_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f44692d = (GestaltAvatar) findViewById4;
        j jVar = f44688i;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f44695g = jVar.d(context2);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        g c13 = jVar.c(context3);
        this.f44696h = c13;
        T(b.Front, c13);
        T(b.Back, this.f44696h);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarPair(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        String str = null;
        int i14 = 63;
        this.f44693e = new a(str, str, i14);
        this.f44694f = new a(str, str, i14);
        View.inflate(getContext(), e.view_avatar_pair, this);
        View findViewById = findViewById(d.avatar_horizontal_space);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f44689a = (Space) findViewById;
        View findViewById2 = findViewById(d.avatar_vertical_space);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f44690b = (Space) findViewById2;
        View findViewById3 = findViewById(d.front_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f44691c = (GestaltAvatar) findViewById3;
        View findViewById4 = findViewById(d.back_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f44692d = (GestaltAvatar) findViewById4;
        j jVar = f44688i;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f44695g = jVar.d(context2);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        g c13 = jVar.c(context3);
        this.f44696h = c13;
        T(b.Front, c13);
        T(b.Back, this.f44696h);
    }
}
