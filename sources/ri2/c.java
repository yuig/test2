package ri2;

import com.pinterest.activity.sendapin.model.TypeAheadItem;
import java.util.Locale;
import java.util.Map;
import java.util.function.Predicate;
import v.z1;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f108399a;

    /* renamed from: b */
    public final /* synthetic */ Object f108400b;

    public /* synthetic */ c(Object obj, int i13) {
        this.f108399a = i13;
        this.f108400b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i13 = this.f108399a;
        Object obj2 = this.f108400b;
        switch (i13) {
            case 0:
                return ((String) obj2).equals(((Map.Entry) obj).getKey().toString().toLowerCase(Locale.ROOT).replace("-", "."));
            case 1:
                return ((String) obj2).equals(((String) ((Map.Entry) obj).getKey()).toLowerCase(Locale.ROOT).replace("_", "."));
            default:
                return !((dr.k) ((z1) obj2).f123758c).G.f68312a.containsKey(h91.a.b((TypeAheadItem) obj));
        }
    }
}
