package gw0;

import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f66209i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f66210j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, int i13) {
        super(1);
        this.f66209i = i13;
        this.f66210j = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        e eVar = this.f66210j;
        int i13 = this.f66209i;
        switch (i13) {
            case 0:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        if (eVar != null) {
                            Intrinsics.f(th3);
                            eVar.onError(th3);
                            break;
                        }
                        break;
                    default:
                        if (eVar != null) {
                            Intrinsics.f(th3);
                            eVar.onError(th3);
                            break;
                        }
                        break;
                }
                break;
            case 1:
                Uri uri = (Uri) obj;
                if (eVar != null) {
                    Intrinsics.f(uri);
                    eVar.a(uri);
                }
                break;
            default:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        if (eVar != null) {
                            Intrinsics.f(th4);
                            eVar.onError(th4);
                            break;
                        }
                        break;
                    default:
                        if (eVar != null) {
                            Intrinsics.f(th4);
                            eVar.onError(th4);
                            break;
                        }
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
