package tb;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f117041b;

    public /* synthetic */ t(y yVar, int i13) {
        this.f117040a = i13;
        this.f117041b = yVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f117040a;
        y yVar = this.f117041b;
        HashMap hashMap = (HashMap) obj;
        switch (i13) {
            case 0:
                yVar.b(hashMap);
                break;
            default:
                yVar.a(hashMap);
                break;
        }
        return Unit.f80348a;
    }
}
