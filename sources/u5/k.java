package u5;

import androidx.credentials.exceptions.CreateCredentialException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ao2.m f120517a;

    public k(ao2.o oVar) {
        this.f120517a = oVar;
    }

    @Override // u5.m
    public final void a(Object obj) {
        CreateCredentialException e13 = (CreateCredentialException) obj;
        Intrinsics.checkNotNullParameter(e13, "e");
        ao2.m mVar = this.f120517a;
        if (mVar.isActive()) {
            xk2.q qVar = xk2.s.f135225b;
            mVar.resumeWith(ue.c.m(e13));
        }
    }

    @Override // u5.m
    public final void onResult(Object obj) {
        d result = (d) obj;
        Intrinsics.checkNotNullParameter(result, "result");
        ao2.m mVar = this.f120517a;
        if (mVar.isActive()) {
            xk2.q qVar = xk2.s.f135225b;
            mVar.resumeWith(result);
        }
    }
}
