package hd;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kh2.m3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68792a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f68793b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f68794c;

    public /* synthetic */ d(int i13, Object obj, Object obj2) {
        this.f68792a = i13;
        this.f68793b = obj;
        this.f68794c = obj2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i13 = this.f68792a;
        Object obj = this.f68794c;
        Object obj2 = this.f68793b;
        switch (i13) {
            case 0:
                return new o((n) obj, runnable, (String) obj2);
            default:
                gb2.d dVar = (gb2.d) obj2;
                m3 m3Var = (m3) obj;
                Intrinsics.checkNotNullParameter(runnable, "runnable");
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                if (Intrinsics.d(dVar, ki2.g.f79810b)) {
                    m3Var.f79623d.set(newThread);
                }
                newThread.setName("emb-" + dVar.f64745a);
                return newThread;
        }
    }
}
