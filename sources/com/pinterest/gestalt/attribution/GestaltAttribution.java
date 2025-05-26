package com.pinterest.gestalt.attribution;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.p;
import com.google.firebase.messaging.q;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import fm1.c;
import gm1.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ql1.a;
import ql1.e;
import ql1.g;
import ql1.o;
import xk2.m;
import xk2.v;
import yj1.d;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0004\f\r\u0003\u000eB'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/pinterest/gestalt/attribution/GestaltAttribution;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lgm1/b;", "Lql1/e;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ql1/d", "al1/n", "ql1/f", "attribution_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GestaltAttribution extends ConstraintLayout implements b {

    /* renamed from: f, reason: collision with root package name */
    public static final c f49243f = c.VISIBLE;

    /* renamed from: a, reason: collision with root package name */
    public final q f49244a;

    /* renamed from: b, reason: collision with root package name */
    public final v f49245b;

    /* renamed from: c, reason: collision with root package name */
    public GestaltAvatar f49246c;

    /* renamed from: d, reason: collision with root package name */
    public GestaltText f49247d;

    /* renamed from: e, reason: collision with root package name */
    public final p f49248e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltAttribution(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final GestaltText L() {
        Object value = this.f49245b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (GestaltText) value;
    }

    public final void T(e eVar, e eVar2) {
        j1.v(eVar, eVar2, g.f104083l, new a(this, 2));
        j1.v(eVar, eVar2, g.f104084m, new a(this, 3));
        if (eVar2.f104080c != Integer.MIN_VALUE) {
            j1.v(eVar, eVar2, g.f104085n, new a(this, 4));
        }
    }

    public /* synthetic */ GestaltAttribution(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltAttribution(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49245b = m.b(new d(this, 6));
        this.f49248e = new p();
        int[] GestaltAttribution = o.GestaltAttribution;
        Intrinsics.checkNotNullExpressionValue(GestaltAttribution, "GestaltAttribution");
        q qVar = new q(this, attributeSet, i13, GestaltAttribution, new a(this, 0));
        this.f49244a = qVar;
        View.inflate(getContext(), ql1.m.gestalt_attribution_layout, this);
        setImportantForAccessibility(1);
        T(null, (e) ((u50.o) qVar.f33803a));
    }
}
