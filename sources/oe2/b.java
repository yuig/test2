package oe2;

import io.embrace.android.embracesdk.internal.serialization.AppFrameworkAdapter;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes4.dex */
public final class b extends d {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f94282h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Type type, Set set, AppFrameworkAdapter appFrameworkAdapter, Method method, int i13, int i14, int i15) {
        super(type, set, appFrameworkAdapter, method, i13, i14, true);
        this.f94282h = i15;
    }

    @Override // oe2.d
    public final Object b(v vVar) {
        switch (this.f94282h) {
            case 1:
                return c(vVar);
            default:
                throw new AssertionError();
        }
    }

    @Override // oe2.d
    public final void d(h0 h0Var, y yVar, Object obj) {
        switch (this.f94282h) {
            case 0:
                r[] rVarArr = this.f94307f;
                Object[] objArr = new Object[rVarArr.length + 2];
                objArr[0] = yVar;
                objArr[1] = obj;
                System.arraycopy(rVarArr, 0, objArr, 2, rVarArr.length);
                try {
                    this.f94305d.invoke(this.f94304c, objArr);
                    return;
                } catch (IllegalAccessException unused) {
                    throw new AssertionError();
                }
            default:
                throw new AssertionError();
        }
    }
}
