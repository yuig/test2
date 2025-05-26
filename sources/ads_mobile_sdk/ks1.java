package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j0;

/* loaded from: classes2.dex */
public final class ks1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f7465a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7466b;

    /* renamed from: c, reason: collision with root package name */
    public mo2.a f7467c;

    /* renamed from: d, reason: collision with root package name */
    public ws1 f7468d;

    /* renamed from: e, reason: collision with root package name */
    public int f7469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j0 f7470f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ws1 f7471g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f7472h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j0 f7473i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fr0 f7474j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j0 f7475k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f7476l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks1(j0 j0Var, ws1 ws1Var, String str, j0 j0Var2, fr0 fr0Var, j0 j0Var3, boolean z13, bl2.c cVar) {
        super(2, cVar);
        this.f7470f = j0Var;
        this.f7471g = ws1Var;
        this.f7472h = str;
        this.f7473i = j0Var2;
        this.f7474j = fr0Var;
        this.f7475k = j0Var3;
        this.f7476l = z13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new ks1(this.f7470f, this.f7471g, this.f7472h, this.f7473i, this.f7474j, this.f7475k, this.f7476l, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ks1) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ks1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
