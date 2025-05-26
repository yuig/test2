package u5;

import android.app.Activity;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import k1.s2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f120518a = 0;

    static Object b(Activity context, y request, bl2.c frame) {
        ao2.o oVar = new ao2.o(1, cl2.h.b(frame));
        oVar.v();
        CancellationSignal cancellationSignal = new CancellationSignal();
        oVar.e(new s2(cancellationSignal, 21));
        pq2.y callback = new pq2.y(oVar);
        o.a executor = new o.a(2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        p a13 = q.a(new q(context));
        if (a13 == null) {
            callback.a(new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            a13.onGetCredential(context, request, cancellationSignal, executor, callback);
        }
        Object u13 = oVar.u();
        if (u13 == cl2.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return u13;
    }

    default Object a(Activity context, f request, bl2.c frame) {
        ao2.o oVar = new ao2.o(1, cl2.h.b(frame));
        oVar.v();
        CancellationSignal cancellationSignal = new CancellationSignal();
        oVar.e(new y3.h(cancellationSignal, 1));
        k callback = new k(oVar);
        j executor = new j(0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        p a13 = q.a(new q(((n) this).f120519b));
        if (a13 == null) {
            callback.a(new CreateCredentialProviderConfigurationException("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            a13.onCreateCredential(context, request, cancellationSignal, executor, callback);
        }
        Object u13 = oVar.u();
        if (u13 == cl2.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return u13;
    }
}
