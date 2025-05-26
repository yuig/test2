package ym1;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class s implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ha.a f139453a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f139454b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f139455c;

    public /* synthetic */ s(ha.a aVar, View view, Function0 function0) {
        this.f139453a = aVar;
        this.f139454b = view;
        this.f139455c = function0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i13;
        int i14;
        ha.a this$0 = this.f139453a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View anchorView = this.f139454b;
        Intrinsics.checkNotNullParameter(anchorView, "$anchorView");
        Function0 onTouch = this.f139455c;
        Intrinsics.checkNotNullParameter(onTouch, "$onTouch");
        Intrinsics.f(view);
        Intrinsics.f(motionEvent);
        this$0.getClass();
        int[] iArr = {(int) (motionEvent.getX() + r5), (int) (motionEvent.getY() + r6)};
        view.getLocationOnScreen(iArr);
        float f13 = iArr[0];
        float f14 = iArr[1];
        int[] iArr2 = new int[2];
        anchorView.getLocationOnScreen(iArr2);
        int i15 = iArr[0];
        int i16 = iArr2[0];
        boolean z13 = i15 >= i16 && i15 <= anchorView.getMeasuredWidth() + i16 && (i13 = iArr[1]) >= (i14 = iArr2[1]) && i13 <= anchorView.getMeasuredHeight() + i14;
        if (motionEvent.getAction() == 0 && z13) {
            view.performClick();
            onTouch.invoke();
        }
        return false;
    }
}
