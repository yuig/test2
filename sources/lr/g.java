package lr;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.c2;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import df.j1;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import rg0.i0;

/* loaded from: classes3.dex */
public final class g extends we0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f84511d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final Object f84512e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f84513f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f84514g;

    /* renamed from: h, reason: collision with root package name */
    public Object f84515h;

    public g(f30 pin, String str, String boardName, c2 sharesheetUtils) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
        this.f84512e = pin;
        this.f84513f = str;
        this.f84514g = boardName;
        this.f84515h = sharesheetUtils;
    }

    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        Object obj;
        String str;
        int i13 = this.f84511d;
        Object obj2 = this.f84513f;
        Object obj3 = this.f84514g;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(container, "container");
                v7 v7Var = (v7) obj3;
                Boolean Y0 = v7Var.Y0();
                Intrinsics.checkNotNullExpressionValue(Y0, "getHasCustomCover(...)");
                if (Y0.booleanValue() && j1.d1(kh2.d.L(v7Var))) {
                    str = kh2.d.L(v7Var);
                } else {
                    Iterator it = kh2.d.h1(v7Var).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (j1.d1((String) obj)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    str = (String) obj;
                }
                Context context = container.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int i14 = h70.c.merge_board_completed_message;
                String j13 = ((v7) obj2).j1();
                Intrinsics.checkNotNullExpressionValue(j13, "getName(...)");
                String j14 = v7Var.j1();
                Intrinsics.checkNotNullExpressionValue(j14, "getName(...)");
                return new GestaltToast(context, new do1.d(bs1.c.j2(new String[]{j13, j14}, i14), str != null ? new do1.j(str) : null, null, null, 0, 0, 0, null, false, 508));
            case 1:
                Intrinsics.checkNotNullParameter(container, "container");
                Context context2 = container.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                GestaltToast gestaltToast = new GestaltToast(6, context2, (AttributeSet) null);
                gestaltToast.v(new e.f(container, this, gestaltToast, 24));
                return gestaltToast;
            default:
                Intrinsics.checkNotNullParameter(container, "container");
                Context context3 = container.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                b0 b0Var = (b0) obj3;
                b0 b0Var2 = b0.Delete;
                Object obj4 = this.f84512e;
                return new GestaltToast(context3, new do1.d(b0Var == b0Var2 ? bs1.c.j2(new String[]{(String) obj4}, f02.g.delete_toast_confirm) : bs1.c.j2(new String[]{(String) obj4}, f02.g.restore_toast_confirm), new do1.j((String) obj2), b0Var == b0Var2 ? new do1.b(bs1.c.j2(new String[0], f02.g.restore), new v(this, 1)) : null, null, 0, 3600, 0, null, false, 472));
        }
    }

    @Override // we0.a
    public final void b(Context context) {
        int i13 = this.f84511d;
        Object obj = this.f84512e;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(context, "context");
                ((nx.d0) obj).N(f1.TAP, u0.MERGE_CONFIRMATION_TOAST, g0.TOAST, ((v7) this.f84513f).getUid(), false);
                g70.h.f((g70.h) this.f84515h, (v7) this.f84514g, e.f84493k, 2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(context, "context");
                ((c2) this.f84515h).q(y32.f.SHARE_UPSELL.value(), (f30) obj);
                break;
            default:
                super.b(context);
                break;
        }
    }

    @Override // we0.a
    public final void c(Context context) {
        switch (this.f84511d) {
            case 1:
                Intrinsics.checkNotNullParameter(context, "context");
                g4.u uVar = i0.f108029b;
                String uid = ((f30) this.f84512e).getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                g4.u.v0(uVar, uid, null, 6);
                break;
            default:
                super.c(context);
                break;
        }
    }

    public g(String boardName, String boardCoverImageUrl, b0 softDeletionAction) {
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        Intrinsics.checkNotNullParameter(boardCoverImageUrl, "boardCoverImageUrl");
        Intrinsics.checkNotNullParameter(softDeletionAction, "softDeletionAction");
        this.f84512e = boardName;
        this.f84513f = boardCoverImageUrl;
        this.f84514g = softDeletionAction;
        this.f84515h = o.f84534k;
    }

    public g(nx.d0 pinalytics, v7 mergedBoard, v7 destinationBoard, g70.h boardNavigator) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(mergedBoard, "mergedBoard");
        Intrinsics.checkNotNullParameter(destinationBoard, "destinationBoard");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f84512e = pinalytics;
        this.f84513f = mergedBoard;
        this.f84514g = destinationBoard;
        this.f84515h = boardNavigator;
    }
}
