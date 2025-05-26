package zd2;

import android.opengl.GLES20;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class f extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.a f141791i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f141792j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f141793k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f141794l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f141795m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.widget.a aVar, float f13, float f14, float f15, float f16) {
        super(0);
        this.f141791i = aVar;
        this.f141792j = f13;
        this.f141793k = f14;
        this.f141794l = f15;
        this.f141795m = f16;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        GLES20.glUniform4f(this.f141791i.f16502a, this.f141792j, this.f141793k, this.f141794l, this.f141795m);
        return Unit.f80348a;
    }
}
