package pq2;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* loaded from: classes2.dex */
public final class c0 implements Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f100999a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f101000b;

    public c0(g0 g0Var, l lVar) {
        this.f101000b = g0Var;
        this.f100999a = lVar;
    }

    public final void a(Throwable th3) {
        try {
            this.f100999a.e(th3, this.f101000b);
        } catch (Throwable th4) {
            k1.q(th4);
            th4.printStackTrace();
        }
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        a(iOException);
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        g0 g0Var = this.f101000b;
        try {
            try {
                this.f100999a.l(g0Var, g0Var.c(response));
            } catch (Throwable th3) {
                k1.q(th3);
                th3.printStackTrace();
            }
        } catch (Throwable th4) {
            k1.q(th4);
            a(th4);
        }
    }
}
