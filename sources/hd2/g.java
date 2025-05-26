package hd2;

import android.opengl.Matrix;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f68924i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a f68925j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f68926k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f68927l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f68928m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(a aVar, float f13, float f14, float f15, int i13) {
        super(1);
        this.f68924i = i13;
        this.f68925j = aVar;
        this.f68926k = f13;
        this.f68927l = f14;
        this.f68928m = f15;
    }

    public final void b(float[] it) {
        int i13 = this.f68924i;
        a aVar = this.f68925j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                Matrix.perspectiveM(it, 0, (float) (aVar.f68913a * 360.0d), this.f68926k, this.f68927l, this.f68928m);
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                Matrix.rotateM(it, 0, (float) (aVar.f68913a * 360.0d), this.f68926k, this.f68927l, this.f68928m);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f68924i) {
            case 0:
                b((float[]) obj);
                break;
            default:
                b((float[]) obj);
                break;
        }
        return Unit.f80348a;
    }
}
