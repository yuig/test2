package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import h32.d4;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/closeup/view/IdeaPinColorEyeDropperView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinColorEyeDropperView extends FrameLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f45980i = 0;

    /* renamed from: a, reason: collision with root package name */
    public RectF f45981a;

    /* renamed from: b, reason: collision with root package name */
    public String f45982b;

    /* renamed from: c, reason: collision with root package name */
    public cu0.c f45983c;

    /* renamed from: d, reason: collision with root package name */
    public yt0.b f45984d;

    /* renamed from: e, reason: collision with root package name */
    public final int f45985e;

    /* renamed from: f, reason: collision with root package name */
    public final int f45986f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f45987g;

    /* renamed from: h, reason: collision with root package name */
    public final View f45988h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinColorEyeDropperView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        int W = bs1.c.W(this, aq1.b.idea_pin_color_eye_dropper_width);
        this.f45985e = W;
        int W2 = bs1.c.W(this, aq1.b.idea_pin_color_eye_dropper_height);
        this.f45986f = W2;
        View view = new View(getContext());
        view.setLayoutParams(new FrameLayout.LayoutParams(W, W2));
        final int i13 = 1;
        view.setOnTouchListener(new View.OnTouchListener(this) { // from class: com.pinterest.feature.ideaPinCreation.closeup.view.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdeaPinColorEyeDropperView f46197b;

            {
                this.f46197b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                int i14 = i13;
                IdeaPinColorEyeDropperView.b(this.f46197b, motionEvent);
                return true;
            }
        });
        this.f45988h = view;
        final View view2 = new View(getContext());
        view2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context2 = view2.getContext();
        int i14 = eo1.b.color_themed_transparent;
        Object obj = d5.a.f53679a;
        view2.setBackgroundColor(context2.getColor(i14));
        view2.setOnTouchListener(new View.OnTouchListener(this) { // from class: com.pinterest.feature.ideaPinCreation.closeup.view.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdeaPinColorEyeDropperView f46203b;

            {
                this.f46203b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                int i15 = i13;
                IdeaPinColorEyeDropperView.a(this.f46203b, view2, motionEvent);
                return true;
            }
        });
        addView(view2);
        addView(view);
    }

    public static void a(IdeaPinColorEyeDropperView this$0, View this_apply, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        if (motionEvent.getActionMasked() == 1) {
            this_apply.postDelayed(new dp.a(25, this$0, this$0.c((int) motionEvent.getRawX(), (int) motionEvent.getRawY())), 200L);
        }
    }

    public static void b(IdeaPinColorEyeDropperView this$0, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            cu0.c cVar = this$0.f45983c;
            if (cVar != null) {
                ((f0) cVar).z0(this$0.f45982b);
            }
            yt0.b bVar = this$0.f45984d;
            if (bVar != null) {
                h32.u0 u0Var = h32.u0.STORY_PIN_COLOR_SELECTION_BUTTON;
                d4 d4Var = d4.STORY_PIN_PAGE_TEXT_EDITOR_TOOL;
                HashMap hashMap = new HashMap();
                bs1.c.G1("story_pin_select_name", this$0.f45982b, hashMap);
                Unit unit = Unit.f80348a;
                ((f0) bVar).k0(u0Var, d4Var, hashMap);
            }
            this$0.f45987g = null;
            return;
        }
        if (actionMasked != 2) {
            return;
        }
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        RectF rectF = this$0.f45981a;
        if (rectF != null) {
            float f13 = rawX;
            if (f13 < rectF.left || f13 > rectF.right) {
                return;
            }
            float f14 = rawY;
            if (f14 < rectF.top || f14 > rectF.bottom) {
                return;
            }
        }
        this$0.f45982b = this$0.c(rawX, rawY);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String c(int r9, int r10) {
        /*
            r8 = this;
            int r0 = r8.f45985e
            int r0 = r0 / 2
            int r0 = r9 - r0
            int r1 = r8.f45986f
            int r1 = r10 - r1
            android.view.View r2 = r8.f45988h
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            java.lang.String r4 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            kotlin.jvm.internal.Intrinsics.g(r3, r4)
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            int r4 = r3.leftMargin
            r5 = 0
            r6 = 1
            if (r4 == r0) goto L1f
            r4 = r6
            goto L20
        L1f:
            r4 = r5
        L20:
            int r7 = r3.topMargin
            if (r7 == r1) goto L25
            goto L26
        L25:
            r6 = r5
        L26:
            r3.leftMargin = r0
            r3.topMargin = r1
            if (r4 != 0) goto L2e
            if (r6 == 0) goto L31
        L2e:
            r2.setLayoutParams(r3)
        L31:
            android.graphics.RectF r0 = r8.f45981a
            if (r0 == 0) goto L3c
            float r0 = r0.left
            int r0 = ml2.c.c(r0)
            goto L3d
        L3c:
            r0 = r5
        L3d:
            int r9 = r9 - r0
            android.graphics.RectF r0 = r8.f45981a
            if (r0 == 0) goto L48
            float r0 = r0.top
            int r5 = ml2.c.c(r0)
        L48:
            int r10 = r10 - r5
            android.graphics.Bitmap r0 = r8.f45987g
            r1 = 0
            if (r0 == 0) goto L82
            if (r9 < 0) goto L82
            int r0 = r0.getWidth()
            if (r9 >= r0) goto L82
            if (r10 < 0) goto L82
            android.graphics.Bitmap r0 = r8.f45987g
            kotlin.jvm.internal.Intrinsics.f(r0)
            int r0 = r0.getHeight()
            if (r10 < r0) goto L64
            goto L82
        L64:
            android.graphics.Bitmap r0 = r8.f45987g
            kotlin.jvm.internal.Intrinsics.f(r0)
            int r9 = r0.getPixel(r9, r10)
            int r10 = android.graphics.Color.red(r9)
            int r0 = android.graphics.Color.green(r9)
            int r9 = android.graphics.Color.blue(r9)
            int r9 = android.graphics.Color.rgb(r10, r0, r9)
            java.lang.String r9 = kh2.c3.B(r9)
            goto L83
        L82:
            r9 = r1
        L83:
            if (r9 == 0) goto L9c
            java.lang.String r10 = "colorHex"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r10)
            com.pinterest.feature.ideaPinCreation.closeup.view.h r10 = new com.pinterest.feature.ideaPinCreation.closeup.view.h
            android.content.Context r0 = r8.getContext()
            java.lang.String r1 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r10.<init>(r0, r9)
            r2.setBackground(r10)
            r1 = r9
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.ideaPinCreation.closeup.view.IdeaPinColorEyeDropperView.c(int, int):java.lang.String");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinColorEyeDropperView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int W = bs1.c.W(this, aq1.b.idea_pin_color_eye_dropper_width);
        this.f45985e = W;
        int W2 = bs1.c.W(this, aq1.b.idea_pin_color_eye_dropper_height);
        this.f45986f = W2;
        View view = new View(getContext());
        view.setLayoutParams(new FrameLayout.LayoutParams(W, W2));
        final int i14 = 0;
        view.setOnTouchListener(new View.OnTouchListener(this) { // from class: com.pinterest.feature.ideaPinCreation.closeup.view.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdeaPinColorEyeDropperView f46197b;

            {
                this.f46197b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                int i142 = i14;
                IdeaPinColorEyeDropperView.b(this.f46197b, motionEvent);
                return true;
            }
        });
        this.f45988h = view;
        final View view2 = new View(getContext());
        view2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context2 = view2.getContext();
        int i15 = eo1.b.color_themed_transparent;
        Object obj = d5.a.f53679a;
        view2.setBackgroundColor(context2.getColor(i15));
        view2.setOnTouchListener(new View.OnTouchListener(this) { // from class: com.pinterest.feature.ideaPinCreation.closeup.view.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdeaPinColorEyeDropperView f46203b;

            {
                this.f46203b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                int i152 = i14;
                IdeaPinColorEyeDropperView.a(this.f46203b, view2, motionEvent);
                return true;
            }
        });
        addView(view2);
        addView(view);
    }
}
