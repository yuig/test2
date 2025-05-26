package f5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import g1.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kh2.a1;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final o f61091a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f61092b;

    static {
        Trace.beginSection(tb.f.k0("TypefaceCompat static init"));
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 29) {
            f61091a = new n(0);
        } else if (i13 >= 28) {
            f61091a = new m();
        } else {
            f61091a = new l();
        }
        f61092b = new r(16);
        Trace.endSection();
    }

    public static Typeface a(Context context, Typeface typeface, int i13) {
        if (context != null) {
            return Typeface.create(typeface, i13);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, e5.e eVar, Resources resources, int i13, String str, int i14, int i15, ue.c cVar, boolean z13) {
        Typeface a13;
        List unmodifiableList;
        if (eVar instanceof e5.h) {
            e5.h hVar = (e5.h) eVar;
            Typeface e13 = e(hVar.f57229e);
            if (e13 != null) {
                if (cVar != null) {
                    cVar.e(e13);
                }
                return e13;
            }
            int i16 = 1;
            boolean z14 = !z13 ? cVar != null : hVar.f57228d != 0;
            int i17 = z13 ? hVar.f57227c : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            i iVar = new i(cVar);
            m5.c cVar2 = hVar.f57225a;
            m5.c cVar3 = hVar.f57226b;
            if (cVar3 != null) {
                Object[] objArr = {cVar2, cVar3};
                ArrayList arrayList = new ArrayList(2);
                for (int i18 = 0; i18 < 2; i18++) {
                    Object obj = objArr[i18];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } else {
                Object[] objArr2 = {cVar2};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = objArr2[0];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                unmodifiableList = Collections.unmodifiableList(arrayList2);
            }
            sp2.i iVar2 = new sp2.i(10, iVar, new m5.j(handler));
            a13 = null;
            if (!z14) {
                a13 = m5.f.c(context, unmodifiableList, i15, null, iVar2);
            } else {
                if (unmodifiableList.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                m5.c cVar4 = (m5.c) unmodifiableList.get(0);
                r rVar = m5.f.f85851a;
                ArrayList arrayList3 = new ArrayList(1);
                Object obj3 = new Object[]{cVar4}[0];
                Objects.requireNonNull(obj3);
                arrayList3.add(obj3);
                String a14 = m5.f.a(i15, Collections.unmodifiableList(arrayList3));
                Typeface typeface = (Typeface) m5.f.f85851a.c(a14);
                if (typeface != null) {
                    ((Executor) iVar2.f114929c).execute(new s.f(iVar2, (a1) iVar2.f114928b, typeface, i16));
                    a13 = typeface;
                } else if (i17 == -1) {
                    Object[] objArr3 = {cVar4};
                    ArrayList arrayList4 = new ArrayList(1);
                    Object obj4 = objArr3[0];
                    Objects.requireNonNull(obj4);
                    arrayList4.add(obj4);
                    m5.e b13 = m5.f.b(a14, context, Collections.unmodifiableList(arrayList4), i15);
                    iVar2.W(b13);
                    a13 = b13.f85849a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    m5.e eVar2 = (m5.e) m5.f.f85852b.submit(new m5.d(a14, context, cVar4, i15, 0)).get(i17, TimeUnit.MILLISECONDS);
                                    iVar2.W(eVar2);
                                    a13 = eVar2.f85849a;
                                } catch (ExecutionException e14) {
                                    throw new RuntimeException(e14);
                                }
                            } catch (InterruptedException e15) {
                                throw e15;
                            }
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((Executor) iVar2.f114929c).execute(new d.d(iVar2, (a1) iVar2.f114928b, -3, 6, 0));
                    }
                }
            }
        } else {
            a13 = f61091a.a(context, (e5.f) eVar, resources, i15);
            if (cVar != null) {
                if (a13 != null) {
                    cVar.e(a13);
                } else {
                    cVar.d(-3);
                }
            }
        }
        if (a13 != null) {
            f61092b.d(d(resources, i13, str, i14, i15), a13);
        }
        return a13;
    }

    public static Typeface c(Context context, Resources resources, int i13, String str, int i14, int i15) {
        Typeface e13 = f61091a.e(context, resources, i13, str, i15);
        if (e13 != null) {
            f61092b.d(d(resources, i13, str, i14, i15), e13);
        }
        return e13;
    }

    public static String d(Resources resources, int i13, String str, int i14, int i15) {
        return resources.getResourcePackageName(i13) + '-' + str + '-' + i14 + '-' + i13 + '-' + i15;
    }

    public static Typeface e(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
