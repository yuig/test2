package ke2;

import com.pinterest.xrenderer.RustBridge$Scene;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final c f79324a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f79325b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f79326c;

    /* renamed from: d, reason: collision with root package name */
    public volatile long f79327d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f79328e;

    public f(c scene) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        this.f79324a = scene;
        this.f79325b = new Object();
        this.f79328e = new ArrayList();
    }

    public final boolean a() {
        return this.f79327d != 0;
    }

    public final int b(int i13) {
        Object obj;
        synchronized (this.f79325b) {
            try {
                if (!a()) {
                    return -1;
                }
                Iterator it = this.f79328e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((Number) ((Pair) obj).f80347b).intValue() == i13) {
                        break;
                    }
                }
                Pair pair = (Pair) obj;
                return pair != null ? ((Number) pair.f80346a).intValue() : -1;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void c() {
        synchronized (this.f79325b) {
            if (a()) {
                long j13 = this.f79327d;
                this.f79327d = 0L;
                RustBridge$Scene.f52862a.release(j13);
            }
        }
    }

    public final void d() {
        nd2.a block = new nd2.a(this, 13);
        Intrinsics.checkNotNullParameter("", "tag");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter("", "tag");
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke();
    }

    public final int e(int i13) {
        Object obj;
        synchronized (this.f79325b) {
            try {
                if (!a()) {
                    return -1;
                }
                Iterator it = this.f79328e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((Number) ((Pair) obj).f80346a).intValue() == i13) {
                        break;
                    }
                }
                Pair pair = (Pair) obj;
                return pair != null ? ((Number) pair.f80347b).intValue() : -1;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
