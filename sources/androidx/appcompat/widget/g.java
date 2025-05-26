package androidx.appcompat.widget;

import a7.v0;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.g;
import com.pinterest.video.core.view.PinterestVideoView;
import kotlin.jvm.internal.Intrinsics;
import sf1.s;

/* loaded from: classes2.dex */
public final class g extends View {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f16564b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16565a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, Integer num) {
        super(context);
        Drawable mutate;
        this.f16565a = 3;
        Intrinsics.checkNotNullParameter(context, "context");
        int i13 = m60.s0.rounded_rect_grid_pin_placeholder;
        Object obj = d5.a.f53679a;
        setBackground(context.getDrawable(i13));
        if (num != null) {
            int intValue = num.intValue();
            Drawable background = getBackground();
            if (background == null || (mutate = background.mutate()) == null) {
                return;
            }
            mutate.setTint(intValue);
        }
    }

    @Override // android.view.View
    public final int getWindowSystemUiVisibility() {
        switch (this.f16565a) {
            case 0:
                return 0;
            default:
                return super.getWindowSystemUiVisibility();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, final sp0.e viewModel, x92.b developerPreferences) {
        super(context);
        this.f16565a = 1;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(developerPreferences, "developerPreferences");
        sp0.a aVar = viewModel.f114886b;
        int i13 = aVar.f114875a;
        int i14 = aVar.f114876b;
        setLayoutParams(new RelativeLayout.LayoutParams(i13, i14));
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        sp0.a aVar2 = viewModel.f114887c;
        c0.d.m2((RelativeLayout.LayoutParams) layoutParams, i13, i14, aVar2.f114875a, aVar2.f114876b);
        sp0.d dVar = viewModel.f114885a;
        setX(dVar.f114883a);
        setY(dVar.f114884b);
        setRotation(viewModel.f114888d);
        ((m60.d) ((m60.e) developerPreferences.f134366c)).g();
        final float f13 = i13 / 2.0f;
        final float f14 = i14 / 2.0f;
        setOnTouchListener(new View.OnTouchListener() { // from class: sp0.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean z13;
                v0 v0Var;
                int i15 = g.f16564b;
                g this$0 = g.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                e viewModel2 = viewModel;
                Intrinsics.checkNotNullParameter(viewModel2, "$viewModel");
                b bVar = viewModel2.f114889e;
                PinterestVideoView o13 = ((s) viewModel2.f114891g).o();
                Long valueOf = (o13 == null || (v0Var = o13.f18946k) == null) ? null : Long.valueOf(v0Var.X());
                this$0.getClass();
                if (valueOf != null && bVar != null) {
                    double d2 = bVar.f114878b;
                    if (d2 != 0.0d) {
                        double d13 = 1000L;
                        if (valueOf.longValue() < bVar.f114877a * d13 || valueOf.longValue() > d2 * d13) {
                            z13 = false;
                            if (z13 && motionEvent.getAction() == 0) {
                                return false;
                            }
                            if (!z13 && motionEvent.getAction() == 1) {
                                float f15 = -1;
                                float[] fArr = {motionEvent.getX(), motionEvent.getY() * f15};
                                Matrix matrix = new Matrix();
                                matrix.setRotate(360.0f - this$0.getRotation(), f13, f15 * f14);
                                matrix.mapPoints(fArr);
                                fArr[0] = view.getX() + fArr[0];
                                float y13 = view.getY() - fArr[1];
                                fArr[1] = y13;
                                viewModel2.f114890f.invoke(new d(fArr[0], y13));
                                return true;
                            }
                        }
                    }
                }
                z13 = true;
                if (z13) {
                }
                return !z13 ? true : true;
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, int i13) {
        super(context);
        this.f16565a = i13;
        if (i13 == 2) {
            Intrinsics.checkNotNullParameter(context, "context");
            super(context);
            int i14 = nv1.c.rounded_rect_onebar_guide_placeholder;
            Object obj = d5.a.f53679a;
            setBackground(context.getDrawable(i14));
            return;
        }
        if (i13 != 4) {
            setWillNotDraw(true);
            return;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        super(context);
        int i15 = m60.s0.rounded_rect_tab_placeholder;
        Object obj2 = d5.a.f53679a;
        setBackground(context.getDrawable(i15));
    }
}
