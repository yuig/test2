package rr;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final a0 f109697j = new a0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a0 f109698k = new a0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a0 f109699l = new a0(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109700i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i13) {
        super(0);
        this.f109700i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f109700i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        return new HashMap();
                    default:
                        return new HashMap();
                }
            case 1:
                switch (i13) {
                    case 0:
                        return new HashMap();
                    default:
                        return new HashMap();
                }
            default:
                return new Handler(Looper.getMainLooper());
        }
    }
}
