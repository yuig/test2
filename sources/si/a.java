package si;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import bb.p;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.l0;
import com.google.android.gms.common.api.internal.u0;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import jh.g;
import jh.h;

/* loaded from: classes3.dex */
public final class a extends h implements ri.c {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f112995e;

    /* renamed from: f, reason: collision with root package name */
    public final g f112996f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f112997g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f112998h;

    public a(Context context, Looper looper, g gVar, Bundle bundle, com.google.android.gms.common.api.g gVar2, com.google.android.gms.common.api.h hVar) {
        super(context, looper, 44, gVar, gVar2, hVar);
        this.f112995e = true;
        this.f112996f = gVar;
        this.f112997g = bundle;
        this.f112998h = gVar.f76151h;
    }

    @Override // ri.c
    public final void a() {
        connect(new p(this, 12));
    }

    @Override // ri.c
    public final void c(c cVar) {
        com.bumptech.glide.d.u(cVar, "Expecting a valid ISignInCallbacks");
        int i13 = 2;
        try {
            Account account = this.f112996f.f76144a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            GoogleSignInAccount b13 = "<<default account>>".equals(account.name) ? fh.a.a(getContext()).b() : null;
            Integer num = this.f112998h;
            com.bumptech.glide.d.t(num);
            zat zatVar = new zat(2, account, num.intValue(), b13);
            d dVar = (d) getService();
            zai zaiVar = new zai(1, zatVar);
            dVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(dVar.f141968c);
            int i14 = bi.b.f22820a;
            obtain.writeInt(1);
            zaiVar.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(cVar.asBinder());
            Parcel obtain2 = Parcel.obtain();
            try {
                dVar.f141967b.transact(12, obtain, obtain2, 0);
                obtain2.readException();
            } finally {
                obtain.recycle();
                obtain2.recycle();
            }
        } catch (RemoteException e13) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                l0 l0Var = (l0) cVar;
                l0Var.f30846c.post(new u0(i13, l0Var, new zak(1, new ConnectionResult(8, null), null)));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e13);
            }
        }
    }

    @Override // jh.f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new d(iBinder, "com.google.android.gms.signin.internal.ISignInService", 1);
    }

    @Override // jh.f
    public final Bundle getGetServiceRequestExtraArgs() {
        g gVar = this.f112996f;
        boolean equals = getContext().getPackageName().equals(gVar.f76148e);
        Bundle bundle = this.f112997g;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", gVar.f76148e);
        }
        return bundle;
    }

    @Override // jh.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // jh.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // jh.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // jh.f, com.google.android.gms.common.api.c
    public final boolean requiresSignIn() {
        return this.f112995e;
    }
}
