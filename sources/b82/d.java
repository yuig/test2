package b82;

import com.pinterest.api.model.f30;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final /* synthetic */ class d extends p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final d f22186a = new d();

    public d() {
        super(1, bs1.c.class, "getImageLargeUrl", "getImageLargeUrl(Lcom/pinterest/api/model/Pin;)Ljava/lang/String;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f30 p03 = (f30) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        return bs1.c.y0(p03);
    }
}
