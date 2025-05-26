package com.pinterest.feature.pincarouselads.view;

import android.graphics.Paint;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f47379i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f47380j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(l lVar, int i13) {
        super(0);
        this.f47379i = i13;
        this.f47380j = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f47379i;
        l lVar = this.f47380j;
        switch (i13) {
            case 0:
                return new qa2.c(lVar);
            default:
                Paint paint = new Paint(1);
                paint.setColor(dl2.b.y0(lVar, eo1.a.color_background_dark_opacity_100));
                return paint;
        }
    }
}
