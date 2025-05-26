package b10;

import com.pinterest.api.model.pr;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import x40.pg;

/* loaded from: classes3.dex */
public final class h extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20890i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ pr f20891j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ pg f20892k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(pr prVar, pg pgVar, int i13) {
        super(0);
        this.f20890i = i13;
        this.f20891j = prVar;
        this.f20892k = pgVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f20890i) {
            case 0:
                m55invoke();
                break;
            case 1:
                m55invoke();
                break;
            case 2:
                m55invoke();
                break;
            case 3:
                m55invoke();
                break;
            default:
                m55invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m55invoke() {
        int i13 = this.f20890i;
        pr prVar = this.f20891j;
        pg pgVar = this.f20892k;
        switch (i13) {
            case 0:
                prVar.d(pgVar.f133045b);
                break;
            case 1:
                prVar.b(pgVar.f133046c);
                break;
            case 2:
                prVar.f(pgVar.f133047d != null ? Double.valueOf(r0.intValue()) : null);
                break;
            case 3:
                prVar.c(pgVar.f133048e != null ? Double.valueOf(r0.intValue()) : null);
                break;
            default:
                prVar.e(pgVar.f133049f);
                break;
        }
    }
}
