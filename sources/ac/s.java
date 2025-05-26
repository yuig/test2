package ac;

import com.airbnb.lottie.x;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1881a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ao2.m f1882b;

    public /* synthetic */ s(ao2.o oVar, int i13) {
        this.f1881a = i13;
        this.f1882b = oVar;
    }

    @Override // com.airbnb.lottie.x
    public final void onResult(Object obj) {
        int i13 = this.f1881a;
        ao2.m mVar = this.f1882b;
        switch (i13) {
            case 0:
                if (!mVar.isCompleted()) {
                    xk2.q qVar = xk2.s.f135225b;
                    mVar.resumeWith(obj);
                    break;
                }
                break;
            default:
                Throwable th3 = (Throwable) obj;
                if (!mVar.isCompleted()) {
                    xk2.q qVar2 = xk2.s.f135225b;
                    Intrinsics.f(th3);
                    mVar.resumeWith(ue.c.m(th3));
                    break;
                }
                break;
        }
    }
}
