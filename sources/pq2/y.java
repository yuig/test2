package pq2;

import androidx.credentials.exceptions.GetCredentialException;
import kotlin.KotlinNullPointerException;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;

/* loaded from: classes2.dex */
public final class y implements l, u5.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ao2.m f101112a;

    public /* synthetic */ y(ao2.o oVar) {
        this.f101112a = oVar;
    }

    @Override // u5.m
    public void a(Object obj) {
        GetCredentialException e13 = (GetCredentialException) obj;
        Intrinsics.checkNotNullParameter(e13, "e");
        ao2.m mVar = this.f101112a;
        if (mVar.isActive()) {
            xk2.q qVar = xk2.s.f135225b;
            mVar.resumeWith(ue.c.m(e13));
        }
    }

    @Override // pq2.l
    public void e(Throwable t13, i call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(t13, "t");
        xk2.q qVar = xk2.s.f135225b;
        this.f101112a.resumeWith(ue.c.m(t13));
    }

    @Override // pq2.l
    public void l(i call, a1 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        boolean d2 = response.f100989a.d();
        ao2.m mVar = this.f101112a;
        if (!d2) {
            xk2.q qVar = xk2.s.f135225b;
            mVar.resumeWith(ue.c.m(new HttpException(response)));
            return;
        }
        Object obj = response.f100990b;
        if (obj != null) {
            xk2.q qVar2 = xk2.s.f135225b;
            mVar.resumeWith(obj);
            return;
        }
        Object c13 = call.d().c(x.class);
        Intrinsics.f(c13);
        x xVar = (x) c13;
        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException("Response from " + xVar.b().getName() + '.' + xVar.a().getName() + " was null but response body type was declared as non-null");
        xk2.q qVar3 = xk2.s.f135225b;
        mVar.resumeWith(ue.c.m(kotlinNullPointerException));
    }

    @Override // u5.m
    public void onResult(Object obj) {
        u5.z result = (u5.z) obj;
        Intrinsics.checkNotNullParameter(result, "result");
        ao2.m mVar = this.f101112a;
        if (mVar.isActive()) {
            xk2.q qVar = xk2.s.f135225b;
            mVar.resumeWith(result);
        }
    }
}
