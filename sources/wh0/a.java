package wh0;

import jc0.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.p;

/* loaded from: classes5.dex */
public final /* synthetic */ class a extends p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129897a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Object obj, int i13) {
        super(1, obj, c.class, "enableNextButton", "enableNextButton(Z)V", 0);
        this.f129897a = i13;
        if (i13 != 1) {
        } else {
            super(1, obj, e.class, "enableNextButton", "enableNextButton(Z)V", 0);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f129897a;
        switch (i13) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                switch (i13) {
                    case 0:
                        c cVar = (c) this.receiver;
                        cVar.getClass();
                        cVar.f129903f.d(new m(booleanValue, 2));
                        break;
                    default:
                        e eVar = (e) this.receiver;
                        eVar.getClass();
                        eVar.f129906e.d(new m(booleanValue, 3));
                        break;
                }
                break;
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                switch (i13) {
                    case 0:
                        c cVar2 = (c) this.receiver;
                        cVar2.getClass();
                        cVar2.f129903f.d(new m(booleanValue2, 2));
                        break;
                    default:
                        e eVar2 = (e) this.receiver;
                        eVar2.getClass();
                        eVar2.f129906e.d(new m(booleanValue2, 3));
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
