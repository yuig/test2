package a;

import ads_mobile_sdk.id2;
import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class r5 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f153b;

    public /* synthetic */ r5(Context context, int i13) {
        this.f152a = i13;
        this.f153b = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i13 = this.f152a;
        Context context = this.f153b;
        switch (i13) {
            case 0:
                return id2.a(context);
            case 1:
                return id2.b(context);
            default:
                return ads_mobile_sdk.jd.a(context);
        }
    }
}
