package x02;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class r extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f131471i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f131472j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u f131473k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, u uVar) {
        super(1);
        this.f131472j = str;
        this.f131473k = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = this.f131472j;
        u uVar = this.f131473k;
        int i13 = this.f131471i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        uVar.j0(-1, str);
                        break;
                    default:
                        if (str != null) {
                            uVar.j0(-1, str);
                            break;
                        }
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        uVar.j0(-1, str);
                        break;
                    default:
                        if (str != null) {
                            uVar.j0(-1, str);
                            break;
                        }
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, String str) {
        super(1);
        this.f131473k = uVar;
        this.f131472j = str;
    }
}
