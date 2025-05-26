package jq0;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import go0.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends we0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f77456d;

    /* renamed from: e, reason: collision with root package name */
    public final int f77457e;

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f77458f;

    /* renamed from: g, reason: collision with root package name */
    public final Function0 f77459g;

    public a(int i13, Function0 onToastComplete, Function0 undoAction, int i14) {
        this.f77456d = i14;
        if (i14 != 1) {
            Intrinsics.checkNotNullParameter(onToastComplete, "onUndoButtonClick");
            Intrinsics.checkNotNullParameter(undoAction, "onCompleted");
            this.f77457e = i13;
            this.f77458f = onToastComplete;
            this.f77459g = undoAction;
            return;
        }
        Intrinsics.checkNotNullParameter(onToastComplete, "onToastComplete");
        Intrinsics.checkNotNullParameter(undoAction, "undoAction");
        this.f77457e = i13;
        this.f77458f = onToastComplete;
        this.f77459g = undoAction;
    }

    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        switch (this.f77456d) {
            case 0:
                Intrinsics.checkNotNullParameter(container, "container");
                Context context = container.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                GestaltToast gestaltToast = new GestaltToast(6, context, (AttributeSet) null);
                gestaltToast.v(new r(this, container, gestaltToast, 7));
                return gestaltToast;
            default:
                Intrinsics.checkNotNullParameter(container, "container");
                Context context2 = container.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                GestaltToast gestaltToast2 = new GestaltToast(6, context2, (AttributeSet) null);
                gestaltToast2.v(new r(this, container, gestaltToast2, 29));
                return gestaltToast2;
        }
    }

    @Override // we0.a
    public final void c(Context context) {
        switch (this.f77456d) {
            case 0:
                Intrinsics.checkNotNullParameter(context, "context");
                this.f77459g.invoke();
                super.c(context);
                break;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                this.f77458f.invoke();
                break;
        }
    }
}
