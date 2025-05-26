package ub;

import androidx.work.impl.WorkDatabase;
import ja.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lb.j0;

/* loaded from: classes3.dex */
public final class a extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f121642i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j0 f121643j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f121644k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, j0 j0Var) {
        super(0);
        this.f121644k = str;
        this.f121643j = j0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f121642i) {
            case 0:
                m270invoke();
                break;
            default:
                m270invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(j0 j0Var, String str) {
        super(0);
        this.f121643j = j0Var;
        this.f121644k = str;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m270invoke() {
        int i13 = this.f121642i;
        String name = this.f121644k;
        j0 workManagerImpl = this.f121643j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
                WorkDatabase workDatabase = workManagerImpl.f82607d;
                Intrinsics.checkNotNullExpressionValue(workDatabase, "workManagerImpl.workDatabase");
                workDatabase.q(new h6.o(workDatabase, name, workManagerImpl, 10));
                lb.s.b(workManagerImpl.f82606c, workManagerImpl.f82607d, workManagerImpl.f82609f);
                break;
            default:
                WorkDatabase workDatabase2 = workManagerImpl.f82607d;
                Intrinsics.checkNotNullExpressionValue(workDatabase2, "workManagerImpl.workDatabase");
                workDatabase2.q(new y(workDatabase2, name, workManagerImpl, 2));
                lb.s.b(workManagerImpl.f82606c, workManagerImpl.f82607d, workManagerImpl.f82609f);
                break;
        }
    }
}
