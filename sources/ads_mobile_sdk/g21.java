package ads_mobile_sdk;

import a.pd;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class g21 extends xk2 {

    /* renamed from: f, reason: collision with root package name */
    public static volatile Long f5356f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f5357g = new Object();

    public g21(pd pdVar, a.m mVar, bt2 bt2Var) {
        super("C8g5KW+aToIxjVDikHcmc6BWwsjtOPD3Z1yAAuVxKvMjc09grRxjiXAWFcgsrPGU", "w1TsRr5NqnqDKRjXJdUJFT2qzlvv9vG5KMm7gY4RmZc=", pdVar, mVar, bt2Var.a(xb0.EVENT_ID_JAILBREAK_SIGNALS_TASK));
    }

    @Override // ads_mobile_sdk.xk2
    public final void a(Method method, pd pdVar) {
        int i13;
        if (f5356f == null) {
            synchronized (f5357g) {
                try {
                    if (f5356f == null) {
                        Long l13 = (Long) method.invoke("", new Object[0]);
                        l13.getClass();
                        f5356f = l13;
                    }
                } finally {
                }
            }
        }
        synchronized (pdVar) {
            try {
                if (f5356f != null) {
                    long longValue = f5356f.longValue();
                    pdVar.b();
                    wb wbVar = (wb) pdVar.f10110b;
                    i13 = wbVar.bitField0_;
                    wbVar.bitField0_ = i13 | 1048576;
                    wbVar.jbkSignal_ = longValue;
                }
            } finally {
            }
        }
    }
}
