package ez0;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import i91.u;
import i91.z;
import kotlin.jvm.internal.Intrinsics;
import lu.a0;

/* loaded from: classes5.dex */
public final class c extends a0 {

    /* renamed from: d, reason: collision with root package name */
    public final u f60668d;

    /* renamed from: e, reason: collision with root package name */
    public z f60669e;

    /* renamed from: f, reason: collision with root package name */
    public final int f60670f;

    /* renamed from: g, reason: collision with root package name */
    public j91.d f60671g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, u style) {
        super(context, 5);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f60668d = style;
        this.f60670f = getResources().getDimensionPixelOffset(eo1.c.space_200);
        View view = new View(context);
        view.setBackground(new k(context, style));
        view.setLayoutParams(new FrameLayout.LayoutParams(i(), i()));
        setLayoutParams(new FrameLayout.LayoutParams(i(), i()));
        addView(view);
        setClipChildren(false);
    }

    public final void g(int i13, int i14) {
        if (i13 <= 0 || i14 <= 0) {
            return;
        }
        int i15 = this.f60670f;
        setY((i13 - i15) - i());
        setX((i14 - i15) - i());
    }

    public final int i() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return this.f60668d.getPreferredSize(context);
    }

    public final void j(int i13) {
        if (i13 == 0) {
            u uVar = u.SEARCH_FEED;
            u uVar2 = this.f60668d;
            if (uVar2 == uVar) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                z zVar = this.f60669e;
                if (zVar == null) {
                    Intrinsics.r("preferredSharingAppTracker");
                    throw null;
                }
                j91.d dVar = new j91.d(context, uVar2, null, zVar.f71924c);
                this.f60671g = dVar;
                addView(dVar);
                return;
            }
        }
        View view = this.f60671g;
        if (view != null) {
            removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
