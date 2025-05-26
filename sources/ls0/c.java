package ls0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84620i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f84621j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f84622k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, String str, int i13) {
        super(0);
        this.f84620i = i13;
        this.f84621j = dVar;
        this.f84622k = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f84620i) {
            case 0:
                m184invoke();
                break;
            case 1:
                m184invoke();
                break;
            default:
                m184invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m184invoke() {
        String str = this.f84622k;
        int i13 = this.f84620i;
        d dVar = this.f84621j;
        switch (i13) {
            case 0:
                g70.h.g(dVar.f84625c, str, null, null, 6);
                break;
            case 1:
                g70.h.g(dVar.f84625c, str, null, null, 6);
                break;
            default:
                g70.h.g(dVar.f84625c, str, null, null, 6);
                break;
        }
    }
}
