package i11;

import com.pinterest.error.ServerError;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import m60.x0;
import v.f1;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f71032i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f71033j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i13) {
        super(1);
        this.f71032i = i13;
        this.f71033j = qVar;
    }

    public final void b(Throwable error) {
        f1 f1Var;
        byte[] bArr;
        int i13 = this.f71032i;
        q qVar = this.f71033j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(error, "error");
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.q(error, "Exception while creating a scheduled pin", tb0.p.PIN_BUILDER);
                qVar.getClass();
                if (!(error instanceof ServerError) || (f1Var = ((ServerError) error).f45043a) == null || (bArr = (byte[]) f1Var.f123451d) == null || yb2.a.c(new String(bArr, Charsets.UTF_8)).f105387g != 2385) {
                    qVar.f71007j.h(x0.generic_error);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(error, "error");
                HashSet hashSet2 = tb0.h.f117076w;
                tb0.g.f117075a.q(error, "Exception while uploading image for a scheduled pin", tb0.p.PIN_BUILDER);
                qVar.f71007j.h(x0.generic_error);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f71032i) {
            case 0:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
