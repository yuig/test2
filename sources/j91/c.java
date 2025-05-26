package j91;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import q5.b1;

/* loaded from: classes5.dex */
public final class c extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f75107i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ View f75108j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d f75109k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(float f13, View view, d dVar) {
        super(0);
        this.f75107i = f13;
        this.f75108j = view;
        this.f75109k = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new OvershootInterpolator(this.f75107i));
        ofFloat.addUpdateListener(new b1(this.f75108j, this.f75109k));
        ofFloat.start();
        return Unit.f80348a;
    }
}
