package ui0;

import android.content.Context;
import com.pinterest.api.model.c6;
import com.pinterest.navigation.Navigation;
import i32.y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122255i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f122256j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(e eVar, int i13) {
        super(0);
        this.f122255i = i13;
        this.f122256j = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f122255i;
        e eVar = this.f122256j;
        switch (i13) {
            case 0:
                Navigation navigation = eVar.I;
                Object i03 = navigation != null ? navigation.i0("com.pinterest.EXTRA_ANNOUNCEMENT_MODAL_OBJECTS") : null;
                List list = i03 instanceof List ? (List) i03 : null;
                if (list == null) {
                    list = q0.f80391a;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof c6) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 1:
                return eVar.generateLoggingContext();
            case 2:
                int i14 = 1;
                return new ca2.e(true, new k90.a(eVar, i14), 0, 0, null, 0, null, new bh.b(eVar.s7(), new a(eVar, i14)), false, false, 892);
            case 3:
                Navigation navigation2 = eVar.I;
                Object i04 = navigation2 != null ? navigation2.i0("com.pinterest.EXTRA_PLACEMENT_ID") : null;
                y0 y0Var = i04 instanceof y0 ? (y0) i04 : null;
                return y0Var == null ? y0.ANDROID_HOME_FEED_TAKEOVER : y0Var;
            case 4:
                Context requireContext = eVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new k(requireContext, eVar.s7());
            case 5:
                Navigation navigation3 = eVar.I;
                Object i05 = navigation3 != null ? navigation3.i0("com.pinterest.EXTRA_ANNOUNCEMENT_MODAL_SHOW_CLOSE") : null;
                Boolean bool = i05 instanceof Boolean ? (Boolean) i05 : null;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            default:
                return new d(eVar);
        }
    }
}
