package wt0;

import android.graphics.Matrix;
import com.pinterest.api.model.rq;
import com.pinterest.api.model.vq;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f131088i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Matrix f131089j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ vq f131090k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Matrix matrix, vq vqVar, int i13) {
        super(1);
        this.f131088i = i13;
        this.f131089j = matrix;
        this.f131090k = vqVar;
    }

    public final rq b(rq config) {
        int i13 = this.f131088i;
        vq vqVar = this.f131090k;
        Matrix matrix = this.f131089j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(config, "config");
                return rq.a(config, null, matrix, vqVar, 7);
            default:
                Intrinsics.checkNotNullParameter(config, "blockConfig");
                return rq.a(config, null, new Matrix(matrix), new vq(vqVar), 7);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f131088i) {
        }
        return b((rq) obj);
    }
}
