package de1;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final q f54631j = new q(0);

    /* renamed from: k, reason: collision with root package name */
    public static final q f54632k = new q(1);

    /* renamed from: l, reason: collision with root package name */
    public static final q f54633l = new q(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f54634i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i13) {
        super(0);
        this.f54634i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f54634i) {
            case 1:
                return new Handler(Looper.getMainLooper());
            default:
                return "ProductFilterModal";
        }
    }
}
