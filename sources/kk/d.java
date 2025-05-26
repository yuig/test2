package kk;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class d implements jk.p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f79878a;

    /* renamed from: b, reason: collision with root package name */
    public final ik.c f79879b;

    /* renamed from: c, reason: collision with root package name */
    public final rg.a f79880c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f79881d;

    public d(Context context, ThreadPoolExecutor threadPoolExecutor, rg.a aVar, ik.c cVar) {
        this.f79878a = context;
        this.f79879b = cVar;
        this.f79880c = aVar;
        this.f79881d = threadPoolExecutor;
    }
}
