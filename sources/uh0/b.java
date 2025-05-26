package uh0;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import rg0.n;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122246i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f122247j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ HashMap f122248k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(n nVar, HashMap hashMap, int i13) {
        super(0);
        this.f122246i = i13;
        this.f122247j = nVar;
        this.f122248k = hashMap;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        n nVar = this.f122247j;
        HashMap hashMap = this.f122248k;
        int i13 = this.f122246i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        nVar.h(hashMap);
                        break;
                    default:
                        nVar.d(hashMap);
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        nVar.h(hashMap);
                        break;
                    default:
                        nVar.d(hashMap);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
