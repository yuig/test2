package yh;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import rd.j;

/* loaded from: classes.dex */
public final class i implements ah.a {

    /* renamed from: a, reason: collision with root package name */
    public final h f139047a;

    /* renamed from: b, reason: collision with root package name */
    public final f f139048b;

    public i(Context context) {
        f fVar;
        this.f139047a = new h(context, ih.d.f72259b);
        synchronized (f.class) {
            try {
                if (f.f139040c == null) {
                    f.f139040c = new f(context.getApplicationContext());
                }
                fVar = f.f139040c;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f139048b = fVar;
    }

    @Override // ah.a
    public final Task a() {
        return this.f139047a.a().continueWithTask(new j(this, 11));
    }
}
