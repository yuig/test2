package tg2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import io.embrace.android.embracesdk.internal.config.instrumented.InstrumentedConfigImpl;
import io.embrace.android.embracesdk.internal.config.instrumented.schema.RedactionConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.e0;

/* loaded from: classes4.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    public final RedactionConfig f117623a;

    /* renamed from: b, reason: collision with root package name */
    public final List f117624b;

    public q(InstrumentedConfigImpl local) {
        Intrinsics.checkNotNullParameter(local, "local");
        this.f117623a = local.getRedaction();
        List<String> sensitiveKeysDenylist = local.getRedaction().getSensitiveKeysDenylist();
        this.f117624b = sensitiveKeysDenylist != null ? CollectionsKt.y0(sensitiveKeysDenylist, 10000) : null;
    }

    public final boolean a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        List list = this.f117624b;
        if (list == null) {
            return false;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d(e0.C(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, (String) it.next()), key)) {
                return true;
            }
        }
        return false;
    }
}
