package com.google.android.gms.common.api.internal;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;

/* loaded from: classes3.dex */
public final class u0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30883a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f30884b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30885c;

    public /* synthetic */ u0(int i13, Object obj, Object obj2) {
        this.f30883a = i13;
        this.f30885c = obj;
        this.f30884b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set set;
        jh.j jVar = null;
        switch (this.f30883a) {
            case 0:
                if (((u) this.f30885c).f30877a) {
                    ConnectionResult connectionResult = ((s0) this.f30884b).f30871b;
                    if (connectionResult.k1()) {
                        u uVar = (u) this.f30885c;
                        i iVar = uVar.mLifecycleFragment;
                        Activity activity = uVar.getActivity();
                        PendingIntent pendingIntent = connectionResult.f30733h;
                        com.bumptech.glide.d.t(pendingIntent);
                        int i13 = ((s0) this.f30884b).f30870a;
                        int i14 = GoogleApiActivity.f30742b;
                        Intent intent = new Intent(activity, (Class<?>) GoogleApiActivity.class);
                        intent.putExtra("pending_intent", pendingIntent);
                        intent.putExtra("failing_client_id", i13);
                        intent.putExtra("notify_manager", false);
                        iVar.startActivityForResult(intent, 1);
                        return;
                    }
                    u uVar2 = (u) this.f30885c;
                    if (uVar2.f30880d.a(connectionResult.f30732g, uVar2.getActivity(), null) != null) {
                        u uVar3 = (u) this.f30885c;
                        uVar3.f30880d.l(uVar3.getActivity(), uVar3.mLifecycleFragment, connectionResult.f30732g, (u) this.f30885c);
                        return;
                    }
                    if (connectionResult.f30732g != 18) {
                        u uVar4 = (u) this.f30885c;
                        int i15 = ((s0) this.f30884b).f30870a;
                        uVar4.f30878b.set(null);
                        uVar4.f30882f.n(connectionResult, i15);
                        return;
                    }
                    u uVar5 = (u) this.f30885c;
                    ih.c cVar = uVar5.f30880d;
                    Activity activity2 = uVar5.getActivity();
                    cVar.getClass();
                    ProgressBar progressBar = new ProgressBar(activity2, null, R.attr.progressBarStyleLarge);
                    progressBar.setIndeterminate(true);
                    progressBar.setVisibility(0);
                    AlertDialog.Builder builder = new AlertDialog.Builder(activity2);
                    builder.setView(progressBar);
                    builder.setMessage(jh.p.c(activity2, 18));
                    builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                    AlertDialog create = builder.create();
                    ih.c.j(activity2, create, "GooglePlayServicesUpdatingDialog", uVar5);
                    u uVar6 = (u) this.f30885c;
                    Context applicationContext = uVar6.getActivity().getApplicationContext();
                    t0 t0Var = new t0(this, create);
                    uVar6.f30880d.getClass();
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addDataScheme("package");
                    e0 e0Var = new e0(t0Var);
                    bi.d.e(applicationContext, e0Var, intentFilter);
                    e0Var.a(applicationContext);
                    if (ih.f.b(applicationContext)) {
                        return;
                    }
                    t0Var.a();
                    e0Var.b();
                    return;
                }
                return;
            case 1:
                l lVar = (l) this.f30884b;
                k kVar = (k) this.f30885c;
                Object obj = lVar.f30842b;
                if (obj == null) {
                    kVar.getClass();
                    return;
                }
                try {
                    ((bb.p) kVar).f(obj);
                    return;
                } catch (RuntimeException e13) {
                    kVar.getClass();
                    throw e13;
                }
            default:
                l0 l0Var = (l0) this.f30885c;
                zak zakVar = (zak) this.f30884b;
                ch.c cVar2 = l0.f30844i;
                ConnectionResult connectionResult2 = zakVar.f32082g;
                if (connectionResult2.f30732g == 0) {
                    zav zavVar = zakVar.f32083h;
                    com.bumptech.glide.d.t(zavVar);
                    ConnectionResult connectionResult3 = zavVar.f30980h;
                    if (connectionResult3.f30732g != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult3)), new Exception());
                        l0Var.f30851h.e(connectionResult3);
                        l0Var.f30850g.disconnect();
                        return;
                    }
                    b0 b0Var = l0Var.f30851h;
                    IBinder iBinder = zavVar.f30979g;
                    if (iBinder != null) {
                        int i16 = jh.a.f76135b;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        jVar = queryLocalInterface instanceof jh.j ? (jh.j) queryLocalInterface : new jh.m0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                    }
                    b0Var.getClass();
                    if (jVar == null || (set = l0Var.f30848e) == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        b0Var.e(new ConnectionResult(4));
                    } else {
                        b0Var.f30791d = jVar;
                        b0Var.f30792e = set;
                        if (b0Var.f30788a) {
                            ((com.google.android.gms.common.api.c) b0Var.f30789b).getRemoteService(jVar, set);
                        }
                    }
                } else {
                    l0Var.f30851h.e(connectionResult2);
                }
                l0Var.f30850g.disconnect();
                return;
        }
    }

    public /* synthetic */ u0(l lVar, bb.p pVar) {
        this.f30883a = 1;
        this.f30884b = lVar;
        this.f30885c = pVar;
    }
}
