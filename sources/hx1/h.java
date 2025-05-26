package hx1;

import android.content.res.Resources;
import com.pinterest.api.model.xr;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class h extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f70542i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f70543j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, String str) {
        super(2);
        this.f70542i = jVar;
        this.f70543j = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        xr t13 = (xr) obj;
        xr t23 = (xr) obj2;
        Intrinsics.checkNotNullParameter(t13, "t1");
        Intrinsics.checkNotNullParameter(t23, "t2");
        j jVar = this.f70542i;
        Resources resources = jVar.f70546a;
        String str = this.f70543j;
        gx1.f l23 = c0.d.l2(t13, resources, str);
        Intrinsics.checkNotNullParameter(l23, "<set-?>");
        jVar.f70550e = l23;
        gx1.f l24 = c0.d.l2(t23, jVar.f70546a, str);
        Intrinsics.checkNotNullParameter(l24, "<set-?>");
        jVar.f70551f = l24;
        return Unit.f80348a;
    }
}
