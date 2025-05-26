package yn2;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes2.dex */
public final class l implements Iterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139575a;

    /* renamed from: b, reason: collision with root package name */
    public int f139576b;

    /* renamed from: c, reason: collision with root package name */
    public Object f139577c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f139578d;

    public l(m mVar) {
        this.f139575a = 1;
        this.f139578d = mVar;
        this.f139577c = ((Sequence) mVar.f139580b).iterator();
    }

    public final void b() {
        Object invoke;
        int i13 = this.f139576b;
        m mVar = this.f139578d;
        if (i13 == -2) {
            invoke = ((Function0) mVar.f139580b).invoke();
        } else {
            Function1 function1 = (Function1) mVar.f139581c;
            Object obj = this.f139577c;
            Intrinsics.f(obj);
            invoke = function1.invoke(obj);
        }
        this.f139577c = invoke;
        this.f139576b = invoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f139575a) {
            case 0:
                if (this.f139576b < 0) {
                    b();
                }
                return this.f139576b == 1;
            default:
                return ((Iterator) this.f139577c).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f139575a) {
            case 0:
                if (this.f139576b < 0) {
                    b();
                }
                if (this.f139576b == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f139577c;
                Intrinsics.g(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f139576b = -1;
                return obj;
            default:
                Function2 function2 = (Function2) this.f139578d.f139581c;
                int i13 = this.f139576b;
                this.f139576b = i13 + 1;
                if (i13 >= 0) {
                    return function2.invoke(Integer.valueOf(i13), ((Iterator) this.f139577c).next());
                }
                kotlin.collections.f0.p();
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f139575a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public l(m mVar, int i13) {
        this.f139575a = 0;
        this.f139578d = mVar;
        this.f139576b = -2;
    }
}
