package ads_mobile_sdk;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class df2 extends jd2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f4266b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jd2 f4267c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jf2 f4268d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df2(jf2 jf2Var, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, o02 o02Var) {
        super(taskCompletionSource);
        this.f4268d = jf2Var;
        this.f4266b = taskCompletionSource2;
        this.f4267c = o02Var;
    }

    @Override // ads_mobile_sdk.jd2
    public final void a() {
        synchronized (this.f4268d.f6790f) {
            try {
                TaskCompletionSource taskCompletionSource = this.f4266b;
                if (taskCompletionSource != null) {
                    this.f4268d.a(taskCompletionSource);
                }
                if (this.f4268d.f6796l.getAndIncrement() > 0) {
                    this.f4268d.f6786b.a("Already connected to the service.", new Object[0]);
                }
                this.f4268d.a(this.f4267c);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
