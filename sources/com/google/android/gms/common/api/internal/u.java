package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class u extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f30877a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f30878b;

    /* renamed from: c, reason: collision with root package name */
    public final bi.f f30879c;

    /* renamed from: d, reason: collision with root package name */
    public final ih.c f30880d;

    /* renamed from: e, reason: collision with root package name */
    public final g1.h f30881e;

    /* renamed from: f, reason: collision with root package name */
    public final f f30882f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(i iVar, f fVar) {
        super(iVar);
        ih.c cVar = ih.c.f72257d;
        this.f30878b = new AtomicReference(null);
        this.f30879c = new bi.f(Looper.getMainLooper(), 0);
        this.f30880d = cVar;
        this.f30881e = new g1.h(0);
        this.f30882f = fVar;
        this.mLifecycleFragment.q("ConnectionlessLifecycleHelper", this);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void onCancel(DialogInterface dialogInterface) {
        ConnectionResult connectionResult = new ConnectionResult(13, null);
        AtomicReference atomicReference = this.f30878b;
        s0 s0Var = (s0) atomicReference.get();
        int i13 = s0Var == null ? -1 : s0Var.f30870a;
        atomicReference.set(null);
        this.f30882f.n(connectionResult, i13);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onActivityResult(int i13, int i14, Intent intent) {
        AtomicReference atomicReference = this.f30878b;
        s0 s0Var = (s0) atomicReference.get();
        f fVar = this.f30882f;
        if (i13 != 1) {
            if (i13 == 2) {
                int c13 = this.f30880d.c(getActivity(), ih.d.f72258a);
                if (c13 == 0) {
                    atomicReference.set(null);
                    bi.f fVar2 = fVar.f30819n;
                    fVar2.sendMessage(fVar2.obtainMessage(3));
                    return;
                } else {
                    if (s0Var == null) {
                        return;
                    }
                    if (s0Var.f30871b.f30732g == 18 && c13 == 18) {
                        return;
                    }
                }
            }
        } else if (i14 == -1) {
            atomicReference.set(null);
            bi.f fVar3 = fVar.f30819n;
            fVar3.sendMessage(fVar3.obtainMessage(3));
            return;
        } else if (i14 == 0) {
            if (s0Var != null) {
                ConnectionResult connectionResult = new ConnectionResult(1, intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, s0Var.f30871b.toString());
                atomicReference.set(null);
                fVar.n(connectionResult, s0Var.f30870a);
                return;
            }
            return;
        }
        if (s0Var != null) {
            atomicReference.set(null);
            fVar.n(s0Var.f30871b, s0Var.f30870a);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f30878b.set(bundle.getBoolean("resolving_error", false) ? new s0(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onResume() {
        super.onResume();
        if (this.f30881e.isEmpty()) {
            return;
        }
        this.f30882f.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        s0 s0Var = (s0) this.f30878b.get();
        if (s0Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", s0Var.f30870a);
        ConnectionResult connectionResult = s0Var.f30871b;
        bundle.putInt("failed_status", connectionResult.f30732g);
        bundle.putParcelable("failed_resolution", connectionResult.f30733h);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        this.f30877a = true;
        if (this.f30881e.isEmpty()) {
            return;
        }
        this.f30882f.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        this.f30877a = false;
        f fVar = this.f30882f;
        fVar.getClass();
        synchronized (f.f30804r) {
            try {
                if (fVar.f30816k == this) {
                    fVar.f30816k = null;
                    fVar.f30817l.clear();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
