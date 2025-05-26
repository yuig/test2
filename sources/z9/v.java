package z9;

import android.os.Bundle;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f141293i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Bundle f141294j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i13, Bundle bundle) {
        super(1);
        this.f141293i = i13;
        this.f141294j = bundle;
    }

    public final Boolean b(String argName) {
        int i13 = this.f141293i;
        Bundle bundle = this.f141294j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(argName, "argName");
                break;
            default:
                Intrinsics.checkNotNullParameter(argName, "key");
                break;
        }
        return Boolean.valueOf(!bundle.containsKey(argName));
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f141293i;
        Bundle bundle = this.f141294j;
        switch (i13) {
            case 0:
                return b((String) obj);
            case 1:
                return b((String) obj);
            case 2:
                on1.k it = (on1.k) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return on1.k.e(it, on1.b.e(it.f96740a, bundle.getBoolean("com.pinterest.EXTRA_IS_COMMENTS_ENABLED"), false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
            case 3:
                ag1.k data = (ag1.k) obj;
                Intrinsics.checkNotNullParameter(data, "data");
                String string = bundle.getString("com.pinterest.EXTRA_IDEA_PIN_CREATION_SESSION_ID", "");
                if (string == null) {
                    string = "";
                }
                String string2 = bundle.getString("com.pinterest.EXTRA_CREATION_IDEA_INTEREST_QUERY", "");
                return ag1.k.a(data, string, string2 != null ? string2 : "", null, null, null, RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL);
            default:
                String str = (String) obj;
                return a.a.D(str, "=", bundle.getString(str));
        }
    }
}
