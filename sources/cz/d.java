package cz;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class d extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f53449j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f53450k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f53451l = new d(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f53452i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f53452i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f53452i;
        switch (i13) {
            case 0:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        th3.getMessage();
                        break;
                    case 1:
                        th3.getMessage();
                        break;
                    default:
                        th3.getMessage();
                        break;
                }
                break;
            case 1:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        th4.getMessage();
                        break;
                    case 1:
                        th4.getMessage();
                        break;
                    default:
                        th4.getMessage();
                        break;
                }
                break;
            default:
                Throwable th5 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        th5.getMessage();
                        break;
                    case 1:
                        th5.getMessage();
                        break;
                    default:
                        th5.getMessage();
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
