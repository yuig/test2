package pq2;

import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;

/* loaded from: classes4.dex */
public final class a0 implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ao2.m f100988b;

    public /* synthetic */ a0(ao2.o oVar, int i13) {
        this.f100987a = i13;
        this.f100988b = oVar;
    }

    @Override // pq2.l
    public final void e(Throwable t13, i call) {
        int i13 = this.f100987a;
        ao2.m mVar = this.f100988b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(t13, "t");
                xk2.q qVar = xk2.s.f135225b;
                mVar.resumeWith(ue.c.m(t13));
                break;
            default:
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(t13, "t");
                xk2.q qVar2 = xk2.s.f135225b;
                mVar.resumeWith(ue.c.m(t13));
                break;
        }
    }

    @Override // pq2.l
    public final void l(i call, a1 response) {
        int i13 = this.f100987a;
        ao2.m mVar = this.f100988b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                if (!response.f100989a.d()) {
                    xk2.q qVar = xk2.s.f135225b;
                    mVar.resumeWith(ue.c.m(new HttpException(response)));
                    break;
                } else {
                    xk2.q qVar2 = xk2.s.f135225b;
                    mVar.resumeWith(response.f100990b);
                    break;
                }
            default:
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                xk2.q qVar3 = xk2.s.f135225b;
                mVar.resumeWith(response);
                break;
        }
    }
}
