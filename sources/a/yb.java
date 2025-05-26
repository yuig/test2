package a;

import ads_mobile_sdk.bt2;
import ads_mobile_sdk.x12;
import ads_mobile_sdk.x71;
import androidx.datastore.core.CorruptionException;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class yb implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bt2 f191b;

    public /* synthetic */ yb(bt2 bt2Var, int i13) {
        this.f190a = i13;
        this.f191b = bt2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f190a;
        bt2 bt2Var = this.f191b;
        switch (i13) {
            case 0:
                ((x71) bt2Var.f3595a).a(15307, -1L, (CorruptionException) obj, null);
                return x12.s();
            case 1:
                ((x71) bt2Var.f3595a).a(15309, -1L, (CorruptionException) obj, null);
                return new byte[0];
            default:
                ((x71) bt2Var.f3595a).a(15308, -1L, (CorruptionException) obj, null);
                return new byte[0];
        }
    }
}
