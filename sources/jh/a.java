package jh;

import android.accounts.Account;
import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes3.dex */
public abstract class a extends ai.k implements j {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f76135b = 0;

    public static Account D(j jVar) {
        if (jVar == null) {
            return null;
        }
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            m0 m0Var = (m0) jVar;
            Parcel E = m0Var.E(m0Var.F(), 2);
            Account account = (Account) di.a.a(E, Account.CREATOR);
            E.recycle();
            return account;
        } catch (RemoteException unused) {
            Log.w("AccountAccessor", "Remote account accessor probably died");
            return null;
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }
}
