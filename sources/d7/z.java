package d7;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f53899a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f53900b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f53901c;

    public z(b0 b0Var, y yVar, Executor executor) {
        this.f53901c = b0Var;
        this.f53899a = new WeakReference(yVar);
        this.f53900b = executor;
    }
}
