package j1;

import com.pinterest.api.model.aq0;
import com.pinterest.api.model.er;
import com.pinterest.api.model.oq;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f74280i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f74281j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Serializable f74282k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f74283l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f74284m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f74285n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(String str, String str2, float f13, aq0 aq0Var, er erVar) {
        super(1);
        this.f74282k = str;
        this.f74283l = str2;
        this.f74281j = f13;
        this.f74284m = aq0Var;
        this.f74285n = erVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f74280i;
        Object obj2 = this.f74285n;
        Object obj3 = this.f74284m;
        Object obj4 = this.f74283l;
        Serializable serializable = this.f74282k;
        switch (i13) {
            case 0:
                long longValue = ((Number) obj).longValue();
                Object obj5 = ((kotlin.jvm.internal.j0) serializable).f80434a;
                Intrinsics.f(obj5);
                e.m((m) obj5, longValue, this.f74281j, (j) obj4, (o) obj3, (Function1) obj2);
                return Unit.f80348a;
            default:
                oq textBlock = (oq) obj;
                Intrinsics.checkNotNullParameter(textBlock, "textBlock");
                return oq.h(textBlock, null, null, (String) serializable, (String) obj4, this.f74281j, (aq0) obj3, (er) obj2, 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(kotlin.jvm.internal.j0 j0Var, float f13, j jVar, o oVar, Function1 function1) {
        super(1);
        this.f74282k = j0Var;
        this.f74281j = f13;
        this.f74283l = jVar;
        this.f74284m = oVar;
        this.f74285n = function1;
    }
}
