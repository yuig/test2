package w01;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final m f127056j = new m(0);

    /* renamed from: k, reason: collision with root package name */
    public static final m f127057k = new m(1);

    /* renamed from: l, reason: collision with root package name */
    public static final m f127058l = new m(2);

    /* renamed from: m, reason: collision with root package name */
    public static final m f127059m = new m(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127060i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i13) {
        super(0);
        this.f127060i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f127060i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        return new Handler(Looper.getMainLooper());
                    default:
                        return new Handler(Looper.getMainLooper());
                }
            case 1:
                switch (i13) {
                    case 0:
                        return new Handler(Looper.getMainLooper());
                    default:
                        return new Handler(Looper.getMainLooper());
                }
            case 2:
                return Boolean.FALSE;
            default:
                return new sq0.f(hs1.t.a(), new hf0.b(), new m60.h0(hf0.b.q()), (List) null, 24);
        }
    }
}
