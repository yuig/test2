package ca0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import t3.h2;
import t3.s3;

/* loaded from: classes5.dex */
public final class g0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27114i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s3 f27115j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u50.r f27116k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(s3 s3Var, u50.r rVar, int i13) {
        super(0);
        this.f27114i = i13;
        this.f27115j = s3Var;
        this.f27116k = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f27114i) {
            case 0:
                m82invoke();
                break;
            case 1:
                m82invoke();
                break;
            default:
                m82invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m82invoke() {
        int i13 = this.f27114i;
        u50.r rVar = this.f27116k;
        s3 s3Var = this.f27115j;
        switch (i13) {
            case 0:
                if (s3Var != null) {
                    ((h2) s3Var).a();
                }
                rVar.a(f.f27107a);
                break;
            case 1:
                if (s3Var != null) {
                    ((h2) s3Var).a();
                }
                rVar.a(r.f27153a);
                break;
            default:
                if (s3Var != null) {
                    ((h2) s3Var).a();
                }
                rVar.a(n.f27145a);
                break;
        }
    }
}
