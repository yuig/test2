package hg0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rg0.m;
import rg0.n;

/* loaded from: classes5.dex */
public final class h extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69072i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f69073j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, int i13) {
        super(1);
        this.f69072i = i13;
        this.f69073j = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f69072i;
        i iVar = this.f69073j;
        switch (i13) {
            case 0:
                n nVar = iVar.f69079h;
                if (nVar == null) {
                    Intrinsics.r("experienceValue");
                    throw null;
                }
                nVar.a(null, null);
                iVar.h(a.f69061a);
                m mVar = iVar.f69080i;
                if (mVar == null) {
                    Intrinsics.r("displayData");
                    throw null;
                }
                String str = mVar.f108053d;
                if (str != null) {
                    iVar.f69075d.m(str);
                }
                iVar.f69081j.d();
                return Unit.f80348a;
            default:
                n nVar2 = iVar.f69079h;
                if (nVar2 == null) {
                    Intrinsics.r("experienceValue");
                    throw null;
                }
                nVar2.c(null, null);
                iVar.h(b.f69062a);
                m mVar2 = iVar.f69080i;
                if (mVar2 == null) {
                    Intrinsics.r("displayData");
                    throw null;
                }
                String str2 = mVar2.f108054e;
                if (str2 != null) {
                    iVar.f69075d.i(str2);
                }
                iVar.f69081j.d();
                return Unit.f80348a;
        }
    }
}
