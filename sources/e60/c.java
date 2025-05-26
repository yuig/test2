package e60;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f57484i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f57485j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i13) {
        super(0);
        this.f57484i = i13;
        this.f57485j = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f57484i;
        d dVar = this.f57485j;
        switch (i13) {
            case 0:
                f60.a aVar = f60.b.Companion;
                int i14 = d.f57486m1;
                String str = (String) dVar.f57494h1.getValue();
                aVar.getClass();
                return f60.a.a(str);
            default:
                return dl2.b.R0(com.bumptech.glide.d.Z(dVar, "EXTRAS_AUTO_ORG_NAVIGATION_SOURCE", ""));
        }
    }
}
