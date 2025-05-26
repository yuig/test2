package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.graphics.Paint;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class x2 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f46374i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2 f46375j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x2(y2 y2Var, int i13) {
        super(0);
        this.f46374i = i13;
        this.f46375j = y2Var;
    }

    public final Paint b() {
        int i13 = this.f46374i;
        y2 y2Var = this.f46375j;
        switch (i13) {
            case 0:
                Paint paint = new Paint(1);
                Context context = y2Var.f46381a;
                int i14 = eo1.b.color_white_mochimalist_0_opacity_40;
                Object obj = d5.a.f53679a;
                paint.setColor(context.getColor(i14));
                return paint;
            default:
                Paint paint2 = new Paint(1);
                paint2.setColor(dl2.b.x0(y2Var.f46381a, eo1.a.base_color_grayscale_0));
                return paint2;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f46374i) {
        }
        return b();
    }
}
