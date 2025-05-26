package fh;

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import com.facebook.login.z;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.c0;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.m;
import com.google.android.gms.tasks.TaskCompletionSource;
import jh.u;
import kh2.g3;
import kp.n;

/* loaded from: classes3.dex */
public final class l extends ai.k {

    /* renamed from: b, reason: collision with root package name */
    public final Context f62147b;

    public l(Context context) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 0);
        this.f62147b = context;
    }

    @Override // ai.k
    public final boolean B(int i13, Parcel parcel, Parcel parcel2) {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        Context context = this.f62147b;
        if (i13 == 1) {
            D();
            a a13 = a.a(context);
            GoogleSignInAccount b13 = a13.b();
            GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f30698q;
            if (b13 != null) {
                googleSignInOptions = a13.c();
            }
            GoogleSignInOptions googleSignInOptions2 = googleSignInOptions;
            com.bumptech.glide.d.t(googleSignInOptions2);
            tb.e eVar = new tb.e(9);
            eVar.f116963a = new z(1);
            eh.a aVar = new eh.a(this.f62147b, null, bh.a.f22795a, googleSignInOptions2, eVar.a());
            c0 c0Var = aVar.f30768h;
            Context context2 = aVar.f30761a;
            if (b13 != null) {
                boolean z13 = aVar.e() == 3;
                i.f62144a.d("Revoking access", new Object[0]);
                String e13 = a.a(context2).e("refreshToken");
                i.a(context2);
                if (!z13) {
                    g gVar = new g(c0Var, 1);
                    c0Var.a(gVar);
                    basePendingResult2 = gVar;
                } else if (e13 == null) {
                    k0.a aVar2 = c.f62135c;
                    Status status = new Status(4, null, null, null);
                    com.bumptech.glide.d.i("Status code must not be SUCCESS", !false);
                    BasePendingResult mVar = new m(status);
                    mVar.C0(status);
                    basePendingResult2 = mVar;
                } else {
                    c cVar = new c(e13);
                    new Thread(cVar).start();
                    basePendingResult2 = cVar.f62137b;
                }
                n nVar = new n(12);
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                basePendingResult2.y0(new u(basePendingResult2, taskCompletionSource, nVar));
                taskCompletionSource.getTask();
            } else {
                boolean z14 = aVar.e() == 3;
                i.f62144a.d("Signing out", new Object[0]);
                i.a(context2);
                if (z14) {
                    Status status2 = Status.f30746j;
                    basePendingResult = new p(c0Var);
                    basePendingResult.C0(status2);
                } else {
                    g gVar2 = new g(c0Var, 0);
                    c0Var.a(gVar2);
                    basePendingResult = gVar2;
                }
                n nVar2 = new n(12);
                TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                basePendingResult.y0(new u(basePendingResult, taskCompletionSource2, nVar2));
                taskCompletionSource2.getTask();
            }
        } else {
            if (i13 != 2) {
                return false;
            }
            D();
            j.a(context).b();
        }
        return true;
    }

    public final void D() {
        if (!g3.e2(this.f62147b, Binder.getCallingUid())) {
            throw new SecurityException(a.a.e("Calling UID ", Binder.getCallingUid(), " is not Google Play services."));
        }
    }
}
