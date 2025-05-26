package oa2;

import com.pinterest.api.model.wy0;
import i01.r0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f93919i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f93920j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(o oVar, int i13) {
        super(0);
        this.f93919i = i13;
        this.f93920j = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String f39332b;
        wy0 wy0Var;
        int i13 = this.f93919i;
        o oVar = this.f93920j;
        switch (i13) {
            case 0:
                wy0 wy0Var2 = oVar.f93942t;
                if (wy0Var2 != null) {
                    return new xr0.a(wy0Var2, null, null, 34);
                }
                return null;
            case 1:
                wy0 wy0Var3 = oVar.f93942t;
                f39332b = wy0Var3 != null ? wy0Var3.getF39332b() : null;
                return f39332b == null ? "" : f39332b;
            case 2:
                nk1.m mVar = oVar.f93943u;
                if (mVar == null) {
                    return null;
                }
                mVar.f();
                return Unit.f80348a;
            case 3:
                wy0 wy0Var4 = oVar.f93942t;
                if (wy0Var4 == null || !Intrinsics.d(wy0Var4.s2(), Boolean.TRUE)) {
                    m mVar2 = new m(oVar, 2);
                    wy0 wy0Var5 = oVar.f93942t;
                    if (wy0Var5 != null) {
                        Boolean R2 = wy0Var5.R2();
                        Boolean bool = Boolean.TRUE;
                        if (Intrinsics.d(R2, bool) && (wy0Var = oVar.f93942t) != null && Intrinsics.d(wy0Var.J3(), bool)) {
                            wy0 wy0Var6 = oVar.f93942t;
                            if (wy0Var6 != null) {
                                oVar.f93936n.invoke(wy0Var6, new ax1.a(21, mVar2));
                            }
                        }
                    }
                    mVar2.invoke();
                } else {
                    s60.d dVar = oVar.f93944v;
                    if (dVar != null) {
                        wy0 wy0Var7 = oVar.f93942t;
                        f39332b = wy0Var7 != null ? wy0Var7.getF39332b() : null;
                        dVar.d(f39332b != null ? f39332b : "").i().i(new r0(22), new e82.b(25, e.A));
                    }
                }
                return Unit.f80348a;
            default:
                return (HashMap) oVar.f93933k.invoke(null);
        }
    }
}
