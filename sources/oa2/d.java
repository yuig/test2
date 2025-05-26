package oa2;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import z40.y;

/* loaded from: classes4.dex */
public final class d extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f93858i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f93859j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(g gVar, int i13) {
        super(0);
        this.f93858i = i13;
        this.f93859j = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        s60.d dVar;
        int i13 = this.f93858i;
        g gVar = this.f93859j;
        switch (i13) {
            case 0:
                y yVar = gVar.f93905s;
                String a13 = yVar != null ? yVar.a() : null;
                return a13 == null ? "" : a13;
            case 1:
                y yVar2 = gVar.f93905s;
                if (yVar2 == null || !Intrinsics.d(yVar2.m(), Boolean.TRUE)) {
                    nk1.n nVar = gVar.f93906t;
                    if (nVar == null) {
                        return null;
                    }
                    nVar.f();
                    return Unit.f80348a;
                }
                y yVar3 = gVar.f93905s;
                if (yVar3 == null || (dVar = gVar.f93907u) == null) {
                    return null;
                }
                return dVar.d(yVar3.a()).o(new e82.b(19, e.f93860j), new e82.b(20, e.f93861k));
            case 2:
                m195invoke();
                return Unit.f80348a;
            case 3:
                m195invoke();
                return Unit.f80348a;
            default:
                return (HashMap) gVar.f93897k.invoke(null);
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m195invoke() {
        y yVar;
        int i13 = this.f93858i;
        g gVar = this.f93859j;
        switch (i13) {
            case 2:
                d dVar = new d(gVar, 1);
                y yVar2 = gVar.f93905s;
                if (yVar2 != null) {
                    Boolean d2 = yVar2.d();
                    Boolean bool = Boolean.TRUE;
                    if (Intrinsics.d(d2, bool) && (yVar = gVar.f93905s) != null && Intrinsics.d(yVar.j(), bool)) {
                        y yVar3 = gVar.f93905s;
                        if (yVar3 != null) {
                            gVar.f93899m.invoke(yVar3, new ax1.a(20, dVar));
                            break;
                        }
                    }
                }
                dVar.invoke();
                break;
            default:
                y yVar4 = gVar.f93905s;
                if (yVar4 != null) {
                    gVar.f93898l.invoke(yVar4);
                    break;
                }
                break;
        }
    }
}
