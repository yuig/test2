package uo2;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f122927a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f122928b;

    public /* synthetic */ b(String str, boolean z13) {
        this.f122927a = str;
        this.f122928b = z13;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        byte[] bArr = Util.f95757a;
        String name = this.f122927a;
        Intrinsics.checkNotNullParameter(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(this.f122928b);
        return thread;
    }
}
