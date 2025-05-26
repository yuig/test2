package n60;

import android.system.ErrnoException;
import android.system.OsConstants;
import com.pinterest.error.NoConnectionErrorWithUrls;
import com.pinterest.error.ServerError;
import com.pinterest.error.TimeoutErrorWithUrls;
import io.reactivex.exceptions.UndeliverableException;
import java.net.UnknownHostException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import so.oa;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f89257i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f89258j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, int i13) {
        super(1);
        this.f89257i = i13;
        this.f89258j = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13;
        int i14 = this.f89257i;
        boolean z13 = true;
        int i15 = 0;
        j jVar = this.f89258j;
        switch (i14) {
            case 0:
                Throwable error = (Throwable) obj;
                Intrinsics.checkNotNullParameter(error, "error");
                jVar.getClass();
                if (!(error instanceof NoConnectionErrorWithUrls) && !(error instanceof TimeoutErrorWithUrls) && !(error instanceof ServerError) && !(error instanceof UnknownHostException) && (!(error instanceof ErrnoException) || ((i13 = ((ErrnoException) error).errno) != OsConstants.ENETUNREACH && i13 != OsConstants.ECONNREFUSED))) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            default:
                Throwable th3 = (Throwable) obj;
                if (!(th3 instanceof UndeliverableException)) {
                    Intrinsics.f(th3);
                    jVar.getClass();
                    throw th3;
                }
                if (!kh2.n.B(th3, new i(jVar, i15))) {
                    tb0.h hVar = (tb0.h) ((bf2.b) bf2.b.a(((oa) ((p) jVar.f89264f.getValue())).f113797m0)).get();
                    UndeliverableException undeliverableException = (UndeliverableException) th3;
                    if (hVar.f117078b.get() && hVar.f117079c.get()) {
                        hVar.f117097u.h(undeliverableException);
                    }
                }
                return Unit.f80348a;
        }
    }
}
