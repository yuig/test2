package com.pinterest.gestalt.iconcomponent;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import df.j1;
import fm1.c;
import gm1.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ps0.y;
import rm1.d;
import rm1.h;
import rm1.i;
import rm1.j;
import rm1.n;
import rm1.q;
import rm1.u;
import u50.o;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0006\r\u000e\u0003\u000f\u0010\u0011B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB'\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/pinterest/gestalt/iconcomponent/GestaltIcon;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lgm1/b;", "Lrm1/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "rm1/c", "ps0/y", "rm1/g", "rm1/h", "rm1/i", "iconComponent_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class GestaltIcon extends AppCompatImageView implements b {

    /* renamed from: b, reason: collision with root package name */
    public static final y f49400b = new y(22, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final q f49401c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f49402d;

    /* renamed from: e, reason: collision with root package name */
    public static final i f49403e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f49404f;

    /* renamed from: g, reason: collision with root package name */
    public static final rm1.c f49405g;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.firebase.messaging.q f49406a;

    static {
        q icon = q.FILL_TRANSPARENT;
        i size = i.SM;
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(size, "size");
        f49401c = icon;
        n nVar = n.DASH;
        f49402d = c.VISIBLE;
        f49403e = size;
        f49404f = h.LG;
        f49405g = rm1.c.DEFAULT;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltIcon(Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final GestaltIcon g2(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        com.google.firebase.messaging.q qVar = this.f49406a;
        return (GestaltIcon) qVar.d(nextState, new i2.i(26, this, (d) ((o) qVar.f33803a)));
    }

    public final void i2(d dVar, d dVar2) {
        j1.v(dVar, dVar2, j.f108704j, new rm1.b(this, 1));
        j1.v(dVar, dVar2, j.f108705k, new rm1.b(this, 2));
        j1.v(dVar, dVar2, j.f108706l, new rm1.b(this, 3));
        if (dVar2.f108698d != Integer.MIN_VALUE) {
            j1.v(dVar, dVar2, j.f108707m, new rm1.b(this, 4));
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i13, int i14) {
        setMeasuredDimension(getMaxWidth(), getMaxHeight());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltIcon(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltIcon(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        setVisibility(8);
        int[] GestaltIcon = u.GestaltIcon;
        Intrinsics.checkNotNullExpressionValue(GestaltIcon, "GestaltIcon");
        com.google.firebase.messaging.q qVar = new com.google.firebase.messaging.q(this, attributeSet, i13, GestaltIcon, new rm1.b(this, 0));
        this.f49406a = qVar;
        i2(null, (d) ((o) qVar.f33803a));
    }
}
