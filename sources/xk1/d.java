package xk1;

import dl1.s;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import vq0.h;
import wt1.f;
import yk1.m;
import yk1.n;

/* loaded from: classes5.dex */
public final class d extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135194a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f135195b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f135196c;

    public d(int i13, f fVar, Function2 function2) {
        this.f135194a = i13;
        this.f135195b = fVar;
        this.f135196c = function2;
    }

    @Override // vq0.h
    public final /* bridge */ /* synthetic */ void c(n nVar, Object obj, int i13) {
        switch (this.f135194a) {
            case 0:
                h(nVar, (s) obj, i13);
                break;
            default:
                h(nVar, (s) obj, i13);
                break;
        }
    }

    @Override // vq0.h
    public final m f() {
        int i13 = this.f135194a;
        f fVar = this.f135195b;
        switch (i13) {
            case 0:
                fVar.getClass();
                break;
            default:
                fVar.getClass();
                break;
        }
        return new wt1.e(fVar);
    }

    @Override // vq0.h
    public final /* bridge */ /* synthetic */ String g(int i13, Object obj) {
        switch (this.f135194a) {
        }
        return i(i13, (s) obj);
    }

    public final void h(n view, s model, int i13) {
        int i14 = this.f135194a;
        f fVar = this.f135195b;
        Function2 function2 = this.f135196c;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                i0 i0Var = (i0) function2.invoke(model, Integer.valueOf(i13));
                fVar.getClass();
                f.j(view, i0Var);
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                i0 i0Var2 = (i0) function2.invoke(model, Integer.valueOf(i13));
                fVar.getClass();
                f.j(view, i0Var2);
                break;
        }
    }

    public final String i(int i13, s model) {
        int i14 = this.f135194a;
        f fVar = this.f135195b;
        Function2 function2 = this.f135196c;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            default:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
        }
        return fVar.g(i13, function2.invoke(model, Integer.valueOf(i13)));
    }
}
