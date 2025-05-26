package a;

import ads_mobile_sdk.gh2;
import ads_mobile_sdk.ol2;
import ads_mobile_sdk.x12;

/* loaded from: classes2.dex */
public final /* synthetic */ class z3 implements ok.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f198b;

    public /* synthetic */ z3(Object obj, int i13) {
        this.f197a = i13;
        this.f198b = obj;
    }

    @Override // ok.t
    public final Object apply(Object obj) {
        int i13 = this.f197a;
        Object obj2 = this.f198b;
        switch (i13) {
            case 0:
                return ((gh2) obj2).a((x12) obj);
            default:
                return ((ol2) obj2).a((f2) obj);
        }
    }
}
