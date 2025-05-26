package com.pinterest.feature.conversation.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import bp1.a;
import bp1.b;
import bp1.c;
import bp1.f;
import com.pinterest.api.model.f30;
import de.h;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rm1.q;
import wd.m;
import wd.t;
import wd.z;
import xc0.j;
import z40.a0;
import z40.b0;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/pinterest/feature/conversation/view/ConversationPinGifItemImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "conversation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ConversationPinGifItemImageView extends AppCompatImageView {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f45613a;

    /* renamed from: b, reason: collision with root package name */
    public Object f45614b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationPinGifItemImageView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.ConversationPinGifItemView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.f45613a = obtainStyledAttributes.getBoolean(j.ConversationPinGifItemView_use_mini_anchor_gif_view, false);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f2(f30 pin) {
        int C0;
        int A0;
        Drawable drawable;
        Integer i13;
        Integer j13;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pin, "pin");
        f fVar = pin instanceof b0 ? new f(new a((b0) pin)) : new f(new b(pin));
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        c cVar = fVar.f23655a;
        boolean z13 = cVar instanceof a;
        if (z13) {
            b0 b0Var = ((a) cVar).f23650b;
            Intrinsics.checkNotNullParameter(b0Var, "<this>");
            a0 g13 = b0Var.g();
            C0 = (g13 == null || (j13 = g13.j()) == null) ? 0 : j13.intValue();
        } else {
            if (!(cVar instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            C0 = bs1.c.C0(((b) cVar).f23651b);
        }
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (z13) {
            b0 b0Var2 = ((a) cVar).f23650b;
            Intrinsics.checkNotNullParameter(b0Var2, "<this>");
            a0 g14 = b0Var2.g();
            A0 = (g14 == null || (i13 = g14.i()) == null) ? 0 : i13.intValue();
        } else {
            if (!(cVar instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            A0 = bs1.c.A0(((b) cVar).f23651b);
        }
        boolean z14 = this.f45613a;
        double d2 = r1 * (z14 ? 0.2d : 0.6d);
        double d13 = C0;
        if (d13 < d2 || z14) {
            double d14 = d2 / d13;
            double d15 = hf0.b.f69001a * 1.3d;
            if (d14 > d15) {
                d14 = d15;
            }
            C0 = ml2.c.b(d13 * d14);
            A0 = ml2.c.b(A0 * d14);
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = C0;
        layoutParams.height = A0;
        if (!Intrinsics.d(fVar, this.f45614b)) {
            this.f45614b = fVar;
            de.a x13 = ((h) new h().q(m.f129183a, new t(), true)).x(new z(16), true);
            Intrinsics.checkNotNullExpressionValue(x13, "transform(...)");
            h hVar = (h) x13;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int drawableRes = q.FACE_SAD.getDrawableRes();
            int i14 = eo1.b.color_icon_disabled;
            Intrinsics.checkNotNullParameter(context, "context");
            Object obj = d5.a.f53679a;
            Drawable drawable2 = context.getDrawable(drawableRes);
            Intrinsics.checkNotNullParameter(context, "context");
            if (drawable2 != null) {
                int color = i14 == 0 ? context.getColor(df0.a.f54892a) : context.getColor(i14);
                Intrinsics.checkNotNullParameter(context, "context");
                if (color == 0) {
                    color = context.getColor(df0.a.f54892a);
                }
                drawable = drawable2.mutate();
                drawable.setTint(color);
            } else {
                drawable = null;
            }
            hVar.i(drawable);
            com.bumptech.glide.b.f(getContext()).d().K(fVar.f23659e).a(hVar).G(this);
        }
        setBackgroundColor(0);
    }
}
