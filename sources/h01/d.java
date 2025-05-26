package h01;

import com.pinterest.api.model.p20;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.k0;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f66426j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f66427k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f66428l = new d(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f66429i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f66429i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f66429i) {
            case 0:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int i13 = ky1.d.pear_survey_thank_you;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return rn1.a.y(it, new k0(i13, new ArrayList(0)), null, null, null, vn1.g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097134);
            case 1:
                Map.Entry it2 = (Map.Entry) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return it2.getKey() + "=" + it2.getValue();
            default:
                p20 it3 = (p20) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                String r13 = it3.r();
                Intrinsics.checkNotNullExpressionValue(r13, "getUid(...)");
                return r13;
        }
    }
}
