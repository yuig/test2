package com.google.android.gms.common.api.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b0 implements jh.d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f30788a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f30789b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f30790c;

    /* renamed from: d, reason: collision with root package name */
    public Object f30791d;

    /* renamed from: e, reason: collision with root package name */
    public Object f30792e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f30793f;

    public b0(f fVar, com.google.android.gms.common.api.c cVar, a aVar) {
        this.f30793f = fVar;
        this.f30791d = null;
        this.f30792e = null;
        this.f30788a = false;
        this.f30789b = cVar;
        this.f30790c = aVar;
    }

    public static /* synthetic */ void a(int i13) {
        String str = (i13 == 4 || i13 == 5 || i13 == 6 || i13 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 4 || i13 == 5 || i13 == 6 || i13 == 7) ? 2 : 3];
        switch (i13) {
            case 1:
                objArr[0] = "valueParameters";
                break;
            case 2:
                objArr[0] = "typeParameters";
                break;
            case 3:
                objArr[0] = "signatureErrors";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                break;
            default:
                objArr[0] = "returnType";
                break;
        }
        if (i13 == 4) {
            objArr[1] = "getReturnType";
        } else if (i13 == 5) {
            objArr[1] = "getValueParameters";
        } else if (i13 == 6) {
            objArr[1] = "getTypeParameters";
        } else if (i13 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
        } else {
            objArr[1] = "getErrors";
        }
        if (i13 != 4 && i13 != 5 && i13 != 6 && i13 != 7) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i13 != 4 && i13 != 5 && i13 != 6 && i13 != 7) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static b0 c(SharedPreferences sharedPreferences, Executor executor) {
        b0 b0Var = new b0(sharedPreferences, executor);
        synchronized (((ArrayDeque) b0Var.f30792e)) {
            try {
                ((ArrayDeque) b0Var.f30792e).clear();
                String string = ((SharedPreferences) b0Var.f30789b).getString((String) b0Var.f30790c, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) b0Var.f30791d)) {
                    String[] split = string.split((String) b0Var.f30791d, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) b0Var.f30792e).add(str);
                        }
                    }
                }
            } finally {
            }
        }
        return b0Var;
    }

    @Override // jh.d
    public final void b(ConnectionResult connectionResult) {
        ((f) this.f30793f).f30819n.post(new lb.x(8, this, connectionResult));
    }

    public final boolean d(Object obj) {
        boolean remove;
        synchronized (((ArrayDeque) this.f30792e)) {
            remove = ((ArrayDeque) this.f30792e).remove(obj);
            if (remove && !this.f30788a) {
                ((Executor) this.f30793f).execute(new com.airbnb.lottie.k(this, 20));
            }
        }
        return remove;
    }

    public final void e(ConnectionResult connectionResult) {
        z zVar = (z) ((f) this.f30793f).f30815j.get((a) this.f30790c);
        if (zVar != null) {
            zVar.v(connectionResult);
        }
    }

    public b0(List list, ArrayList arrayList, List list2, pn2.b0 b0Var) {
        if (b0Var == null) {
            a(0);
            throw null;
        }
        if (list == null) {
            a(1);
            throw null;
        }
        if (list2 == null) {
            a(3);
            throw null;
        }
        this.f30789b = b0Var;
        this.f30790c = null;
        this.f30791d = list;
        this.f30792e = arrayList;
        this.f30793f = list2;
        this.f30788a = false;
    }

    public b0(m60.e applicationInfoProvider, qb0.e networkUtils, c10.a dialogChecks, t00.k guardianErrorMessageHandler, t00.i errorDialogDisplay) {
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        Intrinsics.checkNotNullParameter(networkUtils, "networkUtils");
        Intrinsics.checkNotNullParameter(dialogChecks, "dialogChecks");
        Intrinsics.checkNotNullParameter(guardianErrorMessageHandler, "guardianErrorMessageHandler");
        Intrinsics.checkNotNullParameter(errorDialogDisplay, "errorDialogDisplay");
        this.f30789b = applicationInfoProvider;
        this.f30790c = networkUtils;
        this.f30791d = dialogChecks;
        this.f30792e = guardianErrorMessageHandler;
        this.f30793f = errorDialogDisplay;
        this.f30788a = true;
    }

    public b0(SharedPreferences sharedPreferences, Executor executor) {
        this.f30792e = new ArrayDeque();
        this.f30788a = false;
        this.f30789b = sharedPreferences;
        this.f30790c = "topic_operation_queue";
        this.f30791d = ",";
        this.f30793f = executor;
    }
}
