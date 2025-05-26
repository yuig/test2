package rb;

import android.content.Context;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final vb.b f107060a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f107061b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f107062c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f107063d;

    /* renamed from: e, reason: collision with root package name */
    public Object f107064e;

    public f(Context context, vb.b taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f107060a = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f107061b = applicationContext;
        this.f107062c = new Object();
        this.f107063d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(Object obj) {
        synchronized (this.f107062c) {
            Object obj2 = this.f107064e;
            if (obj2 == null || !Intrinsics.d(obj2, obj)) {
                this.f107064e = obj;
                this.f107060a.f125447d.execute(new e5.k(15, CollectionsKt.F0(this.f107063d), this));
                Unit unit = Unit.f80348a;
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
