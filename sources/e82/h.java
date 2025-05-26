package e82;

import com.pinterest.identity.core.error.UnauthException;
import h32.f1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f57854i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m60.w f57855j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(m60.w wVar, int i13) {
        super(1);
        this.f57854i = i13;
        this.f57855j = wVar;
    }

    public final void b(Throwable throwable) {
        int i13 = this.f57854i;
        m60.w wVar = this.f57855j;
        switch (i13) {
            case 0:
                w wVar2 = w.FACEBOOK;
                wVar.d(new z());
                break;
            case 1:
                w wVar3 = w.FACEBOOK;
                wVar.d(new z());
                break;
            case 2:
                w wVar4 = w.FACEBOOK;
                Intrinsics.f(throwable);
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                wVar.d(new z(false, true, throwable instanceof UnauthException.AuthenticationError.InstagramAccountAlreadyLinkedError ? ((UnauthException.AuthenticationError.InstagramAccountAlreadyLinkedError) throwable).f49834a : null, f1.INSTAGRAM_ACCT_UNCLAIMING_FAILURE, f82.a.a(throwable)));
                break;
            default:
                w wVar5 = w.FACEBOOK;
                Intrinsics.f(throwable);
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                wVar.d(new z(false, true, throwable instanceof UnauthException.AuthenticationError.InstagramAccountAlreadyLinkedError ? ((UnauthException.AuthenticationError.InstagramAccountAlreadyLinkedError) throwable).f49834a : null, f1.INSTAGRAM_ACCT_CLAIMING_FAILURE, f82.a.a(throwable)));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f57854i) {
            case 0:
                b((Throwable) obj);
                break;
            case 1:
                b((Throwable) obj);
                break;
            case 2:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
