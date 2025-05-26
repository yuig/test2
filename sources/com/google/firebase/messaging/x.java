package com.google.firebase.messaging;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: i, reason: collision with root package name */
    public static final long f33826i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f33827j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f33828a;

    /* renamed from: b, reason: collision with root package name */
    public final m f33829b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.appcompat.widget.x f33830c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f33831d;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f33833f;

    /* renamed from: h, reason: collision with root package name */
    public final v f33835h;

    /* renamed from: e, reason: collision with root package name */
    public final g1.g f33832e = new g1.g(0);

    /* renamed from: g, reason: collision with root package name */
    public boolean f33834g = false;

    public x(FirebaseMessaging firebaseMessaging, m mVar, v vVar, androidx.appcompat.widget.x xVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f33831d = firebaseMessaging;
        this.f33829b = mVar;
        this.f33835h = vVar;
        this.f33830c = xVar;
        this.f33828a = context;
        this.f33833f = scheduledExecutorService;
    }

    public static void a(Task task) {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e13) {
            e = e13;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e14) {
            Throwable cause = e14.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e14);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e15) {
            e = e15;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public final void b(String str) {
        String a13 = this.f33831d.a();
        androidx.appcompat.widget.x xVar = this.f33830c;
        xVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(xVar.j(xVar.D(a13, "/topics/" + str, bundle)));
    }

    public final void c(String str) {
        String a13 = this.f33831d.a();
        androidx.appcompat.widget.x xVar = this.f33830c;
        xVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
        a(xVar.j(xVar.D(a13, "/topics/" + str, bundle)));
    }

    public final void d() {
        boolean z13;
        synchronized (this) {
            z13 = this.f33834g;
        }
        if (z13) {
            return;
        }
        f(0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0094 A[Catch: IOException -> 0x0043, TryCatch #1 {IOException -> 0x0043, blocks: (B:8:0x002a, B:17:0x0059, B:19:0x0061, B:54:0x0076, B:56:0x0081, B:57:0x0094, B:59:0x009f, B:60:0x0039, B:63:0x0046), top: B:7:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.x.e():boolean");
    }

    public final void f(long j13) {
        this.f33833f.schedule(new z(this, this.f33828a, this.f33829b, Math.min(Math.max(30L, 2 * j13), f33826i)), j13, TimeUnit.SECONDS);
        synchronized (this) {
            this.f33834g = true;
        }
    }
}
