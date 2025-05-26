package t3;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class t0 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116192a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f116193b;

    public /* synthetic */ t0(Comparator comparator, int i13) {
        this.f116192a = i13;
        this.f116193b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i13 = this.f116192a;
        Comparator comparator = this.f116193b;
        switch (i13) {
            case 0:
                int compare = comparator.compare(obj, obj2);
                return compare != 0 ? compare : al2.a.b(Integer.valueOf(((z3.q) obj).f140717g), Integer.valueOf(((z3.q) obj2).f140717g));
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                Objects.requireNonNull(entry);
                Objects.requireNonNull(entry2);
                return comparator.compare(entry.getKey(), entry2.getKey());
            case 2:
                int compare2 = comparator.compare(obj, obj2);
                return compare2 != 0 ? compare2 : al2.a.b(Long.valueOf(((yg2.d) obj).f139031a), Long.valueOf(((yg2.d) obj2).f139031a));
            case 3:
                int compare3 = comparator.compare(obj, obj2);
                return compare3 != 0 ? compare3 : al2.a.b(((yg2.d) obj).f139032b, ((yg2.d) obj2).f139032b);
            case 4:
                int compare4 = comparator.compare(obj, obj2);
                return compare4 != 0 ? compare4 : al2.a.b(Boolean.valueOf(((yg2.d) obj).f139035e), Boolean.valueOf(((yg2.d) obj2).f139035e));
            default:
                int compare5 = comparator.compare(obj, obj2);
                return compare5 != 0 ? compare5 : al2.a.b(Long.valueOf(((yg2.d) obj).f139031a), Long.valueOf(((yg2.d) obj2).f139031a));
        }
    }
}
