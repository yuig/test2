package l11;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class h extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final h f81417j = new h(0);

    /* renamed from: k, reason: collision with root package name */
    public static final h f81418k = new h(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81419i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i13) {
        super(0);
        this.f81419i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f81419i) {
            case 0:
                return new Handler(Looper.getMainLooper());
            default:
                return "CarouselPinCell";
        }
    }
}
