package e81;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f57760j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f57761k = new c(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f57762i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f57762i = i13;
    }

    public final yl1.b b(yl1.b it) {
        switch (this.f57762i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], uc2.h.collage_pin_selector_title), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], uc2.h.collage_save_button), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f57762i) {
        }
        return b((yl1.b) obj);
    }
}
