package z6;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.measurement.q4;
import df.a1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import x7.d;
import x7.e;

/* loaded from: classes.dex */
public final class a extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f140875b;

    public a(a1 a1Var) {
        this.f140874a = 2;
        this.f140875b = a1Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        q4[] q4VarArr;
        d dVar = null;
        switch (this.f140874a) {
            case 0:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                c cVar = (c) this.f140875b;
                while (true) {
                    synchronized (cVar.f140883b) {
                        try {
                            size = cVar.f140885d.size();
                            if (size <= 0) {
                                return;
                            }
                            q4VarArr = new q4[size];
                            cVar.f140885d.toArray(q4VarArr);
                            cVar.f140885d.clear();
                        } finally {
                        }
                    }
                    for (int i13 = 0; i13 < size; i13++) {
                        q4 q4Var = q4VarArr[i13];
                        int size2 = ((ArrayList) q4Var.f31595c).size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            b bVar = (b) ((ArrayList) q4Var.f31595c).get(i14);
                            if (!bVar.f140879d) {
                                bVar.f140877b.onReceive(cVar.f140882a, (Intent) q4Var.f31594b);
                            }
                        }
                    }
                }
            case 1:
                e eVar = (e) this.f140875b;
                ArrayDeque arrayDeque = e.f134016g;
                eVar.getClass();
                int i15 = message.what;
                if (i15 == 1) {
                    d dVar2 = (d) message.obj;
                    try {
                        eVar.f134018a.queueInputBuffer(dVar2.f134010a, dVar2.f134011b, dVar2.f134012c, dVar2.f134014e, dVar2.f134015f);
                    } catch (RuntimeException e13) {
                        AtomicReference atomicReference = eVar.f134021d;
                        while (!atomicReference.compareAndSet(null, e13) && atomicReference.get() == null) {
                        }
                    }
                    dVar = dVar2;
                } else if (i15 == 2) {
                    dVar = (d) message.obj;
                    eVar.a(dVar.f134010a, dVar.f134011b, dVar.f134013d, dVar.f134014e, dVar.f134015f);
                } else if (i15 == 3) {
                    eVar.f134022e.h();
                } else if (i15 != 4) {
                    AtomicReference atomicReference2 = eVar.f134021d;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                    while (!atomicReference2.compareAndSet(null, illegalStateException) && atomicReference2.get() == null) {
                    }
                } else {
                    eVar.e((Bundle) message.obj);
                }
                if (dVar != null) {
                    ArrayDeque arrayDeque2 = e.f134016g;
                    synchronized (arrayDeque2) {
                        arrayDeque2.add(dVar);
                    }
                    return;
                }
                return;
            default:
                if (p001if.a.b(this)) {
                    return;
                }
                try {
                    if (p001if.a.b(this)) {
                        return;
                    }
                    try {
                        Intrinsics.checkNotNullParameter(message, "message");
                        a1 a1Var = (a1) this.f140875b;
                        a1Var.getClass();
                        Intrinsics.checkNotNullParameter(message, "message");
                        if (message.what == a1Var.f54708g) {
                            Bundle data = message.getData();
                            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                                a1Var.a(null);
                            } else {
                                a1Var.a(data);
                            }
                            try {
                                a1Var.f54702a.unbindService(a1Var);
                                return;
                            } catch (IllegalArgumentException unused) {
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th3) {
                        p001if.a.a(this, th3);
                        return;
                    }
                } catch (Throwable th4) {
                    p001if.a.a(this, th4);
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Looper looper, int i13) {
        super(looper);
        this.f140874a = i13;
        this.f140875b = obj;
    }
}
