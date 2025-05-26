package ul2;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class w1 implements Function0 {

    /* renamed from: c, reason: collision with root package name */
    public static final re2.f f122626c = new re2.f(5);

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f122627a;

    /* renamed from: b, reason: collision with root package name */
    public volatile SoftReference f122628b;

    public w1(Object obj, Function0 function0) {
        if (function0 == null) {
            b();
            throw null;
        }
        this.f122628b = null;
        this.f122627a = function0;
        if (obj != null) {
            this.f122628b = new SoftReference(obj);
        }
    }

    public static /* synthetic */ void b() {
        throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        SoftReference softReference = this.f122628b;
        Object obj2 = f122626c;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object invoke = this.f122627a.invoke();
        if (invoke != null) {
            obj2 = invoke;
        }
        this.f122628b = new SoftReference(obj2);
        return invoke;
    }
}
