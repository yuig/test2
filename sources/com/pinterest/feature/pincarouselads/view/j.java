package com.pinterest.feature.pincarouselads.view;

import android.graphics.RectF;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final j f47381j = new j(0);

    /* renamed from: k, reason: collision with root package name */
    public static final j f47382k = new j(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f47383i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i13) {
        super(0);
        this.f47383i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f47383i) {
            case 0:
                return new RectF();
            default:
                return "SingleColumnCarouselPinView";
        }
    }
}
