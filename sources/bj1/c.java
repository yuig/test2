package bj1;

import android.content.Context;
import android.graphics.Canvas;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import kotlin.jvm.internal.Intrinsics;
import wa2.l;
import xk2.k;
import xk2.m;
import xk2.n;

/* loaded from: classes5.dex */
public final class c extends l {

    /* renamed from: l, reason: collision with root package name */
    public final Context f22966l;

    /* renamed from: m, reason: collision with root package name */
    public final k f22967m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SbaPinRep parentView) {
        super(parentView.getContext());
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Context context = parentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f22966l = context;
        this.f22967m = m.a(n.NONE, new ee1.d(this, 27));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        canvas.translate(getBounds().left, getBounds().top);
        ((GestaltAvatar) this.f22967m.getValue()).draw(canvas);
        canvas.restore();
    }
}
