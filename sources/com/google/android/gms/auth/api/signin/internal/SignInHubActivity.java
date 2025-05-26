package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.z;
import bb.p;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import fh.d;
import fh.j;
import g1.p0;
import java.lang.reflect.Modifier;
import java.util.Set;
import x6.a;
import x6.b;
import x6.c;
import x6.e;
import x6.f;

@KeepName
/* loaded from: classes3.dex */
public class SignInHubActivity extends FragmentActivity {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f30722f = false;

    /* renamed from: a, reason: collision with root package name */
    public boolean f30723a = false;

    /* renamed from: b, reason: collision with root package name */
    public SignInConfiguration f30724b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30725c;

    /* renamed from: d, reason: collision with root package name */
    public int f30726d;

    /* renamed from: e, reason: collision with root package name */
    public Intent f30727e;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.o, android.app.Activity
    public final void onActivityResult(int i13, int i14, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.f30723a) {
            return;
        }
        setResult(0);
        if (i13 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.f30715g) != null) {
                if (googleSignInAccount == null) {
                    Log.e("AuthSignInClient", "Google account is null");
                    q(12500);
                    return;
                }
                j a13 = j.a(this);
                GoogleSignInOptions googleSignInOptions = this.f30724b.f30721g;
                synchronized (a13) {
                    a13.f62146a.d(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.f30725c = true;
                this.f30726d = i14;
                this.f30727e = intent;
                p();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                q(intExtra);
                return;
            }
        }
        q(8);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.o, c5.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            q(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            q(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f30724b = signInConfiguration;
        if (bundle != null) {
            boolean z13 = bundle.getBoolean("signingInGoogleApiClients");
            this.f30725c = z13;
            if (z13) {
                this.f30726d = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                if (intent2 != null) {
                    this.f30727e = intent2;
                    p();
                    return;
                } else {
                    Log.e("AuthSignInClient", "Sign in result data cannot be null");
                    setResult(0);
                    finish();
                    return;
                }
            }
            return;
        }
        if (f30722f) {
            setResult(0);
            q(12502);
            return;
        }
        f30722f = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.f30724b);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f30723a = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            q(17);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f30722f = false;
    }

    @Override // androidx.activity.o, c5.h, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f30725c);
        if (this.f30725c) {
            bundle.putInt("signInResultCode", this.f30726d);
            bundle.putParcelable("signInResultData", this.f30727e);
        }
    }

    public final void p() {
        a supportLoaderManager = getSupportLoaderManager();
        p pVar = new p(this);
        f fVar = (f) supportLoaderManager;
        e eVar = fVar.f133927b;
        if (eVar.f133925c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        p0 p0Var = eVar.f133924b;
        b bVar = (b) p0Var.g(0);
        z zVar = fVar.f133926a;
        if (bVar == null) {
            try {
                eVar.f133925c = true;
                SignInHubActivity signInHubActivity = (SignInHubActivity) pVar.f22464b;
                Set set = i.f30771a;
                synchronized (set) {
                }
                d dVar = new d(signInHubActivity, set);
                if (d.class.isMemberClass() && !Modifier.isStatic(d.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + dVar);
                }
                b bVar2 = new b(dVar);
                p0Var.j(0, bVar2);
                eVar.f133925c = false;
                c cVar = new c(bVar2.f133917n, pVar);
                bVar2.e(zVar, cVar);
                c cVar2 = bVar2.f133919p;
                if (cVar2 != null) {
                    bVar2.j(cVar2);
                }
                bVar2.f133918o = zVar;
                bVar2.f133919p = cVar;
            } catch (Throwable th3) {
                eVar.f133925c = false;
                throw th3;
            }
        } else {
            c cVar3 = new c(bVar.f133917n, pVar);
            bVar.e(zVar, cVar3);
            c cVar4 = bVar.f133919p;
            if (cVar4 != null) {
                bVar.j(cVar4);
            }
            bVar.f133918o = zVar;
            bVar.f133919p = cVar3;
        }
        f30722f = false;
    }

    public final void q(int i13) {
        Status status = new Status(i13, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f30722f = false;
    }
}
