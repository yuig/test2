package v;

import android.util.Size;
import com.pinterest.feature.camera2.view.BaseCameraView;
import java.io.File;
import java.text.Normalizer;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class j2 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123521a;

    public /* synthetic */ j2(int i13) {
        this.f123521a = i13;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i13 = 1;
        switch (this.f123521a) {
            case 0:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
            case 1:
                j2 j2Var = androidx.camera.core.impl.v1.f16978b;
                return ((androidx.camera.core.impl.c) obj).f16809a.compareTo(((androidx.camera.core.impl.c) obj2).f16809a);
            case 2:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                return (((Number) pair.f80347b).intValue() - ((Number) pair.f80346a).intValue()) - (((Number) pair2.f80347b).intValue() - ((Number) pair2.f80346a).intValue());
            case 3:
                int i14 = z7.g.f140919m;
                long j13 = ((z7.d) obj).f140910c;
                long j14 = ((z7.d) obj2).f140910c;
                int i15 = d7.n0.f53866a;
                if (j13 < j14) {
                    return -1;
                }
                return j13 == j14 ? 0 : 1;
            case 4:
                int i16 = z7.g.f140919m;
                long j15 = ((z7.d) obj).f140910c;
                long j16 = ((z7.d) obj2).f140910c;
                int i17 = d7.n0.f53866a;
                if (j15 < j16) {
                    return -1;
                }
                return j15 == j16 ? 0 : 1;
            case 5:
                int i18 = z7.g.f140919m;
                long j17 = ((z7.d) obj).f140910c;
                long j18 = ((z7.d) obj2).f140910c;
                int i19 = d7.n0.f53866a;
                if (j17 < j18) {
                    return -1;
                }
                return j17 == j18 ? 0 : 1;
            case 6:
                return h0.j.b(((a8.j) obj).f1369a.f1358c, ((a8.j) obj2).f1369a.f1358c);
            case 7:
                return Integer.compare(((k8.g) ((List) obj).get(0)).f78527f, ((k8.g) ((List) obj2).get(0)).f78527f);
            case 8:
                return k8.p.d((k8.p) obj, (k8.p) obj2);
            case 9:
                return k8.p.d((k8.p) obj, (k8.p) obj2);
            case 10:
                return k8.p.d((k8.p) obj, (k8.p) obj2);
            case 11:
                return k8.p.c((k8.p) obj, (k8.p) obj2);
            case 12:
                return k8.p.c((k8.p) obj, (k8.p) obj2);
            case 13:
                return k8.p.c((k8.p) obj, (k8.p) obj2);
            case 14:
            case 21:
            default:
                Runnable lhs = (Runnable) obj;
                Runnable rhs = (Runnable) obj2;
                Intrinsics.checkNotNullParameter(lhs, "lhs");
                Intrinsics.checkNotNullParameter(rhs, "rhs");
                if (!(lhs instanceof ki2.c) || !(rhs instanceof ki2.c)) {
                    throw new IllegalArgumentException("Runnables must be PriorityRunnableFuture".toString());
                }
                ki2.c cVar = (ki2.c) lhs;
                Object obj3 = cVar.f79808b;
                if (obj3 instanceof yg2.d) {
                    Object obj4 = ((ki2.c) rhs).f79808b;
                    if (obj4 instanceof yg2.d) {
                        if (obj3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type io.embrace.android.embracesdk.internal.delivery.StoredTelemetryMetadata");
                        }
                        yg2.d dVar = (yg2.d) obj3;
                        if (obj4 != null) {
                            return yg2.c.f139030b.compare(dVar, (yg2.d) obj4);
                        }
                        throw new NullPointerException("null cannot be cast to non-null type io.embrace.android.embracesdk.internal.delivery.StoredTelemetryMetadata");
                    }
                }
                StringBuilder sb3 = new StringBuilder("PriorityInfo must be of type ");
                sb3.append(yg2.d.class.getSimpleName());
                sb3.append(", got ");
                Class<?> cls = cVar.f79808b.getClass();
                kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
                sb3.append(l0Var.b(cls));
                sb3.append(" and ");
                sb3.append(l0Var.b(((ki2.c) rhs).f79808b.getClass()));
                throw new IllegalArgumentException(sb3.toString().toString());
            case 15:
                return Integer.compare(((m9.d) obj2).f86569b, ((m9.d) obj).f86569b);
            case 16:
                return Integer.compare(((u9.e) obj).f121143a.f121146b, ((u9.e) obj2).f121143a.f121146b);
            case 17:
                return Long.compare(((u9.d) obj).f121140b, ((u9.d) obj2).f121140b);
            case 18:
                androidx.media3.ui.n0 n0Var = (androidx.media3.ui.n0) obj;
                androidx.media3.ui.n0 n0Var2 = (androidx.media3.ui.n0) obj2;
                int compare = Integer.compare(n0Var2.f19062b, n0Var.f19062b);
                if (compare != 0) {
                    return compare;
                }
                int compareTo = n0Var.f19063c.compareTo(n0Var2.f19063c);
                return compareTo != 0 ? compareTo : n0Var.f19064d.compareTo(n0Var2.f19064d);
            case 19:
                androidx.media3.ui.n0 n0Var3 = (androidx.media3.ui.n0) obj;
                androidx.media3.ui.n0 n0Var4 = (androidx.media3.ui.n0) obj2;
                int compare2 = Integer.compare(n0Var4.f19061a, n0Var3.f19061a);
                if (compare2 != 0) {
                    return compare2;
                }
                int compareTo2 = n0Var4.f19063c.compareTo(n0Var3.f19063c);
                return compareTo2 != 0 ? compareTo2 : n0Var4.f19064d.compareTo(n0Var3.f19064d);
            case 20:
                File file = (File) obj;
                File file2 = (File) obj2;
                if (file == null && file2 == null) {
                    return 0;
                }
                if (file == null) {
                    return 1;
                }
                if (file2 == null) {
                    return -1;
                }
                return file.compareTo(file2);
            case 22:
                ff.d dVar2 = (ff.d) obj;
                ff.d data = (ff.d) obj2;
                AtomicBoolean atomicBoolean = gf.c.f64864a;
                if (p001if.a.b(gf.c.class)) {
                    return 0;
                }
                try {
                    Intrinsics.checkNotNullExpressionValue(data, "o2");
                    dVar2.getClass();
                    Intrinsics.checkNotNullParameter(data, "data");
                    Long l13 = dVar2.f62098g;
                    if (l13 == null) {
                        i13 = -1;
                    } else {
                        long longValue = l13.longValue();
                        Long l14 = data.f62098g;
                        if (l14 != null) {
                            i13 = Intrinsics.j(l14.longValue(), longValue);
                        }
                    }
                    return i13;
                } catch (Throwable th3) {
                    p001if.a.a(gf.c.class, th3);
                    return 0;
                }
            case 23:
                ff.d dVar3 = (ff.d) obj;
                ff.d data2 = (ff.d) obj2;
                Intrinsics.checkNotNullExpressionValue(data2, "o2");
                dVar3.getClass();
                Intrinsics.checkNotNullParameter(data2, "data");
                Long l15 = dVar3.f62098g;
                if (l15 == null) {
                    return -1;
                }
                long longValue2 = l15.longValue();
                Long l16 = data2.f62098g;
                if (l16 == null) {
                    return 1;
                }
                return Intrinsics.j(l16.longValue(), longValue2);
            case 24:
                jf.a aVar = (jf.a) obj;
                jf.a data3 = (jf.a) obj2;
                Intrinsics.checkNotNullExpressionValue(data3, "o2");
                aVar.getClass();
                Intrinsics.checkNotNullParameter(data3, "data");
                Long l17 = aVar.f75857c;
                if (l17 == null) {
                    return -1;
                }
                long longValue3 = l17.longValue();
                Long l18 = data3.f75857c;
                if (l18 == null) {
                    return 1;
                }
                return Intrinsics.j(l18.longValue(), longValue3);
            case 25:
                String str = ((m91.b) obj).f86724d;
                Normalizer.Form form = Normalizer.Form.NFD;
                String normalize = Normalizer.normalize(str, form);
                String normalize2 = Normalizer.normalize(((m91.b) obj2).f86724d, form);
                Intrinsics.f(normalize2);
                return normalize.compareTo(normalize2);
            case 26:
                Size size3 = (Size) obj;
                Size size4 = (Size) obj2;
                int i23 = BaseCameraView.f45419p;
                return Long.compare(size3.getWidth() * size3.getHeight(), size4.getWidth() * size4.getHeight());
            case 27:
                String str2 = ((m91.b) obj).f86724d;
                Normalizer.Form form2 = Normalizer.Form.NFD;
                String normalize3 = Normalizer.normalize(str2, form2);
                String normalize4 = Normalizer.normalize(((m91.b) obj2).f86724d, form2);
                Intrinsics.f(normalize4);
                return normalize3.compareTo(normalize4);
        }
    }
}
