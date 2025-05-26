package d7;

import a7.o0;
import android.content.Context;
import android.net.NetworkInfo;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import pk.a3;
import pk.f1;
import pk.h1;
import pk.h2;
import pk.t2;
import pk.u0;

/* loaded from: classes.dex */
public class b0 implements x7.k {

    /* renamed from: f, reason: collision with root package name */
    public static b0 f53786f;

    /* renamed from: a, reason: collision with root package name */
    public int f53787a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f53788b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f53789c;

    /* renamed from: d, reason: collision with root package name */
    public Object f53790d;

    /* renamed from: e, reason: collision with root package name */
    public Object f53791e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(int i13, int i14) {
        this(4);
        if (i13 == 2) {
            return;
        }
        this.f53787a = 0;
        this.f53788b = false;
        this.f53789c = null;
        this.f53790d = null;
        this.f53791e = null;
    }

    public static synchronized b0 b(Context context) {
        b0 b0Var;
        synchronized (b0.class) {
            try {
                if (f53786f == null) {
                    f53786f = new b0(context, 0);
                }
                b0Var = f53786f;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return b0Var;
    }

    public static int c(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return n0.f53866a >= 29 ? 9 : 0;
        }
    }

    public static void k(int i13, Comparator comparator, Object[] objArr) {
        Map.Entry[] entryArr = new Map.Entry[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i14 * 2;
            Object obj = objArr[i15];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i15 + 1];
            Objects.requireNonNull(obj2);
            entryArr[i14] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
        }
        t2 g0Var = comparator instanceof t2 ? (t2) comparator : new pk.g0(comparator);
        h2 h2Var = h2.VALUE;
        g0Var.getClass();
        Arrays.sort(entryArr, 0, i13, new pk.z(h2Var, g0Var));
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = i16 * 2;
            objArr[i17] = entryArr[i16].getKey();
            objArr[i17 + 1] = entryArr[i16].getValue();
        }
    }

    public h1 a() {
        Object[] objArr;
        f1 f1Var = (f1) this.f53791e;
        if (f1Var != null) {
            throw f1Var.a();
        }
        int i13 = this.f53787a;
        if (((Comparator) this.f53789c) == null) {
            objArr = (Object[]) this.f53790d;
        } else {
            if (this.f53788b) {
                this.f53790d = Arrays.copyOf((Object[]) this.f53790d, i13 * 2);
            }
            objArr = (Object[]) this.f53790d;
            k(i13, (Comparator) this.f53789c, objArr);
        }
        this.f53788b = true;
        a3 k13 = a3.k(i13, objArr, this);
        f1 f1Var2 = (f1) this.f53791e;
        if (f1Var2 == null) {
            return k13;
        }
        throw f1Var2.a();
    }

    public final int d() {
        int i13;
        synchronized (this.f53791e) {
            i13 = this.f53787a;
        }
        return i13;
    }

    public b0 e(Object obj, Object obj2) {
        int i13 = (this.f53787a + 1) * 2;
        Object[] objArr = (Object[]) this.f53790d;
        if (i13 > objArr.length) {
            this.f53790d = Arrays.copyOf(objArr, u0.d(objArr.length, i13));
            this.f53788b = false;
        }
        pk.a0.B(obj, obj2);
        Object[] objArr2 = (Object[]) this.f53790d;
        int i14 = this.f53787a;
        int i15 = i14 * 2;
        objArr2[i15] = obj;
        objArr2[i15 + 1] = obj2;
        this.f53787a = i14 + 1;
        return this;
    }

    public void f(Map.Entry entry) {
        e(entry.getKey(), entry.getValue());
    }

    public b0 g(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = (((Collection) iterable).size() + this.f53787a) * 2;
            Object[] objArr = (Object[]) this.f53790d;
            if (size > objArr.length) {
                this.f53790d = Arrays.copyOf(objArr, u0.d(objArr.length, size));
                this.f53788b = false;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            f((Map.Entry) it.next());
        }
        return this;
    }

    public final void h(y yVar, Executor executor) {
        boolean z13;
        j();
        z zVar = new z(this, yVar, executor);
        synchronized (this.f53791e) {
            ((CopyOnWriteArrayList) this.f53790d).add(zVar);
            z13 = this.f53788b;
        }
        if (z13) {
            zVar.f53900b.execute(new androidx.activity.d(zVar, 9));
        }
    }

    @Override // x7.k
    public final x7.l i(androidx.appcompat.widget.x xVar) {
        int i13;
        ae.s sVar;
        Context context;
        int i14 = n0.f53866a;
        if (i14 < 23 || ((i13 = this.f53787a) != 1 && (i13 != 0 || (i14 < 31 && ((context = (Context) this.f53789c) == null || i14 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))))) {
            return new v5.x(24).i(xVar);
        }
        int j13 = o0.j(((androidx.media3.common.b) xVar.f16710c).f18765o);
        u.f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + n0.L(j13));
        Object obj = this.f53790d;
        if (((ok.g0) obj) != null) {
            Object obj2 = this.f53791e;
            if (((ok.g0) obj2) != null) {
                sVar = new ae.s((ok.g0) obj, (ok.g0) obj2);
                sVar.f15032b = this.f53788b;
                return sVar.i(xVar);
            }
        }
        sVar = new ae.s(j13);
        sVar.f15032b = this.f53788b;
        return sVar.i(xVar);
    }

    public final void j() {
        Iterator it = ((CopyOnWriteArrayList) this.f53790d).iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            if (zVar.f53899a.get() == null) {
                ((CopyOnWriteArrayList) this.f53790d).remove(zVar);
            }
        }
    }

    public final void l(int i13) {
        j();
        synchronized (this.f53791e) {
            try {
                if (this.f53788b && this.f53787a == i13) {
                    return;
                }
                this.f53788b = true;
                this.f53787a = i13;
                Iterator it = ((CopyOnWriteArrayList) this.f53790d).iterator();
                while (it.hasNext()) {
                    z zVar = (z) it.next();
                    zVar.getClass();
                    zVar.f53900b.execute(new androidx.activity.d(zVar, 9));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public b0(Context context, int i13) {
        if (i13 != 1) {
            this.f53789c = b.K();
            this.f53790d = new CopyOnWriteArrayList();
            this.f53791e = new Object();
            this.f53787a = 0;
            ((Executor) this.f53789c).execute(new e5.k(4, this, context));
            return;
        }
        this.f53789c = context;
        this.f53787a = 0;
        this.f53788b = false;
        this.f53790d = null;
        this.f53791e = null;
    }

    public b0(int i13) {
        this.f53790d = new Object[i13 * 2];
        this.f53787a = 0;
        this.f53788b = false;
    }
}
