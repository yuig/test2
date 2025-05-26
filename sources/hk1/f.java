package hk1;

import android.content.Context;
import ao2.j0;
import com.pinterest.api.model.f30;
import df.j1;
import h32.d4;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import m60.m0;
import so.oa;
import ua2.w0;

/* loaded from: classes2.dex */
public final class f implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f69350a;

    public f(m0 application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f69350a = application;
    }

    @Override // l82.g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void e(j0 scope, e request, u50.r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof e) {
            f30 f30Var = request.f69344a;
            Integer num = request.f69348e;
            String d2 = num != null ? bs1.c.d2(this.f69350a, num.intValue()) : null;
            Context context = kb0.a.f79058b;
            gs0.k w23 = ((oa) ((w0) j1.b0(w0.class, f0.W()))).w2();
            n nVar = request.f69345b;
            jo1.a aVar = nVar.f69359a;
            i0 i0Var = request.f69349f;
            d4 d4Var = i0Var.f67081a;
            ta2.b bVar = ta2.b.HAIR_PATTERN;
            ta2.b bVar2 = nVar.f69361c;
            gs0.k.a(w23, f30Var, aVar, false, false, null, request.f69346c, nVar.f69360b, d4Var, i0Var.f67082b, request.f69347d, null, null, false, null, null, d2, false, bVar2 == bVar, bVar2 == ta2.b.SKIN_TONE, bVar2 == ta2.b.BODY_TYPE, nVar.f69362d, null, false, 6388760).showFeedBack();
        }
    }
}
