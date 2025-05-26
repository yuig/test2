package ao2;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class f0 extends kotlin.coroutines.a implements kotlin.coroutines.f {

    /* renamed from: b */
    public static final e0 f20145b = new e0(kotlin.coroutines.f.Ho, new os.d(5));

    public f0() {
        super(kotlin.coroutines.f.Ho);
    }

    public abstract void g(CoroutineContext coroutineContext, Runnable runnable);

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.h key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!(key instanceof kotlin.coroutines.b)) {
            if (kotlin.coroutines.f.Ho == key) {
                return this;
            }
            return null;
        }
        kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
        if (!bVar.a(getKey())) {
            return null;
        }
        CoroutineContext.Element b13 = bVar.b(this);
        if (b13 instanceof CoroutineContext.Element) {
            return b13;
        }
        return null;
    }

    public void h(CoroutineContext coroutineContext, Runnable runnable) {
        g(coroutineContext, runnable);
    }

    public boolean k(CoroutineContext coroutineContext) {
        return !(this instanceof s2);
    }

    public f0 m(int i13, String str) {
        m0.m(i13);
        return new ho2.i(this, i13, str);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.h key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key instanceof kotlin.coroutines.b) {
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            if (bVar.a(getKey()) && bVar.b(this) != null) {
                return kotlin.coroutines.j.f80412a;
            }
        } else if (kotlin.coroutines.f.Ho == key) {
            return kotlin.coroutines.j.f80412a;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + m0.y(this);
    }
}
