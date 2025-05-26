package tm0;

import com.pinterest.api.model.v7;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import om0.s;
import om0.t;
import om0.z;
import qm0.t0;

/* loaded from: classes5.dex */
public final class k implements h {

    /* renamed from: a, reason: collision with root package name */
    public final gi2.b f118136a;

    public k(gi2.b optionsGenerator) {
        jl0.b viewModelMapper = jl0.b.f76936a;
        Intrinsics.checkNotNullParameter(viewModelMapper, "viewModelMapper");
        Intrinsics.checkNotNullParameter(optionsGenerator, "optionsGenerator");
        this.f118136a = optionsGenerator;
    }

    public static s b(dl0.a aVar, Function1 function1) {
        return ((Boolean) function1.invoke(aVar)).booleanValue() ? s.f96582c : s.f96584e;
    }

    @Override // tm0.h
    public final z a(v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        dl0.a a13 = jl0.b.f76936a.a(board);
        z zVar = t0.f104343a;
        t endActions = new t(b(a13, j.f118132j), b(a13, j.f118133k), b(a13, j.f118134l), b(a13, new kl0.t(this, 16)), 16);
        om0.a startAction = zVar.f96620a;
        Intrinsics.checkNotNullParameter(startAction, "startAction");
        Intrinsics.checkNotNullParameter(endActions, "endActions");
        return new z(startAction, endActions);
    }
}
