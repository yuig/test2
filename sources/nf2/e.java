package nf2;

import io.embrace.android.embracesdk.internal.api.delegate.NoopEmbraceInternalInterface;
import io.embrace.android.embracesdk.internal.api.delegate.NoopFlutterInternalInterface;
import io.embrace.android.embracesdk.internal.api.delegate.NoopReactNativeInternalInterface;
import io.embrace.android.embracesdk.internal.api.delegate.NoopUnityInternalInterface;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f90494i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f90495j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i13) {
        super(0);
        this.f90494i = i13;
        this.f90495j = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f90494i;
        f fVar = this.f90495j;
        switch (i13) {
            case 0:
                return new NoopFlutterInternalInterface((NoopEmbraceInternalInterface) fVar.f90500a.getValue());
            case 1:
                return new NoopReactNativeInternalInterface((NoopEmbraceInternalInterface) fVar.f90500a.getValue());
            default:
                return new NoopUnityInternalInterface((NoopEmbraceInternalInterface) fVar.f90500a.getValue());
        }
    }
}
