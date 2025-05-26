package rb;

import android.content.Context;
import android.content.IntentFilter;
import d7.a0;
import kb.b0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d extends f {

    /* renamed from: f, reason: collision with root package name */
    public final a0 f107058f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, vb.b taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f107058f = new a0(this, 2);
    }

    @Override // rb.f
    public final void c() {
        String str;
        b0 e13 = b0.e();
        str = e.f107059a;
        e13.a(str, getClass().getSimpleName().concat(": registering receiver"));
        this.f107061b.registerReceiver(this.f107058f, e());
    }

    @Override // rb.f
    public final void d() {
        String str;
        b0 e13 = b0.e();
        str = e.f107059a;
        e13.a(str, getClass().getSimpleName().concat(": unregistering receiver"));
        this.f107061b.unregisterReceiver(this.f107058f);
    }

    public abstract IntentFilter e();
}
