package h6;

import d7.n0;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f67698a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f67699b;

    public /* synthetic */ a(String str, int i13) {
        this.f67698a = i13;
        this.f67699b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i13 = this.f67698a;
        String str = this.f67699b;
        switch (i13) {
            case 0:
                Thread thread = new Thread(runnable, str);
                thread.setPriority(10);
                return thread;
            default:
                int i14 = n0.f53866a;
                return new Thread(runnable, str);
        }
    }
}
