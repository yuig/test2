package uq;

import com.pinterest.activity.pin.view.unifiedcomments.CommentPreviewView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final r f123021j = new r(0);

    /* renamed from: k, reason: collision with root package name */
    public static final r f123022k = new r(1);

    /* renamed from: l, reason: collision with root package name */
    public static final r f123023l = new r(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f123024i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i13) {
        super(2);
        this.f123024i = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f123024i) {
            case 0:
                Intrinsics.checkNotNullParameter((rp0.d) obj, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter((rh1.x) obj2, "<anonymous parameter 1>");
                break;
            case 1:
                Intrinsics.checkNotNullParameter((rp0.d) obj, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter((CommentPreviewView) obj2, "<anonymous parameter 1>");
                break;
            default:
                ((Number) obj).intValue();
                ((Number) obj2).intValue();
                break;
        }
        return Unit.f80348a;
    }
}
