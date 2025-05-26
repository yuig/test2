package ed0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f58498j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f58499k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f58500l = new b(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58501i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f58501i = i13;
    }

    public final yl1.b b(yl1.b it) {
        switch (this.f58501i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], pd0.c.branded_content_tos_button_text), false, null, null, null, null, null, null, 0, null, 1022);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], pd0.c.branded_content_unenroll_cancel_button_text), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], pd0.c.branded_content_unenroll_leave_button_text), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f58501i) {
        }
        return b((yl1.b) obj);
    }
}
