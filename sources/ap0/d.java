package ap0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f20295j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f20296k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f20297l = new d(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20298i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f20298i = i13;
    }

    public final yl1.b b(yl1.b it) {
        switch (this.f20298i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.create_pin), false, null, null, null, null, null, null, 0, null, 1022);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.bizhub_create_ad_button), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.bizhub_explorer_profile_button), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f20298i) {
        }
        return b((yl1.b) obj);
    }
}
