package ca0;

import androidx.compose.foundation.layout.FillElement;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import t3.f2;
import t3.s3;

/* loaded from: classes5.dex */
public final class k0 extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q1.h0 f27135i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f27136j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.pinterest.shuffles.scene.composer.z0 f27137k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n72.m f27138l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u50.r f27139m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s3 f27140n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(q1.h0 h0Var, d dVar, com.pinterest.shuffles.scene.composer.z0 z0Var, n72.m mVar, u50.r rVar, s3 s3Var) {
        super(3);
        this.f27135i = h0Var;
        this.f27136j = dVar;
        this.f27137k = z0Var;
        this.f27138l = mVar;
        this.f27139m = rVar;
        this.f27140n = s3Var;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p1.x0 contentPadding = (p1.x0) obj;
        i2.o oVar = (i2.o) obj2;
        int intValue = ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        if ((intValue & 14) == 0) {
            intValue |= ((i2.s) oVar).h(contentPadding) ? 4 : 2;
        }
        if ((intValue & 91) == 18) {
            i2.s sVar = (i2.s) oVar;
            if (sVar.z()) {
                sVar.Q();
                return Unit.f80348a;
            }
        }
        i2.s sVar2 = (i2.s) oVar;
        z2.j jVar = (z2.j) sVar2.m(f2.f115984g);
        float A = com.bumptech.glide.d.A(eo1.c.space_400, sVar2);
        FillElement fillElement = androidx.compose.foundation.layout.e.f17184c;
        fc0.g gVar = (fc0.g) ((fc0.f) sVar2.m(fc0.h.f61707g));
        int i13 = gVar.f61695a;
        rl2.g0.e(androidx.compose.foundation.layout.b.m(androidx.compose.foundation.a.b(fillElement, gVar.f61696b, b3.s0.f21349a), contentPadding), this.f27135i, androidx.compose.foundation.layout.b.c(A, A, 0.0f, 10), false, null, null, null, false, new r60.d(this.f27136j, this.f27137k, this.f27138l, this.f27139m, this.f27140n, jVar, 1), sVar2, 0, RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER);
        return Unit.f80348a;
    }
}
