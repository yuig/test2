package a81;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.pinterest.api.model.vq;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: i */
    public final /* synthetic */ int f1506i;

    /* renamed from: j */
    public final /* synthetic */ Matrix f1507j;

    /* renamed from: k */
    public final /* synthetic */ RectF f1508k;

    /* renamed from: l */
    public final /* synthetic */ vq f1509l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Matrix matrix, RectF rectF, vq vqVar, int i13) {
        super(1);
        this.f1506i = i13;
        this.f1507j = matrix;
        this.f1508k = rectF;
        this.f1509l = vqVar;
    }

    public final z71.f b(z71.f blockConfig) {
        int i13 = this.f1506i;
        vq vqVar = this.f1509l;
        RectF rectF = this.f1508k;
        Matrix matrix = this.f1507j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(blockConfig, "blockConfig");
                return z71.f.a(blockConfig, new Matrix(matrix), new vq(vqVar), new RectF(rectF), 3);
            default:
                Intrinsics.checkNotNullParameter(blockConfig, "blockConfig");
                return z71.f.a(blockConfig, new Matrix(matrix), new vq(vqVar), new RectF(rectF), 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f1506i) {
        }
        return b((z71.f) obj);
    }
}
