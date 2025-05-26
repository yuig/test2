package com.pinterest.gestalt.tag;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.firebase.messaging.q;
import df.j1;
import gm1.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qn1.a;
import qn1.c;
import qn1.d;
import qn1.e;
import qn1.j;
import rm1.g;
import u50.o;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0004\f\u0003\r\u000eB'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/pinterest/gestalt/tag/GestaltTag;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lgm1/b;", "Lqn1/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "org/chromium/net/y", "qn1/c", "qn1/d", "tag_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"GestaltComponentUnsafeSetterCall"})
/* loaded from: classes5.dex */
public final class GestaltTag extends AppCompatTextView implements b {

    /* renamed from: c, reason: collision with root package name */
    public static final c f49633c = c.LARGE;

    /* renamed from: d, reason: collision with root package name */
    public static final d f49634d = d.DEFAULT;

    /* renamed from: e, reason: collision with root package name */
    public static final fm1.c f49635e = fm1.c.VISIBLE;

    /* renamed from: a, reason: collision with root package name */
    public final q f49636a;

    /* renamed from: b, reason: collision with root package name */
    public final v f49637b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltTag(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void k(GestaltTag gestaltTag, Drawable drawable, Drawable drawable2, int i13) {
        if ((i13 & 1) != 0) {
            drawable = null;
        }
        if ((i13 & 2) != 0) {
            drawable2 = null;
        }
        gestaltTag.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, drawable2, (Drawable) null);
    }

    public final qn1.b i() {
        return (qn1.b) ((o) this.f49636a.f33803a);
    }

    public final void j(qn1.b bVar, qn1.b bVar2) {
        j1.v(bVar, bVar2, e.f104479n, new a(this, 7));
        j1.v(bVar, bVar2, e.f104480o, new a(this, 8));
        j1.v(bVar, bVar2, e.f104481p, new a(this, 9));
        j1.v(bVar, bVar2, e.f104482q, new a(this, 10));
        j1.v(bVar, bVar2, e.f104483r, new a(this, 2));
        j1.v(bVar, bVar2, e.f104475j, new a(this, 3));
        j1.v(bVar, bVar2, e.f104476k, new a(this, 4));
        j1.v(bVar, bVar2, e.f104477l, new a(this, 5));
        if (bVar2.f104474h != Integer.MIN_VALUE) {
            j1.v(bVar, bVar2, e.f104478m, new a(this, 6));
        }
    }

    public final void l(g gVar, int i13, boolean z13) {
        qn1.b i14 = i();
        int endIconSize = z13 ? i14.f104470d.getEndIconSize() : i14.f104470d.getStartIconSize();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable c03 = bs1.c.c0(context, gVar.b(context));
        c03.setTint(dl2.b.x0(context, i13));
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        Drawable p03 = d7.b.p0(c03, resources, dl2.b.F0(context, endIconSize), dl2.b.F0(context, endIconSize));
        Drawable drawable = getCompoundDrawablesRelative()[0];
        if (drawable != null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            drawable.setTint(dl2.b.x0(context2, i13));
        } else {
            drawable = null;
        }
        Drawable drawable2 = getCompoundDrawablesRelative()[2];
        if (drawable2 != null) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            drawable2.setTint(dl2.b.x0(context3, i13));
        } else {
            drawable2 = null;
        }
        if (!z13) {
            drawable = p03;
        }
        if (!z13) {
            p03 = drawable2;
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, p03, (Drawable) null);
        setCompoundDrawablePadding(ml2.c.c(dl2.b.E0(this, i().f104470d.getIconPadding())));
    }

    public /* synthetic */ GestaltTag(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltTag(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49637b = m.b(new yj1.d(this, 13));
        int[] GestaltTag = j.GestaltTag;
        Intrinsics.checkNotNullExpressionValue(GestaltTag, "GestaltTag");
        this.f49636a = new q(this, attributeSet, i13, GestaltTag, new a(this, 0));
        j(null, i());
    }
}
