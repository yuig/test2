package hd2;

import android.opengl.Matrix;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class h extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f68929i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f68930j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f68931k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f68932l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(float f13, float f14, float f15, int i13) {
        super(1);
        this.f68929i = i13;
        this.f68930j = f13;
        this.f68931k = f14;
        this.f68932l = f15;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f13 = this.f68931k;
        float f14 = this.f68932l;
        float f15 = this.f68930j;
        int i13 = this.f68929i;
        switch (i13) {
            case 0:
                float[] it = (float[]) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        Matrix.scaleM(it, 0, f15, f13, f14);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        Matrix.translateM(it, 0, f15, f13, f14);
                        break;
                }
                break;
            default:
                float[] it2 = (float[]) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        Matrix.scaleM(it2, 0, f15, f13, f14);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        Matrix.translateM(it2, 0, f15, f13, f14);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
