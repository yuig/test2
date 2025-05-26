package b10;

import com.pinterest.api.model.al0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import x40.jh;

/* loaded from: classes3.dex */
public final class t extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20933i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ al0 f20934j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ jh f20935k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(al0 al0Var, jh jhVar, int i13) {
        super(0);
        this.f20933i = i13;
        this.f20934j = al0Var;
        this.f20935k = jhVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f20933i) {
            case 0:
                m65invoke();
                break;
            case 1:
                m65invoke();
                break;
            case 2:
                m65invoke();
                break;
            default:
                m65invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m65invoke() {
        int i13 = this.f20933i;
        al0 al0Var = this.f20934j;
        jh jhVar = this.f20935k;
        switch (i13) {
            case 0:
                al0Var.f35797g = jhVar.f132619a;
                boolean[] zArr = al0Var.f35803m;
                if (zArr.length > 6) {
                    zArr[6] = true;
                    break;
                }
                break;
            case 1:
                al0Var.d(jhVar.f132621c);
                break;
            case 2:
                Double d2 = jhVar.f132623e;
                al0Var.f35801k = d2 != null ? d2.toString() : null;
                boolean[] zArr2 = al0Var.f35803m;
                if (zArr2.length > 10) {
                    zArr2[10] = true;
                    break;
                }
                break;
            default:
                al0Var.f35800j = jhVar.f132624f;
                boolean[] zArr3 = al0Var.f35803m;
                if (zArr3.length > 9) {
                    zArr3[9] = true;
                    break;
                }
                break;
        }
    }
}
