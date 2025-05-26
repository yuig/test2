package dv0;

import ao2.j0;
import com.pinterest.api.model.ln0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class e extends dl2.j implements Function2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ String D;

    /* renamed from: r, reason: collision with root package name */
    public int f56318r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f56319s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ln0 f56320t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f56321u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f56322v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f56323w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f56324x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f56325y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Integer f56326z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, ln0 ln0Var, boolean z13, String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, bl2.c cVar) {
        super(2, cVar);
        this.f56319s = kVar;
        this.f56320t = ln0Var;
        this.f56321u = z13;
        this.f56322v = str;
        this.f56323w = str2;
        this.f56324x = str3;
        this.f56325y = str4;
        this.f56326z = num;
        this.A = str5;
        this.B = str6;
        this.C = str7;
        this.D = str8;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e(this.f56319s, this.f56320t, this.f56321u, this.f56322v, this.f56323w, this.f56324x, this.f56325y, this.f56326z, this.A, this.B, this.C, this.D, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x05bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03b1  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 1473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dv0.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
