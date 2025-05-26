package h3;

import android.graphics.PathMeasure;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final g f66664j = new g(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f66665k = new g(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f66666i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13) {
        super(0);
        this.f66666i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f66666i) {
            case 0:
                return new b3.m(new PathMeasure());
            default:
                return Unit.f80348a;
        }
    }
}
