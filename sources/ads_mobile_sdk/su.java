package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.chromium.net.CronetProvider;

/* loaded from: classes2.dex */
public final class su extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f11238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vu f11239b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CronetProvider f11240c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ao2.v f11241d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(vu vuVar, CronetProvider cronetProvider, ao2.v vVar, bl2.c cVar) {
        super(2, cVar);
        this.f11239b = vuVar;
        this.f11240c = cronetProvider;
        this.f11241d = vVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new su(this.f11239b, this.f11240c, this.f11241d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((su) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f11238a;
        if (i13 == 0) {
            ue.c.H(obj);
            vu vuVar = this.f11239b;
            CronetProvider cronetProvider = this.f11240c;
            ao2.v vVar = this.f11241d;
            this.f11238a = 1;
            if (vu.a(vuVar, cronetProvider, vVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
