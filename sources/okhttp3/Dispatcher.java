package okhttp3;

import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.connection.RealCall;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Dispatcher;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Dispatcher {

    /* renamed from: a, reason: collision with root package name */
    public final int f95603a;

    /* renamed from: b, reason: collision with root package name */
    public final int f95604b;

    /* renamed from: c, reason: collision with root package name */
    public ExecutorService f95605c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f95606d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f95607e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f95608f;

    public Dispatcher() {
        this.f95603a = 64;
        this.f95604b = 5;
        this.f95606d = new ArrayDeque();
        this.f95607e = new ArrayDeque();
        this.f95608f = new ArrayDeque();
    }

    public final void a(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            Unit unit = Unit.f80348a;
        }
        c();
    }

    public final void b(RealCall.AsyncCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        call.f95916b.decrementAndGet();
        a(this.f95607e, call);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.Dispatcher.c():void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dispatcher(ExecutorService executorService) {
        this();
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        this.f95605c = executorService;
    }
}
