package xt0;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.canvas.view.IdeaPinCreationCanvasCropperContainer;
import com.pinterest.feature.ideaPinCreation.common.view.IdeaPinEditablePageLite;
import h32.f1;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import ql2.s;

/* loaded from: classes5.dex */
public final class f extends View {

    /* renamed from: a, reason: collision with root package name */
    public final RectF f135912a;

    /* renamed from: b, reason: collision with root package name */
    public float f135913b;

    /* renamed from: c, reason: collision with root package name */
    public int f135914c;

    /* renamed from: d, reason: collision with root package name */
    public int f135915d;

    /* renamed from: e, reason: collision with root package name */
    public int f135916e;

    /* renamed from: f, reason: collision with root package name */
    public vt0.a f135917f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f135912a = new RectF();
    }

    public final void a(MotionEvent motionEvent) {
        vt0.a aVar = this.f135917f;
        if (aVar != null) {
            g gVar = (g) aVar;
            IdeaPinCreationCanvasCropperContainer ideaPinCreationCanvasCropperContainer = gVar.E0;
            if (ideaPinCreationCanvasCropperContainer == null) {
                Intrinsics.r("canvasCropperContainer");
                throw null;
            }
            ideaPinCreationCanvasCropperContainer.f45977i = false;
            gVar.Y7().o2();
            d0 d0Var = ((uk1.d) gVar.f62977o0.getValue()).f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
            d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1.STORY_PIN_ELEMENT_MOVE, (r18 & 2) != 0 ? null : u0.IDEA_PIN_CANVAS_CROPPER, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
        b(motionEvent);
        this.f135913b = 0.0f;
    }

    public final void b(MotionEvent motionEvent) {
        int rawY = this.f135914c + ((int) (motionEvent.getRawY() - this.f135913b));
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = s.g(rawY, 0, this.f135915d);
        setLayoutParams(marginLayoutParams);
    }

    @Override // android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        if (!z13 || i13 == i15 || i14 == i16) {
            return;
        }
        this.f135912a.set(i13, i14, i15, i16);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getActionIndex() != 0) {
            return true;
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.f135913b = event.getRawY();
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            this.f135914c = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            this.f135915d = Math.max(this.f135916e - getLayoutParams().height, 0);
        } else if (actionMasked == 1) {
            a(event);
        } else if (actionMasked == 2) {
            b(event);
            vt0.a aVar = this.f135917f;
            if (aVar != null) {
                g gVar = (g) aVar;
                IdeaPinCreationCanvasCropperContainer ideaPinCreationCanvasCropperContainer = gVar.E0;
                if (ideaPinCreationCanvasCropperContainer == null) {
                    Intrinsics.r("canvasCropperContainer");
                    throw null;
                }
                ideaPinCreationCanvasCropperContainer.f45977i = true;
                IdeaPinEditablePageLite.a0(gVar.Y7());
            }
        } else if (actionMasked == 3) {
            a(event);
        }
        return true;
    }
}
