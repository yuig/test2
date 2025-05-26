package com.pinterest.shuffles.scene.composer;

import android.app.Activity;
import android.content.Context;
import ao2.k2;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import r72.u1;
import r72.y1;
import r72.z1;

/* loaded from: classes4.dex */
public abstract class s0 extends f {

    /* renamed from: b, reason: collision with root package name */
    public final Context f52144b;

    /* renamed from: c, reason: collision with root package name */
    public final ao2.j0 f52145c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f52146d;

    /* renamed from: e, reason: collision with root package name */
    public p0 f52147e;

    /* renamed from: f, reason: collision with root package name */
    public k2 f52148f;

    /* renamed from: g, reason: collision with root package name */
    public final ho2.c f52149g;

    public s0(Context context, ao2.j0 coroutineScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f52144b = context;
        this.f52145c = coroutineScope;
        this.f52146d = new CopyOnWriteArrayList();
        this.f52147e = new gi2.b();
        this.f52149g = new ho2.c(coroutineScope.getCoroutineContext().plus(new ao2.i0("SceneViewAdapterStatusChecking")));
    }

    public final void g(o0 l13) {
        Intrinsics.checkNotNullParameter(l13, "l");
        this.f52146d.add(l13);
    }

    public final void h() {
        Context context;
        k2 k2Var = this.f52148f;
        if (k2Var != null) {
            k2Var.cancel((CancellationException) null);
        }
        Iterator it = l().f79314f.iterator();
        while (it.hasNext()) {
            ke2.i iVar = ((ke2.d) it.next()).f79319a;
            h hVar = iVar instanceof h ? (h) iVar : null;
            if (hVar != null && (context = this.f52144b) != null && (context instanceof Activity)) {
                Activity activity = (Activity) context;
                if (!activity.isDestroyed() && !activity.isFinishing()) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    com.bumptech.glide.b.f(context).e(hVar.f52049o);
                    hVar.f52049o = null;
                }
            }
        }
    }

    public abstract CompletableFuture i();

    public final ke2.d k(z1 item) {
        ke2.i c1Var;
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof u1) {
            c1Var = new h();
        } else {
            if (!(item instanceof y1)) {
                throw new NoWhenBranchMatchedException();
            }
            c1Var = new c1();
        }
        return f.c(this, item, c1Var);
    }

    public abstract ke2.c l();

    public final void n() {
        k2 k2Var = this.f52148f;
        if (k2Var != null) {
            k2Var.cancel((CancellationException) null);
        }
        this.f52148f = kotlin.jvm.internal.j.z(this.f52145c, null, null, new r0(this, null), 3);
    }
}
