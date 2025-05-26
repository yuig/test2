package va2;

import android.content.Context;
import android.graphics.Canvas;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.jvm.internal.Intrinsics;
import ua2.c1;

/* loaded from: classes4.dex */
public final class e extends wa2.l {

    /* renamed from: l, reason: collision with root package name */
    public final Context f125337l;

    /* renamed from: m, reason: collision with root package name */
    public c1 f125338m;

    /* renamed from: n, reason: collision with root package name */
    public final xk2.k f125339n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LegoPinGridCellImpl parentView) {
        super(parentView.getContext());
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Context context = parentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f125337l = context;
        this.f125339n = xk2.m.a(xk2.n.NONE, new c72.o(this, 15));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        xk2.k kVar = this.f125339n;
        ((GestaltAvatar) kVar.getValue()).setVisibility(0);
        canvas.save();
        canvas.translate(getBounds().left, getBounds().top);
        ((GestaltAvatar) kVar.getValue()).draw(canvas);
        canvas.restore();
    }
}
