package do2;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public abstract class g2 {

    /* renamed from: a */
    public static final fi.b f55806a = new fi.b("NO_VALUE", 4);

    public static final f2 a(int i13, int i14, co2.a aVar) {
        if (i13 < 0) {
            throw new IllegalArgumentException(a.a.d("replay cannot be negative, but was ", i13).toString());
        }
        if (i14 < 0) {
            throw new IllegalArgumentException(a.a.d("extraBufferCapacity cannot be negative, but was ", i14).toString());
        }
        if (i13 <= 0 && i14 <= 0 && aVar != co2.a.SUSPEND) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
        }
        int i15 = i14 + i13;
        if (i15 < 0) {
            i15 = Integer.MAX_VALUE;
        }
        return new f2(i13, i15, aVar);
    }

    public static /* synthetic */ f2 b(int i13, int i14, co2.a aVar, int i15) {
        if ((i15 & 1) != 0) {
            i13 = 0;
        }
        if ((i15 & 2) != 0) {
            i14 = 0;
        }
        if ((i15 & 4) != 0) {
            aVar = co2.a.SUSPEND;
        }
        return a(i13, i14, aVar);
    }

    public static final void c(Object[] objArr, long j13, Object obj) {
        objArr[((int) j13) & (objArr.length - 1)] = obj;
    }

    public static final i d(b2 b2Var, CoroutineContext coroutineContext, int i13, co2.a aVar) {
        return ((i13 == 0 || i13 == -3) && aVar == co2.a.SUSPEND) ? b2Var : new eo2.m(i13, coroutineContext, aVar, b2Var);
    }
}
