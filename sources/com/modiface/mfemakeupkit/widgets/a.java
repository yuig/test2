package com.modiface.mfemakeupkit.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes7.dex */
public final class a extends View {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MFEBeforeAfterMakeupView f34766a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(MFEBeforeAfterMakeupView mFEBeforeAfterMakeupView, Context context) {
        super(context);
        this.f34766a = mFEBeforeAfterMakeupView;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f34766a.drawOnOverlayView(canvas);
    }
}
