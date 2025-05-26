package se;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes3.dex */
public final class e implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112330a;

    public /* synthetic */ e(int i13) {
        this.f112330a = i13;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object proxy, Method m13, Object[] objArr) {
        switch (this.f112330a) {
            case 0:
                if (!p001if.a.b(this)) {
                    try {
                        Intrinsics.checkNotNullParameter(proxy, "proxy");
                        Intrinsics.checkNotNullParameter(m13, "m");
                        if (Intrinsics.d(m13.getName(), "onBillingSetupFinished")) {
                            me.f fVar = g.f112334s;
                            me.f.o().set(true);
                        } else {
                            String name = m13.getName();
                            Intrinsics.checkNotNullExpressionValue(name, "m.name");
                            if (z.h(name, "onBillingServiceDisconnected", false)) {
                                me.f fVar2 = g.f112334s;
                                me.f.o().set(false);
                            }
                        }
                        break;
                    } catch (Throwable th3) {
                        p001if.a.a(this, th3);
                        break;
                    }
                }
                break;
            default:
                if (!p001if.a.b(this)) {
                    try {
                        Intrinsics.checkNotNullParameter(proxy, "proxy");
                        Intrinsics.checkNotNullParameter(m13, "m");
                        break;
                    } catch (Throwable th4) {
                        p001if.a.a(this, th4);
                        break;
                    }
                }
                break;
        }
        return null;
        return null;
    }
}
