package oa2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class v extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f93963i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f93964j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(l lVar, int i13) {
        super(0);
        this.f93963i = i13;
        this.f93964j = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f93963i) {
            case 0:
                m197invoke();
                break;
            case 1:
                m197invoke();
                break;
            case 2:
                m197invoke();
                break;
            default:
                m197invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m197invoke() {
        int i13 = this.f93963i;
        l lVar = this.f93964j;
        switch (i13) {
            case 0:
                ((c) lVar).a();
                break;
            case 1:
                ((c) lVar).a();
                break;
            case 2:
                ((c) lVar).a();
                break;
            default:
                lVar.k();
                break;
        }
    }
}
