package am;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class c implements e, g {

    /* renamed from: a, reason: collision with root package name */
    public final cm.a f15509a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f15510b;

    /* renamed from: c, reason: collision with root package name */
    public final cm.a f15511c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f15512d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f15513e;

    public c(Context context, String str, Set set, cm.a aVar, Executor executor) {
        this.f15509a = new nl.c(context, str);
        this.f15512d = set;
        this.f15513e = executor;
        this.f15511c = aVar;
        this.f15510b = context;
    }

    public final Task a() {
        if (!b7.c.C(this.f15510b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f15513e, new b(this, 0));
    }

    public final void b() {
        if (this.f15512d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!b7.c.C(this.f15510b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.f15513e, new b(this, 1));
        }
    }
}
