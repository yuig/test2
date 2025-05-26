package kotlin.coroutines;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;

/* loaded from: classes2.dex */
public final class e implements CoroutineContext, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f80409a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext.Element f80410b;

    public e(CoroutineContext left, CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f80409a = left;
        this.f80410b = element;
    }

    private final Object writeReplace() {
        int a13 = a();
        CoroutineContext[] coroutineContextArr = new CoroutineContext[a13];
        h0 h0Var = new h0();
        fold(Unit.f80348a, new d(coroutineContextArr, h0Var));
        if (h0Var.f80426a == a13) {
            return new bl2.b(coroutineContextArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int a() {
        int i13 = 2;
        e eVar = this;
        while (true) {
            CoroutineContext coroutineContext = eVar.f80409a;
            eVar = coroutineContext instanceof e ? (e) coroutineContext : null;
            if (eVar == null) {
                return i13;
            }
            i13++;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (eVar.a() == a()) {
                    e eVar2 = this;
                    while (true) {
                        CoroutineContext.Element element = eVar2.f80410b;
                        if (!Intrinsics.d(eVar.get(element.getKey()), element)) {
                            break;
                        }
                        CoroutineContext coroutineContext = eVar2.f80409a;
                        if (coroutineContext instanceof e) {
                            eVar2 = (e) coroutineContext;
                        } else {
                            Intrinsics.g(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                            CoroutineContext.Element element2 = (CoroutineContext.Element) coroutineContext;
                            if (Intrinsics.d(eVar.get(element2.getKey()), element2)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this.f80409a.fold(obj, operation), this.f80410b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(h key) {
        Intrinsics.checkNotNullParameter(key, "key");
        e eVar = this;
        while (true) {
            CoroutineContext.Element element = eVar.f80410b.get(key);
            if (element != null) {
                return element;
            }
            CoroutineContext coroutineContext = eVar.f80409a;
            if (!(coroutineContext instanceof e)) {
                return coroutineContext.get(key);
            }
            eVar = (e) coroutineContext;
        }
    }

    public final int hashCode() {
        return this.f80410b.hashCode() + this.f80409a.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(h key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CoroutineContext.Element element = this.f80410b;
        CoroutineContext.Element element2 = element.get(key);
        CoroutineContext coroutineContext = this.f80409a;
        if (element2 != null) {
            return coroutineContext;
        }
        CoroutineContext minusKey = coroutineContext.minusKey(key);
        return minusKey == coroutineContext ? this : minusKey == j.f80412a ? element : new e(minusKey, element);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context == j.f80412a ? this : (CoroutineContext) context.fold(this, i.f80411i);
    }

    public final String toString() {
        return ep.b.k(new StringBuilder("["), (String) fold("", c.f80406i), ']');
    }
}
