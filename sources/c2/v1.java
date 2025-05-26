package c2;

import android.opengl.GLES20;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class v1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f25299i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f25300j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f25301k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f25302l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(float f13, i2 i2Var) {
        super(0);
        this.f25299i = 0;
        this.f25300j = f13;
        this.f25301k = 0.0f;
        this.f25302l = i2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f25299i;
        float f13 = this.f25301k;
        float f14 = this.f25300j;
        Object obj = this.f25302l;
        switch (i13) {
            case 0:
                float f15 = ((i2) obj).f24842a.f();
                float f16 = g2.f24759a;
                float f17 = (f15 - f14) / (f13 - f14);
                if (f17 < 0.0f) {
                    f17 = 0.0f;
                }
                if (f17 > 1.0f) {
                    f17 = 1.0f;
                }
                return Float.valueOf(f17);
            default:
                GLES20.glUniform2f(((androidx.appcompat.widget.a) obj).f16502a, f14, f13);
                return Unit.f80348a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(androidx.appcompat.widget.a aVar, float f13, float f14) {
        super(0);
        this.f25299i = 1;
        this.f25302l = aVar;
        this.f25300j = f13;
        this.f25301k = f14;
    }
}
