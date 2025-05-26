package t3;

import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k2 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f116054i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f116055j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f116056k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Serializable f116057l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(ln2.a0 a0Var, boolean z13, tm2.i0 i0Var) {
        super(0);
        this.f116056k = a0Var;
        this.f116055j = z13;
        this.f116057l = i0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list;
        int i13 = this.f116054i;
        boolean z13 = this.f116055j;
        Serializable serializable = this.f116057l;
        Object obj = this.f116056k;
        switch (i13) {
            case 0:
                if (z13) {
                    ma.g gVar = (ma.g) obj;
                    String key = (String) serializable;
                    gVar.getClass();
                    Intrinsics.checkNotNullParameter(key, "key");
                    gVar.f86753a.d(key);
                }
                return Unit.f80348a;
            default:
                ln2.a0 a0Var = (ln2.a0) obj;
                ln2.e0 a13 = a0Var.a((am2.m) a0Var.f84059a.f82655d);
                if (a13 != null) {
                    tm2.i0 i0Var = (tm2.i0) serializable;
                    lb.p0 p0Var = a0Var.f84059a;
                    list = z13 ? CollectionsKt.F0(((ln2.o) p0Var.f82653b).f84112e.k(a13, i0Var)) : CollectionsKt.F0(((ln2.o) p0Var.f82653b).f84112e.e(a13, i0Var));
                } else {
                    list = null;
                }
                return list == null ? kotlin.collections.q0.f80391a : list;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(boolean z13, ma.g gVar, String str) {
        super(0);
        this.f116055j = z13;
        this.f116056k = gVar;
        this.f116057l = str;
    }
}
