package we1;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f129280i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ xe1.g f129281j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(xe1.g gVar, int i13) {
        super(1);
        this.f129280i = i13;
        this.f129281j = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f129280i;
        xe1.g gVar = this.f129281j;
        switch (i13) {
            case 0:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.h2(gVar.f134722c), false, null, null, null, null, null, null, View.generateViewId(), null, 766);
            default:
                rn1.a it2 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                int generateViewId = View.generateViewId();
                String str = gVar.f134722c;
                return rn1.a.y(it2, ep.b.x(str, "string", str), vn1.c.LIGHT, kotlin.collections.e0.b(vn1.b.CENTER), null, vn1.g.UI_400, 0, null, null, null, null, false, generateViewId, null, null, null, null, null, false, null, null, 2095080);
        }
    }
}
