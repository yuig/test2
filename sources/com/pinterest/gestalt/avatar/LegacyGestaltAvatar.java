package com.pinterest.gestalt.avatar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.ui.imageview.WebImageView;
import ff0.j;
import hs1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import oq.h;
import org.jetbrains.annotations.NotNull;
import rl1.e0;
import rl1.f0;
import rl1.g;
import rl1.g0;
import xk2.d;

@d
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/gestalt/avatar/LegacyGestaltAvatar;", "Lcom/pinterest/ui/imageview/WebImageView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "al1/n", "avatar_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class LegacyGestaltAvatar extends WebImageView {
    public static final /* synthetic */ int K = 0;

    /* renamed from: J, reason: collision with root package name */
    public final e0 f49250J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyGestaltAvatar(Context context, g viewModel) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        e0 e0Var = new e0();
        this.f49250J = e0Var;
        Intrinsics.checkNotNullParameter(this, "avatarView");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        e0Var.f108545a = this;
        e0Var.j(context, null);
        e0Var.u(viewModel);
    }

    @Override // com.pinterest.ui.imageview.GenericWebImageView, hs1.a
    public final void J1() {
        yj1.d superPrepareForReuse = new yj1.d(this, 7);
        e0 e0Var = this.f49250J;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(superPrepareForReuse, "superPrepareForReuse");
        superPrepareForReuse.invoke();
        e0Var.q("");
        Intrinsics.checkNotNullParameter("", "name");
        if (!z.i(e0Var.G, "", true)) {
            e0Var.G = "";
            if (e0Var.h()) {
                e0Var.k();
            }
        }
        if (e0Var.f108564t) {
            e0Var.f108564t = false;
            e0Var.n();
        }
    }

    @Override // com.pinterest.ui.imageview.GenericWebImageView, bb2.j
    public final void Y(c cVar) {
        f0 superSetImageListener = new f0(this, 2);
        e0 e0Var = this.f49250J;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(superSetImageListener, "superSetImageListener");
        if (cVar != null) {
            superSetImageListener.invoke(new h(8, e0Var, cVar));
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        f0 superDispatchDraw = new f0(this, 0);
        e0 e0Var = this.f49250J;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(superDispatchDraw, "superDispatchDraw");
        superDispatchDraw.invoke(canvas);
        if (e0Var.h()) {
            if (!j.f62104b) {
                WebImageView webImageView = e0Var.f108545a;
                if (webImageView == null) {
                    Intrinsics.r("avatarView");
                    throw null;
                }
                webImageView.clear();
            }
            e0Var.a(canvas);
        }
        if (e0Var.f108564t && e0Var.f108565u != null) {
            e0Var.b(canvas);
        }
        e0Var.M = false;
    }

    @Override // com.pinterest.ui.imageview.GenericWebImageView, com.makeramen.RoundedImageView, android.widget.ImageView, android.view.View, eo.d
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        f0 superOnDraw = new f0(this, 1);
        e0 e0Var = this.f49250J;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(superOnDraw, "superOnDraw");
        if (e0Var.h()) {
            e0Var.a(canvas);
        } else {
            if (canvas != null) {
                canvas.drawCircle(e0Var.N, e0Var.O, e0Var.P - (e0Var.f108560p ? e0Var.f108561q : 0), (Paint) e0Var.f108550f.getValue());
            }
            superOnDraw.invoke(canvas);
        }
        if (e0Var.f108564t && e0Var.f108565u != null) {
            e0Var.b(canvas);
        }
        e0Var.M = false;
    }

    @Override // com.pinterest.ui.imageview.GenericWebImageView, android.widget.ImageView, android.view.View
    public final void onMeasure(int i13, int i14) {
        int e13;
        g0 superOnMeasure = new g0(this, 0);
        g0 setMeasuredDimension = new g0(this, 1);
        e0 e0Var = this.f49250J;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(superOnMeasure, "superOnMeasure");
        Intrinsics.checkNotNullParameter(setMeasuredDimension, "setMeasuredDimension");
        if (e0Var.f108557m > 0) {
            e13 = Math.min(View.MeasureSpec.getMode(i13) != 1073741824 ? View.resolveSize(e0Var.f108557m, i13) : e0Var.f108557m, View.MeasureSpec.getMode(i14) != 1073741824 ? View.resolveSize(e0Var.f108557m, i14) : e0Var.f108557m);
        } else {
            superOnMeasure.invoke(Integer.valueOf(i13), Integer.valueOf(i14));
            e13 = e0Var.e();
        }
        e0Var.s(e13, false);
        WebImageView webImageView = e0Var.f108545a;
        if (webImageView == null) {
            Intrinsics.r("avatarView");
            throw null;
        }
        webImageView.H0(e13, e13);
        setMeasuredDimension.invoke(Integer.valueOf(e13), Integer.valueOf(e13));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyGestaltAvatar(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        e0 e0Var = new e0();
        this.f49250J = e0Var;
        Intrinsics.checkNotNullParameter(this, "avatarView");
        Intrinsics.checkNotNullParameter(context, "context");
        e0Var.f108545a = this;
        e0Var.j(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyGestaltAvatar(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        e0 e0Var = new e0();
        this.f49250J = e0Var;
        Intrinsics.checkNotNullParameter(this, "avatarView");
        Intrinsics.checkNotNullParameter(context, "context");
        e0Var.f108545a = this;
        e0Var.j(context, attributeSet);
    }
}
