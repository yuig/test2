package b4;

import android.util.Size;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.location.ActivityTransition;
import com.pinterest.api.model.h2;
import com.pinterest.api.model.k8;
import com.pinterest.api.model.wy0;
import java.io.File;
import java.util.Comparator;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import uc0.p2;

/* loaded from: classes3.dex */
public final class f implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21548a;

    public /* synthetic */ f(int i13) {
        this.f21548a = i13;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f21548a) {
            case 0:
                return al2.a.b(Integer.valueOf(((e) obj).f21543b), Integer.valueOf(((e) obj2).f21543b));
            case 1:
                return al2.a.b(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
            case 2:
                return al2.a.b(Long.valueOf(((Thread) obj).getId()), Long.valueOf(((Thread) obj2).getId()));
            case 3:
                return ((Scope) obj).f30745g.compareTo(((Scope) obj2).f30745g);
            case 4:
                ActivityTransition activityTransition = (ActivityTransition) obj;
                ActivityTransition activityTransition2 = (ActivityTransition) obj2;
                int i13 = activityTransition.f31822f;
                int i14 = activityTransition2.f31822f;
                if (i13 == i14) {
                    int i15 = activityTransition.f31823g;
                    int i16 = activityTransition2.f31823g;
                    if (i15 == i16) {
                        return 0;
                    }
                    if (i15 >= i16) {
                        return 1;
                    }
                } else if (i13 >= i14) {
                    return 1;
                }
                return -1;
            case 5:
            default:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return al2.a.b(Integer.valueOf(size.getWidth() * size.getHeight()), Integer.valueOf(size2.getWidth() * size2.getHeight()));
            case 6:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 7:
                return al2.a.b(((k8) obj2).createdAt, ((k8) obj).createdAt);
            case 8:
                z40.h d2 = ((z40.n) obj2).d();
                Date d13 = d2 != null ? d2.d() : null;
                z40.h d14 = ((z40.n) obj).d();
                return al2.a.b(d13, d14 != null ? d14.d() : null);
            case 9:
                return al2.a.b(((h2) obj).p(), ((h2) obj2).p());
            case 10:
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Comparable<kotlin.Any>");
                Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Comparable<kotlin.Any>");
                return al2.a.b((Comparable) obj, (Comparable) obj2);
            case 11:
                return al2.a.b(((uc0.x) obj).f121879a, ((uc0.x) obj2).f121879a);
            case 12:
                return al2.a.b(((p2) obj).f121848a, ((p2) obj2).f121848a);
            case 13:
                return al2.a.b(((z40.d0) obj).f(), ((z40.d0) obj2).f());
            case 14:
                return al2.a.b(((z40.d0) obj).f(), ((z40.d0) obj2).f());
            case 15:
                return al2.a.b(((z40.d0) obj).f(), ((z40.d0) obj2).f());
            case 16:
                return al2.a.b(((z40.d0) obj).l(), ((z40.d0) obj2).l());
            case 17:
                return al2.a.b(((z40.d0) obj).l(), ((z40.d0) obj2).l());
            case 18:
                return al2.a.b(((wy0) obj).Z2(), ((wy0) obj2).Z2());
            case 19:
                return al2.a.b(((wy0) obj).Z2(), ((wy0) obj2).Z2());
            case 20:
                return al2.a.b(((wy0) obj).Z2(), ((wy0) obj2).Z2());
            case 21:
                return al2.a.b(((wy0) obj).U2(), ((wy0) obj2).U2());
            case 22:
                return al2.a.b(((wy0) obj).U2(), ((wy0) obj2).U2());
            case 23:
                return al2.a.b(Integer.valueOf(((sk0.a) obj).f113046c), Integer.valueOf(((sk0.a) obj2).f113046c));
            case 24:
                return al2.a.b(((wy0) obj).Z2(), ((wy0) obj2).Z2());
            case 25:
                return al2.a.b(((wy0) obj).Z2(), ((wy0) obj2).Z2());
            case 26:
                return al2.a.b(((wy0) obj).Z2(), ((wy0) obj2).Z2());
            case 27:
                return al2.a.b(((wy0) obj).U2(), ((wy0) obj2).U2());
            case 28:
                return al2.a.b(((wy0) obj).U2(), ((wy0) obj2).U2());
        }
    }
}
