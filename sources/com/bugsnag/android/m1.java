package com.bugsnag.android;

import android.content.Context;
import android.os.storage.StorageManager;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes3.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final u1 f29340a;

    /* renamed from: b, reason: collision with root package name */
    public final hd.h f29341b;

    /* renamed from: c, reason: collision with root package name */
    public final StorageManager f29342c;

    /* renamed from: d, reason: collision with root package name */
    public final g f29343d;

    /* renamed from: e, reason: collision with root package name */
    public final id.c f29344e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f29345f;

    /* renamed from: g, reason: collision with root package name */
    public final c2 f29346g;

    /* renamed from: h, reason: collision with root package name */
    public final hd.c f29347h;

    public m1(Context context, u1 u1Var, hd.h hVar, StorageManager storageManager, g gVar, id.d dVar, c2 c2Var, hd.c cVar) {
        this.f29340a = u1Var;
        this.f29341b = hVar;
        this.f29342c = storageManager;
        this.f29343d = gVar;
        this.f29344e = dVar;
        this.f29345f = context;
        this.f29346g = c2Var;
        this.f29347h = cVar;
    }

    public final void a(Exception exc, File file, String str) {
        p2 a13 = p2.a(null, "unhandledException", null);
        hd.h hVar = this.f29341b;
        u1 u1Var = this.f29340a;
        x0 x0Var = new x0(exc, hVar, a13, u1Var);
        z0 z0Var = x0Var.f29685a;
        z0Var.f29730o = str;
        x0Var.a("BugsnagDiagnostics", "canRead", Boolean.valueOf(file.canRead()));
        x0Var.a("BugsnagDiagnostics", "canWrite", Boolean.valueOf(file.canWrite()));
        x0Var.a("BugsnagDiagnostics", "exists", Boolean.valueOf(file.exists()));
        Context context = this.f29345f;
        x0Var.a("BugsnagDiagnostics", "usableSpace", Long.valueOf(context.getCacheDir().getUsableSpace()));
        x0Var.a("BugsnagDiagnostics", "filename", file.getName());
        x0Var.a("BugsnagDiagnostics", "fileLength", Long.valueOf(file.length()));
        StorageManager storageManager = this.f29342c;
        if (storageManager != null) {
            File file2 = new File(context.getCacheDir(), "bugsnag/errors");
            try {
                boolean isCacheBehaviorTombstone = storageManager.isCacheBehaviorTombstone(file2);
                boolean isCacheBehaviorGroup = storageManager.isCacheBehaviorGroup(file2);
                x0Var.a("BugsnagDiagnostics", "cacheTombstone", Boolean.valueOf(isCacheBehaviorTombstone));
                x0Var.a("BugsnagDiagnostics", "cacheGroup", Boolean.valueOf(isCacheBehaviorGroup));
            } catch (IOException e13) {
                u1Var.a("Failed to record cache behaviour, skipping diagnostics", e13);
            }
        }
        z0Var.f29724i = this.f29343d.a();
        z0Var.f29725j = ((k0) this.f29344e.get()).b(new Date().getTime());
        c2 c2Var = this.f29346g;
        x0Var.a("BugsnagDiagnostics", "notifierName", c2Var.f29176a);
        x0Var.a("BugsnagDiagnostics", "notifierVersion", c2Var.f29177b);
        x0Var.a("BugsnagDiagnostics", "apiKey", hVar.f68809a);
        try {
            this.f29347h.b(hd.n.INTERNAL_REPORT, new androidx.appcompat.widget.j(13, this, new a1(null, x0Var, null, this.f29346g, this.f29341b)));
        } catch (RejectedExecutionException unused) {
        }
    }
}
