package i91;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f71886i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f71887j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, int i13) {
        super(1);
        this.f71886i = i13;
        this.f71887j = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        r rVar = this.f71887j;
        int i13 = this.f71886i;
        switch (i13) {
            case 0:
                vd0.c cVar = (vd0.c) obj;
                vd0.c m13 = cVar != null ? cVar.m("data") : null;
                if (m13 != null) {
                    rVar.a(m13);
                }
                break;
            case 1:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 1:
                        tb0.h hVar = rVar.f71894g;
                        Intrinsics.f(th3);
                        hVar.o("SendShareService: inviteUserExternal failed", th3);
                        break;
                    default:
                        tb0.h hVar2 = rVar.f71894g;
                        Intrinsics.f(th3);
                        hVar2.o("SendShareService: inviteUserExternalSent failed", th3);
                        break;
                }
                break;
            default:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 1:
                        tb0.h hVar3 = rVar.f71894g;
                        Intrinsics.f(th4);
                        hVar3.o("SendShareService: inviteUserExternal failed", th4);
                        break;
                    default:
                        tb0.h hVar4 = rVar.f71894g;
                        Intrinsics.f(th4);
                        hVar4.o("SendShareService: inviteUserExternalSent failed", th4);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
