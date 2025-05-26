package up;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import d7.g;
import db.m;
import do1.d;
import e.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes3.dex */
public final class b extends we0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f122933d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f122934e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f122935f;

    public b(int i13, Runnable onUndo) {
        Intrinsics.checkNotNullParameter(onUndo, "onUndo");
        this.f122934e = i13;
        this.f122935f = onUndo;
    }

    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        switch (this.f122933d) {
            case 0:
                Intrinsics.checkNotNullParameter(container, "container");
                Context context = container.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new GestaltToast(context, new d(g.q(container.getResources(), this.f122934e, "getString(...)"), null, new do1.b(g.q(container.getResources(), x0.undo, "getString(...)"), new m(this, 6)), null, 0, 0, 0, null, false, 506));
            default:
                Intrinsics.checkNotNullParameter(container, "container");
                Context context2 = container.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                GestaltToast gestaltToast = new GestaltToast(6, context2, (AttributeSet) null);
                gestaltToast.v(new f(this, container, gestaltToast, 25));
                return gestaltToast;
        }
    }

    public b(int i13, Function0 onUndoButtonClick) {
        Intrinsics.checkNotNullParameter(onUndoButtonClick, "onUndoButtonClick");
        this.f122934e = i13;
        this.f122935f = onUndoButtonClick;
    }
}
