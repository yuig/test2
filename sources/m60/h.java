package m60;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f85903i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f85904j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(m mVar, int i13) {
        super(1);
        this.f85903i = i13;
        this.f85904j = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        m mVar = this.f85904j;
        int i13 = this.f85903i;
        switch (i13) {
            case 0:
                a aVar = (a) obj;
                a aVar2 = a.BACKGROUND;
                mVar.f20440e = aVar == aVar2;
                if (aVar == aVar2 && (!((z70.f) mVar.f85929x.getValue()).f140994c)) {
                    mVar.e();
                }
                break;
            case 1:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 1:
                        mVar.d().o("Exception tracking app background state", th3);
                        break;
                    default:
                        mVar.d().o("Exception in background data monitor", th3);
                        break;
                }
                break;
            default:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 1:
                        mVar.d().o("Exception tracking app background state", th4);
                        break;
                    default:
                        mVar.d().o("Exception in background data monitor", th4);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
