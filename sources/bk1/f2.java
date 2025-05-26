package bk1;

import android.content.Context;
import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f2 implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final ro1.d f23221a;

    /* renamed from: b, reason: collision with root package name */
    public final bs.g f23222b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f23223c;

    /* renamed from: d, reason: collision with root package name */
    public final xk2.v f23224d;

    /* renamed from: e, reason: collision with root package name */
    public final xk2.v f23225e;

    public f2(ro1.d oneTapTypeProvider, bs.g quarantineResultsProvider, Context context) {
        Intrinsics.checkNotNullParameter(oneTapTypeProvider, "oneTapTypeProvider");
        Intrinsics.checkNotNullParameter(quarantineResultsProvider, "quarantineResultsProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f23221a = oneTapTypeProvider;
        this.f23222b = quarantineResultsProvider;
        this.f23223c = context;
        this.f23224d = xk2.m.b(new e2(this, 1));
        this.f23225e = xk2.m.b(new e2(this, 0));
    }

    @Override // l82.g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void e(ao2.j0 scope, r0 request, u50.r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof r0) {
            f30 f30Var = request.f23308a;
            String u33 = f30Var.u3();
            ((ro1.c) this.f23221a).getClass();
            ps0.y yVar = ro1.c.f108967f;
            ro1.b e13 = ps0.y.e(u33);
            bs.f fVar = (bs.f) this.f23224d.getValue();
            boolean booleanValue = ((Boolean) this.f23225e.getValue()).booleanValue();
            String uid = f30Var.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            eventIntake.a(new s(e13, fVar, booleanValue, uid));
        }
    }
}
