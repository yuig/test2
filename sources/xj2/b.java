package xj2;

import bp1.h;
import ck2.i;
import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import pk2.m;

/* loaded from: classes2.dex */
public final class b implements c, bk2.b {

    /* renamed from: a, reason: collision with root package name */
    public m f135162a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f135163b;

    public static void e(m mVar) {
        if (mVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : mVar.f100554d) {
            if (obj instanceof c) {
                try {
                    ((c) obj).dispose();
                } catch (Throwable th3) {
                    h.H(th3);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th3);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw pk2.h.d((Throwable) arrayList.get(0));
        }
    }

    @Override // bk2.b
    public final boolean a(c cVar) {
        i.b(cVar, "disposable is null");
        if (!this.f135163b) {
            synchronized (this) {
                try {
                    if (!this.f135163b) {
                        m mVar = this.f135162a;
                        if (mVar == null) {
                            mVar = new m(16);
                            this.f135162a = mVar;
                        }
                        mVar.a(cVar);
                        return true;
                    }
                } finally {
                }
            }
        }
        cVar.dispose();
        return false;
    }

    @Override // bk2.b
    public final boolean b(c cVar) {
        if (!c(cVar)) {
            return false;
        }
        cVar.dispose();
        return true;
    }

    @Override // bk2.b
    public final boolean c(c cVar) {
        Object obj;
        i.b(cVar, "disposables is null");
        if (this.f135163b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f135163b) {
                    return false;
                }
                m mVar = this.f135162a;
                if (mVar != null) {
                    Object[] objArr = mVar.f100554d;
                    int i13 = mVar.f100551a;
                    int hashCode = cVar.hashCode() * (-1640531527);
                    int i14 = (hashCode ^ (hashCode >>> 16)) & i13;
                    Object obj2 = objArr[i14];
                    if (obj2 != null) {
                        if (obj2.equals(cVar)) {
                            mVar.b(i14, i13, objArr);
                        } else {
                            do {
                                i14 = (i14 + 1) & i13;
                                obj = objArr[i14];
                                if (obj == null) {
                                }
                            } while (!obj.equals(cVar));
                            mVar.b(i14, i13, objArr);
                        }
                        return true;
                    }
                }
                return false;
            } finally {
            }
        }
    }

    public final void d() {
        if (this.f135163b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f135163b) {
                    return;
                }
                m mVar = this.f135162a;
                this.f135162a = null;
                e(mVar);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // xj2.c
    public final void dispose() {
        if (this.f135163b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f135163b) {
                    return;
                }
                this.f135163b = true;
                m mVar = this.f135162a;
                this.f135162a = null;
                e(mVar);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f135163b;
    }
}
