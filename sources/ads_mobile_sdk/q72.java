package ads_mobile_sdk;

import ao2.j0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class q72 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public n81 f9973a;

    /* renamed from: b, reason: collision with root package name */
    public List f9974b;

    /* renamed from: c, reason: collision with root package name */
    public cf2 f9975c;

    /* renamed from: d, reason: collision with root package name */
    public r0 f9976d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f9977e;

    /* renamed from: f, reason: collision with root package name */
    public int f9978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u72 f9979g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List f9980h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r0 f9981i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f9982j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q72(u72 u72Var, List list, r0 r0Var, long j13, bl2.c cVar) {
        super(2, cVar);
        this.f9979g = u72Var;
        this.f9980h = list;
        this.f9981i = r0Var;
        this.f9982j = j13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new q72(this.f9979g, this.f9980h, this.f9981i, this.f9982j, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q72) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0092  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.q72.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
