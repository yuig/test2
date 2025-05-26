package ru0;

import a42.o;
import android.graphics.RectF;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.mq;
import com.pinterest.api.model.qq;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.ideaPinCreation.closeup.view.a2;
import j1.p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109987i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ qq f109988j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j f109989k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RectF f109990l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function1 f109991m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(qq qqVar, p0 p0Var, j jVar, RectF rectF) {
        super(1);
        this.f109988j = qqVar;
        this.f109991m = p0Var;
        this.f109989k = jVar;
        this.f109990l = rectF;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f109987i) {
            case 0:
                wy0 user = (wy0) obj;
                Intrinsics.checkNotNullParameter(user, "user");
                a2 a2Var = a2.AT_MENTION_TAG;
                String j13 = a.a.j("@", user.z4());
                j.r3(this.f109988j, this.f109991m, this.f109989k, this.f109990l, a2Var, j13);
                break;
            default:
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(pin, "pin");
                qq qqVar = this.f109988j;
                if (((mq) qqVar).getVariantType() == o.THUMBNAIL) {
                    j.q3(qqVar, this.f109989k, this.f109990l, this.f109991m, pin);
                } else {
                    a2 a2Var2 = a2.PRODUCT_TAG;
                    String r43 = pin.r4();
                    if (r43 == null) {
                        r43 = "";
                    }
                    j jVar = this.f109989k;
                    RectF rectF = this.f109990l;
                    j.r3(this.f109988j, this.f109991m, jVar, rectF, a2Var2, r43);
                }
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(qq qqVar, j jVar, RectF rectF, p0 p0Var) {
        super(1);
        this.f109988j = qqVar;
        this.f109989k = jVar;
        this.f109990l = rectF;
        this.f109991m = p0Var;
    }
}
